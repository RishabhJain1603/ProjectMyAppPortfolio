package com.udacity.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{



    private Button mBtnPopular,mBtnStockHawk,mBtnBuildit,mBtnMakeUr,mBtnGoUbiquitous,mBtnCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle(getResources().getString(R.string.toolbar_title));


    }



    private void showToast(String launchAppName){
        Toast.makeText(this, "This button will launch my "+launchAppName+" app!", Toast.LENGTH_SHORT).show();
    } private void initView()
    {

        View contentView = findViewById(R.id.contentId);
        mBtnPopular = (Button) contentView.findViewById(R.id.btnPopularMovie);
        mBtnStockHawk = (Button) contentView.findViewById(R.id.btnStockHawk);
        mBtnBuildit = (Button) contentView.findViewById(R.id.btnBuildItBigger);
        mBtnMakeUr = (Button) contentView.findViewById(R.id.btnAppMaterila);
        mBtnGoUbiquitous = (Button) contentView.findViewById(R.id.btnGoUbiquitous);
        mBtnCapstone = (Button) contentView.findViewById(R.id.btnCapstone);

        mBtnPopular.setOnClickListener(this);
        mBtnStockHawk.setOnClickListener(this);
        mBtnBuildit.setOnClickListener(this);
        mBtnMakeUr.setOnClickListener(this);
        mBtnGoUbiquitous.setOnClickListener(this);
        mBtnCapstone.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnPopularMovie:
                showToast(""+mBtnPopular.getText());
                break;
            case R.id.btnStockHawk:
                showToast(""+mBtnStockHawk.getText());
                break;
            case R.id.btnBuildItBigger:
                showToast(""+mBtnBuildit.getText());
                break;
            case R.id.btnAppMaterila:
                showToast(""+mBtnMakeUr.getText());
                break;
            case R.id.btnGoUbiquitous:
                showToast(""+mBtnGoUbiquitous.getText());
                break;
            case R.id.btnCapstone:
                showToast(""+mBtnCapstone.getText());
                break;
            default:
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
