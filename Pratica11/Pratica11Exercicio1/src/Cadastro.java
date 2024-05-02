import java.util.Scanner;
public class Cadastro {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        Pessoa[] cadastro = new Pessoa[200];
        int numPessoas = 0;

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Cadastrar pessoa física");
            System.out.println("2. Cadastrar pessoa jurídica");
            System.out.println("3. Imprimir todas as pessoas");
            System.out.println("4. Imprimir pessoas físicas");
            System.out.println("5. Imprimir pessoas jurídicas");
            System.out.println("6. Pesquisar pessoa por CPF ou CNPJ");
            System.out.println("7. Atualizar pessoa por CPF ou CNPJ");
            System.out.println("8. Excluir pessoa por CPF ou CNPJ");
            System.out.println("0. Sair");

            int opcao = input.nextInt();
            input.nextLine(); 

            switch (opcao) {
                case 1:
                    cadastrarPessoaFisica(input, cadastro, numPessoas);
                    numPessoas++;
                    break;
                case 2:
                    cadastrarPessoaJuridica(input, cadastro, numPessoas);
                    numPessoas++;
                    break;
                case 3:
                    imprimirTodasAsPessoas(cadastro, numPessoas);
                    break;
                case 4:
                    imprimirPessoasFisicas(cadastro, numPessoas);
                    break;
                case 5:
                    imprimirPessoasJuridicas(cadastro, numPessoas);
                    break;
                case 6:
                    pesquisarPessoaPorDocumento(input, cadastro, numPessoas);
                    break;
                case 7:
                    atualizarPessoaPorDocumento(input, cadastro, numPessoas);
                    break;
                case 8:
                    excluirPessoaPorDocumento(input, cadastro, numPessoas);
                    numPessoas--;
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public static void cadastrarPessoaFisica(Scanner input, Pessoa[] cadastro, int numPessoas) {
        PessoaFisica pessoa = new PessoaFisica();
        System.out.println("Cadastro de Pessoa Física:");
        System.out.print("Nome: ");
        pessoa.setNome(input.nextLine());
        System.out.print("CPF: ");
        pessoa.setCPF(input.nextLine());
        cadastro[numPessoas] = pessoa;
        System.out.println("Pessoa física cadastrada com sucesso.");
    }

    public static void cadastrarPessoaJuridica(Scanner input, Pessoa[] cadastro, int numPessoas) {
        PessoaJuridica pessoa = new PessoaJuridica();
        System.out.println("Cadastro de Pessoa Jurídica:");
        System.out.print("Nome: ");
        pessoa.setNome(input.nextLine());
        System.out.print("CNPJ: ");
        pessoa.setCNPJ(input.nextLine());
        cadastro[numPessoas] = pessoa;
        System.out.println("Pessoa jurídica cadastrada com sucesso.");
    }

    public static void imprimirTodasAsPessoas(Pessoa[] cadastro, int numPessoas) {
        System.out.println("Todas as pessoas:");
        for (int i = 0; i < numPessoas; i++) {
            System.out.println(cadastro[i]);
        }
    }

    public static void imprimirPessoasFisicas(Pessoa[] cadastro, int numPessoas) {
        System.out.println("Pessoas Físicas:");
        for (int i = 0; i < numPessoas; i++) {
            if (cadastro[i] instanceof PessoaFisica) {
                System.out.println(cadastro[i]);
            }
        }
    }

    public static void imprimirPessoasJuridicas(Pessoa[] cadastro, int numPessoas) {
        System.out.println("Pessoas Jurídicas:");
        for (int i = 0; i < numPessoas; i++) {
            if (cadastro[i] instanceof PessoaJuridica) {
                System.out.println(cadastro[i]);
            }
        }
    }

    public static void pesquisarPessoaPorDocumento(Scanner input, Pessoa[] cadastro, int numPessoas) {
        System.out.println("Informe o CPF ou CNPJ da pessoa:");
        String documento = input.nextLine();
        for (int i = 0; i < numPessoas; i++) {
            if (cadastro[i] instanceof PessoaFisica) {
                PessoaFisica pessoa = (PessoaFisica) cadastro[i];
                if (pessoa.getCPF().equals(documento)) {
                    System.out.println("Pessoa encontrada:");
                    System.out.println(pessoa);
                    return;
                }
            } else if (cadastro[i] instanceof PessoaJuridica) {
                PessoaJuridica pessoa = (PessoaJuridica) cadastro[i];
                if (pessoa.getCNPJ().equals(documento)) {
                    System.out.println("Pessoa encontrada:");
                    System.out.println(pessoa);
                    return;
                }
            }
        }
        System.out.println("Pessoa não encontrada.");
    }

    public static void atualizarPessoaPorDocumento(Scanner input, Pessoa[] cadastro, int numPessoas) {
		System.out.println("Informe o CPF ou CNPJ da pessoa:");
        String documento = input.nextLine();
		
		for(int i=0; i<numPessoas;i++) {
			if (cadastro[i] instanceof PessoaFisica) {
                PessoaFisica pessoa = (PessoaFisica) cadastro[i];
                if (pessoa.getCPF().equals(documento)) {
					System.out.println("Informe os novos dados da pessoa: ");
					System.out.print("Nome: ");
			        pessoa.setNome(input.nextLine());
			        System.out.print("CPF: ");
			        pessoa.setCPF(input.nextLine());
			        //cadastro[numPessoas] = pessoa;
					System.out.println("Pessoa atualizada com sucesso!");
					return;
                }
			}else if (cadastro[i] instanceof PessoaJuridica) {
				PessoaJuridica pessoa = (PessoaJuridica) cadastro[i];
				if (pessoa.getCNPJ().equals(documento)) {
					System.out.println("Informe os novos dados da pessoa: ");
					System.out.print("Nome: ");
			        pessoa.setNome(input.nextLine());
			        System.out.print("CPF: ");
			        pessoa.setCNPJ(input.nextLine());
			        //cadastro[numPessoas] = pessoa;
					System.out.println("Pessoa atualizada com sucesso!");
					return;
                }
			}
		}
		
		System.out.println("Nenhuma pessoa encontrada.");
    }
    
    public static void excluirPessoaPorDocumento(Scanner input, Pessoa[] cadastro, int numPessoas) {
    	System.out.println("Informe o CPF ou CNPJ da pessoa:");
        String documento = input.nextLine();
		
		for (int i=0; i<numPessoas;i++) {
			if (cadastro[i] instanceof PessoaFisica) {
				PessoaFisica pessoa = (PessoaFisica) cadastro[i];
				if (pessoa.getCPF().equals(documento)) {
	                for (int j = i; j < numPessoas - 1; j++) {
	                    cadastro[j] = cadastro[j + 1];
	                }
	                cadastro[numPessoas - 1] = null; 
	                System.out.println("Pessoa excluída com sucesso!!");
	                return;
	            }
			}else if (cadastro[i] instanceof PessoaJuridica) {
                PessoaJuridica pessoa = (PessoaJuridica) cadastro[i];
                if (pessoa.getCNPJ().equals(documento)) {
                	for (int j = i; j < numPessoas - 1; j++) {
	                    cadastro[j] = cadastro[j + 1];
	                }
	                cadastro[numPessoas - 1] = null; 
	                System.out.println("Pessoa excluída com sucesso!!");
	                return;
                }
            }
            
        }
        System.out.println("Nenhuma Pessoa encontrada.");
    }
	
 }

