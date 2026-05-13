package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes8.dex */
public final class M9 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N9 f25948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25949c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M9(N9 n92, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25948b = n92;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25947a = obj;
        this.f25949c |= Integer.MIN_VALUE;
        return this.f25948b.b(0, this);
    }
}
