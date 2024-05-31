

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Curso voltado para o mercado");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Curso voltado para o mercado");
        curso2.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria com Camila");
        mentoria1.setDescricao("Mentoria sobre java com a professora Camila");
        mentoria1.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java da DIO");
        bootcamp.setDescricao("Assuntos: POO, SpringBoot, Conceitos basicos java. ");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devgustavo = new Dev();
        devgustavo.setNome("gustavo");
        System.out.println(devgustavo);
        devgustavo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos incritos"+devgustavo.getConteudosInscritos());
        System.out.println("Xp:"+devgustavo.calcularTotalXp());
        devgustavo.progredir();
        devgustavo.progredir();
        System.out.println("-----------");
        System.out.println("Conteudos incritos"+devgustavo.getConteudosInscritos());
        System.out.println("Conteudos concluidos"+devgustavo.getConteudosConcluidos());
        System.out.println("Xp:"+devgustavo.calcularTotalXp());
        System.out.println("<======================================>");
        Dev devcamila = new Dev();
        devcamila.setNome("camila");
        System.out.println(devcamila);
        devcamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos incritos"+devcamila.getConteudosInscritos());
        System.out.println("Xp:"+devcamila.calcularTotalXp());
        devcamila.progredir();
        System.out.println("-----------");
        System.out.println("Conteudos incritos"+devgustavo.getConteudosInscritos());
        System.out.println("Conteudos concluidos"+devcamila.getConteudosConcluidos());
        System.out.println("Xp:"+devcamila.calcularTotalXp());
    }
}