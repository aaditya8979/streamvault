package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.C4228r4;
import com.ironsource.InterfaceC4027g;
import com.ironsource.InterfaceC4045h;
import com.ironsource.Rc;
import com.ironsource.Sc;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.ironsource.sdk.controller.k;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public interface p {

    public static final class a implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private b f33823a;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@NotNull String str, @NotNull Sc sc2) {
            this(str, sc2, new k.c(), new k.a());
            tn.p.k(str, "method");
            tn.p.k(sc2, "openUrlConfigurations");
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull com.ironsource.Sc r4, @org.jetbrains.annotations.NotNull com.ironsource.InterfaceC4045h r5, @org.jetbrains.annotations.NotNull com.ironsource.InterfaceC4027g r6) {
            /*
                r2 = this;
                java.lang.String r0 = "method"
                tn.p.k(r3, r0)
                java.lang.String r0 = "openUrlConfigurations"
                tn.p.k(r4, r0)
                java.lang.String r0 = "activityIntentFactory"
                tn.p.k(r5, r0)
                java.lang.String r0 = "actionIntentFactory"
                tn.p.k(r6, r0)
                r2.<init>()
                int r0 = r3.hashCode()
                r1 = -1455867212(0xffffffffa9393ab4, float:-4.112917E-14)
                if (r0 == r1) goto L4a
                r6 = 109770977(0x68af8e1, float:5.2275525E-35)
                if (r0 == r6) goto L3b
                r6 = 1224424441(0x48fb3bf9, float:514527.78)
                if (r0 == r6) goto L2b
                goto L58
            L2b:
                java.lang.String r6 = "webview"
                boolean r6 = r3.equals(r6)
                if (r6 != 0) goto L35
                goto L58
            L35:
                com.ironsource.sdk.controller.p$b$d r3 = new com.ironsource.sdk.controller.p$b$d
                r3.<init>(r4, r5)
                goto L5e
            L3b:
                java.lang.String r6 = "store"
                boolean r6 = r3.equals(r6)
                if (r6 != 0) goto L44
                goto L58
            L44:
                com.ironsource.sdk.controller.p$b$c r3 = new com.ironsource.sdk.controller.p$b$c
                r3.<init>(r4, r5)
                goto L5e
            L4a:
                java.lang.String r5 = "external_browser"
                boolean r5 = r3.equals(r5)
                if (r5 == 0) goto L58
                com.ironsource.sdk.controller.p$b$a r3 = new com.ironsource.sdk.controller.p$b$a
                r3.<init>(r4, r6)
                goto L5e
            L58:
                com.ironsource.sdk.controller.p$b$b r4 = new com.ironsource.sdk.controller.p$b$b
                r4.<init>(r3)
                r3 = r4
            L5e:
                r2.f33823a = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.p.a.<init>(java.lang.String, com.ironsource.Sc, com.ironsource.h, com.ironsource.g):void");
        }

        @Override // com.ironsource.sdk.controller.p
        @NotNull
        public c a(@NotNull Context context, @NotNull Rc rc2) {
            tn.p.k(context, GAMConfig.KEY_CONTEXT);
            tn.p.k(rc2, "openUrl");
            try {
                return this.f33823a.a(context, rc2);
            } catch (Exception e10) {
                C4228r4.d().a(e10);
                String message = e10.getMessage();
                String message2 = (message == null || message.length() == 0) ? "" : e10.getMessage();
                tn.p.h(message2);
                return new c.a(message2);
            }
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            private final Sc f33824a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            private final InterfaceC4027g f33825b;

            public a(@NotNull Sc sc2, @NotNull InterfaceC4027g interfaceC4027g) {
                tn.p.k(sc2, "configurations");
                tn.p.k(interfaceC4027g, "intentFactory");
                this.f33824a = sc2;
                this.f33825b = interfaceC4027g;
            }

            public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
                Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
                if (intent == null) {
                    return;
                }
                BrandSafetyUtils.detectAdClick(intent, com.safedk.android.utils.g.f53132f);
                context.startActivity(intent);
            }

            @Override // com.ironsource.sdk.controller.p.b
            @NotNull
            public c a(@NotNull Context context, @NotNull Rc rc2) {
                tn.p.k(context, GAMConfig.KEY_CONTEXT);
                tn.p.k(rc2, "openUrl");
                if (TextUtils.isEmpty(rc2.d())) {
                    return new c.a("url is empty");
                }
                Intent intentA = this.f33825b.a();
                intentA.setData(Uri.parse(rc2.d()));
                String strC = rc2.c();
                if (strC != null && strC.length() != 0) {
                    intentA = intentA.setPackage(rc2.c());
                    tn.p.j(intentA, "this.setPackage(openUrl.packageName)");
                }
                if (!(context instanceof Activity)) {
                    intentA = intentA.addFlags(this.f33824a.c());
                }
                tn.p.j(intentA, "intentFactory\n          …ations.flags) else this }");
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intentA);
                return c.b.f33832a;
            }
        }

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.p$b$b, reason: collision with other inner class name */
        public static final class C0402b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            private final String f33826a;

            public C0402b(@NotNull String str) {
                tn.p.k(str, "method");
                this.f33826a = str;
            }

            @Override // com.ironsource.sdk.controller.p.b
            @NotNull
            public c a(@NotNull Context context, @NotNull Rc rc2) {
                tn.p.k(context, GAMConfig.KEY_CONTEXT);
                tn.p.k(rc2, "openUrl");
                return new c.a("method " + this.f33826a + " is unsupported");
            }
        }

        public static final class c implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            private final Sc f33827a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            private final InterfaceC4045h f33828b;

            public c(@NotNull Sc sc2, @NotNull InterfaceC4045h interfaceC4045h) {
                tn.p.k(sc2, "configurations");
                tn.p.k(interfaceC4045h, "intentFactory");
                this.f33827a = sc2;
                this.f33828b = interfaceC4045h;
            }

            public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
                Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
                if (intent == null) {
                    return;
                }
                BrandSafetyUtils.detectAdClick(intent, com.safedk.android.utils.g.f53132f);
                context.startActivity(intent);
            }

            @Override // com.ironsource.sdk.controller.p.b
            @NotNull
            public c a(@NotNull Context context, @NotNull Rc rc2) {
                tn.p.k(context, GAMConfig.KEY_CONTEXT);
                tn.p.k(rc2, "openUrl");
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, new OpenUrlActivity.e(this.f33828b).a(this.f33827a.c()).a(rc2.d()).b(true).c(true).a(context));
                return c.b.f33832a;
            }
        }

        public static final class d implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            private final Sc f33829a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            private final InterfaceC4045h f33830b;

            public d(@NotNull Sc sc2, @NotNull InterfaceC4045h interfaceC4045h) {
                tn.p.k(sc2, "configurations");
                tn.p.k(interfaceC4045h, "intentFactory");
                this.f33829a = sc2;
                this.f33830b = interfaceC4045h;
            }

            public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
                Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
                if (intent == null) {
                    return;
                }
                BrandSafetyUtils.detectAdClick(intent, com.safedk.android.utils.g.f53132f);
                context.startActivity(intent);
            }

            @Override // com.ironsource.sdk.controller.p.b
            @NotNull
            public c a(@NotNull Context context, @NotNull Rc rc2) {
                tn.p.k(context, GAMConfig.KEY_CONTEXT);
                tn.p.k(rc2, "openUrl");
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, new OpenUrlActivity.e(this.f33830b).a(this.f33829a.c()).a(rc2.d()).a(this.f33829a.d()).b(true).a(context));
                return c.b.f33832a;
            }
        }

        @NotNull
        c a(@NotNull Context context, @NotNull Rc rc2);
    }

    public static abstract class c {

        public static final class a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            private final String f33831a;

            /* JADX WARN: Multi-variable type inference failed */
            public a() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull String str) {
                super(null);
                tn.p.k(str, "errorMessage");
                this.f33831a = str;
            }

            public /* synthetic */ a(String str, int i10, tn.i iVar) {
                this((i10 & 1) != 0 ? "" : str);
            }

            public static /* synthetic */ a a(a aVar, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = aVar.f33831a;
                }
                return aVar.a(str);
            }

            @NotNull
            public final a a(@NotNull String str) {
                tn.p.k(str, "errorMessage");
                return new a(str);
            }

            @NotNull
            public final String a() {
                return this.f33831a;
            }

            @NotNull
            public final String b() {
                return this.f33831a;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && tn.p.f(this.f33831a, ((a) obj).f33831a);
            }

            public int hashCode() {
                return this.f33831a.hashCode();
            }

            @NotNull
            public String toString() {
                return "Error(errorMessage=" + this.f33831a + ")";
            }
        }

        public static final class b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f33832a = new b();

            private b() {
                super(null);
            }
        }

        private c() {
        }

        public /* synthetic */ c(tn.i iVar) {
            this();
        }
    }

    @NotNull
    c a(@NotNull Context context, @NotNull Rc rc2);
}
