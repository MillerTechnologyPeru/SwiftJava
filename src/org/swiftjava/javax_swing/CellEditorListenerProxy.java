
/// interface javax.swing.event.CellEditorListener ///

package org.swiftjava.javax_swing;

@SuppressWarnings("JniMissingFunction")
public class CellEditorListenerProxy implements javax.swing.event.CellEditorListener {

    long __swiftObject;

    CellEditorListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void javax.swing.event.CellEditorListener.editingStopped(javax.swing.event.ChangeEvent)

    public native void __editingStopped( long __swiftObject, javax.swing.event.ChangeEvent e );

    public void editingStopped( javax.swing.event.ChangeEvent e ) {
        __editingStopped( __swiftObject, e );
    }

    /// public abstract void javax.swing.event.CellEditorListener.editingCanceled(javax.swing.event.ChangeEvent)

    public native void __editingCanceled( long __swiftObject, javax.swing.event.ChangeEvent e );

    public void editingCanceled( javax.swing.event.ChangeEvent e ) {
        __editingCanceled( __swiftObject, e );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
