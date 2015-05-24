package curso.exemplos.fragmentos.layoutestatico;

import android.app.Activity;
import android.app.ListFragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

//Muitos métodos do ciclo de vida desse fragmento emite mensagens no logcat
public class FragmentoTitulos extends ListFragment {
	private ListSelectionListener _listener = null;
	private static final String TAG = "FragmentoTitulos";

	// Callback interface that allows this Fragment to notify the ActivityVCit when
	// user clicks on a List Item  
	public interface ListSelectionListener {
		public void onListSelection(int index);
	}

	//Chamado quando o usuário clica em um item da interface
	@Override
	public void onListItemClick(ListView l, View v, int pos, long id) {

		// Seta o item indicado como selecionado
		getListView().setItemChecked(pos, true);
		
		// Informa a ActivityVCit que o item na posição pos foi selecionado
		_listener.onListSelection(pos);
	}
	
	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		try {

			// Seta o ListSelectionListener para se comunicar com a ActivityVCit
			_listener = (ListSelectionListener) activity;
		
		} catch (ClassCastException e) {
			throw new ClassCastException(activity.toString()
					+ " must implement OnArticleSelectedListener");
		}
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		Log.i(TAG, getClass().getSimpleName() + ":entrou no método onCreate()");
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		Log.i(TAG, getClass().getSimpleName() + ":entrou no método onCreate()");
		return super.onCreateView(inflater, container, savedInstanceState);
	}

	@Override
	public void onActivityCreated(Bundle savedState) {
		super.onActivityCreated(savedState);

		// Permite somente a seleçao de um elemento da lista por vez
		getListView().setChoiceMode(ListView.CHOICE_MODE_SINGLE);
		
		// Seta o adaptador de lista para ListView
		// Veremos em mais detalhe em outras aulas
		setListAdapter(new ArrayAdapter<String>(getActivity(),
				R.layout.item_titulo, ActivityVCit._titulos));
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