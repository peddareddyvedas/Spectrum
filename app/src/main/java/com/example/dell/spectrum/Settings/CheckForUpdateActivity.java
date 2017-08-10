package com.example.dell.spectrum.Settings;

import android.app.Dialog;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dell.spectrum.R;

/**
 * Created by WAVE on 5/25/2017.
 */

public class CheckForUpdateActivity extends AppCompatActivity {
    Toolbar toolbar;
    ImageView imgnavigation,imgadd,imgoptionsmenu,imgqrcode;
    ProgressBar progressBar;
    int pStatus = 0;
    private Handler handler = new Handler();
    TextView percent;
    Button update;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkforupdate);
        setToolbar();
        init();
        update=(Button)findViewById(R.id.btn_update);
        update.setOnClickListener(mUpdate);

    }
    View.OnClickListener mUpdate=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            final Dialog dialog = new Dialog(CheckForUpdateActivity.this);
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            dialog.setCancelable(true);
            dialog.setCanceledOnTouchOutside(false);
            dialog.setContentView(R.layout.update_alert);
            dialog.show();
            Button btnOkk = (Button)dialog. findViewById(R.id.btn_yes);
            btnOkk.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    dialog.cancel();
                    percent.setVisibility(View.VISIBLE);
                    progressBar.setVisibility(View.VISIBLE);
                }
            });
            Button canle = (Button)dialog. findViewById(R.id.btn_no);
            canle.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    dialog.cancel();
                }
            });


        }
    };
    public void setToolbar()
    {
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        imgnavigation = (ImageView)toolbar.findViewById(R.id.toolbar_arrow);
        imgnavigation.setImageResource(R.drawable.ic_leftarrow);
        imgnavigation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        TextView toolbartext = (TextView)toolbar.findViewById(R.id.toolbar_textsettings);
        toolbartext.append(getString(R.string.checkupdates));
        imgqrcode = (ImageView)toolbar.findViewById(R.id.qrcode_img);
        imgadd = (ImageView)toolbar.findViewById(R.id.add_img);
//        imgoptionsmenu = (ImageView)toolbar.findViewById(R.id.optionsmenu_icon);
//        imgoptionsmenu.setImageResource(R.drawable.icon_optionsmenu);
    }
    public void init()
    {
        progressBar = (ProgressBar)findViewById(R.id.progressbar_updatedevice);
        percent=(TextView)findViewById(R.id.precenttext) ;
        Resources res = getResources();
        Drawable drawable = res.getDrawable(R.drawable.progress_drawableforupdate);
        progressBar.setProgress(0);   // Main Progress
        progressBar.setSecondaryProgress(100); // Secondary Progress
        progressBar.setMax(100); // Maximum Progress
        progressBar.setProgressDrawable(drawable);
        new Thread(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                while (pStatus < 100) {
                    pStatus += 1;

                    handler.post(new Runnable() {

                        @Override
                        public void run() {
                            // TODO Auto-generated method stub
                            progressBar.setProgress(pStatus);
                            String pre=pStatus + "%";
                              percent.setText(pre);
                            showmsg();
                        }
                    });
                    try {
                        // Sleep for 200 milliseconds.
                        // Just to display the progress slowly
                        Thread.sleep(300); //thread will take approx 1.5 seconds to finish
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
    public void showmsg(){
        if(pStatus>=100){
            percent.setVisibility(View.INVISIBLE);
            progressBar.setVisibility(View.INVISIBLE);
            Toast.makeText(getApplicationContext(),"Update completed",Toast.LENGTH_SHORT).show();

        }
    }
}
