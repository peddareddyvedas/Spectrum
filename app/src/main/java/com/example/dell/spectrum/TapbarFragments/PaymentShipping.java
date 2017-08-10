package com.example.dell.spectrum.TapbarFragments;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.dell.spectrum.R;

/**
 * Created by Rise on 01/08/2017.
 */

public class PaymentShipping extends AppCompatActivity {

    TextView step, title,steptwo, titletwo;
    RadioGroup radioGroup;
    RadioButton radioButton;

    Toolbar toolbar;
    ImageView cart,red;
    ImageButton back;
    Button next;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paymentshipping);


        toolbar = (Toolbar)findViewById(R.id.toolbarlogin);
        setSupportActionBar(toolbar);
        back = (ImageButton) toolbar.findViewById(R.id.backimage);
        TextView toolbartext = (TextView)toolbar.findViewById(R.id.tool_txt);
        toolbartext.setText("Payment Shipping");
        cart = (ImageView) toolbar.findViewById(R.id.menu);
        cart.setBackgroundResource(R.drawable.ic_cart);
        red=(ImageView) toolbar.findViewById(R.id.menuop);
        red.setBackgroundResource(R.drawable.ic_red_round);





        step = (TextView) findViewById(R.id.step);
        title = (TextView) findViewById(R.id.title);
        steptwo = (TextView) findViewById(R.id.steptwo);
        titletwo = (TextView) findViewById(R.id.titletwo);
        steptwo.  setBackgroundResource(R.drawable.ic_blueround);
        titletwo.setTextColor(Color.parseColor("#7dbff7"));

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });








        radioGroup =(RadioGroup) findViewById(R.id.radiogroup_two);
        radioButton=(RadioButton) findViewById(R.id.radiofour);


        step.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });

        steptwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(PaymentShipping.this,PlaceOrder.class);
                startActivity(i);
            }
        });


        next=(Button)findViewById(R.id.paymentnext);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(PaymentShipping.this,PlaceOrder.class);
                startActivity(i);
            }
        });
    }
}