package com.example.dell.spectrum.Home;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dell.spectrum.TapbarFragments.FragmentMainActivity;
import com.example.dell.spectrum.LOGIN.IndicatorActivity;
import com.example.dell.spectrum.R;


public class ConfirmDeviceActivity extends AppCompatActivity {

    Toolbar toolbar;
    Button cancelbutton,confrimbutton;
   ImageButton back;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_device);
        init();
        setToolbar();
    }

    public void init()
    {
        cancelbutton = (Button)findViewById(R.id.btn_cancel);
        cancelbutton.setOnClickListener(CancelClickListner);
        confrimbutton = (Button) findViewById(R.id.btn_confirm);
        confrimbutton.setOnClickListener(ConfirmclickListner);

    }

    //Intializing the toolbar
    public void setToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbarlogin);
        setSupportActionBar(toolbar);
        back = (ImageButton) toolbar.findViewById(R.id.backimage);
        TextView toolbartext = (TextView) toolbar.findViewById(R.id.tool_txt);
        toolbartext.setText("Confirm Device");
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
            Toast.makeText(ConfirmDeviceActivity.this,"back",Toast.LENGTH_SHORT).show();
            finish();


        }
    };

    //Click Event on cancel button
    View.OnClickListener CancelClickListner = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent homeintent = new Intent(ConfirmDeviceActivity.this,HomeActivity.class);
            startActivity(homeintent);
        }
    };

    //Click event on confirm button
    View.OnClickListener ConfirmclickListner = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            FragmentMainActivity.isFromHOme=false;
            Intent homeintent = new Intent(ConfirmDeviceActivity.this,HomeActivity.class);
            startActivity(homeintent);
        }
    };

}
