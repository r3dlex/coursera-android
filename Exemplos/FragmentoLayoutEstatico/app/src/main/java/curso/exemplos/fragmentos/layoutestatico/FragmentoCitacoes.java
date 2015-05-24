package curso.exemplos.fragmentos.layoutestatico;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

//Muitos métodos do ciclo de vida desse fragmento emite mensagens no logcat
public class FragmentoCitacoes extends Fragment {

	private TextView _viewDeCitacao = null;
	private int _indiceAtual = -1;
	private int _numeroDeCitacoes;

	private static final String TAG = "FragmentoCitacoes";

	public int getShownIndex() {
		return _indiceAtual;
	}

	// Mostra a Citação na posição referente
	public void showQuoteAtIndex(int posicao) {
		if (posicao < 0 || posicao >= _numeroDeCitacoes)
			return;
		_indiceAtual = posicao;
		_viewDeCitacao.setText(ActivityVCit._citacoes[_indiceAtual]);
	}

	@Override
	public void onAttach(Activity activity) {
		Log.i(TAG, getClass().getSimpleName() + ":entrou no método onAttach()");
		super.onAttach(activity);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		Log.i(TAG, getClass().getSimpleName() + ":entrou no método onCreate()");
		super.onCreate(savedInstanceState);
	}

	// Chamado para criar o conteudo do Fragmento
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		// Infla o layout definido no fragmento_citacao.xml
		// O último parâmetro é falso porque a view retornada não precisa ser anexada ao ViewGroup do container
		return inflater.inflate(R.layout.fragmento_citacao, container, false);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);

		//Obtem algumas informações da _viewDeCitacao
		_viewDeCitacao = (TextView) getActivity().findViewById(R.id.viewCitacao);
		_numeroDeCitacoes = ActivityVCit._citacoes.length;
	}

	@Override
	public void onStart() {
		Log.i(TAG, getClass().getSimpleName() + ":entrou no método onStart()");
		super.onStart();
	}

	@Override
	public void onResume() {
		Log.i(TAG, getClass().getSimpleName() + ":entrou no método onResume()");
		super.onResume();
	}

	@Override
	public void onPause() {
		Log.i(TAG, getClass().getSimpleName() + ":entrou no método onPause()");
		super.onPause();
	}

	@Override
	public void onStop() {
		Log.i(TAG, getClass().getSimpleName() + ":entrou no método onStop()");
		super.onStop();
	}

	@Override
	public void onDetach() {
		Log.i(TAG, getClass().getSimpleName() + ":entrou no método onDetach()");
		super.onDetach();
	}

	@Override
	public void onDestroy() {
		Log.i(TAG, getClass().getSimpleName() + ":entrou no método onDestroy()");
		super.onDestroy();
	}

	@Override
	public void onDestroyView() {
		Log.i(TAG, getClass().getSimpleName() + ":entrou no método onDestroyView()");
		super.onDestroyView();
	}

}
