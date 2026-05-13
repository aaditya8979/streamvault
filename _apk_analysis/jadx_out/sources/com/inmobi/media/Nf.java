package com.inmobi.media;

import android.app.Activity;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes8.dex */
public final class Nf extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f26036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public mo.a f26037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f26038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Pf f26039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26040e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Nf(Pf pf2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f26039d = pf2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26038c = obj;
        this.f26040e |= Integer.MIN_VALUE;
        return Pf.a(this.f26039d, null, this);
    }
}
