package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUnifiedIdService;
import com.inmobi.unifiedId.InMobiUserDataModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes8.dex */
public final class J9 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25709b;

    public J9(hn.c cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25708a = obj;
        this.f25709b |= Integer.MIN_VALUE;
        return InMobiUnifiedIdService.a((InMobiUserDataModel) null, this);
    }
}
