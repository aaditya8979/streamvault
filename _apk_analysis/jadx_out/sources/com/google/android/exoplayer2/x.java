package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.f;

/* JADX INFO: compiled from: Rating.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class x implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f.a<x> f23012b = new f.a() { // from class: d6.t1
        @Override // com.google.android.exoplayer2.f.a
        public final com.google.android.exoplayer2.f fromBundle(Bundle bundle) {
            return com.google.android.exoplayer2.x.b(bundle);
        }
    };

    public static x b(Bundle bundle) {
        int i10 = bundle.getInt(c(0), -1);
        if (i10 == 0) {
            return (x) n.f22000e.fromBundle(bundle);
        }
        if (i10 == 1) {
            return (x) t.f22482d.fromBundle(bundle);
        }
        if (i10 == 2) {
            return (x) z.f23013e.fromBundle(bundle);
        }
        if (i10 == 3) {
            return (x) b0.f21370e.fromBundle(bundle);
        }
        throw new IllegalArgumentException("Unknown RatingType: " + i10);
    }

    public static String c(int i10) {
        return Integer.toString(i10, 36);
    }
}
