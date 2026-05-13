package com.fyber.inneractive.sdk.protobuf;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class b3 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparable f19103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f19104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e3 f19105c;

    public b3(e3 e3Var, Comparable comparable, Object obj) {
        this.f19105c = e3Var;
        this.f19103a = comparable;
        this.f19104b = obj;
    }

    public b3(e3 e3Var, Map.Entry entry) {
        Comparable comparable = (Comparable) entry.getKey();
        Object value = entry.getValue();
        this.f19105c = e3Var;
        this.f19103a = comparable;
        this.f19104b = value;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f19103a.compareTo(((b3) obj).f19103a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Comparable comparable = this.f19103a;
        Object key = entry.getKey();
        if (comparable == null ? key == null : comparable.equals(key)) {
            Object obj2 = this.f19104b;
            Object value = entry.getValue();
            if (obj2 == null ? value == null : obj2.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f19103a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f19104b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f19103a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f19104b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f19105c.a();
        Object obj2 = this.f19104b;
        this.f19104b = obj;
        return obj2;
    }

    public final String toString() {
        return this.f19103a + "=" + this.f19104b;
    }
}
