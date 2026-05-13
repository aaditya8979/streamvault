package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.l7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3553l7 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public mo.a f27545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3578m7 f27547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27548d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3553l7(C3578m7 c3578m7, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27547c = c3578m7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27546b = obj;
        this.f27548d |= Integer.MIN_VALUE;
        return this.f27547c.e(this);
    }
}
