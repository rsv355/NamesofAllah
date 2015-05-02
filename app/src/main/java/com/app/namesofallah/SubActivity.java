package com.app.namesofallah;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import android.util.Log;
import android.widget.Toast;

public class SubActivity extends ActionBarActivity {

    private ImageView left,right,playAudio,mainImg;
    private String[] names1 = {"My Recipes", "Profiles", "Add Recipe"};
    private Toolbar toolbar;
    private TextView heading,subheading,desc;
    private int POS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null) {
            toolbar.setTitle("HOME");
//            toolbar.setLogo(R.drawable.logo);
            setSupportActionBar(toolbar);
        }
        toolbar.setNavigationIcon(R.mipmap.ic_launcher);


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
                return false;
            }
        });
    }


    private void fillDetails(int POS2){

        Content obj = new Content();

     /*   Bitmap bitmapImage = getBitmapFromAsset(obj.BIG_Images.get(POS));
        Drawable drawImage = new BitmapDrawable(getResources(), bitmapImage);*/
        String imgName = obj.BIG_Images.get(POS2);
        int resId = getResources().getIdentifier(imgName, "drawable", getPackageName());

        mainImg.setBackgroundResource(resId);


        heading.setText(obj.Names.get(POS2));
        subheading.setText(obj.Sub_heading.get(POS2));
        desc.setText(obj.Description.get(POS2));

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
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
