package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.rm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3717rm extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AdConfig.VastVideoConfig f28076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f28077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28078c;

    public C3717rm(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28077b = obj;
        this.f28078c |= Integer.MIN_VALUE;
        return AbstractC3842wm.a(null, 0.0d, null, this);
    }
}
