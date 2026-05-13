package com.ironsource;

import com.ironsource.P;
import com.ironsource.sdk.controller.f;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class S implements P, P.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ReadWriteLock f30362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<String, O> f30363b;

    /* JADX WARN: Multi-variable type inference failed */
    public S() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public S(@NotNull ReadWriteLock readWriteLock) {
        tn.p.k(readWriteLock, "readWriteLock");
        this.f30362a = readWriteLock;
        this.f30363b = new LinkedHashMap();
    }

    public /* synthetic */ S(ReadWriteLock readWriteLock, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? new ReentrantReadWriteLock() : readWriteLock);
    }

    @Override // com.ironsource.P
    @Nullable
    public O a(@NotNull String str) {
        tn.p.k(str, f.b.f33716c);
        this.f30362a.readLock().lock();
        try {
            return this.f30363b.get(str);
        } finally {
            this.f30362a.readLock().unlock();
        }
    }

    @Override // com.ironsource.P
    @NotNull
    public List<O> a() {
        this.f30362a.readLock().lock();
        List<O> listG1 = cn.f0.g1(this.f30363b.values());
        this.f30362a.readLock().unlock();
        return listG1;
    }

    @Override // com.ironsource.P.a
    public void a(@NotNull O o10) {
        tn.p.k(o10, "adInfo");
        this.f30362a.writeLock().lock();
        try {
            if (this.f30363b.get(o10.c()) == null) {
                this.f30363b.put(o10.c(), o10);
            }
        } finally {
            this.f30362a.writeLock().unlock();
        }
    }

    @Override // com.ironsource.P.a
    public void a(@NotNull EnumC4155n0 enumC4155n0, @NotNull String str) {
        tn.p.k(enumC4155n0, "adStatus");
        tn.p.k(str, f.b.f33716c);
        this.f30362a.writeLock().lock();
        try {
            O o10 = this.f30363b.get(str);
            if (o10 == null) {
                return;
            }
            o10.a(enumC4155n0);
            o10.a(System.currentTimeMillis() / 1000.0d);
        } finally {
            this.f30362a.writeLock().unlock();
        }
    }

    @Override // com.ironsource.P.a
    public void a(@NotNull JSONObject jSONObject, @NotNull EnumC4155n0 enumC4155n0, @NotNull String str) {
        tn.p.k(jSONObject, "json");
        tn.p.k(enumC4155n0, "adStatus");
        tn.p.k(str, f.b.f33716c);
        this.f30362a.writeLock().lock();
        try {
            O o10 = this.f30363b.get(str);
            if (o10 == null) {
                return;
            }
            String strOptString = jSONObject.optString("bundleId");
            tn.p.j(strOptString, "bundleId");
            if (strOptString.length() > 0) {
                o10.a(strOptString);
            }
            String strOptString2 = jSONObject.optString("dynamicDemandSource");
            tn.p.j(strOptString2, "dynamicDemandSourceId");
            if (strOptString2.length() > 0) {
                o10.a(W7.f30623b.a(strOptString2));
            }
            o10.a(enumC4155n0);
        } finally {
            this.f30362a.writeLock().unlock();
        }
    }
}
