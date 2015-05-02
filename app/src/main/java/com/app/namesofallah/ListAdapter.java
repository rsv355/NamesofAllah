package com.app.namesofallah;

/**
 * Created by Krishna on 30-04-2015.
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


class ListAdapter extends BaseAdapter {
    LayoutInflater layoutInflator;
    private Context ctx;
    public ListAdapter(Context ctx){
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return 100;
    }

    @Override
    public Object getItem(int i) {
        return null;
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
        txt.setText("Item "+position);

        return view;
    }
}