package com.kalvinkao.guideforvalorant.ui.agents;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AgentsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AgentsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}