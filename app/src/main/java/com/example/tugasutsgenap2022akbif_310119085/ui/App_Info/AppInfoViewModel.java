package com.example.tugasutsgenap2022akbif_310119085.ui.App_Info;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AppInfoViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AppInfoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is notifications fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}