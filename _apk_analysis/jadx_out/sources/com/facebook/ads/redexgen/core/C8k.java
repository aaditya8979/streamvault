package com.facebook.ads.redexgen.core;

import android.os.SystemClock;
import java.lang.Exception;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8k, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C8k<T extends Exception> {
    public long A00;
    public T A01;
    public final long A02;

    public C8k(long j10) {
        this.A02 = j10;
    }

    public final void A00() {
        this.A01 = null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: T extends java.lang.Exception */
    public final void A01(T t10) throws Exception {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.A01 == null) {
            this.A01 = t10;
            this.A00 = this.A02 + jElapsedRealtime;
        }
        if (jElapsedRealtime >= this.A00) {
            if (this.A01 != t10) {
                this.A01.addSuppressed(t10);
            }
            T t11 = this.A01;
            A00();
            throw t11;
        }
    }
}
