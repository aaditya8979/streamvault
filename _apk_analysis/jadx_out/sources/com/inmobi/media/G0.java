package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes7.dex */
public final class G0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H0 f25503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25504c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G0(H0 h02, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25503b = h02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25502a = obj;
        this.f25504c |= Integer.MIN_VALUE;
        return this.f25503b.a(null, this);
    }
}
