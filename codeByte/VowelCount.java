public class VowelCount {
    

    static int vowelCount(String str) {
     String smallVowels = "aeiou";
     String upperVowels = smallVowels.toUpperCase();
        int count = 0;
        for (char c : str.toCharArray()) {
            if (smallVowels.indexOf(c) > -1 || upperVowels.indexOf(c) > -1) {
                count++;
            }
        }

        return count;

    }

    public static void main (String[] args) {
        // keep this function call here
        //Scanner s = new Scanner(System.in);
        System.out.println(vowelCount("All cows eat grass"));
        System.out.println(vowelCount("All Goats eat grass and dring water"));
    }
}