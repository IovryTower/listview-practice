package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Show extends AppCompatActivity {
    private String begin="there is him/her information";

    private int[] imageId = new int[]{R.mipmap.ic_stu_01, R.mipmap.ic_stu_02, R.mipmap.ic_stu_03, R.mipmap.ic_stu_04,
            R.mipmap.ic_stu_05, R.mipmap.ic_stu_06, R.mipmap.ic_stu_07, R.mipmap.ic_stu_08, R.mipmap.ic_stu_09, R.mipmap.ic_stu_10, R.mipmap.ic_stu_11,
            R.mipmap.ic_stu_12, R.mipmap.ic_stu_13, R.mipmap.ic_stu_14, R.mipmap.ic_stu_15, R.mipmap.ic_stu_16, R.mipmap.ic_stu_17, R.mipmap.ic_stu_18,
            R.mipmap.ic_stu_19, R.mipmap.ic_stu_20, R.mipmap.ic_stu_21, R.mipmap.ic_stu_22, R.mipmap.ic_stu_23, R.mipmap.ic_stu_24, R.mipmap.ic_stu_25,
            R.mipmap.ic_stu_26, R.mipmap.ic_stu_27, R.mipmap.ic_stu_28, R.mipmap.ic_stu_29, R.mipmap.ic_stu_30, R.mipmap.ic_stu_31, R.mipmap.ic_stu_32};
    private String[] CQUId = new String[]{"20161707", "20161713", "20171591", "20171592",
            "20171616", "20171627", "20171641", "20171649", "20171650", "20171653", "20171654",
            "20171655", "20171656", "20171659", "20171664", "20171666", "20171667", "20171668",
            "20171669", "20171670", "20171679", "20171688", "20171697", "20171705", "20171707",
            "20171714", "20171717", "20171731", "20171742", "20175064", "20175980", "20175990"};
    ImageView imageView;
    TextView textView,textViewId;
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        Intent i = getIntent();
        position = i.getIntExtra("position",0);
        imageView = findViewById(R.id.img);
        textView =  findViewById(R.id.na);
        textViewId =  findViewById(R.id.spe);



        switch (position){
            default:
                imageView.setImageResource(imageId[position-1]);
                textView.setText( CQUId[position-1]);
                textViewId.setText(textViewId.getText().toString()+begin);
                break;
        }

    }
}
