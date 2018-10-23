package com.anky.xbase;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.anky.xbase.refresh.RefreshActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private List<MainBean> mDatas=new ArrayList<>();
    private MainAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDatas();
        listView = findViewById(R.id.lv_main);
        mAdapter = new MainAdapter(mDatas, this);
        listView.setAdapter(mAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MainBean bean = mAdapter.getItem(position);
                startActivity(new Intent(MainActivity.this, bean.clazz));
            }
        });
    }

    private void initDatas() {
        mDatas.add(new MainBean(RefreshActivity.class,"刷新加载"));
    }
}
