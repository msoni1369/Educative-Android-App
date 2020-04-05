package example.newproject;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class HackerTools extends ActionBarActivity {
Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hacker_tools);
		bt1=(Button)findViewById(R.id.button1);
		bt2=(Button)findViewById(R.id.button2);
		bt3=(Button)findViewById(R.id.button3);
		bt4=(Button)findViewById(R.id.button4);
		bt5=(Button)findViewById(R.id.button5);
		bt6=(Button)findViewById(R.id.button6);
		bt7=(Button)findViewById(R.id.button7);
		bt8=(Button)findViewById(R.id.button8);
	}
	public void PASSWORDCRACKER(View v)
	{
		Intent i=new Intent(HackerTools.this,PASSWORDCRACKER.class);
		startActivity(i);
		startActivityForResult(i, 500);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
	}
	public void WIRELESSHACKING(View v)
	{
		Intent i=new Intent(HackerTools.this,WIRELESSHACKING.class);
		startActivity(i);
		startActivityForResult(i, 500);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
	}
	public void FIREWALLWEAK(View v)
	{
		Intent i=new Intent(HackerTools.this,FIREWALLWEAK.class);
		startActivity(i);
		startActivityForResult(i, 500);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
	}
	public void NETWORKSCAN(View v)
	{
		Intent i=new Intent(HackerTools.this,NETWORKSCAN.class);
		startActivity(i);
		startActivityForResult(i, 500);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
	}
	public void ROOTKITDETECT(View v)
	{
		Intent i=new Intent(HackerTools.this,ROOTKITDETECT.class);
		startActivity(i);
		startActivityForResult(i, 500);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
	}
	public void DEBUGGERS(View v)
	{
		Intent i=new Intent(HackerTools.this,DEBUGGERS.class);
		startActivity(i);
		startActivityForResult(i, 500);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
	}
	public void ENCRPYTION(View v) 
	{
		Intent i=new Intent(HackerTools.this,ENCRPYTION.class);
		startActivity(i);
		startActivityForResult(i, 500);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
	}
	public void VULNERABILITYSCAN(View v) 
	{
		Intent i=new Intent(HackerTools.this,VULNERABILITYSCAN.class);
		startActivity(i);
		startActivityForResult(i, 500);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
	}    
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.haker_tools, menu);
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
