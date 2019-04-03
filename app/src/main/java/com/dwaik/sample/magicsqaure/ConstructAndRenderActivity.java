package com.dwaik.sample.magicsqaure;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class ConstructAndRenderActivity extends BaseActivity {
    public static final String EX_ROW = "ex_row";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_render);
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            finish();
            return;
        }
        int size = extras.getInt(EX_ROW, 2);//default to 2

        RecyclerView recycler = findViewById(R.id.recycler);
        SquareConstructor constructor = new SquareConstructor();
        DataSource dataSource = new DataSource(size, constructor);
        DataAdapter adapter = new DataAdapter(dataSource);
        GridLayoutManager layoutManager = new GridLayoutManager(this, size);
        recycler.setLayoutManager(layoutManager);
        recycler.setAdapter(adapter);
    }
}
