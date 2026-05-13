package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: com.inmobi.media.ul, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3791ul extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public XmlPullParser f28286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f28287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public sn.l f28288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f28289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Fl f28290e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f28291f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3791ul(Fl fl2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f28290e = fl2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28289d = obj;
        this.f28291f |= Integer.MIN_VALUE;
        return this.f28290e.a((XmlPullParser) null, (String) null, (sn.l) null, this);
    }
}
