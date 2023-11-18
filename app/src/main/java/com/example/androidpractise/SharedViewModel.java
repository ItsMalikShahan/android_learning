package com.example.androidpractise;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SharedViewModel extends ViewModel {

    private MutableLiveData<CharSequence> text = new MutableLiveData<>();

    public void setData(CharSequence updatedText) {
        text.setValue(updatedText);
    }

    public LiveData<CharSequence> getData() {
        return text;
    }
}
