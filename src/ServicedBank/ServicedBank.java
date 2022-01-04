package ServicedBank;

public  enum ServicedBank {
    ALPHA_BANK ("ALPHA_BANK"),
    PRIVAT_BANK ("PRIVAT_BANK"),
    BARCLAYS ("BARCLAYS"),
    HSBC ("HSBC");

    public String name1;

    ServicedBank(String name) {
        this.name1 = name;
    }
}
