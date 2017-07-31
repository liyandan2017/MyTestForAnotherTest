package com.dbdky.yfzx.mytest;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ScopeChooseActivity extends ListActivity {

    public static final String[] options = { "全网概况", "设备状态", "实时信息", "故障报告" };

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
                intent = new Intent(this, QuanwangInfoLancherListActivity.class);
                break;
            case 1:
                intent = new Intent(this, DevStatLancherListActivity.class);
                break;
            case 2:
                intent = new Intent(this, ShishixinxiActivity.class);
                break;
            case 3:
                intent = new Intent(this, FaultshortendataTableActivity.class);
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