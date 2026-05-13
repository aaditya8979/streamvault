package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes7.dex */
public final class A4 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4 f25139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25140c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A4(C4 c42, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25139b = c42;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25138a = obj;
        this.f25140c |= Integer.MIN_VALUE;
        return this.f25139b.a(this);
    }
}
