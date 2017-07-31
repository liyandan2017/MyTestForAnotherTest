package com.dbdky.yfzx.mytest;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class QuanwangInfoLancherListActivity extends ListActivity {

    public static final String[] options = { "接入概况", "总告警", "地区概况", "厂家子站概况", "最新故障报告" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, options));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent = null;

        switch (position) {

            case 0:
                intent = new Intent(this, QuanwanggaikuangActivity.class);
                break;
            case 1:
                intent = new Intent(this, AllWarningListActivity.class);
                break;
            case 2:
                intent = new Intent(this, DevnetbaseListActivity.class);
                break;
            case 3:
                intent = new Intent(this, ManufactureStationStatListActivity.class);
                break;
            case 4:
                intent = new Intent(this, GuzhangbaogaoListActivity.class);
                break;
            default:
                break;
        }

        startActivity(intent);
    }

}