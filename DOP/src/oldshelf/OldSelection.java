package oldshelf;

public class OldSelection {

	// TODO: Complete this method.
	/*
	 * 
	 * @param o object
	 * returns if o is not a book, returns empty string, if Comic, returns title, of
	 * Fiction
	 * returns name, and if TextBook, returns subject.
	 */
	public static String getAgeOrTitle(Object o) {

		if (o instanceof Book) {

			if (o instanceof Comic) {
				return ((Comic) o).getTitle();
			} else if (o instanceof Fiction) {
				return ((Fiction) o).getName();
			} else if (o instanceof TextBook) {
				return ((TextBook) o).getSubject();
			}
		}
		return "";
	}

	public static void main(String[] args) {

		// TODO: Write a test code here and execute and text.
		Comic comic = new Comic("spider man", 20);
		Fiction fiction = new Fiction("tom and jerry", FictionType.Comedy);
		TextBook testbook = new TextBook("maths");
		System.err.println(getAgeOrTitle(comic));
		System.err.println(getAgeOrTitle(fiction));
		System.err.println(getAgeOrTitle(testbook));

	}
}
