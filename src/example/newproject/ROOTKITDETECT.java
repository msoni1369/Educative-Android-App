package example.newproject;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class ROOTKITDETECT extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rootkitdetect);
		 TextView tv=(TextView)findViewById(R.id.textView7);
		 TextView tv1=(TextView)findViewById(R.id.textView9);
		}
		  public void dumpsec(View v)
		    {
		  String url= "https://en.freedownloadmanager.org/Windows-PC/DumpSec-FREE.html";
		  Intent i= new Intent(Intent.ACTION_VIEW);
		  i.setData(Uri.parse(url));
		  startActivity(i);
		  
		    }
		  public void hijack(View v)
		    {
		  String url= "sourceforge.net";
		  Intent i= new Intent(Intent.ACTION_VIEW);
		  i.setData(Uri.parse(url));
		  startActivity(i);
		  
		    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.rootkitdetect, menu);
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
