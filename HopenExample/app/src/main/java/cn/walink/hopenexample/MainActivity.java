package cn.walink.hopenexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import cn.walink.hopen.progress.HProgress;
import cn.walink.hopen.progress.HProgressType;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        Button btn1 = (Button) findViewById(R.id.btn_1);
        Button btn2 = (Button) findViewById(R.id.btn_2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HProgress progress = HProgress.createDialog(MainActivity.this, HProgressType.PointProgress);
                progress.show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HProgress progress = HProgress.createDialog(MainActivity.this, HProgressType.PointCircleProgress);
                progress.show();
            }
        });


    }

}
