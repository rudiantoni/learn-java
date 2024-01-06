
public class Main {
  public static void main(String[] args) {
    HelpDeskFacade helpDeskFacade = new DefaultHelpDeskFacade();
    helpDeskFacade.addNewSupportTicket(new DefaultSupportTicket(RequestType.OTHER));
    helpDeskFacade.addNewSupportTicket(new DefaultSupportTicket(RequestType.COOPERATION));
    helpDeskFacade.addNewSupportTicket(new DefaultSupportTicket(RequestType.ACCOUNT_IS_BLOCKED));
    helpDeskFacade.addNewSupportTicket(new DefaultSupportTicket(RequestType.OTHER));
    helpDeskFacade.addNewSupportTicket(new DefaultSupportTicket(RequestType.ACCOUNT_IS_HACKED));
    helpDeskFacade.addNewSupportTicket(new DefaultSupportTicket(RequestType.ACCOUNT_IS_HACKED));
    helpDeskFacade.addNewSupportTicket(new DefaultSupportTicket(RequestType.OTHER));
    helpDeskFacade.addNewSupportTicket(new DefaultSupportTicket(RequestType.ACCOUNT_IS_BLOCKED));
    helpDeskFacade.addNewSupportTicket(new DefaultSupportTicket(RequestType.ACCOUNT_IS_HACKED));
    helpDeskFacade.addNewSupportTicket(new DefaultSupportTicket(RequestType.ACCOUNT_IS_HACKED));
    helpDeskFacade.addNewSupportTicket(new DefaultSupportTicket(RequestType.ORDER_IS_NOT_RECEIVED));
    helpDeskFacade.addNewSupportTicket(new DefaultSupportTicket(RequestType.CHANGE_ACCOUNT_DETAILS));
    helpDeskFacade.addNewSupportTicket(new DefaultSupportTicket(RequestType.ACCOUNT_IS_BLOCKED));
    helpDeskFacade.addNewSupportTicket(new DefaultSupportTicket(RequestType.ACCOUNT_IS_HACKED));
    helpDeskFacade.addNewSupportTicket(new DefaultSupportTicket(RequestType.ORDER_IS_NOT_RECEIVED));
    helpDeskFacade.addNewSupportTicket(new DefaultSupportTicket(RequestType.OTHER));
    helpDeskFacade.addNewSupportTicket(new DefaultSupportTicket(RequestType.CAN_NOT_COMPLETE_PURCHASE));
    helpDeskFacade.addNewSupportTicket(new DefaultSupportTicket(RequestType.ORDER_IS_NOT_RECEIVED));
    helpDeskFacade.addNewSupportTicket(new DefaultSupportTicket(RequestType.ORDER_IS_NOT_RECEIVED));
    helpDeskFacade.addNewSupportTicket(new DefaultSupportTicket(RequestType.CAN_NOT_COMPLETE_PURCHASE));

    System.out.println("Essa são os tickets atuais, mas ligue para a ordem, ela não está organizada :D.");
    System.out.println(helpDeskFacade);

    while (helpDeskFacade.getNumberOfTickets() > 0) {
      System.out.printf("Ainda temos que atender %s ticket(s)!\n", helpDeskFacade.getNumberOfTickets());
      System.out.printf("\t%s\n", helpDeskFacade.getNextSupportTicket().toStringFormatted());
    }

    if (helpDeskFacade.getNumberOfTickets() == 0) {
      System.out.println("Não falta mais nenhum ticket! Parabéns :) !!!");
    }

  }
}