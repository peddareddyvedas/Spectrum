package com.example.dell.spectrum.Home;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dell.spectrum.R;

/**
 * Created by WAVE on 7/20/2017.
 */

public class RelationPageActivity extends AppCompatActivity {
    RelationAdapter relationAdapter;
    GridView gridView;
    int [] ImgArray={R.drawable.ic_lady,
            R.drawable.ic_menicon,R.drawable.ic_lady,
            R.drawable.ic_menicon,
            R.drawable.ic_menicon,R.drawable.ic_lady,
            R.drawable.ic_lady,
            };
    String relatonArray[]={"Kevin","Edward","Sonia","Bella","James","Aurora","Vani"};
    String nameArray[]={"Me","Father","Mother","Brother","Brother","Sister","Sister-In-Law"};
    ImageButton back;
    Toolbar toolbar;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relationpagelist);
        gridView=(GridView)findViewById(R.id.relationlist);
        relationAdapter=new RelationAdapter();
        gridView.setAdapter(relationAdapter);
        setToolbar();
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            startActivity(new Intent(getApplicationContext(),UrineAnimationActivity.class));
            }
        });
    }
    public void setToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbarlogin);
        setSupportActionBar(toolbar);
        back = (ImageButton) toolbar.findViewById(R.id.backimage);
        TextView toolbartext = (TextView) toolbar.findViewById(R.id.tool_txt);
        toolbartext.setText("Choice User");
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
    public class RelationAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return ImgArray.length;
        }

        @Override
        public Object getItem(int i) {
            return i;
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            LayoutInflater mInflater = (LayoutInflater)getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            view = mInflater.inflate(R.layout.activity_relationpageitems, null);
            TextView textView = (TextView) view.findViewById(R.id.relation);
            textView.setText(nameArray[i]);
            TextView name = (TextView) view.findViewById(R.id.name);
            name.setText(relatonArray[i]);
            ImageView imageView=(ImageView)view.findViewById(R.id.relationimg);
            imageView.setBackgroundResource(ImgArray[i]);
            return view;
        }
    }
}
