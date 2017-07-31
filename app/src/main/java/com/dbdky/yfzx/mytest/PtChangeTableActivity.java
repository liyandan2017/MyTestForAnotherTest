package com.dbdky.yfzx.mytest;

import android.app.Activity;
import android.os.Bundle;

import java.util.ArrayList;
import com.dbdky.yfzx.mytest.TableAdapter.TableCell;
import com.dbdky.yfzx.mytest.TableAdapter.TableRow;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Toast;
/**
 * @author hellogv
 */
public class PtChangeTableActivity extends Activity {
    /** Called when the activity is first created. */
    ListView lv;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pt_change_table);
        this.setTitle("全网最新N条动作");
        lv = (ListView) this.findViewById(R.id.ListViewPtChange);
        ArrayList<TableRow> table = new ArrayList<TableRow>();
        TableCell[] titles = new TableCell[15];// 每行多少个单元从数据库中查询得到
        int width = this.getWindowManager().getDefaultDisplay().getWidth()/titles.length;
        String szTitle = "Hello";
        String szValue = "value";
        // 定义标题
        for (int i = 0; i < titles.length; i++) {
            titles[i] = new TableCell(szTitle+String.valueOf(i),
                    width + 8 * i,
                    LayoutParams.FILL_PARENT,
                    TableCell.STRING);
        }
        table.add(new TableRow(titles));
        // 每行的数据
        TableCell[] cells = new TableCell[15];// 每行5个单元
        for (int i = 0; i < cells.length - 1; i++) {
            cells[i] = new TableCell(szValue + String.valueOf(i) ,
                    titles[i].width,
                    LayoutParams.FILL_PARENT,
                    TableCell.STRING);
        }
        cells[cells.length - 1] = new TableCell(R.drawable.icon2,
                titles[cells.length - 1].width,
                LayoutParams.WRAP_CONTENT,
                TableCell.IMAGE);
        // 把表格的行添加到表格
        for (int i = 0; i < 12; i++)
            table.add(new TableRow(cells));
        TableAdapter tableAdapter = new TableAdapter(this, table);
        lv.setAdapter(tableAdapter);
        lv.setOnItemClickListener(new ItemClickEvent());
    }
    class ItemClickEvent implements AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                                long arg3) {
            Toast.makeText(PtChangeTableActivity.this, "选中第"+String.valueOf(arg2)+"行", 500).show();
        }
    }
}

