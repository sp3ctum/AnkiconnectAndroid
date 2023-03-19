package com.kamwithk.ankiconnectandroid.routing.database;

import androidx.room.Dao;
import androidx.room.Query;

@Dao
public interface AudioFileEntryDao {
    @Query("SELECT data FROM android WHERE file = :file AND source = :source")
    public byte[] getData(String file, String source);
}
