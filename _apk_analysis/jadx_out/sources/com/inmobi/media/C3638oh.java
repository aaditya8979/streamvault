package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.oh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3638oh extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public kotlin.coroutines.d f27794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3688qh f27796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27797d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3638oh(C3688qh c3688qh, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27796c = c3688qh;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27795b = obj;
        this.f27797d |= Integer.MIN_VALUE;
        return this.f27796c.a(this);
    }
}
