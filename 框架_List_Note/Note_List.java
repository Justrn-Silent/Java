package 框架_List_Note;

public class Note_List {
	private Note last;
	private Note after;
	private int count;
	public void add(Object o) {
		// TODO 自动生成的方法存根
		Note note =new Note(o);
		if(last==null) {
			last=note;
			after=note;
		}else {
			note.last=after;
			after=note;
			last=note.last;
		}
		count++;
	}
	@Override
	public String toString() {
		// TODO 自动生成的方法存根
		StringBuilder s =new StringBuilder();
		s.append("[");
		//取数据
		s.append("]");

		return s.toString();
	}
	public static void main(String[] args) {
		Note_List  n = new Note_List();
		n.add("123");
		n.add("321");
		n.add("1");
	}
}
