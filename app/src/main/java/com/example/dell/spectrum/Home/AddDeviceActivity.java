package com.example.dell.spectrum.Home;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;


import com.example.dell.spectrum.R;

public class AddDeviceActivity extends AppCompatActivity {
    Toolbar toolbar;
    ProgressBar progressBar;
    ImageView confirmdeviceimg;
    int pStatus = 0;
    private Handler handler = new Handler();
    ImageButton back;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adddevice);
        setToolbar();
        init();

    }
    public void init()
    {
        progressBar = (ProgressBar)findViewById(R.id.progressbar_horizontal);
        confirmdeviceimg = (ImageView) findViewById(R.id.image_in_adddevice);
        //confirmdeviceimg.setOnClickListener(Imgclicklistner);
        Resources res = getResources();
        Drawable drawable = res.getDrawable(R.drawable.progress_drawable);
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
                         //   tv.setText(pStatus + "%");
                            if(pStatus==100){
                                Intent confirmdeviceintent = new Intent(AddDeviceActivity.this,ConfirmDeviceActivity.class);
                                startActivity(confirmdeviceintent);
                            }

                        }
                    });
                    try {
                        // Sleep for 200 milliseconds.
                        // Just to display the progress slowly
                        Thread.sleep(50); //thread will take approx 1.5 seconds to finish
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

    }

    //Intializing the toolbar
    public void setToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbarlogin);
        setSupportActionBar(toolbar);
        back = (ImageButton) toolbar.findViewById(R.id.backimage);
        TextView toolbartext = (TextView) toolbar.findViewById(R.id.tool_txt);
        toolbartext.setText("Add Device");
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    //Click event on leftarrow
    View.OnClickListener leftarrowclicklistner = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent homeactivity = new Intent(AddDeviceActivity.this,HomeActivity.class);
            startActivity(homeactivity);

        }
    };

    /*//click event on Image in adddevice activity
    View.OnClickListener Imgclicklistner = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent confirmdeviceintent = new Intent(AddDeviceActivity.this,ConfirmDeviceActivity.class);
            startActivity(confirmdeviceintent);
        }
    };*/

}








