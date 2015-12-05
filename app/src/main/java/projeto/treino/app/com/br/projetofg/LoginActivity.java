package projeto.treino.app.com.br.projetofg;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Adson on 22/10/2015.
 */
public class LoginActivity extends Activity implements View.OnClickListener {

    private EditText usuario;
    private EditText senha;

    Usuario loginUsuario = new Usuario();

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_login);

        usuario = (EditText) findViewById(R.id.usuario_login);
        senha = (EditText) findViewById(R.id.senha_login);

    }

    public void logar(View view){

        String user = usuario.getText().toString();
        String pass = senha.getText().toString();
        String checaUser = loginUsuario.getNOME();
        String checaPass = loginUsuario.getSENHA();

        if(isEmpty(user)){
            alert(this, "Informe o login!");
            return;
        }else if(isEmpty(pass)){
            alert(this, "Informe a senha!");
            return;
        }else if(checaUser.equals(user) && checaPass.equals(pass)){
                startActivity(new Intent(this, TelaPrincipalActivity.class));
        }else{
            String msg = getString(R.string.msg_login);
            Toast toast = Toast.makeText(this, msg, Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    public boolean isEmpty(String s) {
        return s == null || s.trim().length() == 0;
    }

    public void alert(Activity context,String msg) {
        AlertDialog dialog = new AlertDialog.Builder(context).setTitle("Informação!!!").setMessage(msg).create();
        dialog.setButton("OK", new DialogInterface.OnClickListener() {//método obsoleto
            public void onClick(DialogInterface dialog, int which) {
                return;
            }
        });
        dialog.show();
    }

    public void cadastrar(View view){
        startActivity(new Intent(this, CadastroUserActivity.class));
    }

    @Override
    public void onClick(View v) {
    }

    public void esquecerSenha(View view){
            startActivity(new Intent(this, EsquecerSenhaActivity.class));
    }
}
