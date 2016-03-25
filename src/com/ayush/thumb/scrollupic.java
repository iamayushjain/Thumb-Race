package com.ayush.thumb;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.renderscript.Mesh.TriangleMeshBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class scrollupic extends Dialog implements
android.view.View.OnClickListener {

public Activity c;
public Dialog d;
public Button yes, no;
public ImageView v1;
public ImageButton b1;
public TextView t1;

public scrollupic(Activity a) {
super(a);
// TODO Auto-generated constructor stub
this.c = a;
}

@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
requestWindowFeature(Window.FEATURE_NO_TITLE);
setContentView(R.layout.scrollupiclay);
v1=(ImageView)findViewById(R.id.imageView2);
//b1=(ImageButton)findViewById(R.id.imageButton1);
t1=(TextView)findViewById(R.id.textView1);
v1.setImageResource(R.drawable.narrow2);
//b1.setVisibility(View.GONE);
t1.setText("  SCROLL UP");

//yes = (Button) findViewById(R.id.btn_yes);
//no = (Button) findViewById(R.id.btn_no);
//b1.setOnClickListener(this);
v1.setOnClickListener(this);
t1.setOnClickListener(this);
v1.setOnTouchListener(new View.OnTouchListener() {
	
	@Override
	public boolean onTouch(View v, MotionEvent event) {
		// TODO Auto-generated method stub
		dismiss();return false;
	}
});

}

@Override
public void onClick(View v) {
	switch (v.getId()) {
	case R.id.imageView2:
	  dismiss();
	  break;
	case R.id.textView1:
	  dismiss();
	  break;
	default:
	  break;
	}
dismiss();
}


}
