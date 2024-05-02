import java.util.Scanner;

public class Main {
	public static void cadastrarVeiculo(Scanner input, Veiculo[] cadastro, int numVeiculos ) {
		String numChassi;
		String placa;
		String marca;
		String modelo;
		int ano;
		
		System.out.println("Página de cadastro:");
		System.out.println("Informe o número do chassi: ");
		numChassi = input.next();
		System.out.println("Informe a placa: ");
		placa = input.next();
		System.out.println("Informe a marca: ");
		marca = input.next();
		System.out.println("Informe o modelo: ");
		modelo = input.next();
		System.out.println("Informe o ano: ");
		ano = input.nextInt();
		
		Veiculo novoVeiculo = new Veiculo(numChassi, placa, marca, modelo, ano);
		cadastro[numVeiculos] = novoVeiculo;
		System.out.println("Veículo cadastrado com sucesso!!!");
	}
	
	public static void pesquisar(Scanner input, Veiculo[] cadastro, int numVeiculos) {
		String numeroCP;	
		int i;
		System.out.println("Digite o número do chassi ou placa: ");
		numeroCP = input.next();
		
		for(i = 0; i<numVeiculos; i++) {
			if (cadastro[i].getNumChassi().equals(numeroCP) || cadastro[i].getPlaca().equals(numeroCP)) {
                System.out.println("O veículo pesquisado é:");
                System.out.println(cadastro[i]);
                return;
            }
		}
		System.out.println("Nenhum veículo encontrado.");
		
		
	}
	public static void atualizar(Scanner input, Veiculo[] cadastro, int numVeiculos) {
		String numeroCP;	
		int i;
		System.out.println("Digite o número do chassi ou placa: ");
		numeroCP = input.next();
		
		for(i=0; i<numVeiculos;i++) {
			if (cadastro[i].getNumChassi().equals(numeroCP) || cadastro[i].getPlaca().equals(numeroCP)) {
				System.out.println("Informe os novos dados do veículo: ");
				System.out.println("Digite o número do chassi:");
				cadastro[i].setNumChassi(input.next());
				System.out.println("Digite a placa: ");
				cadastro[i].setPlaca(input.next());
				System.out.println("Digite a marca: ");
				cadastro[i].setMarca(input.next());
				System.out.println("Digite o modelo: ");
				cadastro[i].setModelo(input.next());
				System.out.println("Digite o ano: ");
				cadastro[i].setAno(input.nextInt());
				System.out.println("Veículo atualizado com sucesso!");
				return;
			}
		}
		System.out.println("Nenhum veículo encontrado.");
	}
	
	public static void excluir(Scanner input, Veiculo[] cadastro, int numVeiculos) {
		int i;
		String numeroCP;
		System.out.println("Digite o numero do chassi ou placa: ");
		numeroCP = input.next();
		
		for (i = 0; i < numVeiculos; i++) {
            if (cadastro[i].getNumChassi().equals(numeroCP) || cadastro[i].getPlaca().equals(numeroCP)) {
                for (int j = i; j < numVeiculos - 1; j++) {
                    cadastro[j] = cadastro[j + 1];
                }
                cadastro[numVeiculos - 1] = null; 
                System.out.println("Veículo excluído com sucesso!!");
                return;
            }
        }
        System.out.println("Nenhum veículo encontrado.");
	}
	
	public static void todosVeiculos(Veiculo[] cadastro,int numVeiculos) {
		if (numVeiculos == 0) {
            System.out.println("Nenhum veículo cadastrado.");
            return;
        }
        System.out.println("Lista de veículos cadastrados:");
        for (int i = 0; i < numVeiculos; i++) {
            System.out.println(cadastro[i]);
        }
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Veiculo[] cadastro = new Veiculo[200];
		 int numVeiculos = 0;
		 int opcao;
		 
		 do {
			System.out.println("\nEscolha uma opção:"+
			 			"\n1- Cadastrar veículo"
			 			+ "\n2-Pesquisar veículo por chassi ou placa"
			 			+ "\n3-Atualizar veículo por chassi ou placa:"
			 			+ "\n4-Excluir veículo por chassi ou placa."
			 			+ "\n5- Imprimir todos os veículos"
			 			+ "\n6-Sair"
			 			+ "\n---------------------------");
			System.out.println("Digite a sua opção:");
			opcao = input.nextInt();
			 
			 if(opcao == 1) {
				 cadastrarVeiculo(input,cadastro,numVeiculos);
				 numVeiculos++;
				 
			 }else if(opcao ==2) {
				 pesquisar(input, cadastro, numVeiculos); 
			 }else if(opcao==3) {
				 atualizar(input,cadastro,numVeiculos);
				 
			 }else if(opcao == 4) {
				 excluir(input, cadastro,numVeiculos);
			 }else if(opcao == 5) {
				 todosVeiculos(cadastro, numVeiculos);
			 }else {
				 System.out.println("Programa encerrado!");
				 break;
			 }

		 }while (opcao!=6);
		 
		 
	}
}