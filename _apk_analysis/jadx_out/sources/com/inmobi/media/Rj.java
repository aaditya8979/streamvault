package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes9.dex */
public final class Rj extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f26264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Wj f26265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26266d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rj(Wj wj2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f26265c = wj2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26264b = obj;
        this.f26266d |= Integer.MIN_VALUE;
        return this.f26265c.a((hn.c) this);
    }
}
