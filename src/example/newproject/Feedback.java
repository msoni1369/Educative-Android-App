package example.newproject;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Feedback extends ActionBarActivity {
	EditText editTextTo,editTextSubject,editTextMessage;
	Button send;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_feedback);
		
		editTextTo=(EditText)findViewById(R.id.editText1);
		editTextSubject=(EditText)findViewById(R.id.editText2);
		editTextMessage=(EditText)findViewById(R.id.editText3);
		
		send=(Button)findViewById(R.id.button1);
		
		send.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				 String to=editTextTo.getText().toString();
				 String subject=editTextSubject.getText().toString();
				 String message=editTextMessage.getText().toString();
				 
				
				 Intent email = new Intent(Intent.ACTION_SEND);
				  email.putExtra(Intent.EXTRA_EMAIL, new String[]{"msoni1369@gmail.com"});
				  email.putExtra(Intent.EXTRA_SUBJECT, subject);
				  email.putExtra(Intent.EXTRA_TEXT, message);
	 
				  //need this to prompts email client only
				  email.setType("message/rfc822");
	 
				  startActivity(Intent.createChooser(email, "Choose an Email client :"));
	 
			}
			
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.feedback, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
