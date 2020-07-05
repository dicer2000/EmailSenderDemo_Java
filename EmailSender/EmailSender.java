import java.util.*;

/* Dummy email sending system.  Demonstrates multi-threading
by allowing both single-thread and multi-thread trials.  See
which is longer.  How about if you add more Threads in Ln 104?
*/

public class EmailSender {
    public static Object itemLock = new Object();
    public static int nextItemNo = 0;

    // Creating a list 
    public static List<Email> l1 = new ArrayList<Email>(); 

    public static void main(String args[]) {

        EmailSender es = new EmailSender();

        while(true) {
            // Reset everything
            nextItemNo = 0;

            // Show the main menu
            es.showMainMenu();

            // Get the menu item
            Scanner scanner = new Scanner(System.in);
            char ch = scanner.next().charAt(0);

            long startTime = System.currentTimeMillis();

            switch(ch)
            {
                case '1':
                    es.fillArray();
                break;
                case '2':
                    es.processWithMainThread();
                break;
                case '3':
                    es.processWithThreadQueue();
                break;
                default:
                    return;
            }
            long endTime = System.currentTimeMillis();
            System.out.println((endTime - startTime) + " milliseconds");

        }
    }


    private void processWithMainThread() {

        for (Email item : l1) {
            sendEmail(item);
        }
    }

    private void fillArray() {
        for(int i=0; i < 1000; i++) {
            // Add a nonsensical string to each
            Email email = new Email();
            email.Name = randomAlphaNumeric(25);
            email.Subject = randomAlphaNumeric(40);
            email.ToEmail = randomAlphaNumeric(40);
            email.Body = randomAlphaNumeric(200);
            l1.add(email);
        }
    }

    private boolean sendEmail(Email em) {
        String strName = em.Name;
        String strToField = em.ToEmail;
        String strSubj = em.Subject;
        String strBody = em.Body;
        try { Thread.sleep(10); }
        catch (InterruptedException e) {}
        return true;
    }

    private void showMainMenu() {
        // Clear the screen
//        System.out.print("\033[H\033[2J");  
//        System.out.flush();
        System.out.println("1 - Create 10000 mail items");
        System.out.println("2 - Process with Single Thread");
        System.out.println("3 - Process with Multi Thread");
        System.out.println("q - Quit");
    }

    private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    public static String randomAlphaNumeric(int count) {
        StringBuilder builder = new StringBuilder();
        while (count-- != 0) {
            int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
            builder.append(ALPHA_NUMERIC_STRING.charAt(character));
            return builder.toString();
        }
        return "";
    }

    private void processWithThreadQueue() {
        EmailThread T1 = new EmailThread();
        EmailThread T2 = new EmailThread();
        T1.start();
        T2.start();
    }

    private static class EmailThread extends Thread {
        public void run() {
            Email email = null;
            while(true) {
                synchronized (EmailSender.itemLock) {
                    if(nextItemNo >= EmailSender.l1.size())
                        break;
                    email = l1.get(nextItemNo);
                    EmailSender.nextItemNo++;
                }
                String strName = email.Name;
                String strToField = email.ToEmail;
                String strSubj = email.Subject;
                String strBody = email.Body;
                try { Thread.sleep(10); }
                catch (InterruptedException e) {}
            }
            System.out.println("Thread complete");
        }
    }
}