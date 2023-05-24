package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class AccountTest {

    @Test
    public void depositMoneyTest(){
        //given i have an account
        Account amirahTeenAccount = new Account();
        //when i deposit 3000
        amirahTeenAccount.deposit(3000);
        //check my balance increases by 3000
        int balance = amirahTeenAccount.getbalance();
       assertEquals(3000, balance);

    }

    @Test
    public void negativeDepositShouldNotWorkTest(){
        //given i have an account
        Account amirahTeensAccount = new Account();
        // given that balance is 100000
        amirahTeensAccount.deposit(10000);
        assertEquals(10000,amirahTeensAccount.getbalance());
        //when i deposit -5000
        amirahTeensAccount.deposit( -5000);
        // check that balance is 10000
    }


    @Test
    public void withdrawMoneyTest() {
        // i have an account
        Account amirahTeensAccount = new Account();
        // i have an account
        amirahTeensAccount.deposit(1000);
        //
        amirahTeensAccount.withdraw(500);
        assertEquals(500, amirahTeensAccount.getbalance());
    }

    @Test
    public void withdrawingAboveBalanceFailsTest() {
        //given i have an account
        Account amirahTeensAccount = new Account();
        // given that amira thinks she has big money (3000)
        amirahTeensAccount.deposit(3000);
        amirahTeensAccount.withdraw(50000);
        assertEquals(3000, amirahTeensAccount.getbalance());
    }

}