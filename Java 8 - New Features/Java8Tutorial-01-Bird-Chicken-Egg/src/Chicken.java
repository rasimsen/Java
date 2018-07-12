class Chicken implements Bird {
    public Chicken() {
    }

    public static void main(String[] args) throws Exception {
        Chicken chicken = new Chicken();
        Egg lay = chicken.lay();
        lay.hatch();
        //lay.hatch(); // error test
        System.out.println(chicken instanceof Bird);
    }

	@Override
	public Egg lay() {
		return new Egg();
	}
}