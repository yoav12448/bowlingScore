package bowling;
import java.util.List;
import java.util.ArrayList;

public class Frame {
	int number;
	boolean isStrike;
	boolean isSpare;
	List<Integer> roll;
	public Frame(int number) {
		this.number=number;
		isStrike=false;
		isSpare=false;
		roll=new ArrayList<>();
	}

	public int sumRolls(){
		int sum=0;
		for (Integer i : roll) {
			sum+=i;
		}
		return sum;
	}
	public boolean isStrike() {
		if(roll.get(0)==10)
			isStrike=true;
		return isStrike;
	}

	public boolean isSpare() {
		int sum;
//		System.out.println("roll size "+roll.size());
		if(roll.size()==2){
			sum=roll.get(0)+roll.get(1);
			if (sum==10)
				isSpare=true;
		}
		return isSpare;
	}
	public boolean getSpare() {
		return isSpare;
	}
	public boolean getStrike() {
		return isSpare;
	}

}
