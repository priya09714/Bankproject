package com.sopra.project;

import java.util.Scanner;

public class Main{
	

private int bankid;
String bankName;
private long AccountNo;
private int amount;
int balance;




public int getBankid() {
    return bankid;
}




public void setBankid(int bankid) {
    this.bankid = bankid;
}




public long getAccountNo() {
    return AccountNo;
}




public void setAccountNo(long accountNo) {
    AccountNo = accountNo;
}




public int getAmount() {
    return amount;
}




public void setAmount(int amount) {
    this.amount = amount;
}

void setdata() {
    bankid=705076;
    bankName="Indian Bank";
    AccountNo=1232315;
    
    
}
int Deposit(int balance) {
    amount+=balance;
    System.out.println("after depositing ur amount is" + " "+amount);
    System.out.println();
    return amount;
    
    
}
int withdraw(int balance) {
    amount-=balance;
    System.out.println("after withdrawal ur amount is" +" " +amount);
    return amount;
    
}
void printdata() {
    System.out.println(this.bankid);
    System.out.println(bankName);
    System.out.println(AccountNo);
    balance=amount;
    System.out.println("final balance amount is:" +balance);
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        
        Bank ba=new Bank();
        System.out.println("enter how much u want to deposit");
        int k=sc.nextInt();
        ba.Deposit(k);
        System.out.println("enter how much u want to withdraw");
        int l=sc.nextInt();
        
        ba.withdraw(l);
        System.out.println();
        ba.printdata();
        ba.setdata();
        sc.close();



   }





}

