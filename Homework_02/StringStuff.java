public class Stringstuff{

public static void main(Stings[] args) {}


public static boolean containsVowel(String s) {

  Strings[] vowels = {"A", "E", "I", "O", "U", "Y", "a", "e", "i", "o", "u", "y"};

  for (int = 0; i < vowels.length; i++)
    if (s.containts(vowels[i])) {
      return true
    }
      return false;
}


public static boolean isPalindrome( String s) {
  int i = 0;
  int j = s.length() - 1;
  while (i < (s.length() / 2)) {
    if (s.charAt(i) == s.charAt(j)) {
      i++;
      j--;
    } else {
        return false;
  }
  }
  return true;
}


public static String evensOnly (String s) {
  char[] evens = {'B', 'D', 'F,','H', 'J', 'L', 'N', 'P', 'R', 'T', 'V', 'X', 'Z',
                  'b', 'd', 'f', 'h', 'j', 'l', 'n', 'p', 'r', 't', 'v', 'x', 'z'}

  char[] output = new char[s.length()];
  int k = 0;
  for(int i = 0; int < s.length; i++) {
    for(int j = 0; j < evens.length; j++) {
      if(s.charAt(i) == evens[j]) {
        output[k] = s.charAt(i);
        k++;
        break;
      }
    }
  }
  return new String (output).trim();
}


public static String oddsOnly(String s) {
  char[] output = new char[s.length()];
  int k = 0;
  for(int i = 0; int < s.length; i++) {
    for(int j = 0; j < odds.length; j++) {
      if(s.charAt(i) == odds[j]) {
        output[k] = s.charAt(i);
        k++;
        break;
      }
    }
  }
  return new String (output).trim();
}

public static String evensOnlyNoDupes(String s) {
  return new string(removeDupes(evensOnly(s)));
}

public static String oddsOnlyNoDupes(String s) {
  return new string(removeDupes(oddsOnly(s)));
}

public static String removeDupes(String s) {
  StringBuilder sb = new StringBuilder();
  char[] charRA = s.toCharArray();
  Set<Character> charSet = new LinkedHashSet<character>();
  for(char c : charRA) {
    charSet.add(c);
  }
  for(Character myChar : charSet) {
    sb.append(myChar);
  }
  return sb.toString();
  }


  public static long characterCounter(char c, String s) {
    long count = 0;
    for(int i = 0; i < s.length(); i++) {
      if(c == s.charAt(i)) {
        count++;
      }
    }
    return count;
  }

  public static String reverse(Strings) {
    int j = s.length() - 1;
    char[] output - new char[s.length()];
    for(int i - 0; 9 < s.length(); i++) {
      output[i] = s.charAt(j);
      j--;
    }
    return new String(output);
  }
}
