package com.feideng.chooseyourownadventuremvpgameengine.model;

/**
 * Created by feideng on 8/30/15.
 */
public class PassageInfo {
    private String title;
    private String content;
    private PassageInfo nextPassge;
    private boolean isStart;
    private boolean isExist;

    public PassageInfo() {
        isExist = false;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }

    public void setNextPassge(PassageInfo nextPassge) {
        this.nextPassge = nextPassge;
        isExist = false;
    }

    public PassageInfo getNextPassge() {
        if (!isExist) {
            return this.nextPassge;
        }
        else {
            return null;
        }
    }

    public void setStart() {
        isStart = true;
    }

    public void setExist() {
        isExist = true;
    }
}
