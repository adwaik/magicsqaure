package com.dwaik.sample.magicsqaure;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class InputActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.main_btn_start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = ((EditText) findViewById(R.id.main_et_number)).getText().toString();
                if (TextUtils.isEmpty(str)) {
                    Toast.makeText(InputActivity.this, R.string.msg_number_cant_be_empty, Toast.LENGTH_SHORT).show();
                    return;
                }
                int i = Integer.parseInt(str);
                if (i < 2) {
                    Toast.makeText(InputActivity.this, R.string.msg_number_cant_be_less, Toast.LENGTH_SHORT).show();
                    return;
                }
                if (i % 2 == 0) {
                    Toast.makeText(InputActivity.this, R.string.msg_number_cant_be_even, Toast.LENGTH_SHORT).show();
                    return;
                }
                Intent intent = new Intent(InputActivity.this, ConstructAndRenderActivity.class);
                intent.putExtra(ConstructAndRenderActivity.EX_ROW, i);
                startActivity(intent);
            }
        });
    }
}
