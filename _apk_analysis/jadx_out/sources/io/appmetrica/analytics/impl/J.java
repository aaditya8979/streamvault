package io.appmetrica.analytics.impl;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle;
import io.appmetrica.analytics.coreutils.internal.toggle.OuterStateToggle;
import io.appmetrica.analytics.coreutils.internal.toggle.SavableToggle;

/* JADX INFO: loaded from: classes11.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4655af f65382a = C5009oa.k().y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SavableToggle f65383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OuterStateToggle f65384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final OuterStateToggle f65385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConjunctiveCompositeThreadSafeToggle f65386e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConjunctiveCompositeThreadSafeToggle f65387f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SavableToggle f65388g;

    public J(C4817gm c4817gm) {
        SavableToggle savableToggle = new SavableToggle("advIdsFromClientApi", new I(this));
        this.f65383b = savableToggle;
        OuterStateToggle outerStateToggle = new OuterStateToggle(false, "GAID-remote-config");
        this.f65384c = outerStateToggle;
        OuterStateToggle outerStateToggle2 = new OuterStateToggle(false, "HOAID-remote-config");
        this.f65385d = outerStateToggle2;
        this.f65386e = new ConjunctiveCompositeThreadSafeToggle(cn.w.p(savableToggle, outerStateToggle), IronSourceConstants.TYPE_GAID);
        this.f65387f = new ConjunctiveCompositeThreadSafeToggle(cn.w.p(savableToggle, outerStateToggle2), "HOAID");
        this.f65388g = savableToggle;
        a(c4817gm);
    }

    public final G a() {
        int i10 = 3;
        int i11 = 4;
        int i12 = this.f65386e.getActualState() ? 1 : !this.f65383b.getActualState() ? 2 : !this.f65384c.getActualState() ? 3 : 4;
        if (this.f65387f.getActualState()) {
            i10 = 1;
        } else if (!this.f65383b.getActualState()) {
            i10 = 2;
        } else if (this.f65385d.getActualState()) {
            i10 = 4;
        }
        if (this.f65388g.getActualState()) {
            i11 = 1;
        } else if (!this.f65383b.getActualState()) {
            i11 = 2;
        }
        return new G(i12, i10, i11);
    }

    public final void a(C4817gm c4817gm) {
        boolean z10 = c4817gm.f66861p;
        this.f65384c.update(!z10 || c4817gm.f66859n.f67258c);
        this.f65385d.update(!z10 || c4817gm.f66859n.f67260e);
    }
}
