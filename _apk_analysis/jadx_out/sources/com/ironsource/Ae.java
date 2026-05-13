package com.ironsource;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.Ae;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class Ae implements Dc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Ae f28740a = new Ae();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final De f28741b = new De();

    public static final class a implements InterfaceC4238re {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4238re f28742a;

        public a(InterfaceC4238re interfaceC4238re) {
            this.f28742a = interfaceC4238re;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C4131le c4131le, InterfaceC4238re interfaceC4238re) {
            tn.p.k(c4131le, "$sdkConfig");
            tn.p.k(interfaceC4238re, "$listener");
            Ae.f28740a.a(c4131le, interfaceC4238re);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(InterfaceC4238re interfaceC4238re, C4169ne c4169ne) {
            tn.p.k(interfaceC4238re, "$listener");
            tn.p.k(c4169ne, "$error");
            interfaceC4238re.a(c4169ne);
        }

        @Override // com.ironsource.InterfaceC4238re
        public void a(@NotNull final C4131le c4131le) {
            tn.p.k(c4131le, "sdkConfig");
            De de2 = Ae.f28741b;
            final InterfaceC4238re interfaceC4238re = this.f28742a;
            de2.a(new Runnable() { // from class: com.ironsource.rh
                @Override // java.lang.Runnable
                public final void run() {
                    Ae.a.a(c4131le, interfaceC4238re);
                }
            });
        }

        @Override // com.ironsource.InterfaceC4238re
        public void a(@NotNull final C4169ne c4169ne) {
            tn.p.k(c4169ne, "error");
            De de2 = Ae.f28741b;
            final InterfaceC4238re interfaceC4238re = this.f28742a;
            de2.d(new Runnable() { // from class: com.ironsource.qh
                @Override // java.lang.Runnable
                public final void run() {
                    Ae.a.a(interfaceC4238re, c4169ne);
                }
            });
        }
    }

    private Ae() {
    }

    private final void a(Context context, C4272te c4272te, final InterfaceC4238re interfaceC4238re, boolean z10) {
        String strF = c4272te.f();
        if (strF == null || strF.length() <= 0) {
            c4272te = new C4272te(c4272te.d(), com.ironsource.mediationsdk.r.m().o(), cn.f0.j1(c4272te.e()));
        } else {
            com.ironsource.mediationsdk.r.m().o(c4272te.f());
        }
        com.ironsource.mediationsdk.r rVarM = com.ironsource.mediationsdk.r.m();
        String strD = c4272te.d();
        IronSource.a[] aVarArr = (IronSource.a[]) c4272te.e().toArray(new IronSource.a[0]);
        final IronSourceError ironSourceErrorA = rVarM.a(context, strD, z10, this, (IronSource.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
        if (ironSourceErrorA == null || ironSourceErrorA.getErrorCode() == 2020) {
            C4374ze.f34531a.a(context, c4272te, new a(interfaceC4238re));
            return;
        }
        if (ironSourceErrorA.getErrorCode() == 2040) {
            Ne neH = com.ironsource.mediationsdk.r.m().h();
            if (neH != null) {
                a(new C4131le(new C4289ue(neH)), interfaceC4238re);
                return;
            }
        } else if (ironSourceErrorA.getErrorCode() == 2030) {
            C4374ze.f34531a.e();
            return;
        }
        f28741b.d(new Runnable() { // from class: com.ironsource.nh
            @Override // java.lang.Runnable
            public final void run() {
                Ae.a(interfaceC4238re, ironSourceErrorA);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final C4131le c4131le, final InterfaceC4238re interfaceC4238re) {
        if (com.ironsource.mediationsdk.r.m().a(false, c4131le.d())) {
            f28741b.d(new Runnable() { // from class: com.ironsource.ph
                @Override // java.lang.Runnable
                public final void run() {
                    Ae.a(interfaceC4238re, c4131le);
                }
            });
        } else {
            f28741b.d(new Runnable() { // from class: com.ironsource.oh
                @Override // java.lang.Runnable
                public final void run() {
                    Ae.a(interfaceC4238re);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(IronSourceError ironSourceError) {
        tn.p.k(ironSourceError, "$error");
        C4374ze.f34531a.b(new C4169ne(ironSourceError));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC4238re interfaceC4238re) {
        tn.p.k(interfaceC4238re, "$listener");
        interfaceC4238re.a(new C4169ne(IronSourceError.ERROR_LEGACY_INIT_POST_FAILED, "An unknown error has occurred"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC4238re interfaceC4238re, C4131le c4131le) {
        tn.p.k(interfaceC4238re, "$listener");
        tn.p.k(c4131le, "$sdkInitResponse");
        interfaceC4238re.a(c4131le);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC4238re interfaceC4238re, IronSourceError ironSourceError) {
        tn.p.k(interfaceC4238re, "$listener");
        tn.p.j(ironSourceError, "error");
        interfaceC4238re.a(new C4169ne(ironSourceError));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Context context, C4272te c4272te, InterfaceC4238re interfaceC4238re) {
        tn.p.k(context, "$context");
        tn.p.k(c4272te, "$initRequest");
        tn.p.k(interfaceC4238re, "$listener");
        new X9().a(EnumC4255se.LEVEL_PLAY_INIT);
        f28740a.a(context, c4272te, interfaceC4238re, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Ne ne2) {
        tn.p.k(ne2, "$serverResponse");
        C4374ze.f34531a.a(new C4289ue(ne2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Context context, C4272te c4272te, InterfaceC4238re interfaceC4238re) {
        tn.p.k(context, "$context");
        tn.p.k(c4272te, "$initRequest");
        tn.p.k(interfaceC4238re, "$listener");
        com.ironsource.mediationsdk.r rVarM = com.ironsource.mediationsdk.r.m();
        String strD = c4272te.d();
        IronSource.a[] aVarArr = (IronSource.a[]) c4272te.e().toArray(new IronSource.a[0]);
        List<IronSource.a> listA = rVarM.a(context, strD, false, (IronSource.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
        tn.p.j(listA, "validAdUnitsList");
        c4272te.a(listA);
        new X9().a(EnumC4255se.EXTERNAL_MEDIATION_INIT);
        f28740a.a(context, c4272te, interfaceC4238re, true);
    }

    public final void a(@NotNull final Context context, @NotNull final C4272te c4272te, @NotNull final InterfaceC4238re interfaceC4238re) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(c4272te, "initRequest");
        tn.p.k(interfaceC4238re, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        f28741b.c(new Runnable() { // from class: com.ironsource.jh
            @Override // java.lang.Runnable
            public final void run() {
                Ae.b(context, c4272te, interfaceC4238re);
            }
        });
    }

    @Override // com.ironsource.Dc
    public void a(@NotNull final Ne ne2) {
        tn.p.k(ne2, "serverResponse");
        f28741b.a(new Runnable() { // from class: com.ironsource.kh
            @Override // java.lang.Runnable
            public final void run() {
                Ae.b(ne2);
            }
        });
    }

    public final void c(@NotNull final Context context, @NotNull final C4272te c4272te, @NotNull final InterfaceC4238re interfaceC4238re) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(c4272te, "initRequest");
        tn.p.k(interfaceC4238re, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        f28741b.c(new Runnable() { // from class: com.ironsource.lh
            @Override // java.lang.Runnable
            public final void run() {
                Ae.d(context, c4272te, interfaceC4238re);
            }
        });
    }

    @Override // com.ironsource.Dc
    public void onInitFailed(@NotNull final IronSourceError ironSourceError) {
        tn.p.k(ironSourceError, "error");
        f28741b.a(new Runnable() { // from class: com.ironsource.mh
            @Override // java.lang.Runnable
            public final void run() {
                Ae.a(ironSourceError);
            }
        });
    }
}
