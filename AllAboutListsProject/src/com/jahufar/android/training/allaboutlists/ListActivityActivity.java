package com.jahufar.android.training.allaboutlists;

import java.util.ArrayList;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListActivityActivity extends ListActivity {

	ArrayList<Address> data = new ArrayList<Address>();
	ArrayAdapter<Address> adapter = null;

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);

		Toast.makeText(this, data.get(position).getEmail(), Toast.LENGTH_SHORT)
				.show();

	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.listactivity);

		data = loadData();

		adapter = new ArrayAdapter<Address>(this,
				android.R.layout.simple_list_item_1, android.R.id.text1, data);

		setListAdapter(adapter);
		


	}

	private ArrayList<Address> loadData() {

		ArrayList<Address> temp = new ArrayList<Address>();

		for (int i = 0; i <= 30; i++) {
			Address address = new Address();
			address.setName("Name: " + i);
			address.setEmail("Email: " + i);

			temp.add(address);

		}

		return temp;
	}

	private static class Address {
		private String name = null;
		private String email = null;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		@Override
		public String toString() {

			return this.name;
		}

	}

}
