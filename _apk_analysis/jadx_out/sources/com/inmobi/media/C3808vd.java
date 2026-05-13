package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.vd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3808vd extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f28361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3833wd f28363c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3808vd(C3833wd c3833wd, hn.c cVar) {
        super(cVar);
        this.f28363c = c3833wd;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28361a = obj;
        this.f28362b |= Integer.MIN_VALUE;
        return this.f28363c.emit(null, this);
    }
}
