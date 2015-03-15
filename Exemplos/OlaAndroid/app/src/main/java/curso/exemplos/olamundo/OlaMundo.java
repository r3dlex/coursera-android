package curso.exemplos.olamundo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class OlaMundo extends Activity {
    private final String TAG = "OlaMundo";

    public void onCreate(Bundle savedInstanceState) {
        // Required call through to Activity.onCreate()
        // Restore any saved instance state
        super.onCreate(savedInstanceState);

        // Set up the application's user interface (content view)
        setContentView(R.layout.main);
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