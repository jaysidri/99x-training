package com.jahufar.android.helloword;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends Activity {
	TextView txtData = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.second_activity);

		txtData = (TextView) findViewById(R.id.txtData);

		Intent intent = getIntent();
		Bundle bundle = intent.getExtras();

		txtData.setText(bundle.getString("name"));

	}

	public void onReturnClick(View v) {

		Intent intent = new Intent();

		Bundle bundle = new Bundle();
		bundle.putString("return", "This is my return value");

		intent.putExtras(bundle);

		setResult(RESULT_OK, intent);
		
		finish();

	}

}
