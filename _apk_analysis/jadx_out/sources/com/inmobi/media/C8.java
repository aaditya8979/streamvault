package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes7.dex */
public final class C8 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Rf f25250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ F8 f25252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25253d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8(F8 f82, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25252c = f82;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25251b = obj;
        this.f25253d |= Integer.MIN_VALUE;
        return this.f25252c.a((Rf) null, this);
    }
}
