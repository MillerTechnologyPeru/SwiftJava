
/// interface com.apple.eawt.SystemSleepListener ///

package org.swiftjava.com_apple;

@SuppressWarnings("JniMissingFunction")
public class SystemSleepListenerProxy implements com.apple.eawt.SystemSleepListener {

    long __swiftObject;

    SystemSleepListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void com.apple.eawt.SystemSleepListener.systemAwoke(com.apple.eawt.AppEvent$SystemSleepEvent)

    public native void __systemAwoke( long __swiftObject, com.apple.eawt.AppEvent.SystemSleepEvent arg0 );

    public void systemAwoke( com.apple.eawt.AppEvent.SystemSleepEvent arg0 ) {
        __systemAwoke( __swiftObject, arg0 );
    }

    /// public abstract void com.apple.eawt.SystemSleepListener.systemAboutToSleep(com.apple.eawt.AppEvent$SystemSleepEvent)

    public native void __systemAboutToSleep( long __swiftObject, com.apple.eawt.AppEvent.SystemSleepEvent arg0 );

    public void systemAboutToSleep( com.apple.eawt.AppEvent.SystemSleepEvent arg0 ) {
        __systemAboutToSleep( __swiftObject, arg0 );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
