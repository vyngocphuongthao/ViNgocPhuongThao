package com.example.student.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btntong;
    Button btnhieu;
    Button btnthuong;
    Button btntich;
    Button btnthoat;
    EditText numa, numb;
    TextView txtview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numa=(EditText) findViewById(R.id.numa);
        numb=(EditText) findViewById(R.id.numb);
        btntong=(Button) findViewById(R.id.btntong);
        btnhieu=(Button) findViewById(R.id.btnhieu);
        btntich=(Button) findViewById(R.id.btntich);
        btnthuong=(Button) findViewById(R.id.btnthuong);
        btnthoat=(Button) findViewById(R.id.btnthoat);
        txtview=(TextView) findViewById(R.id.txtview);
    }
    public void Tinh (View v){
        int a,b;
        float ketqua;
        switch (v.getId()){
            case R.id.btntong:
                ketqua=Float.parseFloat(numa.getText().toString())+Float.parseFloat(numb.getText().toString());
                txtview.setText(""+ketqua);
                break;
            case R.id.btnhieu:
                ketqua=Float.parseFloat(numa.getText().toString())-Float.parseFloat(numb.getText().toString());
                txtview.setText(""+ketqua);
                break;
            case R.id.btntich:
                ketqua=Float.parseFloat(numa.getText().toString())*Float.parseFloat(numb.getText().toString());
                txtview.setText(""+ketqua);
                break;
            case R.id.btnthuong:
                ketqua=Float.parseFloat(numa.getText().toString())/Float.parseFloat(numb.getText().toString());
                txtview.setText(""+ketqua);
                break;
            case R.id.btnthoat:
                finish();
        }
    }
}
