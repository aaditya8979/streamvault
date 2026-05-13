package com.inmobi.media;

import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes9.dex */
public final class Vl extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f26509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Wl f26510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26511c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Vl(Wl wl2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f26510b = wl2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26509a = obj;
        this.f26511c |= Integer.MIN_VALUE;
        return this.f26510b.a((String) null, (ArrayList) null, this);
    }
}
