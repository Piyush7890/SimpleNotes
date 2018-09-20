package com.piyush.rooooom;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import java.util.List;

public class Viewmodel extends AndroidViewModel {

private LiveData<List<Word>> words;
    private final Repository repository;

    Viewmodel(Application application)
    {
        super(application);
        this.repository= new Repository(application);
        words = repository.getAllWords();
    }

    public LiveData<List<Word>> getWords() {
        return words;
    }

    public void insert(Word word) { repository.insertWord(word); }

}
