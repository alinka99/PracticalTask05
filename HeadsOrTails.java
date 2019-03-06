import java.util.Random;


public class HeadsOrTails {

	//head = true, tail = false
	public static boolean checkHeads(){
		
		return new Random().nextBoolean();
		
	}
	
	public static int getNumberHeads(long N){
	
		if (N < 0){
			return -1;
		}
		
		int numberHeads = 0;
		
		for (int i = 0; i < N; i++){
			if (checkHeads()){
				numberHeads++;
			}
		}
		
		return numberHeads;
		
	}
}
