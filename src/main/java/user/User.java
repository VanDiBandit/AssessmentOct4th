package user;

public class User {

    private String username;
    private String passWord;
    private char size;
    private int rewardPoints;

    private String newPassword;

    private double accountBalance;

    private String[] address;


    public User(String username, String passWord, int rewardPoints, double accountBalance, String[] address) {
        this.username = username;
        this.passWord = passWord;
        this.size = size;
        this.rewardPoints = rewardPoints;
        this.accountBalance = accountBalance;
        this.address = address;


    }

    public void resetPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public void setUsername(String newUserName) {
        this.username = newUserName;

    }

    public String getUserName() {
        return this.username;
    }


    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;

    }

    public int useRewardPoints(int pointsToUse) {
        rewardPoints = rewardPoints - pointsToUse;
        System.out.println("You just used " + pointsToUse + " you now have " + rewardPoints + " available");
        return rewardPoints;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
        if (accountBalance <= 0) {
            System.out.println("Cannot Give Negative Balance, try again.");
        }
    }

    public String[] getAddress() {
        return address;
    }

    public void setAddress(String[] address) {
        this.address = address;
    }

    public void printAllAddresses() {
        for (int i = 0; i < address.length; i++) {
            System.out.println(address[i]);
        }//end of for loop
    }//end of method


    public void printUserProfile(){
        System.out.println(username + " " + rewardPoints+ " " + accountBalance + " " + address[0] + " " + address[1]);

    }


}//end of class
