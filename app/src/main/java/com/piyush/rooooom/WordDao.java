package com.piyush.rooooom;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao

public interface WordDao {


    @Insert
    void insert(Word word);

    @Query("DELETE  FROM Words")
    void deleteAll();

    @Query("SELECT * from Words ORDER BY word ASC")
    LiveData<List<Word>> getAllWords();

}
