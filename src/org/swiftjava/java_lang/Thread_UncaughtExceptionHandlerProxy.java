
/// interface java.lang.Thread$UncaughtExceptionHandler ///

package org.swiftjava.java_lang;

@SuppressWarnings("JniMissingFunction")
public class Thread_UncaughtExceptionHandlerProxy implements java.lang.Thread.UncaughtExceptionHandler {

    long __swiftObject;

    Thread_UncaughtExceptionHandlerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void java.lang.Thread$UncaughtExceptionHandler.uncaughtException(java.lang.Thread,java.lang.Throwable)

    public native void __uncaughtException( long __swiftObject, java.lang.Thread arg0, java.lang.Throwable arg1 );

    public void uncaughtException( java.lang.Thread arg0, java.lang.Throwable arg1 ) {
        __uncaughtException( __swiftObject, arg0, arg1 );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
