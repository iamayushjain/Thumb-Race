package com.ayush.thumb;

import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Vibrator;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;
import com.google.android.gms.ads.AdRequest ;
import com.google.android.gms.ads.AdView;


public class homepage extends Activity{
ImageView v1;
	ImageView b1,b2,b3,b4,b5;
	int k=0;
	int i=0;
	int hello=1;
	
int dw;
	@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	requestWindowFeature(Window.FEATURE_NO_TITLE);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
    WindowManager.LayoutParams.FLAG_FULLSCREEN);
    
	setContentView(R.layout.homepa2);
	v1=(ImageView)findViewById(R.id.imageView1);
	b1=(ImageView)findViewById(R.id.imageView2);
	b2=(ImageView)findViewById(R.id.imageView3);
	b3=(ImageView)findViewById(R.id.imageView4);
	AdView mAdView = (AdView) findViewById(R.id.adView);
    AdRequest adRequest = new AdRequest.Builder().build();
    mAdView.loadAd(adRequest);
	int displayWidth = getWindowManager().getDefaultDisplay().getWidth();

	
	
	b1.getLayoutParams().width = displayWidth / 3;
	 final int displayWidth1 = displayWidth/3;
dw=displayWidth/3;
	
	b2.getLayoutParams().width = displayWidth / 3;
	 final int displayWidth2 = displayWidth/4;

	
	b3.getLayoutParams().width = displayWidth / 3;
	int displayWidth3 = getWindowManager().getDefaultDisplay().getWidth();

		int displayWidth5 = getWindowManager().getDefaultDisplay().getHeight();

String hell;
	SharedPreferences sp1=getSharedPreferences("MMM",0);
	String sp3=sp1.getString("MMM","");
	if((sp3==null)||(sp3.isEmpty()))
	{
hell="1"+sp1.getString("KKK","");
hello=Integer.parseInt(hell);
	}
	else
	{hell=sp1.getString("KKK","")+"0";
hello=Integer.parseInt(hell);
	}
		b1.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			
			Intent i=new Intent(homepage.this,raceingpart.class);
			if(hello!=0)
			{	i.putExtra("User",hello+"");
				hello=0;
			}
			else if(hello==0){i.putExtra("User",hello+"");}
			SharedPreferences sp1=getSharedPreferences("MMM",0);
			SharedPreferences.Editor ed1=sp1.edit();
			ed1.putString("KKK",hello+"");
			ed1.commit();
			
			startActivity(i);
			finish();
			// TODO Auto-genera
	changeRingerMode(getApplicationContext());
			
				
		}
	});
	b2.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub"
			changeRingerMode(getApplicationContext());
			listview3 cdd1=new listview3(homepage.this);
			cdd1.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
			cdd1.show();
			Window window = cdd1.getWindow();
			window.setLayout(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);

			
		}
	});
	b3.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			changeRingerMode(getApplicationContext());
		
			helpmenu1 hmm=new helpmenu1(homepage.this);
			hmm.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
			hmm.show();
			Window window = hmm.getWindow();
			window.setLayout(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
			hello=1;
			SharedPreferences sp1=getSharedPreferences("MMM",0);
			SharedPreferences.Editor ed1=sp1.edit();
			ed1.putString("KKK",hello+"");
			ed1.commit();
			
			
		}
	});
	b1.setOnLongClickListener(new View.OnLongClickListener() {
		
		@Override
		public boolean onLongClick(View arg0) {
			changeRingerMode(getApplicationContext());

			// TODO Auto-generated method stub
		
Toast.makeText(getApplicationContext(), "PLAY", 3000).show();
return false;
		}
	});
	b2.setOnLongClickListener(new View.OnLongClickListener() {
		
		@Override
		public boolean onLongClick(View v) {
			// TODO Auto-generated method stub
			changeRingerMode(getApplicationContext());
			Toast.makeText(getApplicationContext(), "DEVELOPERS", 3000).show();return false;
		}
	});
b3.setOnLongClickListener(new View.OnLongClickListener() {
		
		@Override
		public boolean onLongClick(View v) {
			// TODO Auto-generated method stub
			changeRingerMode(getApplicationContext());
			Toast.makeText(getApplicationContext(), "HELP", 3000).show();return false;
		}
	});
	}
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
	
	if(i==0){
		i++;
		Toast.makeText(getApplicationContext(), "PRESS BACK AGAIN", 3000).show();
	}
	else{
		CustomDialogClass cdd=new CustomDialogClass(homepage.this);
	cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
	cdd.show(); 
	
	Window window = cdd.getWindow();
	window.setLayout(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT);}
	}
	public class MyCount extends CountDownTimer{

	    public MyCount(long millisInFuture, long countDownInterval) {
	        super(millisInFuture, countDownInterval);
	    }

	    @Override
	    public void onFinish() {
	    	// TODO Auto-generated method stub
		
	    	b1.getLayoutParams().width = (dw);
	    }

	    @Override
	    public void onTick(long millisUntilFinished) {
	    }
	}
	  public void changeRingerMode(Context context){

	    	AudioManager audio = (AudioManager) context.getSystemService(Context.AUDIO_SERVICE);

	    	Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
	
		    	    
	    	 switch( audio.getRingerMode() ){
	case AudioManager.RINGER_MODE_NORMAL:
		 v.vibrate(30);
	   break;
	case AudioManager.RINGER_MODE_SILENT:
		Toast.makeText(getApplicationContext(), "Silent", 1000).show();
	   break;
	case AudioManager.RINGER_MODE_VIBRATE:
		 v.vibrate(30);
		 break;
	}
	    	}

	}



