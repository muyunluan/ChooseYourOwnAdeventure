package com.feideng.chooseyourownadventuremvpgameengine.view;

import com.feideng.chooseyourownadventuremvpgameengine.model.PassageInfo;

import java.util.ArrayList;

/**
 * Created by feideng on 8/30/15.
 */
public interface PassageView {

    PassageInfo addPassage();

    void getTitles(ArrayList<PassageInfo> passageInfos);

    void getPassageInfo(PassageInfo passageInfo);

    void getStartPassage(PassageInfo startPassage);

    void getNextPassage(PassageInfo nextPassage);

}
