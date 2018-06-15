package jonathan.exerciciorestaurante;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edt1, edt2, edt3, edt4, edt5, edt6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1 = (EditText)findViewById(R.id.edt_consumo);
        edt2 = (EditText)findViewById(R.id.edt_couvert_artistico);
        edt3 = (EditText)findViewById(R.id.edt_dividir);
        edt4 = (EditText)findViewById(R.id.edt_servico);
        edt5 = (EditText)findViewById(R.id.edt_conta_total);
        edt6 = (EditText)findViewById(R.id.edt_valor_pessoa);

    }

    public void Calcular(View view) {

        if(edt1.getText().toString().equals("") || edt2.getText().toString().equals("") ||
                edt3.getText().toString().equals("")) {
            Toast.makeText(this, "Preencha todos os campos!", Toast.LENGTH_LONG).show();

        }else{
            Double consumo, artistico, taxa, contatotal, valorpessoa, soma;
            int npessoas;
            consumo = Double.parseDouble(edt1.getText().toString());
            artistico = Double.parseDouble(edt2.getText().toString());
            npessoas = Integer.parseInt(edt3.getText().toString());

            if(npessoas == 0){
                Toast.makeText(this, "O número de pessoas deve ser maior que 0!",
                        Toast.LENGTH_LONG).show();
            }else {

                soma = consumo + artistico;
                taxa = soma * 0.1;
                contatotal = soma + taxa;
                valorpessoa = contatotal / npessoas;

                edt4.setText(String.format("%.2f",taxa));
                edt5.setText(String.format("%.2f",contatotal));
                edt6.setText(String.format("%.2f",valorpessoa));

            }

        }

    }

}
