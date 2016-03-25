package com.ayush.thumb;


import android.content.Context;
import android.content.Intent;
	import android.graphics.AvoidXfermode.Mode;
	import android.graphics.Bitmap;
	import android.graphics.Bitmap.Config;
	import android.graphics.BitmapFactory;
	import android.graphics.Canvas;
	import android.graphics.Color;
import android.graphics.Matrix;
	import android.graphics.Paint;
	import android.graphics.PorterDuff;
	import android.graphics.PorterDuffXfermode;
	import android.graphics.Rect;
import android.view.View;
import android.widget.Toast;

	public class mybouncerace extends View {
	Canvas canvas;
	Paint p;
	int x=0,y=0,q=0;
	Paint paint;
	Bitmap bitmap,bitmap2;
	int z=0;
		public mybouncerace(Context context) {
			super(context);
		setBackgroundResource(R.drawable.pic3);
			// TODO Auto-generated constructor stub
			bitmap=BitmapFactory.decodeResource(getResources(),R.drawable.pic5);
					bitmap2=BitmapFactory.decodeResource(getResources(),R.drawable.pic6);
			
		}
		public Bitmap getResizedBitmap(Bitmap bm, int newHeight, int newWidth)
		{
		    int width = bm.getWidth();
		    int height = bm.getHeight();
		    float scaleWidth = ((float) newWidth) / width;
		    float scaleHeight = ((float) newHeight) / height;
		    // create a matrix for the manipulation
		    Matrix matrix = new Matrix();
		    // resize the bit map
		    matrix.postScale(scaleWidth, scaleHeight);
		    // recreate the new Bitmap
		    Bitmap resizedBitmap = Bitmap.createBitmap(bm, 0, 0, width, height, matrix, false);
		    return resizedBitmap;
		}
		@Override
			protected void onDraw(Canvas canvas) {
				// TODO Auto-generated method stub
				super.onDraw(canvas);
				double a=(canvas.getWidth()/2.6);
				bitmap=getResizedBitmap(bitmap,bitmap.getHeight(),canvas.getWidth()/3);
				bitmap2=getResizedBitmap(bitmap2,bitmap2.getHeight(),(int)a);
				
				Rect r=new Rect();
				r.set(0,0,canvas.getWidth(),canvas.getHeight());
				paint=new Paint();
				drawCloud(x,y,canvas);
				String h=canvas.getHeight()+"";
				x=(canvas.getWidth()/2)-(canvas.getWidth()/4)+2*(canvas.getWidth()/30);
				if((y<(canvas.getHeight()/3))&&(z==0))
				{q=0;
					y=y+(canvas.getHeight()/395);
				}
				else if(q==0) {q=1;
				y=y+(canvas.getHeight()/395);
				
				}
				invalidate();
			invalidate();
				
			}
		public void drawCloud(int x2,int y2, Canvas canvas){
			
		if(q==0){	canvas.drawBitmap(bitmap,x2,y2,paint);}
		else if(q==1){canvas.drawBitmap(bitmap,x2,y2,paint);

		y2=y2+(canvas.getHeight()/4);
		x2=(canvas.getWidth()/2)-(canvas.getWidth()/4)+(canvas.getWidth()/25);
		canvas.drawBitmap(bitmap2,x2,y2,paint);}
		
		}
		

	}


