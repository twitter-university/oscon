package com.oscon.yamba;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class StatusActivity extends Activity {
	private Button buttonUpdate;
	private EditText editStatus;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_status);

		editStatus = (EditText) findViewById(R.id.edit_status);
		buttonUpdate = (Button) findViewById(R.id.button_update);
		buttonUpdate.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View view) {
				String status = editStatus.getText().toString();
				Log.d("StatusActivity","onClicked with status: "+status);
			}
		});
	}

}
