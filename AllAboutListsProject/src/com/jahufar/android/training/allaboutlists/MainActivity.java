package com.jahufar.android.training.allaboutlists;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnItemClickListener {

	ListView listData = null;

	ArrayList<String> data = new ArrayList<String>();

	ArrayAdapter<String> adapter = null;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		listData = (ListView) findViewById(R.id.listviewData);

		data = loadData();

		adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, android.R.id.text1, data);

		listData.setAdapter(adapter);

		listData.setOnItemClickListener(this);

		listData.setEmptyView(findViewById(R.id.txtNoData));

	}

	private ArrayList<String> loadData() {

		for (int i = 0; i <= 30; i++) {
			data.add("Item " + i);
		}

		return data;

	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {

		Log.d(getClass().getName(), data.get(position));

		Toast.makeText(this, "Clicked : " + data.get(position),
				Toast.LENGTH_SHORT).show();

	}

}
