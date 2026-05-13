package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes7.dex */
public final class D8 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Rf f25303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC3412fg f25304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f25305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ F8 f25306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f25307e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D8(F8 f82, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25306d = f82;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25305c = obj;
        this.f25307e |= Integer.MIN_VALUE;
        return this.f25306d.b(null, this);
    }
}
