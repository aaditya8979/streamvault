package com.fyber.inneractive.sdk.protobuf;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class w2 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f19273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e3 f19274c;

    public w2(e3 e3Var) {
        this.f19274c = e3Var;
        this.f19272a = e3Var.f19122b.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f19272a;
        if (i10 <= 0 || i10 > this.f19274c.f19122b.size()) {
            if (this.f19273b == null) {
                this.f19273b = this.f19274c.f19126f.entrySet().iterator();
            }
            if (!this.f19273b.hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f19273b == null) {
            this.f19273b = this.f19274c.f19126f.entrySet().iterator();
        }
        if (this.f19273b.hasNext()) {
            if (this.f19273b == null) {
                this.f19273b = this.f19274c.f19126f.entrySet().iterator();
            }
            return (Map.Entry) this.f19273b.next();
        }
        List list = this.f19274c.f19122b;
        int i10 = this.f19272a - 1;
        this.f19272a = i10;
        return (Map.Entry) list.get(i10);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
