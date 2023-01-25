public class dz_2 {
    public static void main(String[] args) {
        String str_1 = "hello";
        String str_2 = "hello";
        task_1_and_2(str_1, str_2);
        task_1_and_2(str_1, new StringBuilder(str_2).reverse().toString());
        task_4_and_5();
    }

    public static void task_1_and_2(String str_1, String str_2) {
        System.out.println(str_1.contains(str_2));
    }
    
    public static void task_4_and_5() {
        StringBuilder sb = new StringBuilder();
        int num_1 = 3;
        int num_2 = 56;
        int result = num_1 + num_2;
        sb.append(String.valueOf(num_1));
        sb.append(String.valueOf(" + "));
        sb.append(String.valueOf(num_2));
        sb.append(String.valueOf(" = "));
        sb.append(String.valueOf(result));
        System.out.println(sb);
        sb.deleteCharAt(7);
        sb.insert(7, "равно");
        System.out.println(sb);
    }


}