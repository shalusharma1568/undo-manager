/*
 * package uno.impl;
 * 
 * import undo.Change; import undo.ChangeFactory; import undo.Document; import
 * undo.UndoManager; import undo.UndoManagerFactory;
 * 
 * public class Driver { public static void main(String[] args) { Document
 * documentImpl = new DocumentImpl(); UndoManagerFactory UndoManagerFactory =
 * new UndoManagerFactoryImpl(); UndoManager undoManager =
 * UndoManagerFactory.createUndoManager(documentImpl, 5);
 * 
 * ChangeFactory changeFactory = new ChangeFactoryImpl(); Change change1 =
 * changeFactory.createInsertion(0, "Hello", 0, 5);
 * undoManager.registerChange(change1); change1.apply(documentImpl);
 * 
 * System.out.println(documentImpl);
 * 
 * Change change2 = changeFactory.createInsertion(15, "ABC", 10, 18);
 * undoManager.registerChange(change2); change2.apply(documentImpl);
 * 
 * System.out.println(documentImpl); undoManager.undo();
 * System.out.println(documentImpl);
 * 
 * undoManager.undo(); System.out.println(documentImpl); undoManager.redo();
 * System.out.println(documentImpl); undoManager.redo();
 * System.out.println(documentImpl);
 * 
 * } }
 */