package com.nilay.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewDebug;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    Button one, two, three, four, five, six, seven, eight, nine, zero, dblzero, clear, modulo, delete, point, divide, mul, add, sub, answer;
    EditText display;
    Float value1,value2;
    boolean mAddition, mSubtract, mMultiplication, mDivision,mPrcnt ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        dblzero = findViewById(R.id.dblzero);
        clear = findViewById(R.id.clear);
        delete = findViewById(R.id.delete);
        point = findViewById(R.id.point);
        modulo = findViewById(R.id.modulo);
        divide = findViewById(R.id.divide);
        mul = findViewById(R.id.mul);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        answer = findViewById(R.id.equalsto);
        display = findViewById(R.id.display);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "9");
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "0");
            }
        });

        dblzero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "00");
            }
        });

        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + ".");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 = Float.parseFloat(display.getText()+"");
                mAddition = true;
                display.setText(null);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1= Float.parseFloat(display.getText()+"");
                mSubtract=true;
                display.setText(null);
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 =Float.parseFloat(display.getText()+"");
                mMultiplication=true;
                display.setText(null);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1= Float.parseFloat(display.getText()+"");
                mDivision = true;
                display.setText(null);
            }
        });

        modulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1= Float.parseFloat(display.getText()+"");
                mPrcnt = true;
                display.setText(null);
            }
        });



        answer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mAddition || mSubtract || mMultiplication || mDivision || mPrcnt) {
                    value2 = Float.parseFloat(display.getText().toString() + "");
                }
                if (mAddition == true){

                    display.setText(String.format("%s",value1 + value2 ));
                    mAddition=false;
                }


                if (mSubtract == true){
                    display.setText(String.format("%s",value1 - value2 ));
                    mSubtract=false;
                }

                if (mMultiplication == true){
                    display.setText(String.format("%s",value1 * value2 ));
                    mMultiplication=false;
                }

                if (mDivision == true){
                    display.setText(String.format("%s",value1 / value2 ));
                    mDivision=false;
                }

                if (mPrcnt == true){
                    display.setText(String.format("%s",value1/100 ));
                    mPrcnt=false;
                }
            }
        });


        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText("");
            }
        });

    }
}
