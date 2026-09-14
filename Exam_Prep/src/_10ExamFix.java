public class _10ExamFix {
	public static void main(String[] args){
		_10Pig p = new _10Pig(3);
		p.feed();
		System.out.println(p.getStatus());
	_10FarmAnimal f = new _10Pig(4);
	
	f = p;
	
		f.feed();
			System.out.println( f.getStatus());
						_10Cow_2 c = new _10Cow_2(7);
			f = c;
						c.feed();
			   f.feed(); f.feed(); f.feed();
				System.out.println(f.getStatus() + " ");
						System.out.println(c.getStatus());
						}
}