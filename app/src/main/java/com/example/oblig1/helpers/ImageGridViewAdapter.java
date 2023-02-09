package com.example.oblig1.helpers;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.oblig1.database.DAO;
import com.example.oblig1.model.Person;

import java.util.ArrayList;

public class ImageGridViewAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Person> persons;

    public ImageGridViewAdapter(Context cont, ArrayList<Person> list){
        this.persons = list;
        this.context = cont;
    }

    public int getCount() {
        return persons.size();
    }

    @Override
    public Person getItem(int position){
        return persons.get(position);
    }

    public long getItemId(int position){
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        ImageView imageView;

        if(convertView == null){
            imageView = new ImageView(context);
            imageView.setLayoutParams(new GridView.LayoutParams(369, 369));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            //imageView.setPadding(1, 1, 1, 1);
        } else {
            imageView = (ImageView) convertView;
        }
        imageView.setImageBitmap(persons.get(position).getImage());
        return imageView;
    }

    //public ArrayList<Person> images = (ArrayList) DAO.getPersonList();
}
