package com.dbdky.yfzx.mytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.ListActivity;
import android.os.AsyncTask;
import android.text.format.DateUtils;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshBase.Mode;
import com.handmark.pulltorefresh.library.PullToRefreshBase.OnLastItemVisibleListener;
import com.handmark.pulltorefresh.library.PullToRefreshBase.OnRefreshListener;
import com.handmark.pulltorefresh.library.PullToRefreshBase.State;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.handmark.pulltorefresh.library.extras.SoundPullEventListener;

import java.util.Arrays;
import java.util.LinkedList;

public class QuanwanggaikuangActivity extends ListActivity {

    static final int MENU_MANUAL_REFRESH            = 0;
    static final int MENU_DISABLE_SCROLL            = 1;
    static final int MENU_SET_MODE                   = 2;
    static final int  MENU_DEMO                      = 3;

    private LinkedList<String> mListItems;
    private PullToRefreshListView mPullRefreshListView;
    private ArrayAdapter<String> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quanwanggaikuang);

        mPullRefreshListView = (PullToRefreshListView) findViewById(R.id.pull_refresh_quanwanggaikuang_list);

        // Set a listener to be invoked when the list should be refreshed.
        mPullRefreshListView.setOnRefreshListener(new OnRefreshListener<ListView>() {
            @Override
            public void onRefresh(PullToRefreshBase<ListView> refreshView) {
                String label = DateUtils.formatDateTime(getApplicationContext(), System.currentTimeMillis(),
                        DateUtils.FORMAT_SHOW_TIME | DateUtils.FORMAT_SHOW_DATE | DateUtils.FORMAT_ABBREV_ALL);

                // Update the LastUpdatedLabel
                refreshView.getLoadingLayoutProxy().setLastUpdatedLabel(label);

                // Do work to refresh the list here.
                new GetDataTask().execute();
            }
        });

        // Add an end-of-list listener
        mPullRefreshListView.setOnLastItemVisibleListener(new OnLastItemVisibleListener() {

            @Override
            public void onLastItemVisible() {
                Toast.makeText(QuanwanggaikuangActivity.this, "End of List!", Toast.LENGTH_SHORT).show();
            }
        });

        ListView actualListView = mPullRefreshListView.getRefreshableView();

        // Need to use the Actual ListView when registering for Context Menu
        registerForContextMenu(actualListView);

        mListItems = new LinkedList<String>();
        mListItems.addAll(Arrays.asList(mStrings));

        mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mListItems);

        /**
         * Add Sound Event Listener
         */
        SoundPullEventListener<ListView> soundListener = new SoundPullEventListener<ListView>(this);
        soundListener.addSoundEvent(State.PULL_TO_REFRESH, R.raw.pull_event);
        soundListener.addSoundEvent(State.RESET, R.raw.reset_sound);
        soundListener.addSoundEvent(State.REFRESHING, R.raw.refreshing_sound);
        mPullRefreshListView.setOnPullEventListener(soundListener);

        // You can also just use setListAdapter(mAdapter) or
        // mPullRefreshListView.setAdapter(mAdapter)
        actualListView.setAdapter(mAdapter);
    }
    private class GetDataTask extends AsyncTask<Void, Void, String[]> {

        @Override
        protected String[] doInBackground(Void... params) {
            // Simulates a background job.
            try {
                //获取数据库的数据，更新mStrings.
                String test[]={ "变电站总算:    2205", "变电站断开数:    103", "变电站断开比例:    3.8%", "二次设备接入总算:    564", "接入设备断开数:    23",
                        "接入设备断开比例:    56%", "二次设备总算:    789", "检修设备数:    123", "检修设备占比:    45%", "变电站数量:    1263", "变电站占比:    23%", "电厂数量：    6354",
                        "电厂占比:    56.89%", "智能站数量:    5642", "智能站占比:    78%", "常规站数量:    4256", "常规站占比:    23.98", "1000kV变电站数量:    47",
                        "1000kV变电站占比:    12%", "750kV变电站数量:    89",
                        "750kV变电站占比:    23%", "500kV变电站数量:    123",
                        "500kV变电站占比:    30.7%","220kV变电站数量:    347",
                        "220kV变电站占比:    40.8%","66kV变电站数量:    1346",
                        "66KV变电站占比:    60.78%",};
                mStrings = test;
                Thread.sleep(4000);
            } catch (InterruptedException e) {
            }
            return mStrings;
        }

        @Override
        protected void onPostExecute(String[] result) {
            //mListItems.addFirst("Added after refresh...");   //For Debug
            mListItems.clear();
            mListItems.addAll(Arrays.asList(mStrings));
            mAdapter.notifyDataSetChanged();

            // Call onRefreshComplete when the list has been refreshed.
            mPullRefreshListView.onRefreshComplete();

            super.onPostExecute(result);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, MENU_MANUAL_REFRESH, 0, "Manual Refresh");
        menu.add(0, MENU_DISABLE_SCROLL, 1,
                mPullRefreshListView.isScrollingWhileRefreshingEnabled() ? "Disable Scrolling while Refreshing"
                        : "Enable Scrolling while Refreshing");
        menu.add(0, MENU_SET_MODE, 0, mPullRefreshListView.getMode() == Mode.BOTH ? "Change to MODE_PULL_DOWN"
                : "Change to MODE_PULL_BOTH");
        menu.add(0, MENU_DEMO, 0, "Demo");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenuInfo menuInfo) {
        AdapterContextMenuInfo info = (AdapterContextMenuInfo) menuInfo;

        menu.setHeaderTitle("Item: " + getListView().getItemAtPosition(info.position));
        menu.add("Item 1");
        menu.add("Item 2");
        menu.add("Item 3");
        menu.add("Item 4");

        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem disableItem = menu.findItem(MENU_DISABLE_SCROLL);
        disableItem
                .setTitle(mPullRefreshListView.isScrollingWhileRefreshingEnabled() ? "Disable Scrolling while Refreshing"
                        : "Enable Scrolling while Refreshing");

        MenuItem setModeItem = menu.findItem(MENU_SET_MODE);
        setModeItem.setTitle(mPullRefreshListView.getMode() == Mode.BOTH ? "Change to MODE_FROM_START"
                : "Change to MODE_PULL_BOTH");

        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case MENU_MANUAL_REFRESH:
                new GetDataTask().execute();
                mPullRefreshListView.setRefreshing(false);
                break;
            case MENU_DISABLE_SCROLL:
                mPullRefreshListView.setScrollingWhileRefreshingEnabled(!mPullRefreshListView
                        .isScrollingWhileRefreshingEnabled());
                break;
            case MENU_SET_MODE:
                mPullRefreshListView.setMode(mPullRefreshListView.getMode() == Mode.BOTH ? Mode.PULL_FROM_START
                        : Mode.BOTH);
                break;
            case MENU_DEMO:
                mPullRefreshListView.demo();
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    private String[] mStrings = { "变电站总算:    ", "变电站断开数:    ", "变电站断开比例:    ", "二次设备接入总算:    ", "接入设备断开数:    ",
            "接入设备断开比例:    ", "二次设备总算:    ", "检修设备数:    ", "检修设备占比:    ", "变电站数量:    ", "变电站占比:    ", "电厂数量：    ",
            "电厂占比:    ", "智能站数量:    ", "智能站占比:    ", "常规站数量:    ", "常规站占比:    ", "1000kV变电站数量:    ",
            "1000kV变电站占比:    ", "750kV变电站数量:    ",
            "750kV变电站占比:    ", "500kV变电站数量:    ",
            "500kV变电站占比:    ","220kV变电站数量:    ",
            "220kV变电站占比:    ","66kV变电站数量:    ",
            "66KV变电站占比:    ",};

}
