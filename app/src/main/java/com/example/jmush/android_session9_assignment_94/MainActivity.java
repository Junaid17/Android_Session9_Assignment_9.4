package com.example.jmush.android_session9_assignment_94;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1= (Button) findViewById(R.id.button);
        //Initialising buttton
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //POP up context menu on long press
                registerForContextMenu(b1);
            }
        });


    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        //setting title
        menu.setHeaderTitle("Context Menu");
        //Adding items
        menu.add(0, v.getId(), 0, "Action 1");
        menu.add(0, v.getId(), 0, "Action 2");
        menu.add(0, v.getId(), 0, "Action 3");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
    // OnClick of context menu items
        if(item.getTitle()=="Action 1"){
            Toast.makeText(getApplicationContext(),"Action 1 Clicked",Toast.LENGTH_LONG).show();
        }
        else if(item.getTitle()=="Action 2"){
            Toast.makeText(getApplicationContext(),"Action 2 Clicked",Toast.LENGTH_LONG).show();
        }
        else if(item.getTitle()=="Action 3"){
            Toast.makeText(getApplicationContext(),"Action 3 Clicked",Toast.LENGTH_LONG).show();
        }
        return true;
    }
}