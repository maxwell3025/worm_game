package worm;

public class Wormsegment {
	int lifetime;
	int age;

	public Wormsegment(int life) {
		int lifetime = life;
		int age = 0;
		
	}
	public void tick(){
		age++;
		if(age>=lifetime){
		}
	}

}
