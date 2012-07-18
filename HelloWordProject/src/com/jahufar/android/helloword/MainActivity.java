package com.jahufar.android.helloword;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	Button btnHello =  null;
	TextView txtReturn = null;

	private final static String TAG = "MainActivity";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main);

		Log.d(TAG, "onCreate called");
		
		
		btnHello = (Button) findViewById(R.id.btnHello);
		txtReturn = (TextView) findViewById(R.id.txtReturn);
	

	}

	@Override
	protected void onPause() {

		super.onPause();

		Log.d(TAG, "onPause called");
	}

	@Override
	protected void onStop() {
		super.onStop();

		Log.d(TAG, "onStop called");
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();

		Log.d(TAG, "onResume called");

	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		Log.d(TAG, "onRestart called");
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();

		Log.d(TAG, "onDestroy called");

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	public void onClick(View v) {
		
		Intent intent = new Intent(this, SecondActivity.class);
		
		Bundle bundle = new Bundle();
		
		bundle.putString("name", "John");
		
		intent.putExtras(bundle);

		
		//startActivity(intent);
		
		startActivityForResult(intent, 1);

		
		
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		
		if( resultCode != RESULT_OK) return;
		
		super.onActivityResult(requestCode, resultCode, data);
		
		Bundle bundle = data.getExtras();
		
		
		txtReturn.setText(bundle.getString("return"));
	}

	

}
