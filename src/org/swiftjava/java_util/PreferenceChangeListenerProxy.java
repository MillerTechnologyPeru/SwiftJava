
/// interface java.util.prefs.PreferenceChangeListener ///

package org.swiftjava.java_util;

@SuppressWarnings("JniMissingFunction")
public class PreferenceChangeListenerProxy implements java.util.prefs.PreferenceChangeListener {

    long __swiftObject;

    PreferenceChangeListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void java.util.prefs.PreferenceChangeListener.preferenceChange(java.util.prefs.PreferenceChangeEvent)

    public native void __preferenceChange( long __swiftObject, java.util.prefs.PreferenceChangeEvent evt );

    public void preferenceChange( java.util.prefs.PreferenceChangeEvent evt ) {
        __preferenceChange( __swiftObject, evt );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
