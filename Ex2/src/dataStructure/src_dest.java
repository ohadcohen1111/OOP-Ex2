package dataStructure;

public class src_dest {
	private int src;
	private int dest;

	public src_dest(int src, int dest) {
		this.src = src;
		this.dest = dest;
	}

	public int getSrc() {
		return this.src;
	}

	public int getDest() {
		return this.dest;
	}

	public void setSrc(int src) {
		this.src = src;
	}

	public void setDest(int dest) {
		this.dest = dest;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}

	public int hashCode() { // the hash function
		final int prime = 31;
		int result = 1;
		int src = this.src;
		int dest = this.dest;
		result = Long.valueOf((prime * src) + (prime * dest)).hashCode(); // cunvert to long
		return result;
	}
}