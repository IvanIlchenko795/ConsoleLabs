public class ReplaceLetters {

    public static void main(String[] args) {
        // Текст
        String text = "Встане славна мати Україна,\n" + 
                      "Щаслива i вiльна,\n" + 
                      "Вiд Кубанi аж до Сяну-рiчки\n" + 
                      "Одна, нероздiльна.";

        // Заміна літери 'а' на 'о'
        String modifiedText = text.replace('а', 'о').replace('А', 'О');

        // Виведення результату
        System.out.println("Оригiнальний текст:");
        System.out.println(text);
        System.out.println("\nМодифiкований текст (а -> о):");
        System.out.println(modifiedText);
    }
}