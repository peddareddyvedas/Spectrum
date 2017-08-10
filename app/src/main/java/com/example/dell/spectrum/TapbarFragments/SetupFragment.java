package com.example.dell.spectrum.TapbarFragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.dell.spectrum.R;
import com.example.dell.spectrum.Settings.AboutUsActivity;
import com.example.dell.spectrum.Settings.AccountSettingsActivity;
import com.example.dell.spectrum.Settings.FeedbackActivity;
import com.example.dell.spectrum.Settings.FriendsAndFamilyActivity;
import com.example.dell.spectrum.Settings.MySpectometerActivity;
import com.example.dell.spectrum.Settings.PreferencesActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class SetupFragment extends Fragment {
    Toolbar toolbar;
    ImageView imgnavigation,imgadd,imgoptionsmenu,imgqrcode;
    RelativeLayout account,device,myspectrom,preference,feedback,aboutus;
    public static SetupFragment newInstance()
    {
        SetupFragment fragment = new SetupFragment();
        return fragment;
    }

    public SetupFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =inflater.inflate(R.layout.fragment_setup, container, false);
        setToolbar(v);
        layoutIdsndActions(v);
        return v;
    }
    public void layoutIdsndActions(View v){
        account=(RelativeLayout)v.findViewById(R.id.rl_account);
        device=(RelativeLayout)v.findViewById(R.id.rl_device);
       // myspectrom=(RelativeLayout)v.findViewById(R.id.rl_spectrom);
        feedback=(RelativeLayout)v.findViewById(R.id.rl_feedbck);
        aboutus=(RelativeLayout)v.findViewById(R.id.rl_about);
        preference=(RelativeLayout)v.findViewById(R.id.rl_preference);
        account.setOnClickListener(mAccount);
        device.setOnClickListener(mdevice);
      //  myspectrom.setOnClickListener(mMyspectometer);
        preference.setOnClickListener(mPreferences);
        feedback.setOnClickListener(mFeedback);
        aboutus.setOnClickListener(mAgreement);


    }
    View.OnClickListener mdevice=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(getActivity(), MySpectometerActivity.class));
        }
    };

    View.OnClickListener mAccount=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(getActivity(), AccountSettingsActivity.class));
        }
    };
//    View.OnClickListener mMyspectometer=new View.OnClickListener() {
//        @Override
//        public void onClick(View view) {
//            startActivity(new Intent(getActivity(), MySpectometerActivity.class));
//        }
//    };
    View.OnClickListener mPreferences=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(getActivity(), PreferencesActivity.class));
        }
    };
    View.OnClickListener mFeedback=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(getActivity(), FeedbackActivity.class));
        }
    };
    View.OnClickListener mAgreement=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(getActivity(), AboutUsActivity.class));
        }
    };
    public void setToolbar(View view)
    {
        toolbar = (Toolbar)view.findViewById(R.id.toolbar);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        imgnavigation = (ImageView)toolbar.findViewById(R.id.toolbar_icon);
        imgnavigation.setImageResource(R.drawable.icon_navigation);
        imgnavigation.setVisibility(View.INVISIBLE);
        TextView toolbartext = (TextView)toolbar.findViewById(R.id.toolbar_text);
        toolbartext.append(getString(R.string.settings));
       // imgqrcode = (ImageView)toolbar.findViewById(R.id.qrcode_img);
        imgadd = (ImageView)toolbar.findViewById(R.id.add_img);
        imgoptionsmenu = (ImageView)toolbar.findViewById(R.id.optionsmenu_icon);
        imgoptionsmenu.setImageResource(R.drawable.icon_optionsmenu);
        imgoptionsmenu.setVisibility(View.INVISIBLE);

    }
}
