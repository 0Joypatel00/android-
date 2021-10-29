package com.joy.a19124018_roomdatabase;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "med_table")
public class database {

    @ColumnInfo(name = "UID")
    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = "Medcine Name")
    private String title;
    @ColumnInfo(name = "Medcine Reaction")
    private String discription;

    public database(String title, String discription) {
        this.title = title;
        this.discription = discription;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }



}
