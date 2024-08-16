//Loop para tentar novamente

package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest02LOOP {
    public static void main(String[] args) {
        boolean logged = false;
        while (!logged) {
            try{
                login();
                logged = true;
            }catch(LoginInvalidoException e){
                System.out.println(e.getMessage());
                System.out.println("Tente Novamente.\n");
            }
        }
    }
    public static void login() throws LoginInvalidoException {
        Scanner sc = new Scanner(System.in);
        String usernameDB = "Goku";
        String senhaDB = "ssj";
        System.out.println("Usuário: ");
        String usernameDigitado = sc.nextLine();
        System.out.println("Senha: ");
        String senhaDigitado = sc.nextLine();

        if(!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitado)){
            throw new LoginInvalidoException("Login ou Senha incorreto.");
        }
        System.out.println("Usuário logado com sucesso.");

    }
}
