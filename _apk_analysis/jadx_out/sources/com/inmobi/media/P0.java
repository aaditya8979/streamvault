package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes8.dex */
public final class P0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public sn.l f26102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f26103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ R0 f26104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26105d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P0(R0 r02, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f26104c = r02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26103b = obj;
        this.f26105d |= Integer.MIN_VALUE;
        return this.f26104c.a((sn.l) null, this);
    }
}
