package curso.exemplos.exemplodepermissao.boom;

import android.app.Activity;
import android.os.Bundle;

public class BoomActivity extends Activity {

	// String que representa a acao boom
	public static final String ACAO_BOOM =
			"curso.exemplos.exemplodepermissao.boom.acao_boom";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.boom_layout);
	}
}
