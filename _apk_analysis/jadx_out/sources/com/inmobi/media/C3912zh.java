package com.inmobi.media;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.zh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3912zh extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f28645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f28646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public fo.m f28647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f28648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Ne f28649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f28650f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Iterator f28651g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f28652h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f28653i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f28654j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f28655k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f28656l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f28657m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f28658n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f28659o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Bh f28660p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f28661q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3912zh(Bh bh2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f28660p = bh2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28659o = obj;
        this.f28661q |= Integer.MIN_VALUE;
        return this.f28660p.a(null, null, null, null, null, this);
    }
}
