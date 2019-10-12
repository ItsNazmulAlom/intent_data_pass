package com.nazmul.intentdatapass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class details extends AppCompatActivity {

    ImageView imageView;
    TextView txtInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        imageView=findViewById(R.id.imageView) ;
        txtInfo=findViewById(R.id.txt_info);


        getSupportActionBar().setHomeButtonEnabled(true); //for back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);//for back button
        getSupportActionBar().setTitle("Details");//for actionbar title

        //data received
        String getId=getIntent().getExtras().getString("id");



        if (getId.equals("father"))
        {

            txtInfo.setText("Bangladesh");
            imageView.setImageResource(R.drawable.ggg);
        }



        else if (getId.equals("mother"))
        {

            txtInfo.setText("japan");
            imageView.setImageResource(R.drawable.tttt);
        }


    }












    //for back button
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // app icon in action bar clicked; goto parent activity.
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
