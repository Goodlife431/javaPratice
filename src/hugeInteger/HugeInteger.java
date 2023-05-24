package hugeInteger;

import java.util.Arrays;

public class HugeInteger implements Comparable <HugeInteger>{
    private  final int MAX_LIMIT = 40;
    private final int [] digits = new int[MAX_LIMIT];
    private final boolean negative;
    public final int length;
    public static HugeInteger ZERO = HugeInteger.parse("0");

    private static HugeInteger parse(String number) {
        return new HugeInteger(number);
    }
    public static HugeInteger parse(int number){
        return new HugeInteger(number);
    }

    public HugeInteger(String number) {
        this.negative = number.contains("-");
        String[] digitString = this.trimZeros(number.replaceAll("\\D","")).split("");
        length = digitString.length;

        int i = MAX_LIMIT - digitString.length + 1;
        int numCounter = 0;

        while (i <= MAX_LIMIT){
            digits[i - 1] = Integer.parseInt(digitString[numCounter]);
            i++;
            numCounter++;
        }
    }

    public HugeInteger(int number){
        this(String.valueOf(number));
    }


    @Override
    public String toString(){
       StringBuilder value = new StringBuilder();
       if (this.negative){
           value.append("-");
       }
       for (int i = (MAX_LIMIT - length + 1); i <= MAX_LIMIT; i++){
           value.append(digits[i - 1]);
       }
       return value.toString();
    }

    @Override
    public boolean equals(Object obj){
        if(this.getClass() != obj.getClass())
            return false;

        HugeInteger number = (HugeInteger) obj;
        return Arrays.equals(this.digits, number.digits) && this.negative == number.negative;
    }

    @Override
    public int compareTo(HugeInteger number) {
        if(this.equals(number))
            return 0;

        int remainder = 0;
        int counter = MAX_LIMIT - 1;

        while (counter > Math.min((MAX_LIMIT - this.length), (MAX_LIMIT - number.length)) - 1){
            int d1 = this.digits[counter];
            int d2 = number.digits[counter];

            int sub = d1 - remainder - d2;
            remainder = sub < 0 ? 1 : 0;

            counter--;
        }

        if (remainder == 1){
            return -1;
        }
        else {
            return 1;
        }
    }
    private String trimZeros(String replaceAll) {
        String value = replaceAll;

        for (int i = 0; i < replaceAll.length() - 1; i ++){
            if (value.charAt(0) == '0'){
                value = value.substring(1);
            }else {
                break;
            }
        }
        return value;
    }
    private HugeInteger privateSubtract(HugeInteger number, boolean negative){
        int remainder = 0;
        int counter = MAX_LIMIT - 1;

        StringBuilder minusString = new StringBuilder();

        while (counter > 0){
            int d1 = this.digits[counter];
            int d2 = number.digits[counter];

            int sub = d1 - remainder - d2;
            remainder = sub < 0 ? 1 : 0;

            minusString.insert(0, (sub < 0 ? (10 + sub) : sub));
            counter--;
        }
        return  new HugeInteger((negative ? "-" : "") + minusString);
    }
    public HugeInteger add(HugeInteger number){
        int remainder = 0;
        int counter = MAX_LIMIT - 1;

        StringBuilder sumString = new StringBuilder();

        while (counter >= Math.min((MAX_LIMIT - this.length), (MAX_LIMIT - number.length)) || remainder != 0){
            int d1 = this.digits[counter];
            int d2 = number.digits[counter];

            int sum = d1 + d2 + remainder;
            int sumD = sum % 10;
            remainder = sum / 10;
            sumString.insert(0,sumD);
            counter--;
        }
        return new HugeInteger(sumString.toString());
    }
    public  HugeInteger subtract(HugeInteger number){
        if (this.compareTo(number) < 0){
            return number.privateSubtract(this, true);
        }
        return  this.privateSubtract(number, false);
    }

    public boolean isGreaterThan(HugeInteger number){
        return this.compareTo(number) > 0;
    }
    public boolean isGreaterThanOrEqualTo(HugeInteger number){
        return this.compareTo(number) >= 0;
    }
    public boolean isEqualTo(HugeInteger number){
        return this.compareTo(number) == 0;
    }
    public boolean isLesserThan(HugeInteger number){
        return this.compareTo(number) < 0;
    }
    public boolean isLesserThanOrEqualTo(HugeInteger number){
        return this.compareTo(number) <= 0;
    }
}
