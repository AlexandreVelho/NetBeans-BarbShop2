/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADS
 */
package Controller;
import View.Login;

public class LoginController {
    private final Login view;
    public LoginController(Login view){
        this.view = view;
    }
    public void fizTarefa() {
        System.out.println("Busquei algo no banco de dados");
        this.view.exibeMensagem("Executei o fiz tarefa");
    }
}
