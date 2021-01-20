package com.example.dagger_login.ui.main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.dagger_login.BaseActivity;
import com.example.dagger_login.R;
import com.example.dagger_login.ui.main.posts.PostsFragment;
import com.example.dagger_login.ui.main.profile.ProfileFragment;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testFragment();
    }

    private void testFragment() {
        //todo as Note: you can replace "new PostsFragment()" with "new ProfileFragment()" to view the profile
        getSupportFragmentManager().beginTransaction().replace(R.id.main_container,
                new PostsFragment()).commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.logout: {
                sessionManager.logOut();
                return true;
            }
        }
        return super.onOptionsItemSelected(item);

    }
}