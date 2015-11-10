package projeto.treino.app.com.br.projetofg;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;

import java.util.Calendar;

/**
 * Created by Adson on 22/10/2015.
 */
public class CadastroUserActivity extends Activity {
    private Button data;
    private int dia, mes, ano;
    private Spinner tpSangue;
    private Spinner fatorRH;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_usuario);

        Calendar calendario = Calendar.getInstance();
        dia = calendario.get(Calendar.DAY_OF_MONTH);
        mes = calendario.get(Calendar.MONTH);
        ano = calendario.get(Calendar.YEAR);

        data = (Button) findViewById(R.id.btn_data);
        data.setText(dia + "/" + (mes+1) + "/" + ano);

        //adaptador para o spinner do tipo sanguinei
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
    }

    public void selecionarData(View view){showDialog(view.getId());}

    protected Dialog onCreateDialog(int id){
        if(R.id.btn_data == id){
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
                    data.setText(dia + "/" + (mes+1) + "/" + ano);
                }
            };
}
