package com.example.kritesh.restaurant_data_api;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="tagg" ;
    private EditText fname;
    private EditText lname;
    private EditText phno;
    private EditText add;
    private EditText res_name;
    private Spinner rest_type;
    private APIrefrence apIrefrence;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fname = findViewById(R.id.fname);
        lname = findViewById(R.id.lname);
        phno = findViewById(R.id.phno);
        add = findViewById(R.id.add);
        res_name = findViewById(R.id.Restname);
        rest_type = findViewById(R.id.spinner1);
        String[] rt  =new String[]{"Owner","Manager","Other"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,rt);
        rest_type.setAdapter(adapter);
        apIrefrence = APIutilities.getAPIService();
    }

    public void submit(View view) {
        String f_name = fname.getText().toString().trim();
        String l_name = lname.getText().toString().trim();
        String ph_name = phno.getText().toString().trim();
        String addres = add.getText().toString().trim();
        String resname = res_name.getText().toString().trim();
        String resttype = rest_type.getSelectedItem().toString().trim();
        Log.i("krish", "datafetched" + f_name+l_name+ph_name+addres+resname+resttype);



        if(!TextUtils.isEmpty(f_name) && !TextUtils.isEmpty(l_name) 
                && !TextUtils.isEmpty(ph_name) && !TextUtils.isEmpty(addres)
                && !TextUtils.isEmpty(resname) && !TextUtils.isEmpty(resttype)) {
            sendPost(f_name,l_name,ph_name,addres,resname,resttype);
        }


    }

    private void sendPost(String f_name, String l_name, String ph_name, String addres, String resname, String resttype) {
        apIrefrence.savePost(f_name,l_name,ph_name,addres,resname,resttype,1).enqueue(new Callback<Post>() {
            @Override
            public void onResponse(Call<Post> call, Response<Post> response) {

                if(response.isSuccessful()) {
                    showResponse(response.body().toString());
                    Log.i(TAG, "post submitted to API." + response.body().toString());
            }
            }

            @Override
            public void onFailure(Call<Post> call, Throwable t) {
                Log.e(TAG, "Unable to submit post to API.");
            }
        });
    }

    public void showResponse(String response) {
        Toast.makeText(this, ""+response, Toast.LENGTH_SHORT).show();

    }
}
