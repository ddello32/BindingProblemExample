package com.example.dello.bindingproblem;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.dello.bindingproblem.databinding.LayoutWithIncludeBinding;
import com.example.dello.bindingproblem.databinding.LayoutWithoutIncludeBinding;

/**
 * Created by dello on 24/03/16.
 */
public class ActivityWithInclude extends AppCompatActivity{
    LayoutWithIncludeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.layout_with_include);
        binding.setVariable(new BindableClass("Breaking"));
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }
}
