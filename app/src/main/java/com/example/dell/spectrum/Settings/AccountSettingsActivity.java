package com.example.dell.spectrum.Settings;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.dell.spectrum.R;

/**
 * Created by WAVE on 5/25/2017.
 */

public class AccountSettingsActivity extends AppCompatActivity {
    Toolbar toolbar;
    ImageView imgnavigation,imgadd,imgoptionsmenu,imgqrcode,man,adduser;
    RelativeLayout father,mainImage,mom,wife,son,daughter;
    //  Button add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accountsettings);
        setToolbar();
        ids();
    }
    public void ids(){
        father=(RelativeLayout)findViewById(R.id.rl_father);
        mom=(RelativeLayout) findViewById(R.id.rl_mom);
        wife=(RelativeLayout) findViewById(R.id.rl_companion);
        son=(RelativeLayout) findViewById(R.id.rl_son);
        daughter=(RelativeLayout) findViewById(R.id.rl_daughter);
        mainImage=(RelativeLayout)findViewById(R.id.mainimage);
        man=(ImageView) findViewById(R.id.man);
        mainImage.setOnClickListener(mMain);
        // add=(Button)findViewById(R.id.add_btn);
        adduser.setOnClickListener(mAdd);
        man.setOnClickListener(mman);
        father.setOnClickListener(mfather);
        mom.setOnClickListener(mmom);
        wife.setOnClickListener(mwife);
        son.setOnClickListener(mson);
        daughter.setOnClickListener(mdaughter);

    }
    View.OnClickListener mman=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(AccountSettingsActivity.this,PersonalInfoActivity.class));
        }
    };
    View.OnClickListener mAdd=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(AccountSettingsActivity.this,FriendsAndFamilyActivity.class));

        }
    };
    View.OnClickListener mMain=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(AccountSettingsActivity.this,PersonalInfoActivity.class));
        }
    };
    View.OnClickListener mmom=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(AccountSettingsActivity.this,PersonalInfoActivity.class));
        }
    };
    View.OnClickListener mwife=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(AccountSettingsActivity.this,PersonalInfoActivity.class));
        }
    };
    View.OnClickListener mson=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(AccountSettingsActivity.this,PersonalInfoActivity.class));
        }
    };
    View.OnClickListener mdaughter=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(AccountSettingsActivity.this,PersonalInfoActivity.class));
        }
    };
    View.OnClickListener mfather=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(AccountSettingsActivity.this,PersonalInfoActivity.class));
        }
    };
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
        toolbartext.append(getString(R.string.userprofile));
        // imgqrcode = (ImageView)toolbar.findViewById(R.id.qrcode_img);
        imgadd = (ImageView)toolbar.findViewById(R.id.add_img);
        adduser = (ImageView)toolbar.findViewById(R.id.optionsmenu_icon);
        adduser.setImageResource(R.drawable.ic_adduser);


    }
}
