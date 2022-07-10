package uno.impl;

import undo.Change;
import undo.Document;
import undo.UndoManager;

public class UndoManagerImpl implements UndoManager {

	private Document doc;
	private SizedStack undoStack;
	private SizedStack redoStack;

	public UndoManagerImpl(Document document, int bufferSize) {
		this.doc = document;
		this.undoStack = new SizedStack(bufferSize);
		this.redoStack = new SizedStack(bufferSize);
	}

	@Override
	public void registerChange(Change change) {
		undoStack.push(change);
	}

	@Override
	public boolean canUndo() {
		return !this.undoStack.isEmpty();
	}

	@Override
	public void undo() {

		if (!canUndo()) {
			throw new IllegalStateException();
		}
		Change change = this.undoStack.pop();
		change.revert(doc);
		this.redoStack.push(change);
	}

	@Override
	public boolean canRedo() {
		return !this.redoStack.isEmpty();
	}

	@Override
	public void redo() {
		if (!canRedo()) {
			throw new IllegalStateException();
		}
		Change change = this.redoStack.pop();
		change.apply(doc);
		this.undoStack.push(change);
	}
}
