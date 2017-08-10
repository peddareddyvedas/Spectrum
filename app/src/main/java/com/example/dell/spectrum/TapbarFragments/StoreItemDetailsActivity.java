package com.example.dell.spectrum.TapbarFragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dell.spectrum.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class StoreItemDetailsActivity extends AppCompatActivity {
    Toolbar toolbar;
    ImageView cart,red;
    ImageButton back;
    Button addtocart;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storeitemdetails);
        setToolbar();
    }

    public void setToolbar()
    {
        toolbar = (Toolbar)findViewById(R.id.toolbarlogin);
        setSupportActionBar(toolbar);
        back = (ImageButton) toolbar.findViewById(R.id.backimage);
        TextView toolbartext = (TextView)toolbar.findViewById(R.id.tool_txt);
        toolbartext.setText("Urine Strip");
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

        addtocart=(Button)findViewById(R.id.addtocart);
        addtocart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(StoreItemDetailsActivity.this,ShippingCart.class) ;
                startActivity(i);
            }
        });
    }
}
