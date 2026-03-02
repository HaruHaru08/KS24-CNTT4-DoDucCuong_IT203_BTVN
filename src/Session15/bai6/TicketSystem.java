package Session15.bai6;

import java.util.LinkedList;
import java.util.Queue;

public class TicketSystem {
    private Queue<Ticket> ticketQueue = new LinkedList<>();
    private int currentNumber = 0;

    public Ticket issueTicket(String time) {
        currentNumber++;
        Ticket t = new Ticket(currentNumber, time);
        ticketQueue.offer(t);
        return t;
    }

    public Ticket callNext() {
        return ticketQueue.poll();
    }

    public void displayWaiting() {
        for (Ticket t : ticketQueue) {
            System.out.println(t);
        }
    }
}
// [CHỌN]: Queue
// [LÝ DO]: Đây là quy trình dịch vụ chuẩn hóa (FIFO). Số thứ tự được phát ra
// theo dãy số tăng dần và được gọi phục vụ đúng theo trình tự đó.