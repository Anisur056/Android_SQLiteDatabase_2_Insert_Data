package com.anisdroid.Create_Database;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;

public class MainActivity extends Activity 
{
	My_DB_Helper ddd;
	
	EditText eee;
	Button add_bt;
	
	
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		ddd = new My_DB_Helper(this);
		
		eee = (EditText)findViewById(R.id.name);
		add_bt = (Button)findViewById(R.id.add_button);
		
		add_bt.setOnClickListener(
		
			new View.OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					// TODO: Implement this method
					
					boolean bbb = ddd.insertData(eee.getText().toString());
					
					if(bbb = true)
						
						Toast.makeText(MainActivity.this,"Data inserted..",Toast.LENGTH_SHORT).show();
					
					else
						
						Toast.makeText(MainActivity.this,"Data not inserted..",Toast.LENGTH_SHORT).show();
					
						
				}

				
				
				
			}
		
		);
		
    }
}
