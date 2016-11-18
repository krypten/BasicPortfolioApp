package com.cyril.udacity.appportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Add all buttons
        Map<Integer, Integer> map = new HashMap<>();
        map.put(R.id.popular_movies_button, R.string.popular_movies);
        map.put(R.id.stock_hawk_button, R.string.stock_hawk);
        map.put(R.id.build_it_bigger_button, R.string.build_it_bigger);
        map.put(R.id.make_your_app_button, R.string.make_your_app);
        map.put(R.id.go_ubiquitous_button, R.string.go_ubiquitous);
        map.put(R.id.capstone_button, R.string.capstone);
        // Attach toasts
        for (final Map.Entry<Integer, Integer> entry : map.entrySet()) {
            this.findViewById(entry.getKey()).setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View view) {
                    final Toast toast = Toast.makeText(getApplicationContext(), "This button will launch " + getResources().getString(entry.getValue()).toLowerCase(), Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.BOTTOM, 0, 0);
                    toast.show();
                }
            });
        }
    }
}
