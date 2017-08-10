package com.example.dell.spectrum.LOGIN;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dell.spectrum.Home.HomeActivity;
import com.example.dell.spectrum.R;

import java.util.regex.Pattern;


/**
 * Created by Rise on 06/05/2017.
 */

public class ConformForgotPasswordActivity extends AppCompatActivity {
    Button conformbutton;
    Toolbar toolbar;
    ImageButton back;
    EditText email;
    String st_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conformforgotpassword);
        conformbutton = (Button) findViewById(R.id.conformchange_button);
        email = (EditText) findViewById(R.id.editforgot_Email);

        conformbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // mForgotpsw();
                Intent it = new Intent(getApplication(), LoginpageActivity.class);
                startActivity(it);
            }
        });
        setToolbar();
    }

    public void setToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbarlogin);
        setSupportActionBar(toolbar);
        back = (ImageButton) toolbar.findViewById(R.id.backimage);
        TextView toolbartext = (TextView) toolbar.findViewById(R.id.tool_txt);
        toolbartext.setText("Forget password");
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //finish();
                Intent in = new Intent(ConformForgotPasswordActivity.this, LoginpageActivity.class);
                startActivity(in);
            }

        });
    }

    public void mForgotpsw() {
        st_name = email.getText().toString();
        String regexStr = "^[0-9]*$";
        if(st_name.length()==0){
            Log.e("email0","call");
            Toast.makeText(getApplicationContext(), "Enter email or phone number", Toast.LENGTH_LONG).show();
        } else if(!st_name.equals(regexStr) && (isValidEmail(st_name))){
            Log.e("valid email","call"+st_name);
            finish();
            Intent it = new Intent(getApplication(), LoginpageActivity.class);
            startActivity(it);
        }else if(!st_name.equals(regexStr) && !(isValidEmail(st_name)) && !st_name.equals(regexStr) && !(isValidPhone(st_name)) ){
            Log.e("not valid email","call");
            Toast.makeText(getApplicationContext(), "Enter valid email or phone", Toast.LENGTH_LONG).show();

        }else if(!st_name.equals(regexStr) && (isValidPhone(st_name))){
            Log.e("valid ph","call"+st_name);
            finish();
            Intent it = new Intent(getApplication(), LoginpageActivity.class);
            startActivity(it);
        }else
        {
            // String s=isVerify(st_emailandphone);

             /*Log.e("final","call");
             finish();
             Intent it = new Intent(getApplication(), HomeActivity.class);
             startActivity(it);*/
        }
        /*if (st_email.length() == 0) {
            Toast.makeText(getApplicationContext(), "Enter Email or phone number", Toast.LENGTH_LONG).show();

        } else if (st_email.matches(regexStr)) {
            Toast.makeText(getApplicationContext(), "Enter valid phone no", Toast.LENGTH_LONG).show();
            if ((isValidPhone(st_email))) {
            }

        }else if (!st_email.matches(regexStr)) {
            Toast.makeText(getApplicationContext(), "Enter valid email", Toast.LENGTH_LONG).show();
                if ((isValidEmail(st_email))) {
                }

        } else {
            finish();
            Intent it = new Intent(getApplication(), LoginpageActivity.class);
            startActivity(it);
        }*/
    }
    public boolean isValidEmail(String target) {
        Pattern pattern = Patterns.EMAIL_ADDRESS;
        return pattern.matcher(target).matches();
    }
    private boolean isValidPhone(String pass) {

        return pass != null && pass.length() == 10 ;

    }
}
