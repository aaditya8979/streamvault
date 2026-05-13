package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: com.inmobi.media.yl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3891yl extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Ref$BooleanRef f28606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f28607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Fl f28608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f28609d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3891yl(Fl fl2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f28608c = fl2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28607b = obj;
        this.f28609d |= Integer.MIN_VALUE;
        return this.f28608c.a((XmlPullParser) null, this);
    }
}
