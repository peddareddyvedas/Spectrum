package com.example.dell.spectrum.Home;
import android.animation.Animator;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dell.spectrum.R;

import java.util.Timer;
public class UrineAnimationActivity extends AppCompatActivity {

     ImageView image1;
    private int[] imageArray;
    private int currentIndex;
    private int startIndex;
    private int endIndex;
    ImageView iv;
    Animator animator;
    int count = 0;
    Toolbar toolbar;
    ImageButton back;
    TextView skip;
    public static boolean isFromcir=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        imageArray = new int[8];
        imageArray[0] = R.drawable.ic_bouione;
        imageArray[1] = R.drawable.ic_bouitwo;
        imageArray[2] = R.drawable.ic_bouithree;
        imageArray[3] = R.drawable.ic_bouifour;
        imageArray[4] = R.drawable.ic_bouifive;
        imageArray[5] = R.drawable.ic_bouisix;
        imageArray[6] = R.drawable.ic_bouiseven;
        imageArray[7] = R.drawable.ic_bouione;

        startIndex = 0;
        endIndex=7;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_urineanimate);
        image1 = (ImageView) findViewById(R.id.animation);
        iv = (ImageView) findViewById(R.id.animation);
        setToolbar();
        skip=(TextView)findViewById(R.id.skip);
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isFromcir=true;
                Log.e("onclick","call"+isFromcir);
                if(isFromcir){
                    Log.e("skiptrue","call");
                    startActivity(new Intent(getApplicationContext(),CircularProressActivity.class));
                }
            }
        });
        Log.e("booela","call"+isFromcir);
        nextImage();
    }
    public void setToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbarlogin);
        setSupportActionBar(toolbar);
        back = (ImageButton) toolbar.findViewById(R.id.backimage);
        TextView toolbartext = (TextView) toolbar.findViewById(R.id.tool_txt);
        toolbartext.setText("Instruction");
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    public void nextImage()
    {
        try{

            iv.setImageResource(imageArray[currentIndex]
            );
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
         final Animation rotateimage = AnimationUtils.loadAnimation(this, R.anim.animation);
        iv.startAnimation(rotateimage);

        currentIndex++;

        new Handler().postDelayed(new Runnable()
        {

            @Override
            public void run() {
                if(currentIndex > endIndex)
                {
                    currentIndex = 0;
                    if(isFromcir==false){
                        startActivity(new Intent(getApplicationContext(),CircularProressActivity.class));

                    }
                }
                else{
                    nextImage();
                }


            }
        },1000);
    }

}
