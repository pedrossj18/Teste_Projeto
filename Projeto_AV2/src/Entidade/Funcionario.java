package Entidade;

import java.util.Scanner;

public class Funcionario {
    private String nome;
    private double salarioBruto;
    private double horasTrabalhadas;
    private double horasExtras;
    private double bonus;
        
    double valorpensao;
    double descontoPensao;
    
    double valeTransporte;
    double valeAlimentacao;
    double valeRefeicao;
    double convenioMedico;
    
    double corte;
    
    double inss1 = 7.5 / 100;// Até R$ 1.320,00 7,5%
    double inss2 = 9.0 / 100;// De R$ 1.320,01 a R$ 2.571,29 9%
    double inss3 = 12.0 / 100;// De R$ 2.571,30 até R$ 3.856,94 12%
    double inss4 = 14.0 / 100;// De R$ 3.856,95 até R$ 7.507,49 14%
    
    double irpf1 = 0; // Até R$ 2.112,00
    double irpf2 = 7.5 / 100; // De R$ 2.112,01 até R$ 2.826,65
    double irpf3 = 15.0 / 100; // De R$ 2.826,66 até R$ 3.751,05
    double irpf4 = 22.5 / 100; // De R$ 3.751,06 até R$ 4.664,68
    double irpf5 = 27.5 / 100; // Acima de R$ 4.664,68
    
    double inss = 0;
    double irpf = 0;


    public Funcionario(String nome, double salarioBruto, double horasTrabalhadas, double horasExtras, double bonus) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.horasTrabalhadas = horasTrabalhadas;
        this.horasExtras = horasExtras;
        this.bonus = bonus;
    }

    public void calcularHorasExtras() {
        double valorHora = salarioBruto / horasTrabalhadas;
        double pagamentoHorasExtras = valorHora * 1.5 * (int)horasExtras;
        double calcularBonus = bonus;
        this.salarioBruto += pagamentoHorasExtras + calcularBonus;
        System.out.printf("TOTAL GANHO POR HORAS EXTRAS TRABALHADAS: %.2f%n", pagamentoHorasExtras);
        
        
    }
    
    public void calcularPensao(Scanner sc) {

        System.out.println("\nO FUNCIONÁRIO PAGA PENSÃO ");
        System.out.println("|1|SIM\n|2|NÃO");
        this.descontoPensao = sc.nextDouble();

        if (descontoPensao == 1) {
            System.out.print("\nDIGITE O VALOR DA PENSÃO PAGA R$ ");
            this.valorpensao = sc.nextDouble();
        } else if (descontoPensao == 2) {
            this.valorpensao = 0;
        }


    }
    
    public void calcularINSS() {
    	
    			if (salarioBruto <= 1320) {
	           		inss = salarioBruto * inss1;
        		}else if (salarioBruto < 2571.29) {
		        	inss = salarioBruto * inss2;
        		}else if (salarioBruto < 3856.94) {
		        	inss = salarioBruto * inss3;
        		}else {
		            inss = salarioBruto * inss4;
		        } 
    			
    }

    public void calcularIRPF() {
        double cbir = salarioBruto - inss - descontoPensao - valorpensao; // cbir = CÁLCULO BASE IMPOSTO DE RENDA

        if (cbir <= 2112) {
            irpf = cbir * irpf1;
        } else if (cbir <= 2826.65) {
            irpf = cbir * irpf2;
        } else if (cbir <= 3751.05) {
            irpf = cbir * irpf3;
        } else if (cbir <= 4664.68) {
            irpf = cbir * irpf4;
        } else {
            irpf = cbir * irpf5;
        }
        
        ////////////////////////////////////////////////////////

        if (cbir <= 2112) {
            corte = 0 + irpf;
        } else if (cbir <= 2826.65) {
            corte = irpf - 158.40;
        } else if (cbir <= 3751.05) {
            corte = irpf - 370.40;
        } else if (cbir <= 4664.68) {
            corte = irpf - 651.73;
        } else if (cbir > 4664.68) {
            corte = irpf - 884.96;
        }

        double salarioLiquido = salarioBruto - inss - corte;
    }
	    public void calcularValeTransporte(Scanner sc) {
	        System.out.println("|O FUNCIONÁRIO ULTILIZA VALE-TRANSPORTE?|\n\n|1|SIM\n|2|NÃO ");
	        double vt = sc.nextInt();
	
	        if (vt == 1) {
	            this.valeTransporte = salarioBruto * (6.0 / 100);
	        } else {
	            System.out.println("\n|NÃO USA VALE TRANSPORTE|");
	        }
	    }
	
	    public void calcularValeRefeicao() {
	        if (salarioBruto <= 1320) {
	            this.valeRefeicao = 0;
	        } else {
	            this.valeRefeicao = salarioBruto * 3 / 100;
	        }
	    }
	
	    public void calcularValeAlimentacao() {
	        if (salarioBruto > 3960) {
	            this.valeAlimentacao = salarioBruto * 2 / 100;
	        } else {
	            this.valeAlimentacao = 0;
	        }
	    }
	
	    public void calcularConvenioMedico() {
	        if (salarioBruto <= 1320) {
	            this.convenioMedico = 0;
	        } else {
	            this.convenioMedico = salarioBruto * 4 / 100;
	        }
	    }
	
	    public double calcularResultado() {
	        return salarioBruto - inss - valeRefeicao - valeAlimentacao - convenioMedico - valeAlimentacao - corte;
	    }
	    public void gerarHolerite() {
	        System.out.println("|=======================================|");
	        System.out.println("|               HOLERITE                |");
	        System.out.println("|=======================================|");
	        System.out.println("| Nome: " + nome);
	        System.out.printf ("| Salário Bruto + Hora Extra + Bonûs: R$ %.2f\n", salarioBruto);
	        System.out.printf ("| Bonus: R$ %.2f\n", bonus);
	        System.out.printf ("| Desconto INSS: R$ %.2f\n" , inss);
	        System.out.printf ("| Desconto Pensão: R$ %.2f\n", valorpensao);
	        System.out.printf ("| Desconto IRPF: R$ %.2f\n", corte);
	        System.out.printf ("| Vale Tansporte: R$ %.2f\n", valeTransporte);
	        System.out.printf ("| Vale Refeição: R$ %.2f\n", valeRefeicao);
	        System.out.printf ("| Vale Alimentação: R$ %.2f\n", valeAlimentacao);
	        System.out.printf ("| Convenio Médico: R$ %.2f\n", convenioMedico);
	        System.out.println("|---------------------------------------|");
	        System.out.printf ("| Salário Líquido: R$ %.2f\n", calcularResultado());
	        System.out.println("|=======================================|");
	    }
	    
		    public String getNome() {
	        return nome;
    }
}