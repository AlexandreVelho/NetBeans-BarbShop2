package View;

import Model.Cliente;
import Model.Servico;
import Model.Usuario;
import Model.Agendamento; // Adicionado importação da classe Agendamento

public class Main {

    public static void main(String[] args) {
        String nome = "Rodrigo";
        System.out.println(nome);
        Servico servico = new Servico(1, "barba", 30);
        System.out.println(servico.getDescricao());
        System.out.println(servico.getValor());
        Cliente cliente = new Cliente(1, "Jorge", "Rua tesla 95", "95445866"); // Corrigido o número de telefone para uma string válida
        System.out.println(cliente.getNome());
        Usuario usuario = new Usuario(1, "senha", "barbeiro"); // Corrigida a ordem dos parâmetros
        System.out.println(usuario.getNome()); // Adicionado para imprimir o nome do usuário
        //Pessoa pessoa = new Pessoa(1, "Joao"); //ERRO Pessoa da classe abstract não pode ser instanciado
        //System.out.println(usuario.getNome());
        Agendamento agendamento = new Agendamento(1, cliente, servico, 30, "25/03/2024 11:20", "14:00", "cliente vai atrasar");
        //Coloque um break point nesta linha para verificar os valores dos objetos
        System.out.println(agendamento.getCliente().getNome()); //Retorna o Cliente e o nome
    }
}
