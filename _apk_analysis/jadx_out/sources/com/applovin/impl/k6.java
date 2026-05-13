package com.applovin.impl;

import com.applovin.impl.d6;
import com.applovin.impl.o7;
import com.applovin.sdk.AppLovinAdLoadListener;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.HashSet;

/* JADX INFO: loaded from: classes6.dex */
class k6 extends i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final s7 f8612g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AppLovinAdLoadListener f8613h;

    public k6(s7 s7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskRenderVastAd", kVar);
        this.f8613h = appLovinAdLoadListener;
        this.f8612g = s7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f8507c.a(this.f8506b, "Rendering VAST ad...");
        }
        int size = this.f8612g.a().size();
        HashSet hashSet = new HashSet(size);
        HashSet hashSet2 = new HashSet(size);
        String strA = "";
        x7 x7VarA = null;
        b8 b8VarA = null;
        r7 r7VarA = null;
        q7 q7VarA = null;
        String strA2 = "";
        for (p8 p8Var : this.f8612g.a()) {
            p8 p8VarB = p8Var.b(a8.b(p8Var) ? VastTagName.WRAPPER : VastTagName.IN_LINE);
            if (p8VarB != null) {
                p8 p8VarB2 = p8VarB.b(VastTagName.AD_SYSTEM);
                if (p8VarB2 != null) {
                    x7VarA = x7.a(p8VarB2, x7VarA, this.f8505a);
                }
                strA = a8.a(p8VarB, "AdTitle", strA);
                strA2 = a8.a(p8VarB, "Description", strA2);
                a8.a(p8VarB.a(VastTagName.IMPRESSION), hashSet, this.f8612g, this.f8505a);
                p8 p8VarC = p8VarB.c("ViewableImpression");
                if (p8VarC != null) {
                    a8.a(p8VarC.a("Viewable"), hashSet, this.f8612g, this.f8505a);
                }
                p8 p8VarB3 = p8VarB.b("AdVerifications");
                if (p8VarB3 != null) {
                    q7VarA = q7.a(p8VarB3, q7VarA, this.f8612g, this.f8505a);
                }
                a8.a(p8VarB.a(VastTagName.ERROR), hashSet2, this.f8612g, this.f8505a);
                p8 p8VarC2 = p8VarB.c(VastTagName.CREATIVES);
                if (p8VarC2 != null) {
                    for (p8 p8Var2 : p8VarC2.b()) {
                        p8 p8VarC3 = p8Var2.c(VastTagName.LINEAR);
                        if (p8VarC3 != null) {
                            b8VarA = b8.a(p8VarC3, b8VarA, this.f8612g, this.f8505a);
                        } else {
                            p8 p8VarB4 = p8Var2.b(VastTagName.COMPANION_ADS);
                            if (p8VarB4 != null) {
                                p8 p8VarB5 = p8VarB4.b(VastTagName.COMPANION);
                                if (p8VarB5 != null) {
                                    r7VarA = r7.a(p8VarB5, r7VarA, this.f8612g, this.f8505a);
                                }
                            } else if (com.applovin.impl.sdk.o.a()) {
                                this.f8507c.b(this.f8506b, "Received and will skip rendering for an unidentified creative: " + p8Var2);
                            }
                        }
                    }
                }
            } else if (com.applovin.impl.sdk.o.a()) {
                this.f8507c.b(this.f8506b, "Did not find wrapper or inline response for node: " + p8Var);
            }
        }
        o7 o7VarA = new o7.b().a(this.f8505a).a(this.f8612g.b()).b(this.f8612g.e()).a(this.f8612g.c()).b(strA).a(strA2).a(x7VarA).a(b8VarA).a(r7VarA).a(q7VarA).b(hashSet).a(q7VarA).a(hashSet2).a();
        t7 t7VarC = a8.c(o7VarA);
        if (t7VarC != null) {
            a8.a(this.f8612g, this.f8613h, t7VarC, -6, this.f8505a);
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f8507c.a(this.f8506b, "Finished rendering VAST ad: " + o7VarA);
        }
        o7VarA.getAdEventTracker().e();
        this.f8505a.q0().a((i5) new n5(o7VarA, this.f8505a, this.f8613h), d6.b.CACHING);
    }
}
