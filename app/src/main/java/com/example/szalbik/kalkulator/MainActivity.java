package com.example.szalbik.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.io.*;

public class MainActivity extends AppCompatActivity {

    Button jeden, zero, dwa, trzy, cztery, piec, szesc, siedem, osiem, dziewiec, kropka, wynik, dodac, odjac, mnozenie, dzielenie, modulo, del, c, odwroc_znak, mc,mr,mp;
    TextView text;
    float val1, val2;
    boolean mAddition , mSubtract ,mMultiplication ,mDivision ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zero = (Button) findViewById(R.id.button32);
        jeden = (Button) findViewById(R.id.button29);
        dwa = (Button) findViewById(R.id.button28);
        trzy = (Button) findViewById(R.id.button27);
        cztery = (Button) findViewById(R.id.button25);
        piec = (Button) findViewById(R.id.button24);
        szesc = (Button) findViewById(R.id.button22);
        siedem = (Button) findViewById(R.id.button20);
        osiem = (Button) findViewById(R.id.button19);
        dziewiec = (Button) findViewById(R.id.button18);

        kropka = (Button) findViewById(R.id.button31);

        wynik = (Button) findViewById(R.id.button30);
        dodac = (Button) findViewById(R.id.button26);
        odjac = (Button) findViewById(R.id.button21);
        mnozenie = (Button) findViewById(R.id.button17);
        dzielenie = (Button) findViewById(R.id.button12);
        modulo = (Button) findViewById(R.id.button13);
        odwroc_znak = (Button) findViewById(R.id.button14);
        del = (Button) findViewById(R.id.button16);
        c = (Button) findViewById(R.id.button15);
        mc = (Button) findViewById(R.id.button11);
        mr = (Button) findViewById(R.id.button10);
        mp = (Button) findViewById(R.id.button9);

        text = (TextView) findViewById(R.id.textView8);

        dodac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text == null) {
                    text.setText("");
                } else {
                    val1 = Float.parseFloat(text.getText() + "");
                    text.setText(null);
                    mAddition = true;
                }
            }
        });

        odjac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text == null) {
                    text.setText("");
                } else {
                    val1 = Float.parseFloat(text.getText() + "");
                    text.setText(null);
                    mSubtract = true;
                }
            }
        });

        mnozenie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text == null) {
                    text.setText("");
                } else {
                    val1 = Float.parseFloat(text.getText() + "");
                    text.setText(null);
                    mMultiplication = true;
                }
            }
        });

        dzielenie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text == null) {
                    text.setText("");
                } else {
                    val1 = Float.parseFloat(text.getText() + "");
                    text.setText(null);
                    mDivision = true;
                }
            }
        });

        wynik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val2 = Float.parseFloat(text.getText() + "");

                if (mAddition == true){
                    text.setText(val1 + val2 +"");
                    mAddition=false;
                }


                if (mSubtract == true){
                    text.setText(val1 - val2+"");
                    mSubtract=false;
                }

                if (mMultiplication == true){
                    text.setText(val1 * val2+"");
                    mMultiplication=false;
                }

                if (mDivision == true){
                    text.setText(val1 / val2+"");
                    mDivision=false;
                }
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("");
            }
        });

        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text.getText().length() > 0) {
                    String str = text.getText().toString();
                    str = str.substring(0, str.length()-1);
                    text.setText(str);
                }
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"0");
            }
        });

        jeden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"1");
            }
        });

        dwa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"2");
            }
        });

        trzy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"3");
            }
        });

        cztery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"4");
            }
        });

        piec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"5");
            }
        });

        szesc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"6");
            }
        });

        siedem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"7");
            }
        });

        osiem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"8");
            }
        });

        dziewiec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"9");
            }
        });

        kropka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+".");
            }
        });
    }
}
