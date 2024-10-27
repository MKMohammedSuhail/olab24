package newshelf;

public class NewSelection {

	// TODO: Complete this method
	/**
	 * 
	 * @param o object
	 *          returns if o is not a book, returns empty string, if Comic, returns
	 *          title, of Fiction
	 *          returns name, and if TextBook, returns subject.
	 */
	public static String getAgeOrTitle(Object o) {

		if (o instanceof IBook) {
			if (o instanceof Comic comic) {
				return comic.title();
			} else if (o instanceof Fiction fiction) {
				return fiction.name();
			} else if (o instanceof TextBook textBook) {
				return textBook.subject();
			}
		}
		return "NULL";
	}

	public static void main(String[] args) {

		// TODO: Write a test code here and execute and text.

		TextBook textBook = new TextBook("English");
		Fiction fiction = new Fiction("History");
		Comic comic = new Comic("Suhail", 20);

		System.out.println(getAgeOrTitle(textBook));
		System.out.println(getAgeOrTitle(fiction));
		System.out.println(getAgeOrTitle(comic));
	}
}
