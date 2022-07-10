package uno.impl;

import undo.Document;
import undo.UndoManager;
import undo.UndoManagerFactory;


public class UndoManagerFactoryImpl implements UndoManagerFactory {

	@Override
	public UndoManager createUndoManager(Document doc, int bufferSize) {
		if (doc == null || bufferSize <= 0) {
			throw new IllegalArgumentException();
		}
		return new UndoManagerImpl(doc, bufferSize);
	}

}
