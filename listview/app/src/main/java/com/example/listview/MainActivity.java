package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Student> mData = null;
    private Context mContext;
    private StuAdapter mAdapter = null;
    private ListView list_animal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = MainActivity.this;
        list_animal = (ListView) findViewById(R.id.list_stu);
        final LayoutInflater inflater = LayoutInflater.from(this);
        View headView = inflater.inflate(R.layout.view_header, null, false);
        View footView = inflater.inflate(R.layout.view_footer, null, false);

        mData = new LinkedList<Student>();
        mData.add(new Student("20161707", "n ", R.mipmap.ic_stu_01));
        mData.add(new Student("20161713", "n ", R.mipmap.ic_stu_02));
        mData.add(new Student("20171591", " n", R.mipmap.ic_stu_03));
        mData.add(new Student("20171592", "n ", R.mipmap.ic_stu_04));
        mData.add(new Student("20171616", " n", R.mipmap.ic_stu_05));
        mData.add(new Student("20171627", "n ", R.mipmap.ic_stu_06));
        mData.add(new Student("20171641", " n", R.mipmap.ic_stu_07));
        mData.add(new Student("20171649", " n", R.mipmap.ic_stu_08));
        mData.add(new Student("20171650", "n ", R.mipmap.ic_stu_09));
        mData.add(new Student("20171653", " n", R.mipmap.ic_stu_10));
        mData.add(new Student("20171654", " n", R.mipmap.ic_stu_11));
        mData.add(new Student("20171655", "n ", R.mipmap.ic_stu_12));
        mData.add(new Student("20171656", "n ", R.mipmap.ic_stu_13));
        mData.add(new Student("20171659", "n ", R.mipmap.ic_stu_14));
        mData.add(new Student("20171664", " n", R.mipmap.ic_stu_15));
        mData.add(new Student("20171666", " n", R.mipmap.ic_stu_16));
        mData.add(new Student("20171667", " n", R.mipmap.ic_stu_17));
        mData.add(new Student("20171668", "n ", R.mipmap.ic_stu_18));
        mData.add(new Student("20171669", " n", R.mipmap.ic_stu_19));
        mData.add(new Student("20171670", " n", R.mipmap.ic_stu_20));
        mData.add(new Student("20171679", "n ", R.mipmap.ic_stu_21));
        mData.add(new Student("20171688", " n", R.mipmap.ic_stu_22));
        mData.add(new Student("20171697", "n ", R.mipmap.ic_stu_23));
        mData.add(new Student("20171705", " n", R.mipmap.ic_stu_24));
        mData.add(new Student("20171707", "n ", R.mipmap.ic_stu_25));
        mData.add(new Student("20171714", " n", R.mipmap.ic_stu_26));
        mData.add(new Student("20171717", " n", R.mipmap.ic_stu_27));
        mData.add(new Student("20171731", " n", R.mipmap.ic_stu_28));
        mData.add(new Student("20171742", " n", R.mipmap.ic_stu_29));
        mData.add(new Student("20175064", " n", R.mipmap.ic_stu_30));
        mData.add(new Student("20175980", "n ", R.mipmap.ic_stu_31));
        mData.add(new Student("20175990", " n", R.mipmap.ic_stu_32));



        mAdapter = new StuAdapter((LinkedList<Student>) mData, mContext);


        list_animal.addHeaderView(headView);
        list_animal.addFooterView(footView);

        list_animal.setAdapter(mAdapter);
        list_animal.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    default:
                        Toast.makeText(mContext,"you have clicked" + position ,Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity.this, Show.class);
                        intent.putExtra("position",position);
                        startActivity(intent);
                        break;
                }

            }
        });

    }

}
