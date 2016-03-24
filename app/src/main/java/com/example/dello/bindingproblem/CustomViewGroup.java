package com.example.dello.bindingproblem;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import com.example.dello.bindingproblem.databinding.CustomViewGroupBinding;


public class CustomViewGroup extends LinearLayout {
    private boolean alreadyInflated = false;
    CustomViewGroupBinding binding;
    BindableClass variable = null;

    public CustomViewGroup(Context context) {
        super(context);
    }

    public CustomViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @TargetApi(11)
    public CustomViewGroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(21)
    public CustomViewGroup(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        if (!alreadyInflated) {
            alreadyInflated = true;
            binding = CustomViewGroupBinding.inflate(LayoutInflater.from(getContext()), this, true);
            if(variable != null){
                binding.setVariable(variable);
            }
        }
    }

    public void setVariable(BindableClass variable){
        this.variable = variable;
        if(binding != null) {
            binding.setVariable(variable);
        }
    }
}
