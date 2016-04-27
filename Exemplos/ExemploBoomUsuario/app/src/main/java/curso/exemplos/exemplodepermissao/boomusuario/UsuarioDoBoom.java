package curso.exemplos.exemplodepermissao.boomusuario;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class UsuarioDoBoom extends Activity {

	// Representa uma operação de permissão BOOM
	private static final String ACAO_BOOM = "curso.exemplos.exemplodepermissao.boom.acao_boom";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.boom_usuario_layout);

		Button botao = (Button) findViewById(R.id.botao);
		botao.setOnClickListener(new OnClickListener() {

            // Called when the user clicks on the Detonate Button
            @Override
            public void onClick(View v) {

                // Cria um intent que utiliza a string ACAO_BOOM
                // Lança uma Activity capaz de receber a ACAO_BOOM usando o método startActivity()
                startActivity(new Intent(ACAO_BOOM));
            }
        });
	}
}
