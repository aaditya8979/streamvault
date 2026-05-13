package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes9.dex */
public final class Sj extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3390ek f26323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f26325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Wj f26326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26327e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Sj(Wj wj2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f26326d = wj2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26325c = obj;
        this.f26327e |= Integer.MIN_VALUE;
        return this.f26326d.a(null, this);
    }
}
