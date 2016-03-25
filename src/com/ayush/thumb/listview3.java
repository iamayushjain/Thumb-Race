package com.ayush.thumb;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class listview3 extends Dialog 
{
	public Activity c;
    public listview3(Activity a) {
		super(a);
		this.c=a;
		// TODO Auto-generated constructor stub
	}

	/** Called when the activity is first created. */
 
    ListView lview3;
    ListViewCustomAdapter adapter;
    Button b1;
 
    private static String desc[] = {"Ayush Jain","Arpit Agarwal","Abhinav Tiwari"};
 
    private static String month[] = {"Developer","Developer","Designer"};
    
    Integer[] imageId = {
		      R.drawable.dev1,R.drawable.dev2,R.drawable.dev3
		      };
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // requestWindowFeature(Window.FEATURE_NO_TITLE);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.main);
       
        lview3 = (ListView) findViewById(R.id.listView1);
        adapter = new ListViewCustomAdapter(c, month, desc,imageId);
        lview3.setAdapter(adapter);
        b1=(Button)findViewById(R.id.button1);
 b1.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
	dismiss();	
	}
});
       
    }
 
}
