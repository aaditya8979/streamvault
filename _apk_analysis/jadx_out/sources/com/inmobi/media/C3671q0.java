package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3671q0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f27922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3720s0 f27923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27924c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3671q0(C3720s0 c3720s0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27923b = c3720s0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27922a = obj;
        this.f27924c |= Integer.MIN_VALUE;
        return this.f27923b.a(null, this);
    }
}
