package com.example.dell.spectrum.TapbarFragments;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
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
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.dell.spectrum.Graphs.WeekchartsFragment;
import com.example.dell.spectrum.Home.HomeActivity;
import com.example.dell.spectrum.R;

import java.util.ArrayList;
import java.util.List;

public class FragmentMainActivity extends AppCompatActivity {
    ViewPagerAdapter adapter;
    TabLayout tabLayout;
    String key = null;
    public static boolean isFromHOme=false;
    ImageButton back;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_activity_main);
        Toolbar rlToolBar = (Toolbar) findViewById(R.id.toolbartab);
        setSupportActionBar(rlToolBar);
        Button back=(Button)findViewById(R.id.btn_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
               startActivity(new Intent(getApplicationContext(), HomeActivity.class));
            }
        });
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
                Fragment fragment = new TestFragment();
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frame1, fragment).commit();


            }
            else if(key.equals("result"))
            {
                Fragment fragment = new ResultFragment();
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frame1, fragment, "test").commit();
            }
//            else if(key.equals("record"))
//            {
//                Fragment fragment = new RecordFragment();
//                FragmentManager fragmentManager = getSupportFragmentManager();
//                fragmentManager.beginTransaction().replace(R.id.frame1, fragment, "record").commit();
//            }
//            else if(key.equals("result"))
//            {
//                Fragment fragment = new ResultFragment();
//                FragmentManager fragmentManager = getSupportFragmentManager();
//                fragmentManager.beginTransaction().replace(R.id.frame1, fragment, "result").commit();
//
//            }


        }



            tabLayout=(TabLayout)findViewById(R.id.tabs);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new TestFragment());
        adapter.addFragment(new ResultFragment());
        adapter.addFragment(new RecordFragment());
        ResultFragment fragment = (ResultFragment) adapter.getItem(1);
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame1, fragment, "");
        fragmentTransaction.commitAllowingStateLoss();
        tabLayout.setTabsFromPagerAdapter(adapter);

        for (int i = 0; i < tabLayout.getTabCount(); i++) {
            if(i==0) {
               TextView imageView = new TextView(getApplicationContext());
               tabLayout.getTabAt(i).setCustomView(imageView);
                //imageView.setText(getResources().getDrawable(R.drawable.));
                imageView.setText("Test");
                imageView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                imageView.setTextSize(16);
                imageView.setTextColor(Color.parseColor("#ffffff"));


            }
            else if(i==1)
            {
                TextView imageView = new TextView(getApplicationContext());
                tabLayout.getTabAt(i).setCustomView(imageView);
                imageView.setText("Result");
                imageView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                imageView.setTextSize(16);
                imageView.setTextColor(Color.parseColor("#ffffff"));

            }
            else if(i==2)
            {
                TextView imageView = new TextView(getApplicationContext());
                tabLayout.getTabAt(i).setCustomView(imageView);
                imageView.setText("Record");
                imageView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                imageView.setTextSize(16);
                imageView.setTextColor(Color.parseColor("#ffffff"));

            }
        }

             checkisfromHome();
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Log.e("Position", String.valueOf(tab.getPosition()));

                if (tab.getPosition() == 0) {
                    //txtTitle.setText("2016/10/15");
                    Log.e("PositionInside", String.valueOf(tab.getPosition()));
                    TestFragment fragment = (TestFragment) adapter.getItem(0);
                    FragmentTransaction fragmentTransaction =getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.frame1, fragment, "");
                    fragmentTransaction.commitAllowingStateLoss();
                } else if (tab.getPosition() == 1) {
                    Log.e("PositionInside", String.valueOf(tab.getPosition()));
                    ResultFragment fragment = (ResultFragment) adapter.getItem(1);
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.frame1, fragment, "");
                    fragmentTransaction.commitAllowingStateLoss();


                }else
                     {
                    Log.e("PositionInside", String.valueOf(tab.getPosition()));
                    RecordFragment fragment = (RecordFragment) adapter.getItem(2);
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.frame1, fragment, "");
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
    public void checkisfromHome() {
        Log.e("tabbbbbbb",""+isFromHOme);
        if (isFromHOme) {
            TestFragment fragment = (TestFragment) adapter.getItem(0);
            FragmentTransaction fragmentTransaction =getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame1, fragment, "");
            fragmentTransaction.commitAllowingStateLoss();
            tabLayout.getTabAt(0).select();


        }
        else {
            ResultFragment fragment = (ResultFragment) adapter.getItem(1);
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame1, fragment, "");
            fragmentTransaction.commitAllowingStateLoss();
            tabLayout.getTabAt(1).select();

        }
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

    }



