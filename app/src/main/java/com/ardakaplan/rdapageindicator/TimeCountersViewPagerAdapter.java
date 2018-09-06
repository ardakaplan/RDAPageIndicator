package com.ardakaplan.rdapageindicator;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ardakaplan.rdalibrary.ui.adapters.GeneralPagerAdapter;
import com.ardakaplan.rdapageindicator.R;

import java.util.ArrayList;


/**
 * Created by ardakaplan on 18/07/16.
 * <p/>
 * www.ardakaplan.com
 * <p/>
 * arda.kaplan09@gmail.com
 */
public class TimeCountersViewPagerAdapter extends GeneralPagerAdapter<String> {

    public TimeCountersViewPagerAdapter(Activity activity, ArrayList<String> arrayList) {
        super(activity, arrayList, R.layout.item_viewpager);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        View layoutView = (View) super.instantiateItem(container, position);

        String importantDate = getItem(position);

        TextView backgroundImageView = layoutView.findViewById(R.id.item_viewpager_textview);

        backgroundImageView.setText("" + position);

        return layoutView;
    }


}