package com.inmobi.media;

import java.util.BitSet;

/* JADX INFO: loaded from: classes8.dex */
public abstract class I6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D2 f25643a;

    public I6(String str) {
        tn.p.k(str, "b64feature");
        D2 d22 = new D2();
        this.f25643a = d22;
        d22.a(str);
    }

    public final boolean a(boolean z10) {
        BitSet bitSet = this.f25643a.f25288a;
        return bitSet != null ? bitSet.get(0) : z10;
    }
}
