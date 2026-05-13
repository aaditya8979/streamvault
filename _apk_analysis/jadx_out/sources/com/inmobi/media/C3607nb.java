package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.nb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3607nb extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f27678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f27679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public mo.a f27680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f27681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C3657pb f27682e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f27683f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3607nb(C3657pb c3657pb, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27682e = c3657pb;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27681d = obj;
        this.f27683f |= Integer.MIN_VALUE;
        return this.f27682e.a(null, null, this);
    }
}
