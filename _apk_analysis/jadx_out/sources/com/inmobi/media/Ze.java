package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes10.dex */
public final class Ze extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public mo.a f26706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f26707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3334cf f26708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26709d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ze(C3334cf c3334cf, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f26708c = c3334cf;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26707b = obj;
        this.f26709d |= Integer.MIN_VALUE;
        return this.f26708c.c(this);
    }
}
