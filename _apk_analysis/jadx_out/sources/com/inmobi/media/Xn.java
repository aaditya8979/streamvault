package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes9.dex */
public final class Xn extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f26604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Yn f26605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26606c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Xn(Yn yn2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f26605b = yn2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26604a = obj;
        this.f26606c |= Integer.MIN_VALUE;
        return this.f26605b.a(this);
    }
}
