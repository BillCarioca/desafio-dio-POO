import br.com.dio.desafio.dominio.*;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso de Java");
        curso1.setCargaHoraria(8);
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso de JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição mentoria de Java");
        mentoria1.setData(LocalDate.now());
      /*  System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Decrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        Dev devBill = new Dev();
        devBill.setNome("Bill");
        devBill.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos "+devBill.getNome()+": "+devBill.getConteudosInscritos());
        devBill.progredir();
        System.out.println("-----------------");
        System.out.println("Conteúdos Incritos "+devBill.getNome()+": "+devBill.getConteudosInscritos());
        System.out.println("Conteúdos concluidos "+devBill.getNome()+": "+devBill.getConteudosConcluidos());
        System.out.println("XP"+ devBill.calcularTotalXp());
        System.out.println("-----------------");
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos "+devCamila.getNome()+": "+devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("-----------------");
        System.out.println("Conteúdos Incritos "+devCamila.getNome()+": "+devCamila.getConteudosInscritos());
        System.out.println("Conteúdos concluidos "+devCamila.getNome()+": "+devCamila.getConteudosConcluidos());
        System.out.println("XP"+ devCamila.calcularTotalXp());

    }
}
