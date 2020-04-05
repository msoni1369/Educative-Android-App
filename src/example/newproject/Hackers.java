package example.newproject;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Hackers extends ActionBarActivity {
Button bt1,bt2,bt3,bt4,bt5,bt6,bt7;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hackers);
		bt1=(Button)findViewById(R.id.button1);
		bt2=(Button)findViewById(R.id.button2);
		bt3=(Button)findViewById(R.id.button3);
		bt4=(Button)findViewById(R.id.button4);
		bt5=(Button)findViewById(R.id.button5);
		bt6=(Button)findViewById(R.id.button6);
		bt7=(Button)findViewById(R.id.button7);
	}
	public void SCRIPTKIDDLE(View v)
	{
	Intent i=new Intent(Hackers.this,SCRIPTKIDDLE.class);	
	startActivity(i);
	startActivityForResult(i, 500);
    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
	}
	public void WHITEHAT(View v)
	{
	Intent i=new Intent(Hackers.this,WHITEHAT.class);	
	startActivity(i);
	startActivityForResult(i, 500);
    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
	}
	public void BLACKHAT(View v)
	{
	Intent i=new Intent(Hackers.this,BLACKHAT.class);	
	startActivity(i);
	startActivityForResult(i, 500);
    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
	}
	public void GRAYHAT(View v)
	{
	Intent i=new Intent(Hackers.this,GRAYHAT.class);	
	startActivity(i);
	startActivityForResult(i, 500);
    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
	}
	public void GREENHAT(View v)
	{
	Intent i=new Intent(Hackers.this,GREENHAT.class);	
	startActivity(i);
	startActivityForResult(i, 500);
    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
	}
	public void REDHAT(View v)
	{
	Intent i=new Intent(Hackers.this, REDHAT.class);	
	startActivity(i);
	startActivityForResult(i, 500);
    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
	}
	public void BLUEHAT(View v)
	{
	Intent i=new Intent(Hackers.this,BLUEHAT.class);	
	startActivity(i);
	startActivityForResult(i, 500);
    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_in_left);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.hakers, menu);
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
