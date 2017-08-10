package com.example.dell.spectrum.Graphs;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.dell.spectrum.TapbarFragments.FragmentMainActivity;
import com.example.dell.spectrum.R;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class FragmentMainActivityGraph extends AppCompatActivity {
    ViewPagerAdapter adapter;
    TabLayout tabLayout;
    String key = null;
    Button share,menu,back;
    RelativeLayout sharepage;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maingraph);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_graph);
        setSupportActionBar(toolbar);
        sharepage = (RelativeLayout)findViewById(R.id.rl_home);
        back=(Button)findViewById(R.id.backimage);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentMainActivity.isFromHOme=true;
                startActivity(new Intent(getApplicationContext(), FragmentMainActivity.class));
            }
        });
        //menu.setOnClickListener(mMenuListener);
        share=(Button)findViewById(R.id.share);
        share.setVisibility(View.VISIBLE);
        share.setOnClickListener(mShareListener);
        try {
            Bundle bundle = getIntent().getExtras();
            key = bundle.getString("key");

        }catch (Exception e)
        {
            e.printStackTrace();
        }
        if(savedInstanceState == null)
        {
            if(key == null)
            {
                // Select this one
                Fragment fragment = new WeekchartsFragment();
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frame, fragment).commit();
            }
            else if(key.equals("wife"))
            {

                    Fragment fragment = new WeekchartsFragment();
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    fragmentManager.beginTransaction().replace(R.id.frame, fragment).commit();
            }
            else if (key.equals("record"))
            {
            Fragment fragment = new WeekchartsFragment();
            FragmentManager  fragmentManager= getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.frame,fragment).commit();
            }

        }

        tabLayout=(TabLayout)findViewById(R.id.tabs);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new WeekchartsFragment());
        adapter.addFragment(new MonthchartsFragment());
        adapter.addFragment(new YearchartsFragment());
        tabLayout.setTabsFromPagerAdapter(adapter);
        tabLayout.getTabAt(0).select();

        for (int i = 0; i < tabLayout.getTabCount(); i++) {
            if(i==0) {
                TextView imageView = new TextView(getApplicationContext());
                tabLayout.getTabAt(i).setCustomView(imageView);
                imageView.setText("WEEk");
                imageView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                imageView.setTextColor(Color.parseColor("#ffffff"));
                imageView.setTextSize(15);


            }
            else if(i==1)
            {
                TextView imageView = new TextView(getApplicationContext());
                tabLayout.getTabAt(i).setCustomView(imageView);
                imageView.setText("MONTH");
                imageView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                imageView.setTextColor(Color.parseColor("#ffffff"));
                imageView.setTextSize(15);
            }
            else if(i==2)
            {
                TextView imageView = new TextView(getApplicationContext());
                tabLayout.getTabAt(i).setCustomView(imageView);
                imageView.setText("YEAR");
                imageView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                imageView.setTextColor(Color.parseColor("#ffffff"));
                imageView.setTextSize(15);
            }

        }

        // Select this one
       /* WeekchartsFragment fragment = (WeekchartsFragment) adapter.getItem(0);
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame1, fragment, "");
        fragmentTransaction.commitAllowingStateLoss();
        tabLayout.getTabAt(0).select();*/


        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Log.e("Position", String.valueOf(tab.getPosition()));

                if (tab.getPosition() == 0) {
                    //txtTitle.setText("2016/10/15");
                    Log.e("PositionInside", String.valueOf(tab.getPosition()));
                    WeekchartsFragment fragment = (WeekchartsFragment) adapter.getItem(0);
                    FragmentTransaction fragmentTransaction =getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.frame, fragment, "");
                    fragmentTransaction.commitAllowingStateLoss();
                  //  tabLayout.getTabAt(0).select();


                } else if (tab.getPosition() == 1) {
                    Log.e("PositionInside", String.valueOf(tab.getPosition()));
                    MonthchartsFragment fragment = (MonthchartsFragment) adapter.getItem(1);
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.frame, fragment, "");
                    fragmentTransaction.commitAllowingStateLoss();

                }
                else if (tab.getPosition() == 2) {
                    Log.e("PositionInside", String.valueOf(tab.getPosition()));
                    YearchartsFragment fragment = (YearchartsFragment) adapter.getItem(2);
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.frame, fragment, "");
                    fragmentTransaction.commitAllowingStateLoss();


                }


            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }


    class ViewPagerAdapter extends FragmentStatePagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        //private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            if (position == 0) {
                Log.e("fragment", "position 0");
            }
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment) {
            mFragmentList.add(fragment);

        }

    }
    View.OnClickListener mShareListener=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            View viewScreen = sharepage.getRootView();
            viewScreen.buildDrawingCache();
            viewScreen.setDrawingCacheEnabled(true);
            viewScreen.destroyDrawingCache();
            Bitmap screenshot1 = Bitmap.createBitmap(viewScreen.getWidth(), viewScreen.getHeight(), Bitmap.Config.RGB_565);
            viewScreen.draw(new Canvas(screenshot1));
            File mfile2 = savebitmap2(screenshot1);
            final Uri screenshotUri = Uri.fromFile(mfile2);
            Intent shareIntent = new Intent();
            shareIntent.setAction(Intent.ACTION_SEND);
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Spectrum Project");
            shareIntent.putExtra(Intent.EXTRA_TEXT, "" + getResources().getString(R.string.sms_body));
            shareIntent.putExtra(Intent.EXTRA_STREAM, screenshotUri);
            shareIntent.setType("image/*");
            shareIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
            startActivity(Intent.createChooser(shareIntent, getResources().getString(R.string.share_satus)));

        }
    };
    /**
     * Called when take the screen shot
     */
    private File savebitmap2(Bitmap bmp) {
        String temp = "SleepHistory";

        OutputStream outStream = null;
        String path = Environment.getExternalStorageDirectory()
                .toString();
        new File(path + "/SplashItTemp2").mkdirs();
        File file = new File(path + "/SplashItTemp2", temp + ".png");
        if (file.exists()) {
            file.delete();
            file = new File(path + "/SplashItTemp2", temp + ".png");
        }

        try {
            outStream = new FileOutputStream(file);
            bmp.compress(Bitmap.CompressFormat.PNG, 100, outStream);
            outStream.flush();
            outStream.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return file;
    }

}






