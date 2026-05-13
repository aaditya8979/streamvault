package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.gg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3438gg extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Xf f27224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC3412fg f27225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Rf f27226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f27227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC3487ig f27228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f27229f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3438gg(AbstractC3487ig abstractC3487ig, hn.c cVar) {
        super(cVar);
        this.f27228e = abstractC3487ig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27227d = obj;
        this.f27229f |= Integer.MIN_VALUE;
        return this.f27228e.a(null, null, this);
    }
}
