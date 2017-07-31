package com.dbdky.yfzx.mytest;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONObject;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimerTask;


public class MainActivity extends AppCompatActivity {
    public static final int             cMenuUserID      =       1;
    public static UserInfo                       cUser      =       new UserInfo();
    protected static String             strSbuStation      =        "";
    protected static String                 strDevice      =        "";
    protected static int                    iCity          =        0;
    protected static boolean              bReport         =      false;
    protected static int                    StepID         =     -1;

    private TextView responseText;

    private final String url0 = "http://172.27.35.1:8080/AppServer/servlet/appServerServlet?DataType=0";
    private final String url1 = "http://172.27.35.1:8080/AppServer/servlet/appServerServlet?DataType=1";
    private final String url2 = "http://172.27.35.1:8080/AppServer/servlet/appServerServlet?DataType=2";
    private final String url3 = "http://172.27.35.1:8080/AppServer/servlet/appServerServlet?DataType=3";
    private final String url4 = "http://172.27.35.1:8080/AppServer/servlet/appServerServlet?DataType=4";
    private final String url5 = "http://172.27.35.1:8080/AppServer/servlet/appServerServlet?DataType=5";
    private final String url6 = "http://172.27.35.1:8080/AppServer/servlet/appServerServlet?DataType=6";
    private final String url7 = "http://172.27.35.1:8080/AppServer/servlet/appServerServlet?DataType=7";
    private final String url8 = "http://172.27.35.1:8080/AppServer/servlet/appServerServlet?DataType=8";
    private final String url9 = "http://172.27.35.1:8080/AppServer/servlet/appServerServlet?DataType=9";
    private final String url10 = "http://172.27.35.1:8080/AppServer/servlet/appServerServlet?DataType=10";
    private final String url11 = "http://172.27.35.1:8080/AppServer/servlet/appServerServlet?DataType=11";
    private final String url12 = "http://172.27.35.1:8080/AppServer/servlet/appServerServlet?DataType=12";

    private static List<WholeNetStatistic>                          mG_WholeNetSta;
    private static List<TotalSubstationStatisticsItem>              mG_TotalSubstationSta;
    private static List<Substation>                                 mG_Substation;
    private static List<FaultShortenData>                           mG_FaultShortenData;
    private static List<DevStation>                                 mG_DevStation;
    private static List<SecDev>                                     mG_SecDev;
    private static List<SettingDef>                                 mG_SettingDef;
    private static List<ZoneDef>                                    mG_ZoneDef;
    private static List<SgDef>                                      mG_SgDef;
    private static List<PtAction>                                   mG_PtAction;
    private static List<PtAlarm>                                    mG_PtAlarm;
    private static List<PtChange>                                   mG_PtChange;
    private static List<PtOsc>                                      mG_PtOsc;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ForTest
//     Button sendRequest =(Button)findViewById(R.id.button_login);
//     responseText= (TextView)findViewById(R.id.textview_user);
//     sendRequest.setOnClickListener(onClickListener);


//      Button btn_login = (Button)findViewById(R.id.button_login);
//      btn_login.setOnClickListener(new View.OnClickListener() {
//      public void onClick(View v){
//
//                //Get the input user Info
//                AutoCompleteTextView tv_username = (AutoCompleteTextView)findViewById(R.id.cardNumAuto);
//                cUser.setUsername(tv_username.getText().toString());
//
//                //Start the intent for the next scoop
//                startActivity(new Intent(MainActivity.this,ScopeChooseActivity.class));
//                finish();
//
//            }
//        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

        private View.OnClickListener onClickListener=new View.OnClickListener() {
        @Override
        public void onClick(View v){
            Toast.makeText(MainActivity.this,"Button点击事件1",Toast.LENGTH_LONG).show();

            if(v.getId()==R.id.button_login)
            {
                String urlSend = null;
                for(int i = 0 ; i < 12;i++)
                {
                    switch(i)
                    {
                        case 0:
                            urlSend = url0;
                            break;
                        case 1:
                            urlSend = url1;
                            break;
                        case 2:
                            urlSend = url2;
                            break;
                        case 3:
                            urlSend = url3;
                            break;
                        case 4:
                            urlSend = url4;
                            break;
                        case 5:
                            urlSend = url5;
                            break;
                        case 6:
                            urlSend = url6;
                            break;
                        case 7:
                            urlSend = url7;
                            break;
                        case 8:
                            urlSend = url8;
                            break;
                        case 9:
                            urlSend = url9;
                            break;
                        case 10:
                            urlSend = url10;
                            break;
                        case 11:
                            urlSend = url11;
                            break;
                        case 12:
                            urlSend = url12;
                            break;
                        default:
                            break;
                    }
                    sendRequestWithHttpURLConnection( urlSend );
                }
            }

            Log.i("Debug","Call func sendRequestWithHttpURLConnection");
        }
        private void sendRequestWithHttpURLConnection(String surl)
        {
            final String innerUrl = surl;
            new Thread(new Runnable()
            {
                public void run(){
                    try{
                        Log.i("Debug",innerUrl);
                       Log.i("Debug","Enter fucntion sendRequestWithHttpURLConnection");
                        OkHttpClient client = new OkHttpClient();
                        Log.i("Debug","1");
                        Request request = new Request.Builder().url(innerUrl).build();
                        Log.i("Debug","2");
                        Response response = client.newCall(request).execute();
                        Log.i("Debug","3");
                        String responseData = response.body().string();
                        Log.i("Debug","4 ");
                        parseJSONWithJSONObject(responseData,innerUrl);
                        Log.i("Debug",responseData);

                    }catch(Exception e) {
                        Log.i("Debug",e.getMessage());
                        e.printStackTrace();
                    }
                }
            }).start();
        }
        private void parseJSONWithJSONObject(String jsonData,String url)
        {
            JsonStringParser jsonParser = new JsonStringParser();

            try{
                Log.i("Debug","Enter function parseJSONWithJSONObject");
                if(url.indexOf("DataType=0") != -1)
                {
                      //处理网页0的结果
                    List<WholeNetStatistic> lst = jsonParser.parseJsonUrl0(jsonData);

                    int aa = 0;
                    aa++;
                }else if(url.indexOf("DataType=1") != -1)
                {
                    List<TotalSubstationStatisticsItem> lst = jsonParser.parseJsonUrl1(jsonData);

                    int aa = 0;
                    aa++;

                }else if(url.indexOf("DataType=2") != -1)
                {

                    List<Substation>  lst = jsonParser.parseJsonUrl2(jsonData);

                    int aa = 0;
                    aa++;
                }else if(url.indexOf("DataType=3") != -1)
                {/////////////////////////////////////
                    List<FaultShortenData> lst = jsonParser.parseJsonUrl3(jsonData);

                    int aa = 0;
                    aa++;
                }else if(url.indexOf("DataType=4") != -1)
                {
                    List<DevStation> lst = jsonParser.parseJsonUrl4(jsonData);

                    int aa = 0;
                    aa++;

                }else if(url.indexOf("DataType=5") != -1)
                {
                    List<SecDev>  lst = jsonParser.parseJsonUrl5(jsonData);

                    int aa = 0;
                    aa++;

                }else if(url.indexOf("DataType=6") != -1)
                {
                    List<SettingDef> lst = jsonParser.parseJsonUrl6(jsonData);

                    int aa = 0;
                    aa++;

                }else if(url.indexOf("DataType=7") != -1)
                {
                    List<ZoneDef> lst = jsonParser.parseJsonUrl7(jsonData);

                    int aa = 0;
                    aa++;

                }else if(url.indexOf("DataType=8") != -1)
                {
                    List<SgDef> lst = jsonParser.parseJsonUrl8(jsonData);

                    int aa = 0;
                    aa++;

                }else if(url.indexOf("DataType=9") != -1)
                {
                    List<PtAction> lst = jsonParser.parseJsonUrl9(jsonData);

                    int aa = 0;
                    aa++;

                }else if(url.indexOf("DataType=10") != -1)
                {
                    List<PtAlarm>  lst = jsonParser.parseJsonUrl10(jsonData);

                    int aa = 0;
                    aa++;

                }else if(url.indexOf("DataType=11") != -1)
                {
                    List<PtChange> lst = jsonParser.parseJsonUrl11(jsonData);

                    int aa = 0;
                    aa++;

                }else if(url.indexOf("DataType=12") != -1)
                {
                    List<PtOsc> lst = jsonParser.parseJsonUrl12(jsonData);

                    int aa = 0;
                    aa++;

                }

            }catch (Exception e){

                Log.e("Error","Unhandled Exception!");
                e.printStackTrace();
            }
        }

    };

    static class MyTask extends TimerTask {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        public MyTask() {
        }

        @Override
        public void run() {
            Log.i("My TimerTask","Please check the run loop!");
        }

    }
}
