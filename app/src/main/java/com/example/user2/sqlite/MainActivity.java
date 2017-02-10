package com.example.user2.sqlite;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView textView ;
    ListView listView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // textView = (TextView) findViewById(R.id.display);
        listView = (ListView) findViewById(R.id.all);
        My_DatabaseHandler my_databaseHandler = new My_DatabaseHandler(this);

        Log.i("Insert ", "Inserting...");
        my_databaseHandler.addContacts(new Contacts("John",     "0755550500606"));
        my_databaseHandler.addContacts(new Contacts("Amos",     "0750555506666"));
        my_databaseHandler.addContacts(new Contacts("Jackline", "07505006555606"));

       }
}
