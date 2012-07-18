package com.jahufar.android.examples.contactpicker;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	Button btnPick;
	TextView txtContactDetails;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		btnPick = (Button) findViewById(R.id.btnPick);
		txtContactDetails = (TextView) findViewById(R.id.txtContactDetails);

	}

	public void onPickContactButtonClick(View view) {

		Intent intent = new Intent(Intent.ACTION_PICK,
				android.provider.ContactsContract.Contacts.CONTENT_URI);

		startActivityForResult(intent, 1);
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);

		if (RESULT_OK == resultCode) { // OK, user picked a contact; now lets
										// extract the data from intent

			Uri contactData = data.getData();
			Cursor c = managedQuery(contactData, null, null, null, null);
			if (c.moveToFirst()) {
				String name = c
						.getString(c
								.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME));
				txtContactDetails.setText("Name selected: " + name);
				
				Log.d("",  ContactsContract.Contacts.DISPLAY_NAME);
				
			}

		} else
			// user cancelled..
			txtContactDetails.setText(R.string.no_contact_details_picked);

	}
}