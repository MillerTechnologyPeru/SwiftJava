
/// interface java.awt.event.MouseWheelListener ///

package org.swiftjava.java_awt;

@SuppressWarnings("JniMissingFunction")
public class MouseWheelListenerProxy implements java.awt.event.MouseWheelListener {

    long __swiftObject;

    MouseWheelListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void java.awt.event.MouseWheelListener.mouseWheelMoved(java.awt.event.MouseWheelEvent)

    public native void __mouseWheelMoved( long __swiftObject, java.awt.event.MouseWheelEvent e );

    public void mouseWheelMoved( java.awt.event.MouseWheelEvent e ) {
        __mouseWheelMoved( __swiftObject, e );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
