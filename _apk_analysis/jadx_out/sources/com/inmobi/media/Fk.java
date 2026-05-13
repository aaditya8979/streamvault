package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class Fk extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Jk f25461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25462c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fk(Jk jk2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25461b = jk2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25460a = obj;
        this.f25462c |= Integer.MIN_VALUE;
        return this.f25461b.a((ContinuationImpl) this);
    }
}
