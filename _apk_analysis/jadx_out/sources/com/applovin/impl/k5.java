package com.applovin.impl;

import android.app.Activity;
import android.text.TextUtils;
import com.applovin.impl.d6;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class k5 extends i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f8610g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Activity f8611h;

    public k5(List list, Activity activity, com.applovin.impl.sdk.k kVar) {
        super("TaskAutoInitAdapters", kVar, true);
        this.f8610g = list;
        this.f8611h = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(k3 k3Var) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f8507c.a(this.f8506b, "Auto-initing adapter: " + k3Var);
        }
        this.f8505a.S().a(k3Var, this.f8611h);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f8610g.size() > 0) {
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o oVar = this.f8507c;
                String str = this.f8506b;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Auto-initing ");
                sb2.append(this.f8610g.size());
                sb2.append(" adapters");
                sb2.append(this.f8505a.s0().c() ? " in test mode" : "");
                sb2.append("...");
                oVar.a(str, sb2.toString());
            }
            if (TextUtils.isEmpty(this.f8505a.V())) {
                this.f8505a.O0();
            } else if (!this.f8505a.G0()) {
                com.applovin.impl.sdk.o.h("AppLovinSdk", "Auto-initing adapters for non-MAX mediation provider: " + this.f8505a.V());
            }
            if (this.f8611h == null) {
                com.applovin.impl.sdk.o.h("AppLovinSdk", "\n**********\nAttempting to init 3rd-party SDKs without an Activity instance.\n**********\n");
            }
            for (final k3 k3Var : this.f8610g) {
                if (k3Var.s()) {
                    this.f8505a.q0().a(new Runnable() { // from class: com.applovin.impl.hb
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f8440b.a(k3Var);
                        }
                    }, d6.b.MEDIATION);
                } else {
                    this.f8505a.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f8505a.O().a(this.f8506b, "Skipping eager auto-init for adapter " + k3Var);
                    }
                }
            }
        }
    }
}
