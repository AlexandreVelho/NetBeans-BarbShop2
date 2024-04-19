/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

/**
 *
 * @author alexa
 */



import Model.Cliente;
import Model.Servico;
import Model.Usuario;

public class Main {

    public static void main(String[] args) {
        String nome = "Rodrigo";
        System.out.println(nome);
        Servico servico = new Servico(1, "barba", 30);
        System.out.println(servico.getDescricao());
        System.out.println(servico.getValor());
        Cliente cliente = new Cliente(1, "Jorge", 'M', "95445866", "Rua tesla 95");
        System.out.println(cliente.getNome());
        Usuario usuario = new Usuario(1, "barbeiro", "senha"); //falta import do Model.Usuario
        System.out.println(usuario);
    }
}
