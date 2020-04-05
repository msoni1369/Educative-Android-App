package example.newproject;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class FIREWALLWEAK extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_firewallweak);
		 TextView tv=(TextView)findViewById(R.id.textView10);
	}
	  public void ultrasurf(View v)
	    {
	  String url= "ultrasurf.us";
	  Intent i= new Intent(Intent.ACTION_VIEW);
	  i.setData(Uri.parse(url));
	  startActivity(i);
	  
	    }
	  public void tor(View v)
	    {
	  String url= "https://www.torproject.org";
	  Intent i= new Intent(Intent.ACTION_VIEW);
	  i.setData(Uri.parse(url));
	  startActivity(i);
	  
	    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.firewallweak, menu);
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
