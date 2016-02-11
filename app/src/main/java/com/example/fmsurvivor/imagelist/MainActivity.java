package com.example.fmsurvivor.imagelist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    PhotoListAdapter mPhotoListAdapter;
    List<PhotoModel> mPhotoList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button great_button = (Button)findViewById(R.id.sugoi_button);

        mPhotoListAdapter = new PhotoListAdapter(this);

        ListView listview = (ListView) findViewById(R.id.list_view);
        listview.setAdapter(mPhotoListAdapter);

        mPhotoList = new ArrayList<>();

        great_button.setOnClickListener(this);

        //コメントアウト消さないと
        mPhotoList.add(new PhotoModel(/*右の空文字列に取りたい画像のURLを入れる. 今は適当*/"hogehoge.png", new Date(), "Test text"));
        mPhotoListAdapter.setPhotoList(mPhotoList);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.sugoi_button:
                mPhotoList.add(0,new PhotoModel(/*右の空文字列に取りたい画像のURLを入れる. 今は適当*/"hogehoge.png", new Date(), "Test text"));
                mPhotoListAdapter.setPhotoList(mPhotoList);
                break;
        }
    }

}
