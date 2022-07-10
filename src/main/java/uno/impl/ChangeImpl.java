package uno.impl;

import undo.Change;
import undo.Document;

public class ChangeImpl implements Change {

	private int pos;
	private String s;
	private int oldDot;
	private int newDot;
	private String type;

	public ChangeImpl(int pos, String s, int oldDot, int newDot, String type) {
		super();
		this.pos = pos;
		this.s = s;
		this.oldDot = oldDot;
		this.newDot = newDot;
		this.type = type;
	}

	@Override
	public String getType() {
		return type;
	}

	@Override
	public void apply(Document doc) {
		if (type.equals(Constant.INSERT)) {
			doc.insert(pos, s);
		} else {
			doc.delete(pos, s);
		}

	}

	@Override
	public void revert(Document doc) {
		if (type.equals(Constant.INSERT)) {
			doc.delete(pos, s);
		} else {
			doc.insert(pos, s);
		}

	}

}
