package com.example.asynchtask;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.ListView;

import java.util.ArrayList;

public class StudentAsyncTask extends AsyncTask <Void,Void, ArrayList<Student>>{
    private Context context;
    private ListView listView;
    public StudentAsyncTask (Context context, ListView listView) {
        this.context = context;
        this.listView = listView;
    }
    @Override
    protected void onPostExecute(ArrayList<Student> students) {
        super.onPostExecute(students);
        StudentAdapter studentAdapter = new StudentAdapter(context, students);
        listView.setAdapter(studentAdapter);
    }

    @Override
    protected ArrayList<Student> doInBackground(Void... voids) {
        StudentDao studentDao = new StudentDao();
        return studentDao.getAllStudents();
    }
}
