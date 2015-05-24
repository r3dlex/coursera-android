package curso.exemplos.vcit;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListActivityTitulo extends ListActivity {

	public static String[] _titulos;
	public static String[] _citacoes;

	public static final String INDEX = "index";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// Get the string arrays with the titles and qutoes
		_titulos = getResources().getStringArray(R.array.Titulos);
		_citacoes = getResources().getStringArray(R.array.Citacoes);

		// Set the list adapter for the ListView 
		// Discussed in more detail in the user interface classes lesson  
		setListAdapter(new ArrayAdapter<String>(ListActivityTitulo.this,
				R.layout.list_text_item_layout, ListActivityTitulo._titulos));

	}

	@Override
	public void onListItemClick(ListView l, View v, int pos, long id) {
		
		// Create implicity Intent to start the ListActivityCitacao class
		Intent showItemIntent = new Intent(ListActivityTitulo.this,
				ListActivityCitacao.class);
		
		// Add an Extra representing the currently selected position
		// The name of the Extra is stored in INDEX
		showItemIntent.putExtra(INDEX, _citacoes[pos]);
		
		// Start the ListActivityCitacao using Activity.startActivity()
		startActivity(showItemIntent);
	}

}
