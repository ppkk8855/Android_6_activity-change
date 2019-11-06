package com.example.classwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {

    private Button btn_bk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        btn_bk=findViewById(R.id.btn_back);
        btn_bk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);    //第一個是現在專案名稱，第二個是跳轉的專案
                startActivity(intent);

                finish(); //完成，清除記憶體
            }


        });

    }

    public  void  changImg(View view){

        ImageView img = (ImageView)findViewById(R.id.image1);
              Bitmap bImage = BitmapFactory.decodeResource(this.getResources(),R.drawable.b123);
               img.setImageBitmap(bImage);


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("mainB","run B page onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("mainB","B page onRestart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("mainB","B page onResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("mainB","B page onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("mainB","B page onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("mainB","B page onDestroy");
    }

}
