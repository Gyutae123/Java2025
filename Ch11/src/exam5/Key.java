package exam5;

public class Key {	
	int id;
	
	public Key() {
		this.id = id;
	}
	
	public int hashcode() {
		return id;s
	}
	
	public boolean equals(Object object) {
		if(object instanceof Key) {
			Key key = (Key)object;
			if(this.id == key.id) {
				return true;
			}
		}
		return false;
	}

}
