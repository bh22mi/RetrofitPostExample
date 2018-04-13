package com.example.bhoomi.retrofitpostexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import retrofit2.Call;
import retrofit2.Callback;

public class MainActivity extends AppCompatActivity {

    private APIService apiService;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apiService = APIUtils.getAPIService();

        loadData();
    }

    private void loadData() {

        apiService.getData("testworkbench@yahoo.com","123456").enqueue(new Callback<Response>() {

            @Override
            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {

                if (response.isSuccessful())
                {
                    System.out.println("datarespo "+ response.body().getStatus() + " "
                                                    + response.body().getMessage() + " "
                                                    + response.body().getUserInfo().get(0).getEmail() + " "
                                                    + response.body().getUserInfo().get(0).getUsername() + " "
                                                    + response.body().getUserInfo().get(0).getUserType() + " "
                                                    + response.body().getUserInfo().get(0).getMemberId() + " "
                                                    + response.body().getUserInfo().get(0).getPassword() + " "
                                                    + response.body().getUserInfo().get(0).getPhone());
                }
            }

            @Override
            public void onFailure(Call<Response> call, Throwable t) {

            }
        });
    }
}
