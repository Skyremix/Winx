package com.example.winx.lvl;

import com.example.winx.R;
import com.example.winx.R.drawable;

import android.app.Activity;
import android.graphics.Color;
import android.opengl.Visibility;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ActivityLvl1  extends Activity{
	class Layout
	{
		public Layout()
		{
			card1 = find(R.id.card1);
			card2 = find(R.id.card2);
			card3 = find(R.id.card3);
			card4 = find(R.id.card4);
			
			card5 = find(R.id.card5);
			card6 = find(R.id.card6);
			card7 = find(R.id.card7);
			card8 = find(R.id.card8);
			
			card9 = find(R.id.card9);
			card10 = find(R.id.card10);
			card11 = find(R.id.card11);
			card12 = find(R.id.card12);
			
			card13 = find(R.id.card13);
			card14 = find(R.id.card14);
			card15 = find(R.id.card15);
			card16 = find(R.id.card16);
		}
		
		Button find(int id)
		{
			return (Button)findViewById(id);
		}
		
		Button card1, card2, card3, card4;
		Button card5, card6, card7, card8;
		Button card9, card10, card11, card12;
		Button card13, card14, card15, card16;
	}
	
	class Events
	{
		public Events()
		{
			click(l.card1); click(l.card2); click(l.card3); click(l.card4);
			click(l.card5); click(l.card6); click(l.card7); click(l.card8);
			click(l.card9); click(l.card10); click(l.card11); click(l.card12);
			click(l.card13); click(l.card14); click(l.card15); click(l.card16);
					

		}
		
		void click(Button card)
		{
			card.setOnClickListener(new OnClickListener() 
			{
				@Override
				public void onClick(View v) 
				{
					flipOn((Button)v);
				}
			});
		}
	}
	
	Layout l;
	Events e;
	Button first;
	//Button Secondary;
	int count;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lvl1);
		
		l = new Layout(); e = new Events();
	
		flipAllCards(); // function call
	}
	
	void flipAllCards() // function declaration
	{
		count = 0;
		

		
		flipOff(l.card1); flipOff(l.card2); flipOff(l.card3); flipOff(l.card4);
		flipOff(l.card5); flipOff(l.card6); flipOff(l.card7); flipOff(l.card8);
		flipOff(l.card9); flipOff(l.card10); flipOff(l.card11); flipOff(l.card12);
		flipOff(l.card13); flipOff(l.card14); flipOff(l.card15); flipOff(l.card16);
	}
	
	void flipOff(Button card) // flipOff -> function name, Button card -> parameter
	{
		card.setBackgroundResource(drawable.back_card);
		card.setTextSize(30);
	}

	void flipOn(Button card) 
	{
		count++;
		//card.setBackgroundColor(Color.GRAY); count++;
		//card.setBackgroundColor(0);
		
		//card.setBackgroundResource(0); count++;
		//card.setText("");
			//card.setBackgroundColor(Color.TRANSPARENT); count++;
		
		if (count == 1)
		{
	
			first = card;
		}
		else if (count == 2)
		{
			int num1 = Integer.valueOf(first.getText().toString());
			int num2 = Integer.valueOf(card.getText().toString());
			
			if (num1 != num2)
			{
				flipOff(first);
				flipOff(card);
			}

			else if(first == card) {

				flipOff(first);
				flipOff(card);
			}
			else
			{
				cardHide(first);
				cardHide(card);
			}
				
			count = 0;
		}
	}

	void cardHide(Button card)
	{
		card.setVisibility(View.INVISIBLE);
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
