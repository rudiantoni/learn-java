package com.myapps.app;

import com.myapps.greetings.Greetings;
import com.myapps.greetings.Logger;

import java.util.ServiceLoader;

public class App {
  public static void main(String[] args) {
    // Exemplo de utilizar módulo
    System.out.println("========== Exemplo de utilizar módulo ==========");
    Greetings.sayHello();

    // Exemplo de consumir serviço
    System.out.println("\n========== Exemplo de consumir serviço ==========");
    Iterable<Logger> services = ServiceLoader.load(Logger.class);
    Logger service = services.iterator().next();
    service.log();
    service.log("Teste de log");

  }
}
