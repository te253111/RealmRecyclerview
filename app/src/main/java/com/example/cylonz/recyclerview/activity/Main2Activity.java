package com.example.cylonz.recyclerview.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.cylonz.recyclerview.R;
import com.example.cylonz.recyclerview.model.User;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class Main2Activity extends AppCompatActivity {
    private EditText id;
    private EditText name;
    private EditText age;
    private Button btn;
    Realm realm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        realm = Realm.getDefaultInstance();

        id= (EditText) findViewById(R.id.edid);
        name= (EditText) findViewById(R.id.edname);
        age= (EditText) findViewById(R.id.edage);
        btn = (Button) findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                realm.executeTransaction(new Realm.Transaction() {
                    @Override
                    public void execute(Realm realm) {
                        User user = realm.createObject(User.class); // Create a new object
                        user.setId(id.getText().toString());
                        user.setName(name.getText().toString());
                        user.setAge(age.getText().toString());
                    }
                });
                finish();
            }
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        realm.close();
    }
}
