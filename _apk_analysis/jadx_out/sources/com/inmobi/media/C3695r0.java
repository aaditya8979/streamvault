package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3695r0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f28010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3720s0 f28011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28012c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3695r0(C3720s0 c3720s0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f28011b = c3720s0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28010a = obj;
        this.f28012c |= Integer.MIN_VALUE;
        return this.f28011b.b(null, this);
    }
}
