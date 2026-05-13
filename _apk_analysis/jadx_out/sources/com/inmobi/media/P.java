package com.inmobi.media;

import java.util.Comparator;

/* JADX INFO: loaded from: classes9.dex */
public final class P implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        F6 f62 = (F6) obj2;
        F6 f63 = (F6) obj;
        return fn.b.d(Integer.valueOf(f62.f25417c * f62.f25418d), Integer.valueOf(f63.f25417c * f63.f25418d));
    }
}
