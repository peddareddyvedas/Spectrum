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
 * Created by Rise on 23/05/2017.
 */

public class YearchartsFragment extends Fragment {
    //  private ArrayList<Model> productList;
    // LineChart mChart;
    TextView year;
    Calendar calander;
    Button left, right;
    String Year;
    ListView lview;
    SimpleDateFormat simpledateformat;
    ArrayList<Float> yearArray;
    public static TextView txtYearTotalsteps, txtYearAvg;
    ArrayList<StepsMainModel> array;
    View view;
    int dayCount = 12;
    Button share, menu, arrow;
    LinearLayout sharepage;
    RelativeLayout gluose;

    public boolean mchecked = false;

    ArrayList<String> name;
    ArrayList<Integer> images;
    ArrayList<Integer> Images;
    ArrayList<String> symbols;
    ArrayList<Integer> numbers;

    public int selecteditem;
    public int position;
    DecimalFormat df;


    YearlistviewAdapter adapter;
    private CombinedChart mChart;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_year, container, false);
        df = new DecimalFormat("#.##");
        ids(view);
        actions(view);
        return view;
    }

    public void actions(View view) {
        mChart = (CombinedChart) view.findViewById(R.id.chart_combine_year);


//    LineChart lineChart = (LineChart)view. findViewById(chart);
//    ArrayList<Entry> entries = new ArrayList<>();
//    entries.add(new Entry(10f, 0));
//    entries.add(new Entry(20f, 1));
//    entries.add(new Entry(45f, 2));
//    entries.add(new Entry(40f, 3));
//    entries.add(new Entry(30f, 4));
//    entries.add(new Entry(50f, 5));
//    entries.add(new Entry(20f,6));
//    entries.add(new Entry(45f, 7));
//    entries.add(new Entry(40f, 8));
//    entries.add(new Entry(30f, 9));
//    entries.add(new Entry(50f, 10));
//    entries.add(new Entry(20f,11));
//
//    LineDataSet dataset =new LineDataSet(entries,"");
//
//    ArrayList<String> labels = new ArrayList<String>();
//    labels.add("JAN");
//    labels.add("FEB");
//    labels.add("MAR");
//    labels.add("API");
//    labels.add("MAY");
//    labels.add("JUN");
//    labels.add("JLY");
//    labels.add("AUG");
//    labels.add("SEP");
//    labels.add("OCT");
//    labels.add("NOV");
//    labels.add("DEC");
//
//   // LineData data = new LineData(labels, dataset);
//   // lineChart.setData(data);
//    lineChart.getXAxis().setPosition(XAxis.XAxisPosition.BOTTOM);
//    lineChart.setDrawBorders(false);
//    lineChart.setDrawGridBackground(false);
//    lineChart.getAxisRight().setEnabled(false);
//    lineChart.getAxisLeft().setDrawGridLines(false);
//    lineChart.getXAxis().setDrawGridLines(false);
//    dataset.setDrawCircles(false);
//    dataset.setLineWidth((float) 3.0);
//    dataset.setColor(getResources().getColor(R.color.colorWhite));
//    lineChart.getXAxis().setTextColor(getResources().getColor(R.color.colorWhite));
//    lineChart.getAxis(YAxis.AxisDependency.LEFT).setTextColor(getResources().getColor(R.color.colorWhite));
//  //  lineChart.setDescription("");
//    lineChart.setDoubleTapToZoomEnabled(false);
//    lineChart.animateXY(2000, 2000);
//    lineChart.invalidate();
        year = (TextView) view.findViewById(R.id.start_txt_year);
        right = (Button) view.findViewById(R.id.btn_year_right);
        left = (Button) view.findViewById(R.id.btn_year_left);
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


                Toast.makeText(getActivity(), "left", Toast.LENGTH_SHORT).show();

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

                Toast.makeText(getActivity(), "right", Toast.LENGTH_SHORT).show();

            }
        });


//        mChart.setBackgroundColor(Color.WHITE);
//      //  mChart.setGridBackgroundColor(mFillColor);
//       // mChart.setDrawGridBackground(true);
//
//        mChart.setDrawBorders(true);
//
//        // no description text
//        mChart.getDescription().setEnabled(false);
//
//        // if disabled, scaling can be done on x- and y-axis separately
//        mChart.setPinchZoom(false);
//
//        Legend l = mChart.getLegend();
//        l.setEnabled(false);
//
//        XAxis xAxis = mChart.getXAxis();
//        xAxis.setAxisMaximum(70f);
//        xAxis.setAxisMinimum(0f);
//        xAxis.setEnabled(false);
//        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
//
//        YAxis leftAxis = mChart.getAxisLeft();
//        leftAxis.setAxisMaximum(70f);
//        leftAxis.setAxisMinimum(0f);
//        leftAxis.setDrawAxisLine(false);
//        leftAxis.setDrawZeroLine(false);
//        leftAxis.setDrawGridLines(false);
//
//        mChart.getAxisRight().setEnabled(false);
//
//        // add data
//        setData(100, 60);
//
//        mChart.invalidate();


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


        ListView lview = (ListView) view.findViewById(R.id.year_list);

        adapter = new YearlistviewAdapter();
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
                return mYear[(int) value % mYear.length];
            }
        });

        CombinedData data = new CombinedData();

        data.setData(generateLineData());
        data.setData(generateBarData());

        xAxis.setAxisMaximum(data.getXMax() + 0.25f);
        mChart.setData(data);
        mChart.invalidate();
    }

    protected String[] mYear = new String[]{
            "JAN", "FEB", "MAR", "API", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"
    };



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

    public class YearlistviewAdapter extends BaseAdapter {

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
            convertView = infalInflater.inflate(R.layout.year_list_adapter, null);
            ImageView imageView = (ImageView) convertView.findViewById(R.id.img_icon);

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
                } else {
                    Log.e("elsetext", "" + s);
                    imageView.setImageResource(R.drawable.ic_angry);
                    textView2.setText("Abnormal");
                    textView2.setTextColor(Color.parseColor("#FF0000"));
                }
            } else if (position == 8) {
                textView1.setText("" + ResultFragment.getSgText(Double.parseDouble(df.format(rm.getSgValue()))));
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
            } else if (position == 9) {
                textView1.setText("" + ResultFragment.getLeukocyteText(Double.parseDouble(df.format(rm.getLeukocyteValue()))));
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

            }
            return convertView;

        }
    }
}