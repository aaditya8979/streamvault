package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.qf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3686qf extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3735sf f27978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdConfig.OmidConfig f27979b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3686qf(C3735sf c3735sf, AdConfig.OmidConfig omidConfig, hn.c cVar) {
        super(2, cVar);
        this.f27978a = c3735sf;
        this.f27979b = omidConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3686qf(this.f27978a, this.f27979b, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3686qf(this.f27978a, this.f27979b, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        Ea ea2 = this.f27978a.f28121a.f28644a;
        ea2.getClass();
        tn.p.k("last_ts", "key");
        return jn.a.a((System.currentTimeMillis() / ((long) 1000)) - ea2.f25373a.getLong("last_ts", 0L) > this.f27979b.getExpiry());
    }
}
