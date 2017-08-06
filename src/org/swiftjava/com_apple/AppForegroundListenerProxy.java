
/// interface com.apple.eawt.AppForegroundListener ///

package org.swiftjava.com_apple;

@SuppressWarnings("JniMissingFunction")
public class AppForegroundListenerProxy implements com.apple.eawt.AppForegroundListener {

    long __swiftObject;

    AppForegroundListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void com.apple.eawt.AppForegroundListener.appRaisedToForeground(com.apple.eawt.AppEvent$AppForegroundEvent)

    public native void __appRaisedToForeground( long __swiftObject, com.apple.eawt.AppEvent.AppForegroundEvent arg0 );

    public void appRaisedToForeground( com.apple.eawt.AppEvent.AppForegroundEvent arg0 ) {
        __appRaisedToForeground( __swiftObject, arg0 );
    }

    /// public abstract void com.apple.eawt.AppForegroundListener.appMovedToBackground(com.apple.eawt.AppEvent$AppForegroundEvent)

    public native void __appMovedToBackground( long __swiftObject, com.apple.eawt.AppEvent.AppForegroundEvent arg0 );

    public void appMovedToBackground( com.apple.eawt.AppEvent.AppForegroundEvent arg0 ) {
        __appMovedToBackground( __swiftObject, arg0 );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}