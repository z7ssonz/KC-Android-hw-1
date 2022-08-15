package com.example.hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText t1 = findViewById(R.id.ET1);
        EditText t2 = findViewById(R.id.ET2);
        EditText t3 = findViewById(R.id.ET3);
        EditText t4 = findViewById(R.id.ET4);
        TextView tv2 = findViewById(R.id.TV2);
        Button b1 = findViewById(R.id.button);
        Button b2 = findViewById(R.id.button2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            int n1 = Integer.parseInt(t1.getText().toString());
            int n2 = Integer.parseInt(t2.getText().toString());
            int n3 = Integer.parseInt(t3.getText().toString());
            int n4 = Integer.parseInt(t4.getText().toString());

            int result = n1 + n2 + n3 + n4;
            tv2.setText(String.valueOf(result));
            }
        });
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                finish();
                startActivity(getIntent());

  }
  });


}
}

