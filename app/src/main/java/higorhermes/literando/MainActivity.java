package higorhermes.literando;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Button b_enter = (Button) findViewById(R.id.button_entrar);
            Button b_cadastro = (Button) findViewById(R.id.button_cadastrar);
            b_enter.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, TelaAcesso.class);
                    startActivity(intent);
                }
            });
            b_cadastro.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, TelaCadastro.class);
                    startActivity(intent);
                }
            });
        }
}
