package projeto.treino.app.com.br.projetofg.banco;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Caio on 17/11/2015.
 */
public class CriaBanco extends SQLiteOpenHelper {
    static final String NOME_BANCO = "banco.db";
    static final String TABELA = "usuarios";
    static final String CD_USUARIO = "cd_usuario";
    static final String NOME = "nm_usuario";
    static final String SENHA = "senha";

    static final int VERSAO = 1;

    public CriaBanco(Context context){
        super(context, NOME_BANCO,null,VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String sql = "CREATE TABLE"+TABELA+"("
                + CD_USUARIO + "integer primary key autoincrement,"
                + NOME + "text,"
                + SENHA + "text,"
                +")";
        db.execSQL(sql);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS" + TABELA);
        onCreate(db);

    }
}
