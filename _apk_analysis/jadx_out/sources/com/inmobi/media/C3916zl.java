package com.inmobi.media;

import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: com.inmobi.media.zl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3916zl extends SuspendLambda implements sn.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ XmlPullParser f28665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ref$BooleanRef f28666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Fl f28667d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3916zl(Fl fl2, hn.c cVar, Ref$BooleanRef ref$BooleanRef, XmlPullParser xmlPullParser) {
        super(1, cVar);
        this.f28665b = xmlPullParser;
        this.f28666c = ref$BooleanRef;
        this.f28667d = fl2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(hn.c cVar) {
        XmlPullParser xmlPullParser = this.f28665b;
        return new C3916zl(this.f28667d, cVar, this.f28666c, xmlPullParser);
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        return ((C3916zl) create((hn.c) obj)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f28664a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            if (tn.p.f(this.f28665b.getName(), VastTagName.VAST)) {
                this.f28666c.element = true;
                Fl fl2 = this.f28667d;
                XmlPullParser xmlPullParser = this.f28665b;
                this.f28664a = 1;
                if (Fl.b(fl2, xmlPullParser, this) == objG) {
                    return objG;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        return bn.r.f5635a;
    }
}
