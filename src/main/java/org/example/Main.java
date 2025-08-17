package org.example;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // double peso = 0;
        // double altura = 0;
        // Scanner leitor = new Scanner(System.in);

        // System.out.println("Qual sua altura: ");
        // altura = leitor.nextDouble();

        // System.out.println("Qual seu peso: ");
        // peso = leitor.nextDouble();

        // exercicio01();
        // exercicio02();
        // exercicio03();
        // exercicio04();
        // exercicio05();
        // exercicio06();
        // double imc = calcularIMC(peso, altura);
        exercicio08();
        // System.out.println("Peso: " + peso);
        // System.out.println("Altura: " + altura);
        // System.out.println("IMC: " + String.format("%.2f", imc));
    }

    static void exercicio01() {
        //Cria um scanner na memória
        Scanner test = new Scanner(System.in);

        //Peço para o usuário digitar seu nome
        System.out.println("Name: ");

        //Leio o nome e gravo numa variável
        String name = test.nextLine();

        String message = "Hello World retry! My name is ".concat(name);
        System.out.println(message);
    }

    static void exercicio02() {
        String name = "Mariana Silva";
        String cargo = "Analista de sistemas";
        Double salario = 4500.00;

        System.out.println("Nome: ".concat(name));
        System.out.println("Cargo: ".concat(cargo));
        System.out.println("Salário: " + salario);
    }

    static void exercicio03() {
        String nome;
        int codigo;
        double preco;
        boolean promo;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        nome = leitor.nextLine();

        System.out.println("Digite o codigo do produto: ");
        codigo = leitor.nextInt();

        System.out.println("Digite o preço do produto: ");
        preco = leitor.nextDouble();

        System.out.println("Promoção? (true/false): ");
        promo = leitor.nextBoolean();

        System.out.println("Produto: " + nome);
        System.out.println("Código: " + codigo);
        System.out.println("Preço: " + preco);
        System.out.println("Promoção: " + promo);

    }

    static void exercicio04() {
        Scanner leitor = new Scanner(System.in);
        Double valorCompra;

        System.out.println("Digite o valor da compra: ");
        valorCompra = leitor.nextDouble();

        if(valorCompra > 100) {
            System.out.println("Preço final: " + (valorCompra * 0.9));
        } else {
            System.out.println("Preço final: " + valorCompra);
        }
    }

    static void exercicio05() {
        int idade;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        idade = leitor.nextInt();

        if(idade < 12) {
            System.out.println("Categoria: Infantil");
        } else if (idade >= 12 && idade <= 17) {
            System.out.println("Categoria: Adolescente");
        } else {
            System.out.println("Categoria: Adulto");
        }
    }

    static void exercicio06() {
        int notas[] = {7, 8, 9, 10};
        double soma_das_notas = 0;
        System.out.println("Notas: " + notas[0] + " "+ notas[1] + " " + notas[2] + " " + notas[3]);
        for (int i = 0; i < notas.length; i++) {
            soma_das_notas += notas[i];
        }
        System.out.println("Média: " + soma_das_notas / notas.length);
    }

    static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    static void exercicio08() {
        String nome = "";

        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual seu nome: ");
        nome = leitor.nextLine();

        System.out.println("Número de caracteres(SEM ESPAÇO): " + nome.replaceAll("\\s+", "").length());
        System.out.println("Maiúsculas: " + nome.toUpperCase());
        System.out.println("Contém \"Silva\": " + nome.toUpperCase().contains("SILVA"));
    }
}
