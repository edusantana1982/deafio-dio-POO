import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();//Adicionando o curso1.
        curso1.setTitulo("Curso Java"); //adicionando pelo metodo set valores aos atributos.
        curso1.setDescricao("Descrição curso Java.");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();//Adicionando o curso1.
        curso2.setTitulo("Curso JavaScript"); //adicionando pelo metodo set valores aos atributos.
        curso2.setDescricao("Descrição curso JavaScript.");
        curso2.setCargaHoraria(4);

        //polimorfismo é quando podemos instanciar um objeto de varias formas


        //Nao podemos criar conteudo pq é uma classe abstrata e não pode ser instanciada.
        //mas podemos criar um curso a partir da classe conteudo.

        Mentoria mentoria1 = new Mentoria();//para criamos uma de fato instanciamos pela palavra new
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição mentoria Java");
        mentoria1.setData(LocalDate.now());//com o atributo local date puxamos a data de agora

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
        */
        Bootcamp bootcamp = new Bootcamp();//Cadastrando os bootcamps
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);//Inserindo os conteudos ao bootcamp
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devEduardo = new Dev();
        devEduardo.setNome("Eduardo");//inserindo um dev no bootcamp
        devEduardo.inscreverBootcamp(bootcamp);//para escrever o dev no bootcamp
        System.out.println("Conteúdos inscritos Eduardo" + devEduardo.getConteudosInscritos());
        devEduardo.progredir();//para que o aluno possa progredir no curso
        System.out.println("--");
        System.out.println("Conteúdos inscritos Eduardo" + devEduardo.getConteudosInscritos());
        System.out.println("Conteúdos inscritos Eduardo" + devEduardo.getConteudosConcluidos());
        System.out.println("XP: "+devEduardo.calcularXp());

        System.out.println("-------------------------------------------------");

        Dev devDavi = new Dev();
        devDavi.setNome("Davi");
        devDavi.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Davi" + devDavi.getConteudosInscritos());
        devDavi.progredir();
        devDavi.progredir();
        devDavi.progredir();
        System.out.println("--");
        System.out.println("Conteudos inscritos Davi" + devDavi.getConteudosInscritos());
        System.out.println("Conteudos inscritos Davi" + devDavi.getConteudosConcluidos());
        System.out.println("XP: "+devDavi.calcularXp());

    }
}