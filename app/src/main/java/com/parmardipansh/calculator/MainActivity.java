package com.parmardipansh.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // collecting output view
        TextView output = (TextView)(findViewById(R.id.output));

        // collection buttons
        Button allCancelButton = findViewById(R.id.ac);
        Button modulusButton = findViewById(R.id.modulus);
        Button backButton = findViewById(R.id.backspace);
        Button divideButton = findViewById(R.id.divide);
        Button sevenButton = findViewById(R.id.seven);
        Button eightButton = findViewById(R.id.eight);
        Button nineButton = findViewById(R.id.nine);
        Button multiplyButton = findViewById(R.id.multiply);
        Button fourButton = findViewById(R.id.four);
        Button fiveButton = findViewById(R.id.five);
        Button sixButton = findViewById(R.id.six);
        Button minusButton = findViewById(R.id.minus);
        Button oneButton = findViewById(R.id.one);
        Button twoButton = findViewById(R.id.two);
        Button threeButton = findViewById(R.id.three);
        Button additionButton = findViewById(R.id.addition);
        Button doubleZeroButton = findViewById(R.id.double_zero);
        Button zeroButton = findViewById(R.id.zero);
        Button dotButton = findViewById(R.id.dot);
        Button equalsButton = findViewById(R.id.equals);

        // setting all the values back to 0
        allCancelButton.setOnClickListener(v -> output.setText("0"));

        // modulus button
        modulusButton.setOnClickListener(v -> output.setText((output.getText() + "%")));

        // back button
        backButton.setOnClickListener(v -> output.setText(output.getText().toString().substring(0, output.getText().toString().length() - 1)));

        // divide button
        divideButton.setOnClickListener(v -> output.setText((output.getText() + "/")));

        // seven button
        sevenButton.setOnClickListener(v -> output.setText((output.getText() + "7")));

        //eight button
        eightButton.setOnClickListener(v -> output.setText((output.getText() + "8")));

        // nine button
        nineButton.setOnClickListener(v -> output.setText((output.getText() + "9")));

        // multiply button
        multiplyButton.setOnClickListener(v -> output.setText((output.getText() + "x")));

        // four button
        fourButton.setOnClickListener(v -> output.setText((output.getText() + "4")));

        // five button
        fiveButton.setOnClickListener(v -> output.setText((output.getText() + "5")));

        // six button
        sixButton.setOnClickListener(v -> output.setText((output.getText() + "6")));

        // minus button
        minusButton.setOnClickListener(v -> output.setText((output.getText() + "-")));

        // one button
        oneButton.setOnClickListener(v -> output.setText((output.getText() + "1")));

        // two button
        twoButton.setOnClickListener(v -> output.setText((output.getText() + "2")));

        // three button
        threeButton.setOnClickListener(v -> output.setText((output.getText() + "3")));

        // addition button
        additionButton.setOnClickListener(v -> output.setText((output.getText() + "+")));

        // two zeroes button
        doubleZeroButton.setOnClickListener(v -> output.setText((output.getText() + "00")));

        // zero button
        zeroButton.setOnClickListener(v -> output.setText((output.getText() + "0")));

        // dot button
        dotButton.setOnClickListener(v -> output.setText((output.getText() + ".")));

        // equals button {
        equalsButton.setOnClickListener(v -> solveExpression());

    }

    // TODO: implement solve expression function
    private void solveExpression() {

    }

}