package com.inmobi.media;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.rf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3710rf extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3735sf f28061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f28062b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3710rf(C3735sf c3735sf, String str, hn.c cVar) {
        super(2, cVar);
        this.f28061a = c3735sf;
        this.f28062b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3710rf(this.f28061a, this.f28062b, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3710rf(this.f28061a, this.f28062b, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        C3911zg c3911zg = this.f28061a.f28121a;
        String str = this.f28062b;
        c3911zg.getClass();
        tn.p.k("omid_js_string", "key");
        tn.p.k(str, "value");
        Ea ea2 = c3911zg.f28644a;
        ConcurrentHashMap concurrentHashMap = Ea.f25372b;
        ea2.a("omid_js_string", str, false);
        c3911zg.f28644a.a("last_ts", System.currentTimeMillis() / ((long) 1000), false);
        return bn.r.f5635a;
    }
}
