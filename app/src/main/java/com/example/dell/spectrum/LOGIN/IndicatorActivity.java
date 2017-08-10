package com.example.dell.spectrum.LOGIN;

/**
 * Created by WAVE on 5/29/2017.
 */

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dell.spectrum.R;
import com.viewpagerindicator.CirclePageIndicator;

import java.util.ArrayList;

public class IndicatorActivity extends AppCompatActivity {
    private static ViewPager mPager;
    private static int currentPage = 0;
    private static int NUM_PAGES = 0;
    private static final Integer[] IMAGES= {R.drawable.ic_userduider,
            R.drawable.ic_userduider,R.drawable.ic_userduider};
    private static final String[] Textvalues= {"The worlds smallest spectrome","Laboratory and medical grade","More than one machine application"};
    private ArrayList<Integer> ImagesArray = new ArrayList<Integer>();
    private ArrayList<String> TextArray = new ArrayList<String>();
    private static final String[] lastvalues={"","","Move to Login"};
    private ArrayList<String> lastArray = new ArrayList<String>();
    private static final String[] IMAGEfirst= {"Skip","",""};
    private ArrayList<String> firstArray = new ArrayList<String>();
    ImageView imgnavigation,imgadd,imgoptionsmenu,imgqrcode;
    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_indicator);
        init();
    }
    private void init() {
        for(int i=0;i<IMAGES.length;i++)
            ImagesArray.add(IMAGES[i]);
        for(int j=0;j<Textvalues.length;j++)
            TextArray.add(Textvalues[j]);
        for(int k=0;k<lastvalues.length;k++)
            lastArray.add(lastvalues[k]);
        for(int l=0;l<IMAGEfirst.length;l++)
            firstArray.add(IMAGEfirst[l]);

        mPager = (ViewPager) findViewById(R.id.pager);
        mPager.setAdapter(new SlidingImage_Adapter(IndicatorActivity.this,ImagesArray,TextArray,lastArray,firstArray));


        CirclePageIndicator indicator = (CirclePageIndicator)
                findViewById(R.id.indicator);

        indicator.setViewPager(mPager);

        final float density = getResources().getDisplayMetrics().density;

//Set circle indicator radius
        indicator.setRadius(5 * density);

        NUM_PAGES =IMAGES.length;

        // Auto start of viewpager
        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == NUM_PAGES) {
                    currentPage = 0;
                }
                mPager.setCurrentItem(currentPage++, true);
            }
        };
        /*Timer swipeTimer = new Timer();
        swipeTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(Update);
            }
        }, 3000, 3000);
*/
        // Pager listener over indicator
        indicator.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int position) {
                currentPage = position;

            }

            @Override
            public void onPageScrolled(int pos, float arg1, int arg2) {

            }

            @Override
            public void onPageScrollStateChanged(int pos) {

            }
        });

    }
    public class SlidingImage_Adapter extends PagerAdapter {


        private ArrayList<Integer> IMAGES;
        private ArrayList<String> strArray;
        private ArrayList<String> LastArray;
        private ArrayList<String> firstArray;

        private LayoutInflater inflater;
        private Context context;


        public SlidingImage_Adapter(Context context,ArrayList<Integer> IMAGES,ArrayList<String>text,ArrayList<String>last,ArrayList<String>first) {
            this.context = context;
            this.IMAGES=IMAGES;
            this.strArray=text;
            this.LastArray=last;
            this.firstArray=first;
            inflater = LayoutInflater.from(context);
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }

        @Override
        public int getCount() {
            return IMAGES.size();
        }

        @Override
        public Object instantiateItem(ViewGroup view, final int position) {
            View imageLayout = inflater.inflate(R.layout.activity_indicatoritems, view, false);

            assert imageLayout != null;
            final ImageView imageView = (ImageView) imageLayout
                    .findViewById(R.id.pagerimage);
            imageView.setImageResource((IMAGES.get(position)));
              //////
            final TextView textView = (TextView) imageLayout.findViewById(R.id.pagertext);
            textView.setText(strArray.get(position));
                 /////
            final TextView textViewlast = (TextView) imageLayout.findViewById(R.id.pagerbottomtxt);
            textViewlast.setText(LastArray.get(position));
            textViewlast.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String list = LastArray.get(position);
                    if(list==LastArray.get(0)){
                    }else if(list==LastArray.get(1)){
                    }else if(list==LastArray.get(2)){
                        finish();
                        startActivity(new Intent(getApplicationContext(),LoginpageActivity.class));

                    }else {

                    }
                }
            });
            ///
            final TextView textViewtop = (TextView) imageLayout.findViewById(R.id.pagerimagetop);
            textViewtop.setText(firstArray.get(position));
            textViewtop.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String list = firstArray.get(position);
                    if(list==firstArray.get(0)){
                        textViewtop.setVisibility(View.VISIBLE);
                        finish();
                        startActivity(new Intent(getApplicationContext(),LoginpageActivity.class));
                    }else if(list==firstArray.get(1)){
                        textViewtop.setVisibility(View.VISIBLE);

                    }else if(list==firstArray.get(2)){
                        textViewtop.setVisibility(View.VISIBLE);
                    }else {

                    }
                }
            });
            ////
            view.addView(imageLayout, 0);

            return imageLayout;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view.equals(object);
        }

        @Override
        public void restoreState(Parcelable state, ClassLoader loader) {
        }

        @Override
        public Parcelable saveState() {
            return null;
        }


    }
}
