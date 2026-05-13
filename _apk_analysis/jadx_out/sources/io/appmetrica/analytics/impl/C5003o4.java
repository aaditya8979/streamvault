package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.o4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C5003o4 extends C4669b3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f67391b;

    public C5003o4(int i10, int i11) {
        super(i11);
        this.f67391b = i10;
    }

    @Override // io.appmetrica.analytics.impl.C4669b3
    public final String toString() {
        return "CollectionTrimInfo{itemsDropped=" + this.f67391b + ", bytesTruncated=" + this.f66415a + '}';
    }
}
