/**
 * Copyright (c) Bugra Kadirhan. All rights reserved.
 * See LICENSE file at root of the repository.
 */

package com.virtiligo.virgovm.layouts;

import com.virtiligo.virgovm.*;
import android.support.v7.widget.*;
import android.view.*;
import android.content.*;
import android.support.v4.widget.*;
import android.support.design.widget.*;

/**
 * Binds idl_main to views.
 */
public class MainLayout
{
    /**
     * Original layout id.
     */
    public static final int ID = R.layout.idl_main_two;
    
    /**
     * Views here.
     */
    private Toolbar _toolBar;
    private DrawerLayout _drawerLayout;
    private NavigationView _navigationView;
    private FloatingActionButton _fab;
    
    /**
     * Main context here.
     */
    private Window _viewGroup;
    
    /**
     * Initialize from view group.
     */
    public MainLayout(Window mainView)
    {
        _viewGroup = mainView;
        _toolBar = (Toolbar) mainView.findViewById(R.id.idl_main_toolbar);
        _drawerLayout = (DrawerLayout) mainView.findViewById(R.id.idl_main_drawer);
        _navigationView = (NavigationView) mainView.findViewById(R.id.idl_main_nav_view);
        _fab = (FloatingActionButton) mainView.findViewById(R.id.idl_main_fab);
    }
    
    /**
     * Get main view group.
     */
    public Window getViewGroup()
    {
        return _viewGroup;
    }
    
    /**
     * View getters.
     */
    public Toolbar getToolbar()
    {
        return _toolBar;
    }
    
    public DrawerLayout getDrawer()
    {
        return _drawerLayout;
    }
    
    public NavigationView getNavigationView()
    {
        return _navigationView;
    }
    
    public FloatingActionButton getFloatingActionButton()
    {
        return _fab;
    }
    
    /**
     * UTILITY: For inflating and binding the layout.
     */
    public static MainLayout bind(Window self)
    {
        self.setContentView(ID);
        MainLayout Me = new MainLayout(self);
        return Me;
    }
}
