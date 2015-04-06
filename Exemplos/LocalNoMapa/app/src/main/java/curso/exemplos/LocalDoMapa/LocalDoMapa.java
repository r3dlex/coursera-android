package curso.exemplos.LocalDoMapa;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

// Several Activity lifecycle methods are instrumented to emit LogCat output
// so you can follow this class' lifecycle

public class LocalDoMapa extends Activity {

    private final String TAG = "LocalDoMapa";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        
        // Required call through to Activity.onCreate()
        // Restore any saved instance state
        super.onCreate(savedInstanceState);
        
        // Set content view
        setContentView(R.layout.main);

        // Initialize UI elements
        final EditText addrText = (EditText) findViewById(R.id.local);
        final Button button = (Button) findViewById(R.id.botaoMapa);

        // Seta os elementos da UI
        button.setOnClickListener(new OnClickListener() {
            
            // Chamado quando apertamos o botao de mapa
            public void onClick(View v) {
                try {
                    
                    // Processa texto para transmissao (rede)
                    String endereco = addrText.getText().toString();
                    endereco = endereco.replace(' ', '+');
                    
                    // Cria um Intent para iniciar o google maps
                    Intent geoIntent = new Intent(
                            android.content.Intent.ACTION_VIEW, Uri
                                    .parse("geo:0,0?q=" + endereco));
                    
                    // Usa o Intent para iniciar Google Maps usando Activity.startActivity()
                    startActivity(geoIntent);
                    
                } catch (Exception e) {
                    // Faz o log das mensagens de erro
                    Log.e(TAG, e.toString());
                }
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "A atividade está visível e será iniciada");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "A atividade será reiniciada");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "A atividade tem foco e será resumida");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,
                "Outra atividade pede o foco, a atual será \"pausada\"");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "A atividade não está mais visível, está \"parada\"");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "A atividade será destruída");
    }

}
