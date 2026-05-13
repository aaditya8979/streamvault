package com.inmobi.media;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.inmobi.media.om, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3643om extends AbstractC3498j2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p000do.l0 f27805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3668pm f27806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final go.k f27807d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3605n9 f27808e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f27809f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f27810g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InterfaceC3382ec f27811h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public K3 f27812i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ViewGroup f27813j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3643om(Context context, p000do.l0 l0Var, C3668pm c3668pm, go.k kVar, C3605n9 c3605n9) {
        super(context);
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(l0Var, "coroutineScope");
        tn.p.k(c3668pm, "videoExperienceModel");
        tn.p.k(kVar, "mediaEventFlow");
        this.f27805b = l0Var;
        this.f27806c = c3668pm;
        this.f27807d = kVar;
        this.f27808e = c3605n9;
        this.f27809f = new ArrayList();
        this.f27810g = new ArrayList();
    }

    @Override // com.inmobi.media.AbstractC3498j2
    public final Object a(FrameLayout frameLayout, C3533kc c3533kc) {
        Object objG = p000do.g.g(p000do.w0.c(), new C3289am(this, frameLayout, null), c3533kc);
        return objG == in.a.g() ? objG : bn.r.f5635a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0081, code lost:
    
        if (b(r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.inmobi.media.AbstractC3498j2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.inmobi.media.C3315bm
            if (r0 == 0) goto L13
            r0 = r9
            com.inmobi.media.bm r0 = (com.inmobi.media.C3315bm) r0
            int r1 = r0.f26883d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26883d = r1
            goto L18
        L13:
            com.inmobi.media.bm r0 = new com.inmobi.media.bm
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f26881b
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f26883d
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L35
            if (r2 != r3) goto L2d
            kotlin.c.b(r9)
            goto L84
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            com.inmobi.media.om r2 = r0.f26880a
            kotlin.c.b(r9)
            goto L75
        L3b:
            kotlin.c.b(r9)
            com.inmobi.media.n9 r9 = r8.f27808e
            if (r9 == 0) goto L60
            com.inmobi.media.pm r2 = r8.f27806c
            java.util.ArrayList r2 = r2.f27894c
            int r2 = r2.size()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "load Called - mediaFiles count: "
            r6.append(r7)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            java.lang.String r6 = "VideoExperienceManager"
            r9.a(r6, r2)
        L60:
            do.y1 r9 = p000do.w0.c()
            com.inmobi.media.cm r2 = new com.inmobi.media.cm
            r2.<init>(r8, r4)
            r0.f26880a = r8
            r0.f26883d = r5
            java.lang.Object r9 = p000do.g.g(r9, r2, r0)
            if (r9 != r1) goto L74
            goto L83
        L74:
            r2 = r8
        L75:
            com.inmobi.media.ec r9 = (com.inmobi.media.InterfaceC3382ec) r9
            r2.f27811h = r9
            r0.f26880a = r4
            r0.f26883d = r3
            java.lang.Object r9 = r8.b(r0)
            if (r9 != r1) goto L84
        L83:
            return r1
        L84:
            bn.r r9 = bn.r.f5635a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3643om.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.inmobi.media.AbstractC3498j2
    public final void a() {
        C3605n9 c3605n9 = this.f27808e;
        if (c3605n9 != null) {
            c3605n9.a("VideoExperienceManager", "destroy");
        }
        b();
        InterfaceC3382ec interfaceC3382ec = this.f27811h;
        if (interfaceC3382ec != null) {
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
        }
        P4.a(this.f27810g);
        K3 k32 = this.f27812i;
        if (k32 != null) {
            k32.a();
        }
    }

    @Override // com.inmobi.media.AbstractC3498j2
    public final void a(go.l lVar) {
        tn.p.k(lVar, "windowFlow");
        kotlinx.coroutines.g gVarD = p000do.i.d(this.f27805b, null, null, new Yl(lVar, null, this), 3, null);
        ArrayList arrayList = this.f27810g;
        tn.p.k(gVarD, "<this>");
        tn.p.k(arrayList, "activeJobs");
        arrayList.add(gVarD);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3643om.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.inmobi.media.AbstractC3498j2
    public final void b() {
        P4.a(this.f27805b, new Zl(this, null));
        InterfaceC3382ec interfaceC3382ec = this.f27811h;
        if (interfaceC3382ec == null) {
            tn.p.C("mediaPlayer");
            interfaceC3382ec = null;
        }
        Sd sd2 = (Sd) interfaceC3382ec;
        sd2.f26310j.c();
        C3669pn c3669pn = sd2.f26311k;
        Ij ij2 = c3669pn.f27907h;
        if (ij2 != null) {
            ij2.b();
        }
        c3669pn.f27903d.set(false);
        C3836wg c3836wg = (C3836wg) c3669pn.f27908i.f26566d.getValue();
        c3836wg.f28447f.set(true);
        H6.a(c3836wg.f28446e);
        c3836wg.f28446e = null;
        P4.a(c3669pn.f27904e);
        P4.a(sd2.f26304d);
        P4.a(this.f27809f);
    }
}
