package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes8.dex */
public final class Kk extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f25818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public mo.a f25819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f25820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Mk f25821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f25822f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Kk(Mk mk2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25821e = mk2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25820d = obj;
        this.f25822f |= Integer.MIN_VALUE;
        return this.f25821e.a(0, null, this);
    }
}
