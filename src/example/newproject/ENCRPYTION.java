package example.newproject;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class ENCRPYTION extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_encrpytion);
		 TextView tv=(TextView)findViewById(R.id.textView8);
		 TextView tv1=(TextView)findViewById(R.id.textView10);
	}
	  public void veracrypt(View v)
	    {
	  String url= "www.veracrypt.fr";
	  Intent i= new Intent(Intent.ACTION_VIEW);
	  i.setData(Uri.parse(url));
	  startActivity(i);
	  
	    }
	  public void cryptoexpert(View v)
	    {
	  String url= "www.cryptoexpert.com";
	  Intent i= new Intent(Intent.ACTION_VIEW);
	  i.setData(Uri.parse(url));
	  startActivity(i);
	  
	    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.encrpytion, menu);
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
