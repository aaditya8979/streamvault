package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.y9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5257y9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantLock f68032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z9 f68033b;

    public C5257y9(Context context, String str) {
        this(new ReentrantLock(), new Z9(context, str));
    }

    public C5257y9(ReentrantLock reentrantLock, Z9 z92) {
        this.f68032a = reentrantLock;
        this.f68033b = z92;
    }

    public final void a() {
        this.f68032a.lock();
        this.f68033b.a();
    }

    public final void b() {
        this.f68033b.b();
        this.f68032a.unlock();
    }

    public final void c() {
        Z9 z92 = this.f68033b;
        synchronized (z92) {
            z92.b();
            z92.f66292a.delete();
        }
        this.f68032a.unlock();
    }
}
