package example.newproject;



import android.support.v7.app.ActionBarActivity;
import android.telephony.SmsManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Message extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_message);
		final EditText edittextSmsNumber = (EditText)findViewById(R.id.smsnumber);
	       final EditText edittextSmsText = (EditText)findViewById(R.id.smstext);
	      
	       Button buttonSendSms_intent = (Button)findViewById(R.id.sendsms_intent);
		      
	       //By SmsManager API
	       
		 
		      
		   //By Intent Action
		   
		   buttonSendSms_intent.setOnClickListener(new Button.OnClickListener(){

		   @Override
		   public void onClick(View arg0) {
		    // TODO Auto-generated method stub

		    String smsNumber = edittextSmsNumber.getText().toString();
		    String smsText = edittextSmsText.getText().toString();
		    
		    Uri uri = Uri.parse("smsto:" + smsNumber);
		    Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
		    intent.putExtra("sms_body", smsText);  
		    startActivity(intent);
		   }});
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.message, menu);
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
