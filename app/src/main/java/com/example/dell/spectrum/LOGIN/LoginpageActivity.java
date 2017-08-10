package com.example.dell.spectrum.LOGIN;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dell.spectrum.Home.HomeActivity;
import com.example.dell.spectrum.R;

import java.util.regex.Pattern;

public class LoginpageActivity extends AppCompatActivity {


    EditText email, password;
    ImageButton wechat, weido, qq, twitter, fb,google;
    Button loginbutton;
    TextView newuserregister, forgotpassword;
     Toolbar toolbar;
    ImageButton back;
    String st_emailandphone,st_password;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            getWindow().setStatusBarColor(getResources().getColor(R.color.colorPrimary));

        }*/
        setContentView(R.layout.activity_loginpage);
        init();
        setToolbar();
    }
    public void setToolbar()
    {
        toolbar = (Toolbar)findViewById(R.id.toolbarlogin);
        setSupportActionBar(toolbar);
        back = (ImageButton) toolbar.findViewById(R.id.backimage);
        back.setVisibility(View.INVISIBLE);
        TextView toolbartext = (TextView)toolbar.findViewById(R.id.tool_txt);
        toolbartext.setText("Login");
    }

    public void init() {
        email = (EditText) findViewById(R.id.editText_Email);
        password = (EditText) findViewById(R.id.editText_password);
        wechat = (ImageButton) findViewById(R.id.wechat);
        weido = (ImageButton) findViewById(R.id.weibo);
        qq = (ImageButton) findViewById(R.id.qq);
        twitter = (ImageButton) findViewById(R.id.twitter);
        google=(ImageButton) findViewById(R.id.google);
        fb = (ImageButton) findViewById(R.id.fb);
        loginbutton = (Button) findViewById(R.id.loginbutton);
        forgotpassword = (TextView) findViewById(R.id.forgotpassword);
        newuserregister = (TextView) findViewById(R.id.newuser);

        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //mLogin();
               // finish();
                Intent in = new Intent(LoginpageActivity.this, HomeActivity.class);
                startActivity(in);

            }
        });

        forgotpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    //finish();
                Intent in = new Intent(LoginpageActivity.this, ForgotpasswordActivity.class);
                startActivity(in);
            }
        });
        newuserregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // finish();
                Intent in = new Intent(LoginpageActivity.this, RegisterpageActivity.class);
                startActivity(in);
            }
        });
      /*  wechat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(LoginpageActivity.this,HomeActivity.class);
                startActivity(in);
                Toast.makeText(LoginpageActivity.this,"wechat",Toast.LENGTH_SHORT).show();
            }
        });
        qq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(LoginpageActivity.this, HomeActivity.class);
                startActivity(in);
                Toast.makeText(LoginpageActivity.this,"qq",Toast.LENGTH_SHORT).show();
            }
        });
        weido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(LoginpageActivity.this, HomeActivity.class);
                startActivity(in);
                Toast.makeText(LoginpageActivity.this,"weido",Toast.LENGTH_SHORT).show();
            }
        });
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(LoginpageActivity.this, HomeActivity.class);
                startActivity(in);
                Toast.makeText(LoginpageActivity.this,"twitter",Toast.LENGTH_SHORT).show();
            }
        });
        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(LoginpageActivity.this, HomeActivity.class);
                startActivity(in);
                Toast.makeText(LoginpageActivity.this,"facebook",Toast.LENGTH_SHORT).show();
            }
        });
        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent in = new Intent(LoginpageActivity.this, HomeActivity.class);
                startActivity(in);
                Toast.makeText(LoginpageActivity.this,"google",Toast.LENGTH_SHORT).show();

            }
        });*/
    }
    public void mLogin() {
        st_emailandphone = email.getText().toString();
        st_password = password.getText().toString();
        String regexStr = "^[0-9]*$";

        if(st_emailandphone.length()==0){
            Log.e("email0","call");
            Toast.makeText(getApplicationContext(), "Enter email", Toast.LENGTH_LONG).show();
        }else if(st_password.length()==0){
            Log.e("pssword0","call");
            Toast.makeText(getApplicationContext(), "Enter Password", Toast.LENGTH_LONG).show();
        } else if(!st_emailandphone.equals(regexStr) && (isValidEmail(st_emailandphone))){
            Log.e("valid email","call"+st_emailandphone);
            finish();
            Intent it = new Intent(getApplication(), HomeActivity.class);
            startActivity(it);
        }else if(!st_emailandphone.equals(regexStr) && !(isValidEmail(st_emailandphone)) && !st_emailandphone.equals(regexStr) && !(isValidPhone(st_emailandphone)) ){
            Log.e("not valid email","call");
            Toast.makeText(getApplicationContext(), "Enter valid email or phone", Toast.LENGTH_LONG).show();

        }else if(!st_emailandphone.equals(regexStr) && (isValidPhone(st_emailandphone))){
            Log.e("valid ph","call"+st_emailandphone);
            finish();
            Intent it = new Intent(getApplication(), HomeActivity.class);
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

 /*   if (st_emailandphone.length() == 0) {
            Toast.makeText(getApplicationContext(), "Enter Email or phone number", Toast.LENGTH_LONG).show();
            if (st_emailandphone.matches(regexStr)) {
                if (!(isValidPhone(st_emailandphone))) {
                    Toast.makeText(getApplicationContext(), "Enter valid phone no", Toast.LENGTH_LONG).show();
                }
            } else if (!st_emailandphone.matches(regexStr)) {
                if (!(isValidEmail(st_emailandphone))) {
                    Toast.makeText(getApplicationContext(), "Enter valid Email", Toast.LENGTH_LONG).show();
                }
            }
        } else if (st_password.length() == 0) {
            Log.e("code0", "call");
            Toast.makeText(getApplicationContext(), "Enter password", Toast.LENGTH_LONG).show();

        }  else {
            finish();
            Intent it = new Intent(getApplication(), HomeActivity.class);
            startActivity(it);

        }*/
}
