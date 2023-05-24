//package chapter8;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.testng.annotations.Test;
//
//import java.math.BigDecimal;
//
//import static org.testng.AssertJUnit.assertEquals;
//
//class DecimalTest {
//
//        private Decimal calculator;
//        private Citizen ernest;
//        private Citizen Decimal;
//        private Citizen obi;
//
//
//        @BeforeEach
//        public void setUp() {
//            ernest = new Citizen();
//            ernest.setFirstName("Ernest");
//            ernest.setSurname("Emmanuel");
//            BigDecimal salary = new BigDecimal(17000);
//            ernest.setEarnings(salary);
//
//            Decimal = new Citizen("Sam", "Emmanuel");
//            Decimal.setEarnings(BigDecimal.valueOf(25000));
//
//            obi = new Citizen("Wun", "Song");
//            Decimal.setEarnings(BigDecimal.valueOf(26000));
//
//        }
//
//        @Test
//        public void calculateTax(){
//            BigDecimal ernestTax = Decimal.calculateTax(ernest);
//            assertEquals(2550, ernestTax.intValue());
//
//            BigDecimal samTax = Decimal.calculateTax(Decimal);
//            assertEquals(3750, samTax.intValue());
//        }
//
//        @Test
//        public void calculateExcessTax(){
//            BigDecimal obiTax = TaxCalculator.calculateTax(obi);
//            assertEquals(7500, obiTax.intValue());
//    }
//    }
//
//}