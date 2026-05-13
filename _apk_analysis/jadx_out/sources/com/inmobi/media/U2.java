package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes9.dex */
public final class U2 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f26405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W2 f26406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26407c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U2(W2 w22, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f26406b = w22;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26405a = obj;
        this.f26407c |= Integer.MIN_VALUE;
        return this.f26406b.a(this);
    }
}
