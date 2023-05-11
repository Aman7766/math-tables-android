package com.amandeep.mathtables;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
 GridView gv;
    int digit=1;;
   // String[] tableArr=new String[10];
// ArrayList<Item> al = new ArrayList<Item>();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gv=findViewById(R.id.gv);
        String[] gridArray=new String[100];
        for(int i=0;i<gridArray.length;i++)
       {
           gridArray[i]=String.valueOf(i+1);
       }
       ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,R.layout.item_view,R.id.item_text,gridArray);
       gv.setAdapter(arrayAdapter);

       gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
              Intent intent=new Intent(MainActivity.this, ListView.class);
              intent.putExtra("value",gridArray[i]);
              startActivity(intent);

           }
       });
    }

}
