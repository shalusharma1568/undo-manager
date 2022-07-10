package uno.impl;

import java.util.Stack;

import undo.Change;

public class SizedStack extends Stack<Change> {

	private static final long serialVersionUID = 1L;
	private int maxSize;

	public SizedStack(int size) {
		super();
		this.maxSize = size;
	}

	@Override
	public Change push(Change change) {
		while (this.size() >= maxSize) {
			this.remove(0);
		}
		return super.push(change);
	}
}