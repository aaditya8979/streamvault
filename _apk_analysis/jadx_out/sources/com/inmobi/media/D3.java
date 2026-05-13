package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes7.dex */
public final class D3 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25290b;

    public D3(hn.c cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25289a = obj;
        this.f25290b |= Integer.MIN_VALUE;
        return F3.a((C3688qh) null, (sn.l) null, this);
    }
}
