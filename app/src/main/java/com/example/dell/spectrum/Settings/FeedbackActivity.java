package com.example.dell.spectrum.Settings;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dell.spectrum.R;

/**
 * Created by WAVE on 5/25/2017.
 */

public class FeedbackActivity extends AppCompatActivity {
    Toolbar toolbar;
    ImageView imgnavigation,imgadd,imgoptionsmenu,imgqrcode;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feeback);
        setToolbar();
    }
    //Intializing the toolbar
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
        toolbartext.append(getString(R.string.feedback));
        imgqrcode = (ImageView)toolbar.findViewById(R.id.qrcode_img);
//           EditText editText = (EditText)findViewById(R.id.editone);
//           editText.setSelection(2);
//        imgoptionsmenu = (ImageView)toolbar.findViewById(R.id.optionsmenu_icon);
//        imgoptionsmenu.setImageResource(R.drawable.icon_optionsmenu);

    }
}
