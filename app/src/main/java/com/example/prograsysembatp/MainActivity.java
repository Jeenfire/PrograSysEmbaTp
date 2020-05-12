package com.example.prograsysembatp;

import android.media.Image;
import android.widget.*;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

//    Tableau des éléments à afficher
    protected ArrayList listMangas(){
        ArrayList<Mangas> list = new ArrayList<Mangas>();
        Mangas mangas = new Mangas(1,"Kingdom","t","t", "kingdom.jpg");
        list.add(mangas);
        mangas = new Mangas(1,"My Hero Academia","t","t","mha.jpg");
        list.add(mangas);
        mangas = new Mangas(1,"Solo Levelling","t","t","sololeveling.jpg");
        list.add(mangas);
        mangas = new Mangas(1,"TODAG","Mad Snake","t","smgt.jpg");
        list.add(mangas);
        return list;

    }

    GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList listM = listMangas();
        gridView = (GridView) findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.activity_list_item,listM);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Toast.makeText(getApplicationContext(),
                        ((TextView) v).getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }

//    protected void onCreate(Bundle bundle){
//        super.onCreate(bundle);
//        ArrayList list = listMangas();
//        setContentView(findViewById(R.id.list));
//    }


}
