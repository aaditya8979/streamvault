package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.j3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3499j3 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public S2 f27376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3524k3 f27378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27379d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3499j3(C3524k3 c3524k3, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27378c = c3524k3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27377b = obj;
        this.f27379d |= Integer.MIN_VALUE;
        return this.f27378c.a(null, this);
    }
}
