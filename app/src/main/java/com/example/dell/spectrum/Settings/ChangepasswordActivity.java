package com.example.dell.spectrum.Settings;

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
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dell.spectrum.LOGIN.ConformForgotPasswordActivity;
import com.example.dell.spectrum.LOGIN.LoginpageActivity;
import com.example.dell.spectrum.R;

import java.util.regex.Pattern;


/**
 * Created by Rise on 06/05/2017.
 */

public class ChangepasswordActivity extends AppCompatActivity {
    Button thenextstep;
    ImageButton back;
    EditText name, password;
    Toolbar toolbar;
    String st_name,st_password;
    ImageView imgnavigation,imgadd,imgoptionsmenu,imgqrcode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_changepassword_page);

        thenextstep = (Button) findViewById(R.id.changestep);
        name = (EditText) findViewById(R.id.editold_Email);
        password = (EditText) findViewById(R.id.editnew_password);
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
        toolbartext.append(getString(R.string.changepsw));
        imgadd = (ImageView)toolbar.findViewById(R.id.add_img);



    }
    public void mForgotpsw() {
        st_name = name.getText().toString();
        st_password = password.getText().toString();
        String regexStr = "^[0-9]*$";
        if(st_name.length()==0){
            Log.e("email0","call");
            Toast.makeText(getApplicationContext(), "Enter  email", Toast.LENGTH_LONG).show();
        }else if(st_password.length()==0){
            Log.e("pssword0","call");
            Toast.makeText(getApplicationContext(), "Enter password", Toast.LENGTH_LONG).show();
        } else if(!st_name.equals(regexStr) && (isValidEmail(st_name))){
            Log.e("valid email","call"+st_name);
            finish();
            Intent it = new Intent(getApplication(), ConformForgotPasswordActivity.class);
            startActivity(it);
        }else if(!st_name.equals(regexStr) && !(isValidEmail(st_name)) && !st_name.equals(regexStr) && !(isValidPhone(st_name)) ){
            Log.e("not valid email","call");
            Toast.makeText(getApplicationContext(), "Enter valid email or phone", Toast.LENGTH_LONG).show();

        }else if(!st_name.equals(regexStr) && (isValidPhone(st_name))){
            Log.e("valid ph","call"+st_name);
            finish();
            Intent it = new Intent(getApplication(), ConformForgotPasswordActivity.class);
            startActivity(it);
        }else
        {
            // String s=isVerify(st_emailandphone);

             /*Log.e("final","call");
             finish();
             Intent it = new Intent(getApplication(), HomeActivity.class);
             startActivity(it);*/
        }


    }
    public boolean isValidEmail(String target) {
        Pattern pattern = Patterns.EMAIL_ADDRESS;
        return pattern.matcher(target).matches();
    }
    private boolean isValidPhone(String pass) {
        return pass != null && pass.length() == 10 ;

    }
}
