package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes9.dex */
public final class T2 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f26344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W2 f26345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26346c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T2(W2 w22, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f26345b = w22;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26344a = obj;
        this.f26346c |= Integer.MIN_VALUE;
        return this.f26345b.a(0, 0, this);
    }
}
