package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes7.dex */
public final class Ga extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Q9 f25520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ La f25522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25523d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ga(La la2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25522c = la2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25521b = obj;
        this.f25523d |= Integer.MIN_VALUE;
        return La.a(this.f25522c, null, this);
    }
}
