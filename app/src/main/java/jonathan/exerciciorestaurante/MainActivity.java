package jonathan.exerciciorestaurante;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edt1, edt2, edt3, edt4, edt5, edt6;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1 = (EditText)findViewById(R.id.edt_consumo);
        edt2 = (EditText)findViewById(R.id.edt_couvert_artistico);
        edt3 = (EditText)findViewById(R.id.edt_dividir);
        bt = (Button)findViewById(R.id.bt_calcular);
        edt4 = (EditText)findViewById(R.id.edt_servico);
        edt5 = (EditText)findViewById(R.id.edt_conta_total);
        edt6 = (EditText)findViewById(R.id.edt_valor_pessoa);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double consumo, artistico, taxa, contatotal, valorpessoa, soma;
                int npessoas;
                consumo = Double.parseDouble(edt1.getText().toString());
                artistico = Double.parseDouble(edt2.getText().toString());
                npessoas = Integer.parseInt(edt3.getText().toString());
                soma = consumo+artistico;
                taxa = soma*0.1;
                contatotal = soma+taxa;
                valorpessoa = contatotal/npessoas;

                edt4.setText(taxa.toString());
                edt5.setText(contatotal.toString());
                edt6.setText(valorpessoa.toString());

            }
        });

    }

}
