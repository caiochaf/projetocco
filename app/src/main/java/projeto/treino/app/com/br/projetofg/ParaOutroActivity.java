package projeto.treino.app.com.br.projetofg;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;

/**
 * Created by Adson on 28/10/2015.
 */
public class ParaOutroActivity extends Activity implements CompoundButton.OnCheckedChangeListener {

    //variáveis check box
    private CheckBox agressao, choque, mal, parto;
    private CheckBox capotagem, colisao, atropelamento, moto, fogo_veiculo;
    private CheckBox afogamento, outros;
    private CheckBox pedestre, ciclista, motociclista, carro, onibus, caminhao;

    private TextView paraTransito;

    private RadioButton transito, aquatico, domestico, outro;//varíaveis radio button


    public void onCreate(Bundle savedInstanceState) {//método onCreate da classe
        super.onCreate(savedInstanceState);
        setContentView(R.layout.paraoutro_layout);

        //Text view
        paraTransito = (TextView) findViewById(R.id.paraTransito);

        //envolvidos acidentes Check box
        pedestre = (CheckBox) findViewById(R.id.CB_pedestre);
        ciclista = (CheckBox) findViewById(R.id.CB_ciclista);
        motociclista = (CheckBox) findViewById(R.id.CB_motociclista);
        carro = (CheckBox) findViewById(R.id.CB_carro);
        onibus = (CheckBox) findViewById(R.id.CB_onibus);
        caminhao = (CheckBox) findViewById(R.id.CB_caminhao);


        //Check boxes de acidentes domésticos
        agressao = (CheckBox) findViewById(R.id.CB_agressao);
        agressao.setOnCheckedChangeListener(this);

        choque = (CheckBox) findViewById(R.id.CB_choque);
        agressao.setOnCheckedChangeListener(this);

        mal = (CheckBox) findViewById(R.id.CB_mal);
        mal.setOnCheckedChangeListener(this);

        parto = (CheckBox) findViewById(R.id.CB_parto);
        parto.setOnCheckedChangeListener(this);

        //check boxes de acidentes de transito
        capotagem = (CheckBox) findViewById(R.id.CB_capotagem);
        capotagem.setOnCheckedChangeListener(this);

        colisao = (CheckBox) findViewById(R.id.CB_colisao);
        colisao.setOnCheckedChangeListener(this);

        atropelamento = (CheckBox) findViewById(R.id.CB_atropelamento);
        atropelamento.setOnCheckedChangeListener(this);

        moto = (CheckBox) findViewById(R.id.CB_moto);
        moto.setOnCheckedChangeListener(this);

        fogo_veiculo = (CheckBox) findViewById(R.id.CB_fogo_veículo);
        fogo_veiculo.setOnCheckedChangeListener(this);

        //check box de acidente aquatico
        afogamento = (CheckBox) findViewById(R.id.CB_afogamento);
        afogamento.setOnCheckedChangeListener(this);

        //outros
        outros = (CheckBox) findViewById(R.id.CB_outros);
        outros.setOnCheckedChangeListener(this);

        //referências com os view's do layout
        transito = (RadioButton) findViewById(R.id.RB_transito);
        transito.setOnCheckedChangeListener(this);
        aquatico = (RadioButton) findViewById(R.id.RB_aquatico);
        aquatico.setOnCheckedChangeListener(this);
        domestico = (RadioButton) findViewById(R.id.RB_domestico);
        domestico.setOnCheckedChangeListener(this);
        outro = (RadioButton) findViewById(R.id.RB_outros);
        outro.setOnCheckedChangeListener(this);

        //setando GONE na abertura da activity
        capotagem.setVisibility(View.GONE);
        colisao.setVisibility(View.GONE);
        atropelamento.setVisibility(View.GONE);
        moto.setVisibility(View.GONE);
        fogo_veiculo.setVisibility(View.GONE);
        afogamento.setVisibility(View.GONE);
        outros.setVisibility(View.GONE);
        mal.setVisibility(View.GONE);
        choque.setVisibility(View.GONE);
        agressao.setVisibility(View.GONE);
        parto.setVisibility(View.GONE);
        pedestre.setVisibility(View.GONE);
        ciclista.setVisibility(View.GONE);
        motociclista.setVisibility(View.GONE);
        carro.setVisibility(View.GONE);
        onibus.setVisibility(View.GONE);
        caminhao.setVisibility(View.GONE);
        paraTransito.setVisibility(View.GONE);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {//método para revelar as opções
        if(buttonView == domestico && isChecked){//acidentes domésticos
            capotagem.setVisibility(View.GONE);
            colisao.setVisibility(View.GONE);
            atropelamento.setVisibility(View.GONE);
            moto.setVisibility(View.GONE);
            fogo_veiculo.setVisibility(View.GONE);
            afogamento.setVisibility(View.GONE);
            outros.setVisibility(View.GONE);
            mal.setVisibility(View.VISIBLE);
            choque.setVisibility(View.VISIBLE);
            agressao.setVisibility(View.VISIBLE);
            parto.setVisibility(View.VISIBLE);
            pedestre.setVisibility(View.GONE);
            ciclista.setVisibility(View.GONE);
            motociclista.setVisibility(View.GONE);
            carro.setVisibility(View.GONE);
            onibus.setVisibility(View.GONE);
            caminhao.setVisibility(View.GONE);
            paraTransito.setVisibility(View.GONE);
        }else if (buttonView == transito && isChecked){//acidentes de transito
            capotagem.setVisibility(View.VISIBLE);
            colisao.setVisibility(View.VISIBLE);
            atropelamento.setVisibility(View.VISIBLE);
            moto.setVisibility(View.VISIBLE);
            fogo_veiculo.setVisibility(View.VISIBLE);
            afogamento.setVisibility(View.GONE);
            outros.setVisibility(View.GONE);
            mal.setVisibility(View.GONE);
            choque.setVisibility(View.GONE);
            agressao.setVisibility(View.GONE);
            parto.setVisibility(View.GONE);
            paraTransito.setVisibility(View.VISIBLE);
            pedestre.setVisibility(View.VISIBLE);
            ciclista.setVisibility(View.VISIBLE);
            motociclista.setVisibility(View.VISIBLE);
            carro.setVisibility(View.VISIBLE);
            onibus.setVisibility(View.VISIBLE);
            caminhao.setVisibility(View.VISIBLE);
        }else if(buttonView == aquatico && isChecked){//acidentes aquaticos
            capotagem.setVisibility(View.GONE);
            colisao.setVisibility(View.GONE);
            atropelamento.setVisibility(View.GONE);
            moto.setVisibility(View.GONE);
            fogo_veiculo.setVisibility(View.GONE);
            afogamento.setVisibility(View.VISIBLE);
            outros.setVisibility(View.GONE);
            mal.setVisibility(View.GONE);
            choque.setVisibility(View.GONE);
            agressao.setVisibility(View.GONE);
            parto.setVisibility(View.GONE);
            pedestre.setVisibility(View.GONE);
            ciclista.setVisibility(View.GONE);
            motociclista.setVisibility(View.GONE);
            carro.setVisibility(View.GONE);
            onibus.setVisibility(View.GONE);
            caminhao.setVisibility(View.GONE);
            paraTransito.setVisibility(View.GONE);
        }else if(buttonView == outro && isChecked){//outros
            capotagem.setVisibility(View.GONE);
            colisao.setVisibility(View.GONE);
            atropelamento.setVisibility(View.GONE);
            moto.setVisibility(View.GONE);
            fogo_veiculo.setVisibility(View.GONE);
            afogamento.setVisibility(View.GONE);
            outros.setVisibility(View.VISIBLE);
            mal.setVisibility(View.GONE);
            choque.setVisibility(View.GONE);
            agressao.setVisibility(View.GONE);
            parto.setVisibility(View.GONE);
            pedestre.setVisibility(View.GONE);
            ciclista.setVisibility(View.GONE);
            motociclista.setVisibility(View.GONE);
            carro.setVisibility(View.GONE);
            onibus.setVisibility(View.GONE);
            caminhao.setVisibility(View.GONE);
            paraTransito.setVisibility(View.GONE);
        }
    }
 }