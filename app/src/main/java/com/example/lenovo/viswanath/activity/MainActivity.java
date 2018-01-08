package com.example.lenovo.viswanath.activity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.example.lenovo.viswanath.R;
import com.example.lenovo.viswanath.adapter.ShowData;
import com.example.lenovo.viswanath.inter.ApiInterface;
import com.example.lenovo.viswanath.model.Data;
import com.example.lenovo.viswanath.model.Status;
import com.example.lenovo.viswanath.utility.DBHelper;

import java.util.ArrayList;
import java.util.List;

import okhttp3.MediaType;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    List<Data> data;
    RecyclerView recyclerView;
    final public static Integer STATUS_FAILED = 3;
    final public static Integer STATUS_SUCCESS = 1;
    final public static Integer STATUS_ = 0;
    public static final MediaType MEDIA_TYPE = MediaType.parse("application/json");
    ShowData showData;
    DBHelper db_obj;
    List<Data> dbdata = new ArrayList<>();
    public static String att = "{\"sector\":\"all\",\"lead_status\":\"all\",\"opportunity_type\":\"all\"}";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        data = new ArrayList<>();
        db_obj = new DBHelper(MainActivity.this);
        LoadData();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        final RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        dbdata = db_obj.GetListObj();
        showData = new ShowData(MainActivity.this, dbdata);
        recyclerView.setAdapter(showData);
    }


    private void LoadData() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://shelllogic.isteer.co/")
                .addConverterFactory(GsonConverterFactory.create()).build();

        ApiInterface apiInterface = retrofit.create(ApiInterface.class);
        final ProgressDialog progressDoalog;
        progressDoalog = new ProgressDialog(this);
        progressDoalog.setMax(100);
        progressDoalog.setMessage("Its loading....");
        progressDoalog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progressDoalog.show();
        Call<Status> call = apiInterface.GetData(428, "https://shelllogic.isteer.co/restphp/lead/fetchDSRLeads", "1btj7svbktoj49uvvoit4hvse1", att);
        Log.d("tag1", "message");
        call.enqueue(new Callback<Status>() {
            @Override
            public void onResponse(@NonNull Call<Status> call, @NonNull Response<Status> response) {
                Log.d("Amushahu-Success", response.message());
                if (response.isSuccessful()) {
                    Status sd = response.body();
                    Toast.makeText(MainActivity.this, sd.getStatus().toString(), Toast.LENGTH_SHORT).show();
                    Log.d("Statusdata", String.valueOf(sd));
                    if (sd.getStatus().equals(STATUS_SUCCESS)) {
                        try {
                            List<Data> sampleData = fetchResults(response);
                            Log.d("Entered List", "proceeded");
                            if (sampleData != null && sampleData.size() > 0) {
                                for (Data ghg : sampleData) {
                                    data.add(ghg);
                                    db_obj.insert(ghg.getId(),ghg.getRegion_name(),ghg.getCluster_name(),ghg.getDistributor_name());
                                }
                                showData.notifyDataSetChanged();
                            }
                            System.out.println("ArraySize" + data.size());
                        } catch (Exception e) {
                            e.getStackTrace();
                            e.printStackTrace();
                        }
                    } else if (sd.getStatus().equals(STATUS_FAILED)) {
                        Toast.makeText(MainActivity.this, sd.getStatus().toString(), Toast.LENGTH_SHORT).show();
                    } else if (sd.getStatus().equals(STATUS_)) {
                        Toast.makeText(MainActivity.this, sd.getStatus().toString(), Toast.LENGTH_SHORT).show();
                    }
                }
                progressDoalog.dismiss();
            }

            @Override
            public void onFailure(@NonNull Call<Status> call, Throwable t) {
                t.getStackTrace();
                t.printStackTrace();
                progressDoalog.dismiss();
                Log.v("Amushahu-Error", "No Response!");
            }
        });
    }

    /**
     * @param response extracts List<{@link Data>} from response
     * @return
     */
    private List<Data> fetchResults(Response<Status> response) {
        Status status = response.body();
        assert status != null;
        status.getData().getClass().getName();
        return status.getData();
    }
}
