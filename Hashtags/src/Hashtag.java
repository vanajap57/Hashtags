import java.util.*; 
public class Hashtag {
	
	     public static void main(String []args){
	ArrayList<String>hashTags = getHashTags("asd , sefghjsdfghnjkjhgfdfgsdfsdfsdf ");

	      for (int i = 0; i<hashTags.size(); i++) {
	System.out.println(hashTags.get(i)); 
	        } 
	     }

	    public static ArrayList<String>getHashTags(String str){
	String[] arr=str.split(" ");

	        String first = "", second = "", third = "";

	for(int i=0;i<arr.length;i++){
	            int wordLen = 0;

	            String word  =  "";
	            for (int j =0; j <arr[i].length(); j++){

	                if (Character.isLetter(arr[i].charAt(j))){
	                    word += arr[i].charAt(j);
	wordLen +=1;
	                }
	            }

	            if (wordLen>first.length()+1) 
	            { 
	                third = second; 
	                second = first; 
	                first = "#" + word; 
	            } 
	            else if (wordLen>second.length()+1) 
	            { 
	                third = second; 
	                second = "#" + word; 
	            } 

	            else if (wordLen>third.length()+1) 
	                third = "#" + word; 

	        }


	ArrayList<String>topThreeHashtags = new ArrayList<String>(3); 

	        if(first.length() > 0){
	topThreeHashtags.add(first);
	        }

	        if(second.length() > 0){
	topThreeHashtags.add(second);
	        }

	        if(third.length() > 0){
	topThreeHashtags.add(third);	
	        }

	        return topThreeHashtags;
	    }
	}



