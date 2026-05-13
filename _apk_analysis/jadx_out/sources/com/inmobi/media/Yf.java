package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes10.dex */
public final class Yf extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Rf f26645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public sn.p f26646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f26647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Zf f26648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26649e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Yf(Zf zf2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f26648d = zf2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26647c = obj;
        this.f26649e |= Integer.MIN_VALUE;
        return this.f26648d.a(null, null, this);
    }
}
