package com.example.gyx.layout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_linearlaylout;
    Button btn_relativelayout;
    Button btn_tablelayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_linearlaylout = (Button)findViewById(R.id.linearlayout);
        btn_linearlaylout.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, LinearlayoutActivity.class);
                startActivity(intent);
            }
        });

        btn_relativelayout = (Button)findViewById(R.id.relativelayout);
        btn_relativelayout.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, RelativelayoutActivity.class);
                startActivity(intent);
            }
        });

        btn_tablelayout = (Button)findViewById(R.id.tablelayout);
        btn_tablelayout.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RelativelayoutActivity.class);
                startActivity(intent);
            }
        });
    }
}
