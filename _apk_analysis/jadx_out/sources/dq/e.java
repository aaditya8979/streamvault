package dq;

import java.io.IOException;

/* JADX INFO: compiled from: CachedExchange.java */
/* JADX INFO: loaded from: classes2.dex */
public class e extends i {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final org.eclipse.jetty.http.a f59946y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile int f59947z;

    public e(boolean z10) {
        this.f59946y = z10 ? new org.eclipse.jetty.http.a() : null;
    }

    @Override // dq.i
    public synchronized void F(hq.d dVar, hq.d dVar2) throws IOException {
        org.eclipse.jetty.http.a aVar = this.f59946y;
        if (aVar != null) {
            aVar.d(dVar, dVar2.m0());
        }
        super.F(dVar, dVar2);
    }

    @Override // dq.i
    public synchronized void H(hq.d dVar, int i10, hq.d dVar2) throws IOException {
        this.f59947z = i10;
        super.H(dVar, i10, dVar2);
    }

    public synchronized org.eclipse.jetty.http.a e0() {
        if (s() < 6) {
            throw new IllegalStateException("Headers not completely received yet");
        }
        return this.f59946y;
    }

    public synchronized int f0() {
        if (s() < 5) {
            throw new IllegalStateException("Response not received yet");
        }
        return this.f59947z;
    }
}
