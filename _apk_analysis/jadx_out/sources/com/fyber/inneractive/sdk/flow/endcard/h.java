package com.fyber.inneractive.sdk.flow.endcard;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.o f16320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16321b;

    public h() {
        com.fyber.inneractive.sdk.config.o oVar = IAConfigManager.O.f15975u.f16144b;
        this.f16320a = oVar;
        this.f16321b = oVar.a("vast_endcard_x_delay", 5, 0);
    }

    public final void a(b bVar, boolean z10) {
        if (bVar == null) {
            IAlog.a("%sapplyVastCompanionEndCardTime was called with a null endcard", IAlog.a(this));
        } else {
            bVar.f16311f = bVar.k() ? z10 ? this.f16320a.b("d_e_pl_dl_pl", this.f16321b, 0) : this.f16320a.b("d_e_pl", this.f16321b, 0) : z10 ? this.f16320a.b("d_e_npl_dl_npl", this.f16321b, 0) : this.f16320a.b("d_e_npl", this.f16321b, 0);
        }
    }

    public final void a(b bVar, boolean z10, boolean z11) {
        if (bVar == null) {
            IAlog.a("%sapplyNonVastCompanionEndCardTime was called with a null endcard", IAlog.a(this));
        } else {
            bVar.f16311f = z10 ? z11 ? this.f16320a.b("d_e_pl_dl_dl", this.f16321b, 0) : this.f16320a.b("d_e_npl_dl_dl", this.f16321b, 0) : this.f16320a.b("d_e_def", this.f16321b, 0);
        }
    }
}
