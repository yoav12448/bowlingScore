package bowling;

public class Game {
	int total_Score;
	Frame[] frame;
	int currentFrame;

	public Game() {
		total_Score=0;
		currentFrame=0;
		frame=new Frame[10];
		for(int i=0;i<10;i++){
			frame[i]=new Frame(i);
		}
	}
	//adding the pins number to the matched frame
	public void roll(int pins){
		frame[currentFrame].roll.add(pins);
		if(frame[currentFrame].isStrike()&&currentFrame!=9)
			currentFrame++;
		else if(frame[currentFrame].roll.size()==2&&currentFrame!=9){
			frame[currentFrame].isSpare();
			currentFrame++;

		}

	}

	public int score(){
		for(int i=0;i<=currentFrame;i++){
			if(frame[i].isStrike){
				if (i!=9){// not the last round
					if(!frame[i+1].isStrike){// if not followed by Strike
						total_Score+=10+frame[i+1].sumRolls();
					}
					else if(i!=8){// not the 9th round
						total_Score+=10+frame[i+1].roll.get(0)+frame[i+2].roll.get(0);
					}
					else // the 9th round
						total_Score+=10+frame[i+1].roll.get(0)+frame[i+1].roll.get(1);
						
				}
				else // The Last Round
					total_Score+=frame[i].sumRolls();
			}
			else if(frame[i].isSpare){
				if (i!=9)// not the last round
					total_Score+=10+frame[i+1].roll.get(0);
				else
					total_Score+=frame[i].sumRolls();
			}
			else
				total_Score+=frame[i].sumRolls();

			System.out.println("the frame "+(i+1)+" score is "+total_Score);
		}
		return total_Score;
	}

}
