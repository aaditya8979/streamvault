package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.ej, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3389ej extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC3338cj f27113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC3338cj f27114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public mo.a f27115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f27116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC3415fj f27117e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f27118f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3389ej(AbstractC3415fj abstractC3415fj, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27117e = abstractC3415fj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27116d = obj;
        this.f27118f |= Integer.MIN_VALUE;
        return this.f27117e.a(null, null, this);
    }
}
