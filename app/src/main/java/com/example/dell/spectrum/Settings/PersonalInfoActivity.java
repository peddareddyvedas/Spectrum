package com.example.dell.spectrum.Settings;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.dell.spectrum.LOGIN.LoginpageActivity;
import com.example.dell.spectrum.R;
import com.shawnlin.numberpicker.NumberPicker;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

/**
 * Created by WAVE on 5/25/2017.
 */

public class PersonalInfoActivity extends AppCompatActivity {
    Toolbar toolbar;
    ImageView imgnavigation,imgadd,imgoptionsmenu,imgqrcode;
    String value = null;
    int key = 0;
    TextView txtAlubm, txtCamera ;
    Intent CamIntent, GalIntent, CropIntent;
    public static boolean isGenderChange = false;
    TextView txtHeight,txtGender,txtWeight;
    public static TextView txtBirthday;
    RelativeLayout Gender,Weight,Height,Birthday;
    private int selectedFeetValue = 0;
    int selectedHeightMearsure = 0;
    String[] values = {"Cm", "inch"};
    static int selectedWeightValue;
    String[] values2 = {"kg", "lbs"};
    int selectedStrideMearsure = 0;
  RelativeLayout rl_changepsw,rl_profile;
    Button no,yes;
    private static final int CAMERA_REQUEST = 1888;
    private static final int PICK_FROM_GALLERY = 2;
    private static final int CROP_IMAGE = 1;
    Uri uri;
    public byte[] imageInByte;
   ImageView image;
    Button logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personalinfo);
        //   ids();
        setToolbar();
        rl_changepsw=(RelativeLayout)findViewById(R.id.change_psw);
        rl_profile=(RelativeLayout)findViewById(R.id.rl_profile);
        image=(ImageView) findViewById(R.id.profile);

logout=(Button)findViewById(R.id.buttonFontStyle) ;
        logout.setOnClickListener(mlogout);

        rl_profile.setOnClickListener(mProfileListener);
        rl_changepsw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ChangepasswordActivity.class));
            }
        });
    }
    View.OnClickListener mlogout=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            final Dialog dialog = new Dialog(PersonalInfoActivity.this);
            /*Window window = dialog.getWindow();
            window.setLayout(130,900);*/
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            dialog.setCancelable(true);
            dialog.setContentView(R.layout.logout_alert);
            dialog.show();
            Button no=(Button)dialog. findViewById(R.id.no);
            Button yes=(Button)dialog. findViewById(R.id.yes);

              no.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();
                }
            });
           yes.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(PersonalInfoActivity.this, LoginpageActivity.class);
                    startActivity(intent);
                    dialog.dismiss();
                }
            });
        }


    };
    View.OnClickListener mProfileListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            final Dialog dialog = new Dialog(PersonalInfoActivity.this);
            /*Window window = dialog.getWindow();
            window.setLayout(130,900);*/
          dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
          dialog.setCancelable(true);
            dialog.setContentView(R.layout.profile_alert);
            dialog.show();
            txtCamera = (TextView) dialog.findViewById(R.id.camera);
            txtAlubm = (TextView) dialog.findViewById(R.id.album);


            txtCamera.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ClickImageFromCamera();
                    dialog.dismiss();
                }
            });
            txtAlubm.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    GetImageFromGallery();
                    dialog.dismiss();
                }
            });

            Button bNo = (Button) dialog.findViewById(R.id.btn_no);
            bNo.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    dialog.cancel();
                }
            });

        }
    };
    //    public void ids() {
//        Gender = (RelativeLayout) findViewById(R.id.rl_gender);
//        Gender.setOnClickListener(mGender);
//        txtGender = (TextView) findViewById(R.id.gender);
//        txtGender.setOnClickListener(mGender);
//
//        Height = (RelativeLayout) findViewById(R.id.height_rl);
//        Height.setOnClickListener(mheight);
//        txtHeight = (TextView) findViewById(R.id.txt_height);
//        txtHeight.setOnClickListener(mheight);
//
//        Weight = (RelativeLayout) findViewById(R.id.rl_weight);
//        Weight.setOnClickListener(mweight);
//        txtWeight = (TextView) findViewById(R.id.txt_weight);
//        txtWeight.setOnClickListener(mweight);
//
//        Birthday = (RelativeLayout) findViewById(R.id.rl_birthday);
//        Birthday.setOnClickListener(mbirthday);
//        txtBirthday = (TextView) findViewById(R.id.txt_birthday);
//
//
//    }
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
        toolbartext.append(getString(R.string.presonalinfo));
        // imgqrcode = (ImageView)toolbar.findViewById(R.id.qrcode_img);
        imgadd = (ImageView)toolbar.findViewById(R.id.add_img);
//        imgoptionsmenu = (ImageView)toolbar.findViewById(R.id.optionsmenu_icon);
//        imgoptionsmenu.setImageResource(R.drawable.icon_optionsmenu);
    }
    public void GetImageFromGallery() {
        GalIntent = new Intent(Intent.ACTION_PICK,
                android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(Intent.createChooser(GalIntent, "Select Image From Gallery"), PICK_FROM_GALLERY);
    }
    public void ClickImageFromCamera() {
        Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(cameraIntent, CAMERA_REQUEST);

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        Log.i("GGG", "" + requestCode + "..." + CAMERA_REQUEST);
        if (requestCode == CAMERA_REQUEST && resultCode == Activity.RESULT_OK) {
            if (data != null) {
                if(android.os.Build.MODEL.contains("ASUS")){
                    Bundle bundle = data.getExtras();
                    if (bundle != null) {
                        Bitmap yourImage = bundle.getParcelable("data");
                        Log.i("DATA_IMG2", "" + yourImage);
                        // convert bitmap to byte
                        ByteArrayOutputStream stream = new ByteArrayOutputStream();
                        yourImage.compress(Bitmap.CompressFormat.PNG, 100, stream);
                        imageInByte = stream.toByteArray();
                        ByteArrayInputStream imageStream = new ByteArrayInputStream(imageInByte);
                        Bitmap theImage = BitmapFactory.decodeStream(imageStream);
                        image.setImageBitmap(theImage);
                        Log.d("Insert: ", "Inserting ..");

                        //   db.addProfileModel(new ACCOUNT_SETTING("profile",imageInByte));
                        //  Intent i = new Intent(AccountSettings.this,AccountSettings.class);
                        //    startActivity(i);
                        // finish();
                    }
                }else {
                    uri = data.getData();
                    ImageCropFunction();
                }
            }

        } else if (requestCode == PICK_FROM_GALLERY) {
            if (data != null) {
                uri = data.getData();
                ImageCropFunction();
            }
        } else if (requestCode == CROP_IMAGE) {
            if (data != null) {
                Bundle bundle2 = data.getExtras();
                Bitmap yourImage = bundle2.getParcelable("data");
                Log.i("DATA_IMG2", "" + yourImage);
                // convert bitmap to byte
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                yourImage.compress(Bitmap.CompressFormat.PNG, 100, stream);
                imageInByte = stream.toByteArray();
                ByteArrayInputStream imageStream = new ByteArrayInputStream(imageInByte);
                Bitmap theImage = BitmapFactory.decodeStream(imageStream);
                image.setImageBitmap(theImage);
                Log.d("Insert: ", "Inserting ..");
                // db.addProfileModel(new ACCOUNT_SETTING("profile",imageInByte));
                // Intent i = new Intent(AccountSettings.this,AccountSettings.class);
                // startActivity(i);
                //finish();

            }
        }
    }
    public void ImageCropFunction() {
        // Image Crop Code
        try {
            CropIntent = new Intent("com.android.camera.action.CROP");

            CropIntent.setDataAndType(uri, "image/*");

            CropIntent.putExtra("crop", "true");
            CropIntent.putExtra("outputX", 180);
            CropIntent.putExtra("outputY", 180);
            CropIntent.putExtra("aspectX", 3);
            CropIntent.putExtra("aspectY", 4);
            CropIntent.putExtra("scaleUpIfNeeded", true);
            CropIntent.putExtra("return-data", true);

            startActivityForResult(CropIntent, CROP_IMAGE);

        } catch (ActivityNotFoundException e) {
            e.printStackTrace();
        }
    }

//    //called when we click on birthday
//    View.OnClickListener mbirthday = new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            Log.e("called", "" + mbirthday);
//            DialogFragment dialogfragment = new DatePickerDialogClass();
//
//            dialogfragment.show(getFragmentManager(), "Date Picker Dialog");
//            /*txtBirthday.setText(String.valueOf(day) + "/"
//                    + String.valueOf(month + 1) + "/" + String.valueOf(year));*/
//        }
//    };
//    //add datepicker dialogue to dob
//    public static class DatePickerDialogClass extends DialogFragment implements DatePickerDialog.OnDateSetListener {
//
//        @Override
//        public Dialog onCreateDialog(Bundle savedInstanceState) {
//
//            String[] txtBirthdayArray = txtBirthday.getText().toString().split("-");
//            int year = Integer.parseInt(txtBirthdayArray[0]);
//            int month = Integer.parseInt(txtBirthdayArray[1]);
//            int day = Integer.parseInt(txtBirthdayArray[2]);
//
//            DatePickerDialog datepickerdialog = new DatePickerDialog(getActivity(),
//                    AlertDialog.THEME_HOLO_DARK, this, year, month-1, day);
//
//            return datepickerdialog;
//        }
//
//        public void onDateSet(DatePicker view, int year, int month, int day) {
//
//            Log.e("Dateset",""+year+","+month+","+day+"");
//
//            String monthText = String.valueOf(month+1);
//            if (month <10)
//            {
//                monthText = "0"+ monthText;
//            }
//            String dayText = String.valueOf(day);
//            if (day <10)
//            {
//                dayText = "0"+ dayText;
//            }
//
//            txtBirthday.setText(year + "-" + monthText + "-" + dayText);
//
//        }
//    }
//    View.OnClickListener mGender = new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            final Dialog mod = new Dialog(PersonalInfoActivity.this);
//            mod.requestWindowFeature(Window.FEATURE_NO_TITLE);
//            mod.setCanceledOnTouchOutside(false);
//            mod.setContentView(R.layout.setup_alert);
//            TextView txtTitle = (TextView) mod.findViewById(R.id.text_info);
//            txtTitle.setText("Set Gender");
//
//            final ListView l1 = (ListView) mod.findViewById(R.id.list_alert);
//
//            ArrayList<String> arrayList = new ArrayList<String>();
//
//            int selected = 0;
//            final int state = 1;
//
//            if (txtGender.getText().toString() == "Male")
//            {
//                value = "Male";
//                key = 0;
//                selected = 0;
//                l1.setItemChecked(selected, true);
//            }
//            else
//            {
//
//                value = "Female";
//                key = 1;
//                selected = 1;
//                l1.setItemChecked(selected, true);
//            }
//
//
//            arrayList.clear();
//            arrayList.add("Male");
//            arrayList.add("Female");
//
//            GenderCustomList customlist = new GenderCustomList(PersonalInfoActivity.this, arrayList, selected);
//
//            l1.setAdapter(customlist);
//
//            l1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//
//                @Override
//                public void onItemClick(AdapterView<?> arg0, View arg1,
//                                        int arg2, long arg3) {
//                    // TODO Auto-generated method stub
//
//                    if (arg2 == 0) {
//                        value = "Male";
//                        key = 0;
//                    } else {
//                        value = "Female";
//                        key = 1;
//
//                    }
//
//                    for (int i = 0; i < arg0.getCount(); i++) {
//                        View v = arg0.getChildAt(i);
//                        RadioButton radio = (RadioButton) v.findViewById(R.id.radioButton_check);
//                        radio.setChecked(false);
//                    }
//
//                    RadioButton radio = (RadioButton) arg1.findViewById(R.id.radioButton_check);
//                    radio.setChecked(true);
//
//                }
//            });
//            Button btnOk = (Button) mod.findViewById(R.id.btn_ok);
//            btnOk.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    mod.cancel();
//                    isGenderChange = true;
//                    if (key == 0) {
//                        txtGender.setText("Male");
//                    } else {
//                        txtGender.setText("Female");
//                    }
//
//                     }
//            });
//
//            Button btnCancel = (Button) mod.findViewById(R.id.btn_cancel);
//            btnCancel.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    mod.cancel();
//                }
//            });
//            mod.show();
//        }
//    };
//    //called when we click on height
//    View.OnClickListener mheight = new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            final Dialog mod = new Dialog(PersonalInfoActivity.this);
//            mod.requestWindowFeature(Window.FEATURE_NO_TITLE);
//            // mod.setCancelable(false);
//            mod.setContentView(R.layout.height_alert);
//
//            final TextView txtTitle = (TextView) mod.findViewById(R.id.text_info);
//            txtTitle.setText("Set Height");
//
//            String heightText = txtHeight.getText().toString();
//            Log.e("SelectedHeight",heightText);
//            String[] heightArray = heightText.split(" ");
//            int heightValue = Integer.parseInt(heightArray[0]);
//            String heightMeasureString = heightArray[1];
//            Log.e("HeightMeasureString",heightMeasureString);
//            int heightMeasure = 1;
//            Log.e("HeightMeasureStringChar",String.valueOf(heightMeasureString.length()));
//            if(heightMeasureString.length() == 2)
//            {
//                heightMeasure = 0;
//            }
//
//            Log.e("heightMeasure", String.valueOf(heightMeasure));
//
//            // Set the max and min values of the numberpicker, and give it the
//            // array of numbers created above to be the displayed numbers
//            final NumberPicker np = (NumberPicker) mod.findViewById(R.id.number_picker);//           np.setDividerColor(getResources().getColor(R.color.colorPrimary));
////            np.setDividerColorResource(R.color.colorPrimary);
//
//            np.setMaxValue(219);
//            np.setMinValue(100);
//            np.setValue(heightValue);
//            np.setWrapSelectorWheel(true);
//            selectedFeetValue = np.getValue();
//            np.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
//                @Override
//                public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
//
//                    Log.i("SELECT_HEIGHT", "" + newVal);
//                    selectedFeetValue = picker.getValue();
//                }
//            });
//
//            String Value = null;
//
//            final NumberPicker np1 = (NumberPicker) mod.findViewById(R.id.number_picker2);//
//            //           np.setDividerColor(getResources().getColor(R.color.colorPrimary));
//            np1.setMaxValue(values.length - 1);
//            np1.setMinValue(0);
//            np1.setValue(heightMeasure);
//            np1.setWrapSelectorWheel(true);
//            selectedHeightMearsure = heightMeasure;
//
//            /*if (Integer.parseInt(db.getHeightMeasure()) == 0) {
//                np1.setValue(Integer.parseInt("cm"));
//            } else {
//                np1.setValue(Integer.parseInt("Inch"));
//            }*/
//            np1.setWrapSelectorWheel(true);
//            np1.setDisplayedValues(values);
//
//            //selectedHeightMearsure = np1.getValue();
//            np1.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
//                @Override
//                public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
//                    Log.i("SELECT_HEIGHT", "" + newVal);
//                    selectedHeightMearsure = picker.getValue();
//                }
//            });
//
//            Button btnOk = (Button) mod.findViewById(R.id.btn_yes);
//            btnOk.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    mod.cancel();
//                    Log.e("HEIGHT", "" + selectedFeetValue);
//
//                    int sHeight = Integer.parseInt(String.valueOf(np.getValue()));
//
//                    int pos = np1.getValue();
//                    //get string from number picker and position
//                    String selecPicker = values[pos];
//                    txtHeight.setText("" + sHeight + " " + selecPicker);
//
//                }
//            });
//
//            Button btnCancel = (Button) mod.findViewById(R.id.btn_no);
//            btnCancel.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    mod.cancel();
//                }
//            });
//            mod.show();
//
//        }
//    };
//    private int selectedWeightMearsure = 0;
//    View.OnClickListener mweight = new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            final Dialog mod = new Dialog(PersonalInfoActivity.this);
//            mod.requestWindowFeature(Window.FEATURE_NO_TITLE);
//            // mod.setCancelable(false);
//            mod.setContentView(R.layout.weight_alert);
//
//            final TextView txtTitle = (TextView) mod.findViewById(R.id.text_info);
//            txtTitle.setText("Set Weight");
//
//            String weightText = txtWeight.getText().toString();
//            Log.e("SelectedWeight",weightText);
//            String[] weightArray = weightText.split(" ");
//            int weightValue = Integer.parseInt(weightArray[0]);
//            String weightMeasureString = weightArray[1];
//
//            int weightMeasure = 1;
//            if(weightMeasureString.length() == 2)
//            {
//                weightMeasure = 0;
//            }
//            final NumberPicker np = (NumberPicker) mod.findViewById(R.id.weight_pickerone);
//            np.setMaxValue(130);
//            np.setMinValue(10);
//            np.setValue(weightValue);
//            np.setWrapSelectorWheel(true);
//            selectedWeightValue = np.getValue();
//            np.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
//                @Override
//                public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
//
//                    Log.i("SELECT_STRIDE", "" + newVal);
//                    selectedWeightValue = picker.getValue();
//                }
//            });
//
//            final NumberPicker np1 = (NumberPicker) mod.findViewById(R.id.weight_pickertwo);//           np.setDividerColor(getResources().getColor(R.color.colorPrimary));
//            np1.setMaxValue(values2.length - 1);
//            np1.setMinValue(0);
//            np1.setWrapSelectorWheel(true);
//            np1.setValue(weightMeasure);
//            selectedStrideMearsure = np1.getValue();
//            np1.setDisplayedValues(values2);
//
//            np1.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
//                @Override
//                public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
//                    Log.i("SELECT_WEIGHT", "" + newVal);
//                    // selectedWeightMearsure = Integer.parseInt(String.valueOf(picker.getValue()));
//                    selectedWeightMearsure = picker.getValue();
//                }
//            });
//            Button btnOk = (Button) mod.findViewById(R.id.btn_yes);
//            btnOk.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    mod.cancel();
//                    Log.e("WEIGHT", "" + selectedWeightValue);
//
//                    int sWeight = Integer.parseInt(String.valueOf(np.getValue()));
//                    int pos = np1.getValue();
//
//                    //get string from number picker and position
//                    String selecPicker = values2[pos];
//                    //test toast to get selected text string
//                    // Toast.makeText(getApplicationContext(), selecPicker , Toast.LENGTH_SHORT).show();
//                    txtWeight.setText("" + sWeight + " " + selecPicker);
//                }
//            });
//
//            Button btnCancel = (Button) mod.findViewById(R.id.btn_no);
//            btnCancel.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    mod.cancel();
//                }
//            });
//            mod.show();
//        }
//
//    };
//
//    public class GenderCustomList extends BaseAdapter {
//        Context context;
//
//        ArrayList<String> arrayList;
//        int selectedPosition = 0;
//
//        GenderCustomList(Context context, ArrayList<String> arrayList, int selectedPosition) {
//            this.context = context;
//            this.arrayList = arrayList;
//            this.selectedPosition = selectedPosition;
//        }
//
//        @Override
//        public int getCount() {
//            return arrayList.size();
//        }
//
//        @Override
//        public Object getItem(int position) {
//            return null;
//        }
//
//        @Override
//        public long getItemId(int position) {
//            return 0;
//        }
//
//        @Override
//        public View getView(final int position, View convertView, ViewGroup parent) {
//
//            LayoutInflater mInflater = (LayoutInflater) context
//                    .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
//            convertView = mInflater.inflate(R.layout.setup_list_item_custom, null);
//            TextView textView = (TextView) convertView.findViewById(R.id.text_item_name);
//            RadioButton radioButton = (RadioButton) convertView.findViewById(R.id.radioButton_check);
//            // Button b=(Button)convertView.findViewById(R.id.img_custom);
//            textView.setText(arrayList.get(position));
//
//
//            radioButton.setChecked(position == selectedPosition);
//            //b.setEnabled(position==selectedPosition);
//            return convertView;
//        }
//    }
}
