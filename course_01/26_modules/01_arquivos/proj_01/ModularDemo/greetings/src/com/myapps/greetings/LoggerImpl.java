package com.myapps.greetings;

public class LoggerImpl implements Logger{
  @Override
  public void log() {
    System.out.println("LOG - Módulo ativado e funcionando");
  }

  @Override
  public void log(String string) {
    System.out.println("LOG - " + string);
  }
}
