package com.example.oscar.seekbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    TextView textView;
    SeekBar seekBar;
    ListView listView;
    ArrayAdapter<String> adaptador;

    int progress=0;

    ArrayList arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar=(SeekBar)findViewById(R.id.seekBar);
        seekBar.setProgress(progress);
        seekBar.setMax(10);


        listView = (ListView)findViewById(R.id.list);

        textView= (TextView)findViewById(R.id.textView);
        textView.setText(""+progress);

        arrayList = new ArrayList<>();

        adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arrayList);


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
                arrayList.clear();
                arrayList.add( textView.getText().toString() + " x "+ " 1" + " = "+ (Integer.parseInt(textView.getText().toString())*1));
                arrayList.add( textView.getText().toString() + " x "+ " 2" + " = "+ (Integer.parseInt(textView.getText().toString())*2));
                arrayList.add( textView.getText().toString() + " x "+ " 3" + " = "+ (Integer.parseInt(textView.getText().toString())*3));
                arrayList.add( textView.getText().toString() + " x "+ " 4" + " = "+ (Integer.parseInt(textView.getText().toString())*4));
                arrayList.add( textView.getText().toString() + " x "+ " 5" + " = "+ (Integer.parseInt(textView.getText().toString())*5));
                arrayList.add( textView.getText().toString() + " x "+ " 6" + " = "+ (Integer.parseInt(textView.getText().toString())*6));
                arrayList.add( textView.getText().toString() + " x "+ " 7" + " = "+ (Integer.parseInt(textView.getText().toString())*7));
                arrayList.add( textView.getText().toString() + " x "+ " 8" + " = "+ (Integer.parseInt(textView.getText().toString())*8));
                arrayList.add( textView.getText().toString() + " x "+ " 9" + " = "+ (Integer.parseInt(textView.getText().toString())*9));
                arrayList.add( textView.getText().toString() + " x "+ " 10" + " = "+ (Integer.parseInt(textView.getText().toString())*10));

                listView.setAdapter(adaptador);
            }




        });

    }
}
