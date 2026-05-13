package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes7.dex */
public final class Al extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Ref$BooleanRef f25173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Ref$BooleanRef f25174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f25175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Fl f25176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f25177e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Al(Fl fl2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25176d = fl2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25175c = obj;
        this.f25177e |= Integer.MIN_VALUE;
        return Fl.b(this.f25176d, (XmlPullParser) null, this);
    }
}
