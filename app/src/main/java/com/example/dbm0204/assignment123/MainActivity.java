package com.example.dbm0204.assignment123;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 *
 * Main activity implements View.onClickListener
 *
 */
public class MainActivity extends Activity implements View.OnClickListener {
    Button delbtn;
    ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        delbtn = (Button) findViewById(R.id.button);
        delbtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button) {
            Toast.makeText(getApplicationContext(), "Delete Button Clicked", Toast.LENGTH_LONG).show();
            AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
            //Setting Dialog Title
            alertDialog.setTitle("Confirm Delete");
            //setting Dialog Message
            alertDialog.setMessage("Are you sure you want to delete this?");
            //Setting Icon to Dialog
            alertDialog.setIcon(R.mipmap.ic_launcher);
            alertDialog.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int which) {
                    Toast.makeText(getApplicationContext(), "You Clicked on YES", Toast.LENGTH_LONG).show();
                }
            });
            alertDialog.setNegativeButton("NO",new DialogInterface.OnClickListener(){
                public void onClick(DialogInterface dialogInterface,int which) {
                    Toast.makeText(getApplicationContext(), "You Clicked on NO", Toast.LENGTH_LONG).show();
                    finish();
                }
            });
            alertDialog.show();

        }
    }
}

