package com.app.namesofallah;

import android.app.WallpaperManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.ListPopupWindow;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.twotoasters.jazzylistview.JazzyListView;
import com.twotoasters.jazzylistview.effects.CurlEffect;

import java.util.ArrayList;
import java.util.Arrays;


public class MainActivity extends ActionBarActivity {
    private ImageView left,right,playAudio;
    private String[] names1 = {"My Recipes", "Profiles", "Add Recipe"};
    private Toolbar toolbar;
    ListPopupWindow popupWindow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null) {
            toolbar.setTitle("99 names of Allah");
//            toolbar.setLogo(R.drawable.logo);
            setSupportActionBar(toolbar);
        }
        toolbar.setNavigationIcon(R.drawable.toolbaricon);


        AdView adView = (AdView) this.findViewById(R.id.adView);
        // Request for Ads
        AdRequest adRequest = new AdRequest.Builder()
                .build();

        // Load ads into Banner Ads
        adView.loadAd(adRequest);



        // adview ends

        JazzyListView list = (JazzyListView) findViewById(R.id.list);

        //slideeffect is good;FadeEffect()
        list.setTransitionEffect(new CurlEffect());


        ListAdapter adp = new ListAdapter(MainActivity.this);
        list.setAdapter(adp);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
                Intent ii = new Intent(MainActivity.this,SubActivity.class);
                ii.putExtra("pos",pos);
                startActivity(ii);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (id){
            case R.id.action_settings:
                openSettings();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void openSettings() {
        View menuSettings = findViewById(R.id.action_settings); // SAME ID AS MENU ID

        String[] names = {"Share","Rate"};
        int[] img = {R.drawable.icon_share,R.drawable.icon_rate};

        popupWindow = new ListPopupWindow(MainActivity.this);
        popupWindow.setAnchorView(menuSettings);
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(names));

        int width = getResources().getDisplayMetrics().widthPixels;
        int height =  getResources().getDisplayMetrics().heightPixels;

        popupWindow.setWidth((int)(width/1.5));
        popupWindow.setHeight(200);
        popupWindow.setModal(true);
        popupWindow.setAdapter(new SettingsAdapter(MainActivity.this,arrayList,img));
        popupWindow.show();
    }

    public  class SettingsAdapter extends ArrayAdapter<String> {

        // View lookup cache
        private ArrayList<String> users;
        Context ctx;
        int[] iconImg;

        private class ViewHolder {
            TextView name;
            TextView home;
        }

        public SettingsAdapter(Context context, ArrayList<String> users,int[] icon) {
            super(context, R.layout.item_popup, users);
            this.users = users;
            this.ctx = context;
            this.iconImg = icon;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            // Get the data item for this position

            // Check if an existing view is being reused, otherwise inflate the view
            ViewHolder viewHolder; // view lookup cache stored in tag
            if (convertView == null) {
                viewHolder = new ViewHolder();
                LayoutInflater inflater = LayoutInflater.from(getContext());
                convertView = inflater.inflate(R.layout.item_popup, parent, false);

                ImageView imgIcon = (ImageView)convertView.findViewById(R.id.imgIcon);
                imgIcon.setBackgroundResource(iconImg[position]);

                TextView itemNames = (TextView) convertView.findViewById(R.id.txtItemName);
                itemNames.setText(users.get(position));

                convertView.setTag(viewHolder);
            } else {
                viewHolder = (ViewHolder) convertView.getTag();
            }

            convertView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    switch (position) {
                        case 0:
                            String text = "Please Check out this amazing app 99 Names of Allah , \n https://play.google.com/store/apps/details?id=com.app.namesofallah";

                            Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                            sharingIntent.setType("text/plain");
                            sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, text);
                            // sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject");
                            ctx.startActivity(Intent.createChooser(sharingIntent, "Share using"));

                            popupWindow.dismiss();

                            break;
                        case 1:

                            Toast.makeText(MainActivity.this,"Please Wat comming soon",Toast.LENGTH_SHORT).show();
                            popupWindow.dismiss();
                            break;
                      /*  case 2:
                            popupWindow.dismiss();

                            break;*/


                    }
                }
            });

            // Populate the data into the template view using the data object
            // Return the completed view to render on screen
            return convertView;
        }
    }

    //end of main class
}
