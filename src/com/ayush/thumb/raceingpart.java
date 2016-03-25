package com.ayush.thumb;

import java.text.BreakIterator;

import android.media.ExifInterface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.app.Activity;
import android.app.ActionBar.LayoutParams;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.util.Log;
import android.view.Menu;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class raceingpart extends Activity {
	 String[] contacts={"GARGi","Akki","AISHWARYA","anJALI","mITI","sONAM","bHANU","Priya","SUnada","Sujata","QWE","ert","ghj"};
	 String[] contacts1={"Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV"};
	 String[] contacts2={"Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV"};
	String[] contacts3={"Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV","Ayush","KARTIK","ATUL","NITIN","POARAS","VAIBHAV"};
		String[] contacts4={"1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0","1","2","3","4","5","6","7","8","9","0"};
			
	 	ListView view;
	 	TextView tv,tv1,tv2,tv3;
	 	int i=0,q1,q2;
	 	int i3=1000;
	 	long i4;
	 	int ik2;
	 	int y=10,timey;
	 	 Integer[] imageId = {
	 		      R.drawable.image25
	 		      };
	 	 int baccky=0;
	 	  MyCount counter = new MyCount(100000,100);

	 	   
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);q1=0;q2=0;
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        
        WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_my_main);
      //  for(ik2=0;ik2<=10000;ik2++)
        {
        //	contacts3[ik2]=ik2+"";
        }
       view=(ListView)findViewById(R.id.listView1);
       view.setBackgroundColor(Color.BLACK);
       Typeface copperplateGothicLight = Typeface.createFromAsset(getApplicationContext().getAssets(), "CooperBlack.ttf"); 
       
       tv2=(TextView)findViewById(R.id.textView1);
       tv3=(TextView)findViewById(R.id.TextView01);
       tv2.setTypeface(copperplateGothicLight);
       
       tv1=(TextView)findViewById(R.id.textView2);
       tv1.setTypeface(copperplateGothicLight);
       
       tv1.setBackgroundColor(Color.TRANSPARENT);
       tv=(TextView)findViewById(R.id.textView3);
       tv.setBackgroundColor(Color.TRANSPARENT);
       tv.setText(i3+"");
       tv.setTypeface(copperplateGothicLight);
       tv3.setBackgroundColor(Color.TRANSPARENT);
       tv3.setText("Left");
       tv3.setTypeface(copperplateGothicLight);
       Bundle bund=getIntent().getExtras();
		String s="0"+bund.getString("User");
		int hello1=Integer.parseInt(s);
		if(hello1==1)
		{
			//Toast.makeText(getApplicationContext(), "BUnd"+hello1, 3000).show();
			scrollupic1 cdd122=new scrollupic1(raceingpart.this);
			cdd122.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
			cdd122.show();
			Window window = cdd122.getWindow();
		window.setLayout(LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT);
		

		}
		else{
       scrollupic cdd12=new scrollupic(raceingpart.this);
		cdd12.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
		cdd12.show();
		}
     //  tv1.setText(i+"");
    	//ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,contacts);
    	//final ArrayAdapter<String> adapter1=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,contacts1);
    	imagecustom adapter = new
    	        imagecustom(raceingpart.this, contacts, imageId);
    	 final imagecustom adapter1 = new
    	        imagecustom(raceingpart.this, contacts3, imageId);
    	view.setAdapter(adapter);
    	registerForContextMenu(view);
    	view.setOnScrollListener(new OnScrollListener(){
    		private int mLastFirstVisibleItem;

            @Override
            public void onScroll(AbsListView vie,
            int firstVisibleItem, int visibleItemCount,
            int totalItemCount) {
            //Algorithm to check f the last item is visible or not
            	            	if(i==1)
                {
                	/*Thread t=new Thread(){
                		public void run()
                		{
                				try
                				{
                					sleep(1000);
                					y=y+1;
                					Toast.makeText(getApplicationContext(), y+"", 3000).show();
                					
                					if(y==20)
                					{
                						finish();
                						Toast.makeText(getApplicationContext(), "Time up", 3000).show();
                					
                					}
                				}
                				catch(Exception e)
                				{
                					e.printStackTrace();
                				}
                		

                }


            	
            };
            t.start();*/
            		//timey=y*1000;
            		
            		  

            	        counter.start();
            	        

            	    }
            	//i++;
            //    tv.setText(i+"");


            	               final int lastItem = firstVisibleItem + visibleItemCount;
            	               if((i3==0)&&(q1==0))
            	               {q1=1;
            	               q2=1;
            	            	   //counter.
            	              	 Intent i=new Intent(raceingpart.this,scorepart.class);
            	       			i.putExtra("User",i4+"");
            	       			//.putExtra("Password",e2.getText().toString());
            	       			//finish();
            	       			counter.cancel();
            	       		
                    	       	startActivity(i);
            	    
            	       			finish();
            	       			//exit
            	       	
            	               }
            	               
   if(lastItem == totalItemCount){                 
            // you have reached end of list, load more data       
            	view.setAdapter(adapter1);
            	registerForContextMenu(view);
 //          i++;
   //        i3=1000-i;
     //        tv.setText(i3+"");
            }
            	if(mLastFirstVisibleItem<firstVisibleItem)
                {
             i++; i3=1000-i;
             if(i<=999){      tv.setText(i3+"");}
               
                //tv.setText(i+"");

                 //   Log.i("SCROLLING DOWN","TRUE");
                   // Toast.makeText(getApplicationContext(), "Up GOing", 3000).show();
                   }
                if(mLastFirstVisibleItem>firstVisibleItem)
                {
               	// i++;
                //tv.setText(i+"");

                    //Log.i("SCROLLING UP","TRUE");
                    //Toast.makeText(getApplicationContext(), "Down GOing", 3000).show();
                }
                mLastFirstVisibleItem=firstVisibleItem;
                }
            
           
            @Override
            public void onScrollStateChanged(AbsListView view,int scrollState) {
            //blank, not using this
            	              
            }

			            });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my_main, menu);
        return true;
    }
 @Override
public void onBackPressed() {
	// TODO Auto-generated method stub
//	super.onBackPressed();
	 CustomRacetime css=new CustomRacetime(raceingpart.this);
	 css.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
	 css.show();
	 counter.cancel();
	 Window window = css.getWindow();
		window.setLayout(LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT);
		
	
	
	{
		//Intent ty=new Intent(raceingpart.this,homepage.class);
	//	startActivity(ty);
		//finish();
	}
}
    //countdowntimer is an abstract class, so extend it and fill in methods
    public class MyCount extends CountDownTimer{

        public MyCount(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onFinish() {
         //  tv1.setText("Done/");
         // TODO Auto-generated method stub
if(q2==0){			Intent i11=new Intent(raceingpart.this,scorepart.class);
			//i.putExtra("User",tv.getText().toString());
	//		q2=1;//.putExtra("Password",e2.getText().toString());
i11.putExtra("User",1000+"");
	//.putExtra("Password",e2.getText().toString());
	//finish();
	counter.cancel();
		startActivity(i11);
			finish();}
            
        }
        

        @Override
        public void onTick(long millisUntilFinished) {
           // tv1.setText("Left: " + millisUntilFinished/100);
            i4=(100000-millisUntilFinished)/100;
            tv1.setText(""+i4);
         /*   if(i3<=0)
            {
         	   //counter.
           	 Intent i7=new Intent(MyMainActivity.this,score1.class);
    			i7.putExtra("User",tv1.getText().toString());
    			//.putExtra("Password",e2.getText().toString());
    			
    			
    			startActivity(i7);
    			finish();
    			
    			millisUntilFinished=0;
    			
    			
            }*/
        }

}

}

