package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.b9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3302b9 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public sn.l f26844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f26845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3431g9 f26846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26847d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3302b9(C3431g9 c3431g9, hn.c cVar) {
        super(cVar);
        this.f26846c = c3431g9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26845b = obj;
        this.f26847d |= Integer.MIN_VALUE;
        return this.f26846c.a((sn.l) null, this);
    }
}
