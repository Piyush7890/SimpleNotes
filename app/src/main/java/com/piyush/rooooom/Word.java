package com.piyush.rooooom;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "Words")
public class Word {

    public String getWord() {
        return word;
    }

    public void setWord(@NonNull String word) {
        this.word = word;
    }
    @PrimaryKey
    @ColumnInfo(name = "word")
    @NonNull
    private String word;

    public Word(String word) {
        this.word = word;
    }
}
