package com.inmobi.media;

import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.IOException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes7.dex */
public final class Bl extends SuspendLambda implements sn.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ XmlPullParser f25226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Fl f25227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ref$BooleanRef f25228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Ref$BooleanRef f25229e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bl(XmlPullParser xmlPullParser, Fl fl2, Ref$BooleanRef ref$BooleanRef, Ref$BooleanRef ref$BooleanRef2, hn.c cVar) {
        super(1, cVar);
        this.f25226b = xmlPullParser;
        this.f25227c = fl2;
        this.f25228d = ref$BooleanRef;
        this.f25229e = ref$BooleanRef2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(hn.c cVar) {
        return new Bl(this.f25226b, this.f25227c, this.f25228d, this.f25229e, cVar);
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        return ((Bl) create((hn.c) obj)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws XmlPullParserException, IOException {
        boolean z10;
        Object objG = in.a.g();
        int i10 = this.f25225a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            String name = this.f25226b.getName();
            if (tn.p.f(name, VastTagName.ERROR)) {
                C3809ve c3809veA = this.f25227c.a("error", this.f25226b);
                if (c3809veA != null) {
                    this.f25227c.f25470h.add(c3809veA);
                }
            } else if (tn.p.f(name, VastTagName.AD)) {
                Fl fl2 = this.f25227c;
                XmlPullParser xmlPullParser = this.f25226b;
                fl2.getClass();
                try {
                    z10 = Boolean.parseBoolean(xmlPullParser.getAttributeValue(null, "conditionalAd"));
                } catch (Exception unused) {
                    z10 = false;
                }
                if (z10) {
                    this.f25228d.element = true;
                    Fl fl3 = this.f25227c;
                    XmlPullParser xmlPullParser2 = this.f25226b;
                    fl3.getClass();
                    Fl.w(xmlPullParser2);
                    return bn.r.f5635a;
                }
                Ref$BooleanRef ref$BooleanRef = this.f25229e;
                if (ref$BooleanRef.element) {
                    Fl fl4 = this.f25227c;
                    XmlPullParser xmlPullParser3 = this.f25226b;
                    fl4.getClass();
                    Fl.w(xmlPullParser3);
                    return bn.r.f5635a;
                }
                ref$BooleanRef.element = true;
                Fl fl5 = this.f25227c;
                XmlPullParser xmlPullParser4 = this.f25226b;
                this.f25225a = 1;
                if (Fl.a(fl5, xmlPullParser4, this) == objG) {
                    return objG;
                }
            } else {
                Fl fl6 = this.f25227c;
                XmlPullParser xmlPullParser5 = this.f25226b;
                fl6.getClass();
                Fl.w(xmlPullParser5);
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
