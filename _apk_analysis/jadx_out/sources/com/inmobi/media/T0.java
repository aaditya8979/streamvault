package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes9.dex */
public final class T0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f26340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U0 f26341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26342c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T0(U0 u02, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f26341b = u02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26340a = obj;
        this.f26342c |= Integer.MIN_VALUE;
        return this.f26341b.a(null, this);
    }
}
