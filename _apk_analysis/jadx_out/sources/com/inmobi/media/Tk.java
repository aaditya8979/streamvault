package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes9.dex */
public final class Tk extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f26380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26381b;

    public Tk(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26380a = obj;
        this.f26381b |= Integer.MIN_VALUE;
        return Yk.a(this);
    }
}
