package com.fyber.inneractive.sdk.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19178a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f19180c;

    public l(s sVar) {
        this.f19180c = sVar;
        this.f19179b = sVar.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19178a < this.f19179b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f19178a;
        if (i10 >= this.f19179b) {
            throw new NoSuchElementException();
        }
        this.f19178a = i10 + 1;
        return Byte.valueOf(this.f19180c.d(i10));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
