package com.moloco.sdk.internal.services.events;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.UserIntent$UserAdInteractionExt;
import com.moloco.sdk.internal.services.a;
import com.moloco.sdk.internal.services.f;
import com.moloco.sdk.internal.services.i0;
import com.moloco.sdk.internal.services.j0;
import com.moloco.sdk.internal.services.p;
import com.moloco.sdk.internal.services.w;
import com.moloco.sdk.internal.services.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@StabilityInferred(parameters = 1)
public final class a implements com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final x f47382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.services.b f47383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final j0 f47384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final f f47385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.services.usertracker.e f47386e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final p f47387f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.services.proto.a f47388g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b f47389h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final String f47390i;

    /* JADX INFO: renamed from: com.moloco.sdk.internal.services.events.a$a, reason: collision with other inner class name */
    @jn.d(c = "com.moloco.sdk.internal.services.events.CustomUserEventBuilderServiceImpl", f = "CustomUserEventBuilderServiceImpl.kt", l = {67}, m = "userAdInteractionExt")
    public static final class C0583a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f47391a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f47392b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f47393c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f47394d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f47395e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f47396f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f47397g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f47399i;

        public C0583a(hn.c<? super C0583a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f47397g = obj;
            this.f47399i |= Integer.MIN_VALUE;
            return a.this.g(0L, null, this);
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.services.events.CustomUserEventBuilderServiceImpl", f = "CustomUserEventBuilderServiceImpl.kt", l = {52}, m = "userAdInteractionExtAsQueryParameter")
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f47400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f47401b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f47403d;

        public b(hn.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f47401b = obj;
            this.f47403d |= Integer.MIN_VALUE;
            return a.this.a(0L, null, null, this);
        }
    }

    public a(@NotNull x xVar, @NotNull com.moloco.sdk.internal.services.b bVar, @NotNull j0 j0Var, @NotNull f fVar, @NotNull com.moloco.sdk.internal.services.usertracker.e eVar, @NotNull p pVar, @NotNull com.moloco.sdk.internal.services.proto.a aVar, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b bVar2, @NotNull String str) {
        tn.p.k(xVar, "appInfoService");
        tn.p.k(bVar, "networkInfoService");
        tn.p.k(j0Var, "deviceInfoService");
        tn.p.k(fVar, "screenInfoService");
        tn.p.k(eVar, "userIdentifierService");
        tn.p.k(pVar, "adDataService");
        tn.p.k(aVar, "encoderService");
        tn.p.k(bVar2, "userEventConfigService");
        tn.p.k(str, "sdkVersion");
        this.f47382a = xVar;
        this.f47383b = bVar;
        this.f47384c = j0Var;
        this.f47385d = fVar;
        this.f47386e = eVar;
        this.f47387f = pVar;
        this.f47388g = aVar;
        this.f47389h = bVar2;
        this.f47390i = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(long r11, @org.jetbrains.annotations.NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0696a r13, @org.jetbrains.annotations.NotNull java.lang.String r14, @org.jetbrains.annotations.NotNull hn.c<? super java.lang.String> r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof com.moloco.sdk.internal.services.events.a.b
            if (r0 == 0) goto L13
            r0 = r15
            com.moloco.sdk.internal.services.events.a$b r0 = (com.moloco.sdk.internal.services.events.a.b) r0
            int r1 = r0.f47403d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f47403d = r1
            goto L18
        L13:
            com.moloco.sdk.internal.services.events.a$b r0 = new com.moloco.sdk.internal.services.events.a$b
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f47401b
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f47403d
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r11 = r0.f47400a
            r14 = r11
            java.lang.String r14 = (java.lang.String) r14
            kotlin.c.b(r15)
            goto L59
        L2e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L36:
            kotlin.c.b(r15)
            com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b r15 = r10.f47389h
            boolean r15 = r15.c()
            if (r15 != 0) goto L4e
            com.moloco.sdk.internal.MolocoLogger r4 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            r7 = 0
            r8 = 4
            r9 = 0
            java.lang.String r5 = "CustomUserEventBuilderServiceImpl"
            java.lang.String r6 = "Event reporting config disabled, UserAdInteractionExt not reporting"
            com.moloco.sdk.internal.MolocoLogger.debug$default(r4, r5, r6, r7, r8, r9)
            return r14
        L4e:
            r0.f47400a = r14
            r0.f47403d = r3
            java.lang.Object r15 = r10.g(r11, r13, r0)
            if (r15 != r1) goto L59
            return r1
        L59:
            java.lang.String r15 = (java.lang.String) r15
            android.net.Uri r11 = android.net.Uri.parse(r14)
            android.net.Uri$Builder r11 = r11.buildUpon()
            java.lang.String r12 = "user_ad_interaction_ext"
            android.net.Uri$Builder r11 = r11.appendQueryParameter(r12, r15)
            android.net.Uri r11 = r11.build()
            java.lang.String r11 = r11.toString()
            java.lang.String r12 = "toString(...)"
            tn.p.j(r11, r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.events.a.a(long, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$a, java.lang.String, hn.c):java.lang.Object");
    }

    public final UserIntent$UserAdInteractionExt.d b(UserIntent$UserAdInteractionExt.d dVar) {
        UserIntent$UserAdInteractionExt.h.a aVarC = UserIntent$UserAdInteractionExt.h.c();
        aVarC.a(this.f47390i);
        dVar.k(aVarC.build());
        return dVar;
    }

    public final UserIntent$UserAdInteractionExt.d c(UserIntent$UserAdInteractionExt.d dVar, com.moloco.sdk.internal.services.a aVar) {
        UserIntent$UserAdInteractionExt.Network.a aVarD = UserIntent$UserAdInteractionExt.Network.d();
        if (aVar instanceof a.C0580a) {
            aVarD.b(UserIntent$UserAdInteractionExt.Network.ConnectionType.CELLULAR);
            aVarD.a(((a.C0580a) aVar).a());
        } else if (tn.p.f(aVar, a.b.f47111a)) {
            aVarD.b(UserIntent$UserAdInteractionExt.Network.ConnectionType.UNKNOWN);
        } else {
            if (!tn.p.f(aVar, a.c.f47112a)) {
                throw new NoWhenBranchMatchedException();
            }
            aVarD.b(UserIntent$UserAdInteractionExt.Network.ConnectionType.WIFI);
        }
        dVar.j(aVarD.build());
        return dVar;
    }

    public final UserIntent$UserAdInteractionExt.d d(UserIntent$UserAdInteractionExt.d dVar, w wVar) {
        UserIntent$UserAdInteractionExt.a.C0550a c0550aD = UserIntent$UserAdInteractionExt.a.d();
        c0550aD.a(wVar.a());
        c0550aD.b(wVar.b());
        dVar.b(c0550aD.build());
        return dVar;
    }

    public final UserIntent$UserAdInteractionExt.d e(UserIntent$UserAdInteractionExt.d dVar, i0 i0Var) {
        UserIntent$UserAdInteractionExt.Device.a aVarF = UserIntent$UserAdInteractionExt.Device.f();
        aVarF.c(i0Var.j());
        aVarF.a(i0Var.h());
        aVarF.b(UserIntent$UserAdInteractionExt.Device.OsType.ANDROID);
        aVarF.d(i0Var.k());
        dVar.g(aVarF.build());
        return dVar;
    }

    public final UserIntent$UserAdInteractionExt.d f(UserIntent$UserAdInteractionExt.d dVar, a.AbstractC0696a abstractC0696a, com.moloco.sdk.internal.services.e eVar) {
        if (abstractC0696a instanceof a.AbstractC0696a.e) {
            dVar.h(UserIntent$UserAdInteractionExt.g.b().build());
        } else if (abstractC0696a instanceof a.AbstractC0696a.d) {
            UserIntent$UserAdInteractionExt.f.a aVarI = UserIntent$UserAdInteractionExt.f.i();
            a.AbstractC0696a.d dVar2 = (a.AbstractC0696a.d) abstractC0696a;
            aVarI.b(com.moloco.sdk.internal.services.events.b.b(dVar2.b()));
            aVarI.c(com.moloco.sdk.internal.services.events.b.c(eVar));
            a.AbstractC0696a.g gVarD = dVar2.d();
            if (gVarD != null) {
                aVarI.e(com.moloco.sdk.internal.services.events.b.d(gVarD));
            }
            a.AbstractC0696a.f fVarC = dVar2.c();
            if (fVarC != null) {
                aVarI.d(com.moloco.sdk.internal.services.events.b.b(fVarC));
            }
            List<a.AbstractC0696a.c> listA = dVar2.a();
            ArrayList arrayList = new ArrayList(cn.x.x(listA, 10));
            for (a.AbstractC0696a.c cVar : listA) {
                UserIntent$UserAdInteractionExt.Button.a aVarE = UserIntent$UserAdInteractionExt.Button.e();
                aVarE.c(com.moloco.sdk.internal.services.events.b.a(cVar.c()));
                aVarE.a(com.moloco.sdk.internal.services.events.b.b(cVar.d()));
                aVarE.b(com.moloco.sdk.internal.services.events.b.d(cVar.e()));
                arrayList.add(aVarE.build());
            }
            aVarI.a(arrayList);
            dVar.e((UserIntent$UserAdInteractionExt.f) aVarI.build());
        } else if (abstractC0696a instanceof a.AbstractC0696a.b) {
            UserIntent$UserAdInteractionExt.c.a aVarC = UserIntent$UserAdInteractionExt.c.c();
            aVarC.a(((a.AbstractC0696a.b) abstractC0696a).a());
            dVar.d(aVarC.build());
        } else {
            if (!(abstractC0696a instanceof a.AbstractC0696a.C0697a)) {
                throw new NoWhenBranchMatchedException();
            }
            dVar.c(UserIntent$UserAdInteractionExt.b.b().build());
        }
        return dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(long r8, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0696a r10, hn.c<? super java.lang.String> r11) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.events.a.g(long, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$a, hn.c):java.lang.Object");
    }
}
