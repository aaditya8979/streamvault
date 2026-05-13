package com.inmobi.media;

import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.IOException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: com.inmobi.media.xl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3866xl extends SuspendLambda implements sn.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ XmlPullParser f28535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ref$BooleanRef f28536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Fl f28537d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3866xl(Fl fl2, hn.c cVar, Ref$BooleanRef ref$BooleanRef, XmlPullParser xmlPullParser) {
        super(1, cVar);
        this.f28535b = xmlPullParser;
        this.f28536c = ref$BooleanRef;
        this.f28537d = fl2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(hn.c cVar) {
        XmlPullParser xmlPullParser = this.f28535b;
        return new C3866xl(this.f28537d, cVar, this.f28536c, xmlPullParser);
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        return ((C3866xl) create((hn.c) obj)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws XmlPullParserException, C3766tl, IOException {
        Object objG = in.a.g();
        int i10 = this.f28534a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            String name = this.f28535b.getName();
            if (tn.p.f(name, VastTagName.IN_LINE)) {
                Ref$BooleanRef ref$BooleanRef = this.f28536c;
                if (!ref$BooleanRef.element) {
                    ref$BooleanRef.element = true;
                    this.f28537d.g(this.f28535b);
                }
            } else if (tn.p.f(name, VastTagName.WRAPPER)) {
                Ref$BooleanRef ref$BooleanRef2 = this.f28536c;
                if (!ref$BooleanRef2.element) {
                    ref$BooleanRef2.element = true;
                    Fl fl2 = this.f28537d;
                    XmlPullParser xmlPullParser = this.f28535b;
                    this.f28534a = 1;
                    if (Fl.c(fl2, xmlPullParser, this) == objG) {
                        return objG;
                    }
                }
            } else {
                Fl fl3 = this.f28537d;
                XmlPullParser xmlPullParser2 = this.f28535b;
                fl3.getClass();
                Fl.w(xmlPullParser2);
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
