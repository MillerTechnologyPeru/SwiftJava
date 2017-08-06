
/// interface javax.swing.event.CaretListener ///

package org.swiftjava.javax_swing;

@SuppressWarnings("JniMissingFunction")
public class CaretListenerProxy implements javax.swing.event.CaretListener {

    long __swiftObject;

    CaretListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void javax.swing.event.CaretListener.caretUpdate(javax.swing.event.CaretEvent)

    public native void __caretUpdate( long __swiftObject, javax.swing.event.CaretEvent e );

    public void caretUpdate( javax.swing.event.CaretEvent e ) {
        __caretUpdate( __swiftObject, e );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
