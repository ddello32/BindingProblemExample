package com.example.dello.bindingproblem;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.dello.bindingproblem.databinding.LayoutWithoutIncludeBinding;


public class ActivityWithoutInclude extends AppCompatActivity {
    LayoutWithoutIncludeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.layout_without_include);
        binding.setVariable(new BindableClass("Hello World"));
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityWithoutInclude.this, ActivityWithInclude.class));
            }
        });
        setSupportActionBar(toolbar);
    }
}
