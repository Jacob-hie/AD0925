package com.hie2j.ad0925;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class AD0925 extends AppCompatActivity {

    private long lastPressedtime = 0;
    private final String TAG = "AD0925";
    private ListView namelistView;
    private ArrayList<Student> studentArrayList = new ArrayList<>();
    private String[] nameArr = {"波比","赛恩","奥恩","盖伦","提莫",
            "波比","赛恩","奥恩","盖伦","提莫","波比","赛恩","奥恩","盖伦","提莫",
            "波比","赛恩","奥恩","盖伦","提莫","波比","赛恩","奥恩","盖伦","提莫"};
    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.e(TAG,"onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad0925);

        //添加学生
        insertStudent();

        namelistView = findViewById(R.id.name_list_item);

        //自定义适配器
        adapter = new MyAdapter(studentArrayList,AD0925.this);

//        adapter = new ArrayAdapter<String>(
//                AD0925.this,
//                R.layout.my_list_item,
//                nameArr
//        );
        namelistView.setAdapter(adapter);
    }

    private void insertStudent() {
        Student s1 = new Student(R.drawable.dog1,"张一",18);
        Student s2 = new Student(R.drawable.dog2,"张二",19);
        Student s3 = new Student(R.drawable.dog3,"张三",20);
        Student s4 = new Student(R.drawable.dog4,"张四",21);
        Student s5 = new Student(R.drawable.dog5,"张五",22);
        studentArrayList.add(s1);
        studentArrayList.add(s2);
        studentArrayList.add(s3);
        studentArrayList.add(s4);
        studentArrayList.add(s5);
        studentArrayList.add(s1);
        studentArrayList.add(s2);
        studentArrayList.add(s3);
        studentArrayList.add(s4);
        studentArrayList.add(s5);
        studentArrayList.add(s1);
        studentArrayList.add(s2);
        studentArrayList.add(s3);
        studentArrayList.add(s4);
        studentArrayList.add(s5);

    }


    @Override
    //设置再按一次返回
    public void onBackPressed() {
        Log.e(TAG,"onBackPressed");
        long currentPressedtime = System.currentTimeMillis();
        if(currentPressedtime - lastPressedtime >2000){
            Toast.makeText(AD0925.this,"再按一次退出",Toast.LENGTH_SHORT).show();
            lastPressedtime = currentPressedtime;
        }else{
            super.onBackPressed();
        }
    }
}
