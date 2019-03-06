package com.example.owner.nevergiveupapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.owner.nevergiveupapplication.data.MyGroup;

public class TaaskAdapter extends ArrayAdapter<MyGroup>
{
    public TaaskAdapter(Context context, int resource) {
        super(context, resource);
    }

    @Override
    public View getDropDownView(int position, View convertView,  ViewGroup parent) {
        if (convertView==null)// to build one item using xml layout
            convertView=LayoutInflater.from(getContext()).inflate(R.layout.task_item,parent,false);
        //to get current data object
       MyGroup m=getItem(position);//return data object number"position"

//get references for each item at the xml ui
        TextView tvTitle=convertView.findViewById(R.id.tvitmTitle);
        TextView tvText=convertView.findViewById(R.id.tvitmText);
        SeekBar skbNess=convertView.findViewById(R.id.skbitmNess);
        SeekBar skbImp=convertView.findViewById(R.id.skbitmImp);
        ImageButton ibDel=convertView.findViewById(R.id.ibtnitmDelTask);


        //put the data of the object on the view
        tvText.setText(m.getName());

        ibDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Del", Toast.LENGTH_SHORT).show();
            }
        });



        return convertView;
    }
}


