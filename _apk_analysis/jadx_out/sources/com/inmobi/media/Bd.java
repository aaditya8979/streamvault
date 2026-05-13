package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes7.dex */
public final class Bd extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Dd f25212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25213c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bd(Dd dd2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25212b = dd2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25211a = obj;
        this.f25213c |= Integer.MIN_VALUE;
        return this.f25212b.a(null, this);
    }
}
