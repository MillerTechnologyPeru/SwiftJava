
/// interface com.apple.eawt.AboutHandler ///

package org.swiftjava.com_apple;

@SuppressWarnings("JniMissingFunction")
public class AboutHandlerProxy implements com.apple.eawt.AboutHandler {

    long __swiftObject;

    AboutHandlerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void com.apple.eawt.AboutHandler.handleAbout(com.apple.eawt.AppEvent$AboutEvent)

    public native void __handleAbout( long __swiftObject, com.apple.eawt.AppEvent.AboutEvent arg0 );

    public void handleAbout( com.apple.eawt.AppEvent.AboutEvent arg0 ) {
        __handleAbout( __swiftObject, arg0 );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
