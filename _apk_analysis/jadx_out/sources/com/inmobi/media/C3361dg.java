package com.inmobi.media;

import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.dg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3361dg extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator f27037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3386eg f27039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27040d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3361dg(C3386eg c3386eg, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27039c = c3386eg;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27038b = obj;
        this.f27040d |= Integer.MIN_VALUE;
        return this.f27039c.a((String) null, this);
    }
}
