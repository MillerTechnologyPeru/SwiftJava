
/// class javax.swing.JWindow ///

package org.swiftjava.javax_swing;

@SuppressWarnings("JniMissingFunction")
public class JWindowProxy extends javax.swing.JWindow {

    long __swiftObject;

    /// public javax.swing.JWindow(java.awt.Window,java.awt.GraphicsConfiguration)

    JWindowProxy( java.awt.Window owner, java.awt.GraphicsConfiguration gc , long __swiftObject ) {
        super( owner, gc );
        this.__swiftObject = __swiftObject;
    }

    /// public javax.swing.JWindow(java.awt.Window)

    JWindowProxy( java.awt.Window owner , long __swiftObject ) {
        super( owner );
        this.__swiftObject = __swiftObject;
    }

    /// public javax.swing.JWindow(java.awt.Frame)

    JWindowProxy( java.awt.Frame owner , long __swiftObject ) {
        super( owner );
        this.__swiftObject = __swiftObject;
    }

    /// public javax.swing.JWindow(java.awt.GraphicsConfiguration)

    JWindowProxy( java.awt.GraphicsConfiguration gc , long __swiftObject ) {
        super( gc );
        this.__swiftObject = __swiftObject;
    }

    /// public javax.swing.JWindow()

    JWindowProxy( long __swiftObject ) {
        super( );
        this.__swiftObject = __swiftObject;
    }

    /// public void java.awt.Window.paint(java.awt.Graphics)

    public native void __paint( long __swiftObject, java.awt.Graphics arg0 );

    boolean entered_paint_0;

    public void paint( java.awt.Graphics arg0 ) {
        if ( !entered_paint_0 ) {
            entered_paint_0 = true;
            __paint( __swiftObject, arg0);
            entered_paint_0 = false;
        }
        else
            super.paint( arg0 );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
