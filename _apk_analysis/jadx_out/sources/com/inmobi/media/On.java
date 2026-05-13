package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes8.dex */
public final class On implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f26098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f26099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f26100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakReference f26101d;

    public On(Sn sn2, AtomicBoolean atomicBoolean) {
        tn.p.k(sn2, "visibilityTracker");
        tn.p.k(atomicBoolean, "isPaused");
        this.f26098a = atomicBoolean;
        this.f26099b = new ArrayList();
        this.f26100c = new ArrayList();
        this.f26101d = new WeakReference(sn2);
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0194  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.On.run():void");
    }
}
