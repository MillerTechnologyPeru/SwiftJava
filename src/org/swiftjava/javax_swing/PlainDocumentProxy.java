
/// class javax.swing.text.PlainDocument ///

package org.swiftjava.javax_swing;

@SuppressWarnings("JniMissingFunction")
public class PlainDocumentProxy extends javax.swing.text.PlainDocument {

    long __swiftObject;

    /// public javax.swing.text.PlainDocument()

    PlainDocumentProxy( long __swiftObject ) {
        super( );
        this.__swiftObject = __swiftObject;
    }

    /// public javax.swing.text.PlainDocument(javax.swing.text.AbstractDocument$Content)

    PlainDocumentProxy( javax.swing.text.AbstractDocument.Content c , long __swiftObject ) {
        super( c );
        this.__swiftObject = __swiftObject;
    }

    /// public void javax.swing.text.PlainDocument.insertString(int,java.lang.String,javax.swing.text.AttributeSet) throws javax.swing.text.BadLocationException

    public native void __insertString( long __swiftObject, int offs, java.lang.String str, javax.swing.text.AttributeSet a );

    boolean entered_insertString_0;

    public void insertString( int offs, java.lang.String str, javax.swing.text.AttributeSet a ) throws javax.swing.text.BadLocationException {
        if ( !entered_insertString_0 ) {
            entered_insertString_0 = true;
            __insertString( __swiftObject, offs, str, a);
            entered_insertString_0 = false;
        }
        else
            super.insertString( offs, str, a );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
