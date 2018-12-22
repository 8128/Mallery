package com.cytty.android.mallery;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton btnGallery;
    private ImageButton btnSet;
    private ImageButton btnCate;
    private ImageButton btnTag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGallery = (ImageButton) findViewById(R.id.pic);
        btnGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,GalleryActivity.class));
            }
        });

        btnSet = (ImageButton) findViewById(R.id.set);
        btnSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,SetActivity.class));
            }
        });

        btnCate = (ImageButton) findViewById(R.id.category);
        btnCate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,CateActivity.class));
            }
        });

        btnTag = (ImageButton) findViewById(R.id.edit);
        btnTag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,TagActivity.class));
            }
        });
    }
}
