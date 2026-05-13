package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.of, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3636of extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f27790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3661pf f27791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27792c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3636of(C3661pf c3661pf, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27791b = c3661pf;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27790a = obj;
        this.f27792c |= Integer.MIN_VALUE;
        return this.f27791b.a(null, null, this);
    }
}
