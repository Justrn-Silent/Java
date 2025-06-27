package 框架_List_Note;

public class Note {
	 Note last;
	 Note after;
	 Object str;
	public Note(Note last, Note after, Object str) {
		super();
		this.last = last;
		this.after = after;
		this.str = str;
	}
	public Note(Object str) {
		super();
		this.str = str;
	}


	
}
