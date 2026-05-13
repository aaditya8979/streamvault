package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes8.dex */
public final class Md extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Nd f25958c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Md(Nd nd2, hn.c cVar) {
        super(cVar);
        this.f25958c = nd2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25956a = obj;
        this.f25957b |= Integer.MIN_VALUE;
        return this.f25958c.emit(null, this);
    }
}
