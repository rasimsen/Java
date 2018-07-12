import java.util.concurrent.Callable;

class Egg {
	private int countHatch = 0;

	Egg() {
	}

	public Egg(Callable<Bird> createBird) {
		throw new UnsupportedOperationException("Waiting to be implemented.");
	}

	public Bird hatch() throws Exception {
		if (countHatch <= 0) {
			countHatch++;
			return new Chicken();
		} else {
			throw new UnsupportedOperationException("Waiting to be implemented.");
		}

	}

}