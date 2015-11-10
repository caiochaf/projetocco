package projeto.treino.app.com.br.projetofg;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;

/**
 * Created by Adson on 28/10/2015.
 */
public class ParaVoceActivity extends Activity {

    private static ProgressDialog progress;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.paravoce_layout);

        progress = new ProgressDialog(this);
        progress.setMessage("Carregando informações...");
        progress.show();
    }

}
