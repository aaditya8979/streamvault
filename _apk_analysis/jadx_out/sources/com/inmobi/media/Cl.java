package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class Cl extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Fl f25274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25275c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cl(Fl fl2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25274b = fl2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25273a = obj;
        this.f25275c |= Integer.MIN_VALUE;
        return this.f25274b.a((String) null, this);
    }
}
