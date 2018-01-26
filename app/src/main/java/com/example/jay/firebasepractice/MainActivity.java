package com.example.jay.firebasepractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.jay.firebasepractice.DataModel.OpenSourceDataModel;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference firebaseDatabase;
    private FirebaseDatabase firebaseInstance;

    private static final String OPEN_SOURCE_DATA_MODEL = "OpenSourceDataModel";

    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firebaseInstance = FirebaseDatabase.getInstance();

        // enable offline retrieving
        firebaseInstance.setPersistenceEnabled(true);

        // get reference to 'OpenSourceDataModel'
        firebaseDatabase = FirebaseDatabase.getInstance().getReference(OPEN_SOURCE_DATA_MODEL);
        Log.d("MainActivity : ", "firebase ; " + firebaseDatabase.toString());

        firebaseDatabase.child(OPEN_SOURCE_DATA_MODEL).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Log.d("onDataChange : " , dataSnapshot.toString());
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }
}
