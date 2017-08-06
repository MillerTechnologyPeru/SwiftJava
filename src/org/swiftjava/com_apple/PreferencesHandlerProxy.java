
/// interface com.apple.eawt.PreferencesHandler ///

package org.swiftjava.com_apple;

@SuppressWarnings("JniMissingFunction")
public class PreferencesHandlerProxy implements com.apple.eawt.PreferencesHandler {

    long __swiftObject;

    PreferencesHandlerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void com.apple.eawt.PreferencesHandler.handlePreferences(com.apple.eawt.AppEvent$PreferencesEvent)

    public native void __handlePreferences( long __swiftObject, com.apple.eawt.AppEvent.PreferencesEvent arg0 );

    public void handlePreferences( com.apple.eawt.AppEvent.PreferencesEvent arg0 ) {
        __handlePreferences( __swiftObject, arg0 );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
