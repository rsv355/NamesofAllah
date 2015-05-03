package com.app.namesofallah;

import android.app.ProgressDialog;
import android.app.WallpaperManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.ListPopupWindow;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;

import android.util.Log;
import android.widget.Toast;

public class SubActivity extends ActionBarActivity {

    private ImageView left,right,playAudio,mainImg;
    private String[] names1 = {"My Recipes", "Profiles", "Add Recipe"};
    private Toolbar toolbar;
    private TextView heading,subheading,desc;
    private int POS;
    Content obj;
    ProgressDialog dialog;
    ListPopupWindow popupWindow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null) {
            toolbar.setTitle("99 names of Allah");
//            toolbar.setLogo(R.drawable.logo);
            setSupportActionBar(toolbar);
        }
        toolbar.setNavigationIcon(R.mipmap.ic_launcher);

        obj = new Content();
        left = (ImageView)findViewById(R.id.left);
        right = (ImageView)findViewById(R.id.right);
        playAudio = (ImageView)findViewById(R.id.playAudio);

        mainImg = (ImageView)findViewById(R.id.mainImg);
        heading = (TextView)findViewById(R.id.heading);
        subheading= (TextView)findViewById(R.id.subheading);
        desc = (TextView)findViewById(R.id.desc);

        POS = getIntent().getIntExtra("pos",0);
        fillDetails(POS);


        left.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(POS <= 0){
                    Toast.makeText(SubActivity.this,"You are at First Word",Toast.LENGTH_LONG).show();
                }else {
                    POS -= 1;
                    fillDetails(POS);
                }
                return false;
            }
        });

        right.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(POS>=99){
                    Toast.makeText(SubActivity.this,"You are at Last Word",Toast.LENGTH_LONG).show();
                }else {
                    POS += 1;
                    fillDetails(POS);
                }

                return false;
            }
        });

        playAudio.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                dialog= ProgressDialog.show(SubActivity.this,obj.Names.get(POS),"Playing audio",true);
                dialog.setCancelable(false);

                String fname=obj.Audio.get(POS);
                int resID=getResources().getIdentifier(fname, "raw", getPackageName());
                MediaPlayer mediaPlayer=MediaPlayer.create(SubActivity.this,resID);

                mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        dialog.show();
                    }
                });
                mediaPlayer.start();

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        dialog.dismiss();
                    }
                });

                return false;
            }
        });
    }


    private void fillDetails(int POS2){



     /*   Bitmap bitmapImage = getBitmapFromAsset(obj.BIG_Images.get(POS));
        Drawable drawImage = new BitmapDrawable(getResources(), bitmapImage);*/
        String imgName = obj.BIG_Images.get(POS2);
        int resId = getResources().getIdentifier(imgName, "drawable", getPackageName());

        mainImg.setBackgroundResource(resId);


        heading.setText(obj.Names.get(POS2));
        subheading.setText(obj.Sub_heading.get(POS2));
        desc.setText(obj.Description.get(POS2));

        if(POS2==0){
            playAudio.setVisibility(View.GONE);
        }else {
            playAudio.setVisibility(View.VISIBLE);
        }

    }

   /* private Bitmap getBitmapFromAsset(String imgName)
    {
        AssetManager assetManager = getAssets();
        InputStream istr = null;
        try {
            istr = assetManager.open(imgName);
        } catch (IOException e) {
            Log.e("exc",e.toString());
            e.printStackTrace();
        }
        Bitmap bitmap = BitmapFactory.decodeStream(istr);
        return bitmap;
    }*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
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

        String[] names = {"Set as Wallpaper"};
        int[] img = {R.drawable.icon_wallpaper};

        popupWindow = new ListPopupWindow(SubActivity.this);
        popupWindow.setAnchorView(menuSettings);
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(names));

        int width = getResources().getDisplayMetrics().widthPixels;
        int height =  getResources().getDisplayMetrics().heightPixels;

        popupWindow.setWidth((int) (width / 1.5));
        popupWindow.setHeight(100);
        popupWindow.setModal(true);
        popupWindow.setAdapter(new SettingsAdapterSub(SubActivity.this, arrayList,img));
        popupWindow.show();
    }

    public  class SettingsAdapterSub extends ArrayAdapter<String> {

        // View lookup cache
        private ArrayList<String> users;
        Context ctx;
        int[] iconImg;

        private class ViewHolder {
            TextView name;
            TextView home;
        }

        public SettingsAdapterSub(Context context, ArrayList<String> users,int[] icon) {
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
                            try {
                                String imgName = obj.Wallpaper.get(POS);
                                int resId = ctx.getResources().getIdentifier(imgName, "drawable", ctx.getPackageName());

                                WallpaperManager myWallpaperManager = WallpaperManager.getInstance(ctx.getApplicationContext());
                                myWallpaperManager.setResource(resId);

                                Toast.makeText(SubActivity.this,"New Wallpaper Set",Toast.LENGTH_SHORT).show();
                                popupWindow.dismiss();

                            } catch (Exception e) {
                                Log.e("exc", e.toString());
                            }


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
