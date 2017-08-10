package com.example.dell.spectrum.TapbarFragments;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.dell.spectrum.R;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
/**
 * Created by Vedas on 11/10/2016.
 */
public class ResultFragment extends Fragment {
    View view;
    ArrayList<String> name;
    ResultDataAdapter adapter;
    ListView lview;
    LinearLayout result_text;
    Button btn_down;
    RelativeLayout one,two,three;
   public static ArrayList<UrineTestModel>arrayListresultModel= new ArrayList<>();


    UrineTestModel resultModelone=new UrineTestModel();
    UrineTestModel resultModeltwo=new UrineTestModel();
    UrineTestModel urineTestModel3 =new UrineTestModel();
    UrineTestModel urineTestModel4 =new UrineTestModel();
    UrineTestModel urineTestModel5 =new UrineTestModel();
    UrineTestModel urineTestModel6 =new UrineTestModel();
    UrineTestModel urineTestModel7 =new UrineTestModel();
    UrineTestModel urineTestModel8 =new UrineTestModel();
    UrineTestModel urineTestModel9 =new UrineTestModel();
    UrineTestModel urineTestModel10 =new UrineTestModel();
    UrineTestModel urineTestkelvin11 =new UrineTestModel();
    UrineTestModel urineTestkelvin12 =new UrineTestModel();
    UrineTestModel urineTestkelvin13 =new UrineTestModel();
    UrineTestModel urineTestkelvin14 =new UrineTestModel();
    UrineTestModel urineTestkelvin15 =new UrineTestModel();
    UrineTestModel urineTestkelvin16 =new UrineTestModel();
    UrineTestModel urineTestkelvin17 =new UrineTestModel();
    UrineTestModel urineTestkelvin18 =new UrineTestModel();
    UrineTestModel urineTestkelvin19 =new UrineTestModel();
    UrineTestModel urineTestkelvin20 =new UrineTestModel();
    UrineTestModel urineTestkelvin21 =new UrineTestModel();
    UrineTestModel urineTestkelvin22 =new UrineTestModel();
    UrineTestModel urineTestkelvin23 =new UrineTestModel();
    UrineTestModel urineTestkelvin24 =new UrineTestModel();
    UrineTestModel urineTestkelvin25 =new UrineTestModel();
    UrineTestModel urineTestkelvin26 =new UrineTestModel();
    UrineTestModel urineTestkelvin27 =new UrineTestModel();
    UrineTestModel urineTestkelvin28 =new UrineTestModel();
    UrineTestModel urineTestkelvin29 =new UrineTestModel();
    UrineTestModel urineTestkelvin30=new UrineTestModel();
////////////////////////////////////////////////////////////////////////

    UrineTestModel urineTestModel11 =new UrineTestModel();
    UrineTestModel urineTestModel12 =new UrineTestModel();
    UrineTestModel urineTestModel13 =new UrineTestModel();
    UrineTestModel urineTestModel14 =new UrineTestModel();
    UrineTestModel urineTestModel15 =new UrineTestModel();
    UrineTestModel urineTestModel16 =new UrineTestModel();
    UrineTestModel resultobj17=new UrineTestModel();
    UrineTestModel resultobj18=new UrineTestModel();
    UrineTestModel resultobj19=new UrineTestModel();
    UrineTestModel resultobj20=new UrineTestModel();
    UrineTestModel resultobjaurora11=new UrineTestModel();
    UrineTestModel resultobjaurora12=new UrineTestModel();
    UrineTestModel resultobjaurora13=new UrineTestModel();
    UrineTestModel resultobjaurora14=new UrineTestModel();
    UrineTestModel resultobjaurora15=new UrineTestModel();
    UrineTestModel resultobjaurora16=new UrineTestModel();
    UrineTestModel resultobjaurora17=new UrineTestModel();
    UrineTestModel resultobjaurora18=new UrineTestModel();
    UrineTestModel resultobjaurora19=new UrineTestModel();
    UrineTestModel resultobjaurora20=new UrineTestModel();
    UrineTestModel resultobjaurora21=new UrineTestModel();
    UrineTestModel resultobjaurora22=new UrineTestModel();
    UrineTestModel resultobjaurora23=new UrineTestModel();
    UrineTestModel resultobjaurora24=new UrineTestModel();
    UrineTestModel resultobjaurora25=new UrineTestModel();
    UrineTestModel resultobjaurora26=new UrineTestModel();
    UrineTestModel resultobjaurora27=new UrineTestModel();
    UrineTestModel resultobjaurora28=new UrineTestModel();
    UrineTestModel resultobjaurora29=new UrineTestModel();
    UrineTestModel resultobjaurora30=new UrineTestModel();



    //////////////////////////////////////////////////////////////////////////
    UrineTestModel resultobj21=new UrineTestModel();
    UrineTestModel resultobj22=new UrineTestModel();
    UrineTestModel resultobj23=new UrineTestModel();
    UrineTestModel resultobj24=new UrineTestModel();
    UrineTestModel resultobj25=new UrineTestModel();
    UrineTestModel resultobj26=new UrineTestModel();
    UrineTestModel resultobj27=new UrineTestModel();
    UrineTestModel resultobj28=new UrineTestModel();
    UrineTestModel resultobj29=new UrineTestModel();
    UrineTestModel resultobj30=new UrineTestModel();
    UrineTestModel resultobjjames1=new UrineTestModel();
    UrineTestModel resultobjjames2=new UrineTestModel();
    UrineTestModel resultobjjames3=new UrineTestModel();
    UrineTestModel resultobjjames4=new UrineTestModel();
    UrineTestModel resultobjjames5=new UrineTestModel();
    UrineTestModel resultobjjames6=new UrineTestModel();
    UrineTestModel resultobjjames7=new UrineTestModel();
    UrineTestModel resultobjjames8=new UrineTestModel();
    UrineTestModel resultobjjames9=new UrineTestModel();
    UrineTestModel resultobjjames10=new UrineTestModel();
    UrineTestModel resultobjjames11=new UrineTestModel();
    UrineTestModel resultobjjames12=new UrineTestModel();
    UrineTestModel resultobjjames13=new UrineTestModel();
    UrineTestModel resultobjjames14=new UrineTestModel();
    UrineTestModel resultobjjames15=new UrineTestModel();
    UrineTestModel resultobjjames16=new UrineTestModel();
    UrineTestModel resultobjjames17=new UrineTestModel();
    UrineTestModel resultobjjames18=new UrineTestModel();
    UrineTestModel resultobjjames19=new UrineTestModel();
    UrineTestModel resultobjjames20=new UrineTestModel();

    ///////////////////////////////////////////////////////////////////////////////
    UrineTestModel resultobj31=new UrineTestModel();
    UrineTestModel resultobj32=new UrineTestModel();
    UrineTestModel resultobj33=new UrineTestModel();
    UrineTestModel resultobj34=new UrineTestModel();
    UrineTestModel resultobj35=new UrineTestModel();
    UrineTestModel resultobj36=new UrineTestModel();
    UrineTestModel resultobj37=new UrineTestModel();
    UrineTestModel resultobj38=new UrineTestModel();
    UrineTestModel resultobj39=new UrineTestModel();
    UrineTestModel resultobj40=new UrineTestModel();
    UrineTestModel resultobjsohia1=new UrineTestModel();
    UrineTestModel resultobjsohia2=new UrineTestModel();
    UrineTestModel resultobjsohia3=new UrineTestModel();
    UrineTestModel resultobjsohia4=new UrineTestModel();
    UrineTestModel resultobjsohia5=new UrineTestModel();
    UrineTestModel resultobjsohia6=new UrineTestModel();
    UrineTestModel resultobjsohia7=new UrineTestModel();
    UrineTestModel resultobjsohia8=new UrineTestModel();
    UrineTestModel resultobjsohia9=new UrineTestModel();
    UrineTestModel resultobjsohia10=new UrineTestModel();
    UrineTestModel resultobjsohia11=new UrineTestModel();
    UrineTestModel resultobjsohia12=new UrineTestModel();
    UrineTestModel resultobjsohia13=new UrineTestModel();
    UrineTestModel resultobjsohia14=new UrineTestModel();
    UrineTestModel resultobjsohia15=new UrineTestModel();
    UrineTestModel resultobjsohia16=new UrineTestModel();
    UrineTestModel resultobjsohia17=new UrineTestModel();
    UrineTestModel resultobjsohia18=new UrineTestModel();
    UrineTestModel resultobjsohia19=new UrineTestModel();
    UrineTestModel resultobjsohia20=new UrineTestModel();

    SimpleDateFormat formatter;
    String d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11,d12,d13,d14,d15,d16,d17,d18,d19,d20,d21,d22,d23,d24,d25,d26,d27,d28,d29,d30;
    ImageView imageView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_result, container, false);
        one = (RelativeLayout) view.findViewById(R.id.rl_one);
        two = (RelativeLayout) view.findViewById(R.id.rl_two);
        three = (RelativeLayout) view.findViewById(R.id.theee);
        result_text = (LinearLayout) view.findViewById(R.id.result_text);
        btn_down = (Button) view.findViewById(R.id.btn_down);
        btn_down.setOnClickListener(btnDownClick);
        name = new ArrayList<String>();
        name.add("Occult blood Rbc");
        name.add("Bilirubin");
        name.add("Urobilinogen");
        name.add("Ketones");
        name.add("Protine");
        name.add("Nitrite");
        name.add("Glucose");
        name.add("pH");
        name.add("SG");
        name.add("Lekocyte WBC");
///
        lview = (ListView) view.findViewById(R.id.listview_result);
        adapter = new ResultDataAdapter();
        lview.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        lview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.e("listcall","call");
                result_text.setVisibility(View.VISIBLE);
                one.setVisibility(View.GONE);
                two.setVisibility(View.GONE);
                three.setVisibility(View.GONE);
            }
        });
//
        formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
        Calendar c1 = Calendar.getInstance();
        c1.add(Calendar.DATE, -1);
        d1 = formatter.format(c1.getTime());
        Log.e("time1","call"+d1);
        //
        Calendar  c2 = Calendar.getInstance();
        c2.add(Calendar.DATE, -2);
        d2 = formatter.format(c2.getTime());
        Log.e("time1","call"+d2);
        //
        Calendar  c3 = Calendar.getInstance();
        c3.add(Calendar.DATE, -3);
        d3 = formatter.format(c3.getTime());
        Log.e("time1","call"+d3);
        //
        Calendar  c4 = Calendar.getInstance();
        c4.add(Calendar.DATE, -4);
        d4 = formatter.format(c4.getTime());
        Log.e("time1","call"+d4);

        Calendar  c5 = Calendar.getInstance();
        c5.add(Calendar.DATE, -5);
        d5 = formatter.format(c5.getTime());
        Log.e("time1","call"+d5);
        //
        Calendar  c6 = Calendar.getInstance();
        c6.add(Calendar.DATE, -6);
        d6 = formatter.format(c6.getTime());
        Log.e("time1","call"+d6);

        Calendar  c7 = Calendar.getInstance();
        c7.add(Calendar.DATE, -7);
        d7 = formatter.format(c7.getTime());
        Log.e("time1","call"+d7);
        //
        Calendar  c8 = Calendar.getInstance();
        c8.add(Calendar.DATE, -8);
        d8 = formatter.format(c8.getTime());
        Log.e("time1","call"+d8);
        //
        Calendar  c9 = Calendar.getInstance();
        c9.add(Calendar.DATE, -9);
        d9 = formatter.format(c9.getTime());
        Log.e("time1","call"+d9);
//
        Calendar  c10 = Calendar.getInstance();
        c10.add(Calendar.DATE, -10);
        d10 = formatter.format(c10.getTime());
        Log.e("time1","call"+d10);

        Calendar  c11 = Calendar.getInstance();
        c11.add(Calendar.DATE, -11);
        d11 = formatter.format(c11.getTime());
        Log.e("time1","call"+d11);

        Calendar  c12 = Calendar.getInstance();
        c12.add(Calendar.DATE, -12);
        d12 = formatter.format(c12.getTime());
        Log.e("time1","call"+d12);

        Calendar  c13 = Calendar.getInstance();
        c13.add(Calendar.DATE, -13);
        d13 = formatter.format(c13.getTime());
        Log.e("time1","call"+d13);


        Calendar  c14 = Calendar.getInstance();
        c14.add(Calendar.DATE, -14);
        d14 = formatter.format(c14.getTime());
        Log.e("time1","call"+d14);


        Calendar  c15 = Calendar.getInstance();
        c15.add(Calendar.DATE, -15);
        d15 = formatter.format(c15.getTime());
        Log.e("time1","call"+d15);

        Calendar  c16 = Calendar.getInstance();
        c16.add(Calendar.DATE, -16);
        d16 = formatter.format(c16.getTime());
        Log.e("time1","call"+d16);

        Calendar  c17 = Calendar.getInstance();
        c17.add(Calendar.DATE, -17);
        d17 = formatter.format(c17.getTime());
        Log.e("time1","call"+d17);

        Calendar  c18 = Calendar.getInstance();
        c18.add(Calendar.DATE, -18);
        d18 = formatter.format(c18.getTime());
        Log.e("time1","call"+d18);


        Calendar  c19 = Calendar.getInstance();
        c19.add(Calendar.DATE, -19);
        d19 = formatter.format(c19.getTime());
        Log.e("time1","call"+d19);

        Calendar  c20 = Calendar.getInstance();
        c20.add(Calendar.DATE, -20);
        d20 = formatter.format(c20.getTime());
        Log.e("time1","call"+d20);
////
        Calendar  c21 = Calendar.getInstance();
        c21.add(Calendar.DATE, -21);
        d21 = formatter.format(c21.getTime());
        Log.e("time1","call"+d21);

        Calendar  c22 = Calendar.getInstance();
        c22.add(Calendar.DATE, -22);
        d22 = formatter.format(c22.getTime());
        Log.e("time1","call"+d22);

        Calendar  c23 = Calendar.getInstance();
        c23.add(Calendar.DATE, -23);
        d23 = formatter.format(c23.getTime());
        Log.e("time1","call"+d23);

        Calendar  c24 = Calendar.getInstance();
        c24.add(Calendar.DATE, -24);
        d24 = formatter.format(c24.getTime());
        Log.e("time1","call"+d24);


        Calendar  c25 = Calendar.getInstance();
        c25.add(Calendar.DATE, -25);
        d25 = formatter.format(c25.getTime());
        Log.e("time1","call"+d25);

        Calendar  c26 = Calendar.getInstance();
        c26.add(Calendar.DATE, -26);
        d26 = formatter.format(c26.getTime());
        Log.e("time1","call"+d26);

        Calendar  c27 = Calendar.getInstance();
        c27.add(Calendar.DATE, -27);
        d27 = formatter.format(c27.getTime());
        Log.e("time1","call"+d27);

        Calendar  c28 = Calendar.getInstance();
        c28.add(Calendar.DATE, -28);
        d28 = formatter.format(c28.getTime());
        Log.e("time1","call"+d28);

        Calendar  c29 = Calendar.getInstance();
        c29.add(Calendar.DATE, -29);
        d29 = formatter.format(c29.getTime());
        Log.e("time1","call"+d29);

        Calendar  c30 = Calendar.getInstance();
        c30.add(Calendar.DATE, -30);
        d30 = formatter.format(c30.getTime());
        Log.e("time1","call"+d30);


/*-----------------------------------------------------*/
        arrayListresultModel.clear();
        resultModelone.setRbcValue(5.0f);//0-7
        resultModelone.setBillirubinValue(0.5f);//0-0.4
        resultModelone.setUroboliogenValue(3.0f);//0.1-2.9
        resultModelone.setKetonesValue(4.0f);//0-4
        resultModelone.setProteinValue(27.0f);//0-29
        resultModelone.setNitriteValue(0f);//0-0.04
        resultModelone.setGlucoseValue(700.0f);//0-49
        resultModelone.setPhValue(8f);//4.5-8.5
        resultModelone.setSgValue(1f);//1.008-1.029
        resultModelone.setLeukocyteValue(5.0f);//0-17
        resultModelone.setRelativename("Kevin");
        resultModelone.setRelationType("Me");
        resultModelone.setTestedTime(d1);
        arrayListresultModel.add(resultModelone);
        Log.e("arraylistone","call"+arrayListresultModel.size());
        /////
        resultModeltwo.setRbcValue(6.0f);//0-7
        resultModeltwo.setBillirubinValue(0.3f);//0-0.4
        resultModeltwo.setUroboliogenValue(0.9f);//0.1-2.9
        resultModeltwo.setKetonesValue(3.0f);//0-4
        resultModeltwo.setProteinValue(7.0f);//0-29
        resultModeltwo.setNitriteValue(0.03f);//0-0.04
        resultModeltwo.setGlucoseValue(700.0f);//0-49
        resultModeltwo.setPhValue(8.2f);//4.5-8.5
        resultModeltwo.setSgValue(1.002f);//1.008-1.029
        resultModeltwo.setLeukocyteValue(5.0f);//0-17
        resultModeltwo.setRelativename("kevin");
        resultModeltwo.setRelationType("me");
        resultModeltwo.setTestedTime(d2);
        arrayListresultModel.add(resultModeltwo);
        Log.e("arraylisttwo","call"+arrayListresultModel.size());
        /////
        urineTestModel3.setRbcValue(10.0f);//0-7
        urineTestModel3.setBillirubinValue(0.9f);//0-0.4
        urineTestModel3.setUroboliogenValue(3.9f);//0.1-2.9
        urineTestModel3.setKetonesValue(7.0f);//0-4
        urineTestModel3.setProteinValue(47.0f);//0-29
        urineTestModel3.setNitriteValue(0.05f);//0-0.04
        urineTestModel3.setGlucoseValue(1400.0f);//0-49
        urineTestModel3.setPhValue(7.6f);//4.5-8.5
        urineTestModel3.setSgValue(13.0f);//1.008-1.029
        urineTestModel3.setLeukocyteValue(18.0f);//0-17
        urineTestModel3.setRelativename("Kevin");
        urineTestModel3.setRelationType("Me");
        urineTestModel3.setTestedTime(d3);
        arrayListresultModel.add(urineTestModel3);
        Log.e("arraylist3","call"+arrayListresultModel.size());
        /////
        urineTestModel4.setRbcValue(2.0f);//0-7
        urineTestModel4.setBillirubinValue(0.1f);//0-0.4
        urineTestModel4.setUroboliogenValue(0.9f);//0.1-2.9
        urineTestModel4.setKetonesValue(2.0f);//0-4
        urineTestModel4.setProteinValue(1.0f);//0-29
        urineTestModel4.setNitriteValue(0.01f);//0-0.04
        urineTestModel4.setGlucoseValue(21.0f);//0-49
        urineTestModel4.setPhValue(4.6f);//4.5-8.5
        urineTestModel4.setSgValue(1.008f);//1.008-1.029
        urineTestModel4.setLeukocyteValue(4.0f);//0-17
        urineTestModel4.setRelativename("Kevin");
        urineTestModel4.setRelationType("Me");
        urineTestModel4.setTestedTime(d4);
        arrayListresultModel.add(urineTestModel4);
        Log.e("arraylist4","call"+arrayListresultModel.size());
        /////
        urineTestModel5.setRbcValue(7.0f);//0-7
        urineTestModel5.setBillirubinValue(0.4f);//0-0.4
        urineTestModel5.setUroboliogenValue(2.9f);//0.1-2.9
        urineTestModel5.setKetonesValue(4.0f);//0-4
        urineTestModel5.setProteinValue(29.0f);//0-29
        urineTestModel5.setNitriteValue(0.04f);//0-0.04
        urineTestModel5.setGlucoseValue(48.0f);//0-49
        urineTestModel5.setPhValue(8.5f);//4.5-8.5
        urineTestModel5.setSgValue(1.008f);//1.008-1.029
        urineTestModel5.setLeukocyteValue(16.0f);//0-17
        urineTestModel5.setRelativename("Kevin");
        urineTestModel5.setRelationType("Me");
        urineTestModel5.setTestedTime(d5);
        arrayListresultModel.add(urineTestModel5);
        Log.e("arraylist5","call"+arrayListresultModel.size());
        /////
        urineTestModel6.setRbcValue(2.0f);//0-7
        urineTestModel6.setBillirubinValue(0.1f);//0-0.4
        urineTestModel6.setUroboliogenValue(0.2f);//0.1-2.9
        urineTestModel6.setKetonesValue(2.0f);//0-4
        urineTestModel6.setProteinValue(1.0f);//0-29
        urineTestModel6.setNitriteValue(0.01f);//0-0.04
        urineTestModel6.setGlucoseValue(21.0f);//0-49
        urineTestModel6.setPhValue(4.6f);//4.5-8.5
        urineTestModel6.setSgValue(1.008f);//1.008-1.029
        urineTestModel6.setLeukocyteValue(4.0f);//0-17
        urineTestModel6.setRelativename("Kevin");
        urineTestModel6.setRelationType("Me");
        urineTestModel6.setTestedTime(d6);
        arrayListresultModel.add(urineTestModel6);
        Log.e("arraylist6","call"+arrayListresultModel.size());
        /////
        urineTestModel7.setRbcValue(2.0f);//0-7
        urineTestModel7.setBillirubinValue(0.1f);//0-0.4
        urineTestModel7.setUroboliogenValue(0.1f);//0.1-2.9
        urineTestModel7.setKetonesValue(2.0f);//0-4
        urineTestModel7.setProteinValue(1.0f);//0-29
        urineTestModel7.setNitriteValue(0.01f);//0-0.04
        urineTestModel7.setGlucoseValue(21.0f);//0-49
        urineTestModel7.setPhValue(4.6f);//4.5-8.5
        urineTestModel7.setSgValue(1.008f);//1.008-1.029
        urineTestModel7.setLeukocyteValue(4.0f);//0-17
        urineTestModel7.setRelativename("Kevin");
        urineTestModel7.setRelationType("Me");
        urineTestModel7.setTestedTime(d7);
        arrayListresultModel.add(urineTestModel7);
        Log.e("arraylist7","call"+arrayListresultModel.size());
        /////
        urineTestModel8.setRbcValue(2.0f);//0-7
        urineTestModel8.setBillirubinValue(0.1f);//0-0.4
        urineTestModel8.setUroboliogenValue(0.1f);//0.1-2.9
        urineTestModel8.setKetonesValue(2.0f);//0-4
        urineTestModel8.setProteinValue(1.0f);//0-29
        urineTestModel8.setNitriteValue(0.01f);//0-0.04
        urineTestModel8.setGlucoseValue(21.0f);//0-49
        urineTestModel8.setPhValue(4.6f);//4.5-8.5
        urineTestModel8.setSgValue(1.008f);//1.008-1.029
        urineTestModel8.setLeukocyteValue(4.0f);//0-17
        urineTestModel8.setRelativename("Kevin");
        urineTestModel8.setRelationType("Me");
        urineTestModel8.setTestedTime(d8);
        arrayListresultModel.add(urineTestModel8);
        Log.e("arraylist8","call"+arrayListresultModel.size());
        /////
        urineTestModel9.setRbcValue(16.0f);//0-7
        urineTestModel9.setBillirubinValue(0.9f);//0-0.4
        urineTestModel9.setUroboliogenValue(2.1f);//0.1-2.9
        urineTestModel9.setKetonesValue(5.0f);//0-4
        urineTestModel9.setProteinValue(26.0f);//0-29
        urineTestModel9.setNitriteValue(0.05f);//0-0.04
        urineTestModel9.setGlucoseValue(44.0f);//0-49
        urineTestModel9.setPhValue(5.6f);//4.5-8.5
        urineTestModel9.setSgValue(1.028f);//1.008-1.029
        urineTestModel9.setLeukocyteValue(14.0f);//0-17
        urineTestModel9.setRelativename("Kevin");
        urineTestModel9.setRelationType("Me");
        urineTestModel9.setTestedTime(d9);
        arrayListresultModel.add(urineTestModel9);
        Log.e("arraylist9","call"+arrayListresultModel.size());
        /////
        urineTestModel10.setRbcValue(110.0f);//0-7
        urineTestModel10.setBillirubinValue(1.9f);//0-0.4
        urineTestModel10.setUroboliogenValue(6.1f);//0.1-2.9
        urineTestModel10.setKetonesValue(60.0f);//0-4
        urineTestModel10.setProteinValue(106.0f);//0-29
        urineTestModel10.setNitriteValue(0.04f);//0-0.04
        urineTestModel10.setGlucoseValue(110.0f);//0-49
        urineTestModel10.setPhValue(5.6f);//4.5-8.5
        urineTestModel10.setSgValue(1.015f);//1.008-1.029
        urineTestModel10.setLeukocyteValue(14.0f);//0-17
        urineTestModel10.setRelativename("Kevin");
        urineTestModel10.setRelationType("Me");
        urineTestModel10.setTestedTime(d10);
        arrayListresultModel.add(urineTestModel10);
        Log.e("arraylist10","call"+arrayListresultModel.size());
        ////
        urineTestkelvin11.setRbcValue(90.0f);//0-7
        urineTestkelvin11.setBillirubinValue(0.4f);//0-0.4
        urineTestkelvin11.setUroboliogenValue(5.1f);//0.1-2.9
        urineTestkelvin11.setKetonesValue(50.0f);//0-4
        urineTestkelvin11.setProteinValue(100.0f);//0-29
        urineTestkelvin11.setNitriteValue(0.04f);//0-0.04
        urineTestkelvin11.setGlucoseValue(100.0f);//0-49
        urineTestkelvin11.setPhValue(4.6f);//4.5-8.5
        urineTestkelvin11.setSgValue(2.015f);//1.008-1.029
        urineTestkelvin11.setLeukocyteValue(10.0f);//0-17
        urineTestkelvin11.setRelativename("Kevin");
        urineTestkelvin11.setRelationType("Me");
        urineTestkelvin11.setTestedTime(d11);
        arrayListresultModel.add(urineTestkelvin11);
        Log.e("arraylist11","call"+arrayListresultModel.size());
        ///
        urineTestkelvin12.setRbcValue(120.0f);//0-7
        urineTestkelvin12.setBillirubinValue(0.2f);//0-0.4
        urineTestkelvin12.setUroboliogenValue(2.1f);//0.1-2.9
        urineTestkelvin12.setKetonesValue(6.0f);//0-4
        urineTestkelvin12.setProteinValue(150.0f);//0-29
        urineTestkelvin12.setNitriteValue(0.04f);//0-0.04
        urineTestkelvin12.setGlucoseValue(118.0f);//0-49
        urineTestkelvin12.setPhValue(3.6f);//4.5-8.5
        urineTestkelvin12.setSgValue(3.015f);//1.008-1.029
        urineTestkelvin12.setLeukocyteValue(16.0f);//0-17
        urineTestkelvin12.setRelativename("Kevin");
        urineTestkelvin12.setRelationType("Me");
        urineTestkelvin12.setTestedTime(d12);
        arrayListresultModel.add( urineTestkelvin12);
        Log.e("arraylist12","call"+arrayListresultModel.size());
        ////
        urineTestkelvin13.setRbcValue(70.0f);//0-7
        urineTestkelvin13.setBillirubinValue(0.7f);//0-0.4
        urineTestkelvin13.setUroboliogenValue(7.1f);//0.1-2.9
        urineTestkelvin13.setKetonesValue(30.0f);//0-4
        urineTestkelvin13.setProteinValue(159.0f);//0-29
        urineTestkelvin13.setNitriteValue(2.04f);//0-0.04
        urineTestkelvin13.setGlucoseValue(187.0f);//0-49
        urineTestkelvin13.setPhValue(9.6f);//4.5-8.5
        urineTestkelvin13.setSgValue(8.015f);//1.008-1.029
        urineTestkelvin13.setLeukocyteValue(2.0f);//0-17
        urineTestkelvin13.setRelativename("Kevin");
        urineTestkelvin13.setRelationType("Me");
        urineTestkelvin13.setTestedTime(d13);
        arrayListresultModel.add(urineTestkelvin13);
        Log.e("arraylist13","call"+arrayListresultModel.size());
        //////
        urineTestkelvin14.setRbcValue(10.0f);//0-7
        urineTestkelvin14.setBillirubinValue(1.9f);//0-0.4
        urineTestkelvin14.setUroboliogenValue(2.1f);//0.1-2.9
        urineTestkelvin14.setKetonesValue(60.0f);//0-4
        urineTestkelvin14.setProteinValue(196.0f);//0-29
        urineTestkelvin14.setNitriteValue(0.04f);//0-0.04
        urineTestkelvin14.setGlucoseValue(110.0f);//0-49
        urineTestkelvin14.setPhValue(5.6f);//4.5-8.5
        urineTestkelvin14.setSgValue(8.015f);//1.008-1.029
        urineTestkelvin14.setLeukocyteValue(19.0f);//0-17
        urineTestkelvin14.setRelativename("Kevin");
        urineTestkelvin14.setRelationType("Me");
        urineTestkelvin14.setTestedTime(d14);
        arrayListresultModel.add(urineTestkelvin14);
        Log.e("arraylist14","call"+arrayListresultModel.size());
        ////
        urineTestkelvin15.setRbcValue(10.0f);//0-7
        urineTestkelvin15.setBillirubinValue(1.9f);//0-0.4
        urineTestkelvin15.setUroboliogenValue(6.1f);//0.1-2.9
        urineTestkelvin15.setKetonesValue(60.0f);//0-4
        urineTestkelvin15.setProteinValue(106.0f);//0-29
        urineTestkelvin15.setNitriteValue(0.04f);//0-0.04
        urineTestkelvin15.setGlucoseValue(100.0f);//0-49
        urineTestkelvin15.setPhValue(4.6f);//4.5-8.5
        urineTestkelvin15.setSgValue(2.015f);//1.008-1.029
        urineTestkelvin15.setLeukocyteValue(17.0f);//0-17
        urineTestkelvin15.setRelativename("Kevin");
        urineTestkelvin15.setRelationType("Me");
        urineTestkelvin15.setTestedTime(d15);
        arrayListresultModel.add(urineTestkelvin15);
        Log.e("arraylist15","call"+arrayListresultModel.size());
        /////
        urineTestkelvin16.setRbcValue(110.0f);//0-7
        urineTestkelvin16.setBillirubinValue(1.9f);//0-0.4
        urineTestkelvin16.setUroboliogenValue(6.1f);//0.1-2.9
        urineTestkelvin16.setKetonesValue(50.0f);//0-4
        urineTestkelvin16.setProteinValue(16.0f);//0-29
        urineTestkelvin16.setNitriteValue(0.04f);//0-0.04
        urineTestkelvin16.setGlucoseValue(10.0f);//0-49
        urineTestkelvin16.setPhValue(5.6f);//4.5-8.5
        urineTestkelvin16.setSgValue(5.015f);//1.008-1.029
        urineTestkelvin16.setLeukocyteValue(14.0f);//0-17
        urineTestkelvin16.setRelativename("Kevin");
        urineTestkelvin16.setRelationType("Me");
        urineTestkelvin16.setTestedTime(d15);
        arrayListresultModel.add(urineTestkelvin16);
        Log.e("arraylist16","call"+arrayListresultModel.size());
        /////
        urineTestkelvin17.setRbcValue(170.0f);//0-7
        urineTestkelvin17.setBillirubinValue(1.9f);//0-0.4
        urineTestkelvin17.setUroboliogenValue(6.1f);//0.1-2.9
        urineTestkelvin17.setKetonesValue(60.0f);//0-4
        urineTestkelvin17.setProteinValue(136.0f);//0-29
        urineTestkelvin17.setNitriteValue(0.04f);//0-0.04
        urineTestkelvin17.setGlucoseValue(110.0f);//0-49
        urineTestkelvin17.setPhValue(7.6f);//4.5-8.5
        urineTestkelvin17.setSgValue(3.015f);//1.008-1.029
        urineTestkelvin17.setLeukocyteValue(13.0f);//0-17
        urineTestkelvin17.setRelativename("Kevin");
        urineTestkelvin17.setRelationType("Me");
        urineTestkelvin17.setTestedTime(d17);
        arrayListresultModel.add(urineTestkelvin17);
        Log.e("arraylist17","call"+arrayListresultModel.size());
        ////
        urineTestkelvin18.setRbcValue(120.0f);//0-7
        urineTestkelvin18.setBillirubinValue(1.9f);//0-0.4
        urineTestkelvin18.setUroboliogenValue(6.1f);//0.1-2.9
        urineTestkelvin18.setKetonesValue(60.0f);//0-4
        urineTestkelvin18.setProteinValue(106.0f);//0-29
        urineTestkelvin18.setNitriteValue(0.04f);//0-0.04
        urineTestkelvin18.setGlucoseValue(110.0f);//0-49
        urineTestkelvin18.setPhValue(5.6f);//4.5-8.5
        urineTestkelvin18.setSgValue(1.015f);//1.008-1.029
        urineTestkelvin18.setLeukocyteValue(16.0f);//0-17
        urineTestkelvin18.setRelativename("Kevin");
        urineTestkelvin18.setRelationType("Me");
        urineTestkelvin18.setTestedTime(d18);
        arrayListresultModel.add(urineTestkelvin18);
        Log.e("arraylist18","call"+arrayListresultModel.size());
        ////
        urineTestkelvin19.setRbcValue(110.0f);//0-7
        urineTestkelvin19.setBillirubinValue(1.9f);//0-0.4
        urineTestkelvin19.setUroboliogenValue(3.1f);//0.1-2.9
        urineTestkelvin19.setKetonesValue(60.0f);//0-4
        urineTestkelvin19.setProteinValue(106.0f);//0-29
        urineTestkelvin19.setNitriteValue(0.04f);//0-0.04
        urineTestkelvin19.setGlucoseValue(110.0f);//0-49
        urineTestkelvin19.setPhValue(5.6f);//4.5-8.5
        urineTestkelvin19.setSgValue(2.015f);//1.008-1.029
        urineTestkelvin19.setLeukocyteValue(14.0f);//0-17
        urineTestkelvin19.setRelativename("Kevin");
        urineTestkelvin19.setRelationType("Me");
        urineTestkelvin19.setTestedTime(d19);
        arrayListresultModel.add(urineTestkelvin19);
        Log.e("arraylist19","call"+arrayListresultModel.size());
        /////
        urineTestkelvin20.setRbcValue(0.0f);//0-7
        urineTestkelvin20.setBillirubinValue(1.9f);//0-0.4
        urineTestkelvin20.setUroboliogenValue(6.1f);//0.1-2.9
        urineTestkelvin20.setKetonesValue(50.0f);//0-4
        urineTestkelvin20.setProteinValue(70.0f);//0-29
        urineTestkelvin20.setNitriteValue(0.04f);//0-0.04
        urineTestkelvin20.setGlucoseValue(110.0f);//0-49
        urineTestkelvin20.setPhValue(5.6f);//4.5-8.5
        urineTestkelvin20.setSgValue(8.015f);//1.008-1.029
        urineTestkelvin20.setLeukocyteValue(14.0f);//0-17
        urineTestkelvin20.setRelativename("Kevin");
        urineTestkelvin20.setRelationType("Me");
        urineTestkelvin20.setTestedTime(d20);
        arrayListresultModel.add(urineTestkelvin20);
        Log.e("arraylist20","call"+arrayListresultModel.size());
        ////
        urineTestkelvin21.setRbcValue(50.0f);//0-7
        urineTestkelvin21.setBillirubinValue(1.2f);//0-0.4
        urineTestkelvin21.setUroboliogenValue(6.1f);//0.1-2.9
        urineTestkelvin21.setKetonesValue(60.0f);//0-4
        urineTestkelvin21.setProteinValue(56.0f);//0-29
        urineTestkelvin21.setNitriteValue(0.04f);//0-0.04
        urineTestkelvin21.setGlucoseValue(19.0f);//0-49
        urineTestkelvin21.setPhValue(3.6f);//4.5-8.5
        urineTestkelvin21.setSgValue(8.014f);//1.008-1.029
        urineTestkelvin21.setLeukocyteValue(10.0f);//0-17
        urineTestkelvin21.setRelativename("Kevin");
        urineTestkelvin21.setRelationType("Me");
        urineTestkelvin21.setTestedTime(d21);
        arrayListresultModel.add(urineTestkelvin21);
        Log.e("arraylist21","call"+arrayListresultModel.size());
        ////
        urineTestkelvin22.setRbcValue(40.0f);//0-7
        urineTestkelvin22.setBillirubinValue(0.3f);//0-0.4
        urineTestkelvin22.setUroboliogenValue(6.1f);//0.1-2.9
        urineTestkelvin22.setKetonesValue(40.0f);//0-4
        urineTestkelvin22.setProteinValue(60.0f);//0-29
        urineTestkelvin22.setNitriteValue(0.04f);//0-0.04
        urineTestkelvin22.setGlucoseValue(80.0f);//0-49
        urineTestkelvin22.setPhValue(5.6f);//4.5-8.5
        urineTestkelvin22.setSgValue(1.02f);//1.008-1.029
        urineTestkelvin22.setLeukocyteValue(14.0f);//0-17
        urineTestkelvin22.setRelativename("Kevin");
        urineTestkelvin22.setRelationType("Me");
        urineTestkelvin22.setTestedTime(d22);
        arrayListresultModel.add(urineTestkelvin22);
        Log.e("arraylist22","call"+arrayListresultModel.size());
        ////
        urineTestkelvin23.setRbcValue(110.0f);//0-7
        urineTestkelvin23.setBillirubinValue(0.4f);//0-0.4
        urineTestkelvin23.setUroboliogenValue(6.1f);//0.1-2.9
        urineTestkelvin23.setKetonesValue(60.0f);//0-4
        urineTestkelvin23.setProteinValue(106.0f);//0-29
        urineTestkelvin23.setNitriteValue(0.04f);//0-0.04
        urineTestkelvin23.setGlucoseValue(110.0f);//0-49
        urineTestkelvin23.setPhValue(6.6f);//4.5-8.5
        urineTestkelvin23.setSgValue(1.01f);//1.008-1.029
        urineTestkelvin23.setLeukocyteValue(14.0f);//0-17
        urineTestkelvin23.setRelativename("Kevin");
        urineTestkelvin23.setRelationType("Me");
        urineTestkelvin23.setTestedTime(d23);
        arrayListresultModel.add(urineTestkelvin23);
        Log.e("arraylist23","call"+arrayListresultModel.size());
        ////
        urineTestkelvin24.setRbcValue(60.0f);//0-7
        urineTestkelvin24.setBillirubinValue(0.6f);//0-0.4
        urineTestkelvin24.setUroboliogenValue(6.1f);//0.1-2.9
        urineTestkelvin24.setKetonesValue(20.0f);//0-4
        urineTestkelvin24.setProteinValue(156.0f);//0-29
        urineTestkelvin24.setNitriteValue(0.04f);//0-0.04
        urineTestkelvin24.setGlucoseValue(110.0f);//0-49
        urineTestkelvin24.setPhValue(5.6f);//4.5-8.5
        urineTestkelvin24.setSgValue(1.15f);//1.008-1.029
        urineTestkelvin24.setLeukocyteValue(14.0f);//0-17
        urineTestkelvin24.setRelativename("Kevin");
        urineTestkelvin24.setRelationType("Me");
        urineTestkelvin24.setTestedTime(d24);
        arrayListresultModel.add(urineTestkelvin24);
        Log.e("arraylist24","call"+arrayListresultModel.size());
        ////
        urineTestkelvin25.setRbcValue(40.0f);//0-7
        urineTestkelvin25.setBillirubinValue(0.2f);//0-0.4
        urineTestkelvin25.setUroboliogenValue(6.1f);//0.1-2.9
        urineTestkelvin25.setKetonesValue(60.0f);//0-4
        urineTestkelvin25.setProteinValue(86.0f);//0-29
        urineTestkelvin25.setNitriteValue(0.04f);//0-0.04
        urineTestkelvin25.setGlucoseValue(110.0f);//0-49
        urineTestkelvin25.setPhValue(5.6f);//4.5-8.5
        urineTestkelvin25.setSgValue(1.01f);//1.008-1.029
        urineTestkelvin25.setLeukocyteValue(14.0f);//0-17
        urineTestkelvin25.setRelativename("Kevin");
        urineTestkelvin25.setRelationType("Me");
        urineTestkelvin25.setTestedTime(d25);
        arrayListresultModel.add(urineTestkelvin25);
        Log.e("arraylist25","call"+arrayListresultModel.size());
        ////
        urineTestkelvin26.setRbcValue(70.0f);//0-7
        urineTestkelvin26.setBillirubinValue(0.2f);//0-0.4
        urineTestkelvin26.setUroboliogenValue(6.1f);//0.1-2.9
        urineTestkelvin26.setKetonesValue(60.0f);//0-4
        urineTestkelvin26.setProteinValue(10.0f);//0-29
        urineTestkelvin26.setNitriteValue(0.04f);//0-0.04
        urineTestkelvin26.setGlucoseValue(190.0f);//0-49
        urineTestkelvin26.setPhValue(5.6f);//4.5-8.5
        urineTestkelvin26.setSgValue(1.035f);//1.008-1.029
        urineTestkelvin26.setLeukocyteValue(14.0f);//0-17
        urineTestkelvin26.setRelativename("Kevin");
        urineTestkelvin26.setRelationType("Me");
        urineTestkelvin26.setTestedTime(d26);
        arrayListresultModel.add(urineTestkelvin26);
        Log.e("arraylist26","call"+arrayListresultModel.size());
        ////
        urineTestkelvin27.setRbcValue(120.0f);//0-7
        urineTestkelvin27.setBillirubinValue(0.8f);//0-0.4
        urineTestkelvin27.setUroboliogenValue(6.1f);//0.1-2.9
        urineTestkelvin27.setKetonesValue(50.0f);//0-4
        urineTestkelvin27.setProteinValue(106.0f);//0-29
        urineTestkelvin27.setNitriteValue(0.04f);//0-0.04
        urineTestkelvin27.setGlucoseValue(110.0f);//0-49
        urineTestkelvin27.setPhValue(5.6f);//4.5-8.5
        urineTestkelvin27.setSgValue(1.025f);//1.008-1.029
        urineTestkelvin27.setLeukocyteValue(14.0f);//0-17
        urineTestkelvin27.setRelativename("Kevin");
        urineTestkelvin27.setRelationType("Me");
        urineTestkelvin27.setTestedTime(d20);
        arrayListresultModel.add(urineTestkelvin27);
        Log.e("arraylist27","call"+arrayListresultModel.size());
        ////
        urineTestkelvin28.setRbcValue(10.0f);//0-7
        urineTestkelvin28.setBillirubinValue(0.2f);//0-0.4
        urineTestkelvin28.setUroboliogenValue(6.1f);//0.1-2.9
        urineTestkelvin28.setKetonesValue(50.0f);//0-4
        urineTestkelvin28.setProteinValue(30.0f);//0-29
        urineTestkelvin28.setNitriteValue(0.04f);//0-0.04
        urineTestkelvin28.setGlucoseValue(70.0f);//0-49
        urineTestkelvin28.setPhValue(7.6f);//4.5-8.5
        urineTestkelvin28.setSgValue(1.025f);//1.008-1.029
        urineTestkelvin28.setLeukocyteValue(16.0f);//0-17
        urineTestkelvin28.setRelativename("Kevin");
        urineTestkelvin28.setRelationType("Me");
        urineTestkelvin28.setTestedTime(d28);
        arrayListresultModel.add(urineTestkelvin28);
        Log.e("arraylist28","call"+arrayListresultModel.size());
        ////
        urineTestkelvin29.setRbcValue(10.0f);//0-7
        urineTestkelvin29.setBillirubinValue(0.1f);//0-0.4
        urineTestkelvin29.setUroboliogenValue(6.1f);//0.1-2.9
        urineTestkelvin29.setKetonesValue(68.0f);//0-4
        urineTestkelvin29.setProteinValue(156.0f);//0-29
        urineTestkelvin29.setNitriteValue(0.04f);//0-0.04
        urineTestkelvin29.setGlucoseValue(140.0f);//0-49
        urineTestkelvin29.setPhValue(5.6f);//4.5-8.5
        urineTestkelvin29.setSgValue(1.015f);//1.008-1.029
        urineTestkelvin29.setLeukocyteValue(12.0f);//0-17
        urineTestkelvin29.setRelativename("Kevin");
        urineTestkelvin29.setRelationType("Me");
        urineTestkelvin29.setTestedTime(d29);
        arrayListresultModel.add(urineTestkelvin29);
        Log.e("arraylist29","call"+arrayListresultModel.size());
        ////
        urineTestkelvin30.setRbcValue(50.0f);//0-7
        urineTestkelvin30.setBillirubinValue(0.20f);//0-0.4
        urineTestkelvin30.setUroboliogenValue(6.1f);//0.1-2.9
        urineTestkelvin30.setKetonesValue(60.0f);//0-4
        urineTestkelvin30.setProteinValue(106.0f);//0-29
        urineTestkelvin30.setNitriteValue(0.04f);//0-0.04
        urineTestkelvin30.setGlucoseValue(160.0f);//0-49
        urineTestkelvin30.setPhValue(5.6f);//4.5-8.5
        urineTestkelvin30.setSgValue(1.05f);//1.008-1.029
        urineTestkelvin30.setLeukocyteValue(16.0f);//0-17
        urineTestkelvin30.setRelativename("Kevin");
        urineTestkelvin30.setRelationType("Me");
        urineTestkelvin30.setTestedTime(d30);
        arrayListresultModel.add(urineTestkelvin30);
        Log.e("arraylist30","call"+arrayListresultModel.size());

        //////////////////////////////////////////////////////////////////////////////////////
        urineTestModel11.setRbcValue(7.0f);//0-7
        urineTestModel11.setBillirubinValue(0.69f);//0-0.4
        urineTestModel11.setUroboliogenValue(2.1f);//0.1-2.9
        urineTestModel11.setKetonesValue(5.0f);//0-4
        urineTestModel11.setProteinValue(26.0f);//0-29
        urineTestModel11.setNitriteValue(0.03f);//0-0.04
        urineTestModel11.setGlucoseValue(44.0f);//0-49
        urineTestModel11.setPhValue(7.6f);//4.5-8.5
        urineTestModel11.setSgValue(1.028f);//1.008-1.029
        urineTestModel11.setLeukocyteValue(14.0f);//0-17
        urineTestModel11.setRelativename("Aurora");
        urineTestModel11.setRelationType("Daughter");
        urineTestModel11.setTestedTime(d1);
        arrayListresultModel.add(urineTestModel11);
        Log.e("arraylist11","call"+arrayListresultModel.size());
        /////
        urineTestModel12.setRbcValue(6.0f);//0-7
        urineTestModel12.setBillirubinValue(0.39f);//0-0.4
        urineTestModel12.setUroboliogenValue(2.1f);//0.1-2.9
        urineTestModel12.setKetonesValue(5.0f);//0-4
        urineTestModel12.setProteinValue(26.0f);//0-29
        urineTestModel12.setNitriteValue(0.04f);//0-0.04
        urineTestModel12.setGlucoseValue(44.0f);//0-49
        urineTestModel12.setPhValue(7.6f);//4.5-8.5
        urineTestModel12.setSgValue(1.028f);//1.008-1.029
        urineTestModel12.setLeukocyteValue(14.0f);//0-17
        urineTestModel12.setRelativename("Aurora");
        urineTestModel12.setRelationType("Daughter");
        urineTestModel12.setTestedTime(d2);
        arrayListresultModel.add(urineTestModel12);
        Log.e("arraylist12","call"+arrayListresultModel.size());
        /////
        urineTestModel13.setRbcValue(3.0f);//0-7
        urineTestModel13.setBillirubinValue(0.39f);//0-0.4
        urineTestModel13.setUroboliogenValue(2.1f);//0.1-2.9
        urineTestModel13.setKetonesValue(5.0f);//0-4
        urineTestModel13.setProteinValue(26.0f);//0-29
        urineTestModel13.setNitriteValue(0.01f);//0-0.04
        urineTestModel13.setGlucoseValue(44.0f);//0-49
        urineTestModel13.setPhValue(5.6f);//4.5-8.5
        urineTestModel13.setSgValue(1.028f);//1.008-1.029
        urineTestModel13.setLeukocyteValue(14.0f);//0-17
        urineTestModel13.setRelativename("Aurora");
        urineTestModel13.setRelationType("Daughter");
        urineTestModel13.setTestedTime(d3);
        arrayListresultModel.add(urineTestModel13);
        Log.e("arraylist12","call"+arrayListresultModel.size());
        /////
        urineTestModel14.setRbcValue(5.0f);//0-7
        urineTestModel14.setBillirubinValue(0.19f);//0-0.4
        urineTestModel14.setUroboliogenValue(2.1f);//0.1-2.9
        urineTestModel14.setKetonesValue(5.0f);//0-4
        urineTestModel14.setProteinValue(26.0f);//0-29
        urineTestModel14.setNitriteValue(0.02f);//0-0.04
        urineTestModel14.setGlucoseValue(44.0f);//0-49
        urineTestModel14.setPhValue(6.6f);//4.5-8.5
        urineTestModel14.setSgValue(1.028f);//1.008-1.029
        urineTestModel14.setLeukocyteValue(14.0f);//0-17
        urineTestModel14.setRelativename("Aurora");
        urineTestModel14.setRelationType("Daughter");
        urineTestModel14.setTestedTime(d4);
        arrayListresultModel.add(urineTestModel14);
        Log.e("arraylist12","call"+arrayListresultModel.size());
        /////
        urineTestModel15.setRbcValue(4.0f);//0-7
        urineTestModel15.setBillirubinValue(0.69f);//0-0.4
        urineTestModel15.setUroboliogenValue(2.1f);//0.1-2.9
        urineTestModel15.setKetonesValue(5.0f);//0-4
        urineTestModel15.setProteinValue(26.0f);//0-29
        urineTestModel15.setNitriteValue(0.03f);//0-0.04
        urineTestModel15.setGlucoseValue(44.0f);//0-49
        urineTestModel15.setPhValue(7.6f);//4.5-8.5
        urineTestModel15.setSgValue(1.028f);//1.008-1.029
        urineTestModel15.setLeukocyteValue(14.0f);//0-17
        urineTestModel15.setRelativename("Aurora");
        urineTestModel15.setRelationType("Daughter");
        urineTestModel15.setTestedTime(d5);
        arrayListresultModel.add(urineTestModel15);
        Log.e("arraylist15","call"+arrayListresultModel.size());
        /////
        urineTestModel16.setRbcValue(3.0f);//0-7
        urineTestModel16.setBillirubinValue(0.65f);//0-0.4
        urineTestModel16.setUroboliogenValue(2.1f);//0.1-2.9
        urineTestModel16.setKetonesValue(5.0f);//0-4
        urineTestModel16.setProteinValue(26.0f);//0-29
        urineTestModel16.setNitriteValue(0.04f);//0-0.04
        urineTestModel16.setGlucoseValue(44.0f);//0-49
        urineTestModel16.setPhValue(5.6f);//4.5-8.5
        urineTestModel16.setSgValue(1.028f);//1.008-1.029
        urineTestModel16.setLeukocyteValue(14.0f);//0-17
        urineTestModel16.setRelativename("Aurora");
        urineTestModel16.setRelationType("Daughter");
        urineTestModel16.setTestedTime(d6);
        arrayListresultModel.add(urineTestModel16);
        Log.e("arraylist15","call"+arrayListresultModel.size());
        /////
        resultobj17.setRbcValue(8.0f);//0-7
        resultobj17.setBillirubinValue(0.63f);//0-0.4
        resultobj17.setUroboliogenValue(2.1f);//0.1-2.9
        resultobj17.setKetonesValue(5.0f);//0-4
        resultobj17.setProteinValue(26.0f);//0-29
        resultobj17.setNitriteValue(0.03f);//0-0.04
        resultobj17.setGlucoseValue(44.0f);//0-49
        resultobj17.setPhValue(3.6f);//4.5-8.5
        resultobj17.setSgValue(1.028f);//1.008-1.029
        resultobj17.setLeukocyteValue(14.0f);//0-17
        resultobj17.setRelativename("Aurora");
        resultobj17.setRelationType("Daughter");
        resultobj17.setTestedTime(d7);
        arrayListresultModel.add(resultobj17);
        Log.e("arraylist15","call"+arrayListresultModel.size());
        /////
        resultobj18.setRbcValue(4.0f);//0-7
        resultobj18.setBillirubinValue(0.23f);//0-0.4
        resultobj18.setUroboliogenValue(2.1f);//0.1-2.9
        resultobj18.setKetonesValue(5.0f);//0-4
        resultobj18.setProteinValue(26.0f);//0-29
        resultobj18.setNitriteValue(0.01f);//0-0.04
        resultobj18.setGlucoseValue(44.0f);//0-49
        resultobj18.setPhValue(5.6f);//4.5-8.5
        resultobj18.setSgValue(1.028f);//1.008-1.029
        resultobj18.setLeukocyteValue(14.0f);//0-17
        resultobj18.setRelativename("Aurora");
        resultobj18.setRelationType("Daughter");
        resultobj18.setTestedTime(d8);
        arrayListresultModel.add(resultobj18);
        Log.e("arraylist15","call"+arrayListresultModel.size());
        /////
        resultobj19.setRbcValue(2.0f);//0-7
        resultobj19.setBillirubinValue(0.22f);//0-0.4
        resultobj19.setUroboliogenValue(2.1f);//0.1-2.9
        resultobj19.setKetonesValue(5.0f);//0-4
        resultobj19.setProteinValue(26.0f);//0-29
        resultobj19.setNitriteValue(0.01f);//0-0.04
        resultobj19.setGlucoseValue(44.0f);//0-49
        resultobj19.setPhValue(4.6f);//4.5-8.5
        resultobj19.setSgValue(1.028f);//1.008-1.029
        resultobj19.setLeukocyteValue(14.0f);//0-17
        resultobj19.setRelativename("Aurora");
        resultobj19.setRelationType("Daughter");
        resultobj19.setTestedTime(d9);
        arrayListresultModel.add(resultobj19);
        Log.e("arraylist15","call"+arrayListresultModel.size());
        /////
        resultobj20.setRbcValue(8.0f);//0-7
        resultobj20.setBillirubinValue(0.18f);//0-0.4
        resultobj20.setUroboliogenValue(2.1f);//0.1-2.9
        resultobj20.setKetonesValue(5.0f);//0-4
        resultobj20.setProteinValue(26.0f);//0-29
        resultobj20.setNitriteValue(0.03f);//0-0.04
        resultobj20.setGlucoseValue(44.0f);//0-49
        resultobj20.setPhValue(6.6f);//4.5-8.5
        resultobj20.setSgValue(1.028f);//1.008-1.029
        resultobj20.setLeukocyteValue(14.0f);//0-17
        resultobj20.setRelativename("Aurora");
        resultobj20.setRelationType("Daughter");
        resultobj20.setTestedTime(d10);
        arrayListresultModel.add(resultobj20);
        Log.e("arraylist20","call"+arrayListresultModel.size());
        /////

        resultobjaurora11.setRbcValue(7.0f);//0-7
        resultobjaurora11.setBillirubinValue(0.15f);//0-0.4
        resultobjaurora11.setUroboliogenValue(3.1f);//0.1-2.9
        resultobjaurora11.setKetonesValue(5.0f);//0-4
        resultobjaurora11.setProteinValue(46.0f);//0-29
        resultobjaurora11.setNitriteValue(0.02f);//0-0.04
        resultobjaurora11.setGlucoseValue(24.0f);//0-49
        resultobjaurora11.setPhValue(6.7f);//4.5-8.5
        resultobjaurora11.setSgValue(1.08f);//1.008-1.029
        resultobjaurora11.setLeukocyteValue(11.0f);//0-17
        resultobjaurora11.setRelativename("Aurora");
        resultobjaurora11.setRelationType("Daughter");
        resultobjaurora11.setTestedTime(d11);
        arrayListresultModel.add(    resultobjaurora11);
        Log.e("arraylist11","call"+arrayListresultModel.size());
        /////
        resultobjaurora12.setRbcValue(2.0f);//0-7
        resultobjaurora12.setBillirubinValue(0.8f);//0-0.4
        resultobjaurora12.setUroboliogenValue(2.8f);//0.1-2.9
        resultobjaurora12.setKetonesValue(5.5f);//0-4
        resultobjaurora12.setProteinValue(2.0f);//0-29
        resultobjaurora12.setNitriteValue(0.3f);//0-0.04
        resultobjaurora12.setGlucoseValue(4.0f);//0-49
        resultobjaurora12.setPhValue(6.9f);//4.5-8.5
        resultobjaurora12.setSgValue(1.02f);//1.008-1.029
        resultobjaurora12.setLeukocyteValue(19.0f);//0-17
        resultobjaurora12.setRelativename("Aurora");
        resultobjaurora12.setRelationType("Daughter");
        resultobjaurora12.setTestedTime(d12);
        arrayListresultModel.add(resultobjaurora12);
        Log.e("arraylist12","call"+arrayListresultModel.size());
        /////
        resultobjaurora13.setRbcValue(3.0f);//0-7
        resultobjaurora13.setBillirubinValue(0.8f);//0-0.4
        resultobjaurora13.setUroboliogenValue(2.9f);//0.1-2.9
        resultobjaurora13.setKetonesValue(4.0f);//0-4
        resultobjaurora13.setProteinValue(6.0f);//0-29
        resultobjaurora13.setNitriteValue(0.3f);//0-0.04
        resultobjaurora13.setGlucoseValue(64.0f);//0-49
        resultobjaurora13.setPhValue(9.6f);//4.5-8.5
        resultobjaurora13.setSgValue(1.458f);//1.008-1.029
        resultobjaurora13.setLeukocyteValue(17.0f);//0-17
        resultobjaurora13.setRelativename("Aurora");
        resultobjaurora13.setRelationType("Daughter");
        resultobjaurora13.setTestedTime(d13);
        arrayListresultModel.add(resultobjaurora13);
        Log.e("arraylist13","call"+arrayListresultModel.size());
        /////
        resultobjaurora14.setRbcValue(9.0f);//0-7
        resultobjaurora14.setBillirubinValue(9.18f);//0-0.4
        resultobjaurora14.setUroboliogenValue(1.1f);//0.1-2.9
        resultobjaurora14.setKetonesValue(4.0f);//0-4
        resultobjaurora14.setProteinValue(2.0f);//0-29
        resultobjaurora14.setNitriteValue(0.09f);//0-0.04
        resultobjaurora14.setGlucoseValue(34.0f);//0-49
        resultobjaurora14.setPhValue(6.9f);//4.5-8.5
        resultobjaurora14.setSgValue(1.08f);//1.008-1.029
        resultobjaurora14.setLeukocyteValue(18.0f);//0-17
        resultobjaurora14.setRelativename("Aurora");
        resultobjaurora14.setRelationType("Daughter");
        resultobjaurora14.setTestedTime(d14);
        arrayListresultModel.add(resultobjaurora14);
        Log.e("arraylist14","call"+arrayListresultModel.size());
        /////
        resultobjaurora15.setRbcValue(1.0f);//0-7
        resultobjaurora15.setBillirubinValue(0.13f);//0-0.4
        resultobjaurora15.setUroboliogenValue(3.1f);//0.1-2.9
        resultobjaurora15.setKetonesValue(3.0f);//0-4
        resultobjaurora15.setProteinValue(36.0f);//0-29
        resultobjaurora15.setNitriteValue(3.03f);//0-0.04
        resultobjaurora15.setGlucoseValue(34.0f);//0-49
        resultobjaurora15.setPhValue(3.3f);//4.5-8.5
        resultobjaurora15.setSgValue(3.028f);//1.008-1.029
        resultobjaurora15.setLeukocyteValue(14.0f);//0-17
        resultobjaurora15.setRelativename("Aurora");
        resultobjaurora15.setRelationType("Daughter");
        resultobjaurora15.setTestedTime(d15);
        arrayListresultModel.add(resultobjaurora15);
        Log.e("arraylist15","call"+arrayListresultModel.size());
        /////
        resultobjaurora16.setRbcValue(4.0f);//0-7
        resultobjaurora16.setBillirubinValue(0.4f);//0-0.4
        resultobjaurora16.setUroboliogenValue(4.1f);//0.1-2.9
        resultobjaurora16.setKetonesValue(4.0f);//0-4
        resultobjaurora16.setProteinValue(6.0f);//0-29
        resultobjaurora16.setNitriteValue(4.03f);//0-0.04
        resultobjaurora16.setGlucoseValue(4.0f);//0-49
        resultobjaurora16.setPhValue(6.4f);//4.5-8.5
        resultobjaurora16.setSgValue(1.48f);//1.008-1.029
        resultobjaurora16.setLeukocyteValue(15.0f);//0-17
        resultobjaurora16.setRelativename("Aurora");
        resultobjaurora16.setRelationType("Daughter");
        resultobjaurora16.setTestedTime(d16);
        arrayListresultModel.add(resultobjaurora16);
        Log.e("arraylist16","call"+arrayListresultModel.size());
        /////
        resultobjaurora17.setRbcValue(8.40f);//0-7
        resultobjaurora17.setBillirubinValue(0.148f);//0-0.4
        resultobjaurora17.setUroboliogenValue(2.1f);//0.1-2.9
        resultobjaurora17.setKetonesValue(4.0f);//0-4
        resultobjaurora17.setProteinValue(24.0f);//0-29
        resultobjaurora17.setNitriteValue(0.04f);//0-0.04
        resultobjaurora17.setGlucoseValue(44.0f);//0-49
        resultobjaurora17.setPhValue(6.6f);//4.5-8.5
        resultobjaurora17.setSgValue(1.0248f);//1.008-1.029
        resultobjaurora17.setLeukocyteValue(14.0f);//0-17
        resultobjaurora17.setRelativename("Aurora");
        resultobjaurora17.setRelationType("Daughter");
        resultobjaurora17.setTestedTime(d17);
        arrayListresultModel.add(resultobjaurora17);
        Log.e("arraylist17","call"+arrayListresultModel.size());
        /////
        resultobjaurora18.setRbcValue(4.0f);//0-7
        resultobjaurora18.setBillirubinValue(0.184f);//0-0.4
        resultobjaurora18.setUroboliogenValue(2.14f);//0.1-2.9
        resultobjaurora18.setKetonesValue(45.0f);//0-4
        resultobjaurora18.setProteinValue(24.0f);//0-29
        resultobjaurora18.setNitriteValue(0.034f);//0-0.04
        resultobjaurora18.setGlucoseValue(24.0f);//0-49
        resultobjaurora18.setPhValue(6.64f);//4.5-8.5
        resultobjaurora18.setSgValue(1.0248f);//1.008-1.029
        resultobjaurora18.setLeukocyteValue(1.0f);//0-17
        resultobjaurora18.setRelativename("Aurora");
        resultobjaurora18.setRelationType("Daughter");
        resultobjaurora18.setTestedTime(d18);
        arrayListresultModel.add(resultobjaurora18);
        Log.e("arraylist18","call"+arrayListresultModel.size());
        /////
        resultobjaurora19.setRbcValue(7.0f);//0-7
        resultobjaurora19.setBillirubinValue(0.178f);//0-0.4
        resultobjaurora19.setUroboliogenValue(2.17f);//0.1-2.9
        resultobjaurora19.setKetonesValue(5.70f);//0-4
        resultobjaurora19.setProteinValue(26.07f);//0-29
        resultobjaurora19.setNitriteValue(0.073f);//0-0.04
        resultobjaurora19.setGlucoseValue(44.70f);//0-49
        resultobjaurora19.setPhValue(6.67f);//4.5-8.5
        resultobjaurora19.setSgValue(1.0278f);//1.008-1.029
        resultobjaurora19.setLeukocyteValue(14.70f);//0-17
        resultobjaurora19.setRelativename("Aurora");
        resultobjaurora19.setRelationType("Daughter");
        resultobjaurora19.setTestedTime(d19);
        arrayListresultModel.add(resultobjaurora19);
        Log.e("arraylist19","call"+arrayListresultModel.size());
        /////
        resultobjaurora20.setRbcValue(8.70f);//0-7
        resultobjaurora20.setBillirubinValue(0.138f);//0-0.4
        resultobjaurora20.setUroboliogenValue(2.31f);//0.1-2.9
        resultobjaurora20.setKetonesValue(5.30f);//0-4
        resultobjaurora20.setProteinValue(26.33f);//0-0.04
        resultobjaurora20.setGlucoseValue(44.03f);//0-49
        resultobjaurora20.setPhValue(6.36f);//4.5-8.5
        resultobjaurora20.setSgValue(1.0328f);//1.008-1.029
        resultobjaurora20.setLeukocyteValue(14.03f);//0-17
        resultobjaurora20.setRelativename("Aurora");
        resultobjaurora20.setRelationType("Daughter");
        resultobjaurora20.setTestedTime(d20);
        arrayListresultModel.add(resultobjaurora20);
        Log.e("arraylist20","call"+arrayListresultModel.size());
        /////
        resultobjaurora21.setRbcValue(1.0f);//0-7
        resultobjaurora21.setBillirubinValue(0.518f);//0-0.4
        resultobjaurora21.setUroboliogenValue(42.1f);//0.1-2.9
        resultobjaurora21.setKetonesValue(5.04f);//0-4
        resultobjaurora21.setProteinValue(26.40f);//0-29
        resultobjaurora21.setNitriteValue(0.043f);//0-0.04
        resultobjaurora21.setGlucoseValue(44.40f);//0-49
        resultobjaurora21.setPhValue(6.46f);//4.5-8.5
        resultobjaurora21.setSgValue(1.0248f);//1.008-1.029
        resultobjaurora21.setLeukocyteValue(14.40f);//0-17
        resultobjaurora21.setRelativename("Aurora");
        resultobjaurora21.setRelationType("Daughter");
        resultobjaurora21.setTestedTime(d21);
        arrayListresultModel.add(resultobjaurora21);
        Log.e("arraylist21","call"+arrayListresultModel.size());
        /////
        resultobjaurora22.setRbcValue(4.0f);//0-7
        resultobjaurora22.setBillirubinValue(04.18f);//0-0.4
        resultobjaurora22.setUroboliogenValue(2.41f);//0.1-2.9
        resultobjaurora22.setKetonesValue(54.0f);//0-4
        resultobjaurora22.setProteinValue(46.0f);//0-29
        resultobjaurora22.setNitriteValue(0.03f);//0-0.04
        resultobjaurora22.setGlucoseValue(44.04f);//0-49
        resultobjaurora22.setPhValue(4.6f);//4.5-8.5
        resultobjaurora22.setSgValue(1.0328f);//1.008-1.029
        resultobjaurora22.setLeukocyteValue(14.04f);//0-17
        resultobjaurora22.setRelativename("Aurora");
        resultobjaurora22.setRelationType("Daughter");
        resultobjaurora22.setTestedTime(d22);
        arrayListresultModel.add(resultobjaurora22);
        Log.e("arraylist22","call"+arrayListresultModel.size());
        /////
        resultobjaurora23.setRbcValue(9.0f);//0-7
        resultobjaurora23.setBillirubinValue(0.138f);//0-0.4
        resultobjaurora23.setUroboliogenValue(2.1f);//0.1-2.9
        resultobjaurora23.setKetonesValue(3.03f);//0-4
        resultobjaurora23.setProteinValue(26.03f);//0-29
        resultobjaurora23.setNitriteValue(0.033f);//0-0.04
        resultobjaurora23.setGlucoseValue(44.30f);//0-49
        resultobjaurora23.setPhValue(6.6f);//4.5-8.5
        resultobjaurora23.setSgValue(1.028f);//1.008-1.029
        resultobjaurora23.setLeukocyteValue(14.30f);//0-17
        resultobjaurora23.setRelativename("Aurora");
        resultobjaurora23.setRelationType("Daughter");
        resultobjaurora23.setTestedTime(d23);
        arrayListresultModel.add(resultobjaurora23);
        Log.e("arraylist23","call"+arrayListresultModel.size());
        /////
        resultobjaurora24.setRbcValue(7.0f);//0-7
        resultobjaurora24.setBillirubinValue(0.183f);//0-0.4
        resultobjaurora24.setUroboliogenValue(23.1f);//0.1-2.9
        resultobjaurora24.setKetonesValue(5.30f);//0-4
        resultobjaurora24.setProteinValue(36.0f);//0-29
        resultobjaurora24.setNitriteValue(0.033f);//0-0.04
        resultobjaurora24.setGlucoseValue(34.0f);//0-49
        resultobjaurora24.setPhValue(6.63f);//4.5-8.5
        resultobjaurora24.setSgValue(3.028f);//1.008-1.029
        resultobjaurora24.setLeukocyteValue(34.0f);//0-17
        resultobjaurora24.setRelativename("Aurora");
        resultobjaurora24.setRelationType("Daughter");
        resultobjaurora24.setTestedTime(d24);
        arrayListresultModel.add(resultobjaurora24);
        Log.e("arraylist24","call"+arrayListresultModel.size());
        /////
        resultobjaurora25.setRbcValue(8.30f);//0-7
        resultobjaurora25.setBillirubinValue(30.18f);//0-0.4
        resultobjaurora25.setUroboliogenValue(2.1f);//0.1-2.9
        resultobjaurora25.setKetonesValue(5.03f);//0-4
        resultobjaurora25.setProteinValue(26.30f);//0-29
        resultobjaurora25.setNitriteValue(0.063f);//0-0.04
        resultobjaurora25.setGlucoseValue(44.60f);//0-49
        resultobjaurora25.setPhValue(6.66f);//4.5-8.5
        resultobjaurora25.setSgValue(1.0628f);//1.008-1.029
        resultobjaurora25.setLeukocyteValue(14.06f);//0-17
        resultobjaurora25.setRelativename("Aurora");
        resultobjaurora25.setRelationType("Daughter");
        resultobjaurora25.setTestedTime(d20);
        arrayListresultModel.add(resultobjaurora25);
        Log.e("arraylist25","call"+arrayListresultModel.size());
        /////
        resultobjaurora26.setRbcValue(9.0f);//0-7
        resultobjaurora26.setBillirubinValue(0.168f);//0-0.4
        resultobjaurora26.setUroboliogenValue(2.16f);//0.1-2.9
        resultobjaurora26.setKetonesValue(5.60f);//0-4
        resultobjaurora26.setProteinValue(26.03f);//0-29
        resultobjaurora26.setNitriteValue(0.039f);//0-0.04
        resultobjaurora26.setGlucoseValue(44.60f);//0-49
        resultobjaurora26.setPhValue(6.46f);//4.5-8.5
        resultobjaurora26.setSgValue(1.0238f);//1.008-1.029
        resultobjaurora26.setLeukocyteValue(14.60f);//0-17
        resultobjaurora26.setRelativename("Aurora");
        resultobjaurora26.setRelationType("Daughter");
        resultobjaurora26.setTestedTime(d26);
        arrayListresultModel.add(resultobjaurora26);
        Log.e("arraylist26","call"+arrayListresultModel.size());
        /////
        resultobjaurora27.setRbcValue(5.0f);//0-7
        resultobjaurora27.setBillirubinValue(0.168f);//0-0.4
        resultobjaurora27.setUroboliogenValue(2.51f);//0.1-2.9
        resultobjaurora27.setKetonesValue(5.40f);//0-4
        resultobjaurora27.setProteinValue(26.40f);//0-29
        resultobjaurora27.setNitriteValue(04.03f);//0-0.04
        resultobjaurora27.setGlucoseValue(94.0f);//0-49
        resultobjaurora27.setPhValue(6.64f);//4.5-8.5
        resultobjaurora27.setSgValue(1.0248f);//1.008-1.029
        resultobjaurora27.setLeukocyteValue(14.04f);//0-17
        resultobjaurora27.setRelativename("Aurora");
        resultobjaurora27.setRelationType("Daughter");
        resultobjaurora27.setTestedTime(d27);
        arrayListresultModel.add(resultobjaurora27);
        Log.e("arraylist27","call"+arrayListresultModel.size());
        /////
        resultobjaurora28.setRbcValue(8.20f);//0-7
        resultobjaurora28.setBillirubinValue(0.18f);//0-0.4
        resultobjaurora28.setUroboliogenValue(2.1f);//0.1-2.9
        resultobjaurora28.setKetonesValue(3.0f);//0-4
        resultobjaurora28.setProteinValue(36.0f);//0-29
        resultobjaurora28.setNitriteValue(0.033f);//0-0.04
        resultobjaurora28.setGlucoseValue(74.02f);//0-49
        resultobjaurora28.setPhValue(3.6f);//4.5-8.5
        resultobjaurora28.setSgValue(1.0218f);//1.008-1.029
        resultobjaurora28.setLeukocyteValue(12.0f);//0-17
        resultobjaurora28.setRelativename("Aurora");
        resultobjaurora28.setRelationType("Daughter");
        resultobjaurora28.setTestedTime(d28);
        arrayListresultModel.add(resultobjaurora28);
        Log.e("arraylist28","call"+arrayListresultModel.size());
        /////
        resultobjaurora29.setRbcValue(8.30f);//0-7
        resultobjaurora29.setBillirubinValue(1.18f);//0-0.4
        resultobjaurora29.setUroboliogenValue(4.1f);//0.1-2.9
        resultobjaurora29.setKetonesValue(9.0f);//0-4
        resultobjaurora29.setProteinValue(86.0f);//0-29
        resultobjaurora29.setNitriteValue(0.045f);//0-0.04
        resultobjaurora29.setGlucoseValue(4.0f);//0-49
        resultobjaurora29.setPhValue(6.87f);//4.5-8.5
        resultobjaurora29.setSgValue(1.092f);//1.008-1.029
        resultobjaurora29.setLeukocyteValue(19.02f);//0-17
        resultobjaurora29.setRelativename("Aurora");
        resultobjaurora29.setRelationType("Daughter");
        resultobjaurora29.setTestedTime(d29);
        arrayListresultModel.add(resultobjaurora29);
        Log.e("arraylist29","call"+arrayListresultModel.size());
        /////
        resultobjaurora30.setRbcValue(7.0f);//0-7
        resultobjaurora30.setBillirubinValue(3.18f);//0-0.4
        resultobjaurora30.setUroboliogenValue(3.1f);//0.1-2.9
        resultobjaurora30.setKetonesValue(3.0f);//0-4
        resultobjaurora30.setProteinValue(36.0f);//0-29
        resultobjaurora30.setNitriteValue(3.03f);//0-0.04
        resultobjaurora30.setGlucoseValue(34.0f);//0-49
        resultobjaurora30.setPhValue(3.6f);//4.5-8.5
        resultobjaurora30.setSgValue(3.028f);//1.008-1.029
        resultobjaurora30.setLeukocyteValue(13.0f);//0-17
        resultobjaurora30.setRelativename("Aurora");
        resultobjaurora30.setRelationType("Daughter");
        resultobjaurora30.setTestedTime(d30);
        arrayListresultModel.add(resultobjaurora30);
        Log.e("arraylist30","call"+arrayListresultModel.size());

        ////////////////////////////////////////////////////////////////////////////
        resultobj21.setRbcValue(6.0f);//0-7
        resultobj21.setBillirubinValue(0.3f);//0-0.4
        resultobj21.setUroboliogenValue(2.6f);//0.1-2.9
        resultobj21.setKetonesValue(3.0f);//0-4
        resultobj21.setProteinValue(20.0f);//0-29
        resultobj21.setNitriteValue(0.03f);//0-0.04
        resultobj21.setGlucoseValue(44.0f);//0-49
        resultobj21.setPhValue(7.6f);//4.5-8.5
        resultobj21.setSgValue(1.028f);//1.008-1.029
        resultobj21.setLeukocyteValue(12.0f);//0-17
        resultobj21.setRelativename("James");
        resultobj21.setRelationType("son");
        resultobj21.setTestedTime(d1);
        arrayListresultModel.add(resultobj21);
        Log.e("arraylist21","call"+arrayListresultModel.size());
        /////
        resultobj22.setRbcValue(3.0f);//0-7
        resultobj22.setBillirubinValue(0.3f);//0-0.4
        resultobj22.setUroboliogenValue(2.6f);//0.1-2.9
        resultobj22.setKetonesValue(3.0f);//0-4
        resultobj22.setProteinValue(20.0f);//0-29
        resultobj22.setNitriteValue(0.03f);//0-0.04
        resultobj22.setGlucoseValue(24.0f);//0-49
        resultobj22.setPhValue(7.06f);//4.5-8.5
        resultobj22.setSgValue(1.08f);//1.008-1.029
        resultobj22.setLeukocyteValue(12.0f);//0-17
        resultobj22.setRelativename("James");
        resultobj22.setRelationType("son");
        resultobj22.setTestedTime(d2);
        arrayListresultModel.add(resultobj22);
        Log.e("arraylist22","call"+arrayListresultModel.size());
        /////
        resultobj23.setRbcValue(2.0f);//0-7
        resultobj23.setBillirubinValue(0.3f);//0-0.4
        resultobj23.setUroboliogenValue(2.6f);//0.1-2.9
        resultobj23.setKetonesValue(3.0f);//0-4
        resultobj23.setProteinValue(20.0f);//0-29
        resultobj23.setNitriteValue(0.03f);//0-0.04
        resultobj23.setGlucoseValue(44.0f);//0-49
        resultobj23.setPhValue(7.06f);//4.5-8.5
        resultobj23.setSgValue(1.028f);//1.008-1.029
        resultobj23.setLeukocyteValue(12.0f);//0-17
        resultobj23.setRelativename("James");
        resultobj23.setRelationType("son");
        resultobj23.setTestedTime(d3);
        arrayListresultModel.add(resultobj23);
        Log.e("arraylist23","call"+arrayListresultModel.size());
        /////
        resultobj24.setRbcValue(6.0f);//0-7
        resultobj24.setBillirubinValue(0.3f);//0-0.4
        resultobj24.setUroboliogenValue(2.6f);//0.1-2.9
        resultobj24.setKetonesValue(3.0f);//0-4
        resultobj24.setProteinValue(20.0f);//0-29
        resultobj24.setNitriteValue(0.03f);//0-0.04
        resultobj24.setGlucoseValue(44.0f);//0-49
        resultobj24.setPhValue(7.68f);//4.5-8.5
        resultobj24.setSgValue(1.08f);//1.008-1.029
        resultobj24.setLeukocyteValue(12.0f);//0-17
        resultobj24.setRelativename("James");
        resultobj24.setRelationType("son");
        resultobj24.setTestedTime(d4);
        arrayListresultModel.add(resultobj24);
        Log.e("arraylist24","call"+arrayListresultModel.size());
        /////
        resultobj25.setRbcValue(6.0f);//0-7
        resultobj25.setBillirubinValue(0.3f);//0-0.4
        resultobj25.setUroboliogenValue(2.6f);//0.1-2.9
        resultobj25.setKetonesValue(3.0f);//0-4
        resultobj25.setProteinValue(20.0f);//0-29
        resultobj25.setNitriteValue(0.03f);//0-0.04
        resultobj25.setGlucoseValue(44.0f);//0-49
        resultobj25.setPhValue(7.67f);//4.5-8.5
        resultobj25.setSgValue(1.28f);//1.008-1.029
        resultobj25.setLeukocyteValue(12.0f);//0-17
        resultobj25.setRelativename("James");
        resultobj25.setRelationType("son");
        resultobj25.setTestedTime(d5);
        arrayListresultModel.add(resultobj25);
        Log.e("arraylist25","call"+arrayListresultModel.size());
        /////
        resultobj26.setRbcValue(54.0f);//0-7
        resultobj26.setBillirubinValue(0.3f);//0-0.4
        resultobj26.setUroboliogenValue(2.6f);//0.1-2.9
        resultobj26.setKetonesValue(3.0f);//0-4
        resultobj26.setProteinValue(20.0f);//0-29
        resultobj26.setNitriteValue(0.03f);//0-0.04
        resultobj26.setGlucoseValue(62.0f);//0-49
        resultobj26.setPhValue(7.26f);//4.5-8.5
        resultobj26.setSgValue(1.128f);//1.008-1.029
        resultobj26.setLeukocyteValue(12.0f);//0-17
        resultobj26.setRelativename("James");
        resultobj26.setRelationType("son");
        resultobj26.setTestedTime(d6);
        arrayListresultModel.add(resultobj26);
        Log.e("arraylist26","call"+arrayListresultModel.size());
        /////
        resultobj27.setRbcValue(60.0f);//0-7
        resultobj27.setBillirubinValue(0.3f);//0-0.4
        resultobj27.setUroboliogenValue(2.6f);//0.1-2.9
        resultobj27.setKetonesValue(3.0f);//0-4
        resultobj27.setProteinValue(20.0f);//0-29
        resultobj27.setNitriteValue(0.01f);//0-0.04
        resultobj27.setGlucoseValue(34.0f);//0-49
        resultobj27.setPhValue(7.6f);//4.5-8.5
        resultobj27.setSgValue(1.028f);//1.008-1.029
        resultobj27.setLeukocyteValue(12.0f);//0-17
        resultobj27.setRelativename("James");
        resultobj27.setRelationType("son");
        resultobj27.setTestedTime(d7);
        arrayListresultModel.add(resultobj27);
        Log.e("arraylist21","call"+arrayListresultModel.size());
        /////
        resultobj28.setRbcValue(6.0f);//0-7
        resultobj28.setBillirubinValue(0.3f);//0-0.4
        resultobj28.setUroboliogenValue(2.6f);//0.1-2.9
        resultobj28.setKetonesValue(3.0f);//0-4
        resultobj28.setProteinValue(20.0f);//0-29
        resultobj28.setNitriteValue(0.03f);//0-0.04
        resultobj28.setGlucoseValue(44.0f);//0-49
        resultobj28.setPhValue(7.6f);//4.5-8.5
        resultobj28.setSgValue(1.028f);//1.008-1.029
        resultobj28.setLeukocyteValue(12.0f);//0-17
        resultobj28.setRelativename("James");
        resultobj28.setRelationType("son");
        resultobj28.setTestedTime(d8);
        arrayListresultModel.add(resultobj28);
        Log.e("arraylist28","call"+arrayListresultModel.size());
        /////
        resultobj29.setRbcValue(5.0f);//0-7
        resultobj29.setBillirubinValue(0.3f);//0-0.4
        resultobj29.setUroboliogenValue(2.6f);//0.1-2.9
        resultobj29.setKetonesValue(45.0f);//0-4
        resultobj29.setProteinValue(10.0f);//0-29
        resultobj29.setNitriteValue(0.03f);//0-0.04
        resultobj29.setGlucoseValue(44.0f);//0-49
        resultobj29.setPhValue(7.6f);//4.5-8.5
        resultobj29.setSgValue(1.028f);//1.008-1.029
        resultobj29.setLeukocyteValue(12.0f);//0-17
        resultobj29.setRelativename("James");
        resultobj29.setRelationType("son");
        resultobj29.setTestedTime(d9);
        arrayListresultModel.add(resultobj29);
        Log.e("arraylist21","call"+arrayListresultModel.size());
        /////
        resultobj30.setRbcValue(4.0f);//0-7--141
        resultobj30.setBillirubinValue(0.1f);//0-0.4--2.0
        resultobj30.setUroboliogenValue(2.6f);//0.1-2.9--10.6
        resultobj30.setKetonesValue(2.0f);//0-4--75
        resultobj30.setProteinValue(20.0f);//0-29--601
        resultobj30.setNitriteValue(0.03f);//0-0.04--0.05
        resultobj30.setGlucoseValue(1200.0f);//0-49--1500
        resultobj30.setPhValue(6.6f);//4.5-8.5--8.6
        resultobj30.setSgValue(1.023f);//1.008-1.029--1.030
        resultobj30.setLeukocyteValue(12.0f);//0-17--301
        resultobj30.setRelativename("James");
        resultobj30.setRelationType("son");
        resultobj30.setTestedTime(d10);
        arrayListresultModel.add(resultobj30);
        Log.e("arraylist30","call"+arrayListresultModel.size());

        /////
        resultobjjames1.setRbcValue(4.20f);//0-7--141
        resultobjjames1.setBillirubinValue(0.21f);//0-0.4--2.0
        resultobjjames1.setUroboliogenValue(2.26f);//0.1-2.9--10.6
        resultobjjames1.setKetonesValue(2.20f);//0-4--75
        resultobjjames1.setProteinValue(20.02f);//0-29--601
        resultobjjames1.setNitriteValue(0.023f);//0-0.04--0.05
        resultobjjames1.setGlucoseValue(100.0f);//0-49--1500
        resultobjjames1.setPhValue(6.62f);//4.5-8.5--8.6
        resultobjjames1.setSgValue(1.0223f);//1.008-1.029--1.030
        resultobjjames1.setLeukocyteValue(22.0f);//0-17--301
        resultobjjames1.setRelativename("James");
        resultobj30.setRelationType("son");
        resultobjjames1.setTestedTime(d11);
        arrayListresultModel.add(resultobjjames1);
        Log.e("arraylist1","call"+arrayListresultModel.size());
        /////
        resultobjjames2.setRbcValue(5.0f);//0-7--141
        resultobjjames2.setBillirubinValue(0.15f);//0-0.4--2.0
        resultobjjames2.setUroboliogenValue(2.65f);//0.1-2.9--10.6
        resultobjjames2.setKetonesValue(2.50f);//0-4--75
        resultobjjames2.setProteinValue(20.50f);//0-29--601
        resultobjjames2.setNitriteValue(0.053f);//0-0.04--0.05
        resultobjjames2.setGlucoseValue(120.0f);//0-49--1500
        resultobjjames2.setPhValue(6.65f);//4.5-8.5--8.6
        resultobjjames2.setSgValue(1.0253f);//1.008-1.029--1.030
        resultobjjames2.setLeukocyteValue(12.50f);//0-17--301
        resultobjjames2.setRelativename("James");
        resultobjjames2.setRelationType("son");
        resultobjjames2.setTestedTime(d12);
        arrayListresultModel.add(resultobjjames2);
        Log.e("arraylist2","call"+arrayListresultModel.size());
        /////
        resultobjjames3.setRbcValue(4.0f);//0-7--141
        resultobjjames3.setBillirubinValue(02.1f);//0-0.4--2.0
        resultobjjames3.setUroboliogenValue(2.62f);//0.1-2.9--10.6
        resultobjjames3.setKetonesValue(2.220f);//0-4--75
        resultobjjames3.setProteinValue(20.40f);//0-29--601
        resultobjjames3.setNitriteValue(0.033f);//0-0.04--0.05
        resultobjjames3.setGlucoseValue(12.0f);//0-49--1500
        resultobjjames3.setPhValue(6.63f);//4.5-8.5--8.6
        resultobjjames3.setSgValue(1.0233f);//1.008-1.029--1.030
        resultobjjames3.setLeukocyteValue(14.0f);//0-17--301
        resultobjjames3.setRelativename("James");
        resultobjjames3.setRelationType("son");
        resultobjjames3.setTestedTime(d13);
        arrayListresultModel.add(resultobjjames3);
        Log.e("arraylist3","call"+arrayListresultModel.size());
        /////
        resultobjjames4.setRbcValue(3.0f);//0-7--141
        resultobjjames4.setBillirubinValue(0.133f);//0-0.4--2.0
        resultobjjames4.setUroboliogenValue(2.63f);//0.1-2.9--10.6
        resultobjjames4.setKetonesValue(3.0f);//0-4--75
        resultobjjames4.setProteinValue(30.0f);//0-29--601
        resultobjjames4.setNitriteValue(3.03f);//0-0.04--0.05
        resultobjjames4.setGlucoseValue(10.0f);//0-49--1500
        resultobjjames4.setPhValue(6.63f);//4.5-8.5--8.6
        resultobjjames4.setSgValue(1.0233f);//1.008-1.029--1.030
        resultobjjames4.setLeukocyteValue(13.0f);//0-17--301
        resultobjjames4.setRelativename("James");
        resultobjjames4.setRelationType("son");
        resultobjjames4.setTestedTime(d14);
        arrayListresultModel.add(resultobjjames4);
        Log.e("arraylist4","call"+arrayListresultModel.size());
        /////
        resultobjjames5.setRbcValue(5.0f);//0-7--141
        resultobjjames5.setBillirubinValue(0.155f);//0-0.4--2.0
        resultobjjames5.setUroboliogenValue(52.6f);//0.1-2.9--10.6
        resultobjjames5.setKetonesValue(2.50f);//0-4--75
        resultobjjames5.setProteinValue(20.50f);//0-29--601
        resultobjjames5.setNitriteValue(5.03f);//0-0.04--0.05
        resultobjjames5.setGlucoseValue(50.0f);//0-49--1500
        resultobjjames5.setPhValue(6.5f);//4.5-8.5--8.6
        resultobjjames5.setSgValue(1.053f);//1.008-1.029--1.030
        resultobjjames5.setLeukocyteValue(15.0f);//0-17--301
        resultobjjames5.setRelativename("James");
        resultobjjames5.setRelationType("son");
        resultobjjames5.setTestedTime(d15);
        arrayListresultModel.add(resultobjjames5);
        Log.e("arraylist5","call"+arrayListresultModel.size());
        /////
        resultobjjames6.setRbcValue(4.5f);//0-7--141
        resultobjjames6.setBillirubinValue(0.5f);//0-0.4--2.0
        resultobjjames6.setUroboliogenValue(2.2f);//0.1-2.9--10.6
        resultobjjames6.setKetonesValue(2.2f);//0-4--75
        resultobjjames6.setProteinValue(20.2f);//0-29--601
        resultobjjames6.setNitriteValue(0.23f);//0-0.04--0.05
        resultobjjames6.setGlucoseValue(120.0f);//0-49--1500
        resultobjjames6.setPhValue(6.2f);//4.5-8.5--8.6
        resultobjjames6.setSgValue(1.23f);//1.008-1.029--1.030
        resultobjjames6.setLeukocyteValue(11.0f);//0-17--301
        resultobjjames6.setRelativename("James");
        resultobjjames6.setRelationType("son");
        resultobjjames6.setTestedTime(d16);
        arrayListresultModel.add(resultobjjames6);
        Log.e("arraylist6","call"+arrayListresultModel.size());
        /////
        resultobjjames7.setRbcValue(4.1f);//0-7--141
        resultobjjames7.setBillirubinValue(2.1f);//0-0.4--2.0
        resultobjjames7.setUroboliogenValue(1.6f);//0.1-2.9--10.6
        resultobjjames7.setKetonesValue(2.1f);//0-4--75
        resultobjjames7.setProteinValue(20.1f);//0-29--601
        resultobjjames7.setNitriteValue(0.13f);//0-0.04--0.05
        resultobjjames7.setGlucoseValue(111.0f);//0-49--1500
        resultobjjames7.setPhValue(6.1f);//4.5-8.5--8.6
        resultobjjames7.setSgValue(1.13f);//1.008-1.029--1.030
        resultobjjames7.setLeukocyteValue(11.0f);//0-17--301
        resultobjjames7.setRelativename("James");
        resultobjjames7.setRelationType("son");
        resultobjjames7.setTestedTime(d17);
        arrayListresultModel.add(resultobjjames7);
        Log.e("arraylist7","call"+arrayListresultModel.size());
        /////
        resultobjjames8.setRbcValue(4.05f);//0-7--141
        resultobjjames8.setBillirubinValue(0.5f);//0-0.4--2.0
        resultobjjames8.setUroboliogenValue(2.0f);//0.1-2.9--10.6
        resultobjjames8.setKetonesValue(2.0f);//0-4--75
        resultobjjames8.setProteinValue(2.0f);//0-29--601
        resultobjjames8.setNitriteValue(0.3f);//0-0.04--0.05
        resultobjjames8.setGlucoseValue(120.0f);//0-49--1500
        resultobjjames8.setPhValue(6.5f);//4.5-8.5--8.6
        resultobjjames8.setSgValue(1.03f);//1.008-1.029--1.030
        resultobjjames8.setLeukocyteValue(12.5f);//0-17--301
        resultobjjames8.setRelativename("James");
        resultobjjames8.setRelationType("son");
        resultobjjames8.setTestedTime(d18);
        arrayListresultModel.add(resultobjjames8);
        Log.e("arraylist8","call"+arrayListresultModel.size());
        /////
        resultobjjames9.setRbcValue(7.0f);//0-7--141
        resultobjjames9.setBillirubinValue(0.10f);//0-0.4--2.0
        resultobjjames9.setUroboliogenValue(2.0f);//0.1-2.9--10.6
        resultobjjames9.setKetonesValue(2.4f);//0-4--75
        resultobjjames9.setProteinValue(20.4f);//0-29--601
        resultobjjames9.setNitriteValue(0.044f);//0-0.04--0.05
        resultobjjames9.setGlucoseValue(1284.0f);//0-49--1500
        resultobjjames9.setPhValue(4.6f);//4.5-8.5--8.6
        resultobjjames9.setSgValue(4.023f);//1.008-1.029--1.030
        resultobjjames9.setLeukocyteValue(14.0f);//0-17--301
        resultobjjames9.setRelativename("James");
        resultobjjames9.setRelationType("son");
        resultobjjames9.setTestedTime(d19);
        arrayListresultModel.add(resultobjjames9);
        Log.e("arraylist9","call"+arrayListresultModel.size());
        /////
        resultobjjames10.setRbcValue(1.0f);//0-7--141
        resultobjjames10.setBillirubinValue(0.01f);//0-0.4--2.0
        resultobjjames10.setUroboliogenValue(1.6f);//0.1-2.9--10.6
        resultobjjames10.setKetonesValue(21.033f);//0-4--75
        resultobjjames10.setProteinValue(21.0f);//0-29--601
        resultobjjames10.setNitriteValue(0.3f);//0-0.04--0.05
        resultobjjames10.setGlucoseValue(1280.0f);//0-49--1500
        resultobjjames10.setPhValue(6.68f);//4.5-8.5--8.6
        resultobjjames10.setSgValue(1.083f);//1.008-1.029--1.030
        resultobjjames10.setLeukocyteValue(18.0f);//0-17--301
        resultobjjames10.setRelativename("James");
        resultobjjames10.setRelationType("son");
        resultobjjames10.setTestedTime(d20);
        arrayListresultModel.add(resultobjjames10);
        Log.e("arraylist10","call"+arrayListresultModel.size());
        /////
        resultobjjames11.setRbcValue(41.0f);//0-7--141
        resultobjjames11.setBillirubinValue(0.11f);//0-0.4--2.0
        resultobjjames11.setUroboliogenValue(12.6f);//0.1-2.9--10.6
        resultobjjames11.setKetonesValue(2.01f);//0-4--75
        resultobjjames11.setProteinValue(210.0f);//0-29--601
        resultobjjames11.setNitriteValue(0.031f);//0-0.04--0.05
        resultobjjames11.setGlucoseValue(1100.0f);//0-49--1500
        resultobjjames11.setPhValue(6.1f);//4.5-8.5--8.6
        resultobjjames11.setSgValue(1.0213f);//1.008-1.029--1.030
        resultobjjames11.setLeukocyteValue(121.0f);//0-17--301
        resultobjjames11.setRelativename("Jame1s");
        resultobjjames11.setRelationType("son");
        resultobjjames11.setTestedTime(d21);
        arrayListresultModel.add(resultobjjames11);
        Log.e("arraylist11","call"+arrayListresultModel.size());
        /////
        resultobjjames12.setRbcValue(41.0f);//0-7--141
        resultobjjames12.setBillirubinValue(01.1f);//0-0.4--2.0
        resultobjjames12.setUroboliogenValue(2.16f);//0.1-2.9--10.6
        resultobjjames12.setKetonesValue(2.10f);//0-4--75
        resultobjjames12.setProteinValue(201.0f);//0-29--601
        resultobjjames12.setNitriteValue(01.03f);//0-0.04--0.05
        resultobjjames12.setGlucoseValue(1210.0f);//0-49--1500
        resultobjjames12.setPhValue(6.6f);//4.5-8.5--8.6
        resultobjjames12.setSgValue(1.0123f);//1.008-1.029--1.030
        resultobjjames12.setLeukocyteValue(121.0f);//0-17--301
        resultobjjames12.setRelativename("James");
        resultobjjames12.setRelationType("son");
        resultobjjames12.setTestedTime(d22);
        arrayListresultModel.add(resultobjjames12);
        Log.e("arraylist12","call"+arrayListresultModel.size());
        /////
        resultobjjames13.setRbcValue(4.043f);//0-7--141
        resultobjjames13.setBillirubinValue(0.41f);//0-0.4--2.0
        resultobjjames13.setUroboliogenValue(42.6f);//0.1-2.9--10.6
        resultobjjames13.setKetonesValue(24.0f);//0-4--75
        resultobjjames13.setProteinValue(204.0f);//0-29--601
        resultobjjames13.setNitriteValue(0.403f);//0-0.04--0.05
        resultobjjames13.setGlucoseValue(124.0f);//0-49--1500
        resultobjjames13.setPhValue(6.64f);//4.5-8.5--8.6
        resultobjjames13.setSgValue(1.0243f);//1.008-1.029--1.030
        resultobjjames13.setLeukocyteValue(142.0f);//0-17--301
        resultobjjames13.setRelativename("James");
        resultobjjames13.setRelationType("son");
        resultobjjames13.setTestedTime(d23);
        arrayListresultModel.add(resultobjjames13);
        Log.e("arraylist13","call"+arrayListresultModel.size());
        /////
        resultobjjames14.setRbcValue(44.0f);//0-7--141
        resultobjjames14.setBillirubinValue(04.1f);//0-0.4--2.0
        resultobjjames14.setUroboliogenValue(2.6f);//0.1-2.9--10.6
        resultobjjames14.setKetonesValue(24.0f);//0-4--75
        resultobjjames14.setProteinValue(20.04f);//0-29--601
        resultobjjames14.setNitriteValue(0.034f);//0-0.04--0.05
        resultobjjames14.setGlucoseValue(1440.0f);//0-49--1500
        resultobjjames14.setPhValue(6.446f);//4.5-8.5--8.6
        resultobjjames14.setSgValue(1.02344f);//1.008-1.029--1.030
        resultobjjames14.setLeukocyteValue(12.044f);//0-17--301
        resultobjjames14.setRelativename("James");
        resultobjjames14.setRelationType("son");
        resultobjjames14.setTestedTime(d24);
        arrayListresultModel.add(resultobjjames14);
        Log.e("arraylist14","call"+arrayListresultModel.size());
        /////
        resultobjjames15.setRbcValue(44.0f);//0-7--141
        resultobjjames15.setBillirubinValue(05.1f);//0-0.4--2.0
        resultobjjames15.setUroboliogenValue(2.65f);//0.1-2.9--10.6
        resultobjjames15.setKetonesValue(52.0f);//0-4--75
        resultobjjames15.setProteinValue(250.0f);//0-29--601
        resultobjjames15.setNitriteValue(0.053f);//0-0.04--0.05
        resultobjjames15.setGlucoseValue(1500.0f);//0-49--1500
        resultobjjames15.setPhValue(6.65f);//4.5-8.5--8.6
        resultobjjames15.setSgValue(1.0523f);//1.008-1.029--1.030
        resultobjjames15.setLeukocyteValue(15.0f);//0-17--301
        resultobjjames15.setRelativename("James");
        resultobjjames15.setRelationType("son");
        resultobjjames15.setTestedTime(d25);
        arrayListresultModel.add(resultobjjames15);
        Log.e("arraylist15","call"+arrayListresultModel.size());
        /////
        resultobjjames16.setRbcValue(42.0f);//0-7--141
        resultobjjames16.setBillirubinValue(2.1f);//0-0.4--2.0
        resultobjjames16.setUroboliogenValue(2.6f);//0.1-2.9--10.6
        resultobjjames16.setKetonesValue(2.3f);//0-4--75
        resultobjjames16.setProteinValue(20.3f);//0-29--601
        resultobjjames16.setNitriteValue(0.033f);//0-0.04--0.05
        resultobjjames16.setGlucoseValue(1333.0f);//0-49--1500
        resultobjjames16.setPhValue(6.3f);//4.5-8.5--8.6
        resultobjjames16.setSgValue(1.0233f);//1.008-1.029--1.030
        resultobjjames16.setLeukocyteValue(12.30f);//0-17--301
        resultobjjames16.setRelativename("James");
        resultobjjames16.setRelationType("son");
        resultobjjames16.setTestedTime(d26);
        arrayListresultModel.add(resultobjjames16);
        Log.e("arraylist16","call"+arrayListresultModel.size());
        /////
        resultobjjames17.setRbcValue(152.0f);//0-7--141
        resultobjjames17.setBillirubinValue(0.5f);//0-0.4--2.0
        resultobjjames17.setUroboliogenValue(5.6f);//0.1-2.9--10.6
        resultobjjames17.setKetonesValue(5.0f);//0-4--75
        resultobjjames17.setProteinValue(20.077f);//0-29--601
        resultobjjames17.setNitriteValue(0.073f);//0-0.04--0.05
        resultobjjames17.setGlucoseValue(1270.0f);//0-49--1500
        resultobjjames17.setPhValue(6.7f);//4.5-8.5--8.6
        resultobjjames17.setSgValue(1.73f);//1.008-1.029--1.030
        resultobjjames17.setLeukocyteValue(165.0f);//0-17--301
        resultobjjames17.setRelativename("James");
        resultobjjames17.setRelationType("son");
        resultobjjames17.setTestedTime(d27);
        arrayListresultModel.add(resultobjjames17);
        Log.e("arraylist17","call"+arrayListresultModel.size());
        /////
        resultobjjames18.setRbcValue(22.0f);//0-7--141
        resultobjjames18.setBillirubinValue(22.1f);//0-0.4--2.0
        resultobjjames18.setUroboliogenValue(2.6f);//0.1-2.9--10.6
        resultobjjames18.setKetonesValue(2.022f);//0-4--75
        resultobjjames18.setProteinValue(20.021f);//0-29--601
        resultobjjames18.setNitriteValue(0.011f);//0-0.04--0.05
        resultobjjames18.setGlucoseValue(1211.0f);//0-49--1500
        resultobjjames18.setPhValue(6.2f);//4.5-8.5--8.6
        resultobjjames18.setSgValue(1.02f);//1.008-1.029--1.030
        resultobjjames18.setLeukocyteValue(14.0f);//0-17--301
        resultobjjames18.setRelativename("James");
        resultobjjames18.setRelationType("son");
        resultobjjames18.setTestedTime(d28);
        arrayListresultModel.add(resultobjjames18);
        Log.e("arraylist18","call"+arrayListresultModel.size());

        /////
        resultobjjames19.setRbcValue(24.0f);//0-7--141
        resultobjjames19.setBillirubinValue(02.1f);//0-0.4--2.0
        resultobjjames19.setUroboliogenValue(22.6f);//0.1-2.9--10.6
        resultobjjames19.setKetonesValue(22.0f);//0-4--75
        resultobjjames19.setProteinValue(20.02f);//0-29--601
        resultobjjames19.setNitriteValue(0.023f);//0-0.04--0.05
        resultobjjames19.setGlucoseValue(1800.0f);//0-49--1500
        resultobjjames19.setPhValue(6.26f);//4.5-8.5--8.6
        resultobjjames19.setSgValue(12.023f);//1.008-1.029--1.030
        resultobjjames19.setLeukocyteValue(122.0f);//0-17--301
        resultobjjames19.setRelativename("James");
        resultobjjames19.setRelationType("son");
        resultobjjames19.setTestedTime(d29);
        arrayListresultModel.add(resultobjjames19);
        Log.e("arraylist19","call"+arrayListresultModel.size());

        /////
        resultobjjames20.setRbcValue(224.0f);//0-7--141
        resultobjjames20.setBillirubinValue(0.1f);//0-0.4--2.0
        resultobjjames20.setUroboliogenValue(22.6f);//0.1-2.9--10.6
        resultobjjames20.setKetonesValue(2.02f);//0-4--75
        resultobjjames20.setProteinValue(20.20f);//0-29--601
        resultobjjames20.setNitriteValue(04.03f);//0-0.04--0.05
        resultobjjames20.setGlucoseValue(1400.0f);//0-49--1500
        resultobjjames20.setPhValue(6.66f);//4.5-8.5--8.6
        resultobjjames20.setSgValue(1.0263f);//1.008-1.029--1.030
        resultobjjames20.setLeukocyteValue(12.40f);//0-17--301
        resultobjjames20.setRelativename("James");
        resultobjjames20.setRelationType("son");
        resultobjjames20.setTestedTime(d30);
        arrayListresultModel.add(resultobjjames20);
        Log.e("arraylist20","call"+arrayListresultModel.size());
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
        resultobj31.setRbcValue(18.0f);//0-7--141
        resultobj31.setBillirubinValue(0.1f);//0-0.4--2.0
        resultobj31.setUroboliogenValue(4.6f);//0.1-2.9--10.6
        resultobj31.setKetonesValue(43.0f);//0-4--75
        resultobj31.setProteinValue(20.0f);//0-29--601
        resultobj31.setNitriteValue(0.03f);//0-0.04--0.05
        resultobj31.setGlucoseValue(40.0f);//0-49--1500
        resultobj31.setPhValue(7.6f);//4.5-8.5--8.6
        resultobj31.setSgValue(1.008f);//1.008-1.029--1.030
        resultobj31.setLeukocyteValue(12.0f);//0-17--301
        resultobj31.setRelativename("Sophia");
        resultobj31.setRelationType("mother");
        resultobj31.setTestedTime(d1);
        arrayListresultModel.add(resultobj31);
        Log.e("arraylist31","call"+arrayListresultModel.size());
        /////
        resultobj32.setRbcValue(4.0f);//0-7--141
        resultobj32.setBillirubinValue(0.4f);//0-0.4--2.0
        resultobj32.setUroboliogenValue(2.6f);//0.1-2.9--10.6
        resultobj32.setKetonesValue(3.0f);//0-4--75
        resultobj32.setProteinValue(6.0f);//0-29--601
        resultobj32.setNitriteValue(0.02f);//0-0.04--0.05
        resultobj32.setGlucoseValue(4.0f);//0-49--1500
        resultobj32.setPhValue(8.6f);//4.5-8.5--8.6
        resultobj32.setSgValue(1.008f);//1.008-1.029--1.030
        resultobj32.setLeukocyteValue(12.0f);//0-17--301
        resultobj32.setRelativename("Sophia");
        resultobj32.setRelationType("mother");
        resultobj32.setTestedTime(d2);
        arrayListresultModel.add(resultobj32);
        Log.e("arraylist31","call"+arrayListresultModel.size());
        /////
        resultobj33.setRbcValue(1.0f);//0-7--141
        resultobj33.setBillirubinValue(1.4f);//0-0.4--2.0
        resultobj33.setUroboliogenValue(1.6f);//0.1-2.9--10.6
        resultobj33.setKetonesValue(4.0f);//0-4--75
        resultobj33.setProteinValue(20.0f);//0-29--601
        resultobj33.setNitriteValue(0.03f);//0-0.04--0.05
        resultobj33.setGlucoseValue(4.5f);//0-49--1500
        resultobj33.setPhValue(6.6f);//4.5-8.5--8.6
        resultobj33.setSgValue(1.009f);//1.008-1.029--1.030
        resultobj33.setLeukocyteValue(15.0f);//0-17--301
        resultobj33.setRelativename("Sophia");
        resultobj33.setRelationType("mother");
        resultobj33.setTestedTime(d3);
        arrayListresultModel.add(resultobj33);
        Log.e("arraylist33","call"+arrayListresultModel.size());
        /////
        resultobj34.setRbcValue(3.0f);//0-7--141
        resultobj34.setBillirubinValue(0.4f);//0-0.4--2.0
        resultobj34.setUroboliogenValue(1.6f);//0.1-2.9--10.6
        resultobj34.setKetonesValue(4.0f);//0-4--75
        resultobj34.setProteinValue(20.0f);//0-29--601
        resultobj34.setNitriteValue(0.03f);//0-0.04--0.05
        resultobj34.setGlucoseValue(1300.5f);//0-49--1500
        resultobj34.setPhValue(7.6f);//4.5-8.5--8.6
        resultobj34.setSgValue(1.008f);//1.008-1.029--1.030
        resultobj34.setLeukocyteValue(14.0f);//0-17--301
        resultobj34.setRelativename("Sophia");
        resultobj34.setRelationType("mother");
        resultobj34.setTestedTime(d4);
        arrayListresultModel.add(resultobj34);
        Log.e("arraylist34","call"+arrayListresultModel.size());
        /////
        resultobj35.setRbcValue(7.0f);//0-7--141
        resultobj35.setBillirubinValue(0.4f);//0-0.4--2.0
        resultobj35.setUroboliogenValue(1.6f);//0.1-2.9--10.6
        resultobj35.setKetonesValue(4.0f);//0-4--75
        resultobj35.setProteinValue(20.0f);//0-29--601
        resultobj35.setNitriteValue(0.03f);//0-0.04--0.05
        resultobj35.setGlucoseValue(100.5f);//0-49--1500
        resultobj35.setPhValue(4.6f);//4.5-8.5--8.6
        resultobj35.setSgValue(1.008f);//1.008-1.029--1.030
        resultobj35.setLeukocyteValue(14.0f);//0-17--301
        resultobj35.setRelativename("Sophia");
        resultobj35.setRelationType("mother");
        resultobj35.setTestedTime(d5);
        arrayListresultModel.add(resultobj35);
        Log.e("arraylist35","call"+arrayListresultModel.size());
        /////
        resultobj36.setRbcValue(27.0f);//0-7--141
        resultobj36.setBillirubinValue(1.4f);//0-0.4--2.0
        resultobj36.setUroboliogenValue(1.6f);//0.1-2.9--10.6
        resultobj36.setKetonesValue(4.0f);//0-4--75
        resultobj36.setProteinValue(20.0f);//0-29--601
        resultobj36.setNitriteValue(0.03f);//0-0.04--0.05
        resultobj36.setGlucoseValue(100.5f);//0-49--1500
        resultobj36.setPhValue(4.6f);//4.5-8.5--8.6
        resultobj36.setSgValue(1.008f);//1.008-1.029--1.030
        resultobj36.setLeukocyteValue(14.0f);//0-17--301
        resultobj36.setRelativename("Sophia");
        resultobj36.setRelationType("mother");
        resultobj36.setTestedTime(d6);
        arrayListresultModel.add(resultobj36);
        Log.e("arraylist36","call"+arrayListresultModel.size());
/////
        resultobj37.setRbcValue(13.0f);//0-7--141
        resultobj37.setBillirubinValue(1.0f);//0-0.4--2.0
        resultobj37.setUroboliogenValue(1.6f);//0.1-2.9--10.6
        resultobj37.setKetonesValue(4.0f);//0-4--75
        resultobj37.setProteinValue(20.0f);//0-29--601
        resultobj37.setNitriteValue(0.03f);//0-0.04--0.05
        resultobj37.setGlucoseValue(100.5f);//0-49--1500
        resultobj37.setPhValue(7.6f);//4.5-8.5--8.6
        resultobj37.setSgValue(1.009f);//1.008-1.029--1.030
        resultobj37.setLeukocyteValue(19.0f);//0-17--301
        resultobj37.setRelativename("Sophia");
        resultobj37.setRelationType("mother");
        resultobj37.setTestedTime(d7);
        arrayListresultModel.add(resultobj37);
        Log.e("arraylist37","call"+arrayListresultModel.size());
/////
        resultobj38.setRbcValue(6.0f);//0-7--141
        resultobj38.setBillirubinValue(0.2f);//0-0.4--2.0
        resultobj38.setUroboliogenValue(1.9f);//0.1-2.9--10.6
        resultobj38.setKetonesValue(3.0f);//0-4--75
        resultobj38.setProteinValue(20.0f);//0-29--601
        resultobj38.setNitriteValue(0.03f);//0-0.04--0.05
        resultobj38.setGlucoseValue(48.5f);//0-49--1500
        resultobj38.setPhValue(7.6f);//4.5-8.5--8.6
        resultobj38.setSgValue(1.009f);//1.008-1.029--1.030
        resultobj38.setLeukocyteValue(15.0f);//0-17--301
        resultobj38.setRelativename("Sophia");
        resultobj38.setRelationType("mother");
        resultobj38.setTestedTime(d8);
        arrayListresultModel.add(resultobj38);
        Log.e("arraylist38","call"+arrayListresultModel.size());
/////
        resultobj39.setRbcValue(7.0f);//0-7--141
        resultobj39.setBillirubinValue(0.4f);//0-0.4--2.0
        resultobj39.setUroboliogenValue(2.9f);//0.1-2.9--10.6
        resultobj39.setKetonesValue(4.0f);//0-4--75
        resultobj39.setProteinValue(29.0f);//0-29--601
        resultobj39.setNitriteValue(0.03f);//0-0.04--0.05
        resultobj39.setGlucoseValue(47.5f);//0-49--1500
        resultobj39.setPhValue(7.6f);//4.5-8.5--8.6
        resultobj39.setSgValue(1.029f);//1.008-1.029--1.030
        resultobj39.setLeukocyteValue(13.0f);//0-17--301
        resultobj39.setRelativename("Sophia");
        resultobj39.setRelationType("mother");
        resultobj39.setTestedTime(d9);
        arrayListresultModel.add(resultobj39);
        Log.e("arraylist39","call"+arrayListresultModel.size());
/////
        resultobj40.setRbcValue(9.0f);//0-7--141
        resultobj40.setBillirubinValue(1.4f);//0-0.4--2.0
        resultobj40.setUroboliogenValue(3.9f);//0.1-2.9--10.6
        resultobj40.setKetonesValue(7.0f);//0-4--75
        resultobj40.setProteinValue(29.0f);//0-29--601
        resultobj40.setNitriteValue(0.05f);//0-0.04--0.05
        resultobj40.setGlucoseValue(52.5f);//0-49--1500
        resultobj40.setPhValue(8.6f);//4.5-8.5--8.6
        resultobj40.setSgValue(1.029f);//1.008-1.029--1.030
        resultobj40.setLeukocyteValue(28.0f);//0-17--301
        resultobj40.setRelativename("Sophia");
        resultobj40.setRelationType("mother");
        resultobj40.setTestedTime(d10);
        arrayListresultModel.add(resultobj40);
        Log.e("arraylist40","call"+arrayListresultModel.size());

        ////////////////
        resultobjsohia1.setRbcValue(5.0f);//0-7--141
        resultobjsohia1.setBillirubinValue(5.4f);//0-0.4--2.0
        resultobjsohia1.setUroboliogenValue(5.9f);//0.1-2.9--10.6
        resultobjsohia1.setKetonesValue(5.0f);//0-4--75
        resultobjsohia1.setProteinValue(295.0f);//0-29--601
        resultobjsohia1.setNitriteValue(0.055f);//0-0.04--0.05
        resultobjsohia1.setGlucoseValue(552.5f);//0-49--1500
        resultobjsohia1.setPhValue(8.65f);//4.5-8.5--8.6
        resultobjsohia1.setSgValue(5.029f);//1.008-1.029--1.030
        resultobjsohia1.setLeukocyteValue(285.0f);//0-17--301
        resultobjsohia1.setRelativename("Sophia");
        resultobjsohia1.setRelationType("mother");
        resultobjsohia1.setTestedTime(d11);
        arrayListresultModel.add(resultobjsohia1);
        Log.e("arraylist11","call"+arrayListresultModel.size());
/////
        resultobjsohia2.setRbcValue(92.0f);//0-7--141
        resultobjsohia2.setBillirubinValue(1.24f);//0-0.4--2.0
        resultobjsohia2.setUroboliogenValue(32.9f);//0.1-2.9--10.6
        resultobjsohia2.setKetonesValue(72.0f);//0-4--75
        resultobjsohia2.setProteinValue(229.0f);//0-29--601
        resultobjsohia2.setNitriteValue(0.0225f);//0-0.04--0.05
        resultobjsohia2.setGlucoseValue(522.5f);//0-49--1500
        resultobjsohia2.setPhValue(8.62f);//4.5-8.5--8.6
        resultobjsohia2.setSgValue(1.0292f);//1.008-1.029--1.030
        resultobjsohia2.setLeukocyteValue(228.0f);//0-17--301
        resultobjsohia2.setRelativename("Sophia");
        resultobjsohia2.setRelationType("mother");
        resultobjsohia2.setTestedTime(d12);
        arrayListresultModel.add(resultobjsohia2);
        Log.e("arraylist12","call"+arrayListresultModel.size());
/////
        resultobjsohia3.setRbcValue(93.0f);//0-7--141
        resultobjsohia3.setBillirubinValue(1.34f);//0-0.4--2.0
        resultobjsohia3.setUroboliogenValue(3.93f);//0.1-2.9--10.6
        resultobjsohia3.setKetonesValue(73.0f);//0-4--75
        resultobjsohia3.setProteinValue(293.0f);//0-29--601
        resultobjsohia3.setNitriteValue(0.035f);//0-0.04--0.05
        resultobjsohia3.setGlucoseValue(52.53f);//0-49--1500
        resultobjsohia3.setPhValue(8.63f);//4.5-8.5--8.6
        resultobjsohia3.setSgValue(1.0239f);//1.008-1.029--1.030
        resultobjsohia3.setLeukocyteValue(238.0f);//0-17--301
        resultobjsohia3.setRelativename("Sophia");
        resultobjsohia3.setRelationType("mother");
        resultobjsohia3.setTestedTime(d13);
        arrayListresultModel.add(resultobjsohia3);
        Log.e("arraylist13","call"+arrayListresultModel.size());
/////
        resultobjsohia4.setRbcValue(94.0f);//0-7--141
        resultobjsohia4.setBillirubinValue(14.4f);//0-0.4--2.0
        resultobjsohia4.setUroboliogenValue(43.9f);//0.1-2.9--10.6
        resultobjsohia4.setKetonesValue(7.04f);//0-4--75
        resultobjsohia4.setProteinValue(249.04f);//0-29--601
        resultobjsohia4.setNitriteValue(0.054f);//0-0.04--0.05
        resultobjsohia4.setGlucoseValue(542.5f);//0-49--1500
        resultobjsohia4.setPhValue(84.6f);//4.5-8.5--8.6
        resultobjsohia4.setSgValue(14.029f);//1.008-1.029--1.030
        resultobjsohia4.setLeukocyteValue(248.0f);//0-17--301
        resultobjsohia4.setRelativename("Sophia");
        resultobjsohia4.setRelationType("mother");
        resultobjsohia4.setTestedTime(d14);
        arrayListresultModel.add(resultobjsohia4);
        Log.e("arraylist14","call"+arrayListresultModel.size());
/////
        resultobjsohia5.setRbcValue(55.0f);//0-7--141
        resultobjsohia5.setBillirubinValue(1.45f);//0-0.4--2.0
        resultobjsohia5.setUroboliogenValue(35.9f);//0.1-2.9--10.6
        resultobjsohia5.setKetonesValue(7.05f);//0-4--75
        resultobjsohia5.setProteinValue(295.0f);//0-29--601
        resultobjsohia5.setNitriteValue(0.055f);//0-0.04--0.05
        resultobjsohia5.setGlucoseValue(552.5f);//0-49--1500
        resultobjsohia5.setPhValue(8.56f);//4.5-8.5--8.6
        resultobjsohia5.setSgValue(1.0529f);//1.008-1.029--1.030
        resultobjsohia5.setLeukocyteValue(258.0f);//0-17--301
        resultobjsohia5.setRelativename("Sophia");
        resultobjsohia5.setRelationType("mother");
        resultobjsohia5.setTestedTime(d15);
        arrayListresultModel.add(resultobjsohia5);
        Log.e("arraylist15","call"+arrayListresultModel.size());
/////
        resultobjsohia6.setRbcValue(6.0f);//0-7--141
        resultobjsohia6.setBillirubinValue(1.46f);//0-0.4--2.0
        resultobjsohia6.setUroboliogenValue(3.96f);//0.1-2.9--10.6
        resultobjsohia6.setKetonesValue(76.0f);//0-4--75
        resultobjsohia6.setProteinValue(269.0f);//0-29--601
        resultobjsohia6.setNitriteValue(0.065f);//0-0.04--0.05
        resultobjsohia6.setGlucoseValue(562.5f);//0-49--1500
        resultobjsohia6.setPhValue(8.66f);//4.5-8.5--8.6
        resultobjsohia6.setSgValue(1.0269f);//1.008-1.029--1.030
        resultobjsohia6.setLeukocyteValue(268.0f);//0-17--301
        resultobjsohia6.setRelativename("Sophia");
        resultobjsohia6.setRelationType("mother");
        resultobjsohia6.setTestedTime(d16);
        arrayListresultModel.add(resultobjsohia6);
        Log.e("arraylist16","call"+arrayListresultModel.size());
/////
        resultobjsohia7.setRbcValue(49.0f);//0-7--141
        resultobjsohia7.setBillirubinValue(1.44f);//0-0.4--2.0
        resultobjsohia7.setUroboliogenValue(63.9f);//0.1-2.9--10.6
        resultobjsohia7.setKetonesValue(74.0f);//0-4--75
        resultobjsohia7.setProteinValue(29.05f);//0-29--601
        resultobjsohia7.setNitriteValue(04.05f);//0-0.04--0.05
        resultobjsohia7.setGlucoseValue(562.5f);//0-49--1500
        resultobjsohia7.setPhValue(8.66f);//4.5-8.5--8.6
        resultobjsohia7.setSgValue(1.0296f);//1.008-1.029--1.030
        resultobjsohia7.setLeukocyteValue(268.0f);//0-17--301
        resultobjsohia7.setRelativename("Sophia");
        resultobjsohia7.setRelationType("mother");
        resultobjsohia7.setTestedTime(d17);
        arrayListresultModel.add(resultobjsohia7);
        Log.e("arraylist17","call"+arrayListresultModel.size());
/////
        resultobjsohia8.setRbcValue(7.0f);//0-7--141
        resultobjsohia8.setBillirubinValue(1.47f);//0-0.4--2.0
        resultobjsohia8.setUroboliogenValue(73.9f);//0.1-2.9--10.6
        resultobjsohia8.setKetonesValue(7.70f);//0-4--75
        resultobjsohia8.setProteinValue(279.0f);//0-29--601
        resultobjsohia8.setNitriteValue(0.05f);//0-0.04--0.05
        resultobjsohia8.setGlucoseValue(572.5f);//0-49--1500
        resultobjsohia8.setPhValue(87.6f);//4.5-8.5--8.6
        resultobjsohia8.setSgValue(1.0297f);//1.008-1.029--1.030
        resultobjsohia8.setLeukocyteValue(287.0f);//0-17--301
        resultobjsohia8.setRelativename("Sophia");
        resultobjsohia8.setRelationType("mother");
        resultobjsohia8.setTestedTime(d18);
        arrayListresultModel.add(resultobjsohia8);
        Log.e("arraylist18","call"+arrayListresultModel.size());
/////
        resultobjsohia9.setRbcValue(9.80f);//0-7--141
        resultobjsohia9.setBillirubinValue(1.48f);//0-0.4--2.0
        resultobjsohia9.setUroboliogenValue(38.9f);//0.1-2.9--10.6
        resultobjsohia9.setKetonesValue(7.80f);//0-4--75
        resultobjsohia9.setProteinValue(289.80f);//0-29--601
        resultobjsohia9.setNitriteValue(0.085f);//0-0.04--0.05
        resultobjsohia9.setGlucoseValue(852.85f);//0-49--1500
        resultobjsohia9.setPhValue(8.68f);//4.5-8.5--8.6
        resultobjsohia9.setSgValue(1.0829f);//1.008-1.029--1.030
        resultobjsohia9.setLeukocyteValue(288.0f);//0-17--301
        resultobjsohia9.setRelativename("Sophia");
        resultobjsohia9.setRelationType("mother");
        resultobjsohia9.setTestedTime(d19);
        arrayListresultModel.add(resultobjsohia9);
        Log.e("arraylist19","call"+arrayListresultModel.size());
/////
        resultobjsohia10.setRbcValue(9.0f);//0-7--141
        resultobjsohia10.setBillirubinValue(12.4f);//0-0.4--2.0
        resultobjsohia10.setUroboliogenValue(3.29f);//0.1-2.9--10.6
        resultobjsohia10.setKetonesValue(7.02f);//0-4--75
        resultobjsohia10.setProteinValue(22.0f);//0-29--601
        resultobjsohia10.setNitriteValue(0.05f);//0-0.04--0.05
        resultobjsohia10.setGlucoseValue(522.5f);//0-49--1500
        resultobjsohia10.setPhValue(8.62f);//4.5-8.5--8.6
        resultobjsohia10.setSgValue(1.0229f);//1.008-1.029--1.030
        resultobjsohia10.setLeukocyteValue(228.0f);//0-17--301
        resultobjsohia10.setRelativename("Sophia");
        resultobjsohia10.setRelationType("mother");
        resultobjsohia10.setTestedTime(d20);
        arrayListresultModel.add(resultobjsohia10);
        Log.e("arraylist20","call"+arrayListresultModel.size());
/////
        resultobjsohia11.setRbcValue(912.0f);//0-7--141
        resultobjsohia11.setBillirubinValue(1.24f);//0-0.4--2.0
        resultobjsohia11.setUroboliogenValue(23.9f);//0.1-2.9--10.6
        resultobjsohia11.setKetonesValue(27.0f);//0-4--75
        resultobjsohia11.setProteinValue(229.0f);//0-29--601
        resultobjsohia11.setNitriteValue(02.05f);//0-0.04--0.05
        resultobjsohia11.setGlucoseValue(522.5f);//0-49--1500
        resultobjsohia11.setPhValue(8.62f);//4.5-8.5--8.6
        resultobjsohia11.setSgValue(1.0292f);//1.008-1.029--1.030
        resultobjsohia11.setLeukocyteValue(28.20f);//0-17--301
        resultobjsohia11.setRelativename("Sophia");
        resultobjsohia11.setRelationType("mother");
        resultobjsohia11.setTestedTime(d21);
        arrayListresultModel.add(resultobjsohia11);
        Log.e("arraylist21","call"+arrayListresultModel.size());
/////
        resultobjsohia12.setRbcValue(9.20f);//0-7--141
        resultobjsohia12.setBillirubinValue(12.4f);//0-0.4--2.0
        resultobjsohia12.setUroboliogenValue(33.9f);//0.1-2.9--10.6
        resultobjsohia12.setKetonesValue(7.40f);//0-4--75
        resultobjsohia12.setProteinValue(29.05f);//0-29--601
        resultobjsohia12.setNitriteValue(0.045f);//0-0.04--0.05
        resultobjsohia12.setGlucoseValue(532.5f);//0-49--1500
        resultobjsohia12.setPhValue(8.65f);//4.5-8.5--8.6
        resultobjsohia12.setSgValue(1.02964f);//1.008-1.029--1.030
        resultobjsohia12.setLeukocyteValue(328.0f);//0-17--301
        resultobjsohia12.setRelativename("Sophia");
        resultobjsohia12.setRelationType("mother");
        resultobjsohia12.setTestedTime(d22);
        arrayListresultModel.add(resultobjsohia12);
        Log.e("arraylist22","call"+arrayListresultModel.size());
/////
        resultobjsohia13.setRbcValue(95.0f);//0-7--141
        resultobjsohia13.setBillirubinValue(13.4f);//0-0.4--2.0
        resultobjsohia13.setUroboliogenValue(34.9f);//0.1-2.9--10.6
        resultobjsohia13.setKetonesValue(7.30f);//0-4--75
        resultobjsohia13.setProteinValue(259.04f);//0-29--601
        resultobjsohia13.setNitriteValue(0.305f);//0-0.04--0.05
        resultobjsohia13.setGlucoseValue(52.55f);//0-49--1500
        resultobjsohia13.setPhValue(8.63f);//4.5-8.5--8.6
        resultobjsohia13.setSgValue(1.0295f);//1.008-1.029--1.030
        resultobjsohia13.setLeukocyteValue(258.0f);//0-17--301
        resultobjsohia13.setRelativename("Sophia");
        resultobjsohia13.setRelationType("mother");
        resultobjsohia13.setTestedTime(d23);
        arrayListresultModel.add(resultobjsohia13);
        Log.e("arraylist23","call"+arrayListresultModel.size());
/////
        resultobjsohia14.setRbcValue(39.0f);//0-7--141
        resultobjsohia14.setBillirubinValue(1.54f);//0-0.4--2.0
        resultobjsohia14.setUroboliogenValue(43.9f);//0.1-2.9--10.6
        resultobjsohia14.setKetonesValue(7.05f);//0-4--75
        resultobjsohia14.setProteinValue(529.50f);//0-29--601
        resultobjsohia14.setNitriteValue(05.05f);//0-0.04--0.05
        resultobjsohia14.setGlucoseValue(552.5f);//0-49--1500
        resultobjsohia14.setPhValue(8.65f);//4.5-8.5--8.6
        resultobjsohia14.setSgValue(1.0295f);//1.008-1.029--1.030
        resultobjsohia14.setLeukocyteValue(258.0f);//0-17--301
        resultobjsohia14.setRelativename("Sophia");
        resultobjsohia14.setRelationType("mother");
        resultobjsohia14.setTestedTime(d24);
        arrayListresultModel.add(resultobjsohia14);
        Log.e("arraylist24","call"+arrayListresultModel.size());
/////
        resultobjsohia15.setRbcValue(9.50f);//0-7--141
        resultobjsohia15.setBillirubinValue(1.54f);//0-0.4--2.0
        resultobjsohia15.setUroboliogenValue(53.9f);//0.1-2.9--10.6
        resultobjsohia15.setKetonesValue(75.0f);//0-4--75
        resultobjsohia15.setProteinValue(529.0f);//0-29--601
        resultobjsohia15.setNitriteValue(0.055f);//0-0.04--0.05
        resultobjsohia15.setGlucoseValue(552.5f);//0-49--1500
        resultobjsohia15.setPhValue(8.56f);//4.5-8.5--8.6
        resultobjsohia15.setSgValue(1.0259f);//1.008-1.029--1.030
        resultobjsohia15.setLeukocyteValue(285.0f);//0-17--301
        resultobjsohia15.setRelativename("Sophia");
        resultobjsohia15.setRelationType("mother");
        resultobjsohia15.setTestedTime(d25);
        arrayListresultModel.add(resultobjsohia15);
        Log.e("arraylist25","call"+arrayListresultModel.size());
/////
        resultobjsohia16.setRbcValue(9.05f);//0-7--141
        resultobjsohia16.setBillirubinValue(41.4f);//0-0.4--2.0
        resultobjsohia16.setUroboliogenValue(35.9f);//0.1-2.9--10.6
        resultobjsohia16.setKetonesValue(7.40f);//0-4--75
        resultobjsohia16.setProteinValue(249.50f);//0-29--601
        resultobjsohia16.setNitriteValue(05.05f);//0-0.04--0.05
        resultobjsohia16.setGlucoseValue(52.55f);//0-49--1500
        resultobjsohia16.setPhValue(8.64f);//4.5-8.5--8.6
        resultobjsohia16.setSgValue(1.0295f);//1.008-1.029--1.030
        resultobjsohia16.setLeukocyteValue(285.0f);//0-17--301
        resultobjsohia16.setRelativename("Sophia");
        resultobjsohia16.setRelationType("mother");
        resultobjsohia16.setTestedTime(d26);
        arrayListresultModel.add(resultobjsohia16);
        Log.e("arraylist26","call"+arrayListresultModel.size());
/////
        resultobjsohia17.setRbcValue(19.0f);//0-7--141
        resultobjsohia17.setBillirubinValue(13.4f);//0-0.4--2.0
        resultobjsohia17.setUroboliogenValue(13.9f);//0.1-2.9--10.6
        resultobjsohia17.setKetonesValue(7.02f);//0-4--75
        resultobjsohia17.setProteinValue(219.10f);//0-29--601
        resultobjsohia17.setNitriteValue(01.05f);//0-0.04--0.05
        resultobjsohia17.setGlucoseValue(512.5f);//0-49--1500
        resultobjsohia17.setPhValue(81.6f);//4.5-8.5--8.6
        resultobjsohia17.setSgValue(11.029f);//1.008-1.029--1.030
        resultobjsohia17.setLeukocyteValue(281.0f);//0-17--301
        resultobjsohia17.setRelativename("Sophia");
        resultobjsohia17.setRelationType("mother");
        resultobjsohia17.setTestedTime(d27);
        arrayListresultModel.add(resultobjsohia17);
        Log.e("arraylist27","call"+arrayListresultModel.size());
/////
        resultobjsohia18.setRbcValue(9.03f);//0-7--141
        resultobjsohia18.setBillirubinValue(14.4f);//0-0.4--2.0
        resultobjsohia18.setUroboliogenValue(3.49f);//0.1-2.9--10.6
        resultobjsohia18.setKetonesValue(7.06f);//0-4--75
        resultobjsohia18.setProteinValue(269.60f);//0-29--601
        resultobjsohia18.setNitriteValue(0.605f);//0-0.04--0.05
        resultobjsohia18.setGlucoseValue(562.5f);//0-49--1500
        resultobjsohia18.setPhValue(68.6f);//4.5-8.5--8.6
        resultobjsohia18.setSgValue(1.029f);//1.008-1.029--1.030
        resultobjsohia18.setLeukocyteValue(268.0f);//0-17--301
        resultobjsohia18.setRelativename("Sophia");
        resultobjsohia18.setRelationType("mother");
        resultobjsohia18.setTestedTime(d28);
        arrayListresultModel.add(resultobjsohia18);
        Log.e("arraylist28","call"+arrayListresultModel.size());
/////
        resultobjsohia19.setRbcValue(9.60f);//0-7--141
        resultobjsohia19.setBillirubinValue(16.4f);//0-0.4--2.0
        resultobjsohia19.setUroboliogenValue(63.9f);//0.1-2.9--10.6
        resultobjsohia19.setKetonesValue(7.06f);//0-4--75
        resultobjsohia19.setProteinValue(1269.60f);//0-29--601
        resultobjsohia19.setNitriteValue(06.05f);//0-0.04--0.05
        resultobjsohia19.setGlucoseValue(52.5f);//0-49--1500
        resultobjsohia19.setPhValue(8.46f);//4.5-8.5--8.6
        resultobjsohia19.setSgValue(1.0249f);//1.008-1.029--1.030
        resultobjsohia19.setLeukocyteValue(284.0f);//0-17--301
        resultobjsohia19.setRelativename("Sophia");
        resultobjsohia19.setRelationType("mother");
        resultobjsohia19.setTestedTime(d29);
        arrayListresultModel.add(resultobjsohia19);
        Log.e("arraylist29","call"+arrayListresultModel.size());
/////
        resultobjsohia20.setRbcValue(94.0f);//0-7--141
        resultobjsohia20.setBillirubinValue(1.4f);//0-0.4--2.0
        resultobjsohia20.setUroboliogenValue(3.9f);//0.1-2.9--10.6
        resultobjsohia20.setKetonesValue(47.0f);//0-4--75
        resultobjsohia20.setProteinValue(249.0f);//0-29--601
        resultobjsohia20.setNitriteValue(0.045f);//0-0.04--0.05
        resultobjsohia20.setGlucoseValue(52.5f);//0-49--1500
        resultobjsohia20.setPhValue(8.46f);//4.5-8.5--8.6
        resultobjsohia20.setSgValue(1.0249f);//1.008-1.029--1.030
        resultobjsohia20.setLeukocyteValue(248.0f);//0-17--301
        resultobjsohia20.setRelativename("Sophia");
        resultobjsohia20.setRelationType("mother");
        resultobjsohia20.setTestedTime(d30);
        arrayListresultModel.add(resultobjsohia20);
        Log.e("arraylist30","call"+arrayListresultModel.size());
/////////////////////////////////////////////////////////////////////////////////////////////////////

        /*int i=getRbcColor(140);
        Log.e("rbcclor",""+i);
        int i1=getBillirubinColor(2.0);
        Log.e("brilibiancclor",""+i1);
        int i2=getUroboliogenColor(20.0);
        Log.e("urobiancclor",""+i2);*/
        return view;

    }
    View.OnClickListener btnDownClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            result_text.setVisibility(View.GONE);
            one.setVisibility(View.VISIBLE);
            two.setVisibility(View.VISIBLE);
            three.setVisibility(View.VISIBLE);
        }
    };
    public static String getRbcText(double value){

        if (value >= 0 && value <= 7)
        {
            //img.setBackgroundResource(R.drawable.addicon);
            return "-ve"+"\n"+value;
        }
        else if (value >= 8 && value <= 29)
        {
            return "+"+"\n"+value;
        }

        else if (value >= 30 && value <= 140)
        {
            return "++"+"\n"+value;
        }
        else if (value <= 141)
        {
            return "+++"+"\n"+value;
        }
        else
        {
            return "++++"+"\n"+value;
        }
    }
    public static String getBillirubinText(double value){
        if(value>=0 && value<=0.4){

            return "-ve"+"\n"+value;

        }else if(value>=0.5 && value<=0.7){

            return "+"+"\n"+value;

        }else if(value>=0.8 && value<=1.9){

            return "++"+"\n"+value;

        }else if(value<=2.0){

            return "+++"+"\n"+value;
        }
        else {
            return "++++"+"\n"+value;
        }
    }
    public static String getUroboliogenText(double value){
        if(value>=0.1 && value<=1.9){

            return "-ve"+"\n"+value;

        }else if(value>=2.0 && value<=2.9){

            return "+"+"\n"+value;

        }else if(value>=3.0 && value<=6.5){

            return "++"+"\n"+value;

        }else if(value>=6.6 && value<=10.5){

            return "+++"+"\n"+value;

        }/*else if(value<=10.6){

            return "++++"+"\n"+value;
        }*/else {

            return "++++"+"\n"+value;

        }
    }
    public static String getKetonesText(double value){
        if(value>=0 && value<=4){

            return "-ve"+"\n"+value;
        }else if(value>=5 && value <=7){

            return "+/-"+"\n"+value;
        }else if(value>=8 && value<=29){

            return "+"+"\n"+value;
        }else if(value>=30 && value<=74){

            return "++"+"\n"+value;
        }else if(value<=75){

            return "+++"+"\n"+value;
        }else {

            return "++++"+"\n"+value;
        }
    }
    public static String getProteinText(double value){
        if(value>= 0&& value<= 29){

            return "-ve"+"\n"+value;
        }else if(value>=30 && value<=60){

            return "+/-"+"\n"+value;
        }else if(value>=61 && value<=80){

            return "+"+"\n"+value;
        }else if(value>=81 && value<=200){

            return "++"+"\n"+value;
        }else if(value>=201 && value<=600){

            return "+++"+"\n"+value;
        }/*else if(value<=601){

            return "++++"+"\n"+value;
        }*/else {
            return "++++"+"\n"+value;

        }

    }
    public static String getNitriteText(double value){
        if(value>=0 && value<=0.04){

            return "-ve"+"\n"+value;
        }else if(value<=0.05){

            return "+"+"\n"+value;
        }else {
            return "++++"+"\n"+value;

        }

    }
    public static String getGlucoseText(double value){
        if(value>=0 && value<=49){

            return "-ve"+"\n"+value;
        }else if(value>=50 && value<=175){

            return "+/-"+"\n"+value;
        }else if(value>=176 && value<=375){

            return "+"+"\n"+value;
        }else if(value>=376 && value<=750){

            return "++"+"\n"+value;
        }else if(value>=751 && value<=1499){

            return "+++"+"\n"+value;
        }/*else if(value<=1500){

            return "++++"+"\n"+value;
        }*/else {
            return "++++"+"\n"+value;

        }
    }
    public static String getPhText(double value){
        if(value>=0 && value<=4.4){

            return "-ve"+"\n"+value;
        }else if(value>=4.5 && value<=6.0){

            return "+/-"+"\n"+value;
        }else if(value>=6.1 && value<=7.5){

            return "+"+"\n"+value;
        }else if(value>=7.6 && value<=8.5){

            return "++"+"\n"+value;
        }else if(value<= 8.6){

            return "+++"+"\n"+value;
        }else {
            return "++++"+"\n"+value;

        }
    }
    public static String getSgText(double value){
        if(value>0 && value<= 1.002){

            return "-ve"+"\n"+value;
        }else if(value>= 1.003&& value<=1.007){

            return "+/-"+"\n"+value;
        }else if(value>=1.008 && value<=1.014){

            return "+"+"\n"+value;
        }else if(value>=1.015 && value<=1.022){

            return "++"+"\n"+value;
        }else if(value>=1.023 && value<=1.029){

            return "+++"+"\n"+value;
        }/*else if(value<=1.030){

            return "++++"+"\n"+value;
        }*/else {
            return "++++"+"\n"+value;

        }
    }
    public  static String  getLeukocyteText(double value){
        if(value>=0 && value<=17){

            return "-ve"+"\n"+value;
        }else if(value>=18 && value<=60){

            return "+"+"\n"+value;
        }else if(value>=61 && value<=300){

            return "++"+"\n"+value;
        }else if(value<=301){

            return "+++"+"\n"+value;
        }else {
            return "++++"+"\n"+value;

        }
    }
    /////////////////get colors for tests
    public int getRbcColor(double value){

        if (value >= 0 && value <= 7)
        {
            return Color.GREEN;
        }
        else if (value >= 8 && value <= 29)
        {
            return Color.CYAN;
        }

        else if (value >= 30 && value <= 140)
        {
            return Color.parseColor("#800080");//purple
        }
        else if (value <= 141)
        {
            return Color.parseColor("#FFA500");//0range
        }
        else
        {
            return Color.parseColor("#FF0000");//red
        }
    }
    public static int getBillirubinColor(double value){//check it
        if(value>=0 && value<=0.4){

            return Color.GREEN;

        }else if(value>=0.5 && value<=0.7){

            return Color.CYAN;

        }else if(value>=0.8 && value<=1.9){

            return Color.parseColor("#800080");//purple

        }else if(value<=2.0){

            return Color.parseColor("#FFA500");//0range;
        }
        else {
            return Color.parseColor("#FF0000");//red
        }
    }
    public static int getUroboliogenColor(double value){
        if(value>=0.1 && value<=1.9){

            return Color.GREEN;

        }else if(value>=2.0 && value<=2.9){

            return Color.CYAN;

        }else if(value>=3.0 && value<=6.5){

            return Color.parseColor("#800080");//purple;

        }else if(value>=6.6 && value<=10.5){

            return Color.parseColor("#FFA500");//0range;

        }/*else if(value<=10.6){

            return Color.parseColor("#FF0000");
        }*/else {

            return Color.parseColor("#FF0000");

        }
    }
    public static int getKetonesColor(double value){
        if(value>=0 && value<=4){

            return Color.GREEN;
        }else if(value>=5 && value <=7){

            return Color.YELLOW;
        }else if(value>=8 && value<=29){

            return Color.CYAN;
        }else if(value>=30 && value<=74){

            return Color.parseColor("#800080");//purple;
        }else if(value<=75){

            return Color.parseColor("#FFA500");//0range;
        }else {

            return Color.parseColor("#FF0000");
        }
    }
    public static int getProteinColor(double value){
        if(value>= 0&& value<= 29){

            return Color.GREEN;
        }else if(value>=30 && value<=60){

            return Color.YELLOW;
        }else if(value>=61 && value<=80){

            return Color.CYAN;
        }else if(value>=81 && value<=200){

            return Color.parseColor("#800080");//purple;
        }else if(value>=201 && value<=600){

            return Color.parseColor("#FFA500");//0range;
        }/*else if(value<=601){

            return "++++"+"\n"+value;
        }*/else {
            return Color.parseColor("#FF0000");

        }

    }
    public static int getNitriteColor(double value){
        if(value>=0 && value<=0.04){

            return Color.GREEN;
        }else if(value<=0.05){

            return Color.CYAN;
        }else {
            return Color.parseColor("#FF0000");//red

        }

    }
    public static int getGlucoseColor(double value){
        if(value>=0 && value<=49){

            return Color.GREEN;
        }else if(value>=50 && value<=175){

            return Color.YELLOW;
        }else if(value>=176 && value<=375){

            return Color.CYAN;
        }else if(value>=376 && value<=750){

            return Color.parseColor("#800080");//purple;
        }else if(value>=751 && value<=1499){

            return Color.parseColor("#FFA500");//0range;
        }/*else if(value<=1500){

            return "++++"+"\n"+value;
        }*/else {
            return Color.parseColor("#FF0000");
        }
    }
    public static int getPhColor(double value){
        if (value >= 0 && value <= 4.4)
        {
            return Color.GREEN;
        }
        else if (value >= 4.5 && value <= 6.0)
        {
            return Color.YELLOW;
        }
        else if (value >= 6.1 && value <= 7.5)
        {
            return Color.CYAN;
        }

        else if (value >= 7.6 && value <= 8.5)
        {
            return Color.parseColor("#800080");//purple;
        }
        else if (value <= 8.6)
        {
            return Color.parseColor("#FFA500");//0range;
        }
        else
        {
            return Color.parseColor("#FF0000");//red;
        }
    }
    public static int getSgColor(double value){
        if(value>=0 && value<= 1.002){

            return Color.GREEN;
        }else if(value>= 1.003&& value<=1.007){

            return Color.YELLOW;
        }else if(value>=1.008 && value<=1.014){

            return Color.CYAN;
        }else if(value>=1.015 && value<=1.022){

            return Color.parseColor("#800080");//purple;
        }else if(value>=1.023 && value<=1.029){

            return Color.parseColor("#FFA500");//0range;
        }/*else if(value<=1.030){

            return "++++"+"\n"+value;
        }*/else {
            return Color.parseColor("#FF0000");//0red;

        }
    }
    public  static int  getLeukocyteColor(double value){
        if(value>=0 && value<=17){

            return Color.GREEN;
        }else if(value>=18 && value<=60){

            return Color.CYAN;
        }else if(value>=61 && value<=300){

            return Color.parseColor("#800080");//purple;
        }else if(value<=301){

            return Color.parseColor("#FFA500");//0range;
        }else {
            return Color.parseColor("#FF0000");//red;

        }
    }
    public static String convertTimestampToDate(String stringData)
            throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//yyyy-MM-dd'T'HH:mm:ss
        SimpleDateFormat output = new SimpleDateFormat("yyyy/MM/dd");
        Date data = sdf.parse(stringData);
        String formattedTime = output.format(data);
        return formattedTime;
    }
    public static ArrayList getFilterArrayForDateString(String date) throws ParseException {
        ArrayList<UrineTestModel> filterDateList=new ArrayList<>();
        for(int i=0; i < ResultFragment.arrayListresultModel.size(); i++)
        {
            UrineTestModel urineTestModel =ResultFragment.arrayListresultModel.get(i);
            String convertDate=convertTimestampToDate(urineTestModel.getTestedTime());
            Log.e("convertDate",""+convertDate);
            if(date.equals(convertDate))
            {
                filterDateList.add(urineTestModel);
            }
        }
        return filterDateList;
    }
    public static ArrayList getFilterArrayForName(String name){
        ArrayList<UrineTestModel> filterNameList=new ArrayList<>();
        for(int i=0; i < ResultFragment.arrayListresultModel.size(); i++)
        {
            UrineTestModel s =ResultFragment.arrayListresultModel.get(i);
            if(name.equals(s.getRelativename()))
            {
                filterNameList.add(s);
            }
        }
        return filterNameList;
    }
    public UrineTestModel getUrineTestDataAvgObject(ArrayList<UrineTestModel> objects){
        UrineTestModel averageUrineTestObj = new UrineTestModel();
        averageUrineTestObj.setRbcValue(0.0f);
        averageUrineTestObj.setBillirubinValue(0.0f);
        averageUrineTestObj.setUroboliogenValue(0.0f);
        averageUrineTestObj.setKetonesValue(0.0f);
        averageUrineTestObj.setProteinValue(0.0f);
        averageUrineTestObj.setNitriteValue(0.0f);
        averageUrineTestObj.setGlucoseValue(0.0f);
        averageUrineTestObj.setPhValue(0.0f);
        averageUrineTestObj.setSgValue(0.0f);
        averageUrineTestObj.setLeukocyteValue(0.0f);
        ////
        if(objects.size()>0)
        {
           for( int objRecord=0;objects.size()>0;objRecord++)
           {
               UrineTestModel  objUrineRecord  = objects.get(objRecord) ;
               averageUrineTestObj.setRbcValue( averageUrineTestObj.getRbcValue()+ objUrineRecord.getRbcValue());
               averageUrineTestObj.setBillirubinValue( averageUrineTestObj.getBillirubinValue()+ objUrineRecord.getBillirubinValue());
               averageUrineTestObj.setUroboliogenValue( averageUrineTestObj.getUroboliogenValue()+ objUrineRecord.getUroboliogenValue());
               averageUrineTestObj.setKetonesValue( averageUrineTestObj.getKetonesValue()+ objUrineRecord.getKetonesValue());
               averageUrineTestObj.setProteinValue( averageUrineTestObj.getProteinValue()+ objUrineRecord.getProteinValue());
               averageUrineTestObj.setNitriteValue( averageUrineTestObj.getNitriteValue()+ objUrineRecord.getNitriteValue());
               averageUrineTestObj.setGlucoseValue( averageUrineTestObj.getGlucoseValue()+ objUrineRecord.getGlucoseValue());
               averageUrineTestObj.setPhValue( averageUrineTestObj.getPhValue()+ objUrineRecord.getPhValue());
               averageUrineTestObj.setSgValue( averageUrineTestObj.getSgValue()+ objUrineRecord.getSgValue());
               averageUrineTestObj.setLeukocyteValue( averageUrineTestObj.getLeukocyteValue()+ objUrineRecord.getLeukocyteValue());
           }
           ////
            averageUrineTestObj.setRbcValue(averageUrineTestObj.getRbcValue()/(objects.size()));
            averageUrineTestObj.setBillirubinValue(averageUrineTestObj.getBillirubinValue()/(objects.size()));
            averageUrineTestObj.setUroboliogenValue(averageUrineTestObj.getUroboliogenValue()/(objects.size()));
            averageUrineTestObj.setKetonesValue(averageUrineTestObj.getKetonesValue()/(objects.size()));
            averageUrineTestObj.setProteinValue(averageUrineTestObj.getProteinValue()/(objects.size()));
            averageUrineTestObj.setNitriteValue(averageUrineTestObj.getNitriteValue()/(objects.size()));
            averageUrineTestObj.setGlucoseValue(averageUrineTestObj.getGlucoseValue()/(objects.size()));
            averageUrineTestObj.setPhValue(averageUrineTestObj.getPhValue()/(objects.size()));
            averageUrineTestObj.setSgValue(averageUrineTestObj.getSgValue()/(objects.size()));
            averageUrineTestObj.setLeukocyteValue(averageUrineTestObj.getLeukocyteValue()/(objects.size()));

        }
        return averageUrineTestObj;
    }
    public ArrayList<Double> getRangeValuesForRBC()
    {
        ArrayList<Double> rbcList=new ArrayList<>();
        rbcList.add(7.0);
        rbcList.add(0.0);
        rbcList.add(29.0);
        rbcList.add(140.0);
        rbcList.add(0d);

        return rbcList;
    }
    public ArrayList<Double> getRangeValuesForBiliruin()
    {
        ArrayList<Double> biliruinList=new ArrayList<>();
        biliruinList.add(0.4);
        biliruinList.add(0.0);
        biliruinList.add(0.7);
        biliruinList.add(1.9);
        biliruinList.add(0d);
        return biliruinList;
    }
    public ArrayList<Double> getRangeValuesUroBilogen()
    {
        ArrayList<Double> UroBilogen=new ArrayList<>();
        UroBilogen.add(1.9);
        UroBilogen.add(0.0);
        UroBilogen.add(2.9);
        UroBilogen.add(6.5);
        UroBilogen.add(10.5);

        return UroBilogen;
    }
    public ArrayList<Double> getRangeValuesKetones()
    {
        ArrayList<Double> Ketones=new ArrayList<>();
        Ketones.add(4.0);
        Ketones.add(7.0);
        Ketones.add(29.0);
        Ketones.add(74.0);
        Ketones.add(0d);

        return Ketones;
    }
    public ArrayList<Double> getRangeValuesProtiens()
    {
        ArrayList<Double> Protiens=new ArrayList<>();
        Protiens.add(29.0);
        Protiens.add(60.0);
        Protiens.add(80.0);
        Protiens.add(200.0);
        Protiens.add(600.0);

        return Protiens;
    }
    public ArrayList<Double> getRangeValuesNitrate()
    {
        ArrayList<Double> Nitrate=new ArrayList<>();
        Nitrate.add(0.04);
        Nitrate.add(0.0);
        Nitrate.add(0.05);
        Nitrate.add(0.0);
        Nitrate.add(0.0);

        return Nitrate;
    }
    public ArrayList<Double> getRangeValuesGlucose()
    {
        ArrayList<Double> Glucose=new ArrayList<>();
        Glucose.add(49.0);
        Glucose.add(175.0);
        Glucose.add(375.0);
        Glucose.add(750.0);
        Glucose.add(1499.0);

        return Glucose;
    }
    public ArrayList<Double> getRangeValuespH()
    {
        ArrayList<Double> pH=new ArrayList<>();
        pH.add(4.4);
        pH.add(6.0);
        pH.add(7.5);
        pH.add(8.5);
        pH.add(0.0);

        return pH;
    }
    public ArrayList<Double> getRangeValuesSG()
    {
        ArrayList<Double> SG=new ArrayList<>();
        SG.add(1.002);
        SG.add(1.007);
        SG.add(1.014);
        SG.add(1.022);
        SG.add(1.029);

        return SG;
    }
    public ArrayList<Double> getRangeValuesWBC()
    {
        ArrayList<Double> WBC=new ArrayList<>();
        WBC.add(17d);
        WBC.add(0d);
        WBC.add(300d);
        WBC.add(0d);
        return WBC;
    }
    public boolean setIsDataAvailable(UrineTestModel objRecord) {

        if (objRecord.getRbcValue()>0 || objRecord.getBillirubinValue()>0 || objRecord.getUroboliogenValue()>0 || objRecord.getKetonesValue()> 0 || objRecord.getProteinValue() > 0 || objRecord.getNitriteValue()>0 || objRecord.getGlucoseValue() > 0 || objRecord.getPhValue() > 0 || objRecord.getSgValue()> 0 || objRecord.getLeukocyteValue() > 0)
        {
            return true;
        }
        return false;
    }
    public class ResultDataAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return name.size();
        }

        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            LayoutInflater infalInflater = (LayoutInflater)getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.result_row_items, null);
            ImageView imageView = (ImageView) convertView.findViewById(R.id.img_icon);
            ////
            TextView textView = (TextView) convertView.findViewById(R.id.Itemname);
            textView.setText(name.get(position));
            ////
            TextView tx_num = (TextView) convertView.findViewById(R.id.number);
            UrineTestModel rm=arrayListresultModel.get(0);
            if(position==0){
                tx_num.setText(""+getRbcText(rm.getRbcValue()));
                String s=tx_num.getText().toString();
                if(s.contains("-ve")){
                    Log.e("snasmxn",""+s);
                    imageView.setImageResource(R.drawable.ic_goodmood);

                }else {
                    Log.e("elsetext",""+s);
                    imageView.setImageResource(R.drawable.ic_angry);

                }
            }else if(position==1){
                tx_num.setText(""+getBillirubinText(rm.getBillirubinValue()));
                String s=tx_num.getText().toString();
                if(s.contains("-ve")){
                    Log.e("snasmxn",""+s);
                    imageView.setImageResource(R.drawable.ic_goodmood);

                }else {
                    Log.e("elsetext",""+s);
                    imageView.setImageResource(R.drawable.ic_angry);

                }
            }else if(position==2){
                tx_num.setText(""+getUroboliogenText(rm.getUroboliogenValue()));
                String s=tx_num.getText().toString();
                if(s.contains("-ve")){
                    Log.e("snasmxn",""+s);
                    imageView.setImageResource(R.drawable.ic_goodmood);

                }else {
                    Log.e("elsetext",""+s);
                    imageView.setImageResource(R.drawable.ic_angry);

                }
            }else if(position==3){
                tx_num.setText(""+getKetonesText(rm.getKetonesValue()));
                String s=tx_num.getText().toString();
                if(s.contains("-ve")){
                    Log.e("snasmxn",""+s);
                    imageView.setImageResource(R.drawable.ic_goodmood);

                }else {
                    Log.e("elsetext",""+s);
                    imageView.setImageResource(R.drawable.ic_angry);

                }
            }else if(position==4){
                tx_num.setText(""+getProteinText(rm.getProteinValue()));
                String s=tx_num.getText().toString();
                if(s.contains("-ve")){
                    Log.e("snasmxn",""+s);
                    imageView.setImageResource(R.drawable.ic_goodmood);

                }else {
                    Log.e("elsetext",""+s);
                    imageView.setImageResource(R.drawable.ic_angry);

                }
            }else if(position==5){
                tx_num.setText(""+getNitriteText(rm.getNitriteValue()));
                String s=tx_num.getText().toString();
                if(s.contains("-ve")){
                    Log.e("snasmxn",""+s);
                    imageView.setImageResource(R.drawable.ic_goodmood);

                }else {
                    Log.e("elsetext",""+s);
                    imageView.setImageResource(R.drawable.ic_angry);

                }
            }else if(position==6){
                tx_num.setText(""+getGlucoseText(rm.getGlucoseValue()));
                String s=tx_num.getText().toString();
                if(s.contains("-ve")){
                    Log.e("snasmxn",""+s);
                    imageView.setImageResource(R.drawable.ic_goodmood);

                }else {
                    Log.e("elsetext",""+s);
                    imageView.setImageResource(R.drawable.ic_angry);

                }
            }else if(position==7){
                tx_num.setText(""+getPhText(rm.getPhValue()));
                String s=tx_num.getText().toString();
                if(s.contains("-ve")){
                    Log.e("snasmxn",""+s);
                    imageView.setImageResource(R.drawable.ic_goodmood);

                }else {
                    Log.e("elsetext",""+s);
                    imageView.setImageResource(R.drawable.ic_angry);

                }
            }else if(position==8){
                tx_num.setText(""+getSgText(rm.getSgValue()));
                String s=tx_num.getText().toString();
                if(s.contains("-ve")){
                    Log.e("snasmxn",""+s);
                    imageView.setImageResource(R.drawable.ic_goodmood);

                }else {
                    Log.e("elsetext",""+s);
                    imageView.setImageResource(R.drawable.ic_angry);

                }
            }else if(position==9){
                tx_num.setText(""+getLeukocyteText(rm.getLeukocyteValue()));
                String s=tx_num.getText().toString();
                if(s.contains("-ve")){
                    Log.e("snasmxn",""+s);
                    imageView.setImageResource(R.drawable.ic_goodmood);

                }else {
                    Log.e("elsetext",""+s);
                    imageView.setImageResource(R.drawable.ic_angry);

                }
             }
              return convertView;

        }
    }

}
