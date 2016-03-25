package com.ayush.thumb;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.app.Activity;
import android.app.ActionBar.LayoutParams;
import android.content.Intent;
import android.view.Menu;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class MyMainActivity extends Activity {

	int i=0;
		mybouncerace m;
		MyCount counter = new MyCount(5000,100);

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
	    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
	    WindowManager.LayoutParams.FLAG_FULLSCREEN);
	    counter.start();
		  
		mybouncerace m=new mybouncerace(this);
		setContentView(m);
		
	}
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
	
	if(i==0){
		i++;
		Toast.makeText(getApplicationContext(), "PRESS BACK AGAIN TO EXIT", 3000).show();
	}
	else{finish();
	counter.cancel();
	super.onBackPressed();}
	}
	
	public class MyCount extends CountDownTimer{

	    public MyCount(long millisInFuture, long countDownInterval) {
	        super(millisInFuture, countDownInterval);
	    }

	    @Override
	    public void onFinish() {
	    	// TODO Auto-generated method stub
			Intent i=new Intent(MyMainActivity.this,homepage.class);
			startActivity(i);
			finish();
		
	        
	    }

	    @Override
	    public void onTick(long millisUntilFinished) {
	    }
	}
	}

	