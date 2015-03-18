package curso.exemplos.olamundocomlogin;

import android.app.Activity;
import android.os.Bundle;


public class OlaAndroid extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        // Chama o onCreate da classe pai
        // Restaura instancias salvas
        super.onCreate(savedInstanceState);
        //Fixa a interface gráfica na tela
        setContentView(R.layout.olaandroid);
    }
}