package com.jahufar.android.training.allaboutlists;

import java.util.ArrayList;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class CustomListActivity extends ListActivity {

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

		// adapter = new ArrayAdapter<Address>(this,
		// android.R.layout.simple_list_item_1, android.R.id.text1, data);

		adapter = new CustomAdapter(this, R.layout.custom_row, data);

		setListAdapter(adapter);

	}

	private static class ViewHolder {
		public TextView txtEmail = null;
		public TextView txtName = null;

		public ViewHolder(View view) {
			txtEmail = (TextView) view.findViewById(R.id.txtEmail);
			txtName = (TextView) view.findViewById(R.id.txtName);
		}

	}

	private class CustomAdapter extends ArrayAdapter<Address> {

		private Context context = null;
		private ArrayList<Address> data = null;
		private int layout = 0;

		public CustomAdapter(Context context, int viewResourceId,
				ArrayList<Address> objects) {

			super(context, viewResourceId, objects);

			this.context = context;
			this.data = objects;
			this.layout = viewResourceId;

		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {

			ViewHolder viewHolder = null;

			if (convertView == null) {
				LayoutInflater inflator = (LayoutInflater) this.context
						.getSystemService(LAYOUT_INFLATER_SERVICE);

				convertView = inflator.inflate(this.layout, null);

				viewHolder = (ViewHolder) convertView.getTag();
			}

			if (viewHolder == null) {
				viewHolder = new ViewHolder(convertView);
				convertView.setTag(viewHolder);
			}

			viewHolder.txtEmail.setText(this.data.get(position).getName());
			viewHolder.txtName.setText(this.data.get(position).getName());

			return convertView;

		}

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
