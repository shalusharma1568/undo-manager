package uno.impl;

import undo.Document;

public class DocumentImpl implements Document {
	private final static int MAX_TEXT_SIZE = 1000;
	private StringBuilder text = new StringBuilder(MAX_TEXT_SIZE);

	public DocumentImpl() {
		for (int i = 0; i < MAX_TEXT_SIZE; i++) {
			text.append(" ");
		}
	}

	@Override
	public void delete(int pos, String s) {
		if (pos < 0 || pos + s.length() > MAX_TEXT_SIZE) {
			throw new IllegalStateException();
		}
		for (int i = 0; i < s.length(); i++) {
			if (text.charAt(i + pos) != s.charAt(i)) {
				throw new IllegalStateException();
			}
		}

		text.delete(pos, pos + s.length());
	}

	@Override
	public void insert(int pos, String s) {
		if (pos < 0 || pos + s.length() > MAX_TEXT_SIZE) {
			throw new IllegalStateException();
		}

		text.insert(pos, s);
	}

	@Override
	public void setDot(int pos) {

	}

	@Override
	public String toString() {
		return text.toString();
	}

}
