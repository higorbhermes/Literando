package higorhermes.literando;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TelaPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);

        String itens[] = {"Novo Livro", "Meus Livros", "Buscar Livro"};
        ListView listaSimples = (ListView) findViewById(R.id.lista);
        ArrayAdapter<String> adapterSimples = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, itens);

        listaSimples.setAdapter(adapterSimples);
    }
}
