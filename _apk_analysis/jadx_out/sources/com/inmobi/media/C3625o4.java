package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;

/* JADX INFO: renamed from: com.inmobi.media.o4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3625o4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27747a = C3625o4.class.getSimpleName();

    public final C3517jl a(C3424g2 c3424g2, C3575m4 c3575m4) {
        Integer num;
        tn.p.k(c3424g2, "configResponseObj");
        tn.p.k(c3575m4, "configRequestContext");
        int iB = c3424g2.b();
        Config config = c3575m4.f27598b;
        if (iB == 200) {
            try {
                Config configA = c3424g2.a();
                if (configA == null) {
                    tn.p.j(this.f27747a, "tag");
                    num = 3;
                } else if (configA.isValid()) {
                    num = null;
                } else {
                    tn.p.j(this.f27747a, "tag");
                    num = 4;
                }
                if (num != null) {
                    iB = num.intValue();
                } else {
                    if (configA == null) {
                        throw new IllegalArgumentException("Config object is null");
                    }
                    config = configA;
                }
            } catch (IllegalArgumentException unused) {
                iB = 2;
            }
        } else if (iB != 304) {
            tn.p.j(this.f27747a, "tag");
            iB += 1000;
        } else {
            tn.p.j(this.f27747a, "tag");
            c3575m4.f27598b.getType();
        }
        return new C3517jl(iB, config);
    }
}
