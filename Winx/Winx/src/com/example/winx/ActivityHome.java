package com.example.winx;

import com.example.winx.lvl.ActivityLvl1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings.TextSize;
import android.widget.Button;
import android.widget.TextView;

public class ActivityHome extends Activity {
    TextView btnGame, btnStages,btnquit;

    class play {
        public play() {


        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        
      
        getActionBar().hide();
        
        btnGame = (TextView) findViewById(R.id.btnGame);
        btnGame.setTextSize(30);
        
        btnStages = (TextView) findViewById(R.id.btnStages);
        btnStages.setTextSize(30); 
        
        btnquit = (TextView)findViewById(R.id.btnquit);
        btnquit.setTextSize(30); 
        
        btnGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
            	
                startActivity(new Intent(ActivityHome.this, ActivityLvl1.class));
                
            }
        });

        btnStages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(ActivityHome.this, Stages.class));
            }
        });
        
        btnquit.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
				
			}
		});
    }

   
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.back_menu) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
  


