package com.bykv.vk.openvk.preload.a;

import java.util.List;

/* JADX INFO: compiled from: RealInterceptorChain.java */
/* JADX INFO: loaded from: classes2.dex */
final class i implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f11345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<h> f11347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f11348d;

    /* JADX INFO: compiled from: RealInterceptorChain.java */
    public static final class a extends Exception {
        public a(Throwable th2) {
            super(th2);
        }
    }

    public i(List<h> list, int i10, e eVar, d dVar) {
        this.f11347c = list;
        this.f11346b = i10;
        this.f11345a = eVar;
        this.f11348d = dVar;
    }

    private d c(Class cls) {
        d dVar = this.f11348d;
        while (dVar != null && dVar.getClass() != cls) {
            dVar = dVar.f11327a;
        }
        return dVar;
    }

    @Override // com.bykv.vk.openvk.preload.a.b
    public final Object a(Class cls) {
        d dVarC = c(cls);
        if (dVarC != null) {
            return dVarC.f11328b;
        }
        throw new IllegalArgumentException("can not find pre Interceptor , class:".concat(String.valueOf(cls)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.a.b
    public final Object a(Object obj) throws Exception {
        d dVar = this.f11348d;
        if (dVar != null) {
            dVar.f11329c = obj;
            dVar.e();
        }
        if (this.f11346b >= this.f11347c.size()) {
            return obj;
        }
        h hVar = this.f11347c.get(this.f11346b);
        Class<? extends d> cls = hVar.f11339a;
        d dVar2 = (d) this.f11345a.a(cls);
        if (dVar2 == null) {
            throw new IllegalArgumentException("interceptor == null , index = " + obj + " , class: " + cls);
        }
        com.bykv.vk.openvk.preload.a.b.a aVarA = hVar.a();
        i iVar = new i(this.f11347c, this.f11346b + 1, this.f11345a, dVar2);
        dVar2.a(iVar, this.f11348d, obj, aVarA, hVar.b());
        dVar2.c();
        try {
            Object objA = dVar2.a(iVar, obj);
            dVar2.d();
            return objA;
        } catch (a e10) {
            dVar2.c(e10.getCause());
            throw e10;
        } catch (Throwable th2) {
            dVar2.b(th2);
            throw new a(th2);
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.b
    public final Object b(Class cls) {
        d dVarC = c(cls);
        if (dVarC != null) {
            return dVarC.f11329c;
        }
        throw new IllegalArgumentException("can not find pre Interceptor , class:".concat(String.valueOf(cls)));
    }
}
