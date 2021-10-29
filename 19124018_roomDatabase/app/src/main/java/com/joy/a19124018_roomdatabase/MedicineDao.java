package com.joy.a19124018_roomdatabase;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;


@Dao

public interface MedicineDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(database database);




    //@Insert(onConflict = OnConflictStrategy.REPLACE)
    //void insert(database Database);

    @Delete
    void delete(database Database);




    @Query("SELECT * FROM med_table")
    List<database> getAll();




}
