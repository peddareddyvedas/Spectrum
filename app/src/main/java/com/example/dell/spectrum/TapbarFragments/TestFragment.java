package com.example.dell.spectrum.TapbarFragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.dell.spectrum.Home.RelationPageActivity;
import com.example.dell.spectrum.R;

/**
 * Created by Vedas on 11/11/2016.
 */

public class TestFragment extends Fragment {
    ImageButton back;
    View view;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_test, container, false);
        Button start= (Button) view.findViewById(R.id.start_button);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),RelationPageActivity.class);
                startActivity(intent);

            }
        });



        return view;




    }

}