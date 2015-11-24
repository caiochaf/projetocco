package projeto.treino.app.com.br.projetofg.banco;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import projeto.treino.app.com.br.projetofg.R;

/**
 * Created by Caio on 18/11/2015.
 */
public class InsereDados extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_usuario);

        Button botao = (Button)findViewById(R.id.btCadastro);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BancoController crud = new BancoController(getBaseContext());
                EditText nome = (EditText)findViewById(R.id.nome_cadastro);
                EditText senha = (EditText)findViewById((R.id.senha_cadastro));
                String nomeString = nome.getText().toString();
                String senhaString = senha.getText().toString();

            }
        });
    }
}