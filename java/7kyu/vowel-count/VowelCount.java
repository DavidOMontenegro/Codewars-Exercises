/*
 * Given a point in a Euclidean plane (x and y), return the quadrant the point
 * exists in: 1, 2, 3 or 4 (integer). x and y are non-zero integers, therefore
 * the given point never lies on the axes.
 */

public class VowelCount {
    public static int getCount(String str) {
        final String VOWELS = "AEIOUaeiou";
        int j = 0;
        for (int i = 0; i < str.length(); i++) {
            j += VOWELS.indexOf(str.charAt(i)) == -1 ? 0 : 1;
        }
        return j;
    }

    public static void main(String[] args) {
        System.out.println(getCount("abracadabra"));    // 5
        System.out.println(getCount(""));               // 0
        System.out.println(getCount("pear tree"));      // 4
        System.out.println(getCount("o a kak ushakov lil vo kashu kakao"));            // 13
        System.out.println(getCount("tk r n m kspkvgiw qkeby lkrpbk uo thouonm "));    // 
    }
}