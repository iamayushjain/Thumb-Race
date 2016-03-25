package com.ayush.thumb;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.provider.ContactsContract.CommonDataKinds.Relation;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class scrollupic1 extends Dialog implements
android.view.View.OnClickListener {

public Activity c;
public Dialog d;
public Button yes, no;
public ImageView v1;
public ImageButton v2;
public TextView t1;
public int i7=0;
public RelativeLayout rv;
public scrollupic1(Activity a) {
super(a);
// TODO Auto-generated constructor stub
this.c = a;
}

@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
requestWindowFeature(Window.FEATURE_NO_TITLE);
 getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        
        WindowManager.LayoutParams.FLAG_FULLSCREEN);
       
setContentView(R.layout.scrollupiclay);
rv=(RelativeLayout)findViewById(R.id.relativelayoutscore);
v1=(ImageView)findViewById(R.id.imageView2);
//v2=(ImageButton)findViewById(R.id.imageButton1);
v1.setImageResource(R.drawable.narrow1);
t1=(TextView)findViewById(R.id.textView1);
t1.setText(" NUMBER \nof BLOCKS");

//yes = (Button) findViewById(R.id.btn_yes);
//no = (Button) findViewById(R.id.btn_no);
//yes.setOnClickListener(this);
//no.setOnClickListener(this);
//v2.setBackgroundColor(Color.TRANSPARENT);
/*v2.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(i7==0)
		{i7=1;
			v1.setImageResource(R.drawable.narrow3);
			t1.setText("Time");
		}
		else
		{  scrollupic cdd12=new scrollupic(c);
		cdd12.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
		dismiss();
		cdd12.show();
		
	
			
		}
	}
});
*/
rv.setOnTouchListener(new View.OnTouchListener() {
	
	@Override
	public boolean onTouch(View v, MotionEvent event) {
		
		// TODO Auto-generated method stub4
		
			if(i7==0)
			{i7=1;
			v1.setImageResource(R.drawable.narrow3);
			t1.setText("TIMER");

				
			}
			else
			{  scrollupic cdd12=new scrollupic(c);
			cdd12.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
			dismiss();
			cdd12.show();
			

				
			}

		return false;
	}
});
}

@Override
public void onClick(View v) {
	if(i7==1)
	{i7=1;
	v1.setImageResource(R.drawable.narrow3);
	t1.setText("TIMER");

		
	}
	else
	{  scrollupic cdd12=new scrollupic(c);
	cdd12.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
	dismiss();
	cdd12.show();
	

		
	}

}


}

