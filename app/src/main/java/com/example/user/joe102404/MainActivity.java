package com.example.user.joe102404;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.SimpleAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    Spinner spinner2;
    String fruit[]={"鳳梨","葡萄","芭樂","芒果","甘蔗","草莓"};
    ArrayAdapter<String> adapter;
    ArrayList<Map<String,String>> mylist;
    SimpleAdapter adapter2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner)findViewById(R.id.spinner);

        adapter = new ArrayAdapter<String>(MainActivity.this,
                                android.R.layout.simple_spinner_item,fruit);
        spinner.setAdapter(adapter);
        //=================================================================
        spinner2 = (Spinner)findViewById(R.id.spinner2);
        mylist = new ArrayList();
        HashMap<String,String> m1 = new HashMap<>();
        m1.put("city", "台北");
        m1.put("code", "02");
        mylist.add(m1);

        HashMap<String,String> m2 = new HashMap<>();
        m2.put("city", "台中");
        m2.put("code", "04");
        mylist.add(m2);

        HashMap<String,String> m3 = new HashMap<>();
        m3.put("city", "高雄");
        m3.put("code", "07");
        mylist.add(m3);
        //用androind提供的 layout
        /*adapter2 = new SimpleAdapter(MainActivity.this,
                    mylist,
                    android.R.layout.simple_list_item_2,
                    new String[]{"city","code"},
                    new int[]{android.R.id.text1,android.R.id.text2}
                );*/
        //用自己規劃的layout
        adapter2 = new SimpleAdapter(MainActivity.this,
                    mylist,
                    R.layout.mylaout,
                    new String[]{"city","code"},
                    new int[]{R.id.tvcity,R.id.tvcode}
                );

        spinner2.setAdapter(adapter2);

    }
}
