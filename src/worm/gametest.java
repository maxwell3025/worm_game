package worm;

public class gametest {

	public static void main(String[] args) {
		Wormsegment[] worm = {};
		for (int o = 0; o < 10; o++) {

			for (int i = 0; i < 10; i++) {
				worm[i] = new Wormsegment(i);
			}
		}
	}
}
