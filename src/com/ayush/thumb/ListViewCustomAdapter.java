package com.ayush.thumb;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
 
public class ListViewCustomAdapter extends BaseAdapter
{
    public String title[];
    public String description[];
    public Integer picss[];
    public Activity context;
    public LayoutInflater inflater;
 
    public ListViewCustomAdapter(Activity context,String[] title, String[] description,Integer[] imageId) {
        super();
 
        this.context = context;
        this.title = title;
        this.description = description;
        this.picss=imageId;
        this.inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
 
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return title.length;
    }
 
    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return null;
    }
 
    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }
 
    public static class ViewHolder
    {
        ImageView imgViewLogo;
        TextView txtViewTitle;
        TextView txtViewDescription;
    }
 
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
 
        ViewHolder holder;
        if(convertView==null)
        {
            holder = new ViewHolder();
            convertView = inflater.inflate(R.layout.listview_row, null);
 
            holder.imgViewLogo = (ImageView) convertView.findViewById(R.id.imgViewLogo);
            holder.txtViewTitle = (TextView) convertView.findViewById(R.id.textView1);
            holder.txtViewDescription = (TextView) convertView.findViewById(R.id.textView2);
 
            convertView.setTag(holder);
        }
        else
            holder=(ViewHolder)convertView.getTag();
 
        holder.imgViewLogo.setImageResource(picss[position]);
      

    	//ImageView imageView = (ImageView)findViewById(R.id.image);

    	holder.imgViewLogo.getLayoutParams().width =400;

        holder.txtViewTitle.setText(title[position]);
        holder.txtViewDescription.setText(description[position]);
 
        return convertView;
    }
 
}