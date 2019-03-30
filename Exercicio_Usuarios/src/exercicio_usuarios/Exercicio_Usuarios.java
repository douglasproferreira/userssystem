/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_usuarios;

import java.util.Scanner;

/**
 *
 * @author dougl
 */
public class Exercicio_Usuarios {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        System.out.println("----------Sistema de Gerenciamento de Usuários-----------");
        do {
            System.out.println("Menú de Opções");
            System.out.println("1 -> Cadastrar Novo Usuário");
            System.out.println("2 -> Editar Usuário");
            System.out.println("3 -> Remover Usuário");
            System.out.println("4 -> Buscar Usuário");
            System.out.println("5 -> Sair");
            opcao = sc.nextInt();
            sc.nextLine();
            User user = new User();
            UserDAO dao = new UserDAO();
            switch (opcao) {
                case 1:
                    System.out.print("Digite o Nome do Usuário: > ");
                    user.setNome(sc.nextLine());
                    System.out.print("Digite o Sobrenome do Usuário: > ");
                    user.setSobrenome(sc.nextLine());
                    System.out.print("Digite o E-mail do Usuário: > ");
                    user.setEmail(sc.nextLine());
                    System.out.print("Digite o Telefone do Usuário: > ");
                    user.setTelefone(sc.nextLine());
                    System.out.print("Digite o Tipo de Usuário: > ");
                    user.setTipo(sc.nextLine());
                    System.out.print("Digite o Usuário: > ");
                    user.setUser(sc.nextLine());
                    System.out.print("Digite a Senha: > ");
                    user.setPass(sc.nextLine());
                    dao.insere(user);
                    break;
                case 2:
                    System.out.println("Informe o ID do Usuário");
                    user.setId(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Informe os dados a serem atualizados.");
                    System.out.print("Nome: > ");
                    user.setNome(sc.nextLine());
                    System.out.print("Sobrenome: > ");
                    user.setSobrenome(sc.nextLine());
                    System.out.print("E-mail: > ");
                    user.setEmail(sc.nextLine());
                    System.out.print("Telefone: > ");
                    user.setTelefone(sc.nextLine());
                    System.out.print("Tipo: > ");
                    user.setTipo(sc.nextLine());
                    System.out.print("Usuário: > ");
                    user.setUser(sc.nextLine());
                    System.out.print("Senha: > ");
                    user.setPass(sc.nextLine());
                    dao.altera(user);
                    break;
                case 3:
                    System.out.print("ID do Usuário para Deleção: > ");
                    user.setId(sc.nextInt());
                    dao.remove(user);
                    break;
                case 4:
                    System.out.print("Informe o ID do Usuário para Busca: > ");
                    user.setId(sc.nextInt());
                    System.out.println(dao.seleciona(user));
                    break;
                case 5:
                    System.out.println("Saindo do Sistema.....");
            }
        } while (opcao != 5);
    }
}
