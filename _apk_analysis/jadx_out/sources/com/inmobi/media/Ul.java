package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes9.dex */
public final class Ul extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3542kl f26454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f26455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Wl f26456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26457d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ul(Wl wl2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f26456c = wl2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26455b = obj;
        this.f26457d |= Integer.MIN_VALUE;
        return this.f26456c.a((C3542kl) null, (C3668pm) null, this);
    }
}
