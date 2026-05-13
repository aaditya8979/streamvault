package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.v7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3802v7 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f28332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3827w7 f28334c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3802v7(C3827w7 c3827w7, hn.c cVar) {
        super(cVar);
        this.f28334c = c3827w7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28332a = obj;
        this.f28333b |= Integer.MIN_VALUE;
        return this.f28334c.emit(null, this);
    }
}
