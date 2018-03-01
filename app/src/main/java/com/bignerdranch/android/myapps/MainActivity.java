package com.bignerdranch.android.myapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listHashMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ExpandableListView)findViewById(R.id.lvExp);
        prepareListData();
        listAdapter = new ExpandableListAdapter(this,listDataHeader,listHashMap);
        listView.setAdapter(listAdapter);
    }

    private void prepareListData() {
        /*
     * Preparing the list data
     */
            listDataHeader = new ArrayList<>();
            listHashMap = new HashMap<String, List<String>>();

            // Adding child data
            listDataHeader.add("Gong Badak");
            listDataHeader.add("Kuala Terengganu");
            listDataHeader.add("UMT");

            // Adding child data
            List<String> gongBadak = new ArrayList<>();
            gongBadak.add("PAYA BUNGA");
            gongBadak.add("PAYA BUNGA");
            gongBadak.add("PAYA BUNGA");
            gongBadak.add("PAYA BUNGA");

            List<String> kualaTerengganu = new ArrayList<>();
            kualaTerengganu.add("Setiu");
            kualaTerengganu.add("Setiu");
            kualaTerengganu.add("Setiu");
            kualaTerengganu.add("Setiu");

            List<String> umt = new ArrayList<>();
            umt.add("Bandar Kuala Terengganu");
            umt.add("Bandar Kuala Terenganu");
            umt.add("Bandar Kuala Terengganu");
            umt.add("Bandar Kuala Terengganu");

            listHashMap.put(listDataHeader.get(0), gongBadak); // Header, Child data
            listHashMap.put(listDataHeader.get(1), kualaTerengganu);
            listHashMap.put(listDataHeader.get(2), umt);



    }
}
