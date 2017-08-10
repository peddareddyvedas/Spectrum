package com.example.dell.spectrum.Settings;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.dell.spectrum.R;

/**
 * Created by WAVE on 5/25/2017.
 */

public class FriendsAndFamilyActivity extends AppCompatActivity {
    Toolbar toolbar;
    ImageView imgnavigation,imgadd,imgoptionsmenu,imgqrcode;
    Button add;
    EditText editrelation;

    Spinner spinnerWithBorder;

    String[] spinnerItems = new String[]{
            "Enter Relative Name","Father", "Mother", "Son ", "Daughter", "Husband","Wife","Brother","Sister","Sibling","Grand Father",
            "Grand Mother","Grand Mother","Grand Son","Grand Daughter","uncle","Aunty","Nephew","Niece","Cousin"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friendsandfamiy);
        setToolbar();
    }
    //Intializing the toolbar
    public void setToolbar()
    {
        add=(Button)findViewById(R.id.btn_add);
        add.setOnClickListener(madd);
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
        toolbartext.append(getString(R.string.friendstitle));
        imgqrcode = (ImageView)toolbar.findViewById(R.id.qrcode_img);
        imgadd = (ImageView)toolbar.findViewById(R.id.add_img);
       // editrelation=(EditText)findViewById(R.id.editrelation);

        spinnerWithBorder = (Spinner)findViewById(R.id.spinner1);
        ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(
                this,R.layout.spinner_textview,spinnerItems );
        spinnerArrayAdapter.setDropDownViewResource(R.layout.spinner_textview);
        spinnerWithBorder.setAdapter(spinnerArrayAdapter);



//        imgoptionsmenu = (ImageView)toolbar.findViewById(R.id.optionsmenu_icon);
//        imgoptionsmenu.setImageResource(R.drawable.icon_optionsmenu);

    }
    View.OnClickListener madd=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
           startActivity(new Intent(getApplicationContext(),AccountSettingsActivity.class));
        }
    };


}
