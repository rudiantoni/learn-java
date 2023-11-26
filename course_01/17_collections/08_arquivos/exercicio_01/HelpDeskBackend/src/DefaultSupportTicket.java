public class DefaultSupportTicket implements SupportTicket {
  private static int counter;
  int sequentialNumber;

  static {
    counter = 0;
  }

  {
    sequentialNumber = ++counter;
  }

  RequestType requestType;

  public DefaultSupportTicket(RequestType requestType) {
    this.requestType = requestType;
  }

  @Override
  public Priority getPriority() {
    return requestType.getPriority();
  }

  @Override
  public int getSequentialNumber() {
    return sequentialNumber;
  }

  @Override
  public RequestType getRequestType() {
    return requestType;
  }

  @Override
  public String toStringFormatted() {
    return String.format("%s - %s", sequentialNumber, requestType.getPriority());
  }

  @Override
  public String toString() {
    return "DefaultSupportTicket{" +
      "sequentialNumber=" + sequentialNumber +
      ", priority=" + requestType.getPriority() +
      ", requestType=" + requestType +
      '}';
  }

}
