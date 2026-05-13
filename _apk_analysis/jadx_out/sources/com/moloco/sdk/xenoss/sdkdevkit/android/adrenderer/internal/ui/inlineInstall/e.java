package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.service_locator.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 0)
public final class e implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final g f48974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final w0 f48975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f48976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f48977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f48978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f48979f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final String f48980g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final String f48981h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final com.moloco.sdk.acm.recorder.a f48982i;

    public e(@NotNull g gVar, @NotNull w0 w0Var, boolean z10, boolean z11, boolean z12, boolean z13, @Nullable String str, @Nullable String str2, @Nullable com.moloco.sdk.acm.recorder.a aVar) {
        tn.p.k(gVar, "inlineInstallSheetLauncher");
        tn.p.k(w0Var, "fallbackHandler");
        this.f48974a = gVar;
        this.f48975b = w0Var;
        this.f48976c = z10;
        this.f48977d = z11;
        this.f48978e = z12;
        this.f48979f = z13;
        this.f48980g = str;
        this.f48981h = str2;
        this.f48982i = aVar;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.o
    public void a(@NotNull String str) {
        tn.p.k(str, "url");
        if (this.f48976c) {
            this.f48974a.a(str, this.f48975b);
        } else {
            this.f48975b.a(str);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.o
    public void b(@Nullable String str) {
        if (this.f48977d && !this.f48979f) {
            this.f48974a.b(str, this.f48975b);
            return;
        }
        if (this.f48979f) {
            String str2 = this.f48980g;
            if (str2 != null) {
                str = str2;
            }
            if (str != null) {
                this.f48975b.a(str);
                com.moloco.sdk.acm.recorder.a aVar = this.f48982i;
                if (aVar != null) {
                    aVar.b(new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.R.c()).e(com.moloco.sdk.internal.client_metrics_data.d.f45971d.c(), "auto_fullsheet_shown_complete"));
                }
                String str3 = this.f48981h;
                if (str3 != null) {
                    b.i.f47671a.c().a(str3);
                }
            }
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.o
    public void c(@Nullable String str) {
        if (this.f48978e && !this.f48979f) {
            this.f48974a.b(str, this.f48975b);
            return;
        }
        if (this.f48979f) {
            String str2 = this.f48980g;
            if (str2 != null) {
                str = str2;
            }
            if (str != null) {
                this.f48975b.a(str);
                com.moloco.sdk.acm.recorder.a aVar = this.f48982i;
                if (aVar != null) {
                    aVar.b(new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.R.c()).e(com.moloco.sdk.internal.client_metrics_data.d.f45971d.c(), "auto_fullsheet_shown_skip"));
                }
                String str3 = this.f48981h;
                if (str3 != null) {
                    b.i.f47671a.c().a(str3);
                }
            }
        }
    }
}
