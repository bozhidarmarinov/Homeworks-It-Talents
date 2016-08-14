
public abstract class Name {

	private String name;
	public Name(String name) throws NameException {
		this.name = name;
		if(name==null || name.trim().equals("")){
			throw new NameException("Invalid name");
		}
	}
	public String getName() {
		return name;
	}

}
