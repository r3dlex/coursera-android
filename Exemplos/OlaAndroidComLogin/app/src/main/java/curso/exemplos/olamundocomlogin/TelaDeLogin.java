package curso.exemplos.olamundocomlogin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import java.util.Random;

public class TelaDeLogin extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teladelogin);

        final EditText usuario = (EditText) findViewById(R.id.usuario_edittext);
        final EditText senha = (EditText) findViewById(R.id.senha_edittext);

        final Button loginButton = (Button) findViewById(R.id.login_button);
        loginButton.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                if (checarSenha(usuario.getText(), senha.getText())) {
                    // Cria um Intent para a classe OlaAndroid
                    Intent helloAndroidIntent = new Intent(TelaDeLogin.this,
                            OlaAndroid.class);
                    //Usa o Intent para inicializar a classe OlaAndroid
                    startActivity(helloAndroidIntent);
                } else {
                    usuario.setText("");
                    senha.setText("");
                }
            }
        });
    }

    private boolean checarSenha(Editable usuario, Editable senha) {
        // "Finge" checagem de password...
        return new Random().nextBoolean();
    }
}
