package com.ayush.thumb;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import android.app.Activity;
import android.app.ActionBar.LayoutParams;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class scorepart extends Activity {
	TextView view,t,tfin;
	private InterstitialAd mInterstitialAd;
	Button b1;
	ImageView v1,v2,v3,v4,v5;
	String sam1,sam2;
	int samm1,samm2;
	int i=0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.ending);
		mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-5666077083567257/9024025324");
        AdRequest adRequest1 = new AdRequest.Builder().build();
        mInterstitialAd.loadAd(adRequest1);
        mInterstitialAd.setAdListener(new AdListener(){
            public void onAdLoaded(){
                
                                    // if (mInterstitialAd.isLoaded()) {
                         mInterstitialAd.show();
                     //}
                 
            }
  });
		AdView mAdView = (AdView) findViewById(R.id.adView1);
	    AdRequest adRequest = new AdRequest.Builder().build();
	    mAdView.loadAd(adRequest);
		
		Typeface copperplateGothicLight = Typeface.createFromAsset(getApplicationContext().getAssets(), "CooperBlack.ttf");
		//TextView view;
		view=(TextView)findViewById(R.id.textView3);
		view.setTypeface(copperplateGothicLight);
		t=(TextView)findViewById(R.id.textView5);
		t.setTypeface(copperplateGothicLight);
		tfin=(TextView)findViewById(R.id.textView1);
		//v5=(ImageView)findViewById(R.id.button1);
		v1=(ImageView)findViewById(R.id.imageView1);
		v2=(ImageView)findViewById(R.id.imageView2);
		v3=(ImageView)findViewById(R.id.imageView3);
		int displayWidth = getWindowManager().getDefaultDisplay().getWidth();

		//ImageView imageView = (ImageView)findViewById(R.id.image);

	//	v2.getLayoutParams().width = displayWidth/3;
		//v3.getLayoutParams().width = displayWidth/3;

		//b1.setBackgroundColor(Color.TRANSPARENT);
		Bundle bund=getIntent().getExtras();
		String s="0"+bund.getString("User");
		//String p=bund.getString("Password");
		samm1=Integer.parseInt(s);
		view.setText(samm1+"");
		//view.append(""+s);
		/*SharedPreferences sp2=getSharedPreferences("MM",
		SharedPreferences.Editor ed1=sp2.edit();
		ed1.putString("KK","1000");
		ed1.commit();
		*/
		SharedPreferences sp=getSharedPreferences("MM",0);
		//t.setText(sp.getString("KK",""));
		String s1="0"+sp.getString("KK","1000");
		int hs=Integer.parseInt(s1);
		t.setText(hs+"");
		int cs=Integer.parseInt(s);
	//	int displayWidth = getWindowManager().getDefaultDisplay().getWidth();
		//v1.getLayoutParams().width = displayWidth / 5;
		//v5.getLayoutParams().width= 65*(displayWidth/10);
		//ImageView imageView = (ImageView)findViewById(R.id.image);

		
		if(hs>cs)
		{
			v1.setImageResource(R.drawable.ace);
			//v1.getLayoutParams().width = displayWidth / 5;
		SharedPreferences sp1=getSharedPreferences("MM",0);
		SharedPreferences.Editor ed=sp1.edit();
		//ed.p
		ed.putString("KK",s);
		ed.commit();
		sam2=sp.getString("KK","");
		tfin.setText("NEW RECORD");
		samm2=Integer.parseInt(sam2);
		t.setText(""+samm2);
		
		}
		else if((cs<=((hs*.15)+hs)))
				{
			v1.setImageResource(R.drawable.king);
			//v1.getLayoutParams().width = displayWidth / 5;
				}
		else if((cs<=((hs*.25)+hs)))
		{
	v1.setImageResource(R.drawable.queen);
	//v1.getLayoutParams().width = displayWidth / 5;
	}
		else if((cs<=((hs*.33)+hs)))
		{
	v1.setImageResource(R.drawable.jack);
	//v1.getLayoutParams().width = displayWidth / 5;
		}
		else
		{
			v1.setImageResource(R.drawable.nghanta);
		}

		v2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(scorepart.this,raceingpart.class);
				i.putExtra("User","0");
				//.putExtra("Password",e2.getText().toString());
				startActivity(i);
				finish();
			changeRingerMode(getApplicationContext());
			}
		});
		v3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i122=new Intent(scorepart.this,homepage.class);
		//		i.putExtra("User","0");
				//.putExtra("Password",e2.getText().toString());
				startActivity(i122);
				finish();
				changeRingerMode(getApplicationContext());
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
		CustomDialogClass cdd=new CustomDialogClass(scorepart.this);
	cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
	cdd.show(); 
	
	Window window = cdd.getWindow();
	window.setLayout(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT);}
	}
	 public void changeRingerMode(Context context){

	    	AudioManager audio = (AudioManager) context.getSystemService(Context.AUDIO_SERVICE);

	    	Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
			 // Vibrate for 500 milliseconds
	
		    	    
	    	 switch( audio.getRingerMode() ){
	case AudioManager.RINGER_MODE_NORMAL:
		//Toast.makeText(getApplicationContext(), "Gen", 1000).show();
		 v.vibrate(30);
	   break;
	case AudioManager.RINGER_MODE_SILENT:
		Toast.makeText(getApplicationContext(), "Silent", 1000).show();
	   break;
	case AudioManager.RINGER_MODE_VIBRATE:
		//Toast.makeText(getApplicationContext(), "Vibrate", 1000).show();
		 v.vibrate(30);
		 break;
	}
	    	}

}
