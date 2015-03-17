package com.exemplo.andre.xmlwriter;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.Xml;
import android.view.Menu;
import android.view.MenuItem;

import org.xmlpull.v1.XmlSerializer;

import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class EscritorXml extends Activity {
    private final String TAG = "EscritorXml";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Mensagem> mensagens = new ArrayList<Mensagem>();
        mensagens.add(new Mensagem("Ola", "Ola Mundo!", "n00b"));
        mensagens.add(new Mensagem("Android", "Android XML é fácil!", "prof"));
        Log.i(TAG, writeXml(mensagens));
    }

    public class Mensagem {
        private String _titulo;
        private String _texto;
        private String _autor;
        private String _data;

        public Mensagem(String titulo, String texto, String autor) {
            _titulo = titulo;
            _texto = texto;
            _autor = autor;
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_HHmmss");
            _data = sdf.format(new Date());
        }

        public String getData() {
            return _data;
        }

        public String getTitulo() {
            return _titulo;
        }

        public String getAutor() {
            return _autor;
        }

        public String getTexto() {
            return _texto;
        }
    }

    public String writeXml(List<Mensagem> mensagens) {
        XmlSerializer serializador = Xml.newSerializer();
        StringWriter escritor = new StringWriter();
        try {
            serializador.setOutput(escritor);
            serializador.startDocument("UTF-8", true);
            serializador.startTag("", "mensagens");
            serializador.attribute("", "numero", String.valueOf(mensagens.size()));
            for (Mensagem msg : mensagens) {
                serializador.startTag("", "mensagem");
                serializador.attribute("", "data", msg.getData());
                serializador.startTag("", "titulo");
                serializador.text(msg.getTitulo());
                serializador.endTag("", "titulo");
                serializador.startTag("", "corpo");
                serializador.text(msg.getTexto());
                serializador.endTag("", "corpo");
                serializador.endTag("", "mensagem");
            }
            serializador.endTag("", "mensagens");
            serializador.endDocument();
            return escritor.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
