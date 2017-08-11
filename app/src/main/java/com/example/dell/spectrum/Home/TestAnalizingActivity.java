package com.example.dell.spectrum.Home;

import android.animation.Animator;
import android.app.Dialog;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dell.spectrum.R;
import com.example.dell.spectrum.TapbarFragments.FragmentMainActivity;
import com.example.dell.spectrum.TapbarFragments.ResultFragment;

public class TestAnalizingActivity extends AppCompatActivity {
    private ImageView image1;
    private int[] imageArray;
    private int currentIndex;
    private int startIndex;
    private int endIndex;
    Button butt;
    ImageView iv;
    Animator animator;
    boolean state = false;
    int count = 0;
    Toolbar toolbar;
    ImageButton back;
    public boolean isFromtest=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        imageArray = new int[5];
        imageArray[0] = R.drawable.ic_analyze1;
        imageArray[1] = R.drawable.ic_analyze2;
        imageArray[2] = R.drawable.ic_analyze3;
        imageArray[3] = R.drawable.ic_analyze4;
       imageArray[4] = R.drawable.ic_analyze1;

        startIndex = 0;
        // endIndex = 15;
        endIndex=4;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testanalizing);
       image1 = (ImageView) findViewById(R.id.animation);
        butt = (Button) findViewById(R.id.btnClick);
        butt.setOnClickListener(manimate);
        iv = (ImageView) findViewById(R.id.animation);
        nextImage();
        setToolbar();
    }
    View.OnClickListener manimate=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            final Dialog dialog = new Dialog(TestAnalizingActivity.this);
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            dialog.setCancelable(true);
            dialog.setContentView(R.layout.stopanimate_alert);
            dialog.show();
          Button  no=(Button) dialog.findViewById(R.id.no);
          Button  yes=(Button) dialog.findViewById(R.id.yes);

            no.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    isFromtest=false;
                    Log.e("onclick","call"+isFromtest);
                    if(isFromtest){
                        Log.e("ttrue","call");
                        finish();
                        FragmentMainActivity.isFromHOme=false;
                        startActivity(new Intent(getApplicationContext(),FragmentMainActivity.class));
                    }



                   dialog.dismiss();
                }
            });
            yes.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    isFromtest=true;
                    Log.e("onclick","call"+isFromtest);
                    if(isFromtest){
                        Log.e("skiptrue","call");
                        startActivity(new Intent(getApplicationContext(),HomeActivity.class));
                    }

                    dialog.dismiss();
                }
            });
            Log.e("booela","call"+isFromtest);
            nextImage();
        }


    };
    public void setToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbarlogin);
        setSupportActionBar(toolbar);
        back = (ImageButton) toolbar.findViewById(R.id.backimage);
        TextView toolbartext = (TextView) toolbar.findViewById(R.id.tool_txt);
        toolbartext.setText("Analyzing...");
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
    public void nextImage()
    {
        try {

            iv.setImageResource(imageArray[currentIndex]
            );
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        final Animation rotateimage = AnimationUtils.loadAnimation(this, R.anim.animation);
        iv.startAnimation(rotateimage);
        currentIndex++;


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if(currentIndex > endIndex)
                {
                    currentIndex = 0;

                    if(isFromtest==false)
                   {Log.e("next","call");
                         finish();
                       FragmentMainActivity.isFromHOme=false;
                       Intent intent = new Intent(getApplicationContext(), FragmentMainActivity.class);

                        startActivity(intent);

//                       Bundle bundle = new Bundle();
//                       bundle.putString("key", "result");
//                       Log.e("key",""+bundle);
//                       intent.putExtras(bundle);


                    }

                }
                else{
                    nextImage();

//                    finish();
//                    FragmentMainActivity.isFromHOme=false;
//                    startActivity(new Intent(getApplicationContext(),FragmentMainActivity.class));

                }



            }
        },1000);



    }

}
