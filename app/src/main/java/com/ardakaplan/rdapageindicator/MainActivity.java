package com.ardakaplan.rdapageindicator;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.viewpagerindicator.CirclePageIndicator;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private CirclePageIndicator circlePageIndicator;

    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.time_counters_viewpager);
        circlePageIndicator = findViewById(R.id.time_counters_circlepageindicator);

        ArrayList<String> sds = new ArrayList<>();

        sds.add("asdasda");
        sds.add("asdasda");
        sds.add("asdasda");
        sds.add("asdasda");
        sds.add("asdasda");

        viewPager.setAdapter(new TimeCountersViewPagerAdapter(this, sds));

        circlePageIndicator.setViewPager(viewPager);
    }
}
