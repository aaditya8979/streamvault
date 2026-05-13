package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.gm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3444gm extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f27253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3469hm f27255c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3444gm(C3469hm c3469hm, hn.c cVar) {
        super(cVar);
        this.f27255c = c3469hm;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27253a = obj;
        this.f27254b |= Integer.MIN_VALUE;
        return this.f27255c.emit(null, this);
    }
}
