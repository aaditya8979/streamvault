package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.sb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5109sb extends InterruptionSafeThread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5134tb f67672a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5109sb(C5134tb c5134tb, String str) {
        super(str);
        this.f67672a = c5134tb;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        HashMap map;
        synchronized (this.f67672a.f67725a) {
            C5134tb.a(this.f67672a);
            this.f67672a.f67729e = true;
            this.f67672a.f67725a.notifyAll();
        }
        while (isRunning()) {
            synchronized (this) {
                if (this.f67672a.f67726b.size() == 0) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
                map = new HashMap(this.f67672a.f67726b);
                this.f67672a.f67726b.clear();
            }
            if (map.size() > 0) {
                C5134tb.a(this.f67672a, map);
                map.clear();
            }
        }
    }
}
