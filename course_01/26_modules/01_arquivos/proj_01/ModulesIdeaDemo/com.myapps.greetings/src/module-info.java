module com.myapps.greetings {
  exports com.myapps.greetings;
  provides com.myapps.greetings.Logger with com.myapps.greetings.LoggerImpl;
}