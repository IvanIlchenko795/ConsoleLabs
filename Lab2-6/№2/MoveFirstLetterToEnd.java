public class MoveFirstLetterToEnd {

    public static void main(String[] args) {

        // Текст
        String text = "Чого являєшся менi у снi? Чого звертаєш ти до мене чудовi очi тi яснi";

        // Розділення тексту на слова
        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            // Виділення слова та знаків пунктуації
            String cleanWord = word.replaceAll("[^а-яА-ЯiїєґIЇЄҐ']", "");
            String punctuation = word.replaceAll("[а-яА-ЯiїєґIЇЄҐ']+", "");

            if (cleanWord.length() > 1) {
                String transformed = cleanWord.substring(1) + cleanWord.charAt(0);
                result.append(transformed);
            } else {
                result.append(cleanWord);
            }

            result.append(punctuation).append(" ");
        }

        // Виведення результату
        System.out.println("Оригiнальний текст:");
        System.out.println(text);
        System.out.println("Модифiкований текст (перша лiтера перенесена в кiнець слова):");
        System.out.println(result.toString().trim());
    }
}