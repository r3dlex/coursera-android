package curso.exemplos.fragmentos.layoutestatico;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import curso.exemplos.fragmentos.layoutestatico.FragmentoTitulos.ListSelectionListener;

//Métodos do ciclo de vida emitirão texto no logcat
public class ActivityVCit extends Activity implements
		ListSelectionListener {

	public static String[] _titulos;
	public static String[] _citacoes;
	private FragmentoCitacoes _fragmentoDeCitacoes;

	private static final String TAG = "ActivityVCit";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// Obtem os arrays de titulos e citacoes
		_titulos = getResources().getStringArray(R.array.Titulos);
		_citacoes = getResources().getStringArray(R.array.Citacoes);
		
		setContentView(R.layout.main);
		
		// Obtém a referênci ao FragmentoCitacoes
		_fragmentoDeCitacoes = (FragmentoCitacoes) getFragmentManager()
				.findFragmentById(R.id.detalhes);
	}

	// Chamado quando o usuario seleciona um título
	@Override
	public void onListSelection(int index) {
		if (_fragmentoDeCitacoes.getShownIndex() != index) {

			// Tell the QuoteFragment to show the quote string at position index
			_fragmentoDeCitacoes.showQuoteAtIndex(index);
		}
	}
	
	@Override
	protected void onDestroy() {
		Log.i(TAG, getClass().getSimpleName() + ":entrou no método onDestroy()");
		super.onDestroy();
	}

	@Override
	protected void onPause() {
		Log.i(TAG, getClass().getSimpleName() + ":entrou no método onPause()");
		super.onPause();
	}

	@Override
	protected void onRestart() {
		Log.i(TAG, getClass().getSimpleName() + ":entrou no método onRestart()");
		super.onRestart();
	}

	@Override
	protected void onResume() {
		Log.i(TAG, getClass().getSimpleName() + ":entrou no método onResume()");
		super.onResume();
	}

	@Override
	protected void onStart() {
		Log.i(TAG, getClass().getSimpleName() + ":entrou no método onStart()");
		super.onStart();
	}

	@Override
	protected void onStop() {
		Log.i(TAG, getClass().getSimpleName() + ":entrou no método onStop()");
		super.onStop();
	}

}