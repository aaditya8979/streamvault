package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.p2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3648p2 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public mo.a f27825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC3722s2 f27827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27828d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3648p2(AbstractC3722s2 abstractC3722s2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27827c = abstractC3722s2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27826b = obj;
        this.f27828d |= Integer.MIN_VALUE;
        return AbstractC3722s2.b(this.f27827c, this);
    }
}
