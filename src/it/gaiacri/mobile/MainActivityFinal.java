package it.gaiacri.mobile;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class
		MainActivityFinal extends AppCompatActivity {

	private Context context = null ;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);


        //getSupportActionBar().hide();
        //this.getActionBar().hide();
		setContentView(R.layout.mainfinal);
		this.context=this.getApplicationContext();

        TextView tv = (TextView)findViewById(R.id.title2);
        tv.setText("Ciao! Già da qualche mese, la squadra di sviluppo ha cominciato a lavorare al progetto 'Jorvik'. Questo è il nome di lavoro che è stato dato al progetto software, basato su Gaia, che contiene tutte quelle modifiche strutturali per migliorare significativamente Gaia. Il progetto è stato teorizzato e proposto, nella forma di un memorandum interno (\"Jorvik: Riprogettare Gaia per la Nuova Croce Rossa\").");


		Button b = (Button) findViewById(R.id.buttonCri);
		b.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String url = "https://gaia.cri.it";
				Intent i = new Intent(Intent.ACTION_VIEW);
				i.setData(Uri.parse(url));
				startActivity(i);
			}
		});
	}


	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		//MenuInflater inflater = getMenuInflater();
		//inflater.inflate(R.menu.main, menu);
		return true;
	}
}