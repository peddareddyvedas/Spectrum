package com.example.dell.spectrum.Graphs;

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
import android.widget.Toast;

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
import com.github.mikephil.charting.utils.ColorTemplate;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;


/**
 * Created by Vedas on 11/11/2016.
 */

public class MonthchartsFragment extends Fragment {

    //private ArrayList<Model> productList;

    //LineChart mChart;
    ListView lview;
    Button share, menu, arrow;
    RelativeLayout gluose;
    TextView txtCurrentMonth;
    Calendar calendar;
    TextView txtMonth;
    SimpleDateFormat simpleDateFormat;
    ArrayList<Float> monthArray;
    public static TextView txtMonthAvg, txtMonthTotalsteps;

    String Month;
    TextView StartMonth, EndMonth;
    //HashMap<String, ArrayList<Model>> monthData;

    ArrayList<StepsMainModel> array;
    Button right, left;

    View view;

    public boolean mchecked = false;

    ArrayList<String> name;
    ArrayList<Integer> images;
    ArrayList<Integer> Images;
    ArrayList<String> symbols;
    ArrayList<Integer> numbers;

    public int selecteditem;
    public int position;
    DecimalFormat df;


    MonthlistviewAdapter adapter;

    private CombinedChart mChart;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_month, container, false);
        df = new DecimalFormat("#.##");
        ids(view);
        actions(view);
        return view;
    }

    private void actions(View view) {
        mChart = (CombinedChart) view.findViewById(R.id.chart_combine_month);

        txtMonth = (TextView) view.findViewById(R.id.start_txt_month);
        right = (Button) view.findViewById(R.id.btn_month_right);
        left = (Button) view.findViewById(R.id.btn_month_left);
        calendar = Calendar.getInstance();
        // simpledateformat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        simpleDateFormat = new SimpleDateFormat("yyyy/MM");

        Month = simpleDateFormat.format(calendar.getTime());
        txtMonth.setText(Month);


        loadOneMonthData();


        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                calendar.add(Calendar.MONTH, -1);
                Month = simpleDateFormat.format(calendar.getTime());
                Log.v("PREVIOUS DATE : ", Month);
                txtMonth.setText(Month);
                loadOneMonthData();

                Toast.makeText(getActivity(), "left", Toast.LENGTH_SHORT).show();

            }

        });
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calendar.add(Calendar.MONTH, 1);
                Month = simpleDateFormat.format(calendar.getTime());
                Log.v("NEXT DATE : ", Month);
                txtMonth.setText(Month);
                loadOneMonthData();

                Toast.makeText(getActivity(), "right", Toast.LENGTH_SHORT).show();

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


        ListView lview = (ListView) view.findViewById(R.id.month_list);

        adapter = new MonthlistviewAdapter();
        lview.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        lview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {


            }

        });


        mChart.setBackgroundColor(Color.WHITE);
        mChart.getDescription().setText("");
        mChart.setDrawBarShadow(false);
        mChart.setHighlightFullBarEnabled(false);
        mChart.getXAxis().setPosition(XAxis.XAxisPosition.BOTTOM);
        mChart.setDrawBorders(false);
        mChart.setDrawGridBackground(false);
        mChart.getAxisRight().setEnabled(false);
        mChart.getAxisLeft().setDrawGridLines(false);
        mChart.getXAxis().setDrawGridLines(false);
        mChart.setDoubleTapToZoomEnabled(false);
        mChart.animateXY(2000, 2000);
        mChart.invalidate();
        mChart.getLegend().setEnabled(false);


        Legend l = mChart.getLegend();
        l.setWordWrapEnabled(true);
        l.setVerticalAlignment(Legend.LegendVerticalAlignment.BOTTOM);
        l.setHorizontalAlignment(Legend.LegendHorizontalAlignment.CENTER);
        l.setOrientation(Legend.LegendOrientation.HORIZONTAL);

        YAxis rightAxis = mChart.getAxisRight();
        rightAxis.setDrawGridLines(false);
        rightAxis.setAxisMinimum(0f); // this replaces setStartAtZero(true)


        XAxis xAxis = mChart.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setAxisMinimum(0f);
        xAxis.setGranularity(1f);
        xAxis.setValueFormatter(new com.github.mikephil.charting.formatter.IAxisValueFormatter() {
            @Override
            public String getFormattedValue(float value, AxisBase axis) {
                return mMonth[(int) value % mMonth.length];
            }
        });

        CombinedData data = new CombinedData();

        data.setData(generateLineData());
        data.setData(generateBarData());

        xAxis.setAxisMaximum(data.getXMax() + 0.25f);
        mChart.setData(data);
        mChart.invalidate();
    }
    protected String[] mMonth = new String[]{
            "1", "3", "5", "7", "9", "11", "15", "17", "19", "21", "23", "25","27","29","30"
    };


//    protected String[] mMonth = new String[]{
//            "JAN", "FEB", "MAR", "API", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"
//    };


    private LineData generateLineData() {

        LineData d = new LineData();

        ArrayList<Entry> entries = new ArrayList<Entry>();

        entries = getLineEntriesData(entries);

        LineDataSet set = new LineDataSet(entries, "Line");
        //set.setColor(Color.rgb(240, 238, 70));
        set.setColors(ColorTemplate.COLORFUL_COLORS);
        set.setLineWidth(2.5f);

        set.setCircleColor(Color.rgb(0, 0, 0));
        // set.setCircleRadius(5f);
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

    private ArrayList<Entry> getLineEntriesData(ArrayList<Entry> entries) {
        entries.add(new Entry(0, 10));
        entries.add(new Entry(1, 25));
        entries.add(new Entry(2, 49));
        entries.add(new Entry(3, 80));
        entries.add(new Entry(4, 50));
        entries.add(new Entry(5, 150));
        entries.add(new Entry(6, 40));
        entries.add(new Entry(7, 25));
        entries.add(new Entry(8, 49));
        entries.add(new Entry(9, 80));
        entries.add(new Entry(10, 50));
        entries.add(new Entry(11, 150));


        return entries;
    }

    private BarData generateBarData() {

        ArrayList<BarEntry> entries = new ArrayList<BarEntry>();
        entries = getBarEnteries(entries);

        BarDataSet set1 = new BarDataSet(entries, "Bar");
        //set1.setColor(Color.rgb(60, 220, 78));
        set1.setColors(ColorTemplate.COLORFUL_COLORS);
        set1.setValueTextColor(Color.rgb(60, 220, 78));
        set1.setValueTextSize(10f);
        set1.setAxisDependency(YAxis.AxisDependency.LEFT);

        float barWidth = 0.45f; // x2 dataset


        BarData d = new BarData(set1);
        d.setBarWidth(barWidth);


        return d;
    }

    private ArrayList<BarEntry> getBarEnteries(ArrayList<BarEntry> entries) {
        entries.add(new BarEntry(0, 10));
        entries.add(new BarEntry(1, 25));
        entries.add(new BarEntry(2, 49));
        entries.add(new BarEntry(3, 80));
        entries.add(new BarEntry(4, 50));
        entries.add(new BarEntry(5, 150));
        entries.add(new BarEntry(6, 40));
        entries.add(new BarEntry(7, 25));
        entries.add(new BarEntry(8, 49));
        entries.add(new BarEntry(9, 80));
        entries.add(new BarEntry(10, 50));
        entries.add(new BarEntry(11, 150));

        return entries;
    }


    private void loadOneMonthData() {
        monthArray = new ArrayList<Float>();
        // monthData = ProcessData.getInstance().getTotalStepsCaloriesDistanceFortheMonth(array);
        int monthCount = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        // int monthCount = 12;
        for (int i = 0; i < monthCount; i++) {
            monthArray.add((float) 0.0);
        }

        SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy/MM");
        String month = simpledateformat.format(calendar.getTime());
        // HashMap<String, Model> totalSteps = ProcessData.getInstance().getTotalStepsCaloriesDistanceFortheDay(array);
        if (array != null && array.size() > 0) {
            for (int i = 0; i < monthCount; i++) {
                String monthText = String.valueOf(i + 1);
                if (i < 9) {
                    monthText = "0" + monthText;
                }
                Log.e("MonthString", "" + monthText);


                average(monthArray);


            }

            Log.e("monthArray", String.valueOf(monthArray));

        }

    }

    public static double average(ArrayList<Float> stepmonthArray) {
        // 'average' is undefined if there are no elements in the list.
        if (stepmonthArray == null || stepmonthArray.isEmpty())
            return 0.0;
        // Calculate the summation of the elements in the list
        long sum = 0;
        int n = stepmonthArray.size();
        // Iterating manually is faster than using an enhanced for loop.
        for (int i = 0; i < n; i++)
            sum += stepmonthArray.get(i);
        Log.e("sum", "" + sum);
        // We don't want to perform an integer division, so the cast is mandatory.
        String avg = String.valueOf(((double) sum) / n);
        Log.e("avg", "" + avg);
        double d = Double.parseDouble(avg);
        DecimalFormat df = new DecimalFormat("##");
        txtMonthAvg.setText(df.format(d));
        txtMonthTotalsteps.setText("" + sum);
        // Log.e("txtStepstotal",""+txtMonthTotalsteps);

        return ((double) sum) / n;

    }

    public void ids(View view) {
        arrow = (Button) view.findViewById(R.id.btn_down);
        arrow.setOnClickListener(mdown);
        gluose = (RelativeLayout) view.findViewById(R.id.l1_glucose);
    }

    View.OnClickListener mdown = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            if (gluose.getVisibility() == View.VISIBLE && mChart.getVisibility() == View.VISIBLE) {
                mChart.setVisibility(View.GONE);
                TextView glouse = (TextView) getActivity().findViewById(R.id.glucose);
                glouse.setVisibility(View.INVISIBLE);
                LinearLayout layout = (LinearLayout) getActivity().findViewById(R.id.charttext);
                layout.setVisibility(View.VISIBLE);
                RelativeLayout arrow = (RelativeLayout) getActivity().findViewById(R.id.l1_glucose);
                arrow.setBackgroundColor(getResources().getColor(R.color.colorWhite));

            } else {
                TextView glouse = (TextView) getActivity().findViewById(R.id.glucose);
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

    public class MonthlistviewAdapter extends BaseAdapter {

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
            LayoutInflater infalInflater = (LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.month_list_adapter, null);
            ImageView imageView = (ImageView) convertView.findViewById(R.id.img_icon);
            //imageView.setImageResource(images.get(position));

            TextView textView = (TextView) convertView.findViewById(R.id.Itemname);
            textView.setText(name.get(position));

            TextView textView1 = (TextView) convertView.findViewById(R.id.number);
            TextView textView2 = (TextView) convertView.findViewById(R.id.type_text);
            UrineTestModel rm = RecordFragment.filterList.get(0);
            if (position == 0) {
                textView1.setText("" + ResultFragment.getRbcText(Double.parseDouble(df.format(rm.getRbcValue()))));
                String s = textView1.getText().toString();
                if (s.contains("-ve")) {
                    Log.e("snasmxn", "" + s);
                    imageView.setImageResource(R.drawable.ic_goodmood);
                    textView2.setText("Normal");
                    textView2.setTextColor(Color.parseColor("#2196f3"));
                } else {
                    Log.e("elsetext", "" + s);
                    imageView.setImageResource(R.drawable.ic_angry);
                    textView2.setText("Abnormal");
                    textView2.setTextColor(Color.parseColor("#FF0000"));
                }

            } else if (position == 1) {
                textView1.setText("" + ResultFragment.getBillirubinText(Double.parseDouble(df.format(rm.getBillirubinValue()))));
                String s = textView1.getText().toString();
                if (s.contains("-ve")) {
                    Log.e("snasmxn", "" + s);
                    imageView.setImageResource(R.drawable.ic_goodmood);
                    textView2.setText("Normal");
                    textView2.setTextColor(Color.parseColor("#2196f3"));
                } else {
                    Log.e("elsetext", "" + s);
                    imageView.setImageResource(R.drawable.ic_angry);
                    textView2.setText("Abnormal");
                    textView2.setTextColor(Color.parseColor("#FF0000"));
                }
            } else if (position == 2) {
                textView1.setText("" + ResultFragment.getUroboliogenText(Double.parseDouble(df.format(rm.getUroboliogenValue()))));
                String s = textView1.getText().toString();
                if (s.contains("-ve")) {
                    Log.e("snasmxn", "" + s);
                    imageView.setImageResource(R.drawable.ic_goodmood);
                    textView2.setText("Normal");
                    textView2.setTextColor(Color.parseColor("#2196f3"));
                } else {
                    Log.e("elsetext", "" + s);
                    imageView.setImageResource(R.drawable.ic_angry);
                    textView2.setText("Abnormal");
                    textView2.setTextColor(Color.parseColor("#FF0000"));
                }
            } else if (position == 3) {
                textView1.setText("" + ResultFragment.getKetonesText(Double.parseDouble(df.format(rm.getKetonesValue()))));
                String s = textView1.getText().toString();
                if (s.contains("-ve")) {
                    Log.e("snasmxn", "" + s);
                    imageView.setImageResource(R.drawable.ic_goodmood);
                    textView2.setText("Normal");
                    textView2.setTextColor(Color.parseColor("#2196f3"));
                } else {
                    Log.e("elsetext", "" + s);
                    imageView.setImageResource(R.drawable.ic_angry);
                    textView2.setText("Abnormal");
                    textView2.setTextColor(Color.parseColor("#FF0000"));
                }
            } else if (position == 4) {
                textView1.setText("" + ResultFragment.getProteinText(Double.parseDouble(df.format(rm.getProteinValue()))));
                String s = textView1.getText().toString();
                if (s.contains("-ve")) {
                    Log.e("snasmxn", "" + s);
                    imageView.setImageResource(R.drawable.ic_goodmood);
                    textView2.setText("Normal");
                    textView2.setTextColor(Color.parseColor("#2196f3"));
                } else {
                    Log.e("elsetext", "" + s);
                    imageView.setImageResource(R.drawable.ic_angry);
                    textView2.setText("Abnormal");
                    textView2.setTextColor(Color.parseColor("#FF0000"));
                }
            } else if (position == 5) {
                textView1.setText("" + ResultFragment.getNitriteText(Double.parseDouble(df.format(rm.getNitriteValue()))));
                String s = textView1.getText().toString();
                if (s.contains("-ve")) {
                    Log.e("snasmxn", "" + s);
                    imageView.setImageResource(R.drawable.ic_goodmood);
                    textView2.setText("Normal");
                    textView2.setTextColor(Color.parseColor("#2196f3"));
                } else {
                    Log.e("elsetext", "" + s);
                    imageView.setImageResource(R.drawable.ic_angry);
                    textView2.setText("Abnormal");
                    textView2.setTextColor(Color.parseColor("#FF0000"));
                }
            } else if (position == 6) {
                textView1.setText("" + ResultFragment.getGlucoseText(Double.parseDouble(df.format(rm.getGlucoseValue()))));
                String s = textView1.getText().toString();
                if (s.contains("-ve")) {
                    Log.e("snasmxn", "" + s);
                    imageView.setImageResource(R.drawable.ic_goodmood);
                    textView2.setText("Normal");
                    textView2.setTextColor(Color.parseColor("#2196f3"));
                } else {
                    Log.e("elsetext", "" + s);
                    imageView.setImageResource(R.drawable.ic_angry);
                    textView2.setText("Abnormal");
                    textView2.setTextColor(Color.parseColor("#FF0000"));
                }
            } else if (position == 7) {
                textView1.setText("" + ResultFragment.getPhText(Double.parseDouble(df.format(rm.getPhValue()))));
                String s = textView1.getText().toString();
                if (s.contains("-ve")) {
                    Log.e("snasmxn", "" + s);
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
            }


