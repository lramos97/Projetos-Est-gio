package POO.HerancaPolimorfismo.ProjetoConta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class ManipuladorContas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Conta> list = new ArrayList<Conta>();
        System.out.print("Quantas contas deseja cadastrar: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Conta " + i);
            char type;

            while (true) {
                System.out.print("Conta corrente ou poupança (c/p)?");
                type = sc.next().charAt(0);
                if (type == 'c' || type == 'p') {
                    break;
                } else {
                    System.out.println("Conta inválida. Digite 'p' para Conta Poupança ou 'c' para Conta Corrente.");
                }
            }

            System.out.print("Titular: ");
            String titular = sc.next();
            System.out.print("Agência: ");
            String agencia = sc.next();
            System.out.print("Número: ");
            int numero = sc.nextInt();
            System.out.print("Saldo: ");
            double saldo = sc.nextDouble();


            if (type == 'c') {
                ContaCorrente conta = new ContaCorrente(titular, agencia, numero, saldo);
                list.add(conta);
                System.out.println("Tipo de conta: " + conta.getTipoConta());
            } else {
                ContaPoupanca conta = new ContaPoupanca(titular, agencia, numero, saldo);
                list.add(conta);
                System.out.println("Tipo de conta: " + conta.getTipoConta());
                conta.getCalculoRendimento();
            }
        }
        Collections.sort(list, Comparator.comparing(Conta::getTitular));

        System.out.println();
        System.out.println("Contas Cadastradas");
        for (Conta C : list) {
            System.out.println(" - " + C.getTitular() + " (" + C.getTipoConta() + ")");
        }

        while (true) {
            System.out.print("\nEscolha uma conta pelo número (1 a " + list.size() + ") ou 0 para sair: ");
            int escolhaConta = sc.nextInt();

            if (escolhaConta == 0) {
                break;
            }

            if (escolhaConta < 1 || escolhaConta > list.size()) {
                System.out.println("Conta inválida. Tente novamente.");
                continue;
            }

            Conta contaSelecionada = list.get(escolhaConta - 1);

            while (true) {
                System.out.printf("""
                        ==================================
                        O que você deseja fazer?
                        
                        1 - VERIFICAR DADOS DA CONTA
                        2 - VERIFICAR SALDO
                        3 - DEPOSITAR
                        4 - SACAR
                        5 - TRANSFERIR
                        6 - SAIR
                        
                        ==================================
                        """);

                String operacao = (sc.next());
                switch (operacao) {
                    case "1":
                        System.out.println(contaSelecionada.recuperarDadosImpressao());
                        break;
                    case "2":
                        contaSelecionada.checarSaldo();;
                        break;
                    case "3":
                        System.out.println("Digite o valor que voce deseja depositar:");
                        double deposito = sc.nextDouble();
                        contaSelecionada.depositar(deposito);

                        break;
                    case "4":
                        System.out.println("Digite o valor que voce deseja sacar:");
                        double saque = sc.nextDouble();
                        contaSelecionada.sacar(saque);
                        break;
                    case "5":
                        System.out.println("Escolha a conta de destino pelo número (1 a " + list.size() + "):");
                        int contaDestinoIndex = sc.nextInt();
                        if (contaDestinoIndex < 1 || contaDestinoIndex > list.size() || contaDestinoIndex == escolhaConta) {
                            System.out.println("Conta de destino inválida.");
                            break;
                        }
                        Conta contaDestino = list.get(contaDestinoIndex - 1);
                        System.out.println("Digite o valor que você deseja transferir:");
                        double valorTransferencia = sc.nextDouble();
                        contaSelecionada.transferir(valorTransferencia, contaDestino);
                        break;
                    case "6":
                        return;
                    default:
                        System.out.println("Operação não aceita");
                }

                if (operacao.equals("6")) {
                    break;
                }
            }
        }
        sc.close();
    }
}


