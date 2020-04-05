package example.newproject;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class TopHackers extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_top_hackers);
		TextView tv=(TextView)findViewById(R.id.textView2);
		TextView tv1=(TextView)findViewById(R.id.textView3);
		TextView tv2=(TextView)findViewById(R.id.textView4);
		TextView tv3=(TextView)findViewById(R.id.textView5);
		TextView tv4=(TextView)findViewById(R.id.textView6);
		TextView tv5=(TextView)findViewById(R.id.textView7);
	}
	  public void gary(View v)
	    {
	  String url= "https://en.wikipedia.org/wiki/Gary_McKinnon";
	  Intent i= new Intent(Intent.ACTION_VIEW);
	  i.setData(Uri.parse(url));
	  startActivity(i);
	  
	   }
	  public void kevin(View v)
	    {
	  String url= "https://en.wikipedia.org/wiki/Kevin_Mitnick";
	  Intent i= new Intent(Intent.ACTION_VIEW);
	  i.setData(Uri.parse(url));
	  startActivity(i);
	  
	   }
	  public void richard(View v)
	    {
	  String url= "https://toptensofall.wordpress.com/mathew-bevan-born-june-10-1974/";
	  Intent i= new Intent(Intent.ACTION_VIEW);
	  i.setData(Uri.parse(url));
	  startActivity(i);
	  
	   }
	  public void matthew(View v)
	    {
	  String url= "https://en.wikipedia.org/wiki/Mathew_Bevan";
	  Intent i= new Intent(Intent.ACTION_VIEW);
	  i.setData(Uri.parse(url));
	  startActivity(i);
	  
	   }
	  public void poulsen(View v)
	    {
	  String url= "https://en.wikipedia.org/wiki/Kevin_Poulsen";
	  Intent i= new Intent(Intent.ACTION_VIEW);
	  i.setData(Uri.parse(url));
	  startActivity(i);
	  
	   }
	  public void anonymous(View v)
	    {
	  String url= "https://en.wikipedia.org/wiki/Anonymous_(group)";
	  Intent i= new Intent(Intent.ACTION_VIEW);
	  i.setData(Uri.parse(url));
	  startActivity(i);
	  
	   }
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.top_hackers, menu);
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
