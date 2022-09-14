package com.example.calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    boolean FirstInput = true;//입력값이 처음 입력되는지 체크
    int resultNumber = 0;// 결과값
    char operator = '+';// 덧셈, 뺄셈 등 수식: +로 초기화한 것은 첫 값이 resultNumber인 0에 더해지기 때문
    TextView result_text;
    Button allClear_btn, clearEntry_btn, backSpace_btn, division_btn, number7_btn, number8_btn, number9_btn,
            multiply_btn, number4_btn, number5_btn, number6_btn, minus_btn, number1_btn, number2_btn, number3_btn,
            plus_btn, number0_btn, point_btn, equal_btn;

    private DrawerLayout drawerLayout;
    private View drawerView;

    private Button extent_triangle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        extent_triangle = (Button)findViewById(R.id.extent_triangle);
        extent_triangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, subActivity1.class);
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

        result_text = (TextView) findViewById(R.id.result_text);
        number1_btn = (Button) findViewById(R.id.number1_btn);
        number1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                result_text.setTextColor(0xFF000000);
                if(FirstInput){
                    result_text.setText("1");
                    FirstInput = false;
                }else{
                    result_text.append("1");
                }
                Log.e("buttonClick", "btn" + number1_btn.getText().toString() + "버튼이 클릭되었습니다.");
                Log.d("button click", "result" + resultNumber);
            }
        });
        number2_btn = (Button) findViewById(R.id.number2_btn);
        number2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result_text.setTextColor(0xFF000000);
                if(FirstInput){
                    result_text.setText("2");
                    FirstInput = false;
                }else{
                    result_text.append("2");
                }
            }
        });
        number3_btn = (Button) findViewById(R.id.number3_btn);
        number3_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result_text.setTextColor(0xFF000000);
                if(FirstInput){
                    result_text.setText("3");
                    FirstInput = false;
                }else{
                    result_text.append("3");
                }
            }
        });
        number4_btn = (Button) findViewById(R.id.number4_btn);
        number4_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result_text.setTextColor(0xFF000000);
                if(FirstInput){
                    result_text.setText("4");
                    FirstInput = false;
                }else{
                   result_text.append("4");
                }
            }
        });
        number5_btn = (Button) findViewById(R.id.number5_btn);
        number5_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result_text.setTextColor(0xFF000000);
                if(FirstInput){
                    result_text.setText("5");
                    FirstInput = false;
                }else{
                    result_text.append("5");
                }
            }
        });
        number6_btn = (Button) findViewById(R.id.number6_btn);
        number6_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result_text.setTextColor(0xFF000000);
                if(FirstInput){
                    result_text.setText("6");
                    FirstInput = false;
                }else{
                    result_text.append("6");
                }
            }
        });
        number7_btn = (Button) findViewById(R.id.number7_btn);
        number7_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result_text.setTextColor(0xFF000000);
                if(FirstInput){
                    result_text.setText("7");
                    FirstInput = false;
                }else{
                    result_text.append("7");
                }
            }
        });
        number8_btn = (Button) findViewById(R.id.number8_btn);
        number8_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result_text.setTextColor(0xFF000000);
                if(FirstInput){
                    result_text.setText("8");
                    FirstInput = false;
                }else{
                    result_text.append("8");
                }
            }
        });
        number9_btn = (Button) findViewById(R.id.number9_btn);
        number9_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result_text.setTextColor(0xFF000000);
                if(FirstInput){
                    result_text.setText("9");
                    FirstInput = false;
                }else{
                    result_text.append("9");
                }
            }
        });
        number0_btn = (Button) findViewById(R.id.number0_btn);
        number0_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result_text.setTextColor(0xFF000000);
                if(FirstInput){
                    result_text.setText("0");
                    FirstInput = false;
                }else{
                    result_text.append("0");
                }
            }
        });
        allClear_btn = (Button) findViewById(R.id.allClear_btn);
        allClear_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirstInput = true;
                resultNumber = 0;
                operator = '+';
                result_text.setTextColor(0xFF666666);
                result_text.setText(String.valueOf(resultNumber));
            }
        });
        plus_btn = (Button) findViewById(R.id.plus_btn);
        plus_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(FirstInput){
                    result_text.setText("0");
                }else {
                    int lastNum = Integer.parseInt(result_text.getText().toString());
                    if (operator == '+') {
                        resultNumber = resultNumber + lastNum;
                    } else if (operator == '-') {
                        resultNumber = resultNumber - lastNum;
                    } else if (operator == '/') {
                        resultNumber = resultNumber / lastNum;
                    } else if (operator == '*') {
                        resultNumber = resultNumber * lastNum;
                    }
                    operator = '+';
                    result_text.setText("+");
                    FirstInput = true;
                }
               /* Log.e("buttonClick", "btn" + plus_btn.getText().toString() + "버튼이 클릭되었습니다.");
                Log.d("button click", "result" + resultNumber);*/
            }
        });
        division_btn = (Button) findViewById(R.id.division_btn);
        division_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(FirstInput){
                    result_text.setText("0");
                }else {
                    int lastNum = Integer.parseInt(result_text.getText().toString());
                    if (operator == '+') {
                        resultNumber = resultNumber + lastNum;
                    } else if (operator == '-') {
                        resultNumber = resultNumber - lastNum;
                    } else if (operator == '/') {
                        resultNumber = resultNumber / lastNum;
                    } else if (operator == '*') {
                        resultNumber = resultNumber * lastNum;
                    }
                    operator = '/';
                    result_text.setText("/");
                    FirstInput = true;
                }
            }
        });
        multiply_btn = (Button) findViewById(R.id.multiply_btn);
        multiply_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(FirstInput){
                    result_text.setText("0");
                }else {
                    int lastNum = Integer.parseInt(result_text.getText().toString());
                    if (operator == '+') {
                        resultNumber = resultNumber + lastNum;
                    } else if (operator == '-') {
                        resultNumber = resultNumber - lastNum;
                    } else if (operator == '/') {
                        resultNumber = resultNumber / lastNum;
                    } else if (operator == '*') {
                        resultNumber = resultNumber * lastNum;
                    }
                    operator = '*';
                    result_text.setText("*");
                    FirstInput = true;
                }
            }
        });
        minus_btn = (Button) findViewById(R.id.minus_btn);
        minus_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(FirstInput){
                    result_text.setText("0");
                }else{
                    int lastNum = Integer.parseInt(result_text.getText().toString());
                    if (operator == '+') {
                        resultNumber = resultNumber + lastNum;
                    } else if (operator == '-') {
                        resultNumber = resultNumber - lastNum;
                    } else if (operator == '/') {
                        resultNumber = resultNumber / lastNum;
                    } else if (operator == '*') {
                        resultNumber = resultNumber * lastNum;
                    }
                    operator = '-';
                    result_text.setText("-");
                    FirstInput = true;
                }
            }
        });
        equal_btn = (Button) findViewById(R.id.equal_btn);
        equal_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operator == '+'){
                    resultNumber = resultNumber + Integer.parseInt(result_text.getText().toString());
                    result_text.setText(String.valueOf(resultNumber));
                }else if(operator == '-'){
                    resultNumber = resultNumber - Integer.parseInt(result_text.getText().toString());
                    result_text.setText(String.valueOf(resultNumber));
                }else if(operator == '/'){
                    resultNumber = resultNumber / Integer.parseInt(result_text.getText().toString());
                    result_text.setText(String.valueOf(resultNumber));
                }else if(operator == '*'){
                    resultNumber = resultNumber * Integer.parseInt(result_text.getText().toString());
                    result_text.setText(String.valueOf(resultNumber));
                }
                operator = '+';
                resultNumber = 0;
            }
        });
        clearEntry_btn = (Button) findViewById(R.id.clearEntry_btn);
        clearEntry_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirstInput = true;
                result_text.setText("0");
            }
        });
        backSpace_btn= (Button) findViewById(R.id.backSpace_btn);
        backSpace_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result_text.getText().toString().length() > 1){
                    String str = result_text.getText().toString();
                    String resultStr = str.substring(0, str.length() - 1);
                    result_text.setText(resultStr);
                }else{
                    result_text.setText("0");
                }
            }
        });
        point_btn = (Button) findViewById(R.id.point_btn);
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