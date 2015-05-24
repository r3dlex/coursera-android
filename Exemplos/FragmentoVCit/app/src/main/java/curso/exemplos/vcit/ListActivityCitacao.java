package curso.exemplos.vcit;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class ListActivityCitacao extends ListActivity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// Get the Intent that started this Activity
		Intent intent = getIntent();
		
		// Retrieve the Extra stored under the name ListActivityTitulo.INDEX
		String quote = intent.getStringExtra(ListActivityTitulo.INDEX);

		
		if (null != quote) {
			
			// Set the list adapter for the ListView 
			// Discussed in more detail in the user interface classes lesson  
			setListAdapter(new ArrayAdapter<String>(ListActivityCitacao.this,
					R.layout.list_text_item_layout, new String[] { quote }));
		}
	}
}