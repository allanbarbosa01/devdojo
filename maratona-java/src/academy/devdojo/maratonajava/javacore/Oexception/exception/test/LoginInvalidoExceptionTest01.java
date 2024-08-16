package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            login();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
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
