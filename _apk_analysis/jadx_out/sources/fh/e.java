package fh;

import android.graphics.Point;
import android.hardware.Camera;
import android.os.Handler;
import android.util.Log;

/* JADX INFO: compiled from: PreviewCallback.java */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements Camera.PreviewCallback {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f61713d = e.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f61714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f61715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f61716c;

    public e(b bVar) {
        this.f61714a = bVar;
    }

    public void a(Handler handler, int i10) {
        this.f61715b = handler;
        this.f61716c = i10;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, Camera camera) {
        Point pointC = this.f61714a.c();
        Handler handler = this.f61715b;
        if (pointC == null || handler == null) {
            Log.d(f61713d, "Got preview callback, but no handler or resolution available");
        } else {
            handler.obtainMessage(this.f61716c, pointC.x, pointC.y, bArr).sendToTarget();
            this.f61715b = null;
        }
    }
}
