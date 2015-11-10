package projeto.treino.app.com.br.projetofg;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

/**
 * Created by Adson on 02/11/2015.
 */
public class EsquecerSenhaActivity extends Activity
        implements CompoundButton.OnCheckedChangeListener, View.OnClickListener{

    private TextView mail, codigo, pin, senha, confirmaSenha;
    private EditText et_mail, et_codigo, et_pin, et_senha, et_confirmaSenha;
    private Button btEnviar, btConfirmar, btMudaSenha, confirmarFim;
    private RadioButton email, rbPin;

    int[] n = new int[5];

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.esquecer_senha_layout);

        email = (RadioButton) findViewById(R.id.email);
        email.setOnCheckedChangeListener(this);
        rbPin = (RadioButton) findViewById(R.id.rbPin);
        rbPin.setOnCheckedChangeListener(this);

        mail = (TextView) findViewById(R.id.mail);
        et_mail = (EditText) findViewById(R.id.receb_mail);
        btEnviar = (Button) findViewById(R.id.btEnviar);
        btEnviar.setOnClickListener(this);

        codigo = (TextView) findViewById(R.id.codigo_mail);
        et_codigo = (EditText) findViewById(R.id.receb_codigo);
        btConfirmar = (Button) findViewById(R.id.btConfirmar);

        pin = (TextView) findViewById(R.id.pin);
        et_pin = (EditText) findViewById(R.id.receb_pin);
        btMudaSenha = (Button) findViewById(R.id.btMudaSenha);

        senha = (TextView) findViewById(R.id.tvSenha);
        et_senha = (EditText) findViewById(R.id.etSenha);

        confirmaSenha = (TextView) findViewById(R.id.tvConfirmaSenha);
        et_confirmaSenha = (EditText) findViewById(R.id.etConfirmaSenha);
        confirmarFim = (Button) findViewById(R.id.confirmarFim);

        mail.setVisibility(View.GONE);
        et_mail.setVisibility(View.GONE);
        btEnviar.setVisibility(View.GONE);
        codigo.setVisibility(View.GONE);
        et_codigo.setVisibility(View.GONE);
        btConfirmar.setVisibility(View.GONE);
        pin.setVisibility(View.GONE);
        et_pin.setVisibility(View.GONE);
        btMudaSenha.setVisibility(View.GONE);
        senha.setVisibility(View.GONE);
        et_senha.setVisibility(View.GONE);
        confirmaSenha.setVisibility(View.GONE);
        et_confirmaSenha.setVisibility(View.GONE);
        confirmarFim.setVisibility(View.GONE);
    }

    public int[] gerarCodigo(){
        Random gerar = new Random();
        int[] numeros = new int[5];

        for (int i=0; i<5; i++){
            numeros[i] = gerar.nextInt(9);
        }
        return numeros;
    }

    public void btCodigo(View view){
        n = gerarCodigo();

        //aqui deve ser implementado o método de envio do codigo para o e-mail e gravação no banco de dados

        String msg = "O código foi: " + n[0]+n[1]+n[2]+n[3]+n[4];
       Toast toast = Toast.makeText(this, msg, Toast.LENGTH_LONG);
        toast.show();

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(buttonView == email && isChecked){
            mail.setVisibility(View.VISIBLE);
            et_mail.setVisibility(View.VISIBLE);
            btEnviar.setVisibility(View.VISIBLE);
            codigo.setVisibility(View.GONE);
            et_codigo.setVisibility(View.GONE);
            btConfirmar.setVisibility(View.GONE);
            pin.setVisibility(View.GONE);
            et_pin.setVisibility(View.GONE);
            btMudaSenha.setVisibility(View.GONE);
            senha.setVisibility(View.GONE);
            et_senha.setVisibility(View.GONE);
            confirmaSenha.setVisibility(View.GONE);
            et_confirmaSenha.setVisibility(View.GONE);
            confirmarFim.setVisibility(View.GONE);
        }else if(buttonView == rbPin && isChecked){
            mail.setVisibility(View.GONE);
            et_mail.setVisibility(View.GONE);
            btEnviar.setVisibility(View.GONE);
            codigo.setVisibility(View.GONE);
            et_codigo.setVisibility(View.GONE);
            btConfirmar.setVisibility(View.GONE);
            pin.setVisibility(View.VISIBLE);
            et_pin.setVisibility(View.VISIBLE);
            btMudaSenha.setVisibility(View.VISIBLE);
            senha.setVisibility(View.GONE);
            et_senha.setVisibility(View.GONE);
            confirmaSenha.setVisibility(View.GONE);
            et_confirmaSenha.setVisibility(View.GONE);
            confirmarFim.setVisibility(View.GONE);
        }
    }

    public String pegaString(){
       String str = et_codigo.getText().toString();

        return str;
    }

    @Override
    public void onClick(View v) {
        if(v == btEnviar){
            btCodigo(btEnviar);

            codigo.setVisibility(View.VISIBLE);
            et_codigo.setVisibility(View.VISIBLE);
            btConfirmar.setVisibility(View.VISIBLE);
            pin.setVisibility(View.GONE);
            et_pin.setVisibility(View.GONE);
            btMudaSenha.setVisibility(View.GONE);
            senha.setVisibility(View.GONE);
            et_senha.setVisibility(View.GONE);
            confirmaSenha.setVisibility(View.GONE);
            et_confirmaSenha.setVisibility(View.GONE);
            confirmarFim.setVisibility(View.GONE);
        }

    }

    public void mudancaSenha(View view){

       if(view == btConfirmar) {
           String codUsuario = pegaString();
           String confirmar = " ";

           for (int i = 0; i < 5; i++) {
               confirmar += n[i];
           }

           confirmar = confirmar.trim();

           if (codUsuario.equals(confirmar)) {

               Toast toast = Toast.makeText(this, "Codigo Verificado", Toast.LENGTH_SHORT);
               toast.show();

               senha.setVisibility(View.VISIBLE);
               et_senha.setVisibility(View.VISIBLE);
               confirmaSenha.setVisibility(View.VISIBLE);
               et_confirmaSenha.setVisibility(View.VISIBLE);
               confirmarFim.setVisibility(View.VISIBLE);
           } else {
               Toast toast = Toast.makeText(this, "Código Inválido", Toast.LENGTH_SHORT);
               toast.show();
           }
       }else if (view == btMudaSenha){
           //implementa a comparação do PIN armazenado em banco de dados com o digitado
           senha.setVisibility(View.VISIBLE);
           et_senha.setVisibility(View.VISIBLE);
           confirmaSenha.setVisibility(View.VISIBLE);
           et_confirmaSenha.setVisibility(View.VISIBLE);
           confirmarFim.setVisibility(View.VISIBLE);
       }
    }
}
