package iqbal.app.test;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import iqbal.app.test.adapter.ContainerAdapter;
import iqbal.app.test.fragment.HomeFragment;
import iqbal.app.test.fragment.ProfileFragment;

public class MainActivity extends AppCompatActivity {

    private ContainerAdapter adapter;
    private BottomNavigationView navigationView;
    private ViewPager vp;
    private Button bookFutsal, bookBadminton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vp = (ViewPager) findViewById(R.id.container);
        navigationView = (BottomNavigationView) findViewById(R.id.navigationView);
        bookFutsal = (Button) findViewById(R.id.btn_arena);
        bookBadminton = (Button) findViewById(R.id.btn_gsc);

        setContainerPrepared();
        onButtonClicked();
    }

    private void setContainerPrepared() {
        adapter = new ContainerAdapter(getSupportFragmentManager());
        adapter.addFragment(new HomeFragment(), getString(R.string.title_home));
        adapter.addFragment(new ProfileFragment(), getString(R.string.title_profile));
        vp.setAdapter(adapter);
    }

    private void onButtonClicked() {
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.navigation_home:
                        vp.setCurrentItem(0);
                        break;
                    case R.id.navigation_profile:
                        vp.setCurrentItem(1);
                        break;
                }
                return false;
            }
        });
    }
}
