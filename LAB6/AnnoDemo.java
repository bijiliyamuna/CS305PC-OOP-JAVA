class AnnoP{
	@Deprecated
	public void depM(){
		System.out.println("Deprecated Method");
	}
	public void ovR(){
		System.out.println("AnnoP");
	}
}
@MyAnno("My ANNO DEF")
class AnnoC extends AnnoP{
	@Override
	public void ovR(){
		System.out.println("AnnoC");
	}
}
class AnnoDemo{
	@SuppressWarnings("deprecation")
	public static void main(String...args){
		Class<?> ct = AnnoC.class;
		AnnoC ac = new AnnoC();
		ac.ovR();
		ac.depM();
		
System.out.println(ct.isAnnotationPresent(MyAnno.class));
System.out.println(ct.getAnnotationType(MyAnno.class).usage());
	}
}
