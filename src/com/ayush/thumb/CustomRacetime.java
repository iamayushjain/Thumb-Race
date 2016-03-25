package com.ayush.thumb;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CustomRacetime extends Dialog   implements
android.view.View.OnClickListener{

public Activity c;
public Dialog d;
public ImageView hom,res;
public TextView tv2;

public CustomRacetime(Activity a) {
super(a);
// TODO Auto-generated constructor stub
this.c = a;
}

@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
requestWindowFeature(Window.FEATURE_NO_TITLE);
setContentView(R.layout.homerestart);
hom= (ImageView) findViewById(R.id.imageView2);
res= (ImageView) findViewById(R.id.imageView3);
Typeface copperplateGothicLight = Typeface.createFromAsset(c.getApplicationContext().getAssets(), "CooperBlack.ttf"); 

tv2=(TextView)findViewById(R.id.imageView1);
tv2.setTypeface(copperplateGothicLight);
//Toast.makeText(c,"PRESS BACK AGAIN", duration)
hom.setOnClickListener(this);
res.setOnClickListener(this);
}
@Override
public void onClick(View v) {
	// TODO Auto-generated method stub
	switch (v.getId()) {
	case R.id.imageView3:
		Intent i=new Intent(c,homepage.class);
		//	i.putExtra("User",tv.getText().toString());
			//.putExtra("Password",e2.getText().toString());
			c.startActivity(i);
			c.finish();
			dismiss();
			break;
	case R.id.imageView2:
		Intent i1=new Intent(c,raceingpart.class);
		i1.putExtra("User","0");
			//.putExtra("Password",e2.getText().toString());
			c.startActivity(i1);
			c.finish();
			dismiss();
			break;
	}
		
}
@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
	Intent ty=new Intent(c,homepage.class);
			c.startActivity(ty);
			c.finish();	//super.onBackPressed();
	}
}
