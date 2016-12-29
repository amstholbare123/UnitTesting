package unittest.sample.com.unittestdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private  long timestamp;
    private TextView tvTimeinlong;
    private Button btConvert;
    private String formatedDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTimeinlong= (TextView) findViewById(R.id.tvlongTime);
        btConvert=(Button) findViewById(R.id.btConvert);
        //Getting system current time stamp in long
        timestamp = System.currentTimeMillis();
        tvTimeinlong.setText(Long.toString(timestamp));
        btConvert.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        formatedDate=DateFormatConvertor.converintoDateFormat(timestamp);
        tvTimeinlong.setText(formatedDate);

    }
}
