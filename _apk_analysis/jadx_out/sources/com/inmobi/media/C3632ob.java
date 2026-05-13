package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.ob, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3632ob extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f27772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public mo.a f27773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f27774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3657pb f27775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27776e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3632ob(C3657pb c3657pb, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27775d = c3657pb;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27774c = obj;
        this.f27776e |= Integer.MIN_VALUE;
        return this.f27775d.a(null, this);
    }
}
