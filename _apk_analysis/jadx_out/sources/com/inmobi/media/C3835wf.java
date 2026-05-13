package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.wf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3835wf extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f28439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3885yf f28440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28441c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3835wf(C3885yf c3885yf, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f28440b = c3885yf;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28439a = obj;
        this.f28441c |= Integer.MIN_VALUE;
        return C3885yf.a(this.f28440b, this);
    }
}
