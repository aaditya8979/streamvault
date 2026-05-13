package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes8.dex */
public final class Ja extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ La f25711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25712c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ja(La la2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25711b = la2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25710a = obj;
        this.f25712c |= Integer.MIN_VALUE;
        return La.a(this.f25711b, this);
    }
}
