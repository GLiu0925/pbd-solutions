class Address {
    String street;
    String city;
    String state;
    int zip;
}

public class webAddresses {
    public static void main(String[] args) throws Exception {

        Address disneyLand = new Address();
        disneyLand.street = "1313 Disneyland Dr";
        disneyLand.city   = "Anaheim";
        disneyLand.state  = "California";
        disneyLand.zip    = 92802;
        
        Address graceLand = new Address();
        graceLand.street = "17 Carnation Road";
        graceLand.city = "Thornhill";
        graceLand.state = "Ontario";
        graceLand.zip = 12345;
        
        Address idk = new Address();
        idk.street = "street";
        idk.city = "city";
        idk.state = "state";
        idk.zip = 47392;

        System.out.println(disneyLand.street + ", " + disneyLand.city + ", " + disneyLand.state + "  " + disneyLand.zip);
        System.out.println(graceLand.street + ", " + graceLand.city + ", " + graceLand.state + " " + graceLand.zip);
        System.out.println(idk.street + ", " + idk.city + ", " + idk.state + " " + idk.zip);
    }
}

