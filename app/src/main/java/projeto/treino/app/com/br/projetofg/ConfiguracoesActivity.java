package projeto.treino.app.com.br.projetofg;

import android.app.Activity;
import android.content.Intent;
import android.opengl.Visibility;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

/**
 * Created by Adson on 30/10/2015.
 */
public class ConfiguracoesActivity extends Activity
        implements View.OnClickListener {

    private ToggleButton tBPin;
    private EditText recebePin;
    private TextView tvPin;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.configuracoes_layout);

        tBPin =(ToggleButton) findViewById(R.id.tBT_ativar_pin);
        tBPin.setOnClickListener(this);

        recebePin = (EditText) findViewById(R.id.pin);

        tvPin = (TextView) findViewById(R.id.tv_pin);

        tvPin.setVisibility(View.INVISIBLE);
        recebePin.setVisibility(View.INVISIBLE);
    }


    @Override
    public void onClick(View v) {
        if(v == tBPin){
            if(tBPin.isChecked()){
                tvPin.setVisibility(View.VISIBLE);
                recebePin.setVisibility(View.VISIBLE);
            }else {
                tvPin.setVisibility(View.INVISIBLE);
                recebePin.setVisibility(View.INVISIBLE);
            }
        }

    }

    public void telaEditar(View view){
        startActivity(new Intent(this, EditarDadosActivity.class));
    }

    public void btDeletar(View view) {

    }
}
