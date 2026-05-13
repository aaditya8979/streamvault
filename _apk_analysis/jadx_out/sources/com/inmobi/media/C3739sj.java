package com.inmobi.media;

import android.widget.ImageView;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: renamed from: com.inmobi.media.sj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3739sj extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f28139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f28140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Ref$BooleanRef f28141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f28142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C3839wj f28143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f28144f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3739sj(C3839wj c3839wj, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f28143e = c3839wj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28142d = obj;
        this.f28144f |= Integer.MIN_VALUE;
        return this.f28143e.a((List) null, (ImageView) null, this);
    }
}
