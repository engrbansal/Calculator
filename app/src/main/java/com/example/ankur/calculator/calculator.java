package com.example.ankur.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class calculator extends AppCompatActivity {

    Button one,two,three,four,five,six,seven,
            eight,nine,zero,plus,sub,mul,div,equal,
            cancel;

    EditText display;

    float mValueOne , mValueTwo;

    boolean mAddition, mSubstract, mMultiplication, mDivision;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
		three = (Button) findViewById(R.id.three);
		four = (Button) findViewById(R.id.four);
		five = (Button) findViewById(R.id.five);
		six = (Button) findViewById(R.id.six);
		seven = (Button) findViewById(R.id.seven);
		eight = (Button) findViewById(R.id.eight);
		nine = (Button) findViewById(R.id.nine);
		zero = (Button) findViewById(R.id.zero);
		cancel = (Button) findViewById(R.id.cancel);
		sub = (Button) findViewById(R.id.sub);
		plus = (Button) findViewById(R.id.plus);
		mul = (Button) findViewById(R.id.mul);
		div = (Button) findViewById(R.id.div);
		equal = (Button) findViewById(R.id.equal);

        display = (EditText) findViewById(R.id.display) ;

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"1");
            }
        });
		
		two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"2");
            }
        });
		
		three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"3");
            }
        });
		
		four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"4");
            }
        });
		
		five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"5");
            }
        });
		
		six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"6");
            }
        });
		
		seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"7");
            }
        });
		
		eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"8");
            }
        });
		
		nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"9");
            }
        });
		
		zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"0");
            }
        });
		
		plus.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(display == null) {
                    display.setText("");
                }else {
                    mValueOne = Float.parseFloat(display.getText() + "");
                    mAddition = true;
                    display.setText(null);
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(display.getText() + "");
                mSubstract = true;
                display.setText(null);
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(display.getText() + "");
                mMultiplication = true;
                display.setText(null);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(display.getText() + "");
                mDivision = true;
                display.setText(null);
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(display.getText() + "");

                if(mAddition == true){
                    display.setText(mValueOne + mValueTwo + "");
                    mAddition = false;
                }

                if(mSubstract == true){
                    display.setText(mValueOne - mValueTwo + "");
                    mSubstract = false;

                }

                if(mMultiplication == true){
                    display.setText(mValueOne * mValueTwo + "");
                    mMultiplication = false;
                }

                if(mDivision == true) {
                    display.setText(mValueOne / mValueTwo + "");
                    mDivision = false;
                }
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText("");
            }
        });


    }
}
