package com.fyber.inneractive.sdk.protobuf;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes5.dex */
public abstract class e3 extends AbstractMap {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f19120h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19121a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f19124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile d3 f19125e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile x2 f19127g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f19122b = Collections.emptyList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f19123c = Collections.emptyMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f19126f = Collections.emptyMap();

    public e3(int i10) {
        this.f19121a = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.f19122b
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L21
            java.util.List r2 = r4.f19122b
            java.lang.Object r2 = r2.get(r1)
            com.fyber.inneractive.sdk.protobuf.b3 r2 = (com.fyber.inneractive.sdk.protobuf.b3) r2
            java.lang.Comparable r2 = r2.f19103a
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L1e
            int r0 = r0 + 1
        L1c:
            int r5 = -r0
            return r5
        L1e:
            if (r2 != 0) goto L21
            return r1
        L21:
            r0 = 0
        L22:
            if (r0 > r1) goto L41
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List r3 = r4.f19122b
            java.lang.Object r3 = r3.get(r2)
            com.fyber.inneractive.sdk.protobuf.b3 r3 = (com.fyber.inneractive.sdk.protobuf.b3) r3
            java.lang.Comparable r3 = r3.f19103a
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L3b
            int r1 = r2 + (-1)
            goto L22
        L3b:
            if (r3 <= 0) goto L40
            int r0 = r2 + 1
            goto L22
        L40:
            return r2
        L41:
            int r0 = r0 + 1
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.e3.a(java.lang.Comparable):int");
    }

    public final Object a(Comparable comparable, Object obj) {
        a();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((b3) this.f19122b.get(iA)).setValue(obj);
        }
        a();
        if (this.f19122b.isEmpty() && !(this.f19122b instanceof ArrayList)) {
            this.f19122b = new ArrayList(this.f19121a);
        }
        int i10 = -(iA + 1);
        if (i10 >= this.f19121a) {
            return c().put(comparable, obj);
        }
        int size = this.f19122b.size();
        int i11 = this.f19121a;
        if (size == i11) {
            b3 b3Var = (b3) this.f19122b.remove(i11 - 1);
            c().put(b3Var.f19103a, b3Var.f19104b);
        }
        this.f19122b.add(i10, new b3(this, comparable, obj));
        return null;
    }

    public final void a() {
        if (this.f19124d) {
            throw new UnsupportedOperationException();
        }
    }

    public final Iterable b() {
        return this.f19123c.isEmpty() ? a3.f19099b : this.f19123c.entrySet();
    }

    public final SortedMap c() {
        a();
        if (this.f19123c.isEmpty() && !(this.f19123c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f19123c = treeMap;
            this.f19126f = treeMap.descendingMap();
        }
        return (SortedMap) this.f19123c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        a();
        if (!this.f19122b.isEmpty()) {
            this.f19122b.clear();
        }
        if (this.f19123c.isEmpty()) {
            return;
        }
        this.f19123c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f19123c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f19125e == null) {
            this.f19125e = new d3(this);
        }
        return this.f19125e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3)) {
            return super.equals(obj);
        }
        e3 e3Var = (e3) obj;
        int size = size();
        if (size != e3Var.size()) {
            return false;
        }
        int size2 = this.f19122b.size();
        if (size2 != e3Var.f19122b.size()) {
            return entrySet().equals(e3Var.entrySet());
        }
        for (int i10 = 0; i10 < size2; i10++) {
            if (!((Map.Entry) this.f19122b.get(i10)).equals((Map.Entry) e3Var.f19122b.get(i10))) {
                return false;
            }
        }
        if (size2 != size) {
            return this.f19123c.equals(e3Var.f19123c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((b3) this.f19122b.get(iA)).f19104b : this.f19123c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f19122b.size();
        int iHashCode = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iHashCode += ((b3) this.f19122b.get(i10)).hashCode();
        }
        return this.f19123c.size() > 0 ? iHashCode + this.f19123c.hashCode() : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        a();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA < 0) {
            if (this.f19123c.isEmpty()) {
                return null;
            }
            return this.f19123c.remove(comparable);
        }
        a();
        Object obj2 = ((b3) this.f19122b.remove(iA)).f19104b;
        if (!this.f19123c.isEmpty()) {
            Iterator it = c().entrySet().iterator();
            this.f19122b.add(new b3(this, (Map.Entry) it.next()));
            it.remove();
        }
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f19123c.size() + this.f19122b.size();
    }
}
