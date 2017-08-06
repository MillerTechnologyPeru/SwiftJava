
/// interface javax.swing.DesktopManager ///

package org.swiftjava.javax_swing;

@SuppressWarnings("JniMissingFunction")
public class DesktopManagerProxy implements javax.swing.DesktopManager {

    long __swiftObject;

    DesktopManagerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void javax.swing.DesktopManager.openFrame(javax.swing.JInternalFrame)

    public native void __openFrame( long __swiftObject, javax.swing.JInternalFrame f );

    public void openFrame( javax.swing.JInternalFrame f ) {
        __openFrame( __swiftObject, f );
    }

    /// public abstract void javax.swing.DesktopManager.closeFrame(javax.swing.JInternalFrame)

    public native void __closeFrame( long __swiftObject, javax.swing.JInternalFrame f );

    public void closeFrame( javax.swing.JInternalFrame f ) {
        __closeFrame( __swiftObject, f );
    }

    /// public abstract void javax.swing.DesktopManager.maximizeFrame(javax.swing.JInternalFrame)

    public native void __maximizeFrame( long __swiftObject, javax.swing.JInternalFrame f );

    public void maximizeFrame( javax.swing.JInternalFrame f ) {
        __maximizeFrame( __swiftObject, f );
    }

    /// public abstract void javax.swing.DesktopManager.minimizeFrame(javax.swing.JInternalFrame)

    public native void __minimizeFrame( long __swiftObject, javax.swing.JInternalFrame f );

    public void minimizeFrame( javax.swing.JInternalFrame f ) {
        __minimizeFrame( __swiftObject, f );
    }

    /// public abstract void javax.swing.DesktopManager.iconifyFrame(javax.swing.JInternalFrame)

    public native void __iconifyFrame( long __swiftObject, javax.swing.JInternalFrame f );

    public void iconifyFrame( javax.swing.JInternalFrame f ) {
        __iconifyFrame( __swiftObject, f );
    }

    /// public abstract void javax.swing.DesktopManager.deiconifyFrame(javax.swing.JInternalFrame)

    public native void __deiconifyFrame( long __swiftObject, javax.swing.JInternalFrame f );

    public void deiconifyFrame( javax.swing.JInternalFrame f ) {
        __deiconifyFrame( __swiftObject, f );
    }

    /// public abstract void javax.swing.DesktopManager.activateFrame(javax.swing.JInternalFrame)

    public native void __activateFrame( long __swiftObject, javax.swing.JInternalFrame f );

    public void activateFrame( javax.swing.JInternalFrame f ) {
        __activateFrame( __swiftObject, f );
    }

    /// public abstract void javax.swing.DesktopManager.deactivateFrame(javax.swing.JInternalFrame)

    public native void __deactivateFrame( long __swiftObject, javax.swing.JInternalFrame f );

    public void deactivateFrame( javax.swing.JInternalFrame f ) {
        __deactivateFrame( __swiftObject, f );
    }

    /// public abstract void javax.swing.DesktopManager.beginDraggingFrame(javax.swing.JComponent)

    public native void __beginDraggingFrame( long __swiftObject, javax.swing.JComponent f );

    public void beginDraggingFrame( javax.swing.JComponent f ) {
        __beginDraggingFrame( __swiftObject, f );
    }

    /// public abstract void javax.swing.DesktopManager.dragFrame(javax.swing.JComponent,int,int)

    public native void __dragFrame( long __swiftObject, javax.swing.JComponent f, int newX, int newY );

    public void dragFrame( javax.swing.JComponent f, int newX, int newY ) {
        __dragFrame( __swiftObject, f, newX, newY );
    }

    /// public abstract void javax.swing.DesktopManager.endDraggingFrame(javax.swing.JComponent)

    public native void __endDraggingFrame( long __swiftObject, javax.swing.JComponent f );

    public void endDraggingFrame( javax.swing.JComponent f ) {
        __endDraggingFrame( __swiftObject, f );
    }

    /// public abstract void javax.swing.DesktopManager.beginResizingFrame(javax.swing.JComponent,int)

    public native void __beginResizingFrame( long __swiftObject, javax.swing.JComponent f, int direction );

    public void beginResizingFrame( javax.swing.JComponent f, int direction ) {
        __beginResizingFrame( __swiftObject, f, direction );
    }

    /// public abstract void javax.swing.DesktopManager.resizeFrame(javax.swing.JComponent,int,int,int,int)

    public native void __resizeFrame( long __swiftObject, javax.swing.JComponent f, int newX, int newY, int newWidth, int newHeight );

    public void resizeFrame( javax.swing.JComponent f, int newX, int newY, int newWidth, int newHeight ) {
        __resizeFrame( __swiftObject, f, newX, newY, newWidth, newHeight );
    }

    /// public abstract void javax.swing.DesktopManager.endResizingFrame(javax.swing.JComponent)

    public native void __endResizingFrame( long __swiftObject, javax.swing.JComponent f );

    public void endResizingFrame( javax.swing.JComponent f ) {
        __endResizingFrame( __swiftObject, f );
    }

    /// public abstract void javax.swing.DesktopManager.setBoundsForFrame(javax.swing.JComponent,int,int,int,int)

    public native void __setBoundsForFrame( long __swiftObject, javax.swing.JComponent f, int newX, int newY, int newWidth, int newHeight );

    public void setBoundsForFrame( javax.swing.JComponent f, int newX, int newY, int newWidth, int newHeight ) {
        __setBoundsForFrame( __swiftObject, f, newX, newY, newWidth, newHeight );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
