import java.util.Comparator;

public class SupportTicketPriorityComparator implements Comparator<SupportTicket> {
  @Override
  public int compare(SupportTicket o1, SupportTicket o2) {
    // Natural order: negatives comes before positives
    // Reversed order: positives comes before negative
    Integer o2PriorityValue = o2.getPriority().ordinal();
    Integer o1PriorityValue = o1.getPriority().ordinal();
    int priorityResult = o2PriorityValue.compareTo(o1PriorityValue);
    if (priorityResult == 0) {
      Integer o1SequentialNumber = o1.getSequentialNumber();
      Integer o2SequentialNumber = o2.getSequentialNumber();
      return o1SequentialNumber.compareTo(o2SequentialNumber);
    } else {
      return priorityResult;
    }

  }
}
