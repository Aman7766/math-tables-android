package com.amandeep.mathtables;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ListView extends AppCompatActivity {
android.widget.ListView lv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        lv=findViewById(R.id.lv);
        int into=1;
        Intent intent=getIntent();
        String count=intent.getExtras().getString("value");
        int value=Integer.parseInt(count);
        String[] arr=new String[20];
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=value +" X "+ into +" = "+ value * into;
            into++;
        }
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,R.layout.item_view,R.id.item_text,arr);
        lv.setAdapter(arrayAdapter);
    }

}

