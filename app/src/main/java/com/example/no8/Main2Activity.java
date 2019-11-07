package com.example.no8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.NumberFormat;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent=getIntent();
            double fh = Double.parseDouble(intent.getStringExtra("Height"));
            double fw = Double.parseDouble(intent.getStringExtra("Weight"));
            double fresult;
            TextView result = (TextView)findViewById(R.id.Ans);
            fh = fh*fh/10000;

            NumberFormat nf = NumberFormat.getInstance();
                    nf.setMaximumFractionDigits(2);
            fresult = fw/fh;
                    result.setText(nf.format(fw/fh) +"");
            TextView dia = (TextView)findViewById(R.id.Ans);

            // 診斷結果 顯示
                    if (fresult<18.5)
                    dia.setText("您的BMI職為："+fresult+"體重過輕");
                    else if (18.5 <= fresult && fresult< 24)
                    dia.setText("您的BMI職為："+fresult+"正常範圍");
                    else if (24 <=fresult && fresult < 27)
                    dia.setText("您的BMI職為："+fresult+"過重");
                    else if (27 <=fresult && fresult < 30)
                    dia.setText("您的BMI職為："+fresult+"輕度肥胖");
                    else if (30 <= fresult && fresult < 35)
                    dia.setText("您的BMI職為："+fresult+"中度肥胖");
                    else if (fresult >= 35)
                    dia.setText("您的BMI職為："+fresult+"重度肥胖");

        final Button button = (Button) findViewById(R.id.BackPage);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
}
