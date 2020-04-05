package example.newproject;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class HackersOS extends ActionBarActivity {
Button bt1,bt2,bt3,bt4,bt5;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hackers_os);
		bt1=(Button)findViewById(R.id.button1);
		bt2=(Button)findViewById(R.id.button2);
		bt3=(Button)findViewById(R.id.button3);
		bt4=(Button)findViewById(R.id.button4);
		bt5=(Button)findViewById(R.id.button5);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.hackers_o, menu);
		return true;
	}
	public void BACKTRACK(View v)
	{
		Intent i=new Intent(HackersOS.this,BACKTRACK.class);
		startActivity(i);
		startActivityForResult(i, 500);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
	}
	public void KALILINUX(View v)
	{
		Intent i=new Intent(HackersOS.this,KALILINUX.class);
		startActivity(i);
		startActivityForResult(i, 500);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
	}

	public void KNOPPIX(View v)
	{
		Intent i=new Intent(HackersOS.this,KNOPPIX.class);
		startActivity(i);
		startActivityForResult(i, 500);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
	}
	public void BACKBOBLINUX(View v)
	{
		Intent i=new Intent(HackersOS.this,BACKBOBLINUX.class);
		startActivity(i);
		startActivityForResult(i, 500);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
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
