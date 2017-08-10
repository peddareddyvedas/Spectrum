package com.example.dell.spectrum.TapbarFragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
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
import android.widget.TextView;

import com.example.dell.spectrum.R;
import com.example.dell.spectrum.Graphs.*;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import junit.framework.TestResult;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import static com.example.dell.spectrum.R.id.chart;

/**
 * Created by Rise on 31/05/2017.
 */

public class TestResultpageActivity extends AppCompatActivity {
   // private ArrayList<com.example.dell.spectrum.Graphs.Model> productList;

    LineChart mChart;
    TextView year;
    Calendar calander;
    Button left,right;
    String Year;
    ListView lview;
    SimpleDateFormat simpledateformat;
    ArrayList<Float> yearArray;
    public static TextView txtYearTotalsteps, txtYearAvg;
    ArrayList<StepsMainModel> array;

    int dayCount = 12;
    Button share,menu,arrow;
    LinearLayout sharepage;
    LinearLayout gluose;


    public boolean mchecked = false;

    ArrayList<String> name;
    ArrayList<Integer> images;
    ArrayList<Integer> Images;
    ArrayList<String> symbols;
    ArrayList<Integer> numbers;

    public int selecteditem;
    public int position;
    ResultFragment context;
    TestResult adapter;

    @Nullable
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityresultpage_test);
      //  productList = new ArrayList<>();
       actions();
    }



    public void actions( ){
        mChart = (LineChart) findViewById(chart);


        LineChart lineChart = (LineChart) findViewById(chart);
        ArrayList<Entry> entries = new ArrayList<>();
        entries.add(new Entry(10f, 0));
        entries.add(new Entry(20f, 1));
        entries.add(new Entry(45f, 2));
        entries.add(new Entry(40f, 3));
        entries.add(new Entry(30f, 4));
        entries.add(new Entry(50f, 5));
        entries.add(new Entry(20f,6));
        entries.add(new Entry(45f, 7));
        entries.add(new Entry(40f, 8));
        entries.add(new Entry(30f, 9));
        entries.add(new Entry(50f, 10));
        entries.add(new Entry(20f,11));

        LineDataSet dataset =new LineDataSet(entries,"");

        ArrayList<String> labels = new ArrayList<String>();
        labels.add("JAN");
        labels.add("FEB");
        labels.add("MAR");
        labels.add("API");
        labels.add("MAY");
        labels.add("JUN");
        labels.add("JLY");
        labels.add("AUG");
        labels.add("SEP");
        labels.add("OCT");
        labels.add("NOV");
        labels.add("DEC");

      //  LineData data = new LineData(labels, dataset);
      //  lineChart.setData(data);
        lineChart.getXAxis().setPosition(XAxis.XAxisPosition.BOTTOM);
        lineChart.setDrawBorders(false);
        lineChart.setDrawGridBackground(false);
        lineChart.getAxisRight().setEnabled(false);
        lineChart.getAxisLeft().setDrawGridLines(false);
        lineChart.getXAxis().setDrawGridLines(false);
        dataset.setDrawCircles(false);
        dataset.setLineWidth((float) 3.0);
        dataset.setColor(getResources().getColor(R.color.colorWhite));
        lineChart.getXAxis().setTextColor(getResources().getColor(R.color.colorWhite));
        lineChart.getAxis(YAxis.AxisDependency.LEFT).setTextColor(getResources().getColor(R.color.colorWhite));
      //  lineChart.setDescription("");
        lineChart.setDoubleTapToZoomEnabled(false);
        lineChart.animateXY(2000, 2000);
        lineChart.invalidate();
        year= (TextView) findViewById(R.id.start_txt_month);
        right=(Button)findViewById(R.id.btnright);
        left=(Button) findViewById(R.id.btnleft);
        calander = Calendar.getInstance();
        // simpledateformat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        simpledateformat = new SimpleDateFormat("yyyy");
        Year = simpledateformat.format(calander.getTime());
        year.setText(Year);
        loadOneYearData();


        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                calander.add(Calendar.YEAR, -1);
                Year = simpledateformat.format(calander.getTime());
                Log.v("PREVIOUS DATE : ", Year);
                year.setText(Year);
                loadOneYearData();




            }




        });
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calander.add(Calendar.YEAR, 1);
                Year = simpledateformat.format(calander.getTime());
                Log.v("NEXT DATE : ", Year);
                year.setText(Year);
                loadOneYearData();



            }
        });
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

        images = new ArrayList<Integer>();
        images.add(R.drawable.ic_goodmood);
        images.add(R.drawable.ic_angry);
        images.add(R.drawable.ic_angry);
        images.add(R.drawable.ic_angry);
        images.add(R.drawable.ic_goodmood);
        images.add(R.drawable.ic_goodmood);
        images.add(R.drawable.ic_angry);
        images.add(R.drawable.ic_goodmood);
        images.add(R.drawable.ic_angry);
        images.add(R.drawable.ic_angry);


        symbols = new ArrayList<String>();
        symbols.add("-");
        symbols.add("+");
        symbols.add("+");
        symbols.add("+++");
        symbols.add("-");
        symbols.add("-");
        symbols.add("++");
        symbols.add("-");
        symbols.add("-/+");
        symbols.add("++");


        numbers = new ArrayList<Integer>();
        numbers.add(7);
        numbers.add((int) 0.7);
        numbers.add((int) 2.8);
        numbers.add(70);
        numbers.add(28);
        numbers.add((int) 0.03);
        numbers.add(400);
        numbers.add((int) 4.2);
        numbers.add((int) 1.005);
        numbers.add(250);


        Images = new ArrayList<Integer>();
        Images.add(R.drawable.ic_next);
        Images.add(R.drawable.ic_next);
        Images.add(R.drawable.ic_next);
        Images.add(R.drawable.ic_next);
        Images.add(R.drawable.ic_next);
        Images.add(R.drawable.ic_next);
        Images.add(R.drawable.ic_next);
        Images.add(R.drawable.ic_next);
        Images.add(R.drawable.ic_next);
        Images.add(R.drawable.ic_next);


        lview = (ListView) findViewById(R.id.testresultlist);
        adapter = new TestResult();
        lview.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        lview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                //   startActivity(new Intent(getActivity(), TestResultpageActivity.class));


            }

        });

    }
    private void loadOneYearData() {
        // yearData = ProcessData.getInstance().getTotalStepsCaloriesDistanceFortheYearly(array,simpledateformat.format(calander.getTime()) );
        //Log.e("yearsimpledateforma", "" + yearData);
        yearArray = new ArrayList<Float>();

        for (int i = 0; i < dayCount; i++) {
            yearArray.add((float) 0.0);
        }


        if (array != null && array.size() > 0) {
            for (int i = 0; i < dayCount; i++) {
                SimpleDateFormat yearformat = new SimpleDateFormat("yyyy");
                String year = yearformat.format(calander.getTime());
                String monthText = String.valueOf(i + 1);
                if (i < 9) {
                    monthText = "0" + monthText;
                }
                Log.e("MonthString", "" + monthText);
                String queryString = year + "/" + monthText;
                Log.e("queryString", "" + queryString);



                average(yearArray);

            }
        }

        Log.e("yearArray", String.valueOf(yearArray));

    }
    public static double average(ArrayList<Float> stepsyearArray) {
        // 'average' is undefined if there are no elements in the list.
        if (stepsyearArray == null || stepsyearArray.isEmpty())
            return 0.0;
        // Calculate the summation of the elements in the list
        int n = stepsyearArray.size();
        // Iterating manually is faster than using an enhanced for loop.
        long sumyearSteps = 0;
        for (int i = 0; i < n; i++)
            sumyearSteps += stepsyearArray.get(i);
        Log.e("sum", "" + sumyearSteps);
        // We don't want to perform an integer division, so the cast is mandatory.
        String avg = String.valueOf(((double) sumyearSteps) / n);
        Log.e("avg", "" + avg);
        double d = Double.parseDouble(avg);
        DecimalFormat df = new DecimalFormat("##");
        txtYearAvg.setText(df.format(d));
        txtYearTotalsteps.setText("" + sumyearSteps);
        //  Log.e("txtStepstotal",""+txtYearTotalsteps);

        return ((double) sumyearSteps) / n;

    }





    public  void ids(View view){
        arrow=(Button)view.findViewById(R.id.btn_down);
        arrow.setOnClickListener(mdown);
        gluose=(LinearLayout)view.findViewById(R.id.l1_glucose);
    }
    View.OnClickListener mdown=new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            if(gluose.getVisibility()==View.VISIBLE &&mChart.getVisibility()==View.VISIBLE)
            {
                gluose.setVisibility(View.GONE);
                mChart.setVisibility(View.GONE);
                lview.setVisibility(View.GONE);
                LinearLayout layout = (LinearLayout) findViewById(R.id.charttext);
                layout.setVisibility(View.VISIBLE);
                LinearLayout arrow = (LinearLayout) findViewById(R.id.downarrow);
                arrow.setBackgroundColor(getResources().getColor(R.color.colorWhite));

            }else {
                gluose.setVisibility(View.VISIBLE);
                mChart.setVisibility(View.VISIBLE);
                lview.setVisibility(View.VISIBLE);
                LinearLayout layout = (LinearLayout)findViewById(R.id.charttext);
                layout.setVisibility(View.GONE);
                LinearLayout arrow = (LinearLayout) findViewById(R.id.downarrow);
                arrow.setBackgroundColor(getResources().getColor(R.color.colorBlue));
            }
        }
    };

    public class  TestResult extends BaseAdapter {

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
            LayoutInflater infalInflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.testresult_listview, null);
            ImageView imageView = (ImageView) convertView.findViewById(R.id.icon);
            ImageView imageView1 = (ImageView) convertView.findViewById(R.id.next);
            TextView textView = (TextView) convertView.findViewById(R.id.Itemname);
            TextView textView1 = (TextView) convertView.findViewById(R.id.pos_negsign);
            TextView textView2 = (TextView) convertView.findViewById(R.id.number);
            imageView.setImageResource(images.get(position));
            textView.setText(name.get(position));
            imageView1.setImageResource(Images.get(position));
            //  textView1.setText(name.get(position));
            //  textView2.setText(name.get(position));
            return convertView;

        }
    }


}
