package com.inmobi.media;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.mm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3593mm extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3643om f27643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K3 f27644b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3593mm(C3643om c3643om, K3 k32, hn.c cVar) {
        super(2, cVar);
        this.f27643a = c3643om;
        this.f27644b = k32;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3593mm(this.f27643a, this.f27644b, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3593mm(this.f27643a, this.f27644b, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws I3 {
        in.a.g();
        kotlin.c.b(obj);
        C3605n9 c3605n9 = this.f27643a.f27808e;
        if (c3605n9 != null) {
            c3605n9.a("VideoExperienceManager", "Companion Ad Rendered");
        }
        ViewGroup viewGroup = this.f27643a.f27813j;
        ViewParent parent = viewGroup != null ? viewGroup.getParent() : null;
        FrameLayout frameLayout = parent instanceof FrameLayout ? (FrameLayout) parent : null;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        C3643om c3643om = this.f27643a;
        c3643om.f27813j = null;
        InterfaceC3382ec interfaceC3382ec = c3643om.f27811h;
        if (interfaceC3382ec == null) {
            tn.p.C("mediaPlayer");
            interfaceC3382ec = null;
        }
        Sd sd2 = (Sd) interfaceC3382ec;
        C3605n9 c3605n92 = sd2.f26303c;
        if (c3605n92 != null) {
            c3605n92.a("NativeMediaPlayer", "destroy called");
        }
        sd2.f26305e = EnumC3736sg.f28129h;
        P4.a(sd2.f26304d);
        sd2.f26311k.b();
        C3281ae c3281ae = sd2.f26309i;
        c3281ae.f26794g.removeAllViews();
        c3281ae.f26793f.c();
        sd2.f26310j.c();
        sd2.f26307g.removeAllViews();
        sd2.f26308h.release();
        if (frameLayout == null) {
            return null;
        }
        K3 k32 = this.f27644b;
        k32.getClass();
        tn.p.k(frameLayout, "parentView");
        if (!tn.p.f(k32.f25790i, L3.f25844a)) {
            P3 p32 = k32.f25790i;
            throw new I3(!tn.p.f(p32, M3.f25929a) ? !tn.p.f(p32, O3.f26062a) ? tn.p.f(p32, N3.f25983a) ? "Companion ad failed to load" : "Companion ad view is not available" : "Companion ad is still loading" : "Companion ad has not started loading");
        }
        C3605n9 c3605n93 = k32.f25784c;
        if (c3605n93 != null) {
            c3605n93.a("CompanionAdManager", "renderCompanionView");
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        frameLayout.addView(k32.f25787f, layoutParams);
        k32.b();
        C3592ml c3592ml = k32.f25788g;
        if (c3592ml != null) {
            List listO0 = cn.f0.O0(c3592ml.f27641b, c3592ml.f27642c);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listO0) {
                if (tn.p.f(((C3809ve) obj2).f28365b, "creativeView")) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(cn.x.x(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((C3809ve) it.next()).f28364a);
            }
            Map mapA = AbstractC3491ik.a(k32.f25783b.f26469a);
            Wj wj2 = Wj.f26549a;
            Wj.b("CompanionAdRendered", mapA, EnumC3287ak.f26805a);
            P4.a(k32.f25785d, k32.f25782a, new W3(arrayList2));
        }
        return bn.r.f5635a;
    }
}
