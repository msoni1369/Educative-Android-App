package example.newproject;


import java.util.Timer;
import java.util.TimerTask;



import android.support.v4.app.ActionBarDrawerToggle;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.app.AlertDialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;


public class MainActivity extends ActionBarActivity {
	ListView listview;
	public int currentimageindex=0;

	ImageView slidingimage;
	
	private int[] IMAGE_IDS = {
			R.drawable.f3,
			R.drawable.f4
		};
	private CharSequence CharSequence;
	private OnClickListener listener;
	private OnClickListener DialogInterface;  
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final Handler mHandler = new Handler();
        final Runnable mUpdateResults = new Runnable() {
            public void run() {
            	
            	AnimateandSlideShow();
            	
            }
        };
        int delay = 100; // delay for 1 sec.

        int period = 4000; // repeat every 2 sec.
 
        Timer timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {

        public void run() {

        	 mHandler.post(mUpdateResults);

        }

        }, delay, period);


        
        listview = (ListView) findViewById(R.id.listView1);
        String[] values = {"What is Hacking","Types of Hacking","Hackers and its types","Hackers tools","Hacking Operating System","Top Hackers","Top Rated Hacking Apps" ,"Useful Hacks"};
        ArrayAdapter<String>adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,values);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
 	    public void onItemClick(AdapterView<?>parent,View view,int position,long id){
     	   if(position==0)
     	   {
     		   Intent i = new Intent(MainActivity.this,Hacking.class);
     		   startActivity(i);
     	   }
     	   if(position==1)
     	   {
     		   Intent i1 = new Intent(MainActivity.this,HackingTypes.class);
     		   startActivity(i1);
     	  }
     	   if(position==2)
     	   {
     		   Intent i1 = new Intent(MainActivity.this,Hackers.class);
     		   startActivity(i1);
     	  }
     	   if(position==3)
     	   {
     		   Intent i1 = new Intent(MainActivity.this,HackerTools.class);
     		   startActivity(i1);
     	  }
     	  if(position==4)
    	   {
    		   Intent i1 = new Intent(MainActivity.this,HackersOS.class);
    		   startActivity(i1);
    	  }
     	 if(position==5)
  	   {
  		   Intent i1 = new Intent(MainActivity.this,TopHackers.class);
  		   startActivity(i1);
  	   }
     	if(position==6)
 	   {
 		   Intent i1 = new Intent(MainActivity.this,HackingApps.class);
 		   startActivity(i1);
 	   }
     	if(position==7)
  	   {
  		   Intent i1 = new Intent(MainActivity.this,UsefulHacks.class);
  		   startActivity(i1);
  	   }
	    }
       });
    }

    public void onClick(View v) {
        
        finish();
        android.os.Process.killProcess(android.os.Process.myPid());
      }
    
 private void AnimateandSlideShow() {
    	
    	
    	slidingimage = (ImageView)findViewById(R.id.ImageView3_Left);
   		slidingimage.setImageResource(IMAGE_IDS[currentimageindex%IMAGE_IDS.length]);
   		
   		currentimageindex++;
    	
   		Animation rotateimage = AnimationUtils.loadAnimation(this, R.anim.fade_in);
    	  
        
    	  slidingimage.startAnimation(rotateimage);
          
          	 
        
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
 
   

    
    public boolean onOptionsItemSelected(MenuItem item) {
    	
       	
        switch (item.getItemId()) {
            case R.id.item1:
            	Intent i=new Intent(MainActivity.this,AboutUs.class);
            	startActivity(i);
            case R.id.item2:
            	    	Intent shareIntent =new Intent();
            	    	shareIntent.setAction(Intent.ACTION_SEND);
            	    	shareIntent.setType("text/plain");
            	    	shareIntent.putExtra(Intent.EXTRA_TEXT, "https://www.amazon.com/dp/B076GSRDXP/ref=apps_sf_sta");
            	    	startActivity(Intent.createChooser(shareIntent, "share"));
           case R.id.item3:
            	Intent i3=new Intent(MainActivity.this,Feedback.class);
            	startActivity(i3);  
            case R.id.item4:
            	AlertDialog.Builder alertDialogBuilder =new AlertDialog.Builder(this);
           	alertDialogBuilder.setPositiveButton(CharSequence,DialogInterface  );
            	AlertDialog alertDialog =alertDialogBuilder.create();
            	alertDialog.show();
            	
           return true;   
              default:
                return super.onOptionsItemSelected(item);
        }
    }
}
