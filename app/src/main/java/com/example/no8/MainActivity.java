package com.example.no8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText ANSheight;
    EditText ANSweight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ANSheight = (EditText)findViewById(R.id.height);
        ANSweight = (EditText)findViewById(R.id.weight);
        Button submit = (Button)findViewById(R.id.Operation);

        submit.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View arg0) {
                if ( !("".equals(ANSheight.getText().toString())
                        || "".equals(ANSweight.getText().toString())) )
                {
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    intent.putExtra("Height", ANSheight.getText().toString());
                    intent.putExtra("Weight", ANSweight.getText().toString());
                    startActivity(intent);

                }
            }
        });
    }
}
