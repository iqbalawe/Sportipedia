package iqbal.app.test.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import iqbal.app.test.BadmintonActivity;
import iqbal.app.test.FutsalActivity;
import iqbal.app.test.R;

public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        ImageButton imgBtnFutsal = (ImageButton) view.findViewById(R.id.img_btn_futsal);
        ImageButton imgBtnBultang = (ImageButton) view.findViewById(R.id.img_btn_bultang);

        imgBtnFutsal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentFutsal = new Intent(getActivity(), FutsalActivity.class);
                startActivity(intentFutsal);
            }
        });

        imgBtnBultang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentFutsal = new Intent(getActivity(), BadmintonActivity.class);
                startActivity(intentFutsal);
            }
        });

        return view;
    }
}
