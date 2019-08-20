package br.ici.treinamento.atmconsultoria.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import br.ici.treinamento.atmconsultoria.R;
import mehdi.sakout.aboutpage.AboutPage;

public class SobreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_sobre);

        String descricao = "A ATM consultoria tem como missão apoiar as organizações que desejam alcançar o sucesso atraves da excelencia em gestão e da busca  pela qualidade.\n\n" +
                "Nosso Trabalho é da suporte as empresas  que desejam se certificar  em padrões  de qualidade ou investir no desenvolvimento e evolução da sua gestão, por meio da otimização de processos e da dissiminação dos fundamentos e criterios de excelencia.";

        View sobre = new AboutPage(this)
                .setImage(R.drawable.logo)
                .setDescription(descricao)
                .addGroup("Fale Conosco:")
                .addEmail("atmconsultoria@gmail.com","E-mail")
                .addWebsite("https://google.com.br/","Site")
                .addGroup("Rdes Sociais:")
                .addFacebook("google")
                .addTwitter("google")
                .addYoutube("google")
                .addPlayStore("com.google.android.apps.plus")
                .addGitHub("google")
                .addInstagram("google")
                .create();

        setContentView(sobre);
    }
}
