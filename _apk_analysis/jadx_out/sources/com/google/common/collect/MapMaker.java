package com.google.common.collect;

import com.google.common.base.Equivalence;
import com.google.common.collect.MapMakerInternalMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import y7.g;

/* JADX INFO: loaded from: classes9.dex */
public final class MapMaker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f23238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23239b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23240c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MapMakerInternalMap.Strength f23241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MapMakerInternalMap.Strength f23242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Equivalence<Object> f23243f;

    public enum Dummy {
        VALUE
    }

    public MapMaker a(int i10) {
        int i11 = this.f23240c;
        y7.l.t(i11 == -1, "concurrency level was already set to %s", i11);
        y7.l.d(i10 > 0);
        this.f23240c = i10;
        return this;
    }

    public int b() {
        int i10 = this.f23240c;
        if (i10 == -1) {
            return 4;
        }
        return i10;
    }

    public int c() {
        int i10 = this.f23239b;
        if (i10 == -1) {
            return 16;
        }
        return i10;
    }

    public Equivalence<Object> d() {
        return (Equivalence) y7.g.a(this.f23243f, e().defaultEquivalence());
    }

    public MapMakerInternalMap.Strength e() {
        return (MapMakerInternalMap.Strength) y7.g.a(this.f23241d, MapMakerInternalMap.Strength.STRONG);
    }

    public MapMakerInternalMap.Strength f() {
        return (MapMakerInternalMap.Strength) y7.g.a(this.f23242e, MapMakerInternalMap.Strength.STRONG);
    }

    public MapMaker g(int i10) {
        int i11 = this.f23239b;
        y7.l.t(i11 == -1, "initial capacity was already set to %s", i11);
        y7.l.d(i10 >= 0);
        this.f23239b = i10;
        return this;
    }

    public MapMaker h(Equivalence<Object> equivalence) {
        Equivalence<Object> equivalence2 = this.f23243f;
        y7.l.u(equivalence2 == null, "key equivalence was already set to %s", equivalence2);
        this.f23243f = (Equivalence) y7.l.m(equivalence);
        this.f23238a = true;
        return this;
    }

    public <K, V> ConcurrentMap<K, V> i() {
        return !this.f23238a ? new ConcurrentHashMap(c(), 0.75f, b()) : MapMakerInternalMap.create(this);
    }

    public MapMaker j(MapMakerInternalMap.Strength strength) {
        MapMakerInternalMap.Strength strength2 = this.f23241d;
        y7.l.u(strength2 == null, "Key strength was already set to %s", strength2);
        this.f23241d = (MapMakerInternalMap.Strength) y7.l.m(strength);
        if (strength != MapMakerInternalMap.Strength.STRONG) {
            this.f23238a = true;
        }
        return this;
    }

    public MapMaker k(MapMakerInternalMap.Strength strength) {
        MapMakerInternalMap.Strength strength2 = this.f23242e;
        y7.l.u(strength2 == null, "Value strength was already set to %s", strength2);
        this.f23242e = (MapMakerInternalMap.Strength) y7.l.m(strength);
        if (strength != MapMakerInternalMap.Strength.STRONG) {
            this.f23238a = true;
        }
        return this;
    }

    public MapMaker l() {
        return j(MapMakerInternalMap.Strength.WEAK);
    }

    public String toString() {
        g.b bVarB = y7.g.b(this);
        int i10 = this.f23239b;
        if (i10 != -1) {
            bVarB.a("initialCapacity", i10);
        }
        int i11 = this.f23240c;
        if (i11 != -1) {
            bVarB.a("concurrencyLevel", i11);
        }
        MapMakerInternalMap.Strength strength = this.f23241d;
        if (strength != null) {
            bVarB.b("keyStrength", y7.a.e(strength.toString()));
        }
        MapMakerInternalMap.Strength strength2 = this.f23242e;
        if (strength2 != null) {
            bVarB.b("valueStrength", y7.a.e(strength2.toString()));
        }
        if (this.f23243f != null) {
            bVarB.h("keyEquivalence");
        }
        return bVarB.toString();
    }
}
