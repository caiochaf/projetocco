package projeto.treino.app.com.br.projetofg;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;
import java.util.Calendar;



/**
 * Created by Adson on 22/10/2015.
 * Modified by Caio on 26/11/2015.
 */
public class CadastroUserActivity extends Activity {

    private EditText nome;
    private EditText senha1;
    private EditText senha2;
    private EditText cpf;
    private Button data;
    private int dia, mes, ano;
    private String sexo;
    private EditText telefone;
    private EditText mail1;
    private EditText mail2;
    private Spinner tpSangue;
    private Spinner fatorRH;
    private EditText numeroPlano;
    private EditText numeroCarteira;
    Usuario usuario = new Usuario();


    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_usuario);

        nome = (EditText) findViewById(R.id.nome_cadastro);
        senha1 = (EditText) findViewById(R.id.senha_cadastro);
        senha2 = (EditText) findViewById(R.id.confirma_senha_cadastro);
        cpf = (EditText) findViewById(R.id.cpf_usuario);
        Calendar calendario = Calendar.getInstance();
        dia = calendario.get(Calendar.DAY_OF_MONTH);
        mes = calendario.get(Calendar.MONTH);
        ano = calendario.get(Calendar.YEAR);
        data = (Button) findViewById(R.id.btn_data);
        data.setText(dia + "/" + (mes + 1) + "/" + ano);
        telefone = (EditText) findViewById(R.id.fone_usuario);
        mail1 = (EditText) findViewById(R.id.mail_usuario);
        mail2 = (EditText) findViewById(R.id.confirma_mail_usuario);
        //adaptador para o spinner do tipo sanguineio
        ArrayAdapter<CharSequence> adapterSangue =
                ArrayAdapter.createFromResource(this, R.array.tp_sangue,
                        android.R.layout.simple_spinner_item);
        //adaptador para o spinner fator RH
        ArrayAdapter<CharSequence> adapterRH =
                ArrayAdapter.createFromResource(this, R.array.fator_rh,
                        android.R.layout.simple_spinner_item);

        tpSangue = (Spinner) findViewById(R.id.tp_sanguineo);
        tpSangue.setAdapter(adapterSangue);
        fatorRH = (Spinner) findViewById(R.id.fator_rh);
        fatorRH.setAdapter(adapterRH);
        numeroPlano = (EditText) findViewById(R.id.plano_saude);
        numeroCarteira = (EditText) findViewById(R.id.carteira_plano);


    }



    public void selecionarData(View view) {
        showDialog(view.getId());
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
    protected Dialog onCreateDialog(int id) {
        if (R.id.btn_data == id) {
            return new DatePickerDialog(this,
                    listener, dia, mes, ano);
        }
        return null;
    }

    private DatePickerDialog.OnDateSetListener listener =
            new DatePickerDialog.OnDateSetListener() {

                @Override
                public void onDateSet(DatePicker view,
                                      int year, int monthOfYear, int dayOfMonth) {
                    dia = dayOfMonth;
                    mes = monthOfYear;
                    ano = year;
                    data.setText(dia + "/" + (mes + 1) + "/" + ano);
                }
            };



    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.rb_feminino:
                if (checked)
                    sexo = "f";
                    // Feminino
                    break;
            case R.id.rb_masculino:
                if (checked)
                    sexo = "m";
                    // Masculino
                    break;
        }
    }

    public void btCadastrar(View view) {

        //variaveis para checagem dos campos e preenchimento do objeto Usuário.
        String checaNome = nome.getText().toString();
        String checaSenha1 = senha1.getText().toString();
        String checaSenha2 = senha2.getText().toString();
        String checaCpf = cpf.getText().toString();
        //String checaData =
        String checaTelefone = telefone.getText().toString();
        String checaMail1 = mail1.getText().toString();
        String checaMail2 = mail2.getText().toString();
        //String tpSangue = ;
        //String fatorRh =
        String plano = numeroPlano.getText().toString();
        String carteira = numeroCarteira.getText().toString();

        // checagem dos campos obrigatorios
        if (isEmpty(checaNome)) {
            alert(this, "Campo Nome não Preenchido!");
        }else if(isEmpty(checaSenha1)) {
            alert(this, "Campo Senha não Preenchido!");
        }else if (checaSenha2.equals(checaSenha1)){  //checa se a senha é a mesma do campo anterior.
            alert(this, "Senha não confere!");
        } else if(isEmpty(checaCpf)){
            alert(this, "Campo CPF não Preenchido!");
        }//else if (isEmpty(checaData)){  alert(this, "Data não Preenchida!");            }
        else if (isEmpty(sexo)){  alert(this, "Campo Sexo não selecionado");           }
        else if(isEmpty(checaTelefone)){
            alert(this, "Campo Telefone não Preenchido");
        }else if(isEmpty(checaMail1)){
            alert(this, "Campo Email não Preenchido");
        }else if (checaMail2.equals(checaMail1) ){  // checa se o email é o mesmo do campo anterior.
            alert(this, "Email não confere!");
        }else {


            //coloca os dados no objeto usuario para ser enviado para o banco.

            usuario.setNOME(checaNome);
            usuario.setSENHA(checaSenha1);
            usuario.setCPF(checaCpf);
            //usuario.setDATA(checaData);
            usuario.setSEXO(sexo);
            usuario.setTELEFONE(checaTelefone);
            usuario.setMAIL(checaMail1);
            //usuario.setTP_SANGUE();
            //usuario.setFATOR_RH();
            usuario.setPLANO(plano);
            usuario.setNUMERO_CARTEIRA(carteira);

            // aqui começa o CRUD de cadastrar o usuario


            startActivity(new Intent(this, LoginActivity.class));
        }


    }

}

