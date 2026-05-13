package com.fyber.inneractive.sdk.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c3 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19108a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f19109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f19110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e3 f19111d;

    public c3(e3 e3Var) {
        this.f19111d = e3Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f19108a + 1 < this.f19111d.f19122b.size()) {
            return true;
        }
        if (!this.f19111d.f19123c.isEmpty()) {
            if (this.f19110c == null) {
                this.f19110c = this.f19111d.f19123c.entrySet().iterator();
            }
            if (this.f19110c.hasNext()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f19109b = true;
        int i10 = this.f19108a + 1;
        this.f19108a = i10;
        if (i10 < this.f19111d.f19122b.size()) {
            return (Map.Entry) this.f19111d.f19122b.get(this.f19108a);
        }
        if (this.f19110c == null) {
            this.f19110c = this.f19111d.f19123c.entrySet().iterator();
        }
        return (Map.Entry) this.f19110c.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f19109b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f19109b = false;
        e3 e3Var = this.f19111d;
        int i10 = e3.f19120h;
        e3Var.a();
        if (this.f19108a >= this.f19111d.f19122b.size()) {
            if (this.f19110c == null) {
                this.f19110c = this.f19111d.f19123c.entrySet().iterator();
            }
            this.f19110c.remove();
            return;
        }
        e3 e3Var2 = this.f19111d;
        int i11 = this.f19108a;
        this.f19108a = i11 - 1;
        e3Var2.a();
        Object obj = ((b3) e3Var2.f19122b.remove(i11)).f19104b;
        if (e3Var2.f19123c.isEmpty()) {
            return;
        }
        Iterator it = e3Var2.c().entrySet().iterator();
        e3Var2.f19122b.add(new b3(e3Var2, (Map.Entry) it.next()));
        it.remove();
    }
}
