package com.londonappbrewery.quizzler;

/**
 * Created by Kanishk on 29-05-2017.
 */

public class TrueFalse {
    private int mQuestionId;
    private boolean mAnswer;

    public TrueFalse(int questionResourceID, boolean trueOrFalse)
    {
        mQuestionId = questionResourceID;
        mAnswer = trueOrFalse;
    }

    public int getQuestionId() {
        return mQuestionId;
    }

    public void setQuestionId(int questionId) {
        mQuestionId = questionId;
    }

    public boolean isAnswer() {
        return mAnswer;
    }

    public void setAnswer(boolean answer) {
        mAnswer = answer;
    }
}
