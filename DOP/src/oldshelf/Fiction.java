package oldshelf;

public class Fiction extends Book {

	/* TODO: Add most strict modifiers here */private final String name;
	// TODO: change
	/**
	 * type is a per instance object and it is initialized only once.
	 * 
	 */
	private final FictionType type;

	public Fiction(String name, FictionType type) {
		this.name = name;
		this.type = type;
		// TODO correct the above.
	}

	public String getName() {
		return name;
	}

	public FictionType getType() {
		return type;
	}

	// Optional Setter

	@Override
	public String toString() {
		return "Fiction {name=" + name + ", type=" + type + "}";
	}
}
