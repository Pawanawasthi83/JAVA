package example.corejava.codechef;

public class BeerSong {

	public static void main(String[] args) {

		int bonum=5;
		String word ="Bottles";
		
		while (bonum>0) {
			if(bonum==1){
				word="Bottle";
			}
			System.out.println(bonum+" "+word+" "+"are on the wall");
			bonum=bonum-1;
		}
		if (bonum>0) {
			System.out.println(bonum+" "+word+" "+"are on the wall");
		} else {
			System.out.println("No more bottles of beer on the wall");
		}
	}

}
