package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: com.inmobi.media.wl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3841wl extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Ref$BooleanRef f28464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f28465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Fl f28466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f28467d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3841wl(Fl fl2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f28466c = fl2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28465b = obj;
        this.f28467d |= Integer.MIN_VALUE;
        return Fl.a(this.f28466c, (XmlPullParser) null, this);
    }
}
