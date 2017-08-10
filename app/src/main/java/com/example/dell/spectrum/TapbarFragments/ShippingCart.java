package com.example.dell.spectrum.TapbarFragments;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dell.spectrum.R;

public class ShippingCart extends AppCompatActivity {

    Button checkout;
    TextView step, title, steptwo, titletwo;


    Toolbar toolbar;
    ImageView cart,red;
    ImageButton back;
    Button addtocart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shippingcart);
//        setToolbar();
//    }
//
//
//    public void setToolbar()
//    {
        toolbar = (Toolbar)findViewById(R.id.toolbarlogin);
        setSupportActionBar(toolbar);
        back = (ImageButton) toolbar.findViewById(R.id.backimage);
        TextView toolbartext = (TextView)toolbar.findViewById(R.id.tool_txt);
        toolbartext.setText("Shopping Cart");
        cart = (ImageView) toolbar.findViewById(R.id.menu);
        cart.setBackgroundResource(R.drawable.ic_cart);
        step = (TextView) findViewById(R.id.step);
        title = (TextView) findViewById(R.id.title);
        steptwo = (TextView) findViewById(R.id.steptwo);
        titletwo = (TextView) findViewById(R.id.titletwo);

        red=(ImageView) toolbar.findViewById(R.id.menuop);
        red.setBackgroundResource(R.drawable.ic_red_round);



        //step.setTextColor(Color.parseColor("#FFF000"));
        step.setBackgroundResource(R.drawable.ic_blueround);
        title.setTextColor(Color.parseColor("#7dbff7"));




        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });



        step.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ShippingCart.this,PaymentShipping.class);
                startActivity(i);
            }
        });
        steptwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ShippingCart.this,PaymentShipping.class);
                startActivity(i);
            }
        });



        checkout=(Button)findViewById(R.id.checkoutbutton);
        checkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ShippingCart.this,PaymentShipping.class);
                startActivity(i);
            }
        });
    }
}




