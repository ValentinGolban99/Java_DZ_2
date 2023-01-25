public class S2 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello!"); // создать
        sb.reverse(); // развернуть
        System.out.println(sb);
        sb.reverse();
        sb.delete(2, sb.length()-2); // удалить
        System.out.println(sb);
        sb.insert(sb.length()/2, " ogo "); // вставить
        System.out.println(sb);
        sb.deleteCharAt(0); // удаляет отдельно букву
        System.out.println(sb);
        sb.append("добавил в конец");
        System.out.println(sb);
        System.out.println(sb.indexOf("e")); // находит индек елемента начиная с начала. при lastIndexOF находит ближайший с конца

        double begin = System.currentTimeMillis(); // определяет и сохроняет время
        String str = "";
        for (int i = 0; i < 1000; i++) {
            str += Character.getName(i);
        }
        System.out.println(System.currentTimeMillis() - begin); // покажет сколько прошло (52)

        begin = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            stringBuilder.append(Character.getName(i));
        }
        System.out.println(System.currentTimeMillis() - begin); // покажет сколько прошло (1)

    }
}