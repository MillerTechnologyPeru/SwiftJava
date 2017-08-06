
/// interface java.awt.event.HierarchyListener ///

package org.swiftjava.java_awt;

@SuppressWarnings("JniMissingFunction")
public class HierarchyListenerProxy implements java.awt.event.HierarchyListener {

    long __swiftObject;

    HierarchyListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void java.awt.event.HierarchyListener.hierarchyChanged(java.awt.event.HierarchyEvent)

    public native void __hierarchyChanged( long __swiftObject, java.awt.event.HierarchyEvent e );

    public void hierarchyChanged( java.awt.event.HierarchyEvent e ) {
        __hierarchyChanged( __swiftObject, e );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
