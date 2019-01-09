package iqbal.app.test.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ContainerAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> fragments = new ArrayList<>();
    private List<String> labels = new ArrayList<>();

    public ContainerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int i) {
        return fragments.get(i);
    }

    public void addFragment(Fragment fragment, String label) {
        fragments.add(fragment);
        labels.add(label);
    }

    public String getLabel(int position) {
        return labels.get(position);
    }


    @Override
    public int getCount() {
        return fragments.size();
    }
}
