package com.example.oscar.seekbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    TextView textView;
    SeekBar seekBar;
    TextView textView2;

    int progress=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar=(SeekBar)findViewById(R.id.seekBar);
        seekBar.setProgress(progress);
        seekBar.setMax(10);

        textView= (TextView)findViewById(R.id.textView);
        textView.setText(""+progress);

        textView2= (TextView)findViewById(R.id.textView2);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {


            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean fromUser)
            {
                progress=i;
                textView.setText(i+ "");
            }


            @Override
            public void onStartTrackingTouch(SeekBar arg0)
            {

            }


            @Override
            public void onStopTrackingTouch(SeekBar arg0)
            {
                textView2.setText( textView.getText().toString() + " x "+ " 1" + " = "+ (Integer.parseInt(textView.getText().toString())*1)+"\n"+
                        textView.getText().toString() + " x "+ " 2" + " = "+ (Integer.parseInt(textView.getText().toString())*2)+"\n"+
                        textView.getText().toString() + " x "+ " 3" + " = "+ (Integer.parseInt(textView.getText().toString())*3)+"\n"+
                        textView.getText().toString() + " x "+ " 4" + " = "+ (Integer.parseInt(textView.getText().toString())*4)+"\n"+
                        textView.getText().toString() + " x "+ " 5" + " = "+ (Integer.parseInt(textView.getText().toString())*5)+"\n"+
                        textView.getText().toString() + " x "+ " 6" + " = "+ (Integer.parseInt(textView.getText().toString())*6)+"\n"+
                        textView.getText().toString() + " x "+ " 7" + " = "+ (Integer.parseInt(textView.getText().toString())*7)+"\n"+
                        textView.getText().toString() + " x "+ " 8" + " = "+ (Integer.parseInt(textView.getText().toString())*8)+"\n"+
                        textView.getText().toString() + " x "+ " 9" + " = "+ (Integer.parseInt(textView.getText().toString())*9)+"\n"+
                        textView.getText().toString() + " x "+ " 10" + " = "+ (Integer.parseInt(textView.getText().toString())*10)+"\n");

            }




        });

    }
}
