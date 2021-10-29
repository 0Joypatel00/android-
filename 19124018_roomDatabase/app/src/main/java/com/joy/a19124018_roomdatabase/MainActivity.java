package com.joy.a19124018_roomdatabase;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText dis, title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dis = findViewById(R.id.dis);
        title = findViewById(R.id.title);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menusave, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId() == R.id.savebtn){

            Toast.makeText(MainActivity.this, "Save Clicked", Toast.LENGTH_SHORT).show();
            savedata();

        }

        return super.onOptionsItemSelected(item);
    }

    public void savedata(){

    String titledata = title.getText().toString();
    String dissdata = dis.getText().toString();

    database database = new database(titledata, dissdata);

    AppDatabase.databaseWriteExecutor.execute(() -> AppDatabase.getInstance(getApplicationContext()).medicineDao().insert(database));

    Toast.makeText(MainActivity.this, "Done", Toast.LENGTH_SHORT).show();


    }
}