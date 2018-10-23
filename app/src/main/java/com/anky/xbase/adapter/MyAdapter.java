package com.anky.xbase.adapter;

import android.content.Context;

import com.anky.utils.recyclerview.CommonAdapter;
import com.anky.utils.recyclerview.base.ViewHolder;
import com.anky.xbase.R;
import com.anky.xbase.domain.MyBean;

import java.util.List;

/**
 * @author: Anky
 * @time: 2018
 * @desc:
 */

public class MyAdapter extends CommonAdapter<MyBean> {
    public MyAdapter(Context context,  List<MyBean> datas) {
        super(context, R.layout.adapter_my, datas);
    }

    @Override
    protected void convert(ViewHolder holder, MyBean bean, int position) {
        holder.setText(R.id.tv_desc,bean.name);
    }




}
