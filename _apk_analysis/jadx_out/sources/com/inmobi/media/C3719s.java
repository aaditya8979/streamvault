package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3719s extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f28080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3819w f28081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28082c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3719s(C3819w c3819w, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f28081b = c3819w;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28080a = obj;
        this.f28082c |= Integer.MIN_VALUE;
        return C3819w.a(this.f28081b, null, null, 0, this);
    }
}
