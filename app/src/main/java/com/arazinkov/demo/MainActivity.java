package com.arazinkov.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int clicks = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = (TextView) findViewById(R.id.textView);
        Button goButton = (Button) findViewById(R.id.goButton);

        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (clicks++) {
                    case 0: textView.setText("Let's conqure the World!");
                    break;

                    case 1: textView.setText("Hail Gilead!");
                    break;

                    case 2: textView.setText("Go!");
                    break;

                    case 3: textView.setText("Wow-wow, man!");
                        break;

                    case 4: textView.setText("Stop it!");
                        break;

                    case 5: textView.setText("Stop pushing me!");
                        break;

                    case 6: textView.setText("Is that you, Melanya?");
                        break;

                    default: textView.setText("Yes-yes.. You already pushed me " + clicks + " times!");
                        break;

                }

            }
        });
    }
}
