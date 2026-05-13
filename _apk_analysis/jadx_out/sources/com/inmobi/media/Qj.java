package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes9.dex */
public final class Qj extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f26199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Wj f26200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26201c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Qj(Wj wj2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f26200b = wj2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26199a = obj;
        this.f26201c |= Integer.MIN_VALUE;
        return this.f26200b.a((ContinuationImpl) this);
    }
}
