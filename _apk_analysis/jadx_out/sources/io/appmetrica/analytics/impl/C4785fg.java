package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.ArrayList;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.fg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4785fg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4965mg f66780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Aa f66781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5239xg f66782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bn.g f66783d = kotlin.b.b(new C4708cg(this));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final bn.g f66784e = kotlin.b.b(new C4656ag(this));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final bn.g f66785f = kotlin.b.b(new C4759eg(this));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f66786g = new ArrayList();

    public C4785fg(C4965mg c4965mg, C5214wg c5214wg, Aa aa2, C5239xg c5239xg) {
        this.f66780a = c4965mg;
        this.f66781b = aa2;
        this.f66782c = c5239xg;
    }

    public static final Xf a(C4785fg c4785fg) {
        return (Xf) c4785fg.f66783d.getValue();
    }

    public static final void a(C4785fg c4785fg, C5015og c5015og, Xf xf2) {
        boolean zF;
        c4785fg.f66786g.add(c5015og);
        C5239xg c5239xg = c4785fg.f66782c;
        if (c5015og == null) {
            c5239xg.getClass();
        } else {
            SafePackageManager safePackageManager = c5239xg.f67947b;
            Context context = c5239xg.f67946a;
            String installerPackageName = safePackageManager.getInstallerPackageName(context, context.getPackageName());
            int iOrdinal = c5015og.f67463d.ordinal();
            if (iOrdinal == 1) {
                zF = tn.p.f(c5239xg.f67951f, installerPackageName);
            } else if (iOrdinal == 2) {
                zF = tn.p.f(c5239xg.f67952g, installerPackageName);
            }
            if (zF) {
                c4785fg.a(c5015og);
                return;
            }
        }
        xf2.a();
    }

    public final void a(C5015og c5015og) {
        C4965mg c4965mg = this.f66780a;
        synchronized (c4965mg) {
            c4965mg.f67297b = c5015og;
            c4965mg.f67298c = true;
            c4965mg.f67299d.a(c5015og);
            c4965mg.f67299d.d();
            c4965mg.a(c4965mg.f67297b);
        }
    }
}
