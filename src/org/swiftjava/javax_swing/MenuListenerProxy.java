
/// interface javax.swing.event.MenuListener ///

package org.swiftjava.javax_swing;

@SuppressWarnings("JniMissingFunction")
public class MenuListenerProxy implements javax.swing.event.MenuListener {

    long __swiftObject;

    MenuListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void javax.swing.event.MenuListener.menuSelected(javax.swing.event.MenuEvent)

    public native void __menuSelected( long __swiftObject, javax.swing.event.MenuEvent e );

    public void menuSelected( javax.swing.event.MenuEvent e ) {
        __menuSelected( __swiftObject, e );
    }

    /// public abstract void javax.swing.event.MenuListener.menuDeselected(javax.swing.event.MenuEvent)

    public native void __menuDeselected( long __swiftObject, javax.swing.event.MenuEvent e );

    public void menuDeselected( javax.swing.event.MenuEvent e ) {
        __menuDeselected( __swiftObject, e );
    }

    /// public abstract void javax.swing.event.MenuListener.menuCanceled(javax.swing.event.MenuEvent)

    public native void __menuCanceled( long __swiftObject, javax.swing.event.MenuEvent e );

    public void menuCanceled( javax.swing.event.MenuEvent e ) {
        __menuCanceled( __swiftObject, e );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
