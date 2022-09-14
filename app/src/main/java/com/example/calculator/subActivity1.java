package com.example.calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class subActivity1 extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private View drawerView;
    private Button btn_home;

    private TextView edtitText_1, edtitText_2, edtitText_result;
    private Button equal_btnsub1, see_formal;

    double num1 =0.0, num2=0.0, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub1);

        edtitText_1 = (TextView)findViewById(R.id.edtitText_1);
        edtitText_2 = (TextView) findViewById(R.id.edtitText_2);
        edtitText_result = (TextView) findViewById(R.id.edtitText_result);
        equal_btnsub1 = (Button)findViewById(R.id.equal_btnsub1);
        equal_btnsub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1 = edtitText_1.getText().toString();
                String str2 = edtitText_2.getText().toString();
                num1 = Double.parseDouble(str1);
                num2 = Double.parseDouble(str2);
                if((num1==0.0) || (num2==0.0)){
                    Toast.makeText(subActivity1.this, "값을 입력해주세요", Toast.LENGTH_SHORT).show();
                }else{
                    result = num1 * num2 * 0.5;
                    edtitText_result.setText(Double.toString(result));
                }

            }
        });

        see_formal = (Button) findViewById(R.id.see_formal);
        see_formal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(subActivity1.this, "삼각형넓이 = 밑변길이 * 높이 / 2", Toast.LENGTH_LONG).show();
            }
        });

        btn_home = (Button)findViewById(R.id.btn_home);
        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(subActivity1.this, MainActivity.class);
                startActivity(intent);
            }
        });

        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        drawerView = (View) findViewById(R.id.drawerView);
        Button btn_open = (Button) findViewById(R.id.btn_open);
        btn_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(drawerView);
            }
        });

        Button btn_close = (Button) findViewById(R.id.btn_close);
        btn_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.closeDrawers();
            }
        });
        drawerLayout.setDrawerListener(listener);
        drawerView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });


    }
    DrawerLayout.DrawerListener listener = new DrawerLayout.DrawerListener() {
        @Override
        public void onDrawerSlide(@NonNull View drawerView, float slideOffset) {

        }

        @Override
        public void onDrawerOpened(@NonNull View drawerView) {

        }

        @Override
        public void onDrawerClosed(@NonNull View drawerView) {

        }

        @Override
        public void onDrawerStateChanged(int newState) {

        }
    };
}