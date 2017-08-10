package com.example.dell.spectrum.TapbarFragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dell.spectrum.Home.CircularProressActivity;
import com.example.dell.spectrum.HomePageModels.HumanHealthData;
import com.example.dell.spectrum.HomePageModels.ShopDataModel;
import com.example.dell.spectrum.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by WAVE on 7/21/2017.
 */

public class StoreMainFragment extends Fragment {
    Toolbar toolbar;
    ImageButton back;
    ImageView cart;
    RecyclerView recycler_device;
    DeviceHorizontalAdapter deviceAdapter;
    private List<ShopDataModel> devicedata;
    //
    RecyclerView recycler_human;
    HumanHorizontalAdapter humanAdapter;
    private List<ShopDataModel> humandata;
    //
    RecyclerView recycler_pets;
    PetsHorizontalAdapter petsAdapter;
    private List<ShopDataModel> petsdata;
    //
    RecyclerView recycler_water;
    WaterHorizontalAdapter waterAdapter;
    private List<ShopDataModel> watersdata;
    //
    RecyclerView recycler_meat;
    MeatHorizontalAdapter meatAdapter;
    private List<ShopDataModel> meatdata;
    ///
    RecyclerView recycler_veg;
    VegHorizontalAdapter vegAdapter;
    private List<ShopDataModel> vegdata;
    ///
    RecyclerView recycler_dairy;
    DairyHorizontalAdapter dairyAdapter;
    private List<ShopDataModel> dairydata;
    //
    RecyclerView recycler_condiment;
    CondimentHorizontalAdapter condimentAdapter;
    private List<ShopDataModel> condimentdata;
    //
    RecyclerView recycler_wine;
    WineHorizontalAdapter wineAdapter;
    private List<ShopDataModel> winedata;
    public static StoreMainFragment newInstance()
    {
        StoreMainFragment fragment = new StoreMainFragment();
        return fragment;
    }
    public StoreMainFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.fragment_storemain, container, false);
        getIds(v);
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
        toolbartext.setText("Shop");
        cart = (ImageView) toolbar.findViewById(R.id.menu);
        cart.setBackgroundResource(R.drawable.ic_cart);
    }
    public void  getIds(View view){
        recycler_device= (RecyclerView)view.findViewById(R.id.recycler_device);
        devicedata = fill_device_data();
        deviceAdapter=new DeviceHorizontalAdapter(devicedata, getActivity().getApplication());
        LinearLayoutManager horizontalLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        recycler_device.setLayoutManager(horizontalLayoutManager);
        recycler_device.setAdapter(deviceAdapter);
        /////
        recycler_human= (RecyclerView)view.findViewById(R.id.recycler_human);
        humandata = fill_human_data();
        humanAdapter=new HumanHorizontalAdapter(humandata, getActivity().getApplication());
        LinearLayoutManager humanLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        recycler_human.setLayoutManager(humanLayoutManager);
        recycler_human.setAdapter(humanAdapter);
        ////
        recycler_pets= (RecyclerView)view.findViewById(R.id.recycler_pets);
        petsdata = fill_human_data();
        petsAdapter=new PetsHorizontalAdapter(petsdata, getActivity().getApplication());
        LinearLayoutManager petsLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        recycler_pets.setLayoutManager(petsLayoutManager);
        recycler_pets.setAdapter(petsAdapter);
        ////
        recycler_water= (RecyclerView)view.findViewById(R.id.recycler_water);
        watersdata = fill_human_data();
        waterAdapter=new WaterHorizontalAdapter(watersdata, getActivity().getApplication());
        LinearLayoutManager waterLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        recycler_water.setLayoutManager(waterLayoutManager);
        recycler_water.setAdapter(waterAdapter);
        ////
        recycler_meat= (RecyclerView)view.findViewById(R.id.recycler_meat);
        meatdata = fill_human_data();
        meatAdapter=new MeatHorizontalAdapter(meatdata, getActivity().getApplication());
        LinearLayoutManager meatLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        recycler_meat.setLayoutManager(meatLayoutManager);
        recycler_meat.setAdapter(meatAdapter);
        ////
        recycler_veg= (RecyclerView)view.findViewById(R.id.recycler_veg);
        vegdata = fill_human_data();
        vegAdapter=new VegHorizontalAdapter(vegdata, getActivity().getApplication());
        LinearLayoutManager vegLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        recycler_veg.setLayoutManager(vegLayoutManager);
        recycler_veg.setAdapter(vegAdapter);
        ////
        recycler_dairy= (RecyclerView)view.findViewById(R.id.recycler_dairy);
        dairydata = fill_human_data();
        dairyAdapter=new DairyHorizontalAdapter(dairydata, getActivity().getApplication());
        LinearLayoutManager dairyLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        recycler_dairy.setLayoutManager(dairyLayoutManager);
        recycler_dairy.setAdapter(dairyAdapter);
        ////
        recycler_condiment= (RecyclerView)view.findViewById(R.id.recycler_condiment);
        condimentdata = fill_human_data();
        condimentAdapter=new CondimentHorizontalAdapter(condimentdata, getActivity().getApplication());
        LinearLayoutManager condimentLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        recycler_condiment.setLayoutManager(condimentLayoutManager);
        recycler_condiment.setAdapter(condimentAdapter);
        ////
        recycler_wine= (RecyclerView)view.findViewById(R.id.recycler_wine);
        winedata = fill_human_data();
        wineAdapter=new WineHorizontalAdapter(winedata, getActivity().getApplication());
        LinearLayoutManager wineLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        recycler_wine.setLayoutManager(wineLayoutManager);
        recycler_wine.setAdapter(wineAdapter);
    }
    public List<ShopDataModel> fill_device_data() {

        List<ShopDataModel> data = new ArrayList<>();

        data.add(new ShopDataModel( R.drawable.ic_specrummeter, "Spectrum Meter"));
       /* data.add(new ShopDataModel( R.drawable.ic_urinetest, "Blood test"));
        data.add(new ShopDataModel( R.drawable.ic_urinetest, "Saliva detection"));
        data.add(new ShopDataModel( R.drawable.ic_urinetest, "Pregnant test"));
        data.add(new ShopDataModel( R.drawable.ic_urinetest, "Tears"));*/
        return data;
    }
    public List<ShopDataModel> fill_human_data() {

        List<ShopDataModel> data = new ArrayList<>();

        data.add(new ShopDataModel( R.drawable.ic_urinetest, "Urine Strips"));
        data.add(new ShopDataModel( R.drawable.ic_strip, "Blood Sugar\nTest Strips"));
        data.add(new ShopDataModel( R.drawable.ic_urinetest, "\tSaliva\nTest Strips"));
        data.add(new ShopDataModel( R.drawable.ic_strip, "Pregnancy\nTest Strips"));
        data.add(new ShopDataModel( R.drawable.ic_urinetest, "\tTears\nTest Strips"));
        return data;
    }
    /*public List<ShopDataModel> fill_pets_data() {

        List<ShopDataModel> data = new ArrayList<>();

        data.add(new ShopDataModel( R.drawable.ic_urinetest, "Urine test"));
        data.add(new ShopDataModel( R.drawable.ic_urinetest, "Blood test"));
        data.add(new ShopDataModel( R.drawable.ic_urinetest, "Saliva detection"));
        data.add(new ShopDataModel( R.drawable.ic_urinetest, "Pregnant test"));
        data.add(new ShopDataModel( R.drawable.ic_urinetest, "Tears"));
        return data;
    }
    public List<ShopDataModel> fill_water_data() {

        List<ShopDataModel> data = new ArrayList<>();

        data.add(new ShopDataModel( R.drawable.ic_urinetest, "Urine test"));
        data.add(new ShopDataModel( R.drawable.ic_urinetest, "Blood test"));
        data.add(new ShopDataModel( R.drawable.ic_urinetest, "Saliva detection"));
        data.add(new ShopDataModel( R.drawable.ic_urinetest, "Pregnant test"));
        data.add(new ShopDataModel( R.drawable.ic_urinetest, "Tears"));
        return data;
    }*/

    public class DeviceHorizontalAdapter extends RecyclerView.Adapter<DeviceHorizontalAdapter.MyViewHolder>
    {
        List<ShopDataModel> devicehorizontalList = Collections.emptyList();
        Context context;
        public DeviceHorizontalAdapter(List<ShopDataModel> horizontalList, Context context) {
            this.devicehorizontalList = horizontalList;
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
        public DeviceHorizontalAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_shopverticalmenu, parent, false);
            return new DeviceHorizontalAdapter.MyViewHolder(itemView);
        }
        @Override
        public void onBindViewHolder(DeviceHorizontalAdapter.MyViewHolder holder, final int position) {

            holder.imageView.setImageResource(devicehorizontalList.get(position).imageId);
            holder.txtview.setText(devicehorizontalList.get(position).txt);
            holder.imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String list = devicehorizontalList.get(position).txt.toString();
                    if(list==devicehorizontalList.get(0).txt.toString()){
                        //startActivity(new Intent(getActivity(),CircularProressActivity.class));
                    }
                }
            });
        }
        @Override
        public int getItemCount()
        {
            return devicehorizontalList.size();
        }
    }
    public class HumanHorizontalAdapter extends RecyclerView.Adapter<HumanHorizontalAdapter.MyViewHolder>
    {
        List<ShopDataModel> devicehorizontalList = Collections.emptyList();
        Context context;
        public HumanHorizontalAdapter(List<ShopDataModel> horizontalList, Context context) {
            this.devicehorizontalList = horizontalList;
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
        public HumanHorizontalAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_shopverticalmenu, parent, false);
            return new HumanHorizontalAdapter.MyViewHolder(itemView);
        }
        @Override
        public void onBindViewHolder(HumanHorizontalAdapter.MyViewHolder holder, final int position) {

            holder.imageView.setImageResource(devicehorizontalList.get(position).imageId);
            holder.txtview.setText(devicehorizontalList.get(position).txt);
            holder.imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String list = devicehorizontalList.get(position).txt.toString();
                   if(list==devicehorizontalList.get(0).txt.toString()){
                       startActivity(new Intent(getActivity(),StoreItemDetailsActivity.class));

                   }else if(list==devicehorizontalList.get(1).txt.toString()){
                       startActivity(new Intent(getActivity(),StoreItemDetailsActivity.class));

                   }else if(list==devicehorizontalList.get(2).txt.toString()){
                       startActivity(new Intent(getActivity(),StoreItemDetailsActivity.class));

                   }else if(list==devicehorizontalList.get(3).txt.toString()){
                       startActivity(new Intent(getActivity(),StoreItemDetailsActivity.class));

                   }else if(list==devicehorizontalList.get(4).txt.toString()){

                        startActivity(new Intent(getActivity(),StoreItemDetailsActivity.class));
                    }
                }
            });
        }
        @Override
        public int getItemCount()
        {
            return devicehorizontalList.size();
        }
    }
    public class PetsHorizontalAdapter extends RecyclerView.Adapter<PetsHorizontalAdapter.MyViewHolder>
    {
        List<ShopDataModel> devicehorizontalList = Collections.emptyList();
        Context context;
        public PetsHorizontalAdapter(List<ShopDataModel> horizontalList, Context context) {
            this.devicehorizontalList = horizontalList;
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
        public PetsHorizontalAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_shopverticalmenu, parent, false);
            return new PetsHorizontalAdapter.MyViewHolder(itemView);
        }
        @Override
        public void onBindViewHolder(PetsHorizontalAdapter.MyViewHolder holder, final int position) {

            holder.imageView.setImageResource(devicehorizontalList.get(position).imageId);
            holder.txtview.setText(devicehorizontalList.get(position).txt);
            holder.imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String list = devicehorizontalList.get(position).txt.toString();
                    if(list==devicehorizontalList.get(0).txt.toString()){
                        startActivity(new Intent(getActivity(),StoreItemDetailsActivity.class));

                    }else if(list==devicehorizontalList.get(1).txt.toString()){
                        startActivity(new Intent(getActivity(),StoreItemDetailsActivity.class));

                    }else if(list==devicehorizontalList.get(2).txt.toString()){
                        startActivity(new Intent(getActivity(),StoreItemDetailsActivity.class));

                    }else if(list==devicehorizontalList.get(3).txt.toString()){
                        startActivity(new Intent(getActivity(),StoreItemDetailsActivity.class));

                    }else if(list==devicehorizontalList.get(4).txt.toString()){

                        startActivity(new Intent(getActivity(),StoreItemDetailsActivity.class));
                    }
                }
            });
        }
        @Override
        public int getItemCount()
        {
            return devicehorizontalList.size();
        }
    }
    public class WaterHorizontalAdapter extends RecyclerView.Adapter<WaterHorizontalAdapter.MyViewHolder>
    {
        List<ShopDataModel> devicehorizontalList = Collections.emptyList();
        Context context;
        public WaterHorizontalAdapter(List<ShopDataModel> horizontalList, Context context) {
            this.devicehorizontalList = horizontalList;
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
        public WaterHorizontalAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_shopverticalmenu, parent, false);
            return new WaterHorizontalAdapter.MyViewHolder(itemView);
        }
        @Override
        public void onBindViewHolder(WaterHorizontalAdapter.MyViewHolder holder, final int position) {

            holder.imageView.setImageResource(devicehorizontalList.get(position).imageId);
            holder.txtview.setText(devicehorizontalList.get(position).txt);
            holder.imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String list = devicehorizontalList.get(position).txt.toString();
                    if(list==devicehorizontalList.get(0).txt.toString()){
                        startActivity(new Intent(getActivity(),StoreItemDetailsActivity.class));

                    }else if(list==devicehorizontalList.get(1).txt.toString()){
                        startActivity(new Intent(getActivity(),StoreItemDetailsActivity.class));

                    }else if(list==devicehorizontalList.get(2).txt.toString()){
                        startActivity(new Intent(getActivity(),StoreItemDetailsActivity.class));

                    }else if(list==devicehorizontalList.get(3).txt.toString()){
                        startActivity(new Intent(getActivity(),StoreItemDetailsActivity.class));

                    }else if(list==devicehorizontalList.get(4).txt.toString()){

                        startActivity(new Intent(getActivity(),StoreItemDetailsActivity.class));
                    }
                }
            });
        }
        @Override
        public int getItemCount()
        {
            return devicehorizontalList.size();
        }
    }
    public class MeatHorizontalAdapter extends RecyclerView.Adapter<MeatHorizontalAdapter.MyViewHolder>
    {
        List<ShopDataModel> devicehorizontalList = Collections.emptyList();
        Context context;
        public MeatHorizontalAdapter(List<ShopDataModel> horizontalList, Context context) {
            this.devicehorizontalList = horizontalList;
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
        public MeatHorizontalAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_shopverticalmenu, parent, false);
            return new MeatHorizontalAdapter.MyViewHolder(itemView);
        }
        @Override
        public void onBindViewHolder(MeatHorizontalAdapter.MyViewHolder holder, final int position) {

            holder.imageView.setImageResource(devicehorizontalList.get(position).imageId);
            holder.txtview.setText(devicehorizontalList.get(position).txt);
            holder.imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String list = devicehorizontalList.get(position).txt.toString();
                    if(list==devicehorizontalList.get(0).txt.toString()){
                        startActivity(new Intent(getActivity(),StoreItemDetailsActivity.class));

                    }else if(list==devicehorizontalList.get(1).txt.toString()){
                        startActivity(new Intent(getActivity(),StoreItemDetailsActivity.class));

                    }else if(list==devicehorizontalList.get(2).txt.toString()){
                        startActivity(new Intent(getActivity(),StoreItemDetailsActivity.class));

                    }else if(list==devicehorizontalList.get(3).txt.toString()){
                        startActivity(new Intent(getActivity(),StoreItemDetailsActivity.class));

                    }else if(list==devicehorizontalList.get(4).txt.toString()){

                        startActivity(new Intent(getActivity(),StoreItemDetailsActivity.class));
                    }
                }
            });
        }
        @Override
        public int getItemCount()
        {
            return devicehorizontalList.size();
        }
    }
    public class VegHorizontalAdapter extends RecyclerView.Adapter<VegHorizontalAdapter.MyViewHolder>
    {
        List<ShopDataModel> devicehorizontalList = Collections.emptyList();
        Context context;
        public VegHorizontalAdapter(List<ShopDataModel> horizontalList, Context context) {
            this.devicehorizontalList = horizontalList;
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
        public VegHorizontalAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_shopverticalmenu, parent, false);
            return new VegHorizontalAdapter.MyViewHolder(itemView);
        }
        @Override
        public void onBindViewHolder(VegHorizontalAdapter.MyViewHolder holder, final int position) {

            holder.imageView.setImageResource(devicehorizontalList.get(position).imageId);
            holder.txtview.setText(devicehorizontalList.get(position).txt);
            holder.imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String list = devicehorizontalList.get(position).txt.toString();
                    if(list==devicehorizontalList.get(0).txt.toString()){
                        startActivity(new Intent(getActivity(),StoreItemDetailsActivity.class));

                    }else if(list==devicehorizontalList.get(1).txt.toString()){
                        startActivity(new Intent(getActivity(),StoreItemDetailsActivity.class));

                    }else if(list==devicehorizontalList.get(2).txt.toString()){
                        startActivity(new Intent(getActivity(),StoreItemDetailsActivity.class));

                    }else if(list==devicehorizontalList.get(3).txt.toString()){
                        startActivity(new Intent(getActivity(),StoreItemDetailsActivity.class));

                    }else if(list==devicehorizontalList.get(4).txt.toString()){

                        startActivity(new Intent(getActivity(),StoreItemDetailsActivity.class));
                    }
                }
            });
        }
        @Override
        public int getItemCount()
        {
            return devicehorizontalList.size();
        }
    }
    public class DairyHorizontalAdapter extends RecyclerView.Adapter<DairyHorizontalAdapter.MyViewHolder>
    {
        List<ShopDataModel> devicehorizontalList = Collections.emptyList();
        Context context;
        public DairyHorizontalAdapter(List<ShopDataModel> horizontalList, Context context) {
            this.devicehorizontalList = horizontalList;
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
        public DairyHorizontalAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_shopverticalmenu, parent, false);
            return new DairyHorizontalAdapter.MyViewHolder(itemView);
        }
        @Override
        public void onBindViewHolder(DairyHorizontalAdapter.MyViewHolder holder, final int position) {

            holder.imageView.setImageResource(devicehorizontalList.get(position).imageId);
            holder.txtview.setText(devicehorizontalList.get(position).txt);
            holder.imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String list = devicehorizontalList.get(position).txt.toString();
                    if(list==devicehorizontalList.get(0).txt.toString()){
                        startActivity(new Intent(getActivity(),StoreItemDetailsActivity.class));

                    }else if(list==devicehorizontalList.get(1).txt.toString()){
                        startActivity(new Intent(getActivity(),StoreItemDetailsActivity.class));

                    }else if(list==devicehorizontalList.get(2).txt.toString()){
                        startActivity(new Intent(getActivity(),StoreItemDetailsActivity.class));

                    }else if(list==devicehorizontalList.get(3).txt.toString()){
                        startActivity(new Intent(getActivity(),StoreItemDetailsActivity.class));

                    }else if(list==devicehorizontalList.get(4).txt.toString()){

                        startActivity(new Intent(getActivity(),StoreItemDetailsActivity.class));
                    }
                }
            });
        }
        @Override
        public int getItemCount()
        {
            return devicehorizontalList.size();
        }
    }
    public class CondimentHorizontalAdapter extends RecyclerView.Adapter<CondimentHorizontalAdapter.MyViewHolder>
    {
        List<ShopDataModel> devicehorizontalList = Collections.emptyList();
        Context context;
        public CondimentHorizontalAdapter(List<ShopDataModel> horizontalList, Context context) {
            this.devicehorizontalList = horizontalList;
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
        public CondimentHorizontalAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_shopverticalmenu, parent, false);
            return new CondimentHorizontalAdapter.MyViewHolder(itemView);
        }
        @Override
        public void onBindViewHolder(CondimentHorizontalAdapter.MyViewHolder holder, final int position) {

            holder.imageView.setImageResource(devicehorizontalList.get(position).imageId);
            holder.txtview.setText(devicehorizontalList.get(position).txt);
            holder.imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String list = devicehorizontalList.get(position).txt.toString();
                    if(list==devicehorizontalList.get(0).txt.toString()){
                        startActivity(new Intent(getActivity(),StoreItemDetailsActivity.class));

                    }else if(list==devicehorizontalList.get(1).txt.toString()){
                        startActivity(new Intent(getActivity(),StoreItemDetailsActivity.class));

                    }else if(list==devicehorizontalList.get(2).txt.toString()){
                        startActivity(new Intent(getActivity(),StoreItemDetailsActivity.class));

                    }else if(list==devicehorizontalList.get(3).txt.toString()){
                        startActivity(new Intent(getActivity(),StoreItemDetailsActivity.class));

                    }else if(list==devicehorizontalList.get(4).txt.toString()){

                        startActivity(new Intent(getActivity(),StoreItemDetailsActivity.class));
                    }
                }
            });
        }
        @Override
        public int getItemCount()
        {
            return devicehorizontalList.size();
        }
    }
    public class WineHorizontalAdapter extends RecyclerView.Adapter<WineHorizontalAdapter.MyViewHolder>
    {
        List<ShopDataModel> devicehorizontalList = Collections.emptyList();
        Context context;
        public WineHorizontalAdapter(List<ShopDataModel> horizontalList, Context context) {
            this.devicehorizontalList = horizontalList;
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
        public WineHorizontalAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_shopverticalmenu, parent, false);
            return new WineHorizontalAdapter.MyViewHolder(itemView);
        }
        @Override
        public void onBindViewHolder(WineHorizontalAdapter.MyViewHolder holder, final int position) {

            holder.imageView.setImageResource(devicehorizontalList.get(position).imageId);
            holder.txtview.setText(devicehorizontalList.get(position).txt);
            holder.imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String list = devicehorizontalList.get(position).txt.toString();
                    if(list==devicehorizontalList.get(0).txt.toString()){
                        startActivity(new Intent(getActivity(),StoreItemDetailsActivity.class));

                    }else if(list==devicehorizontalList.get(1).txt.toString()){
                        startActivity(new Intent(getActivity(),StoreItemDetailsActivity.class));

                    }else if(list==devicehorizontalList.get(2).txt.toString()){
                        startActivity(new Intent(getActivity(),StoreItemDetailsActivity.class));

                    }else if(list==devicehorizontalList.get(3).txt.toString()){
                        startActivity(new Intent(getActivity(),StoreItemDetailsActivity.class));

                    }else if(list==devicehorizontalList.get(4).txt.toString()){

                        startActivity(new Intent(getActivity(),StoreItemDetailsActivity.class));
                    }
                }
            });
        }
        @Override
        public int getItemCount()
        {
            return devicehorizontalList.size();
        }
    }
}
