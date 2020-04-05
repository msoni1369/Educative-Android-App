package example.newproject;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class AboutUs extends ActionBarActivity {
Button bt1,bt2,bt3,bt4;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about_us);
		bt1=(Button)findViewById(R.id.button1);
		bt2=(Button)findViewById(R.id.button2);
		bt3=(Button)findViewById(R.id.button3);
		bt4=(Button)findViewById(R.id.button4);
	}
	 public void message(View v)
	    {
			    	Intent i= new Intent(AboutUs.this,Message.class);
	   startActivity(i);
	    }
	 public void developer(View v)
	    {
			    	Intent i= new Intent(AboutUs.this,Developer.class);
	   startActivity(i);
	    }
	 public void feedback(View v)
	    {
	    	Intent i= new Intent(AboutUs.this,Feedback.class);
	    
			
	    	startActivity(i);
	    }
	 public void call(View v)
	    {
	    	Intent callintent= new Intent(Intent.ACTION_CALL);
	    
			callintent.setData(Uri.parse("tel:8385863717"));
	    	startActivity(callintent);
	    }
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.about_us, menu);
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
