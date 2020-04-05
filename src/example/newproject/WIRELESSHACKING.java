package example.newproject;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class WIRELESSHACKING extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_wirelesshacking);
		 TextView tv=(TextView)findViewById(R.id.textView7);
			}
			  public void airsnort(View v)
			    {
			  String url= "airsnort.shmoo.com";
			  Intent i= new Intent(Intent.ACTION_VIEW);
			  i.setData(Uri.parse(url));
			  startActivity(i);
			  
			   }
			  public void wifite(View v)
			    {
			  String url= "github.com/derv82/wifite";
			  Intent i= new Intent(Intent.ACTION_VIEW);
			  i.setData(Uri.parse(url));
			  startActivity(i);
			  
			   }
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.wirelesshacking, menu);
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
