package com.inmobi.media;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class Xl implements go.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3643om f26601a;

    public Xl(p000do.l0 l0Var, C3643om c3643om) {
        this.f26601a = c3643om;
    }

    @Override // go.e
    public final Object emit(Object obj, hn.c cVar) {
        K3 k32;
        go.k kVar;
        kotlinx.coroutines.g gVarD;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C3605n9 c3605n9 = this.f26601a.f27808e;
        if (c3605n9 != null) {
            c3605n9.a("VideoExperienceManager", "attachWindowLifecycleObserver - window visibility changed: " + zBooleanValue);
        }
        if (zBooleanValue) {
            C3643om c3643om = this.f26601a;
            C3605n9 c3605n92 = c3643om.f27808e;
            if (c3605n92 != null) {
                c3605n92.a("VideoExperienceManager", "handleOnWindowVisible called - starting media player and setting up observers");
            }
            InterfaceC3382ec interfaceC3382ec = c3643om.f27811h;
            if (interfaceC3382ec == null) {
                tn.p.C("mediaPlayer");
                interfaceC3382ec = null;
            }
            Sd sd2 = (Sd) interfaceC3382ec;
            C3669pn c3669pn = sd2.f26311k;
            c3669pn.f27903d.set(true);
            C3836wg c3836wg = (C3836wg) c3669pn.f27908i.f26566d.getValue();
            c3836wg.f28443b.setValue(Mn.f25977a);
            c3836wg.f28447f.set(true);
            H6.a(c3836wg.f28446e);
            c3836wg.f28446e = null;
            C3836wg c3836wg2 = (C3836wg) c3669pn.f27908i.f26566d.getValue();
            c3836wg2.a();
            kotlinx.coroutines.g gVarD2 = p000do.i.d(c3669pn.f27900a, p000do.w0.c(), null, new C3619nn(new Vm(c3836wg2.f28443b), null, c3669pn), 2, null);
            ArrayList arrayList = c3669pn.f27904e;
            tn.p.k(gVarD2, "<this>");
            tn.p.k(arrayList, "activeJobs");
            arrayList.add(gVarD2);
            c3669pn.a();
            kotlinx.coroutines.g gVarD3 = p000do.i.d(sd2.f26301a, null, null, new Ld(new Od(sd2.f26313m), null, sd2), 3, null);
            ArrayList arrayList2 = sd2.f26304d;
            tn.p.k(gVarD3, "<this>");
            tn.p.k(arrayList2, "activeJobs");
            arrayList2.add(gVarD3);
            sd2.f26310j.b();
            C3605n9 c3605n93 = c3643om.f27808e;
            if (c3605n93 != null) {
                c3605n93.a("VideoExperienceManager", "observeMediaEvents - setting up media event observers");
            }
            InterfaceC3382ec interfaceC3382ec2 = c3643om.f27811h;
            if (interfaceC3382ec2 == null) {
                tn.p.C("mediaPlayer");
                interfaceC3382ec2 = null;
            }
            kotlinx.coroutines.g gVarD4 = go.f.D(go.f.G(new C3493im(go.f.G(((Sd) interfaceC3382ec2).f26313m, new C3518jm(c3643om, null))), new C3543km(c3643om, null)), c3643om.f27805b);
            ArrayList arrayList3 = c3643om.f27809f;
            tn.p.k(gVarD4, "<this>");
            tn.p.k(arrayList3, "activeJobs");
            arrayList3.add(gVarD4);
            P4.a(c3643om.f27805b, new C3618nm(c3643om, null));
            if (!c3643om.f27806c.f27893b.isEmpty() && (k32 = c3643om.f27812i) != null && (kVar = k32.f25785d) != null && (gVarD = p000do.i.d(c3643om.f27805b, null, null, new C3418fm(kVar, null, c3643om), 3, null)) != null) {
                ArrayList arrayList4 = c3643om.f27809f;
                tn.p.k(gVarD, "<this>");
                tn.p.k(arrayList4, "activeJobs");
                arrayList4.add(gVarD);
            }
        } else {
            this.f26601a.b();
        }
        return bn.r.f5635a;
    }
}
