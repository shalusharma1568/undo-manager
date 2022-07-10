package uno.impl;

import undo.Change;
import undo.ChangeFactory;

public class ChangeFactoryImpl implements ChangeFactory {

	@Override
	public Change createDeletion(int pos, String s, int oldDot, int newDot) {

		return new ChangeImpl(pos, s, oldDot, newDot, Constant.DELETE);
	}

	@Override
	public Change createInsertion(int pos, String s, int oldDot, int newDot) {
		return new ChangeImpl(pos, s, oldDot, newDot, Constant.INSERT);
	}

}
