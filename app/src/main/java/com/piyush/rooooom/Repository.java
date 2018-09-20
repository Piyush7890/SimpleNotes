package com.piyush.rooooom;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;

import java.util.List;

public class Repository {

    private WordDao mWordDao;
    private LiveData<List<Word>> mAllWords;

    private final Application application;

    public Repository(Application application) {
        this.application = application;
        WordRoomDatabase db = WordRoomDatabase.getDatabase(application);
        mWordDao = db.wordDao();
        mAllWords=mWordDao.getAllWords();
    }

    LiveData<List<Word>> getAllWords() {
        return mAllWords;
    }

    public void insertWord(Word word)
    {
        new Task(mWordDao).execute(word);
    }

    public static class Task extends AsyncTask<Word, Void, Void>{

        private final WordDao dao;

         Task(WordDao dao) {
            this.dao = dao;
        }

        @Override
        protected Void doInBackground(Word... voids) {
            dao.insert(voids[0]);
            return null;
        }
    }

}
