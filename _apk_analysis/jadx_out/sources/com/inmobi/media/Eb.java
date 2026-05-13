package com.inmobi.media;

import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class Eb extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator f25374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f25375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f25376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Jb f25377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f25378e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Eb(Jb jb2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25377d = jb2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25376c = obj;
        this.f25378e |= Integer.MIN_VALUE;
        return this.f25377d.a((C3682qb) null, this);
    }
}
