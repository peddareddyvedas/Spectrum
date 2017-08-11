package com.example.dell.spectrum.TapbarFragments;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.DefaultSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;
import com.example.dell.spectrum.Home.AddDeviceActivity;
import com.example.dell.spectrum.HomePageModels.CondimentData;
import com.example.dell.spectrum.HomePageModels.DairyProducts;
import com.example.dell.spectrum.HomePageModels.HumanHealthData;
import com.example.dell.spectrum.HomePageModels.MeatData;
import com.example.dell.spectrum.HomePageModels.PetsData;
import com.example.dell.spectrum.HomePageModels.VegandFruite;
import com.example.dell.spectrum.HomePageModels.WaterData;
import com.example.dell.spectrum.HomePageModels.WineData;
import com.example.dell.spectrum.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements BaseSliderView.OnSliderClickListener,ViewPagerEx.OnPageChangeListener{
     SliderLayout sliderLayout;
    Toolbar toolbar;
     ImageButton back;
    ImageView menu;
    HashMap<String,Integer> sliderimages ;
    ////for iems
    RecyclerView horizontal_recycler_view;
    HorizontalAdapter horizontalAdapter;
    private List<HumanHealthData> data;
    //
    RecyclerView horizontal_recycler_view_one;
    HorizontalAdapterOne horizontalAdapterOne;
    private List<PetsData> dataOne;
    ///
    RecyclerView horizontal_recycler_view_water;
    HorizontalAdapterWater horizontalAdapterwater;
    private List<WaterData> dataForWaters;
    //meat
    RecyclerView horizontal_recycler_view_met;
    MeatAdapter horizontalAdaptermeat;
    private List<MeatData> dataFormeat;
    //veg
    RecyclerView horizontal_recycler_view_veg;
    VegAdapter horizontalAdapterveg;
    private List<VegandFruite> dataForveg;
    //dairy
    RecyclerView horizontal_recycler_view_dairy;
    DairyAdapter horizontalAdapterdairy;
    private List<DairyProducts> dataFordairy;
    //codiment
    RecyclerView horizontal_recycler_view_codiment;
    CondimentAdapter horizontalAdaptercodiment;
    private List<CondimentData> dataForcodiment;
    //wine
    RecyclerView horizontal_recycler_view_wine;
    WineAdapter horizontalAdapterwine;
    private List<WineData> dataForwine;
    ImageView imgnavigation,imgadd,imgoptionsmenu,imgqrcode;
    public static HomeFragment newInstance()
    {
        HomeFragment fragment = new HomeFragment();
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
            View v =inflater.inflate(R.layout.fragment_home, container, false);
        sliderLayout = (SliderLayout) v.findViewById(R.id.slider) ;
      sliderimages = new HashMap<>();
      imageSlideshow();
        adaptersInitialization(v);
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
        toolbartext.setText("SpectroChip");
        menu = (ImageView) toolbar.findViewById(R.id.menu);
        menu.setBackgroundResource(R.drawable.icon_add);
        menu.setOnClickListener(AddDevice);
    }
    //Click event on Add device icon
    View.OnClickListener AddDevice = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent adddevice = new Intent(getActivity(),AddDeviceActivity.class);
            startActivity(adddevice);
        }
    };
    //Click Event on QRCODE IMAGE
    /*View.OnClickListener ImgQrcodeListner = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //  Toast.makeText(getApplicationContext(),"click",Toast.LENGTH_SHORT).show();
            Intent qrscanner = new Intent(getActivity(),QRCodeScannerActivity.class);
            startActivity(qrscanner);
        }
    };*/


    public void imageSlideshow()
   {

     //storing the images in hashmap object
      sliderimages.put("slider one",R.drawable.icon_slider_one);
      sliderimages.put("slider Two",R.drawable.icon_slider_two);
      sliderimages.put("slider three",R.drawable.icon_slider_three);

     //adding the images to sliderlayout
     for(String name : sliderimages.keySet())
     {
       DefaultSliderView defaultSliderView = new DefaultSliderView(getActivity());
       defaultSliderView
               .description(name)
               .image(sliderimages.get(name))
               .setScaleType(BaseSliderView.ScaleType.Fit)
               .setOnSliderClickListener(HomeFragment.this);
       defaultSliderView.bundle(new Bundle());
       defaultSliderView.getBundle()
               .putString("extra",name);
       sliderLayout.addSlider(defaultSliderView);
       Log.e("images","image is added");

     }
     sliderLayout.setPresetTransformer(SliderLayout.Transformer.Accordion);
     sliderLayout.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
     sliderLayout.setCustomAnimation(new DescriptionAnimation());
     sliderLayout.setDuration(2500);
     sliderLayout.addOnPageChangeListener(HomeFragment.this);
   }

//  @Override
//  public void onStop() {
//
//    sliderLayout.stopAutoCycle();
//
//    super.onStop();
//  }

    @Override
    public void onSliderClick(BaseSliderView slider) {
        slider.setOnSliderClickListener(null);
      //Toast.makeText(getActivity(),slider.getBundle().get("extra") + "",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
      Log.d("Slider Demo", "Page Changed: " + position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
    public void adaptersInitialization(View v){
        /////
        horizontal_recycler_view= (RecyclerView)v.findViewById(R.id.horizontal_recycler_view);
        data = fill_with_data();
        horizontalAdapter=new HorizontalAdapter(data, getActivity().getApplication());
        LinearLayoutManager horizontalLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        horizontal_recycler_view.setLayoutManager(horizontalLayoutManager);
        horizontal_recycler_view.setAdapter(horizontalAdapter);
///////////
        horizontal_recycler_view_one=(RecyclerView)v.findViewById(R.id.horizontal_recycler_viewOne);
        dataOne = fill_with();
        horizontalAdapterOne= new HorizontalAdapterOne(dataOne,getActivity().getApplication());
        LinearLayoutManager horizontalLayout = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        horizontal_recycler_view_one.setLayoutManager(horizontalLayout);
        horizontal_recycler_view_one.setAdapter(horizontalAdapterOne);
        ///////
        horizontal_recycler_view_water=(RecyclerView)v.findViewById(R.id.horizontal_recycler_water);
        dataForWaters=fill_with_water();
        horizontalAdapterwater= new HorizontalAdapterWater(dataForWaters, getActivity().getApplication());
        LinearLayoutManager horizontalLayoutForWater = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        horizontal_recycler_view_water.setLayoutManager(horizontalLayoutForWater);
        horizontal_recycler_view_water.setAdapter(horizontalAdapterwater);
        /////
        horizontal_recycler_view_met=(RecyclerView)v.findViewById(R.id.horizontal_recycler_meat);
        dataFormeat=fill_with_meat();
        horizontalAdaptermeat= new MeatAdapter(dataFormeat,getActivity().getApplication());
        LinearLayoutManager meatManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        horizontal_recycler_view_met.setLayoutManager(meatManager);
        horizontal_recycler_view_met.setAdapter(horizontalAdaptermeat);
        ////
        horizontal_recycler_view_veg=(RecyclerView)v.findViewById(R.id.horizontal_recycler_veg);
        dataForveg=fill_with_veg();
        horizontalAdapterveg= new VegAdapter(dataForveg, getActivity().getApplication());
        LinearLayoutManager vegManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        horizontal_recycler_view_veg.setLayoutManager(vegManager);
        horizontal_recycler_view_veg.setAdapter(horizontalAdapterveg);
        ////
        horizontal_recycler_view_dairy=(RecyclerView)v.findViewById(R.id.horizontal_recycler_dairy);
        dataFordairy=fill_with_dairy();
        horizontalAdapterdairy= new DairyAdapter(dataFordairy, getActivity().getApplication());
        LinearLayoutManager dairyManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        horizontal_recycler_view_dairy.setLayoutManager(dairyManager);
        horizontal_recycler_view_dairy.setAdapter(horizontalAdapterdairy);
        ////
        horizontal_recycler_view_codiment=(RecyclerView)v.findViewById(R.id.horizontal_recycler_condiment);
        dataForcodiment=fill_with_condiment();
        horizontalAdaptercodiment= new CondimentAdapter(dataForcodiment,getActivity(). getApplication());
        LinearLayoutManager codimentManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        horizontal_recycler_view_codiment.setLayoutManager(codimentManager);
        horizontal_recycler_view_codiment.setAdapter(horizontalAdaptercodiment);
        ////
        horizontal_recycler_view_wine=(RecyclerView)v.findViewById(R.id.horizontal_recycler_wine);
        dataForwine=fill_with_wine();
        horizontalAdapterwine= new WineAdapter(dataForwine,getActivity(). getApplication());
        LinearLayoutManager wineManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        horizontal_recycler_view_wine.setLayoutManager(wineManager);
        horizontal_recycler_view_wine.setAdapter(horizontalAdapterwine);

    }
    public List<HumanHealthData> fill_with_data() {

        List<HumanHealthData> data = new ArrayList<>();

        data.add(new HumanHealthData( R.drawable.ic_urine, "Urine test"));
        data.add(new HumanHealthData( R.drawable.ic_blood, "Blood test"));
        data.add(new HumanHealthData( R.drawable.ic_saliva, "Saliva detection"));
        data.add(new HumanHealthData( R.drawable.ic_pregnancy, "Pregnant test"));
        data.add(new HumanHealthData( R.drawable.ic_tears, "Tears"));
        return data;
    }
    public List<PetsData> fill_with() {
        List<PetsData> dataOne = new ArrayList<>();

        dataOne.add(new PetsData( R.drawable.ic_dogurine, "Urine test"));
        dataOne.add(new PetsData( R.drawable.ic_dogblood, "Blood test"));
        dataOne.add(new PetsData( R.drawable.ic_dogsaliva, "Saliva detection"));
        dataOne.add(new PetsData( R.drawable.ic_petpregnancy, "Pregnant test"));
        dataOne.add(new PetsData( R.drawable.ic_dogtear, "Tears"));

        return dataOne;
    }
    public List<WaterData> fill_with_water() {
        List<WaterData> dataforwater = new ArrayList<>();

        dataforwater.add(new WaterData( R.drawable.ic_phmeter, "PH"));
        dataforwater.add(new WaterData( R.drawable.ic_hardness, "Hardness"));
        dataforwater.add(new WaterData( R.drawable.ic_chlorine, "Residual chlorine"));
        dataforwater.add(new WaterData( R.drawable.ic_bacteria, "Bacterial"));
        dataforwater.add(new WaterData( R.drawable.ic_heavymetals, "Heavy metals"));

        return dataforwater;
    }
    public List<MeatData> fill_with_meat() {
        List<MeatData> dataforwater = new ArrayList<>();

        dataforwater.add(new MeatData( R.drawable.ic_nitrite, "Nitrate"));
        dataforwater.add(new MeatData( R.drawable.ic_unnown, "Freshnesh"));
        dataforwater.add(new MeatData( R.drawable.ic_unnown, "Pigment"));
        dataforwater.add(new MeatData( R.drawable.ic_infectedmeet, "Infected meet"));
        dataforwater.add(new MeatData( R.drawable.ic_unnown, "So2"));
        dataforwater.add(new MeatData( R.drawable.ic_unnown, "IodiZed salt"));
        dataforwater.add(new MeatData( R.drawable.ic_unnown, "Iodized Salt"));
        dataforwater.add(new MeatData( R.drawable.ic_unnown, "Sulphur Dioxide"));

        return dataforwater;
    }
    public List<VegandFruite> fill_with_veg() {
        List<VegandFruite> dataforwater = new ArrayList<>();
        dataforwater.add(new VegandFruite( R.drawable.ic_washoil, "Waste Oil"));
        dataforwater.add(new VegandFruite( R.drawable.ic_honey, " Honey"));
        dataforwater.add(new VegandFruite( R.drawable.ic_unnown, "Acid value"));
        dataforwater.add(new VegandFruite( R.drawable.ic_unnown, "POV"));
        dataforwater.add(new VegandFruite( R.drawable.ic_unnown, "AflatoxinB1"));
        dataforwater.add(new VegandFruite( R.drawable.ic_ricefreshnesh, "Rice Freshness"));
        return dataforwater;
    }
    public List<DairyProducts> fill_with_dairy() {
        List<DairyProducts> dataforwater = new ArrayList<>();
        dataforwater.add(new DairyProducts( R.drawable.ic_unnown, "Melamine"));
        dataforwater.add(new DairyProducts( R.drawable.ic_urea, "Uria"));
        dataforwater.add(new DairyProducts( R.drawable.ic_protine, "Protein"));
        dataforwater.add(new DairyProducts( R.drawable.ic_unnown, "Additive"));
        dataforwater.add(new DairyProducts( R.drawable.ic_unnown, "Tea polyphenols"));
        dataforwater.add(new DairyProducts( R.drawable.ic_unnown, "Sodium cyclamate"));
        dataforwater.add(new DairyProducts( R.drawable.ic_unnown, "Iodized salt"));

        return dataforwater;
    }
    public List<CondimentData> fill_with_condiment() {
        List<CondimentData> dataforcondiment = new ArrayList<>();
        dataforcondiment.add(new CondimentData( R.drawable.ic_nitrite, "Nitrite"));
        dataforcondiment.add(new CondimentData( R.drawable.ic_unnown, "Freshness"));
        dataforcondiment.add(new CondimentData( R.drawable.ic_unnown, "Pigment"));
        dataforcondiment.add(new CondimentData( R.drawable.ic_infectedmeet, "Infected meat"));
        dataforcondiment.add(new CondimentData( R.drawable.ic_unnown, "SO2"));
        dataforcondiment.add(new CondimentData( R.drawable.ic_unnown, "Iodized Salt"));

        return dataforcondiment;
    }
    public List<WineData> fill_with_wine() {
        List<WineData> dataforcondiment = new ArrayList<>();
        dataforcondiment.add(new WineData( R.drawable.ic_hchco, "HCHO"));
        dataforcondiment.add(new WineData( R.drawable.ic_nitrite, "Nitrite"));
        dataforcondiment.add(new WineData( R.drawable.ic_unnown, "H2O2"));
        dataforcondiment.add(new WineData( R.drawable.ic_unnown, "MgSO4"));
        dataforcondiment.add(new WineData( R.drawable.ic_unnown, "Methanol"));
        dataforcondiment.add(new WineData( R.drawable.ic_unnown, ""));

        return dataforcondiment;
    }
    public class HorizontalAdapter extends RecyclerView.Adapter<HorizontalAdapter.MyViewHolder> {
        List<HumanHealthData> horizontalList = Collections.emptyList();
        Context context;


        public HorizontalAdapter(List<HumanHealthData> horizontalList, Context context) {
            this.horizontalList = horizontalList;
            this.context = context;
        }
        public class MyViewHolder extends RecyclerView.ViewHolder {

            ImageView imageView;
            TextView txtview;
            public MyViewHolder(View view) {
                super(view);
                imageView=(ImageView) view.findViewById(R.id.imageview);
                txtview=(TextView) view.findViewById(R.id.txtview);
            }
        }
        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.vertical_menu, parent, false);

            return new MyViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(final MyViewHolder holder, final int position) {

            holder.imageView.setImageResource(horizontalList.get(position).imageId);
            holder.txtview.setText(horizontalList.get(position).txt);

            holder.imageView.setOnClickListener(new View.OnClickListener() {
                @Override

                public void onClick(View v) {
                    String list = horizontalList.get(position).txt.toString();
                    if(list==horizontalList.get(0).txt.toString()){
                            FragmentMainActivity.isFromHOme=true;
                            startActivity(new Intent(getActivity(),FragmentMainActivity.class));
                    }/*else if(list==horizontalList.get(1).txt.toString()){

                        FragmentMainActivity.isFromHOme=true;
                        startActivity(new Intent(getActivity(),FragmentMainActivity.class));
                    }else if(list==horizontalList.get(2).txt.toString()){

                        FragmentMainActivity.isFromHOme=true;
                        startActivity(new Intent(getActivity(),FragmentMainActivity.class));
                    }else if(list==horizontalList.get(3).txt.toString()){

                        FragmentMainActivity.isFromHOme=true;
                        startActivity(new Intent(getActivity(),FragmentMainActivity.class));
                    }else if(list==horizontalList.get(4).txt.toString()){
                        FragmentMainActivity.isFromHOme=true;

                        startActivity(new Intent(getActivity(),FragmentMainActivity.class));
                    }*/
                }

            });
        }
        @Override
        public int getItemCount()
        {
            return horizontalList.size();
        }
    }
    ////for line One for health pets
    public class HorizontalAdapterOne extends RecyclerView.Adapter<HorizontalAdapterOne.MyViewHolderOne> {
        List<PetsData> horizontalList = Collections.emptyList();
        Context context;


        public HorizontalAdapterOne(List<PetsData> horizontalList, Context context) {
            this.horizontalList = horizontalList;
            this.context = context;
        }
        public class MyViewHolderOne extends RecyclerView.ViewHolder {

            ImageView imageView;
            TextView txtview;
            public MyViewHolderOne(View view) {
                super(view);
                imageView=(ImageView) view.findViewById(R.id.imageview);
                txtview=(TextView) view.findViewById(R.id.txtview);
            }
        }
        @Override
        public MyViewHolderOne onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.vertical_menu, parent, false);

            return new MyViewHolderOne(itemView);
        }

        @Override
        public void onBindViewHolder(final MyViewHolderOne holder, final int position) {

            holder.imageView.setImageResource(horizontalList.get(position).imageId);
            holder.txtview.setText(horizontalList.get(position).txt);

            holder.imageView.setOnClickListener(new View.OnClickListener() {
                @Override

                public void onClick(View v) {
                    String list = horizontalList.get(position).txt.toString();
                    /*if(list==horizontalList.get(0).txt.toString()){
                        FragmentMainActivity.isFromHOme=true;

                        startActivity(new Intent(getActivity(),FragmentMainActivity.class));
                    }else if(list==horizontalList.get(1).txt.toString()){
                        FragmentMainActivity.isFromHOme=true;

                        startActivity(new Intent(getActivity(),FragmentMainActivity.class));
                    }else if(list==horizontalList.get(2).txt.toString()){
                        FragmentMainActivity.isFromHOme=true;

                        startActivity(new Intent(getActivity(),FragmentMainActivity.class));
                    }else if(list==horizontalList.get(3).txt.toString()){
                        FragmentMainActivity.isFromHOme=true;

                        startActivity(new Intent(getActivity(),FragmentMainActivity.class));
                    }else if(list==horizontalList.get(4).txt.toString()){
                        FragmentMainActivity.isFromHOme=true;

                        startActivity(new Intent(getActivity(),FragmentMainActivity.class));
                    }     */
                }

            });
        }
        @Override
        public int getItemCount()
        {
            return horizontalList.size();
        }
    }
    //// for water
    public class HorizontalAdapterWater extends RecyclerView.Adapter<HorizontalAdapterWater.WaterHolder> {
        List<WaterData> horizontalList = Collections.emptyList();
        Context context;
        public HorizontalAdapterWater(List<WaterData> horizontalList, Context context) {
            this.horizontalList = horizontalList;
            this.context = context;
        }
        public class WaterHolder extends RecyclerView.ViewHolder {

            ImageView imageView;
            TextView txtview;
            public WaterHolder(View view) {
                super(view);
                imageView=(ImageView) view.findViewById(R.id.imageview);
                txtview=(TextView) view.findViewById(R.id.txtview);
            }
        }
        @Override
        public WaterHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.vertical_menu, parent, false);

            return new WaterHolder(itemView);
        }

        @Override
        public void onBindViewHolder(final WaterHolder holder, final int position) {

            holder.imageView.setImageResource(horizontalList.get(position).imageId);
            holder.txtview.setText(horizontalList.get(position).txt);

            holder.imageView.setOnClickListener(new View.OnClickListener() {
                @Override

                public void onClick(View v) {
                    String list = horizontalList.get(position).txt.toString();
                    if(list==horizontalList.get(0).txt.toString()){
                        FragmentMainActivity.isFromHOme=true;

                        startActivity(new Intent(getActivity(),FragmentMainActivity.class));
                    }/*else if(list==horizontalList.get(1).txt.toString()){
                        FragmentMainActivity.isFromHOme=true;

                        startActivity(new Intent(getActivity(),FragmentMainActivity.class));
                    }else if(list==horizontalList.get(2).txt.toString()){
                        FragmentMainActivity.isFromHOme=true;

                        startActivity(new Intent(getActivity(),FragmentMainActivity.class));
                    }else if(list==horizontalList.get(3).txt.toString()){
                        FragmentMainActivity.isFromHOme=true;

                        startActivity(new Intent(getActivity(),FragmentMainActivity.class));
                    }else if(list==horizontalList.get(4).txt.toString()){
                        FragmentMainActivity.isFromHOme=true;

                        startActivity(new Intent(getActivity(),FragmentMainActivity.class));
                    }*/
                }

            });
        }
        @Override
        public int getItemCount()
        {
            return horizontalList.size();
        }
    }
    //// for meat
    public class MeatAdapter extends RecyclerView.Adapter<MeatAdapter.MetHolder> {
        List<MeatData> horizontalList = Collections.emptyList();
        Context context;
        public MeatAdapter(List<MeatData> horizontalList, Context context) {
            this.horizontalList = horizontalList;
            this.context = context;
        }
        public class MetHolder extends RecyclerView.ViewHolder {

            ImageView imageView;
            TextView txtview;
            public MetHolder(View view) {
                super(view);
                imageView=(ImageView) view.findViewById(R.id.imageview);
                txtview=(TextView) view.findViewById(R.id.txtview);
            }
        }
        @Override
        public MetHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.vertical_menu, parent, false);

            return new MetHolder(itemView);
        }

        @Override
        public void onBindViewHolder(final MetHolder holder, final int position) {

            holder.imageView.setImageResource(horizontalList.get(position).imageId);
            holder.txtview.setText(horizontalList.get(position).txt);

            holder.imageView.setOnClickListener(new View.OnClickListener() {
                @Override

                public void onClick(View v) {
                    String list = horizontalList.get(position).txt.toString();
                  /*  if(list==horizontalList.get(0).txt.toString()){
                        FragmentMainActivity.isFromHOme=true;

                        startActivity(new Intent(getActivity(),FragmentMainActivity.class));
                    }else if(list==horizontalList.get(1).txt.toString()){
                        FragmentMainActivity.isFromHOme=true;

                        startActivity(new Intent(getActivity(),FragmentMainActivity.class));
                    }else if(list==horizontalList.get(2).txt.toString()){
                        FragmentMainActivity.isFromHOme=true;

                        startActivity(new Intent(getActivity(),FragmentMainActivity.class));
                    }else if(list==horizontalList.get(3).txt.toString()){
                        FragmentMainActivity.isFromHOme=true;

                        startActivity(new Intent(getActivity(),FragmentMainActivity.class));
                    }else if(list==horizontalList.get(4).txt.toString()){
                        FragmentMainActivity.isFromHOme=true;

                        startActivity(new Intent(getActivity(),FragmentMainActivity.class));
                    } else if(list==horizontalList.get(5).txt.toString()){
                        FragmentMainActivity.isFromHOme=true;

                        startActivity(new Intent(getActivity(),FragmentMainActivity.class));
                    }*/
                }

            });
        }
        @Override
        public int getItemCount()
        {
            return horizontalList.size();
        }
    }
    //// for meat
    public class VegAdapter extends RecyclerView.Adapter<VegAdapter.DairyHolder> {
        List<VegandFruite> horizontalList = Collections.emptyList();
        Context context;
        public VegAdapter(List<VegandFruite> horizontalList, Context context) {
            this.horizontalList = horizontalList;
            this.context = context;
        }
        public class DairyHolder extends RecyclerView.ViewHolder {

            ImageView imageView;
            TextView txtview;
            public DairyHolder(View view) {
                super(view);
                imageView=(ImageView) view.findViewById(R.id.imageview);
                txtview=(TextView) view.findViewById(R.id.txtview);
            }
        }
        @Override
        public DairyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.vertical_menu, parent, false);

            return new DairyHolder(itemView);
        }

        @Override
        public void onBindViewHolder(final DairyHolder holder, final int position) {

            holder.imageView.setImageResource(horizontalList.get(position).imageId);
            holder.txtview.setText(horizontalList.get(position).txt);

            holder.imageView.setOnClickListener(new View.OnClickListener() {
                @Override

                public void onClick(View v) {
                    String list = horizontalList.get(position).txt.toString();
                    /*if(list==horizontalList.get(0).txt.toString()){
                        FragmentMainActivity.isFromHOme=true;

                        startActivity(new Intent(getActivity(),FragmentMainActivity.class));
                    }else if(list==horizontalList.get(1).txt.toString()){
                        FragmentMainActivity.isFromHOme=true;

                        startActivity(new Intent(getActivity(),FragmentMainActivity.class));
                    }else if(list==horizontalList.get(2).txt.toString()){
                        FragmentMainActivity.isFromHOme=true;

                        startActivity(new Intent(getActivity(),FragmentMainActivity.class));
                    }else if(list==horizontalList.get(3).txt.toString()){
                        FragmentMainActivity.isFromHOme=true;

                        startActivity(new Intent(getActivity(),FragmentMainActivity.class));
                    }else if(list==horizontalList.get(4).txt.toString()){
                        FragmentMainActivity.isFromHOme=true;

                        startActivity(new Intent(getActivity(),FragmentMainActivity.class));
                    } else if(list==horizontalList.get(5).txt.toString()){
                        FragmentMainActivity.isFromHOme=true;

                        startActivity(new Intent(getActivity(),FragmentMainActivity.class));
                    }*/
                }

            });
        }
        @Override
        public int getItemCount()
        {
            return horizontalList.size();
        }
    }
    //// for dairy
    public class DairyAdapter extends RecyclerView.Adapter<DairyAdapter.VegHolder> {
        List<DairyProducts> horizontalList = Collections.emptyList();
        Context context;
        public DairyAdapter(List<DairyProducts> horizontalList, Context context) {
            this.horizontalList = horizontalList;
            this.context = context;
        }
        public class VegHolder extends RecyclerView.ViewHolder {

            ImageView imageView;
            TextView txtview;
            public VegHolder(View view) {
                super(view);
                imageView=(ImageView) view.findViewById(R.id.imageview);
                txtview=(TextView) view.findViewById(R.id.txtview);
            }
        }
        @Override
        public VegHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.vertical_menu, parent, false);

            return new VegHolder(itemView);
        }

        @Override
        public void onBindViewHolder(final VegHolder holder, final int position) {

            holder.imageView.setImageResource(horizontalList.get(position).imageId);
            holder.txtview.setText(horizontalList.get(position).txt);

            holder.imageView.setOnClickListener(new View.OnClickListener() {
                @Override

                public void onClick(View v) {
                    String list = horizontalList.get(position).txt.toString();
                    /*if(list==horizontalList.get(0).txt.toString()){
                        FragmentMainActivity.isFromHOme=true;

                        startActivity(new Intent(getActivity(),FragmentMainActivity.class));
                    }else if(list==horizontalList.get(1).txt.toString()){
                        FragmentMainActivity.isFromHOme=true;

                        startActivity(new Intent(getActivity(),FragmentMainActivity.class));
                    }else if(list==horizontalList.get(2).txt.toString()){
                        FragmentMainActivity.isFromHOme=true;

                        startActivity(new Intent(getActivity(),FragmentMainActivity.class));
                    }else if(list==horizontalList.get(3).txt.toString()){
                        FragmentMainActivity.isFromHOme=true;

                        startActivity(new Intent(getActivity(),FragmentMainActivity.class));
                    }else if(list==horizontalList.get(4).txt.toString()){
                        FragmentMainActivity.isFromHOme=true;

                        startActivity(new Intent(getActivity(),FragmentMainActivity.class));
                    } else if(list==horizontalList.get(5).txt.toString()){
                        FragmentMainActivity.isFromHOme=true;

                        startActivity(new Intent(getActivity(),FragmentMainActivity.class));
                    }else if(list==horizontalList.get(6).txt.toString()){
                        FragmentMainActivity.isFromHOme=true;

                        startActivity(new Intent(getActivity(),FragmentMainActivity.class));
                    }*/
                }

            });
        }
        @Override
        public int getItemCount()
        {
            return horizontalList.size();
        }
    }
    //// for cndiment
    public class CondimentAdapter extends RecyclerView.Adapter<CondimentAdapter.CondimentHolder> {
        List<CondimentData> horizontalList = Collections.emptyList();
        Context context;
        public CondimentAdapter(List<CondimentData> horizontalList, Context context) {
            this.horizontalList = horizontalList;
            this.context = context;
        }
        public class CondimentHolder extends RecyclerView.ViewHolder {

            ImageView imageView;
            TextView txtview;
            public CondimentHolder(View view) {
                super(view);
                imageView=(ImageView) view.findViewById(R.id.imageview);
                txtview=(TextView) view.findViewById(R.id.txtview);
            }
        }
        @Override
        public CondimentHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.vertical_menu, parent, false);

            return new CondimentHolder(itemView);
        }

        @Override
        public void onBindViewHolder(final CondimentHolder holder, final int position) {

            holder.imageView.setImageResource(horizontalList.get(position).imageId);
            holder.txtview.setText(horizontalList.get(position).txt);

            holder.imageView.setOnClickListener(new View.OnClickListener() {
                @Override

                public void onClick(View v) {
                    String list = horizontalList.get(position).txt.toString();
                   /* if(list==horizontalList.get(0).txt.toString()){
                        FragmentMainActivity.isFromHOme=true;

                        startActivity(new Intent(getActivity(),FragmentMainActivity.class));
                    }else if(list==horizontalList.get(1).txt.toString()){
                        FragmentMainActivity.isFromHOme=true;

                        startActivity(new Intent(getActivity(),FragmentMainActivity.class));
                    }else if(list==horizontalList.get(2).txt.toString()){
                        FragmentMainActivity.isFromHOme=true;

                        startActivity(new Intent(getActivity(),FragmentMainActivity.class));
                    }else if(list==horizontalList.get(3).txt.toString()){
                        FragmentMainActivity.isFromHOme=true;

                        startActivity(new Intent(getActivity(),FragmentMainActivity.class));
                    }else if(list==horizontalList.get(4).txt.toString()){
                        FragmentMainActivity.isFromHOme=true;

                        startActivity(new Intent(getActivity(),FragmentMainActivity.class));
                    } else if(list==horizontalList.get(5).txt.toString()){
                        FragmentMainActivity.isFromHOme=true;

                        startActivity(new Intent(getActivity(),FragmentMainActivity.class));
                    }*/
                }

            });
        }
        @Override
        public int getItemCount()
        {
            return horizontalList.size();
        }
    }
    //// for cndiment
    public class WineAdapter extends RecyclerView.Adapter<WineAdapter.WineHolder> {
        List<WineData> horizontalList = Collections.emptyList();
        Context context;
        public WineAdapter(List<WineData> horizontalList, Context context) {
            this.horizontalList = horizontalList;
            this.context = context;
        }
        public class WineHolder extends RecyclerView.ViewHolder {

            ImageView imageView;
            TextView txtview;
            public WineHolder(View view) {
                super(view);
                imageView=(ImageView) view.findViewById(R.id.imageview);
                txtview=(TextView) view.findViewById(R.id.txtview);
            }
        }
        @Override
        public WineHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.vertical_menu, parent, false);

            return new WineHolder(itemView);
        }

        @Override
        public void onBindViewHolder(final WineHolder holder, final int position) {

            holder.imageView.setImageResource(horizontalList.get(position).imageId);
            holder.txtview.setText(horizontalList.get(position).txt);

            holder.imageView.setOnClickListener(new View.OnClickListener() {
                @Override

                public void onClick(View v) {
                    String list = horizontalList.get(position).txt.toString();
                   /* if(list==horizontalList.get(0).txt.toString()){
                        FragmentMainActivity.isFromHOme=true;

                        startActivity(new Intent(getActivity(),FragmentMainActivity.class));
                    }else if(list==horizontalList.get(1).txt.toString()){
                        FragmentMainActivity.isFromHOme=true;

                        startActivity(new Intent(getActivity(),FragmentMainActivity.class));
                    }else if(list==horizontalList.get(2).txt.toString()){
                        FragmentMainActivity.isFromHOme=true;

                        startActivity(new Intent(getActivity(),FragmentMainActivity.class));
                    }else if(list==horizontalList.get(3).txt.toString()){
                        FragmentMainActivity.isFromHOme=true;

                        startActivity(new Intent(getActivity(),FragmentMainActivity.class));
                    }else if(list==horizontalList.get(4).txt.toString()){
                        FragmentMainActivity.isFromHOme=true;

                        startActivity(new Intent(getActivity(),FragmentMainActivity.class));
                    } else if(list==horizontalList.get(5).txt.toString()){
                        FragmentMainActivity.isFromHOme=true;

                        startActivity(new Intent(getActivity(),FragmentMainActivity.class));
                    }*/
                }

            });
        }
        @Override
        public int getItemCount()
        {
            return horizontalList.size();
        }
    }
}
