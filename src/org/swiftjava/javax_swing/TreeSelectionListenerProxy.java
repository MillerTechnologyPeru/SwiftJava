
/// interface javax.swing.event.TreeSelectionListener ///

package org.swiftjava.javax_swing;

@SuppressWarnings("JniMissingFunction")
public class TreeSelectionListenerProxy implements javax.swing.event.TreeSelectionListener {

    long __swiftObject;

    TreeSelectionListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void javax.swing.event.TreeSelectionListener.valueChanged(javax.swing.event.TreeSelectionEvent)

    public native void __valueChanged( long __swiftObject, javax.swing.event.TreeSelectionEvent e );

    public void valueChanged( javax.swing.event.TreeSelectionEvent e ) {
        __valueChanged( __swiftObject, e );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
