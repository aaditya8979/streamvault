package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.eo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4767eo {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f66714c = {0, 1, 2, 3};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f66715a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f66716b = 0;

    public C4767eo(int[] iArr) {
        for (int i10 : iArr) {
            this.f66715a.put(i10, new HashMap());
        }
    }
}
