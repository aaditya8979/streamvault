package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdResponse;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes8.dex */
public final class Q0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f26147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AdResponse f26148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f26149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26151e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f26152f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ R0 f26153g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f26154h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q0(R0 r02, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f26153g = r02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26152f = obj;
        this.f26154h |= Integer.MIN_VALUE;
        return this.f26153g.a(null, null, this);
    }
}
