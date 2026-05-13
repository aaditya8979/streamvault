package com.inmobi.media;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes9.dex */
public final class Wa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ya f26531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U5 f26532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f26533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f26534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f26535e;

    public Wa(Ya ya2, U5 u52) {
        tn.p.k(u52, "embeddedBrowserViewClient");
        this.f26531a = ya2;
        this.f26532b = u52;
        this.f26533c = new LinkedHashSet();
    }

    public final void a(int i10, boolean z10, String str, Integer num) {
        try {
            if (this.f26535e) {
                return;
            }
            Ya ya2 = this.f26531a;
            if (ya2 != null) {
                ya2.f26632f = "IN_CUSTOM";
            }
            switch (i10) {
                case 1:
                    if (z10) {
                        this.f26534d = str;
                        U5 u52 = this.f26532b;
                        Na na2 = Na.f26024h;
                        u52.getClass();
                        tn.p.k(na2, "funnelState");
                        Pa.a(na2, ya2, null, u52.f26414i);
                    }
                    break;
                case 2:
                    if (z10) {
                        this.f26534d = str;
                        this.f26535e = true;
                        if (!this.f26533c.contains(1)) {
                            U5 u53 = this.f26532b;
                            Na na3 = Na.f26024h;
                            Ya ya3 = this.f26531a;
                            u53.getClass();
                            tn.p.k(na3, "funnelState");
                            Pa.a(na3, ya3, 8006, u53.f26414i);
                        }
                        this.f26532b.f26412g.invoke();
                        U5 u54 = this.f26532b;
                        Na na4 = Na.f26025i;
                        Ya ya4 = this.f26531a;
                        u54.getClass();
                        tn.p.k(na4, "funnelState");
                        Pa.a(na4, ya4, null, u54.f26414i);
                    }
                    break;
                case 3:
                    if (z10 || (str != null && tn.p.f(str, this.f26534d))) {
                        this.f26535e = true;
                        if (!this.f26533c.contains(1)) {
                            U5 u55 = this.f26532b;
                            Na na5 = Na.f26024h;
                            Ya ya5 = this.f26531a;
                            u55.getClass();
                            tn.p.k(na5, "funnelState");
                            Pa.a(na5, ya5, 8006, u55.f26414i);
                        }
                        U5 u56 = this.f26532b;
                        Na na6 = Na.f26026j;
                        Ya ya6 = this.f26531a;
                        Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : 8100);
                        u56.getClass();
                        tn.p.k(na6, "funnelState");
                        Pa.a(na6, ya6, numValueOf, u56.f26414i);
                    }
                    break;
                case 4:
                    if (z10) {
                        this.f26534d = str;
                    }
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    this.f26535e = true;
                    switch (i10) {
                        case 5:
                            i = 8200;
                            break;
                        case 6:
                            i = 8300;
                            break;
                        case 7:
                            i = 8400;
                            break;
                        case 8:
                            i = 8600;
                            break;
                        case 9:
                            i = 8500;
                            break;
                    }
                    int i11 = 4;
                    if (!this.f26533c.contains(4)) {
                        i11 = 0;
                    }
                    int i12 = i + i11;
                    U5 u57 = this.f26532b;
                    Na na7 = Na.f26026j;
                    Ya ya7 = this.f26531a;
                    Integer numValueOf2 = Integer.valueOf(i12);
                    u57.getClass();
                    tn.p.k(na7, "funnelState");
                    Pa.a(na7, ya7, numValueOf2, u57.f26414i);
                    break;
            }
            this.f26533c.add(Integer.valueOf(i10));
        } catch (Exception e10) {
            e10.toString();
        }
    }
}
