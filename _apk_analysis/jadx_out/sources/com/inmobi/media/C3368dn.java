package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.dn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3368dn extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f27062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3419fn f27063d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27064e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3368dn(C3419fn c3419fn, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27063d = c3419fn;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27062c = obj;
        this.f27064e |= Integer.MIN_VALUE;
        return C3419fn.a(this.f27063d, this);
    }
}
