package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.p6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3652p6 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f27837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C3776u6 f27838e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f27839f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3652p6(C3776u6 c3776u6, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27838e = c3776u6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27837d = obj;
        this.f27839f |= Integer.MIN_VALUE;
        return this.f27838e.a(0, this);
    }
}
