package com.feideng.chooseyourownadventuremvpgameengine.model;

/**
 * Created by feideng on 8/30/15.
 */
public class PassageModelImpl implements PassageModel {
    private PassageInfo passageInfo = new PassageInfo();

    @Override
    public void setPassge(PassageInfo passageInfo) {
        this.passageInfo = passageInfo;
    }

    @Override
    public PassageInfo getPassage() {
        return this.passageInfo;
    }
}
