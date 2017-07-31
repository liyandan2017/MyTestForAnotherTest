package com.dbdky.yfzx.mytest;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ShishixinxiActivity extends ListActivity {

    public static final String[] options = { "全网最新动作", "全网最新告警", "全网最新开关量变位", "全网最新录波" };

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
                intent = new Intent(this, PtActionTableActivity.class);
                break;
            case 1:
                intent = new Intent(this, PtAlarmTableActivity.class);
                break;
            case 2:
                intent = new Intent(this, PtChangeTableActivity.class);
                break;
            case 3:
                intent = new Intent(this, PtOscTableActivity.class);
                break;
            default:
                break;
        }

        startActivity(intent);
    }

}