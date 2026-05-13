package io.appmetrica.analytics.impl;

import android.os.Debug;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4717d extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f66560a = new AtomicBoolean(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4742e f66561b;

    public C4717d(C4742e c4742e) {
        this.f66561b = c4742e;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (!isInterrupted() && this.f66560a.get()) {
            this.f66561b.f66638e.set(false);
            C4742e c4742e = this.f66561b;
            c4742e.f66636c.postAtFrontOfQueue(c4742e.f66639f);
            int i10 = this.f66561b.f66635b.get();
            while (i10 > 0) {
                try {
                    Thread.sleep(C4742e.f66632g);
                    if (this.f66561b.f66638e.get()) {
                        break;
                    } else {
                        i10--;
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            }
            if (i10 == 0 && !Debug.isDebuggerConnected()) {
                Iterator it = this.f66561b.f66634a.iterator();
                while (it.hasNext()) {
                    ((InterfaceC4691c) it.next()).onAppNotResponding();
                }
            }
            while (!this.f66561b.f66638e.get()) {
                try {
                    Thread.sleep(C4742e.f66632g);
                } catch (InterruptedException unused2) {
                    return;
                }
            }
        }
    }
}
