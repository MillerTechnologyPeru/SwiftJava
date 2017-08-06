
/// interface javax.swing.event.DocumentListener ///

package org.swiftjava.javax_swing;

@SuppressWarnings("JniMissingFunction")
public class DocumentListenerProxy implements javax.swing.event.DocumentListener {

    long __swiftObject;

    DocumentListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void javax.swing.event.DocumentListener.insertUpdate(javax.swing.event.DocumentEvent)

    public native void __insertUpdate( long __swiftObject, javax.swing.event.DocumentEvent e );

    public void insertUpdate( javax.swing.event.DocumentEvent e ) {
        __insertUpdate( __swiftObject, e );
    }

    /// public abstract void javax.swing.event.DocumentListener.removeUpdate(javax.swing.event.DocumentEvent)

    public native void __removeUpdate( long __swiftObject, javax.swing.event.DocumentEvent e );

    public void removeUpdate( javax.swing.event.DocumentEvent e ) {
        __removeUpdate( __swiftObject, e );
    }

    /// public abstract void javax.swing.event.DocumentListener.changedUpdate(javax.swing.event.DocumentEvent)

    public native void __changedUpdate( long __swiftObject, javax.swing.event.DocumentEvent e );

    public void changedUpdate( javax.swing.event.DocumentEvent e ) {
        __changedUpdate( __swiftObject, e );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
