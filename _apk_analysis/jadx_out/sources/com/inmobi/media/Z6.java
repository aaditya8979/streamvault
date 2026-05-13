package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUserDataModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes10.dex */
public final class Z6 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InMobiUserDataModel f26687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public mo.a f26688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f26689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26690d;

    public Z6(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26689c = obj;
        this.f26690d |= Integer.MIN_VALUE;
        return C3274a7.a(null, this);
    }
}
