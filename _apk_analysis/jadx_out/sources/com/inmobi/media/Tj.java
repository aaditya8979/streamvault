package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes9.dex */
public final class Tj extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f26378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26379b;

    public Tj(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26378a = obj;
        this.f26379b |= Integer.MIN_VALUE;
        return Wj.b(this);
    }
}
