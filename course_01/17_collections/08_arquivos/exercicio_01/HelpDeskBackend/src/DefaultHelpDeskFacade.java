import java.util.PriorityQueue;
import java.util.Queue;

public class DefaultHelpDeskFacade implements HelpDeskFacade {

  Queue<SupportTicket> helpDeskQueue = new PriorityQueue<>(new SupportTicketPriorityComparator());

  @Override
  public void addNewSupportTicket(SupportTicket supportTicket) {
    helpDeskQueue.offer(supportTicket);
  }

  @Override
  public SupportTicket getNextSupportTicket() {
    return helpDeskQueue.poll();
  }

  @Override
  public int getNumberOfTickets() {
    return helpDeskQueue.size();
  }

  @Override
  public String toString() {
    return helpDeskQueue.toString();
  }
}
