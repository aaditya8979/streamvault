package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import androidx.compose.runtime.internal.StabilityInferred;
import com.ironsource.K5;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.service_locator.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w0;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 0)
public final class k implements g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final a f48987h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f48988i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final p f48989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f48990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final c f48991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final b f48992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a f48993e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final com.moloco.sdk.acm.recorder.a f48994f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f48995g;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public k(@NotNull p pVar, @Nullable String str, @NotNull c cVar, @Nullable b bVar, @Nullable com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a aVar, @Nullable com.moloco.sdk.acm.recorder.a aVar2) {
        tn.p.k(pVar, "installer");
        tn.p.k(cVar, "bundleExtractor");
        this.f48989a = pVar;
        this.f48990b = str;
        this.f48991c = cVar;
        this.f48992d = bVar;
        this.f48993e = aVar;
        this.f48994f = aVar2;
        this.f48995g = new AtomicBoolean(false);
    }

    public static final bn.r c(k kVar, n nVar) {
        tn.p.k(nVar, K5.f29723b);
        if (!tn.p.f(nVar, n.c.f49022a)) {
            if (tn.p.f(nVar, n.a.f49020a)) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "InlineInstallLauncher", "auto_fullsheet_shown", null, false, 12, null);
                com.moloco.sdk.acm.recorder.a aVar = kVar.f48994f;
                if (aVar != null) {
                    aVar.b(new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.R.c()).e(com.moloco.sdk.internal.client_metrics_data.d.f45971d.c(), "auto_fullsheet_shown"));
                }
            } else {
                if (!tn.p.f(nVar, n.b.f49021a)) {
                    throw new NoWhenBranchMatchedException();
                }
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "InlineInstallLauncher", "auto_fallback_shown", null, false, 12, null);
                com.moloco.sdk.acm.recorder.a aVar2 = kVar.f48994f;
                if (aVar2 != null) {
                    aVar2.b(new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.R.c()).e(com.moloco.sdk.internal.client_metrics_data.d.f45971d.c(), "auto_fallback_shown"));
                }
            }
        }
        return bn.r.f5635a;
    }

    public static final bn.r d(sn.l lVar, n nVar) {
        tn.p.k(nVar, K5.f29723b);
        lVar.invoke(nVar);
        return bn.r.f5635a;
    }

    public static final bn.r g(k kVar, n nVar) {
        tn.p.k(nVar, K5.f29723b);
        if (tn.p.f(nVar, n.c.f49022a)) {
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            MolocoLogger.info$default(molocoLogger, "InlineInstallLauncher", "click_inline_halfsheet_shown", null, false, 12, null);
            com.moloco.sdk.acm.recorder.a aVar = kVar.f48994f;
            if (aVar != null) {
                aVar.b(new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.R.c()).e(com.moloco.sdk.internal.client_metrics_data.d.f45971d.c(), "click_inline_halfsheet_shown"));
            }
            if (kVar.f48995g.compareAndSet(false, true)) {
                String strB = kVar.f48992d.b();
                if (strB != null) {
                    b.i.f47671a.c().a(strB);
                    MolocoLogger.info$default(molocoLogger, "InlineInstallLauncher", "inline_install_success fire this event once: " + strB, null, false, 12, null);
                }
            } else {
                MolocoLogger.info$default(molocoLogger, "InlineInstallLauncher", "inline_install_success already fired", null, false, 12, null);
            }
        } else if (tn.p.f(nVar, n.a.f49020a)) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "InlineInstallLauncher", "click_inline_fullsheet_shown", null, false, 12, null);
            com.moloco.sdk.acm.recorder.a aVar2 = kVar.f48994f;
            if (aVar2 != null) {
                aVar2.b(new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.R.c()).e(com.moloco.sdk.internal.client_metrics_data.d.f45971d.c(), "click_inline_fullsheet_shown"));
            }
        } else {
            if (!tn.p.f(nVar, n.b.f49021a)) {
                throw new NoWhenBranchMatchedException();
            }
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "InlineInstallLauncher", "click_inline_fallback_shown", null, false, 12, null);
            com.moloco.sdk.acm.recorder.a aVar3 = kVar.f48994f;
            if (aVar3 != null) {
                aVar3.b(new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.R.c()).e(com.moloco.sdk.internal.client_metrics_data.d.f45971d.c(), "click_inline_fallback_shown"));
            }
        }
        return bn.r.f5635a;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.g
    public void a(@Nullable String str, @NotNull w0 w0Var) {
        tn.p.k(w0Var, "externalLinkHandler");
        b bVar = this.f48992d;
        if (bVar == null || !bVar.a()) {
            if (str != null) {
                w0Var.a(str);
            }
        } else {
            com.moloco.sdk.acm.recorder.a aVar = this.f48994f;
            if (aVar != null) {
                aVar.b(new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.Q.c()).e(com.moloco.sdk.internal.client_metrics_data.d.f45974g.c(), "android_inline"));
            }
            e(w0Var, str, new sn.l() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.i
                @Override // sn.l
                public final Object invoke(Object obj) {
                    return k.g(this.f48985b, (n) obj);
                }
            });
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.g
    public void b(@Nullable String str, @NotNull w0 w0Var) {
        tn.p.k(w0Var, "externalLinkHandler");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a aVar = this.f48993e;
        if (aVar == null || !aVar.b()) {
            return;
        }
        com.moloco.sdk.acm.recorder.a aVar2 = this.f48994f;
        if (aVar2 != null) {
            aVar2.b(new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.Q.c()).e(com.moloco.sdk.internal.client_metrics_data.d.f45974g.c(), "auto_inline"));
        }
        String strA = this.f48993e.a();
        if (strA != null) {
            str = strA;
        }
        e(w0Var, str, new sn.l() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.h
            @Override // sn.l
            public final Object invoke(Object obj) {
                return k.c(this.f48984b, (n) obj);
            }
        });
        String strC = this.f48993e.c();
        if (strC != null) {
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            MolocoLogger.info$default(molocoLogger, "InlineInstallLauncher", "auto_halfsheet_shown success", null, false, 12, null);
            b.i.f47671a.c().a(strC);
            MolocoLogger.info$default(molocoLogger, "InlineInstallLauncher", "auto_inline_success fire this event once: " + strC, null, false, 12, null);
            com.moloco.sdk.acm.recorder.a aVar3 = this.f48994f;
            if (aVar3 != null) {
                aVar3.b(new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.R.c()).e(com.moloco.sdk.internal.client_metrics_data.d.f45971d.c(), "auto_halfsheet_shown"));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w0 r13, java.lang.String r14, sn.l<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n, bn.r> r15) {
        /*
            r12 = this;
            java.lang.String r0 = r12.f48990b
            r1 = 0
            if (r0 == 0) goto L11
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.c r2 = r12.f48991c
            boolean r0 = r2.a(r0)
            r2 = 1
            if (r0 != r2) goto L11
            java.lang.String r0 = r12.f48990b
            goto L19
        L11:
            if (r14 == 0) goto L1b
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.c r0 = r12.f48991c
            java.lang.String r0 = r0.b(r14)
        L19:
            r3 = r0
            goto L1c
        L1b:
            r3 = r1
        L1c:
            if (r14 == 0) goto L24
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.c r0 = r12.f48991c
            java.lang.String r1 = r0.d(r14)
        L24:
            r4 = r1
            if (r3 == 0) goto L37
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.c r0 = r12.f48991c
            boolean r0 = r0.a(r3)
            if (r0 == 0) goto L37
            r2 = r12
            r5 = r14
            r6 = r13
            r7 = r15
            r2.f(r3, r4, r5, r6, r7)
            return
        L37:
            com.moloco.sdk.internal.MolocoLogger r5 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Store URL found but bundle extraction/validation failed: "
            r0.append(r1)
            r0.append(r14)
            java.lang.String r7 = r0.toString()
            r8 = 0
            r9 = 0
            r10 = 12
            r11 = 0
            java.lang.String r6 = "InlineInstallLauncher"
            com.moloco.sdk.internal.MolocoLogger.warn$default(r5, r6, r7, r8, r9, r10, r11)
            if (r14 == 0) goto L65
            int r0 = r14.length()
            if (r0 != 0) goto L5d
            goto L65
        L5d:
            r13.a(r14)
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n$b r13 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n.b.f49021a
            r15.invoke(r13)
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k.e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w0, java.lang.String, sn.l):void");
    }

    public final void f(String str, String str2, String str3, w0 w0Var, final sn.l<? super n, bn.r> lVar) {
        if (this.f48989a.a(str, str2, new sn.l() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.j
            @Override // sn.l
            public final Object invoke(Object obj) {
                return k.d(lVar, (n) obj);
            }
        }) || str3 == null) {
            return;
        }
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger, "InlineInstallLauncher", "Cannot resolve app install intent", null, false, 12, null);
        MolocoLogger.info$default(molocoLogger, "InlineInstallLauncher", "inline_install_fallback", null, false, 12, null);
        w0Var.a(str3);
        lVar.invoke(n.b.f49021a);
    }
}
