package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.AdapterView;
import android.view.View;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.app.Activity;
import android.content.Intent;
import android.widget.Button;
import java.util.ArrayList;
import java.util.List;

public class SpinnerInRecyclerView extends Activity implements AdapterView.OnItemSelectedListener {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_in_recycler_view);

        final Spinner spinner = (Spinner) findViewById(R.id.idSpinner);
        Button button=(Button)findViewById(R.id.btnNext);

        spinner.setOnItemSelectedListener(this);

        List<String> categories = new ArrayList<String>();
        categories.add("Item 1");
        categories.add("Item 2");
        categories.add("Item 3");
        categories.add("Item 4");
        categories.add("Item 5");
        categories.add("Item 6");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(SpinnerInRecyclerView.this,SecondActivity.class);
                intent.putExtra("data",String.valueOf(spinner.getSelectedItem()));
                startActivity(intent);
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String item = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
    }

    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }
}


//public class SpinnerInRecyclerView extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
//
//    String[] languages = {"C", "Java", "Python", "Rubby", "Android", "OS", "DSA with java", "DBMS"};
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_spinner_in_recycler_view);
//
//        Spinner idSpinner = findViewById(R.id.idSpinner);
//        idSpinner.setOnItemSelectedListener(this);
//
//        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, languages);
//
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        idSpinner.setAdapter(adapter);
//    }
//
//    @Override
//    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
//        Toast.makeText(getApplicationContext(), languages[i], Toast.LENGTH_LONG).show();
//    }
//
//    @Override
//    public void onNothingSelected(AdapterView<?> adapterView) {
//
//    }
//}



