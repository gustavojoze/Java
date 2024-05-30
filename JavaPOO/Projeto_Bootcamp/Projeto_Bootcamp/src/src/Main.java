

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Curso voltado para o mercado");
        curso1.setCargaHoraria(40);
        System.out.println(curso1);
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria java");
        mentoria1.setDescricao("Mentoria sobre java");
        mentoria1.setData(LocalDate.now());
        System.out.println(mentoria1);
    }
}