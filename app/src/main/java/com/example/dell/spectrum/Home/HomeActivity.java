package com.example.dell.spectrum.Home;


import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dell.spectrum.CustomViewPager;
import com.example.dell.spectrum.TapbarFragments.HomeFragment;
import com.example.dell.spectrum.TapbarFragments.OperationGuideFragment;

import com.example.dell.spectrum.TapbarFragments.SetupFragment;
import com.example.dell.spectrum.R;
import com.example.dell.spectrum.TapbarFragments.StoreMainFragment;

public class HomeActivity extends AppCompatActivity
{

    //Declaring the Toolbar
    Toolbar toolbar;

    //Declaring the Tablayout
   TabLayout tabLayout;

   //Tabicons
    int[] tabicons = {R.drawable.tab_home_selector,R.drawable.tab_info_selector,R.drawable.tab_cart_selector,R.drawable.tab_settings_selector};

    //ViewPager
    CustomViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        setToolbar();
        setTabbar();

    }

    //Intializing the toolbar
   public void setToolbar()
   {
       toolbar = (Toolbar)findViewById(R.id.toolbar);
       setSupportActionBar(toolbar);

       //setting the navigation icon to toolbar
       ImageView imgnavigation = (ImageView)toolbar.findViewById(R.id.toolbar_icon);
       imgnavigation.setImageResource(R.drawable.icon_navigation);

       //setting the text to toolbar
       TextView toolbartext = (TextView)toolbar.findViewById(R.id.toolbar_text);
       toolbartext.append(getString(R.string.spectrochip));


       //setting the Qrcode image to toolbar
       ImageView imgqrcode = (ImageView) toolbar.findViewById(R.id.qrcode_img);
       imgqrcode.setImageResource(R.drawable.icon_qrcode);

       //imgqrcode.setOnClickListener(ImgQrcodeListner);

       //setting the add imag to toolbar
       ImageView imgadd = (ImageView)toolbar.findViewById(R.id.add_img);
       imgadd.setImageResource(R.drawable.icon_add);
       imgadd.setOnClickListener(AddDevice);

       //setting the optionsmenu to toolbar
       ImageView imgoptionsmenu = (ImageView)toolbar.findViewById(R.id.optionsmenu_icon);
       imgoptionsmenu.setImageResource(R.drawable.icon_optionsmenu);

    }
      //setting Tababar icons and Text
    public void setTabbar()
    {
        tabLayout = (TabLayout)findViewById(R.id.tab_layout);
        viewPager = (CustomViewPager)findViewById(R.id.viewpager);
        MyPagerAdapter pagerAdapter = new MyPagerAdapter(getSupportFragmentManager());

        if (viewPager != null) {
            viewPager.setPagingEnabled(false);
            viewPager.setAdapter(pagerAdapter);
        }

        if (tabLayout != null) {
            tabLayout.setupWithViewPager(viewPager);

            for (int i = 0; i < tabLayout.getTabCount(); i++) {
                TabLayout.Tab tab = tabLayout.getTabAt(i);
                if (tab != null)
                    tab.setCustomView(pagerAdapter.getTabView(i));
            }

            tabLayout.getTabAt(0).getCustomView().setSelected(true);
        }

    }

    private class MyPagerAdapter extends FragmentPagerAdapter {

        public final int PAGE_COUNT = 4;
        private final String[] mTabsTitle = {"Home", "Operation guide", "Store","setting"};

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        public View getTabView(int position) {
            // Given you have a custom layout in `res/layout/custom_tab.xml` with a TextView and ImageView
            View view = LayoutInflater.from(HomeActivity.this).inflate(R.layout.activity_custom_tabbar, null);
            TextView title = (TextView) view.findViewById(R.id.title);
            title.setText(mTabsTitle[position]);
            ImageView icon = (ImageView) view.findViewById(R.id.icon);
            icon.setImageResource(tabicons[position]);
            Log.e("position"," "+tabicons[position]);
            return view;

        }

        @Override
        public Fragment getItem(int pos) {
            switch (pos) {

                case 0:
                    return HomeFragment.newInstance();

                case 1:
                    return OperationGuideFragment.newInstance();
                case 2:
                    return StoreMainFragment.newInstance();
                case 3:
                    return SetupFragment.newInstance();

            }
            return null;
        }

        @Override
        public int getCount() {
            return PAGE_COUNT;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mTabsTitle[position];
        }
    }


    //Click event on Add device icon
    View.OnClickListener AddDevice = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent adddevice = new Intent(HomeActivity.this,AddDeviceActivity.class);
            startActivity(adddevice);
        }
    };


    //Click Event on QRCODE IMAGE
    /*View.OnClickListener ImgQrcodeListner = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          //  Toast.makeText(getApplicationContext(),"click",Toast.LENGTH_SHORT).show();
            Intent qrscanner = new Intent(HomeActivity.this,QRCodeScannerActivity.class);
            startActivity(qrscanner);
        }
    };*/



}



