package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.kg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3537kg extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Rf f27474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3637og f27476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27477d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3537kg(C3637og c3637og, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27476c = c3637og;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27475b = obj;
        this.f27477d |= Integer.MIN_VALUE;
        return this.f27476c.a((String) null, this);
    }
}
