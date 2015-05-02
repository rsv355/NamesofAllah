package com.app.namesofallah;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Android on 01-05-2015.
 */
public  class SettingsAdapter extends ArrayAdapter<String> {

    // View lookup cache
    private ArrayList<String> users;
    Context ctx;
    private  class ViewHolder {
        TextView name;
        TextView home;
    }

    public SettingsAdapter(Context context, ArrayList<String> users) {
        super(context, R.layout.item_popup, users);
        this.users = users;
        this.ctx = context;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // Get the data item for this position

        // Check if an existing view is being reused, otherwise inflate the view
        ViewHolder viewHolder; // view lookup cache stored in tag
        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.item_popup,parent,false);

            TextView itemNames = (TextView)convertView.findViewById(R.id.txtItemName);
            itemNames.setText(users.get(position));

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (position) {


                }
            }
        });

        // Populate the data into the template view using the data object
        // Return the completed view to render on screen
        return convertView;
    }
}