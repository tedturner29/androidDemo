package com.tutorial.one;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		TextView tv = (TextView)findViewById(R.id.label);
		final EditText et = (EditText)findViewById(R.id.text);
		Button but = (Button)findViewById(R.id.button);

		tv.setText("Enter your name");
		but.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String name = et.getText().toString();
				Toast.makeText(getApplicationContext(), name, Toast.LENGTH_LONG).show();
				
				Intent newintent = new Intent(getApplicationContext(),Page2.class);
				startActivity(newintent);
				
			}
		});

	}
}
