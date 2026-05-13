package android.hardware;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class HardwareBuffer implements Parcelable, AutoCloseable {
    static {
        throw new NoClassDefFoundError();
    }

    @Override // java.lang.AutoCloseable
    public native /* synthetic */ void close();

    public native /* synthetic */ int getFormat();
}
