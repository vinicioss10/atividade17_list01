import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Entradas
        // -> O programa deverá pedir o tamanho em metros quadrados da área a ser
        // pintada.
        Scanner teclado = new Scanner(System.in);

        System.out.print("Entre com a metragem a ser pintada em m2: ");
        double metragem = teclado.nextDouble();

        System.out.println("");

        System.out.print("Entre com o nome do pintor: ");
        String nome = teclado.next();

        teclado.close();
        // Processamento
        // -> Cobertura 1 litro por 6 metros quadrados
        double rendimentoLitros = 6;

        // -> Lata 18 litros = R$ 80,00
        double precoLata = 80.00;
        double volumeLataLitros = 18;

        // -> Galões 3.6 litros = R$ 25,00
        double precoGalao = 25.00;
        double volumeGalao = 3.6;

        // Calcular qts latas de tinta
        double quantidadeLatas = metragem / (volumeLataLitros * rendimentoLitros);
        // Calcular o valor total em latas
        double valorTotalLatas = quantidadeLatas * precoLata;

        // Calcular qts galões de tinta
        double quantidadeGaloes = metragem / (volumeGalao * rendimentoLitros);
        double valorTotalGaloes = quantidadeGaloes * precoGalao;

        // Quantidade a pintar para mistura
        double metragemMistura = metragem * 1.1;
        double quantidadeLatasMistura = metragemMistura / (volumeLataLitros * rendimentoLitros);
        double quantidadeLatasMisturaArredondada = Math.ceil(metragemMistura / (volumeLataLitros * rendimentoLitros));
        double quantidadeDesperdicioLata = quantidadeLatasMisturaArredondada - quantidadeLatasMistura;
        double quatidadeLitrosAConverterEmGaloes = (1 - quantidadeDesperdicioLata) * volumeLataLitros;
        double quantidadeEmGaloesArredondada = Math.ceil(quatidadeLitrosAConverterEmGaloes / volumeGalao);
        double quantidadeEmLataFinal = Math.floor(quantidadeLatasMistura);

        // Calcular qts galões de 3,6 litros
        // Calcular a melhor quantidade de latas e galões, considerando quantides de
        // latas e galões cheios e 10% de folga. Arredondando para cima
        // Saídas
        // Apresentar os resultados dos cálculos
        System.out.printf("A metragem a ser pintada por %s é de %f metros quadrados", nome, metragem);
        System.out.println("");
        System.out.printf("A quantidade de latas é %f e o valor total em latas é %f", quantidadeLatas, valorTotalLatas);
        System.out.println("");
        System.out.printf("A quantidade de galões é %f e o valor total em galões é %f", quantidadeGaloes,
                valorTotalGaloes);
        System.out.println("");
        System.out.printf("A metragem para mistura é igual a %f", metragemMistura);
        System.out.println("");
        System.out.printf("A quantidade de latas para mistura é igual a %f", quantidadeLatasMistura);
        System.out.println("");
        System.out.printf("A quantidade de latas para mistura arredondada é igual a %f",
                quantidadeLatasMisturaArredondada);
        System.out.println("");
        System.out.printf("A quantidade desperdício na lata %f", quantidadeDesperdicioLata);
        System.out.println("");
        System.out.printf("A quantidade em litros a ser usada em galões é %f", quatidadeLitrosAConverterEmGaloes);
        System.out.println("");
        System.out.printf("A quantidade arredondada em galões é %f", quantidadeEmGaloesArredondada);
        System.out.println("");
        System.out.printf("A quantidade final em latas é %f e em galões é %f", quantidadeEmLataFinal,
                quantidadeEmGaloesArredondada);
    }

}