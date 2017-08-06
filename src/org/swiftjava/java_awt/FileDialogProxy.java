
/// class java.awt.FileDialog ///

package org.swiftjava.java_awt;

@SuppressWarnings("JniMissingFunction")
public class FileDialogProxy extends java.awt.FileDialog {

    long __swiftObject;

    /// public java.awt.FileDialog(java.awt.Dialog,java.lang.String)

    FileDialogProxy( java.awt.Dialog parent, java.lang.String title , long __swiftObject ) {
        super( parent, title );
        this.__swiftObject = __swiftObject;
    }

    /// public java.awt.FileDialog(java.awt.Dialog)

    FileDialogProxy( java.awt.Dialog parent , long __swiftObject ) {
        super( parent );
        this.__swiftObject = __swiftObject;
    }

    /// public java.awt.FileDialog(java.awt.Frame,java.lang.String,int)

    FileDialogProxy( java.awt.Frame parent, java.lang.String title, int mode , long __swiftObject ) {
        super( parent, title, mode );
        this.__swiftObject = __swiftObject;
    }

    /// public java.awt.FileDialog(java.awt.Dialog,java.lang.String,int)

    FileDialogProxy( java.awt.Dialog parent, java.lang.String title, int mode , long __swiftObject ) {
        super( parent, title, mode );
        this.__swiftObject = __swiftObject;
    }

    /// public java.awt.FileDialog(java.awt.Frame)

    FileDialogProxy( java.awt.Frame parent , long __swiftObject ) {
        super( parent );
        this.__swiftObject = __swiftObject;
    }

    /// public java.awt.FileDialog(java.awt.Frame,java.lang.String)

    FileDialogProxy( java.awt.Frame parent, java.lang.String title , long __swiftObject ) {
        super( parent, title );
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
