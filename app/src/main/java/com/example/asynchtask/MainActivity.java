package com.example.asynchtask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
private ListView studentList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        studentList = (ListView) this.findViewById(R.id.student);

        StudentAsyncTask studentAsyncTask = new StudentAsyncTask(this, studentList);
        studentAsyncTask.execute();
    }
}