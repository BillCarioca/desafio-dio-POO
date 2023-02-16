import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Set<Conteudo> conteudoSet = new LinkedHashSet<>();
        conteudoSet.add(new Curso("Curso Java","Descrição curso de Java",8));
        conteudoSet.add(new Curso("Curso JS","Descrição curso de JS",4));
        conteudoSet.add(new Mentoria("Mentoria de Java","Descrição mentoria de Java",LocalDate.now()));
        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer","Decrição Bootcamp Java Developer",conteudoSet);
        Set<Dev> devSet = new LinkedHashSet<>();
        devSet.add(new Dev("Bill"));
        devSet.add(new Dev("Camila"));
        devSet.stream().forEach(Dev::relatorioDev);
        System.out.println("-----------------");
        devSet.stream().forEach(dev-> dev.inscreverBootcamp(bootcamp));
        devSet.stream().forEach(Dev::relatorioDev);
        System.out.println("-----------------");
        devSet.stream().filter(dev-> dev.getNome()=="Bill").forEach(Dev::progredir);
        devSet.stream().filter(dev-> dev.getNome()=="Camila").forEach(Dev::progredir);
        devSet.stream().forEach(Dev::relatorioDev);
        System.out.println("-----------------");
        devSet.stream().filter(dev-> dev.getNome()=="Bill").forEach(Dev::progredir);
        devSet.stream().filter(dev-> dev.getNome()=="Bill").forEach(Dev::progredir);
        devSet.stream().filter(dev-> dev.getNome()=="Camila").forEach(Dev::progredir);
        devSet.stream().forEach(Dev::relatorioDev);

    }
}
