package com.example.dell.spectrum.Settings;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.dell.spectrum.R;

/**
 * Created by WAVE on 5/25/2017.
 */

public class MySpectometerActivity extends AppCompatActivity {
    Toolbar toolbar;
    ImageView imgnavigation,imgadd,imgoptionsmenu,imgqrcode;

    RelativeLayout checkUpdate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myspectrometer);
        ids();
        setToolbar();
    }
    public void ids(){
        checkUpdate=(RelativeLayout)findViewById(R.id.rl_checkupdate);
        checkUpdate.setOnClickListener(mupdate);
    }
    View.OnClickListener mupdate=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(MySpectometerActivity.this,CheckForUpdateActivity.class));
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
        toolbartext.append(getString(R.string.myspecctometer));
        imgqrcode = (ImageView)toolbar.findViewById(R.id.qrcode_img);
        imgadd = (ImageView)toolbar.findViewById(R.id.add_img);
//        imgoptionsmenu = (ImageView)toolbar.findViewById(R.id.optionsmenu_icon);
//        imgoptionsmenu.setImageResource(R.drawable.icon_optionsmenu);

    }
}
