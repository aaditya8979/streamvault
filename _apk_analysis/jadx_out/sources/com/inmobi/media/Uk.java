package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes9.dex */
public final class Uk extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f26451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Yk f26452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26453c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Uk(Yk yk2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f26452b = yk2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26451a = obj;
        this.f26453c |= Integer.MIN_VALUE;
        return this.f26452b.b(this);
    }
}
