package com.anky.xbase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * @author: Anky
 * @time: 2018
 * @desc:
 */

public class MainAdapter extends BaseAdapter {

    private List<MainBean> mDatas;
    private Context mContext;

    public MainAdapter(List<MainBean> datas, Context context) {
        this.mDatas = datas;
        this.mContext = context;
    }

    @Override
    public int getCount() {
        return mDatas == null ? 0 : mDatas.size();
    }

    @Override
    public MainBean getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_main, parent,false);
            holder = new ViewHolder();
            holder.tv_desc = convertView.findViewById(R.id.tv_desc);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        MainBean bean = getItem(position);
        holder.tv_desc.setText(bean.name);
        return convertView;
    }

    class ViewHolder {
        private TextView tv_desc;
    }
}
