package br.java.android.laboratorio10;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DetalheMotoActivity extends Activity {
	
	private Moto moto;

	@Override
	protected void onCreate(Bundle savedInstanceStateParam) {
		super.onCreate(savedInstanceStateParam);
		setContentView(R.layout.detalhe_moto);
		
		moto = (Moto) getIntent().getExtras().getSerializable("moto");
		
		((TextView)findViewById(R.id.modeloTextView))
							.setText(moto.getModelo());
		((TextView)findViewById(R.id.cilindradasTextView))
							.setText(moto.getCilindradas() + " cc");
		((TextView)findViewById(R.id.quilometragemTextView))
							.setText(moto.getQuilometragem() + " Km");
		((TextView)findViewById(R.id.anoFabricacaoTextView))
							.setText("Fabricado em: " + moto.getAnoFabricacao());
		((TextView)findViewById(R.id.autonomiaTextView))
							.setText(moto.getAutonomia() + " Km/l");
		((TextView)findViewById(R.id.capacidadeTanqueTextView))
							.setText(moto.getCapacidadeTanque() + " litros");
		((TextView)findViewById(R.id.enderecoTextView))
							.setText(moto.getEndereco());
		((TextView)findViewById(R.id.bairroTextView))
							.setText(moto.getBairro());
		((TextView)findViewById(R.id.cidadeTextView))
							.setText(moto.getCidade());
		((TextView)findViewById(R.id.ufTextView)).setText(moto.getUf());
		
		((TextView)findViewById(R.id.contatoTextView))
						.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View vParam) {
				TextView t = (TextView) vParam;
				Intent i = new Intent(Intent.ACTION_SENDTO);
				i.setData(Uri.fromParts("mailto", t.getText().toString(), null));
				i.putExtra(Intent.EXTRA_SUBJECT, "Informações sobre " + moto.getId());
				i.putExtra(Intent.EXTRA_TEXT, "Gostaria de receber informações "
						+ "sobre a moto" + moto.getModelo());
				startActivity(Intent.createChooser(i,
						"Enviar e-mail utilizando")); 
			}
		});
		
		findViewById(R.id.telefoneTextView)
						.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				TextView t = (TextView) v;
				Intent i = new Intent(Intent.ACTION_CALL);
				i.setData(Uri.parse("tel:" + t.getText().toString()));
				startActivity(i);
			}
		});
		
		findViewById(R.id.maisInfoButton)
					.setOnClickListener(new View.OnClickListener() {
						
			@Override
			public void onClick(View vParam) {
				Intent i = new Intent(Intent.ACTION_VIEW);
				i.setData(Uri.parse("http://developer.android.com"));
				startActivity(i);
			}
		});
	}
}
