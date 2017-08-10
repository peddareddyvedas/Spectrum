package com.example.dell.spectrum.Settings;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.dell.spectrum.R;

import java.util.ArrayList;

/**
 * Created by WAVE on 5/25/2017.
 */

public class LanguagesActivity extends AppCompatActivity {
    Toolbar toolbar;
    ImageView imgnavigation,imgadd,imgoptionsmenu,imgqrcode;
    ListView listView;
    LanguagesAdapter languagesAdapter;
    int tempSelectedPosition;
    ImageView img;
    ArrayList<String> arrayList;
    boolean sa=false;
    //String langArray[]={"English","Chinese Traditional","Chinese Simplified","Korean","French","German","Greek","Japanese","Russian","Spanish","Arabic"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_languages);
        setToolbar();
        listOperation();

    }
public void listOperation(){
    arrayList=new ArrayList<String>();
    arrayList.clear();
    arrayList.add("English");
    arrayList.add("Chinese Traditional");
    arrayList.add("Chinese Simplified");
    arrayList.add("Korean");
    arrayList.add("French");
    arrayList.add("German");
    arrayList.add("Greek");
    arrayList.add("Japanese");
    arrayList.add("Russian");
    arrayList.add("Spanish");
    arrayList.add("Arabic");

    listView=(ListView)findViewById(R.id.list_lang);
    languagesAdapter=new LanguagesAdapter();
    listView.setAdapter(languagesAdapter);
    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l)
        {
           tempSelectedPosition=pos;
            Log.e("amss","call"+tempSelectedPosition);
            sa=true;
            languagesAdapter.notifyDataSetChanged();
            /*for (int i=0;i<=adapterView.getSelectedItemPosition();i++){
                View vChild = adapterView.getChildAt(i);
                ImageView DeleteButton = (ImageView) vChild.findViewById(R.id.img_lang);
                DeleteButton.setVisibility(View.INVISIBLE);
            }
            ImageView DeleteButton = (ImageView) view.findViewById(R.id.img_lang);
            DeleteButton.setVisibility(View.VISIBLE);*/
        }
    });


}
    public void setToolbar()
    {
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        imgnavigation = (ImageView)toolbar.findViewById(R.id.toolbar_arrow);
        imgnavigation.setImageResource(R.drawable.ic_leftarrow);
        imgnavigation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        TextView toolbartext = (TextView)toolbar.findViewById(R.id.toolbar_textsettings);
        toolbartext.append(getString(R.string.lang));
        imgqrcode = (ImageView)toolbar.findViewById(R.id.qrcode_img);
        imgadd = (ImageView)toolbar.findViewById(R.id.add_img);
//        imgoptionsmenu = (ImageView)toolbar.findViewById(R.id.optionsmenu_icon);
//        imgoptionsmenu.setImageResource(R.drawable.icon_optionsmenu);

    }
    public class LanguagesAdapter extends BaseAdapter
    {
        Context context;
        //ArrayList<String> arrayList;
        ArrayList<String> arrayListImage;
        int selectedPosition = 0;

      /*  LanguagesAdapter(Context context, ArrayList<String> arrayList, int selectedPosition) {
            this.context = context;
            this.arrayList = arrayList;
            this.selectedPosition = selectedPosition;
        }*/

        @Override
        public int getCount() {
            return arrayList.size();
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
        public View getView(int position, View view, ViewGroup viewGroup) {
            LayoutInflater mInflater = (LayoutInflater)getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            view = mInflater.inflate(R.layout.activity_languageslistitems, null);
            TextView textView = (TextView) view.findViewById(R.id.txt_lang);
            textView.setText(arrayList.get(position));
            img = (ImageView) view.findViewById(R.id.img_lang);
             if(tempSelectedPosition==position){
                 if(sa){
                     img.setBackgroundResource(R.drawable.ic_checkicon);

                 }
             }
            return view;
        }
    }
}
