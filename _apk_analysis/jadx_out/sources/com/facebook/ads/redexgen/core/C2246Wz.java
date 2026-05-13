package com.facebook.ads.redexgen.core;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2246Wz implements Closeable {
    public C2245Wy A00;
    public boolean A01;
    public final C2244Wx A02;
    public final Runnable A03;

    public C2246Wz(long j10, Runnable runnable) {
        this.A02 = new C2244Wx(j10);
        this.A02.A02();
        this.A03 = runnable;
        this.A01 = false;
    }

    private final synchronized void A03() {
        if (this.A00 == null && !this.A01) {
            this.A00 = new C2245Wy(this);
        }
    }

    public final C2244Wx A04() {
        return this.A02;
    }

    public final synchronized void A05() {
        if (this.A01) {
            return;
        }
        if (this.A00 == null) {
            this.A00 = new C2245Wy(this);
        }
        this.A00.A00();
    }

    public final synchronized void A06() {
        if (this.A02.A05() && !this.A01) {
            A03();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        C2245Wy c2245Wy;
        synchronized (this) {
            this.A01 = true;
            c2245Wy = this.A00;
        }
        if (c2245Wy != null) {
            c2245Wy.close();
        }
    }
}
