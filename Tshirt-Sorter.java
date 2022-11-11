/*
   Write a function that will take in a string containing only s, m, and l characters. Ex: slsmmsllsmsmlmsls

   This string essentially represents a bunch of t-shirts in an unsorted pile. Your function should return this pile of t-shirts sorted by small, then medium, then large. The above example would be returned sssssssmmmmmlllll.

   The given string will never include characters outside of the lowercase s, m, and l. The string will also never contain any spaces.

   >>> tshirtSorter('lms')
   // sml

   >>> tshirtSorter('smllms')
   // ssmmll
    */

public class Main {
    public static void main(String[] args) {
        System.out.println(tshirtSorter("mmsssmmssllsmsls"));
    }

    static String tshirtSorter(String input){
        int s_counter = 0;
        int m_counter = 0;
        int l_counter = 0;

        for(char item: input.toCharArray()){
            if(item == 's'){
                s_counter++;
            } else if (item == 'm') {
                m_counter++;
            } else if (item == 'l') {
                l_counter++;
            }
        }

        return  "s".repeat(s_counter) + "m".repeat(m_counter) + "l".repeat(l_counter);

    }
}
