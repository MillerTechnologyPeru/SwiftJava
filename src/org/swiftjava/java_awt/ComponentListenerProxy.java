
/// interface java.awt.event.ComponentListener ///

package org.swiftjava.java_awt;

@SuppressWarnings("JniMissingFunction")
public class ComponentListenerProxy implements java.awt.event.ComponentListener {

    long __swiftObject;

    ComponentListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void java.awt.event.ComponentListener.componentResized(java.awt.event.ComponentEvent)

    public native void __componentResized( long __swiftObject, java.awt.event.ComponentEvent e );

    public void componentResized( java.awt.event.ComponentEvent e ) {
        __componentResized( __swiftObject, e );
    }

    /// public abstract void java.awt.event.ComponentListener.componentMoved(java.awt.event.ComponentEvent)

    public native void __componentMoved( long __swiftObject, java.awt.event.ComponentEvent e );

    public void componentMoved( java.awt.event.ComponentEvent e ) {
        __componentMoved( __swiftObject, e );
    }

    /// public abstract void java.awt.event.ComponentListener.componentShown(java.awt.event.ComponentEvent)

    public native void __componentShown( long __swiftObject, java.awt.event.ComponentEvent e );

    public void componentShown( java.awt.event.ComponentEvent e ) {
        __componentShown( __swiftObject, e );
    }

    /// public abstract void java.awt.event.ComponentListener.componentHidden(java.awt.event.ComponentEvent)

    public native void __componentHidden( long __swiftObject, java.awt.event.ComponentEvent e );

    public void componentHidden( java.awt.event.ComponentEvent e ) {
        __componentHidden( __swiftObject, e );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
