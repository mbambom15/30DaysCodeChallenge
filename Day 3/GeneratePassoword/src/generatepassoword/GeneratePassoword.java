/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generatepassoword;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 *
 * @author nhlak
 */
public class GeneratePassoword {

    private static final String CHAR_POOL = "ABCDEFGHIJKLMNOPQRSTUVWYZXabcdefghijklmnopqrstuvwyxz1234567890!@#$%^&*()_+-{}";
    private static final int DEFAULT_LENGTH = 14;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the length of the password you wish to generate: 12-15");
        int userlength = scan.nextInt();
        
        System.out.println(generatePasword(userlength));

    }

    public static String generatePasword(int length) {
        if (length < 2) {
            length = DEFAULT_LENGTH;
        }
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(CHAR_POOL.length());
            password.append(CHAR_POOL.charAt(index));
        }
        return password.toString();
    }

}
