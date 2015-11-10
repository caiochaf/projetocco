package projeto.treino.app.com.br.projetofg;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Adson on 23/10/2015.
 */
public class TelaPrincipalActivity extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_principal);

        String msg = "Login realizado com sucesso!!!";
        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_LONG);
        toast.show();

    }

    public void paraVoce(View view){
        startActivity(new Intent(this, ParaVoceActivity.class));
    }

    public void paraOutro(View view){
        startActivity(new Intent(this, ParaOutroActivity.class));
    }
}
