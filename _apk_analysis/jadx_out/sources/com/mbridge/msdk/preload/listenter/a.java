package com.mbridge.msdk.preload.listenter;

import com.mbridge.msdk.out.PreloadListener;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PreloadListenerEx.java */
/* JADX INFO: loaded from: classes2.dex */
public class a implements PreloadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference<PreloadListener> f39177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f39178b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f39179c = false;

    public a(PreloadListener preloadListener) {
        if (preloadListener != null) {
            this.f39177a = new WeakReference<>(preloadListener);
        }
    }

    public void a(boolean z10) {
        this.f39179c = z10;
    }

    public boolean a() {
        return this.f39179c;
    }

    @Override // com.mbridge.msdk.out.PreloadListener
    public void onPreloadFaild(String str) {
        WeakReference<PreloadListener> weakReference = this.f39177a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f39177a.get().onPreloadFaild(str);
    }

    @Override // com.mbridge.msdk.out.PreloadListener
    public void onPreloadSucceed() {
        WeakReference<PreloadListener> weakReference = this.f39177a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f39177a.get().onPreloadSucceed();
    }
}
