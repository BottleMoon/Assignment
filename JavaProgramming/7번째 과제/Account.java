import java.time.LocalDateTime;

public class Account {
    String		type;
    String		no;
    String		open_date;
    LocalDateTime access_time;
    long		balance;
    Customer	owner;

    Account(String ty, String no, String odate, long bal, Customer o) {
        type = ty;
        this.no = no;
        open_date = odate;
        balance = bal;
        owner = o;
    }

    public boolean Transfer(Account A, long amount) {
        return(true);
    }

    public String toString() {
        String tmp = String.format("[%s-%s] 개설날짜[%s] 잔액[%d] : 계좌주[%s]", no, type, open_date, balance, owner);

        return(tmp);
    }
}
