package curso;


import java.util.Scanner;
import java.util.Locale;
public class Problema_aumento {

	

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double salario;
		
        
		System.out.print("Digite o salário da pessoa:");
		salario = sc.nextDouble();
		
		
		if (salario <= 1000) {
			int porcentagem =20;
			Double novoSalario = (porcentagem / 100.0 * salario) + salario ;
			Double aumento = porcentagem / 100.0 * salario;
			System.out.printf("Novo salario = R$%.2f \nAumento = R$%.2f \nPorcentagem = %s%%" , novoSalario, aumento, porcentagem );
		}else if(salario <= 3000){
			int porcentagem =15;
			Double novoSalario = (porcentagem / 100.0 * salario) + salario ;
			Double aumento = porcentagem / 100.0 * salario;
			System.out.printf("Novo salario = R$%.2f \nAumento = R$%.2f \nPorcentagem = %s%%" , novoSalario, aumento, porcentagem );
		
		}else if(salario <=8000){
			int porcentagem =10;
			Double novoSalario = (porcentagem / 100.0 * salario) + salario ;
			Double aumento = porcentagem / 100.0 * salario;
			System.out.printf("Novo salario = R$%.2f \nAumento = R$%.2f \nPorcentagem = %s%%" , novoSalario, aumento, porcentagem );
		
		}else{
			int porcentagem =5;
			Double novoSalario = (porcentagem / 100.0 * salario) + salario ;
			Double aumento = porcentagem / 100.0 * salario;
			System.out.printf("Novo salario = R$%.2f \nAumento = R$%.2f \nPorcentagem = %s%%" , novoSalario, aumento, porcentagem );
		
		}
		
		
	}

}
	
		
		