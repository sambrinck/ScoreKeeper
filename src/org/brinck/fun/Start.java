package org.brinck.fun;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Start extends Activity {
    private LinearLayout players;
    private Button addPlayer;
    private Button start;

	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        players = (LinearLayout) findViewById(R.string.playerNames);
        addPlayer = (Button)findViewById(R.string.addPlayer);
        start = (Button)findViewById(R.string.startButton);
        
        addPlayer.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				players.addView(new EditText(getApplicationContext()));
			}
		});
        
        for (int i = 0; i < players.getChildCount(); i++) {
        	EditText player = (EditText) players.getChildAt(i);
        	String name = player.getText().toString();
        	System.out.println(name);
        }
        
    }
    
    
}