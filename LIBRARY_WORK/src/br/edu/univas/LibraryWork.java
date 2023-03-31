package br.edu.univas;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class LibraryWork {
    public static void main(String[] args) throws IOException {
        menu();
    }
    public static void menu() throws IOException {
        Scanner read = new Scanner(System.in);
        while (true){
        System.out.println("""
                        Escolha uma opção
                
                1. Cadastrar livro.
                2. Buscar livro.
                3. Excluir livro.
                4. Gerar relatório.
                9. Sair.
                """);
        int opcao = read.nextInt();

        if(opcao == 1) {cadastrarLivro();}
        if(opcao == 2){buscarLivro();}
        if(opcao == 3){excluirLivro();}
        if(opcao == 4){gerarRelatorio();}
        if(opcao == 9) {System.out.println("Saindo!... até mais:)");break;}
        }

    }
    public static void cadastrarLivro()throws IOException{
        while (true) {
            Scanner read = new Scanner(System.in);

            System.out.println("Digite o nome do livro:");
            String nomeDoLivro = read.nextLine();

            System.out.println("Digite o nome do autor:");
            String nomeDoAutor = read.nextLine();

            System.out.println("Digite a área de interesse:");
            String areaDeInteresse = read.nextLine();
            String numeroDePaginas;
            while (true) {
            System.out.println("Digite o número de páginas:");
            numeroDePaginas = read.next();
                if (numeroDePaginas.matches("\\d+")) {
                    break;
                } else {
                    System.out.println("Somente números!");
                }
            }
            String cadastro = nomeDoLivro + "," + nomeDoAutor + "," + areaDeInteresse + "," + numeroDePaginas;

            String filename = "C:\\Users\\galof\\OneDrive\\Área de Trabalho\\cvs.csv";

            BufferedWriter writer = new BufferedWriter(new FileWriter(filename,true));
            writer.write(cadastro);
            writer.newLine();
            writer.close();

            System.out.println("\nDados gravados com sucesso!\n");


            System.out.println("""
                    Deseja cadastrar outro livro?
                    1. Sim
                    2. Nao
                    """);
            int continuarOuNao = read.nextInt();
            if (continuarOuNao == 2) {
                break;
            }
        }
    }
    public static void buscarLivro() throws IOException {
        Scanner read = new Scanner(System.in);
        String [] dados = Files.readAllLines(Paths.get("C:\\Users\\galof\\OneDrive\\Área de Trabalho\\cvs.csv")).toArray(new String[0]);


            while (true) {
                if(dados.length == 0) {
                    System.out.println("Não há nenhum livro cadastrado no momento!\n");
                    break;
                }
                System.out.println("""
                                Por qual dado voce deseja buscar o livro?
                                
                        1. Título.
                        2. Nome de autor.
                        3. Área de interesse.
                        4. Número de páginas.
                                
                        """);
                int opcao = read.nextInt();
                read.nextLine();
                if (opcao == 1) {
                    System.out.println("Qual o título do livro?");
                    String nomeDoLivro = read.nextLine();
                    boolean encontrado = false;
                    for (int i = 0; i < dados.length; i++) {
                        String[] campos = dados[i].split(",");
                        if (campos[0].equals(nomeDoLivro)) {
                            encontrado = true;
                            System.out.println("\nDados encontrados!: "+dados[i]+"\n");
                        }
                    }
                    if(!encontrado){
                        System.out.println("\nLivro não encontrado! Tente novamente.\n");
                    }
                }
                else if (opcao == 2) {
                    System.out.println("Qual o nome do autor?");
                    String nomeDoAutor = read.nextLine();
                    boolean encontrado = false;
                    for (int i = 0; i < dados.length; i++) {
                        String[] campos = dados[i].split(",");
                        if (campos[1].equals(nomeDoAutor)) {
                            encontrado = true;
                            System.out.println("\nDados encontrados!: "+dados[i]+"\n");
                        }
                    }
                    if(!encontrado){
                        System.out.println("\nAutor não encontrado! Tente novamente.\n");
                    }
                }
                else if (opcao == 3) {
                    System.out.println("Qual a área de interesse?");
                    String areaDeInteresse = read.nextLine();
                    boolean encontrado = false;
                    for (int i = 0; i < dados.length; i++) {
                        String[] campos = dados[i].split(",");
                        if (campos[2].equals(areaDeInteresse)) {
                            encontrado = true;
                            System.out.println("\nDados encontrados!: "+dados[i]+"\n");
                        }
                    }
                    if(!encontrado){
                        System.out.println("\nÁrea de interesse não encontrada! Tente novamente.\n");
                    }
                }
                else if (opcao == 4) {
                    System.out.println("Qual o número de páginas?");
                    String numeroDePaginas = read.nextLine();
                    boolean encontrado = false;
                    for (int i = 0; i < dados.length; i++) {
                        String[] campos = dados[i].split(",");
                        if (campos[3].equals(numeroDePaginas)) {
                            encontrado = true;
                            System.out.println("\nDados encontrados!: "+dados[i]+"\n");
                        }
                    }
                    if(!encontrado){
                        System.out.println("\nNúmero de páginas não encontrada! Tente novamente.\n");
                    }
                }
                System.out.println("""
                        Deseja buscar outro livro?
                        1. Sim
                        2. Nao
                        """);
                int continuarOuNao = read.nextInt();
                if (continuarOuNao == 2) {
                    break;
                }
            }
    }
    public static void excluirLivro() throws IOException {
        Scanner read = new Scanner(System.in);

            while (true) {
                String [] dados = Files.readAllLines(Paths.get("C:\\Users\\galof\\OneDrive\\Área de Trabalho\\cvs.csv")).toArray(new String[0]);
                if(dados.length == 0) {
                    System.out.println("\nNão há nenhum livro cadastrado no momento!\n");
                    break;
                }
                System.out.println("""
                                Por qual dado voce deseja excluir o livro?
                                
                        1. Título.
                        2. Nome de autor.
                        3. Área de interesse.
                        """);
                int opcao = read.nextInt();
                read.nextLine();
                if (opcao == 1) {
                    BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\galof\\OneDrive\\Área de Trabalho\\cvs.csv"));

                    System.out.print("Qual o nome do livro a ser excluído?");
                    String stringToExclude = read.nextLine();

                    boolean encontrado = false;
                    for (int i = 0; i < dados.length; i++) {
                        String[] campos = dados[i].split(",");
                        if (!campos[0].equals(stringToExclude)) {
                            writer.write(dados[i]);
                            writer.newLine();
                        }
                        if (campos[0].equals(stringToExclude)){
                            encontrado = true;
                            System.out.println("\nDados excluídos com sucesso!\n");
                        }
                    }
                    if(!encontrado){
                        System.out.println("\nLivro não encontrado! Tente novamente.\n");
                    }
                    writer.close();
                }

                else if (opcao == 2) {
                    BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\galof\\OneDrive\\Área de Trabalho\\cvs.csv"));

                    System.out.print("Qual o nome do autor a ser excluído?");
                    String stringToExclude = read.nextLine();

                    boolean encontrado = false;
                    for (int i = 0; i < dados.length; i++) {
                        String[] campos = dados[i].split(",");
                        if (!campos[1].equals(stringToExclude)) {
                            writer.write(dados[i]);
                            writer.newLine();
                        }
                        if (campos[1].equals(stringToExclude)){
                            encontrado = true;
                            System.out.println("\nDados excluídos com sucesso!\n");
                        }
                    }
                    if(!encontrado){
                        System.out.println("\nAutor não encontrado! Tente novamente.\n");
                    }
                    writer.close();
                }
                else if (opcao == 3) {
                    BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\galof\\OneDrive\\Área de Trabalho\\cvs.csv"));

                    System.out.print("Qual a área de interesse a ser excluída?");
                    String stringToExclude = read.nextLine();

                    boolean encontrado = false;
                    for (int i = 0; i < dados.length; i++) {
                        String[] campos = dados[i].split(",");
                        if (!campos[2].equals(stringToExclude)) {
                            writer.write(dados[i]);
                            writer.newLine();
                        }
                        if (campos[2].equals(stringToExclude)){
                            encontrado = true;
                            System.out.println("\nDados excluídos com sucesso!\n");
                        }
                    }
                    if(!encontrado){
                        System.out.println("\nÁrea de interesse não encontrada! Tente novamente.\n");
                    }
                    writer.close();
                }
                System.out.println("""
                        Deseja excluir outro livro?
                        1. Sim
                        2. Nao
                        """);
                int continuar = read.nextInt();
                read.nextLine();
                if (continuar == 2) {
                    break;
                }
            }
    }
    public static void gerarRelatorio() throws IOException {
        String [] dados = Files.readAllLines(Paths.get("C:\\Users\\galof\\OneDrive\\Área de Trabalho\\cvs.csv")).toArray(new String[0]);

        if(dados.length == 0) {
            System.out.println("Não há nenhum livro cadastrado no momento!\n");
        }
        else {
            System.out.println("Nome do livro / nome do autor / área de intesse / número de páginas\n");

            for (int i = 0; i < dados.length; i++) {
                System.out.println("Livro " + (i + 1) + ": " + dados[i].replace(",", "/"));
            }
        }

    }
}
