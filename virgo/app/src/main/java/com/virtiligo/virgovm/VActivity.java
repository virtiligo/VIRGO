/**
 * Copyright (c) Bugra Kadirhan. All rights reserved.
 * See LICENSE file at root of the repository.
 */

package com.virtiligo.virgovm;

import android.support.v7.app.*;
import android.os.*;
import com.virtiligo.virgovm.*;
import com.virtiligo.virgovm.layouts.*;
import android.support.design.widget.*;
import android.view.*;
import android.support.v4.view.*;

public class VActivity extends AppCompatActivity
{
    // Main layout binding.
    MainLayout layout;
    
    @Override
    public void onCreate (Bundle savedInstanceState)
    {
        super.onCreate (savedInstanceState);
        layout = MainLayout.bind(this.getWindow());
        
        // Set action bar.
        setSupportActionBar(layout.getToolbar());
        
        // Set up navigation.
        setUpNavigation();
        
        // Set up FAB.
        setUpFab();
    }
    
    // TODO: Factor away these code blocks. They look ugly!

    @Override
    public boolean onOptionsItemSelected (MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == android.R.id.home) {
            layout.getDrawer().openDrawer(GravityCompat.START);
        }
        return super.onOptionsItemSelected(item);
    }
    
    private void setUpNavigation()
    {
        ActionBar supportActionBar = getSupportActionBar();
        
        if (supportActionBar != null)
        {
            supportActionBar.setHomeAsUpIndicator(R.drawable.idd_menu_white_24_dp);
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        
        // Set navigation behavior.
        layout.getNavigationView().setNavigationItemSelectedListener(
            new NavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(MenuItem menuItem)
                {
                    menuItem.setChecked(true);
                    // TODO: Handle navigation
                    layout.getDrawer().closeDrawers();
                    return true;
                }
            }
        );
    }
    
    private void setUpFab()
    {
        FloatingActionButton fab = layout.getFloatingActionButton();
        fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Snackbar.make(v, "Hello Snackbar!",
                                  Snackbar.LENGTH_LONG).show();
                }
            });
    }
}
