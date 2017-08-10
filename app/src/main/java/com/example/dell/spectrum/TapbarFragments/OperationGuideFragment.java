package com.example.dell.spectrum.TapbarFragments;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dell.spectrum.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class OperationGuideFragment extends Fragment {
    Toolbar toolbar;
    ImageButton back;
    ImageView menu;

    public static OperationGuideFragment newInstance()
    {
        OperationGuideFragment fragment = new OperationGuideFragment();
        return fragment;
    }
    public OperationGuideFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =inflater.inflate(R.layout.fragment_operation_guide, container, false);
        setToolbar(v);
        return v;
    }
    public void setToolbar(View v)
    {
        toolbar = (Toolbar)v.findViewById(R.id.toolbarlogin);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        back = (ImageButton) toolbar.findViewById(R.id.backimage);
        back.setVisibility(View.INVISIBLE);
        TextView toolbartext = (TextView)toolbar.findViewById(R.id.tool_txt);
        toolbartext.setText("Operation Guide");
       // menu = (ImageView) toolbar.findViewById(R.id.menuop);
       // menu.setBackgroundResource(R.drawable.icon_optionsmenu);
    }
}
