package src;

import src.br.com.was.desafio.dominio.Bootcamp;
import src.br.com.was.desafio.dominio.Curso;
import src.br.com.was.desafio.dominio.Dev;
import src.br.com.was.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devWillie = new Dev();
        devWillie.setNome("Willie");
        devWillie.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Willie:" + devWillie.getConteudosInscritos());
        devWillie.progredir();
        devWillie.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Willie:" + devWillie.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Willie:" + devWillie.getConteudosConcluidos());
        System.out.println("XP:" + devWillie.calcularTotalXp());

        System.out.println("===================================================================");

        Dev devJonh = new Dev();
        devJonh.setNome("Jonh");
        devJonh.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Jonh:" + devJonh.getConteudosInscritos());
        devJonh.progredir();
        devJonh.progredir();
        devJonh.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Jonh:" + devJonh.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Jonh:" + devJonh.getConteudosConcluidos());
        System.out.println("XP:" + devJonh.calcularTotalXp());

        System.out.println("==============================");
        System.out.println("Finalizando a Aplicação....");
        System.out.println("==============================");
        System.out.println("Obrigado por Testar... Fim!!!");

    }

}