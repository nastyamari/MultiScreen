package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] countries = { "Аргентина", "Бразилия", "Чили", "Колумбия", "Уругвай", "Мы"};
        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, countries);
        setListAdapter(mAdapter);
        getListView().setOnItemClickListener(itemListener);

    }
    AdapterView.OnItemClickListener itemListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            if (position == 0){
                Intent intent = new Intent(MainActivity.this, Argentina.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Вы выбрали " + parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
            }
            if (position == 1){
                Intent intent = new Intent(MainActivity.this, Brasilia.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Вы выбрали " + parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
            }
            if (position == 2){
                Intent intent = new Intent(MainActivity.this, Chili.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Вы выбрали " + parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
            }
            if (position == 3){
                Intent intent = new Intent(MainActivity.this, Columbia.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Вы выбрали " + parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
            }
            if (position == 4){
                Intent intent = new Intent(MainActivity.this, Urugvai.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Вы выбрали " + parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
            }
            if (position == 5){
                Intent intent = new Intent(MainActivity.this, We.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Вы выбрали " + parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
            }


        }
    };

}