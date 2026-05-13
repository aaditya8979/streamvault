package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.AdConfig;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.lf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3561lf extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AdConfig.OmidConfig f27566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f27567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f27568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3661pf f27569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27570e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3561lf(C3661pf c3661pf, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27569d = c3661pf;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27568c = obj;
        this.f27570e |= Integer.MIN_VALUE;
        return this.f27569d.a(this);
    }
}
