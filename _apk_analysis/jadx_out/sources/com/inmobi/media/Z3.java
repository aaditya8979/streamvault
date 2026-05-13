package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes9.dex */
public final class Z3 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f26682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3271a4 f26683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26684c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z3(C3271a4 c3271a4, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f26683b = c3271a4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26682a = obj;
        this.f26684c |= Integer.MIN_VALUE;
        return this.f26683b.a(this);
    }
}
