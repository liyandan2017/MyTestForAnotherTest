package com.dbdky.yfzx.mytest;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DevBaseInfoLancherAvtivity extends ListActivity {

    public static final String[] options = { "设备概括信息", "设备当前定值及定值区" };

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
                intent = new Intent(this, SecdevTableActivity.class);
                break;
            case 1:
                intent = new Intent(this, DevsettingsgzoneListActivity.class);
                break;
            default:
                break;
        }

        startActivity(intent);
    }

}