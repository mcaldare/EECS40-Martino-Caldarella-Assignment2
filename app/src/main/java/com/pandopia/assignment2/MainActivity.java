package com.pandopia.assignment2;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button0, button1, button2, button3, button4, button5, button6, button7,
            button8, button9, buttonAdd, buttonSub, buttonMult, buttonDiv, buttonEqls, buttonDel,
            buttonAC, buttonSqrt, buttonPerc, buttonPI, buttonSquare,
            buttonDot, buttonAns;

    private TextView textIn, textOut;

    public double answer;
    private String output = new String();

    boolean firstNumber = false;
    boolean firstUse = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUIViews();

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textIn.setText(textIn.getText().toString() + "0");
                firstNumber = true;
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textIn.setText(textIn.getText().toString() + "1");
                firstNumber = true;
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textIn.setText(textIn.getText().toString() + "2");
                firstNumber = true;
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textIn.setText(textIn.getText().toString() + "3");
                firstNumber = true;
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textIn.setText(textIn.getText().toString() + "4");
                firstNumber = true;
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textIn.setText(textIn.getText().toString() + "5");
                firstNumber = true;
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textIn.setText(textIn.getText().toString() + "6");
                firstNumber = true;
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textIn.setText(textIn.getText().toString() + "7");
                firstNumber = true;
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textIn.setText(textIn.getText().toString() + "8");
                firstNumber = true;
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textIn.setText(textIn.getText().toString() + "9");
                firstNumber = true;
            }
        });



        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textIn.setText(textIn.getText().toString() + ".");
                firstNumber = true;
            }
        });

        buttonPI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textIn.setText(textIn.getText().toString() + Double.toString(3.14159));
                firstNumber = true;
            }
        });

        buttonMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(firstNumber == true) {
                    textIn.setText(textIn.getText().toString() + " x ");

                }
                else{
                    textIn.setText("Ans x ");
                }
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(firstNumber == true) {
                    textIn.setText(textIn.getText().toString() + " / ");
                }
                else{
                    textIn.setText("Ans / ");
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(firstNumber == true) {
                    textIn.setText(textIn.getText().toString() + " - ");
                }
                else{
                    textIn.setText("Ans - ");
                }
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(firstNumber == true) {
                    textIn.setText(textIn.getText().toString() + " + ");
                }
                else{
                    textIn.setText("Ans + ");
                }
            }
        });


        buttonPerc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    String temp = textIn.getText().toString();
                    textIn.setText(percentage(temp));
                   }
        });

        buttonSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String temp = textIn.getText().toString();
                textIn.setText(square(temp));
            }
        });

        buttonSqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String temp = textIn.getText().toString();
                textIn.setText(sqrt(temp));
            }
        });

        buttonAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textIn.setText("");
                textOut.setText("0");
                firstNumber = false;
            }
        });

        buttonAns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textIn.setText(textIn.getText().toString() + "Ans");
            }
        });

        buttonDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = textIn.getText().toString();
                textIn.setText(delete(temp));
            }
        });

        buttonEqls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator(textIn.getText().toString());
                answer = Double.parseDouble(output);
                textIn.setText("");
                textOut.setText(output);
                firstNumber = false;
                firstUse = false;
            }
        });



    }


    private void setupUIViews() {
        button0 = (Button) findViewById(R.id.but_zero);
        button1 = (Button) findViewById(R.id.but_one);
        button2 = (Button) findViewById(R.id.but_two);
        button3 = (Button) findViewById(R.id.but_three);
        button4 = (Button) findViewById(R.id.but_four);
        button5 = (Button) findViewById(R.id.but_five);
        button6 = (Button) findViewById(R.id.but_six);
        button7 = (Button) findViewById(R.id.but_seven);
        button8 = (Button) findViewById(R.id.but_eight);
        button9 = (Button) findViewById(R.id.but_nine);
        buttonAC = (Button) findViewById(R.id.AC);
        buttonAdd = (Button) findViewById(R.id.addition);
        buttonSub = (Button) findViewById(R.id.subtraction);
        buttonMult = (Button) findViewById(R.id.multiplication);
        buttonDiv = (Button) findViewById(R.id.division);
        buttonEqls = (Button) findViewById(R.id.equals);
        buttonDel = (Button) findViewById(R.id.delete);
        buttonSqrt = (Button) findViewById(R.id.sqrt);
        buttonPerc = (Button) findViewById(R.id.percentage);
        buttonPI = (Button) findViewById(R.id.pi);
        buttonAns = (Button) findViewById(R.id.answer);
        buttonDot = (Button) findViewById(R.id.dot);
        buttonSquare = (Button) findViewById(R.id.square);
        textIn = (TextView) findViewById(R.id.input);
        textOut = (TextView) findViewById(R.id.output);

    }

    private String percentage (String s){
        String[]tokens = s.split(" ");
        StringBuffer temp = new StringBuffer();
        double numToConvert;
        if(tokens[(tokens.length)-1].contains("Ans")){
            numToConvert = answer;
        }
        else{
            numToConvert = Double.parseDouble(tokens[(tokens.length)-1]);
        }
        numToConvert = numToConvert/100;
        tokens[(tokens.length)-1] = Double.toString(numToConvert);
        for (int i = 0; i < tokens.length ; i++) {
            temp.append(tokens[i]);
            temp.append(" ");
        }
        return temp.toString();
    }

    private String square (String s){
        String[]tokens = s.split(" ");
        StringBuffer temp = new StringBuffer();
        double numToSquare;
        if(tokens[(tokens.length)-1].contains("Ans")){
            numToSquare = answer;
        }
        else{
            numToSquare = Double.parseDouble(tokens[(tokens.length)-1]);
        }
        numToSquare = numToSquare * numToSquare;
        tokens[(tokens.length)-1] = Double.toString(numToSquare);
        for (int i = 0; i < tokens.length ; i++) {
            temp.append(tokens[i]);
            temp.append(" ");
        }
        return temp.toString();
    }

    private String sqrt (String s){
        String[]tokens = s.split(" ");
        StringBuffer temp = new StringBuffer();
        double numToSqrt;
        if(tokens[(tokens.length)-1].contains("Ans")){
            numToSqrt = answer;
        }
        else{
            numToSqrt = Double.parseDouble(tokens[(tokens.length)-1]);
        }
        numToSqrt = Math.sqrt(numToSqrt);

        tokens[(tokens.length)-1] = Double.toString(numToSqrt);
        for (int i = 0; i < tokens.length ; i++) {
            temp.append(tokens[i]);
            temp.append(" ");
        }
        return temp.toString();
    }



    private String delete (String s){
        String[]tokens = s.split("");
        StringBuffer temp = new StringBuffer();
        if(tokens[(tokens.length)-1].contains("s") || tokens[(tokens.length)-1].contains(" ")) {
            for (int i = 0; i < tokens.length - 3; i++) {
                temp.append(tokens[i]);
            }
        }
        else {
            for (int i = 0; i < tokens.length - 1; i++) {
                temp.append(tokens[i]);
            }
        }
        return temp.toString();
    }


    private void calculator(String s){

        double result = 0;

        if(isNumeric(s)){
            result = Double.parseDouble(s);
        }
        else if(s == "Ans"){
            result = answer;
        }
        else {

            String[] tokens = s.split("\\s+");
            double[] nums = new double[2];


            for (int i = 0; i < tokens.length; i++) {
                if (tokens[i].contains("Ans")) {
                    tokens[i] = Double.toString(answer);
                }
            }

            nums[0] = Double.parseDouble(tokens[0]);
            nums[1] = Double.parseDouble(tokens[2]);


            if (s.contains("+")) {
                result = nums[0] + nums[1];
            } else if (s.contains("-")) {
                result = nums[0] - nums[1];
            } else if (s.contains("x")) {
                result = nums[0] * nums[1];
            } else if (s.contains("/")) {
                result = nums[0] / nums[1];
            } else {
                result = Double.parseDouble(s);
            }
        }

        output = Double.toString(result);
    }

    static boolean isNumeric(String str) {
        try {
            double d = Double.parseDouble(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

}


