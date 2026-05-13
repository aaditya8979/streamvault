package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes9.dex */
public final class Tl extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3692ql f26382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f26383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Wl f26384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26385d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tl(Wl wl2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f26384c = wl2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26383b = obj;
        this.f26385d |= Integer.MIN_VALUE;
        return this.f26384c.a(this);
    }
}
