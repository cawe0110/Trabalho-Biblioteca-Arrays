package br.com.senai;

import br.com.senai.model.Biblioteca;
import br.com.senai.model.Livro;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args){
        ArrayList<Livro> book = new ArrayList<Livro>();
        Livro Medo = new Livro("0001", "Osho", "Medo");
        Livro Agilidade_emocinal = new Livro("0002", "Susan David", "Agilidade Emocional");
        Livro Conversas_dificeis = new Livro("0003", "Douglas Stone", "Coversas Dificeis");
        Livro Labirinto_do_Fauno = new Livro("0004", "Guilhermo Deltoro", "Labirinto do Fauno");
        Livro A_Menina_que_Roubava_Livros = new Livro("0005", "Markus Zuzak", "A Menina que Roubava Livros");
        Livro Death_Note = new Livro("0006", "Tsugumi Ohba", "Death Note");
        Livro Formigas= new Livro("0007", "William Douglas", "Formigas");

        ArrayList<Biblioteca> floripa = new ArrayList<Biblioteca>();
        floripa.add(new Biblioteca("Floripa", "2222", Medo));
        floripa.add(new Biblioteca("Floripa", "2222", Agilidade_emocinal));
        floripa.add(new Biblioteca("Floripa", "2222", Conversas_dificeis));
        floripa.add(new Biblioteca("Floripa", "2222", Labirinto_do_Fauno));
        floripa.add(new Biblioteca("Floripa", "2222", A_Menina_que_Roubava_Livros));
        for(int i=0 ; i<floripa.size(); i++)
        {
            System.out.println
                ("{" + floripa.get(i).getNome_bibli()
                +" "+ floripa.get(i).getId_bibli() + "}"+" "+
                floripa.get(i).getLivros().getNome() +" / "+ floripa.get(i).getLivros().getId_livro()
                        +" / "+ floripa.get(i).getLivros().getAutor());
        }

        ArrayList<Biblioteca> itajai = new ArrayList<Biblioteca>();
        itajai.add(new Biblioteca("Itajai", "1111", Medo));
        itajai.add(new Biblioteca("Itajai", "1111", A_Menina_que_Roubava_Livros));
        itajai.add(new Biblioteca("Itajai", "1111", Death_Note));
        itajai.add(new Biblioteca("Itajai", "1111", Formigas));
        itajai.add(new Biblioteca("Itajai", "1111", Conversas_dificeis));
        for(int i=0 ; i<itajai.size(); i++)
        {
            System.out.println
                    ("{" + itajai.get(i).getNome_bibli()
                            +" "+ itajai.get(i).getId_bibli() + "}"+" "+
                            itajai.get(i).getLivros().getNome() + " / " + itajai.get(i).getLivros().getId_livro()+
                            " / "+ itajai.get(i).getLivros().getAutor());
        }
    }
}
