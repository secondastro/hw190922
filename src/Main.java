public class Main {
    public static void main(String[] args) {
//Задача 1
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        StringBuilder fullName = new StringBuilder(lastName + " " + firstName + " " + middleName);
        System.out.println("ФИО сотрудника - " + fullName);
//Задача 2
        System.out.println("Задача 2");
        String nameUpperCase = fullName.toString().toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + nameUpperCase);
//Задача 3
        System.out.println("Задача 3");
        fullName = new StringBuilder("Иванов Семён Семёнович");
        fullName = new StringBuilder(fullName.toString().replace("ё", "е"));
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName);
//Задачи повышенной сложности
//Задача 5
        System.out.println("Задача 5");
        fullName = new StringBuilder("Ivanov Ivan Ivanovich");
        String[] arr = fullName.toString().split(" ");
        firstName = arr[1];
        middleName = arr[2];
        lastName = arr[0];
        System.out.println("Имя сотрудника - " + firstName);
        System.out.println("Фамилия сотрудника - " + lastName);
        System.out.println("Отчество сотрудника - " + middleName);
//Задача 6
        System.out.println("Задача 6");
        fullName = new StringBuilder("ivanov ivan ivanovich");
        arr = fullName.toString().split(" ");
        fullName = new StringBuilder();
        StringBuilder name = new StringBuilder();
        for (String s : arr) {
            char c = s.charAt(0);
            char[] array = s.toCharArray();
            array[0] = Character.toUpperCase(c);
            for (char n : array) { //Не сообразил как по-другому собрать строку из массива чаров
                name.append(n);
            }
            fullName.append(name).append(" ");
            name = new StringBuilder();
        }
        System.out.println(fullName);

//Задача 7
        System.out.println("Задача 7");
        String s1 = "135";
        String s2 = "246";
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr1.length; i++) {
            char a = arr1[i];
            char b = arr2[i];
            sb.append(a).append(b);
        }
        System.out.println("Данные строки - " + sb);
        //Задача 8
        System.out.println("Задача 8");
        String alphabet = "aabccddefgghiijjkk";
        char[] alphabetChar = alphabet.toCharArray();
        for (int i = 0; i < alphabetChar.length -1 ; i++) {
            if (alphabetChar[i] == alphabetChar[i + 1]) {
                System.out.print(alphabetChar[i]);
            }
        }
    }
}