package com.android.dialoglibrary.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.android.dialoglibrary.R;

import java.util.List;


/**
 * Created by radio on 2017/10/31.
 */

public class UsefulDialogStringListAdapter extends BaseAdapter {
    private List<String> list;
    private Context context;
    public void setNotify(Context context){
        this.context=context;
        notifyDataSetChanged();
    }
    public UsefulDialogStringListAdapter(List<String> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final ViewHolder viewHolder;
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.usefuldialog_listview_string_item, viewGroup, false);
            viewHolder = new ViewHolder();
            viewHolder.tvPopwindowListview=(TextView) view.findViewById(R.id.tv_popwindow_listview);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.tvPopwindowListview.setText(list.get(i));
        return view;
    }

    static class ViewHolder {
        TextView tvPopwindowListview;
    }
}
