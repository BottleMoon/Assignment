public class Customer {
    String      ssNo;
    String      name;
    char      gender;
    String      phoneNo;
    String      address;
    String[]   accounts;

    public Customer(String ssn, String n, char g, String p, String a) {
        ssNo = ssn; name = n; gender = g;
        phoneNo = p; address = a;
        accounts = null;
    }

    public String toString() {
        String tmp="";
        tmp += String.format("%s[%s:%s] [전화:%s][주소:%s]",
                name, ssNo, (gender == 'm') ? "남":"여", phoneNo, address);
        if(accounts[0].length()>0) {
            tmp += String.format("통장수:%d",  accounts.length);
            for(int i=0;i<accounts.length;i++) {
                tmp+=String.format("[%d] %s", i+1,accounts[i]);
            }
        }

        return tmp;
    }

    public void setOwner(Account[] a, String no) {
        Account acc = null;

        for(int i=0;i<a.length;i++) {
            if(no.equalsIgnoreCase(a[i].no)) {
                acc = a[i];
                break;
            }
        }
        acc.owner = this;
    }

}
