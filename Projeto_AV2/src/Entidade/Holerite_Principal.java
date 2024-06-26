package Entidade;

import java.util.Scanner;

public class Holerite_Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.println("|========================================================|");
        System.out.println("|                                                        |");
        System.out.println("|                  ALGORITIMOS E PROGRAMAÇÃO 2           |");
        System.out.println("|                  TRABALHO VÁLIDO COMO AV2              |");
        System.out.println("|                                                        |");
        System.out.println("|========================================================|");

        int opcao = 0;

        while (opcao != 3) {
            System.out.println("|========================================================|");
            System.out.println("|                                                        |");
            System.out.println("|                    1 - NOVO HOLERITE                   |");
            System.out.println("|                    2 - INFORMAÇÕES DO SISTEMA          |");
            System.out.println("|                    3 - SAIR                            |");
            System.out.println("|                                                        |");
            System.out.println("|========================================================|");

            System.out.print("\nESCOLHA UMA DAS OPÇÕES: ");
            opcao = sc.nextInt();

            ///////////////////////////////////////////////////////////////
            switch (opcao) {
                case 1:
                    System.out.print("\nCALCULAR NOVO HOLERITE\n");

                    System.out.print("INFORME O NUMERO DE HOLERITES QUE SERÃO PROCESSADOS: ");
                    int n = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < n; i++) {
                        String nomeFuncionario;
                        if (n == 1) {
                            System.out.print("DIGITE O NOME DO FUNCIONARIO: ");
                            nomeFuncionario = sc.nextLine();
                            sc.nextLine();
                        } else {
                            System.out.printf("DIGITE O NOME DO %dº FUNCIONARIO: ", i + 1);
                            nomeFuncionario = sc.nextLine();
                            sc.nextLine();
                        }

                        System.out.print("INFORME O SALARIO BRUTO DO FUNCIONARIO: R$");
                        double salarioBruto = sc.nextDouble();

                        System.out.print("INFORME O NUMERO DE HORAS TRABALHADAS: ");
                        double horasTrabalhadas = sc.nextDouble();

                        System.out.print("INFORME O NUMERO DE HORAS EXTRAS: ");
                        double horasExtras = sc.nextDouble();
                        
                        System.out.print("INFORME O VALOR DO BONÛS: ");
                        double bonus = sc.nextDouble();
                       
                        

                        Funcionario funcionario = new Funcionario(nomeFuncionario, salarioBruto, horasTrabalhadas, horasExtras, bonus);
                        //funcionario.bonus();
                        funcionario.calcularHorasExtras();
                        funcionario.calcularPensao(sc);
                        funcionario.calcularINSS();
                        funcionario.calcularIRPF();
                        funcionario.calcularValeTransporte(sc);
                        funcionario.calcularValeRefeicao();
                        funcionario.calcularValeAlimentacao();
                        funcionario.calcularConvenioMedico();
                        funcionario.gerarHolerite();

                        double resultado = funcionario.calcularResultado();
                       
                        System.out.printf("\n| Resultado para %s: R$ %.2f\n\n", funcionario.getNome(), resultado);
                    }
                    break;

                case 2:
                    int opcao2 = 0;
                    System.out.print("\nGRUPO DO PROJETO: \n\nFELIPE GONÇALVES DE SOUZA\nPEDRO HENRIQUE SOUZA SANTOS JOAQUIM\n" 
                    		+ "\nALEF KAIQUE SANTOS ALMDEIDA DE ARAUJO\nMARIA EDUARDA LEONARDO DE SOUZA\nBRUNO SANTIAGO DO SANTOS\nSTEPHANIE SILVESTRE MENDONCA LISSE\n");
                    System.out.println("\nDESEJA VOLTAR AO MENU PRINCIPAL?\n|1|SIM|\n|2|NÃO|");
                    opcao2 = sc.nextInt();

                    if (opcao2 == 1) {
                        System.out.println("\nESCOLHA OUTRA OPÇÃO:");
                    } else {
                        System.out.println("\nVOCÊ ESCOLHEU SAIR, ADEUS");
                        System.exit(0);
                    }
                    break;

                case 3:
                    System.out.print("\nSAINDO DO PROGRAMA, ADEUS|");
                    System.exit(0);
                    break;

                default:
                    System.out.println("\nOPÇÃO INVÁLIDA, TENTE NOVAMENTE:");
            }
        }
    }
}



