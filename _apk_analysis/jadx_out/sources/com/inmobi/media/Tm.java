package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes9.dex */
public final class Tm extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f26386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Um f26388c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tm(Um um2, hn.c cVar) {
        super(cVar);
        this.f26388c = um2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26386a = obj;
        this.f26387b |= Integer.MIN_VALUE;
        return this.f26388c.emit(null, this);
    }
}
