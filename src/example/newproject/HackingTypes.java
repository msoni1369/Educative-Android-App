package example.newproject;




import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class HackingTypes extends ActionBarActivity {
Button bt1,bt2,bt3,bt4,bt5,bt6;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hacking_types);
		bt1=(Button)findViewById(R.id.button1);
		bt2=(Button)findViewById(R.id.button2);
		bt3=(Button)findViewById(R.id.button3);
		bt4=(Button)findViewById(R.id.button4);
		bt5=(Button)findViewById(R.id.button5);
		bt6=(Button)findViewById(R.id.button6);
	}

	public void WEBSITEHACK(View v)
	{
		Intent i=new Intent(HackingTypes.this,WEBSITEHACKING.class);
		startActivity(i);
		   startActivityForResult(i, 500);
	        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
	}
	public void NETWORKHACK(View v)
	{
		Intent i=new Intent(HackingTypes.this,NETWORKHACKING.class);
		startActivity(i);
		startActivityForResult(i, 500);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
	}
	public void ETHICALHACK(View v)
	{
		Intent i=new Intent(HackingTypes.this,ETHICALHACKING.class);
		startActivity(i);
		startActivityForResult(i, 500);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
	}
	public void PASSWORDHACK(View v)
	{
		Intent i=new Intent(HackingTypes.this,PASSWORDHACKING.class);
		startActivity(i);
		startActivityForResult(i, 500);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
	}
	public void BANKHACK(View v)
	{
		Intent i=new Intent(HackingTypes.this,ONLINEBANKINGHACKING.class);
		startActivity(i);
		startActivityForResult(i, 500);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
	}
	public void COMPUTERHACK(View v)
	{
		Intent i=new Intent(HackingTypes.this, COMPUTERHACKING.class);
		startActivity(i);
		startActivityForResult(i, 500);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.hacking_types, menu);
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
