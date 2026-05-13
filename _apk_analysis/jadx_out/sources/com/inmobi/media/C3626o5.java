package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.o5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3626o5 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Rf f27748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3651p5 f27750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27751d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3626o5(C3651p5 c3651p5, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27750c = c3651p5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27749b = obj;
        this.f27751d |= Integer.MIN_VALUE;
        return this.f27750c.a((Rf) null, this);
    }
}
