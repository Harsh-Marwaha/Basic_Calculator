package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        try {


            EditText edtFirst, edtSecond;
            ImageButton btnAdd, btnSub, btnMul, btnDiv;
            TextView res;
            Button btnImg;

            edtFirst = findViewById(R.id.a);
            edtSecond = findViewById(R.id.b);
            btnAdd = findViewById(R.id.add);
            btnSub = findViewById(R.id.sub);
            btnMul = findViewById(R.id.mul);
            btnDiv = findViewById(R.id.div);
            res = findViewById(R.id.res);
            btnImg = findViewById(R.id.btnImg);

            btnImg.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(),Image.class);
                    startActivity(intent);
                }

            });

            btnAdd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if (edtFirst.getText().toString().isEmpty()) {
                        Toast.makeText(MainActivity.this, "INVALID INPUT", Toast.LENGTH_LONG).show();
                        return;
                    }

                    if (edtSecond.getText().toString().isEmpty()) {
                        Toast.makeText(MainActivity.this, "INVALID INPUT", Toast.LENGTH_LONG).show();
                        return;
                    }

                    int x = Integer.parseInt(edtFirst.getText().toString());
                    int y = Integer.parseInt(edtSecond.getText().toString());

                    int result = x + y;
                    String s = String.valueOf(result);
                    res.setText(s);
                }
            });

            btnSub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (edtFirst.getText().toString().isEmpty()) {
                        Toast.makeText(MainActivity.this, "INVALID INPUT", Toast.LENGTH_LONG).show();
                        return;
                    }

                    if (edtSecond.getText().toString().isEmpty()) {
                        Toast.makeText(MainActivity.this, "INVALID INPUT", Toast.LENGTH_LONG).show();
                        return;
                    }

                    int x = Integer.parseInt(edtFirst.getText().toString());
                    int y = Integer.parseInt(edtSecond.getText().toString());

                    int result = x - y;
                    String s = String.valueOf(result);
                    res.setText(s);
                }
            });

            btnMul.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (edtFirst.getText().toString().isEmpty()) {
                        Toast.makeText(MainActivity.this, "INVALID INPUT", Toast.LENGTH_LONG).show();
                        return;
                    }

                    if (edtSecond.getText().toString().isEmpty()) {
                        Toast.makeText(MainActivity.this, "INVALID INPUT", Toast.LENGTH_LONG).show();
                        return;
                    }

                    int x = Integer.parseInt(edtFirst.getText().toString());
                    int y = Integer.parseInt(edtSecond.getText().toString());

                    int result = x * y;
                    String s = String.valueOf(result);
                    res.setText(s);
                }
            });

            btnDiv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (edtFirst.getText().toString().isEmpty()) {
                        Toast.makeText(MainActivity.this, "INVALID INPUT", Toast.LENGTH_LONG).show();
                        return;
                    }

                    if (edtSecond.getText().toString().isEmpty()) {
                        Toast.makeText(MainActivity.this, "INVALID INPUT", Toast.LENGTH_LONG).show();
                        return;
                    }

                    int x = Integer.parseInt(edtFirst.getText().toString());
                    int y = Integer.parseInt(edtSecond.getText().toString());

                    int result = x / y;
                    String s = String.valueOf(result);
                    res.setText(s);
                }
            });
        }
        catch (Exception e) {
            // handle the exception
            TextView res;
            res=findViewById(R.id.res);
            res.setText("INVALID INPUT");
            Toast.makeText(MainActivity.this,"INVALID INPUT",Toast.LENGTH_LONG);
        }
        }
    }