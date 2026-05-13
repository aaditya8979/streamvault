package com.inmobi.media;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes7.dex */
public final class Ah extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f25165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f25166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f25167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bh f25168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f25169e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ah(Bh bh2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25168d = bh2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25167c = obj;
        this.f25169e |= Integer.MIN_VALUE;
        return this.f25168d.a((Ne) null, (List) null, this);
    }
}
