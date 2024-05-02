import java.util.Scanner;

public class Cadastro {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        PessoaFisica[] cadastroF = new PessoaFisica[200];
        PessoaJuridica[] cadastroJ = new PessoaJuridica[200];
        int numPessoasF = 0;
        int numPessoasJ = 0;

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
                    cadastrarPessoaF(input, cadastroF, numPessoasF);
                    numPessoasF++;
                    break;
                case 2:
                    cadastrarPessoaJ(input, cadastroJ, numPessoasJ);
                    numPessoasJ++;
                    break;
                case 3:
                    imprimirTodasAsPessoas(cadastroF, cadastroJ, numPessoasF, numPessoasJ);
                    break;
                case 4:
                    imprimirPessoasF(cadastroF, numPessoasF);
                    break;
                case 5:
                    imprimirPessoasJ(cadastroJ, numPessoasJ);
                    break;
                case 6:
                	pesquisar(input, cadastroF, cadastroJ, numPessoasF, numPessoasJ);
                	break;
                case 7:
                	atualizar(input, cadastroF, cadastroJ, numPessoasF, numPessoasJ);
                	break;
                case 8:
                	excluir(input, cadastroF, cadastroJ, numPessoasF, numPessoasJ);
                	break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            	}
            
            
        }
    }

    public static void cadastrarPessoaF(Scanner input, PessoaFisica[] cadastroF, int numPessoasF) {
    	System.out.println("Cadastro pessoa física:");
        System.out.print("Digite o nome: ");
        String nome = input.nextLine();
        System.out.print("Digite o CPF: ");
        String cpf = input.nextLine();

        PessoaFisica novaPessoaF = new PessoaFisica(nome,cpf);
        novaPessoaF.setNome(nome);
        novaPessoaF.setCPF(cpf);

        cadastroF[numPessoasF] = novaPessoaF;
        System.out.println("Pessoa física cadastrada com sucesso!");
    	
    }

    public static void cadastrarPessoaJ(Scanner input, PessoaJuridica[] cadastroJ, int numPessoasJ) {
    	System.out.println("Cadastro pessoa jurídica:");
        System.out.print("Digite o nome: ");
        String nome = input.nextLine();
        System.out.print("Digite o CNPJ: ");
        String cnpj = input.nextLine();

        PessoaJuridica novaPessoaJ = new PessoaJuridica(nome,cnpj);
        novaPessoaJ.setNome(nome);
        novaPessoaJ.setCNPJ(cnpj);

        cadastroJ[numPessoasJ] = novaPessoaJ;
        System.out.println("Pessoa jurídica cadastrada com sucesso!");
    }

    public static void imprimirTodasAsPessoas(PessoaFisica[] cadastroF, PessoaJuridica[] cadastroJ, int numPessoasF, int numPessoasJ) {
        System.out.println("Todas as pessoas:");
        for (int i = 0; i < numPessoasF; i++) {
            System.out.println(cadastroF[i]);
        }
        for (int i = 0; i < numPessoasJ; i++) {
            System.out.println(cadastroJ[i]);
        }
    }

    public static void imprimirPessoasF(PessoaFisica[] cadastroF, int numPessoasF) {
        System.out.println("Pessoas Físicas:");
        for (int i = 0; i < numPessoasF; i++) {
            System.out.println(cadastroF[i]);
        }
    }

    public static void imprimirPessoasJ(PessoaJuridica[] cadastroJ, int numPessoasJ) {
        System.out.println("Pessoas Jurídicas:");
        for (int i = 0; i < numPessoasJ; i++) {
            System.out.println(cadastroJ[i]);
        }
	}
    public static void pesquisar(Scanner input, PessoaFisica[] cadastroF, PessoaJuridica[] cadastroJ, int numPessoasF, int numPessoasJ) {
		String valor;	
		int i;
		System.out.println("Digite o CPF ou CNPJ: ");
		valor = input.next();
		
		for(i = 0; i< numPessoasF; i++) {
			if (cadastroF[i].getCPF().equals(valor)) {
                System.out.println("A pessoa pesquisada é:");
                System.out.println(cadastroF[i]);
                return;
            }
		}
		for(i = 0; i< numPessoasJ; i++) {
			if (cadastroJ[i].getCNPJ().equals(valor)) {
                System.out.println("A pessoa pesquisada é:");
                System.out.println(cadastroJ[i]);
                return;
            }
		}
		System.out.println("Nenhuma pessoa encontrada.");
		
		
	}
    
    public static void atualizar(Scanner input,  PessoaFisica[] cadastroF, PessoaJuridica[] cadastroJ, int numPessoasF, int numPessoasJ) {
		String valor;	
		int i;
		System.out.println("Digite o CPF ou CNPJ: ");
		valor = input.next();
		
		for(i=0; i<numPessoasF;i++) {
			if (cadastroF[i].getCPF().equals(valor)) {
				System.out.println("Informe os novos dados da pessoa: ");
				System.out.println("Digite o nome:");
				cadastroF[i].setNome(input.next());
				System.out.println("Digite o CPF: ");
				cadastroF[i].setCPF(input.next());
				System.out.println("Pessoa atualizada com sucesso!");
				return;
			}
		}
		for(i=0; i<numPessoasJ;i++) {
			if (cadastroJ[i].getCNPJ().equals(valor)) {
				System.out.println("Informe os novos dados da pessoa: ");
				System.out.println("Digite o nome:");
				cadastroJ[i].setNome(input.next());
				System.out.println("Digite o CNPJ: ");
				cadastroJ[i].setCNPJ(input.next());
				System.out.println("Pessoa atualizada com sucesso!");
				return;
			}
		}
		System.out.println("Nenhuma pessoa encontrada.");
	}
    
    public static void excluir(Scanner input, PessoaFisica[] cadastroF, PessoaJuridica[] cadastroJ, int numPessoasF, int numPessoasJ) {
		int i;
		String valor;
		System.out.println("Digite o CPF ou CNPJ: ");
		valor = input.next();
		
		for (i = 0; i < numPessoasF; i++) {
            if (cadastroF[i].getCPF().equals(valor)) {
                for (int j = i; j < numPessoasF - 1; j++) {
                    cadastroF[j] = cadastroF[j + 1];
                }
                cadastroF[numPessoasF - 1] = null; 
                System.out.println("Pessoa excluída com sucesso!!");
                return;
            }
        }
		for (i = 0; i < numPessoasJ; i++) {
            if (cadastroJ[i].getCNPJ().equals(valor)) {
                for (int j = i; j < numPessoasJ - 1; j++) {
                    cadastroJ[j] = cadastroJ[j + 1];
                }
                cadastroJ[numPessoasJ - 1] = null; 
                System.out.println("Pessoa excluída com sucesso!!");
                return;
            }
        }
        System.out.println("Nenhuma Pessoa encontrada.");
	}

}
