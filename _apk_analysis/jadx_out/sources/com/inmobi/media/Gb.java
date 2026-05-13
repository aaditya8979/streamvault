package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes7.dex */
public final class Gb extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Jb f25525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25526c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gb(Jb jb2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25525b = jb2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25524a = obj;
        this.f25526c |= Integer.MIN_VALUE;
        return this.f25525b.a(null, null, this);
    }
}
