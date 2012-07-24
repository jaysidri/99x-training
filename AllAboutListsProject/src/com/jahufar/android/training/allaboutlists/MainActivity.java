package com.jahufar.android.training.allaboutlists;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);

		setContentView(R.layout.main);
	}

	public void onClick(View v) {
		
		Intent intent =  null;
		Class activityName = null;

		switch (v.getId()) {
		case R.id.cmdlist:
			activityName = ListViewActivity.class;
			break;
		
		case R.id.cmdListActivity:
			activityName = ListActivityActivity.class;
			break;
			
			
		case R.id.cmdCustomlist:
			activityName= CustomListActivity.class;
			break;

		}
		
		intent = new Intent(this, activityName);
		
		startActivity(intent);
	}

}
