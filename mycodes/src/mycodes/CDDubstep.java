/*
  Let's assume that a song consists of some number of words (that don't contain WUB). 
  To make the dubstep remix of this song, Polycarpus inserts a certain number of words 
  "WUB" before the first word of the song (the number may be zero), after the last word
  (the number may be zero), and between words (at least one between any pair of neighbouring words),
  and then the boy glues together all the words, including "WUB", 
  in one string and plays the song at the club.
   
   The input consists of a single non-empty string, consisting only of uppercase English letters, 
   the string's length doesn't exceed 200 characters
   
   Return the words of the initial song that Polycarpus used to make a dubsteb remix. 
   Separate the words with a space.
   
 */

package mycodes;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CDDubstep {
/*
 *    String result = song.replaceAll("(WUB)+", " ").trim();
      return result;
 * 
 */
	
	 public static String SongDecoder (String song)
	  {
	    String [] str = song.split("WUB");
	    return Arrays.stream(str)
	    .filter(e -> !"".equals(e))
	    .collect(Collectors.joining(" "));
	    
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(SongDecoder("WUBWEWUBAREWUBWUBTHEWUBCHAMPIONSWUBMYWUBFRIENDWUB"));
	}

}
