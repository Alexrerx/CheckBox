package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    CheckBox dostavka;
    TextView text;
    RadioButton r1, r2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.textView);
        btn = findViewById(R.id.btn_order);
        dostavka = findViewById(R.id.dostavka);
        r1 = findViewById(R.id.time1);
        r2 = findViewById(R.id.time2);
    }

    public void createOrder(View view) {
        if (dostavka.isChecked()){
            if (r1.isChecked()){
                text.setText("Заказ с доставкой! Доставка " + r1.getText());
            }
            if (r2.isChecked()){
                text.setText("Заказ с доставкой! Доставка " + r2.getText());
            }

        }
        else {
            text.setText("Заказ без доставки!");
        }
    }
}