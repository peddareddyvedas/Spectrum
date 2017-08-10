package com.example.dell.spectrum.TapbarFragments;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dell.spectrum.R;

/**
 * Created by Rise on 01/08/2017.
 */

public class PlaceOrder extends AppCompatActivity {
    Toolbar toolbar;
    ImageButton back;
    ImageView cart,red;


    TextView step, title,stepthree, titlethree;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placeorder);

        toolbar = (Toolbar)findViewById(R.id.toolbarlogin);
        setSupportActionBar(toolbar);
        back = (ImageButton) toolbar.findViewById(R.id.backimage);
        TextView toolbartext = (TextView)toolbar.findViewById(R.id.tool_txt);
        toolbartext.setText("Place Order");
        cart = (ImageView) toolbar.findViewById(R.id.menu);
        cart.setBackgroundResource(R.drawable.ic_cart);
        red=(ImageView) toolbar.findViewById(R.id.menuop);
        red.setBackgroundResource(R.drawable.ic_red_round);



        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });



        step = (TextView) findViewById(R.id.step);
        title = (TextView) findViewById(R.id.title);
        stepthree = (TextView) findViewById(R.id.stepthree);
        titlethree = (TextView) findViewById(R.id.titlethree);
        stepthree.  setBackgroundResource(R.drawable.ic_blueround);
        titlethree.setTextColor(Color.parseColor("#7dbff7"));

        step.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });

     stepthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Intent i=new Intent(PaymentShipping.this,PlaceOrder.class);
                //startActivity(i);
            }
        });
    }
}
