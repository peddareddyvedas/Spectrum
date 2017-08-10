package com.example.dell.spectrum.TapbarFragments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dell.spectrum.R;
import com.example.dell.spectrum.Graphs.FragmentMainActivityGraph;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by Rise on 13/05/2017.
 */
public class RecordFragment extends android.support.v4.app.Fragment {
    View view;
    RecordAdapter recordAdapter;
    GridView gridView;
    int[] ImgArray = {R.drawable.ic_lady,
            R.drawable.ic_menicon, R.drawable.ic_lady,
            R.drawable.ic_menicon,
            R.drawable.ic_menicon, R.drawable.ic_lady,
            R.drawable.ic_lady,
    };
    ArrayList<RelationModel> listRelation=new ArrayList<>();
    RelationModel relationmodel=new RelationModel();
    RelationModel relationmodel2=new RelationModel();
    RelationModel relationmodel3=new RelationModel();
    RelationModel relationmodel4=new RelationModel();
    RelationModel relationmodel5=new RelationModel();
    RelationModel relationmodel6=new RelationModel();
    RelationModel relationmodel7=new RelationModel();
    RelationModel relationmode8=new RelationModel();
    String sort_name,Week;
    Calendar UrineWeekStartTime;
    SimpleDateFormat Urinesimpledateformat;
    String relatonArray[] = {"Kevin", "Edward", "Sophia", "James", "Bella", "Aurora", "Kristen","Jackson","Charlie"};
    String nameArray[] = {"Me", "Brother", "Mother", "Son", "Sister-In-law", "Daughter", "Co-Brother","Son"};
    public static ArrayList<UrineTestModel> filterList=new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_record, container, false);
        gridView = (GridView) view.findViewById(R.id.recordlist);
        recordAdapter = new RecordAdapter();
        gridView.setAdapter(recordAdapter);

        setVars();
       /* try {
            getFilteredArrayByDate("2017-07-31");
        } catch (ParseException e) {
            e.printStackTrace();
        }*/
        return view;
    }
    public void setVars(){

        relationmodel.setName("kevin");
        relationmodel.setRelation("Me");
        relationmodel.setImg(R.drawable.ic_menicon);
        listRelation.add(relationmodel);
        //
        relationmodel2.setName("Edward");
        relationmodel2.setRelation("Brother");
        relationmodel2.setImg(R.drawable.ic_menicon);
        listRelation.add(relationmodel2);
        //
        relationmodel3.setName("Sophia");
        relationmodel3.setRelation("Mother");
        relationmodel3.setImg(R.drawable.ic_lady);
        listRelation.add(relationmodel3);
        //
        relationmodel4.setName("James");
        relationmodel4.setRelation("Son");
        relationmodel4.setImg(R.drawable.ic_menicon);
        listRelation.add(relationmodel4);
        //
        relationmodel5.setName("Bella");
        relationmodel5.setRelation("Sister-In-Law");
        relationmodel5.setImg(R.drawable.ic_lady);
        listRelation.add(relationmodel5);
        //Jackson","Charlie
        relationmodel6.setName("Aurora");
        relationmodel6.setRelation("Daughter");
        relationmodel6.setImg(R.drawable.ic_lady);
        listRelation.add(relationmodel6);
        //Jackson","Charlie
        relationmodel7.setName("Jackson");
        relationmodel7.setRelation("Co-Brother");
        relationmodel7.setImg(R.drawable.ic_lady);
        listRelation.add(relationmodel7);
        //Jackson","Charlie
        relationmode8.setName("Charlie");
        relationmode8.setRelation("Son");
        relationmode8.setImg(R.drawable.ic_lady);
        listRelation.add(relationmode8);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                sort_name = listRelation.get(i).getName();
                Log.e("selectedItem",""+sort_name);
                ///
                filterList=getFilteredArray(sort_name);
                ///
                if(filterList.size()==0){
                    Toast.makeText(getActivity(),"You don't have records",Toast.LENGTH_SHORT).show();
                }else {
                    Log.e("filterList","call"+filterList.size());

                }


            }
        });

    }

    public class RecordAdapter extends BaseAdapter {

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
            LayoutInflater mInflater = (LayoutInflater) getActivity().getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            view = mInflater.inflate(R.layout.activity_recordpageitems, null);
            TextView textView = (TextView) view.findViewById(R.id.relation);
            textView.setText(nameArray[i]);
            TextView name = (TextView) view.findViewById(R.id.name);
            name.setText(relatonArray[i]);
            ImageView imageView = (ImageView) view.findViewById(R.id.relationimg);
            imageView.setBackgroundResource(ImgArray[i]);
            return view;
        }
    }
    public ArrayList getFilteredArray(String name){
        ArrayList<UrineTestModel> filterresultList=new ArrayList<>();
        for(int i=0; i < ResultFragment.arrayListresultModel.size(); i++)
        {
            UrineTestModel s =ResultFragment.arrayListresultModel.get(i);
            if(name.equals(s.getRelativename()))
            {
                Log.e("aaaa","call"+s.getRelativename());
                Log.e("aaaa","call"+s.getRelationType());
                Log.e("aaaa","call"+s.getTestedTime());
                filterresultList.add(s);
                ////
                Intent intent = new Intent(getActivity(), FragmentMainActivityGraph.class);
                Bundle bundle = new Bundle();
                bundle.putString("key", "record");
                Log.e("key1",""+bundle);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        }
        return filterresultList;
    }
    public String currentWeek(String date){
        UrineWeekStartTime = Calendar.getInstance();
        UrineWeekStartTime.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        Urinesimpledateformat = new SimpleDateFormat("yyyy-MM-dd");
        date = Urinesimpledateformat.format(UrineWeekStartTime.getTime());
        Log.e("startweek:", "" + date);
        return date;
    }
   /* public  String convertStringToDate(String stringData)
            throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//yyyy-MM-dd'T'HH:mm:ss
        SimpleDateFormat output = new SimpleDateFormat("yyyy-MM-dd");
        Date data = sdf.parse(stringData);
        String formattedTime = output.format(data);
        return formattedTime;
    }
    public ArrayList getFilteredArrayByDate(String date) throws ParseException {
        ArrayList<UrineTestModel> filterListBydate=new ArrayList<>();
        for(int i=0; i < ResultFragment.arrayListresultModel.size(); i++)
        {
            UrineTestModel resultModel =ResultFragment.arrayListresultModel.get(i);
            String convertDate=convertStringToDate(resultModel.getTestedTime());
           Log.e("convertDate",""+convertDate);
            if(date.equals(convertDate))
            {
                Log.e("dddd","call"+resultModel.getRelativename());
                Log.e("dddd","call"+resultModel.getRelationType());
                Log.e("dddd","call"+resultModel.getTestedTime());
                Log.e("dddd","call"+resultModel.getRbcValue());

                filterListBydate.add(resultModel);

            }
        }
     return filterListBydate;
    }*/

}