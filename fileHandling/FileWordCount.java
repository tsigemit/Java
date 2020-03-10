import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
public class FileWordCount{
	public static void main(String[] args) {

      Map<String,Integer> wordCountMap = new HashMap<>();
		try{
		File f1= new File("./file1.txt");
		String[] words={};
		int wc =0;
		FileReader fr = new FileReader(f1);
		BufferedReader br = new BufferedReader(fr);
		String s;
		while((s=br.readLine())!=null)
		{
			words=s.split(" ");
			wc=wc+words.length;
			for(String word: words){
				if(wordCountMap.containsKey(word))
					wordCountMap.put(word,wordCountMap.get(word)+1);
				else
					wordCountMap.put(word,1);
			}
		}
		fr.close();
		System.out.println("Number of words in the file:"+wc);
		System.out.println("Word     " + "    Frequency");
		System.out.println("====         ========");
		for(String key: wordCountMap.keySet()){
			System.out.printf("%-10s%7d\n",key, wordCountMap.get(key));

		}
	}
	catch (Exception e) {
	System.out.println(e);
}
}
}