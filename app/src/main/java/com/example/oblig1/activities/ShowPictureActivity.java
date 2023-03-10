package com.example.oblig1.activities;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.oblig1.database.DAO;
import com.example.oblig1.model.Person;
import com.example.oblig1.R;

import java.util.List;

public class ShowPictureActivity extends AppCompatActivity {
    private List<Person> persons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_picture);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        ActionBar bar = getSupportActionBar();
        bar.setDisplayHomeAsUpEnabled(true);

        persons = DAO.getPersonList();

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        Bitmap image = DAO.getBitmap(name);
        ImageView view = (ImageView) findViewById(R.id.show_picture);

        if (image == null) {
            view.setImageResource(R.drawable.lionel_richie);
        } else {
            view.setImageBitmap(image);
        }
    }

}
