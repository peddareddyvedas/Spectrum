package com.example.dell.spectrum.Home;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.dell.spectrum.R;

public class CircularProressActivity extends AppCompatActivity {
    ProgressBar cprogressbar;
    Button download;
    TextView progresstext,jump;
    Handler progresshandler = new Handler();
    Toolbar toolbar;
    ImageButton back;
    int i = 45;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progresscircular);
        cprogressbar=(ProgressBar)findViewById(R.id.progressbar);
        progresstext=(TextView)findViewById(R.id.progress_text);
        download=(Button)findViewById(R.id.download);
        init();
        setToolbar();
    }
    public void setToolbar()
    {
        toolbar = (Toolbar)findViewById(R.id.toolbarlogin);
        setSupportActionBar(toolbar);
        back = (ImageButton) toolbar.findViewById(R.id.backimage);
        TextView toolbartext = (TextView)toolbar.findViewById(R.id.tool_txt);
        toolbartext.setText("");
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
public void init(){
    new Thread(new Runnable() {
        @Override
        public void run() {
            while(i<=45 && i>0){
                i -=1;
                progresshandler.post(new Runnable() {
                    @Override
                    public void run() {

                        cprogressbar.setProgress(i);
                        progresstext.setText(" " + i + "");
                        if(i==0){
                            startActivity(new Intent(getApplicationContext(),TestAnalizingActivity.class));

                        }

                    }
                });
                try{
                    Thread.sleep(100);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }

        }
    }).start();;
}
}
