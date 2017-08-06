
/// interface java.awt.event.InputMethodListener ///

package org.swiftjava.java_awt;

@SuppressWarnings("JniMissingFunction")
public class InputMethodListenerProxy implements java.awt.event.InputMethodListener {

    long __swiftObject;

    InputMethodListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void java.awt.event.InputMethodListener.inputMethodTextChanged(java.awt.event.InputMethodEvent)

    public native void __inputMethodTextChanged( long __swiftObject, java.awt.event.InputMethodEvent event );

    public void inputMethodTextChanged( java.awt.event.InputMethodEvent event ) {
        __inputMethodTextChanged( __swiftObject, event );
    }

    /// public abstract void java.awt.event.InputMethodListener.caretPositionChanged(java.awt.event.InputMethodEvent)

    public native void __caretPositionChanged( long __swiftObject, java.awt.event.InputMethodEvent event );

    public void caretPositionChanged( java.awt.event.InputMethodEvent event ) {
        __caretPositionChanged( __swiftObject, event );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
