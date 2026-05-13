package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes9.dex */
public final class Qd extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f26180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Sd f26181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26182c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Qd(Sd sd2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f26181b = sd2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26180a = obj;
        this.f26182c |= Integer.MIN_VALUE;
        return this.f26181b.a(null, this);
    }
}
