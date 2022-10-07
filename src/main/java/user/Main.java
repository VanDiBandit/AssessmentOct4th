package user;

public class Main {

    public static void main(String[] args) {
        String [] address = {"123 Wallaby St", "42 P Sherman Ct"};
        String [] address1 = {"456 Pimpin' ln", "12 Ain't no way Cir"};

        User user1 = new User("Poppy","Mogul",0,0,address);//User()
        User user2 = new User("Steve", "Realist", 0,0, address1);
        //objectName.propertyName = whatever we want to store;
        //user1.setUsername("Mikaila");
        //System.out.println(user1.getUserName());
        //user2.setUsername("Andrew");
        //System.out.println(user2.getUserName());

//        User user3 = new User("Dude","12345",'S',0, 0);
//        System.out.println(user3.getUserName());
//
//        user3.setNewPassword("2468");
//        System.out.println(user3.getNewPassword());
//        System.out.println(user3.getUserName() + " " + user3.getNewPassword());
//
//        user3.setRewardPoints(1000);
//        System.out.println(user3.useRewardPoints(100));



        user1.setAccountBalance(1000);
        System.out.println(user1.getAccountBalance());
        user1.setAccountBalance(-1000);

        user1.printAllAddresses();
        user1.printUserProfile();
        user2.printUserProfile();
    }
}
