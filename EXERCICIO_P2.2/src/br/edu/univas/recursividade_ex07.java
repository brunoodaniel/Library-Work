package br.edu.univas;

import java.util.Objects;
import java.util.Scanner;

public class recursividade_ex07 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Type a word: ");
        String word = read.nextLine();

        String ReversedWord = reverse(word);

        boolean result = ProvingIfIsPalindrome(ReversedWord,word);

        System.out.println(result);

    }
    public static boolean ProvingIfIsPalindrome(String ReversedWord, String word){
        return Objects.equals(word, ReversedWord);
    }
    private static String reverse(String str) {
        if (str == null || str.equals("")) {
            return str;
        }
        return str.charAt(str.length() - 1) +
                reverse(str.substring(0, str.length() - 1));
    }
}
/*                                                                                          SOLUÇÃO DO RODRIGO:

            if (word.charAt(0) == word.charAt(word.length() - 1)){                          se a primeira letra e a ultima letra
                return isPolindrome(word.substring(1, word.length() - 1));                  forem iguais, entra no retorno cortando
            }                                                                               a primeira e a ultima para comparar.
                                                                                            ex:

                                                                                            ARARA
                                                                                            RAR
                                                                                            A

            return false;
 */