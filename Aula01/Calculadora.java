import java.util.Scanner;

public class Calculadora {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

// Leitura dos dois números
System.out.print("Digite o primeiro número: ");
double num1 = scanner.nextDouble();

System.out.print("Digite o segundo número: ");
double num2 = scanner.nextDouble();

// Menu de opções
System.out.println("\nEscolha a operação:");
System.out.println("1 - Adição");
System.out.println("2 - Subtração");
System.out.println("3 - Multiplicação");
System.out.println("4 - Divisão");
System.out.print("Opção: ");
int opcao = scanner.nextInt();

// Processamento da escolha
switch (opcao) {
case 1:
System.out.println("Operação escolhida: Adição");
System.out.println("Resultado: " + adicao(num1, num2));
break;
case 2:
System.out.println("Operação escolhida: Subtração");
System.out.println("Resultado: " + subtracao(num1, num2));
break;
case 3:
System.out.println("Operação escolhida: Multiplicação");
System.out.println("Resultado: " + multiplicacao(num1, num2));
break;
case 4:
System.out.println("Operação escolhida: Divisão");
if (num2 != 0) {
System.out.println("Resultado: " + divisao(num1, num2));
} else {
System.out.println("Não é possível dividir por zero!");
}
break;
default:
System.out.println("Opção inválida!");
}

scanner.close();
}

// Métodos para cada operação
public static double adicao(double a, double b) {
return a + b;
}

public static double subtracao(double a, double b) {
return a - b;
}

public static double multiplicacao(double a, double b) {
return a * b;
}

public static double divisao(double a, double b) {
return a / b;
}
}
