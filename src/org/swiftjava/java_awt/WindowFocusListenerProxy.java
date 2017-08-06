
/// interface java.awt.event.WindowFocusListener ///

package org.swiftjava.java_awt;

@SuppressWarnings("JniMissingFunction")
public class WindowFocusListenerProxy implements java.awt.event.WindowFocusListener {

    long __swiftObject;

    WindowFocusListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void java.awt.event.WindowFocusListener.windowGainedFocus(java.awt.event.WindowEvent)

    public native void __windowGainedFocus( long __swiftObject, java.awt.event.WindowEvent e );

    public void windowGainedFocus( java.awt.event.WindowEvent e ) {
        __windowGainedFocus( __swiftObject, e );
    }

    /// public abstract void java.awt.event.WindowFocusListener.windowLostFocus(java.awt.event.WindowEvent)

    public native void __windowLostFocus( long __swiftObject, java.awt.event.WindowEvent e );

    public void windowLostFocus( java.awt.event.WindowEvent e ) {
        __windowLostFocus( __swiftObject, e );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
