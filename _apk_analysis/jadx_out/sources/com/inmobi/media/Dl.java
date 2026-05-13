package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: loaded from: classes6.dex */
public final class Dl extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Ref$BooleanRef f25340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Fl f25342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25343d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dl(Fl fl2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25342c = fl2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25341b = obj;
        this.f25343d |= Integer.MIN_VALUE;
        return Fl.c(this.f25342c, null, this);
    }
}
