package curso.exemplos.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class PrimeiraAcivity extends Activity {

	// Usar essas chaves para salvamento e restauração de contexto
	private static final String RESTART_CHAVE = "restart";
	private static final String RESUME_CHAVE = "resume";
	private static final String START_CHAVE = "start";
	private static final String CREATE_CHAVE = "create";

	// String para o logcat
	private final static String TAG = "PrimeiraAcivity";

	// Contadores de Lifecycle Android

	// TODO:
	// Criar variaveis com os nomes
	// _contagemCreate, _contagemRestart, _contagemStart e _contagemResume
	// para contar as chamadas a onCreate(), onRestart(), onStart() e 
	// onResume(). Essas variaveis tem de ser estaticas

  // Essas variaveis devem ser incrementadas quando o metodo correspondente
  // for chamado, efetuando assim o controle de chamadas de ciclo

	// TODO: Criar variaveis para cada TextView
	// com os nomes _tvCreate, _tvRestart, _tvStart e _tvResume
	// para mostrar a contagem atual de cada variavel

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_one);

		// TODO: Associar as variaveis visuais (TextView) as variaveis criadas
		// Dica: Acessar a TextView por meio da classe R e do findViewById
		// textView1 = (TextView) findViewById(R.id.textView1);




		Button launchActivityTwoButton = (Button) findViewById(R.id.bLaunchActivityTwo);
		launchActivityTwoButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO:
				// Lanca a SegundaActivity
				// Dica: usar o metodo do Context, startActivity()

				// Cria um Intent identificando qual Activity chamou e qual vai iniciar
        // Lembrar de checar sempre o AndroidManifest.xml

				// Lanca a Activity (startActivity)
			}
		});

		// O estado foi salvo?
		if (savedInstanceState != null) {
			// TODO:
			// Restaura os valores do estado salvo
			// Dica: 4 linhas, uma para cada variavel



		}

		// Emite mensagens para o logcat
		Log.i(TAG, "Entrou no metodo onCreate()");

		// TODO:
		// Fazer a atualizacao do contador
		// Atualizar a interface pelo metodo mostrarContadores()



	}

	// Metodos do Lifecycle Android

	@Override
	public void onStart() {
		super.onStart();

		// Envia mensagem para o logcat
		Log.i(TAG, "Entrou no metodo onStart()");

		// TODO:
		// Fazer a atualizacao do contador
		// Atualizar a interface pelo metodo mostrarContadores()
	}

	@Override
	public void onResume() {
		super.onResume();

		// Envia mensagem para o logcat
		Log.i(TAG, "Entrou no metodo onResume()");

		// TODO:
		// Fazer a atualizacao do contador
		// Atualizar a interface pelo metodo mostrarContadores()
	}

	@Override
	public void onPause() {
		super.onPause();

		// Envia mensagem para o logcat
		Log.i(TAG, "Entrou no metodo onPause()");
	}

	@Override
	public void onStop() {
		super.onStop();

		// Envia mensagem para o logcat
		Log.i(TAG, "Entrou no metodo onStop()");
	}

	@Override
	public void onRestart() {
		super.onRestart();

		// Envia mensagem para o logcat
		Log.i(TAG, "Entrou no metodo onRestart()");

		// TODO:
		// Fazer a atualizacao do contador
		// Atualizar a interface pelo metodo mostrarContadores()


	}

	@Override
	public void onDestroy() {
		super.onDestroy();

		// Envia mensagem para o logcat
		Log.i(TAG, "Entrou no metodo onDestroy()");
	}

	@Override
	public void onSaveInstanceState(Bundle savedInstanceState) {
    //TODO
		// Salvar os pares chave-valor para cada uma das variaveis de interesse
		// Dica: 4 linhas de codigo, uma para cada contador
    



	}

	// Atualiza os valores dos contadores
	// Esse metodo espera que os contadores estejam utilizando os nomes
	// definidos anteriormente conforme codigo comentado
	public void mostrarContadores() {
    //TODO: Descomentar e testar!
		//mTvCreate.setText("onCreate() :" + mCreate);
		//mTvStart.setText("onStart() :" + mStart);
		//mTvResume.setText("onResume() :" + mResume);
		//mTvRestart.setText("onRestart() :" + mRestart);
    


	}
}
