package com.example.dell.spectrum.Graphs;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.dell.spectrum.R;
import com.example.dell.spectrum.TapbarFragments.RecordFragment;
import com.example.dell.spectrum.TapbarFragments.ResultFragment;
import com.example.dell.spectrum.TapbarFragments.UrineTestModel;
import com.github.mikephil.charting.charts.CombinedChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.CombinedData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.*;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import static com.example.dell.spectrum.R.id.chart;
/**
 * Created by Vedas on 11/10/2016.
 */


public class WeekchartsFragment extends Fragment {
    ArrayList<String> list = new ArrayList<String>();;
    View view;
    XAxis xAxis;
    String strWeek, EndsWeek;
    String Week;
    ListView lview;
    TextView StartWeek, EndWeek;
    Calendar WeekStartTime, WeekEndTime;
    SimpleDateFormat simpledateformat, simpledateformat2;
    WeekFormatter weekTextFormatter;
    ArrayList<Float> weekArray;
    ArrayList<UrineTestModel> filteredArray;
    Button right,left;
    ImageButton back;
    Button share,menu,arrow;
    LinearLayout sharepage;
    RelativeLayout gluose;
    ArrayList<String> name;
    ArrayList<Integer> Images;
    public int position;
    WeeklistviewAdapter adapter;
    DecimalFormat df;
    CombinedChart mChart;
    protected String[] mWeek = new String[] {
            "Sun", "Mon", "Tue", "Wed", "Thu", "Fri","Sat"
    };
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        view = inflater.inflate(R.layout.fragment_week, container, false);
        Toolbar rlToolBar = (Toolbar)view. findViewById(R.id.toolbar_graph);
        ((AppCompatActivity)getActivity()).setSupportActionBar(rlToolBar);
         df = new DecimalFormat("#.##");
        mChart = (CombinedChart) view.findViewById(R.id.chart_combine_week);
        StartWeek = (TextView) view.findViewById(R.id.start_txt_week);
        EndWeek = (TextView) view.findViewById(R.id.End_txt_week);
        right=(Button) view.findViewById(R.id.btn_date_right);
        left=(Button) view.findViewById(R.id.btn_date_left);
        back= (ImageButton) view.findViewById(R.id.backimage);
        ids(view);

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

         lview = (ListView) view.findViewById(R.id.week_list);
        adapter = new WeeklistviewAdapter();
        lview.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        lview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {


            }

        });
        weekDates();
        leftAndRightActions();
        mChart.setBackgroundColor(Color.WHITE);
        //mChart.setDrawGridBackground(true);
        mChart.setDrawBarShadow(false);
        mChart.setHighlightFullBarEnabled(false);


        mChart.getXAxis().setPosition(XAxis.XAxisPosition.BOTTOM);
        mChart.setDrawBorders(false);
        mChart.setDrawGridBackground(false);
        mChart.getAxisRight().setEnabled(false);
        mChart.getAxisLeft().setDrawGridLines(false);
        mChart.getXAxis().setDrawGridLines(false);
        mChart.getDescription().setText("");

        // mChart.getXAxis().setLabelRotationAngle(45f);

        mChart.setDoubleTapToZoomEnabled(false);
        mChart.animateXY(2000, 2000);
        mChart.invalidate();



        // draw bars behind lines
        mChart.setDrawOrder(new CombinedChart.DrawOrder[]{
                CombinedChart.DrawOrder.BAR,  CombinedChart.DrawOrder.LINE
        });

        Legend l = mChart.getLegend();
        l.setWordWrapEnabled(true);
        l.setVerticalAlignment(Legend.LegendVerticalAlignment.BOTTOM);
        l.setHorizontalAlignment(Legend.LegendHorizontalAlignment.CENTER);
        l.setOrientation(Legend.LegendOrientation.HORIZONTAL);

        YAxis rightAxis = mChart.getAxisRight();
        rightAxis.setDrawGridLines(false);
        mChart.getLegend().setEnabled(false);
        rightAxis.setAxisMinimum(0f); // this replaces setStartAtZero(true)

//

        XAxis xAxis = mChart.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setAxisMinimum(0f);
        xAxis.setGranularity(1f);
        xAxis.setValueFormatter(new com.github.mikephil.charting.formatter.IAxisValueFormatter() {
            @Override
            public String getFormattedValue(float value, AxisBase axis) {
                return mWeek[(int) value % mWeek.length];
            }
        });

        CombinedData data = new CombinedData();

        data.setData( generateLineData());
        data.setData(generateBarData());

        xAxis.setAxisMaximum(data.getXMax() + 0.25f);
        mChart.setData(data);
        mChart.invalidate();
        return view;
    }
    public  void ids(View view){
        arrow=(Button)view.findViewById(R.id.btn_down);
        arrow.setOnClickListener(mdown);
        gluose=(RelativeLayout) view.findViewById(R.id.l1_glucose);
    }
    public void leftAndRightActions(){
        left.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                WeekStartTime.add(Calendar.DAY_OF_WEEK_IN_MONTH, -1);
                strWeek= simpledateformat.format(WeekStartTime.getTime());
                Log.e("strWeek ",""+strWeek);
                Log.v("PREVIOUS WEEK : ", Week);
                StartWeek.setText(strWeek);
                WeekEndTime.add(Calendar.DAY_OF_WEEK_IN_MONTH, -1);
                Week = simpledateformat2.format(WeekEndTime.getTime());
                Log.v("NEXTWEEK :", Week);
                EndWeek.setText(Week);
                //loadOneWeekData();
                // Toast.makeText(getActivity(),"left",Toast.LENGTH_SHORT).show();

            }

        });
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                WeekEndTime.add(Calendar.DAY_OF_WEEK_IN_MONTH, 1);
                Week = simpledateformat2.format(WeekEndTime.getTime());
                Log.v("NEXT WEEK : ", Week);
                EndWeek.setText(Week);
                WeekStartTime.add(Calendar.DAY_OF_WEEK_IN_MONTH,1);
                strWeek = simpledateformat.format(WeekStartTime.getTime());
                //calendar.add(Calendar.DAY_OF_WEEK_IN_MONTH,1);
                StartWeek.setText(strWeek);
               // loadOneWeekData();


                // Toast.makeText(getActivity(),"right",Toast.LENGTH_SHORT).show();

            }
        });

    }
    private LineData generateLineData() {

        LineData d = new LineData();

        ArrayList<Entry> entries = new ArrayList<Entry>();

        entries = getLineEntriesData(entries);

        LineDataSet set = new LineDataSet(entries, "");
        //set.setColor(Color.rgb(240, 238, 70));
        //set.setColors(ColorTemplate.COLORFUL_COLORS);
        set.setLineWidth(2.5f);

        set.setCircleColor(Color.rgb(0, 0, 0));
        set.setFillColor(Color.rgb(0, 0, 0));
   set.setMode(LineDataSet.Mode.CUBIC_BEZIER);
        set.setDrawValues(true);
        set.setValueTextSize(10f);
        set.setValueTextColor(Color.rgb(0, 0, 0));
        set.setColor(Color.BLACK);

        //  set.setAxisDependency(YAxis.AxisDependency.LEFT);
        d.addDataSet(set);

        return d;
    }

    private ArrayList<Entry> getLineEntriesData(ArrayList<Entry> entries){
        entries.add(new Entry(0, 20));

        entries.add(new Entry(1, 20));
        entries.add(new Entry(2, 10));
        entries.add(new Entry(3, 8));
        entries.add(new Entry(4, 40));
        entries.add(new Entry(5, 37));
        entries.add(new Entry(6,15));
        //  entries.add(new Entry(7, 40));

        return entries;
    }

    private BarData generateBarData() {

        ArrayList<BarEntry> entries = new ArrayList<BarEntry>();
        entries = getBarEnteries(entries);

        BarDataSet set1 = new BarDataSet(entries, "");
        set1.setColor(Color.rgb(60, 220, 78));
        set1.setColors(ColorTemplate.COLORFUL_COLORS);
        set1.setValueTextColor(Color.rgb(60, 220, 78));
        set1.setValueTextSize(10f);
        set1.setAxisDependency(YAxis.AxisDependency.LEFT);


        float barWidth = 0.45f; // x2 dataset


        BarData d = new BarData(set1);
        d.setBarWidth(barWidth);


        return d;
    }

    private ArrayList<BarEntry> getBarEnteries(ArrayList<BarEntry> entries){
        entries.add(new BarEntry(0, 20));
        entries.add(new BarEntry(1, 20));
        entries.add(new BarEntry(2, 10));
        entries.add(new BarEntry(3, 8));
        entries.add(new BarEntry(4, 40));
        entries.add(new BarEntry(5, 37));
        entries.add(new BarEntry(6, 15));
        // entries.add(new BarEntry(7, 40));
        return  entries;
    }
    public void weekDates(){
        WeekStartTime = Calendar.getInstance();
        //System.out.println("Current week = " + Calendar.DAY_OF_WEEK);
        WeekStartTime.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        simpledateformat = new SimpleDateFormat("yyyy/MM/dd");
        Week = simpledateformat.format(WeekStartTime.getTime());
        // calendar.add(Calendar.DATE, 6);
        StartWeek.setText(Week);
        strWeek = StartWeek.getText().toString();
        Log.e("startweek:", "" + strWeek);

        WeekEndTime = Calendar.getInstance();
        //System.out.println("Current week = " + Calendar.DAY_OF_WEEK);
        WeekEndTime.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
        simpledateformat2 = new SimpleDateFormat("-MM/dd");
        Week = simpledateformat2.format(WeekEndTime.getTime());
        EndWeek.setText(Week);
        EndsWeek = EndWeek.getText().toString();
        Log.e("EndWeek:", "" + EndsWeek);

        for (int i = 1; i <= 10; i++) {
            list.add("" + i);
        }
    }

    View.OnClickListener mdown=new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            if(gluose.getVisibility()==View.VISIBLE &&mChart.getVisibility()==View.VISIBLE)
            {
                mChart.setVisibility(View.GONE);
                TextView glouse=(TextView)getActivity().findViewById(R.id.glucose);
                glouse.setVisibility(View.INVISIBLE);
                LinearLayout layout = (LinearLayout) getActivity().findViewById(R.id.charttext);
                layout.setVisibility(View.VISIBLE);
                RelativeLayout arrow = (RelativeLayout) getActivity().findViewById(R.id.l1_glucose);
                arrow.setBackgroundColor(getResources().getColor(R.color.colorWhite));

            }else {
                TextView glouse=(TextView)getActivity().findViewById(R.id.glucose);
                glouse.setVisibility(View.VISIBLE);
                gluose.setVisibility(View.VISIBLE);
                mChart.setVisibility(View.VISIBLE);
                LinearLayout layout = (LinearLayout) getActivity().findViewById(R.id.charttext);
                layout.setVisibility(View.GONE);
                RelativeLayout arrow = (RelativeLayout) getActivity().findViewById(R.id.l1_glucose);
                arrow.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            }
        }
    };
    private  void  loadOneWeekData() {
        weekTextFormatter = new WeekFormatter();
        weekTextFormatter.loadXAxisValues(WeekStartTime.getTime());
        weekArray = new ArrayList<Float>();
        filteredArray=new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            weekArray.add((float) 0.0);
        }
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy/MM/dd");

        for (int i = 0; i <= 6; i++) {
                Calendar startCalendeGraphrDate = Calendar.getInstance();
                startCalendeGraphrDate.setTime(WeekStartTime.getTime());
                startCalendeGraphrDate.add(Calendar.DATE, i);
                String currentDate = dateformat.format(startCalendeGraphrDate.getTime());
                Log.e("simpledateformat", "" + dateformat.format(startCalendeGraphrDate.getTime()));
              try {
                  filteredArray=  ResultFragment.getFilterArrayForDateString(currentDate);
                  Log.e("filteredArray",""+filteredArray);
                 } catch (ParseException e) {
                 e.printStackTrace();
                 }
            if (filteredArray.size()==0){
                Log.e("weekarraynull","call");
           } else{
                UrineTestModel urineTestModel =filteredArray.get(i);
                weekArray.set(i, (float) urineTestModel.getBillirubinValue());
            }
            Log.e("weekArray",""+weekArray);

        }
    }
public class WeeklistviewAdapter  extends BaseAdapter {

    @Override
    public int getCount() {
        Log.e("size",""+name.size());
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
        convertView = infalInflater.inflate(R.layout.week_list_adapter, null);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.img_icon);
        //imageView.setImageResource(images.get(position));

        TextView textView = (TextView) convertView.findViewById(R.id.Itemname);
        textView.setText(name.get(position));

        TextView textView1 = (TextView) convertView.findViewById(R.id.number);
        TextView textView2 = (TextView) convertView.findViewById(R.id.type_text);
        UrineTestModel rm= RecordFragment.filterList.get(0);
        if(position==0){
            textView1.setText(""+ResultFragment.getRbcText(Double.parseDouble(df.format(rm.getRbcValue()))));
            String s=textView1.getText().toString();
            if(s.contains("-ve")){
                Log.e("snasmxn",""+s);
                imageView.setImageResource(R.drawable.ic_goodmood);
                textView2.setText("Normal");
                textView2.setTextColor(Color.parseColor("#2196f3"));
            }else {
                Log.e("elsetext",""+s);
                imageView.setImageResource(R.drawable.ic_angry);
                textView2.setText("Abnormal");
                textView2.setTextColor(Color.parseColor("#FF0000"));
            }

        }else if(position==1){
            textView1.setText(""+ResultFragment.getBillirubinText(Double.parseDouble(df.format(rm.getBillirubinValue()))));
            String s=textView1.getText().toString();
            if(s.contains("-ve")){
                Log.e("snasmxn",""+s);
                imageView.setImageResource(R.drawable.ic_goodmood);
                textView2.setText("Normal");
                textView2.setTextColor(Color.parseColor("#2196f3"));
            }else {
                Log.e("elsetext",""+s);
                imageView.setImageResource(R.drawable.ic_angry);
                textView2.setText("Abnormal");
                textView2.setTextColor(Color.parseColor("#FF0000"));
            }
        }else if(position==2){
            textView1.setText(""+ResultFragment.getUroboliogenText(Double.parseDouble(df.format(rm.getUroboliogenValue()))));
            String s=textView1.getText().toString();
            if(s.contains("-ve")){
                Log.e("snasmxn",""+s);
                imageView.setImageResource(R.drawable.ic_goodmood);
                textView2.setText("Normal");
                textView2.setTextColor(Color.parseColor("#2196f3"));
            }else {
                Log.e("elsetext",""+s);
                imageView.setImageResource(R.drawable.ic_angry);
                textView2.setText("Abnormal");
                textView2.setTextColor(Color.parseColor("#FF0000"));
            }
        }else if(position==3){
            textView1.setText(""+ResultFragment.getKetonesText(Double.parseDouble(df.format(rm.getKetonesValue()))));
            String s=textView1.getText().toString();
            if(s.contains("-ve")){
                Log.e("snasmxn",""+s);
                imageView.setImageResource(R.drawable.ic_goodmood);
                textView2.setText("Normal");
                textView2.setTextColor(Color.parseColor("#2196f3"));
            }else {
                Log.e("elsetext",""+s);
                imageView.setImageResource(R.drawable.ic_angry);
                textView2.setText("Abnormal");
                textView2.setTextColor(Color.parseColor("#FF0000"));
            }
        }else if(position==4){
            textView1.setText(""+ResultFragment.getProteinText(Double.parseDouble(df.format(rm.getProteinValue()))));
            String s=textView1.getText().toString();
            if(s.contains("-ve")){
                Log.e("snasmxn",""+s);
                imageView.setImageResource(R.drawable.ic_goodmood);
                textView2.setText("Normal");
                textView2.setTextColor(Color.parseColor("#2196f3"));
            }else {
                Log.e("elsetext",""+s);
                imageView.setImageResource(R.drawable.ic_angry);
                textView2.setText("Abnormal");
                textView2.setTextColor(Color.parseColor("#FF0000"));
            }
        }else if(position==5){
            textView1.setText(""+ResultFragment.getNitriteText(Double.parseDouble(df.format(rm.getNitriteValue()))));
            String s=textView1.getText().toString();
            if(s.contains("-ve")){
                Log.e("snasmxn",""+s);
                imageView.setImageResource(R.drawable.ic_goodmood);
                textView2.setText("Normal");
                textView2.setTextColor(Color.parseColor("#2196f3"));
            }else {
                Log.e("elsetext",""+s);
                imageView.setImageResource(R.drawable.ic_angry);
                textView2.setText("Abnormal");
                textView2.setTextColor(Color.parseColor("#FF0000"));
            }
        }else if(position==6){
            textView1.setText(""+ResultFragment.getGlucoseText(Double.parseDouble(df.format(rm.getGlucoseValue()))));
            String s=textView1.getText().toString();
            if(s.contains("-ve")){
                Log.e("snasmxn",""+s);
                imageView.setImageResource(R.drawable.ic_goodmood);
                textView2.setText("Normal");
                textView2.setTextColor(Color.parseColor("#2196f3"));
            }else {
                Log.e("elsetext",""+s);
                imageView.setImageResource(R.drawable.ic_angry);
                textView2.setText("Abnormal");
                textView2.setTextColor(Color.parseColor("#FF0000"));
            }
        }else if(position==7){
            textView1.setText(""+ResultFragment.getPhText(Double.parseDouble(df.format(rm.getPhValue()))));
            String s=textView1.getText().toString();
            if(s.contains("-ve")){
                Log.e("snasmxn",""+s);
                imageView.setImageResource(R.drawable.ic_goodmood);
                textView2.setText("Normal");
                textView2.setTextColor(Color.parseColor("#2196f3"));
            }else {
                Log.e("elsetext",""+s);
                imageView.setImageResource(R.drawable.ic_angry);
                textView2.setText("Abnormal");
                textView2.setTextColor(Color.parseColor("#FF0000"));
            }
        }else if(position==8){
            textView1.setText(""+ResultFragment.getSgText(Double.parseDouble(df.format(rm.getSgValue()))));
            String s=textView1.getText().toString();
            if(s.contains("-ve")){
                Log.e("snasmxn",""+s);
                imageView.setImageResource(R.drawable.ic_goodmood);
                textView2.setText("Normal");
                textView2.setTextColor(Color.parseColor("#2196f3"));
            }else {
                Log.e("elsetext",""+s);
                imageView.setImageResource(R.drawable.ic_angry);
                textView2.setText("Abnormal");
                textView2.setTextColor(Color.parseColor("#FF0000"));
            }
        }else if(position==9){
            textView1.setText(""+ResultFragment.getLeukocyteText(Double.parseDouble(df.format(rm.getLeukocyteValue()))));
            String s=textView1.getText().toString();
            if(s.contains("-ve")){
                Log.e("snasmxn",""+s);
                imageView.setImageResource(R.drawable.ic_goodmood);
                textView2.setText("Normal");
                textView2.setTextColor(Color.parseColor("#2196f3"));
            }else {
                Log.e("elsetext",""+s);
                imageView.setImageResource(R.drawable.ic_angry);
                textView2.setText("Abnormal");
                textView2.setTextColor(Color.parseColor("#FF0000"));
            }
        }
        return convertView;

    }
}

    View.OnClickListener mShareListener=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            View viewScreen = sharepage.getRootView();
            viewScreen.buildDrawingCache();
            viewScreen.setDrawingCacheEnabled(true);
            viewScreen.destroyDrawingCache();
            Bitmap screenshot1 = Bitmap.createBitmap(viewScreen.getWidth(), viewScreen.getHeight(), Bitmap.Config.RGB_565);
            viewScreen.draw(new Canvas(screenshot1));
            File mfile2 = savebitmap2(screenshot1);
            final Uri screenshotUri = Uri.fromFile(mfile2);

            Intent shareIntent = new Intent();
            shareIntent.setAction(Intent.ACTION_SEND);
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Spectrm Project");
            shareIntent.putExtra(Intent.EXTRA_TEXT, "" + getResources().getString(R.string.sms_body));
            shareIntent.putExtra(Intent.EXTRA_STREAM, screenshotUri);
            shareIntent.setType("image/*");
            shareIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
            startActivity(Intent.createChooser(shareIntent, getResources().getString(R.string.share_satus)));

        }
    };
    /**
     * Called when take the screen shot
     */

    private File savebitmap2(Bitmap bmp) {
        String temp = "SleepHistory";

        OutputStream outStream = null;
        String path = Environment.getExternalStorageDirectory()
                .toString();
        new File(path + "/SplashItTemp2").mkdirs();
        File file = new File(path + "/SplashItTemp2", temp + ".png");
        if (file.exists()) {
            file.delete();
            file = new File(path + "/SplashItTemp2", temp + ".png");
        }

        try {
            outStream = new FileOutputStream(file);
            bmp.compress(Bitmap.CompressFormat.PNG, 100, outStream);
            outStream.flush();
            outStream.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return file;
    }

}