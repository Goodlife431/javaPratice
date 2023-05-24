package chapter5;

import static org.junit.jupiter.api.Assertions.*;

class AutoPolicyTest {
    public static void main(String[] args) {
        AutoPolicy policy = new AutoPolicy(2222222,"toyota camry","NJ");
        AutoPolicy policy1 = new AutoPolicy(54522421,"ford fusion", "PJ");

        AutoPolicy.policyInNoFaultState(policy);
        AutoPolicy.policyInNoFaultState(policy1);
    }

}