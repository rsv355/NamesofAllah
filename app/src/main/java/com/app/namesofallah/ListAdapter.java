package com.app.namesofallah;

/**
 * Created by Krishna on 30-04-2015.
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


class ListAdapter extends BaseAdapter {
    LayoutInflater layoutInflator;
    private Context ctx;
    Content obj;
    public ListAdapter(Context ctx){
        this.ctx = ctx;
        obj = new Content();
    }

    @Override
    public int getCount() {
        return obj.Names.size();
    }

    @Override
    public Object getItem(int i) {
        return obj.Names.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        layoutInflator = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = convertView;
        view = layoutInflator.inflate(R.layout.list_item, viewGroup, false);

       TextView txt = (TextView)view.findViewById(R.id.txt1);
       ImageView icon = (ImageView)view.findViewById(R.id.imgIcon);

       txt.setText(obj.Names.get(position));

        return view;
    }
}