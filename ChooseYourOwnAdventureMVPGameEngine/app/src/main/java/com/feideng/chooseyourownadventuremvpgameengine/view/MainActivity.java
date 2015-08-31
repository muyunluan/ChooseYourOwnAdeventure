package com.feideng.chooseyourownadventuremvpgameengine.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.feideng.chooseyourownadventuremvpgameengine.R;
import com.feideng.chooseyourownadventuremvpgameengine.model.PassageInfo;
import com.feideng.chooseyourownadventuremvpgameengine.presenter.PassagePresenter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements PassageView, View.OnClickListener {

    /*
    TODO: 1. Create ListView to list the title of all passages
    TODO: 2. Click each title will show the window to edit it
    TODO: 3. Implement Play mode
    */

    private PassagePresenter passagePresenter;
    private Button editButton, playButton;
    private TextView titlesTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        editButton = (Button)findViewById(R.id.button);
        playButton = (Button)findViewById(R.id.button2);

        titlesTextView = (TextView)findViewById(R.id.textView3);

        passagePresenter = new PassagePresenter(this);
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

    @Override
    public PassageInfo addPassage() {
        //Test Data Only
        PassageInfo passageInfo = new PassageInfo();
        passageInfo.setTitle("test1");
        passageInfo.setContent("text2");
        passageInfo.setStart();

        PassageInfo nextPassage = new PassageInfo();
        nextPassage.setTitle("test2");
        nextPassage.setContent("text2");
        nextPassage.setExist();

        return passageInfo;
    }

    @Override
    public void getTitles(ArrayList<PassageInfo> passageInfos) {
        String titles = "";
        for (PassageInfo passageInfo : passageInfos) {
            titles += passageInfo.getTitle() + "\n";
        }
        titlesTextView.setText(titles);
    }

    @Override
    public void getPassageInfo(PassageInfo passageInfo) {
        //TODO: Display the content of selected PasssgeInfo
        String c = passageInfo.getContent();
    }

    @Override
    public void getStartPassage(PassageInfo startPassage) {

    }

    @Override
    public void getNextPassage(PassageInfo nextPassage) {
        PassageInfo next = nextPassage;
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                passagePresenter.addPassage(addPassage());
                break;
            case R.id.button2:
                passagePresenter.getPassages();
                break;
        }
    }
}
