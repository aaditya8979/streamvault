package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.inmobi.media.C3465hi;
import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: renamed from: com.inmobi.media.hi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3465hi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GestureDetectorOnGestureListenerC3337ci f27308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f27309b;

    public C3465hi(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci, long j10) {
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        this.f27308a = gestureDetectorOnGestureListenerC3337ci;
        this.f27309b = j10;
    }

    public static final void a(C3465hi c3465hi) {
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = c3465hi.f27308a;
        if (gestureDetectorOnGestureListenerC3337ci != null) {
            gestureDetectorOnGestureListenerC3337ci.i();
        }
        c3465hi.f27308a = null;
    }

    public final void a() {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: n9.x7
            @Override // java.lang.Runnable
            public final void run() {
                C3465hi.a(this.f75693b);
            }
        }, this.f27309b);
    }
}
