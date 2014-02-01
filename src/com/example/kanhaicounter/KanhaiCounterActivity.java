package com.example.kanhaicounter;

import java.util.ArrayList;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class KanhaiCounterActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kanhai_counter);
        final ArrayList<Counter> counterList = new ArrayList<Counter>();
        final Button createNewCounter = (Button) findViewById(R.id.createNewCounter);
        createNewCounter.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
            	Counter counter = new Counter("test");
            	counterList.add(counter);
            	
            }
        });
    }
                


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.kanhai_counter, menu);
        return true;
    }
    
}
