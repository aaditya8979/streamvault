package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes8.dex */
public final class K1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M1 f25772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25773c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K1(M1 m12, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25772b = m12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25771a = obj;
        this.f25773c |= Integer.MIN_VALUE;
        return M1.a(this.f25772b, null, null, this);
    }
}
