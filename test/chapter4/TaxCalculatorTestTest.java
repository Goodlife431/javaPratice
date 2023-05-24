//package chapter4;
//
//import chapter8.Citizen;
//import org.junit.jupiter.api.BeforeEach;
//import org.testng.annotations.Test;
//
//import java.math.BigDecimal;
//
//import static org.testng.AssertJUnit.assertEquals;
//
//class TaxCalculatorTestTest {
//        private TaxCalculator calculator;
//        private Citizen seun;
//        private Citizen sam;
//        private Citizen obi;
//
//
//        @BeforeEach
//        public void setUp() {
//            seun = new Citizen();
//            seun.setFirstName("Ernest");
//            seun.setSurname("Emmanuel");
//            BigDecimal salary = new BigDecimal(17000);
//            seun.setEarning();
//
//            sam = new Citizen("Sam", "Emmanuel");
//            sam.setEarning(BigDecimal.valueOf(25000));
//
//            obi = new Citizen("Wun", "Song");
//            sam.setEarnings(BigDecimal.valueOf(26000));
//
//        }
//
//        @Test
//        public void calculateTax(){
//            BigDecimal ernestTax = TaxCalculator.calculateTax(seun);
//            assertEquals(2550, ernestTax.intValue());
//
//            BigDecimal samTax = TaxCalculator.calculateTax(sam);
//            assertEquals(3750, samTax.intValue());
//        }
//
//        @Test
//        public void calculateExcessTax(){
//            BigDecimal obiTax = TaxCalculator.calculateTax(obi);
//            assertEquals(7500, obiTax.intValue());
//}
//    }
//}