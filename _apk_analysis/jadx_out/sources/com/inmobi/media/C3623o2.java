package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.o2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3623o2 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public mo.a f27739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC3722s2 f27741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27742d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3623o2(AbstractC3722s2 abstractC3722s2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27741c = abstractC3722s2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27740b = obj;
        this.f27742d |= Integer.MIN_VALUE;
        return AbstractC3722s2.a(this.f27741c, this);
    }
}
