package com.example.classwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        private Button btn_1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_1=findViewById(R.id.btn_1);
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"show toast",Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, Main2Activity.class);    //第一個是現在專案名稱，第二個是跳轉的專案
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("main","run a page onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("main","a page onRestart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("main","a page onResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("main","a page onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("main","a page onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("main","a page onDestroy");
    }

}
