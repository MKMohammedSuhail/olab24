package oldshelf;

public class Comic extends Book {

	/* TODO: Add most strict modifiers here */
	private final String title;

	// TODO: Warning to be removed.
	private final int ageOfMainCharacter;

	// TODO Correct the error
	public Comic(String title, int age) {
		this.title = title;
		this.ageOfMainCharacter = age;
	}

	public String getTitle() {
		return this.title;
	}

	// TODO : create a getter if required.
	public int getAgeOfMainCharacter() {
		return ageOfMainCharacter;
	}

	// TODO: Create a setter if required

	// TODO: write a toString method
	@Override
	public String toString() {
		return "Title: " + this.getTitle() + ",Age of main character:" + ageOfMainCharacter;
	}

	// TODO: Bonus:
	@Override
	// TODO: Fill up an arbitrary hash method that takes into account only the age
	// of main characted and the Strign title
	public int hashCode() {
		return 31 * ageOfMainCharacter + (title == null ? 0 : title.hashCode());
	}

	// TODO: Bonus:
	@Override
	public boolean equals(Object o) {
		// TODO: Based on the information about hashCode write the equals method.
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Comic comic = (Comic) o;
		return ageOfMainCharacter == comic.ageOfMainCharacter &&
				(title != null ? title.equals(comic.title) : comic.title == null);

	}
}
