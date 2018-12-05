package com.example.user.geoquiz2;

public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;

    public Question(int textResId, boolean answerTrue){
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }

    public int getmTextResId(){
        return mTextResId;
    }

    public void setTestResId(int testResId){
        mTextResId = testResId;
    }

    public boolean ismAnswerTrue() {
        return mAnswerTrue;
    }

    public void setmAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
