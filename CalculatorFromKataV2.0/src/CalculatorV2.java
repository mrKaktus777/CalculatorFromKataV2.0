import java.util.Scanner;

public class CalculatorV2 {
    static String s1;
    static String operation;
    static String s2;
    static int resultArab;
    static int resultRoman;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String expression = scan.nextLine();
        String[] array = expression.split(" ");
        s1 = array[0];
        operation = array[1];
        s2 = array[2];
        if (array.length == 3) {
        } else {
            System.out.println("Неверный ввод данных.");
        }
        int arab1 = arabToNumber(s1);
        int arab2 = arabToNumber2(s2);
        if ((arab1 > 0) && (arab2 > 0)) {
            if (operation.equals("+")) {
                resultArab = arab1 + arab2;
                System.out.println(resultArab);
            } else if (operation.equals("-")) {
                resultArab = arab1 - arab2;
                System.out.println(resultArab);
            } else if (operation.equals("*")) {
                resultArab = arab1 * arab2;
                System.out.println(resultArab);
            }else   if (operation.equals("/")) {
                resultArab = arab1 / arab2;
                System.out.println(resultArab);
            }
            else {
                throw new RuntimeException("Ошибка. Неверный знак операции.");
            }
        } else {
            romanResult(s1, s2);
        }
    }

    public static void romanResult(String s1, String s2) {
        int roman1 = romanToNumber(s1);
        int roman2 = romanToNumber2(s2);
        if (operation.equals("+")) {
            resultRoman = roman1 + roman2;
            String result2 = arabToRoman(resultRoman);
            System.out.println(result2);
        } else if (operation.equals("-")) {
            resultRoman = roman1 - roman2;
            if (resultRoman > 0){
                String result2 = arabToRoman(resultRoman);
                System.out.println(result2);
            } else {
                throw new RuntimeException("Ошибка. Результат меньше или равен нулю.");
            }
        } else if (operation.equals("*")) {
            resultRoman = roman1 * roman2;
            String result2 = arabToRoman(resultRoman);
            System.out.println(result2);
        } else if (operation.equals("/")) {
            resultRoman = roman1 / roman2;
            if (resultRoman>0){
                String result2 = arabToRoman(resultRoman);
                System.out.println(result2);
            } else {
                throw new RuntimeException("Ошибка. Результат меньше или равен нулю.");
            }
        } else {
            throw new RuntimeException("Ошибка. Неверный знак операции.");
        }
    }

    public static String arabToRoman(int resultRoman) {
        String[] roman = {" ", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
                "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
                "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
                "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX",
                "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
        String rom = roman[resultRoman];
        return rom;
    }

    public static int arabToNumber(String s1) {
        try {
            if (s1.equals("1")) {
                return 1;
            } else if (s1.equals("2")) {
                return 2;
            } else if (s1.equals("3")) {
                return 3;
            } else if (s1.equals("4")) {
                return 4;
            } else if (s1.equals("5")) {
                return 5;
            } else if (s1.equals("6")) {
                return 6;
            } else if (s1.equals("7")) {
                return 7;
            } else if (s1.equals("8")) {
                return 8;
            } else if (s1.equals("9")) {
                return 9;
            } else if (s1.equals("10")) {
                return 10;
            }
        } catch (RuntimeException e) {
            throw new RuntimeException("Ошибка. Введенные данные недопустимы.");
        }
        return 0;
    }

    public static int arabToNumber2(String s2) {
        try {
            if (s2.equals("1")) {
                return 1;
            } else if (s2.equals("2")) {
                return 2;
            } else if (s2.equals("3")) {
                return 3;
            } else if (s2.equals("4")) {
                return 4;
            } else if (s2.equals("5")) {
                return 5;
            } else if (s2.equals("6")) {
                return 6;
            } else if (s2.equals("7")) {
                return 7;
            } else if (s2.equals("8")) {
                return 8;
            } else if (s2.equals("9")) {
                return 9;
            } else if (s2.equals("10")) {
                return 10;
            }
        } catch (RuntimeException e) {
            throw new RuntimeException("Ошибка. Введенные данные недопустимы.");
        }
        return 0;
    }

    public static int romanToNumber(String s1) {
        if (s1.equals("I")) {
            return 1;
        } else if (s1.equals("II")) {
            return 2;
        } else if (s1.equals("III")) {
            return 3;
        } else if (s1.equals("IV")) {
            return 4;
        } else if (s1.equals("V")) {
            return 5;
        } else if (s1.equals("VI")) {
            return 6;
        } else if (s1.equals("VII")) {
            return 7;
        } else if (s1.equals("VIII")) {
            return 8;
        } else if (s1.equals("IX")) {
            return 9;
        } else if (s1.equals("X")) {
            return 10;
        } else {
            throw new RuntimeException("Ошибка. Введенные данные недопустимы.");
        }
    }

    public static int romanToNumber2(String s2) {

        if (s2.equals("I")) {
            return 1;
        } else if (s2.equals("II")) {
            return 2;
        } else if (s2.equals("III")) {
            return 3;
        } else if (s2.equals("IV")) {
            return 4;
        } else if (s2.equals("V")) {
            return 5;
        } else if (s2.equals("VI")) {
            return 6;
        } else if (s2.equals("VII")) {
            return 7;
        } else if (s2.equals("VIII")) {
            return 8;
        } else if (s2.equals("IX")) {
            return 9;
        } else if (s2.equals("X")) {
            return 10;
        } else {
            throw new RuntimeException("Ошибка. Введенные данные недопустимы.");
        }
    }
}

