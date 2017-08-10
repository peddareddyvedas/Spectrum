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
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dell.spectrum.Home.HomeActivity;
import com.example.dell.spectrum.R;
import com.example.dell.spectrum.TapbarFragments.HomeFragment;

import java.util.regex.Pattern;

import static android.R.attr.button;


/**
 * Created by Rise on 06/05/2017.
 */

public class RegisterpageActivity extends AppCompatActivity {

    Button signinbutton;
    EditText phoneoremail, password, code;
    ImageButton back;
    Toolbar toolbar;
    String st_emailorphone, st_code, st_psw;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_page);

        signinbutton = (Button) findViewById(R.id.signinbutton);
        phoneoremail = (EditText) findViewById(R.id.phoneoremai);
        password = (EditText) findViewById(R.id.password);
        code = (EditText) findViewById(R.id.verifycode);
        setToolbar();
        signinbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // mRegister();
                Intent it = new Intent(getApplication(), HomeActivity.class);
                startActivity(it);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // finish();
                Intent in = new Intent(RegisterpageActivity.this, LoginpageActivity.class);
                startActivity(in);

            }

        });
    }

    public void setToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbarlogin);
        setSupportActionBar(toolbar);
        back = (ImageButton) toolbar.findViewById(R.id.backimage);
        TextView toolbartext = (TextView) toolbar.findViewById(R.id.tool_txt);
        toolbartext.setText("Create Account");
    }

    public void mRegister() {
        st_emailorphone = phoneoremail.getText().toString();
        st_code = code.getText().toString();
        Log.e("codenjsnjs", "call" + st_code);
        st_psw = password.getText().toString();
        String regexStr = "^[0-9]*$";
        if(st_emailorphone.length()==0){
            Log.e("email0","call");
            Toast.makeText(getApplicationContext(), "Enter email", Toast.LENGTH_LONG).show();

        }else if(st_psw.length()==0){
            Log.e("pssword0","call");
            Toast.makeText(getApplicationContext(), "Enter password", Toast.LENGTH_LONG).show();

        }else if(st_code.length()==0){
            Log.e("pssword0","call");
            Toast.makeText(getApplicationContext(), "Enter code", Toast.LENGTH_LONG).show();

        } else if(!st_emailorphone.equals(regexStr) && (isValidEmail(st_emailorphone))){
            Log.e("valid email","call"+st_emailorphone);
            finish();
            Intent it = new Intent(getApplication(), HomeActivity.class);
            startActivity(it);
        }else if(!st_emailorphone.equals(regexStr) && !(isValidEmail(st_emailorphone)) && !st_emailorphone.equals(regexStr) && !(isValidPhone(st_emailorphone)) ){
            Log.e("not valid email","call");
            Toast.makeText(getApplicationContext(), "Enter valid email or phone", Toast.LENGTH_LONG).show();

        }else if(!st_emailorphone.equals(regexStr) && (isValidPhone(st_emailorphone))){
            Log.e("valid ph","call"+st_emailorphone);
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
       // String MobilePattern = "[0-9]{10}";
        /*if (pass.length() == 0) {
            Toast.makeText(getApplicationContext(), "Please Enter Email or Mobile Number", Toast.LENGTH_SHORT).show();
        } else if (pass.length() < 10) {
            Toast.makeText(getApplicationContext(), "Please Enter the valid phone number", Toast.LENGTH_SHORT).show();
        }
        return true ;*/
        return pass != null && pass.length() == 10 ;

    }
}
