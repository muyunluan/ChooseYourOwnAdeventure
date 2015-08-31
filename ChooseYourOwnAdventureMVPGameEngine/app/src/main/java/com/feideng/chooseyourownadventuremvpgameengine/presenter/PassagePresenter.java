package com.feideng.chooseyourownadventuremvpgameengine.presenter;

import android.util.Log;

import com.feideng.chooseyourownadventuremvpgameengine.model.PassageInfo;
import com.feideng.chooseyourownadventuremvpgameengine.model.PassageModelImpl;
import com.feideng.chooseyourownadventuremvpgameengine.view.PassageView;

import java.util.ArrayList;

/**
 * Created by feideng on 8/30/15.
 */
public class PassagePresenter {

    private PassageModelImpl mPassageModel;
    private PassageView mPassageView;

    private ArrayList<PassageModelImpl> mPassageList = new ArrayList<>();

    public PassagePresenter(PassageView passageView) {
        mPassageView = passageView;
        mPassageModel = new PassageModelImpl();
    }

    public void addPassage(PassageInfo passageInfo) {
        mPassageModel.setPassge(passageInfo);
        mPassageList.add(mPassageModel);
    }

    public void getPassages() {
        ArrayList<PassageInfo> mPassages = new ArrayList<>();
        for (PassageModelImpl passageModel : mPassageList) {
            mPassages.add(passageModel.getPassage());
        }
        mPassageView.getTitles(mPassages);
        Log.i("","size: " + mPassages.size());
    }

    public void getStartPassage() {

    }

    public void getNextPassage(PassageInfo passageInfo) {
        PassageInfo nextPassage = passageInfo.getNextPassge();
        mPassageView.getNextPassage(nextPassage);
    }


}
