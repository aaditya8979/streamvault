package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import androidx.activity.result.ActivityResultLauncher;
import androidx.compose.runtime.internal.StabilityInferred;
import co.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import p000do.s0;

/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 0)
public final class m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f49003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ActivityResultLauncher<Intent> f49004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final l0 f49005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final go.d<Boolean> f49006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f49007e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final sn.q<String, String, String, Intent> f49008f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final sn.p<PackageManager, Intent, Boolean> f49009g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public a f49010h;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f49011a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final sn.l<n, bn.r> f49012b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final kotlinx.coroutines.g f49013c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final kotlinx.coroutines.g f49014d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(boolean z10, @NotNull sn.l<? super n, bn.r> lVar, @NotNull kotlinx.coroutines.g gVar, @NotNull kotlinx.coroutines.g gVar2) {
            tn.p.k(lVar, "onOutcome");
            tn.p.k(gVar, "timeoutJob");
            tn.p.k(gVar2, "fgJob");
            this.f49011a = z10;
            this.f49012b = lVar;
            this.f49013c = gVar;
            this.f49014d = gVar2;
        }

        public final void a(boolean z10) {
            this.f49011a = z10;
        }

        public final boolean b() {
            return this.f49011a;
        }

        @NotNull
        public final kotlinx.coroutines.g c() {
            return this.f49014d;
        }

        @NotNull
        public final sn.l<n, bn.r> d() {
            return this.f49012b;
        }

        @NotNull
        public final kotlinx.coroutines.g e() {
            return this.f49013c;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f49011a == aVar.f49011a && tn.p.f(this.f49012b, aVar.f49012b) && tn.p.f(this.f49013c, aVar.f49013c) && tn.p.f(this.f49014d, aVar.f49014d);
        }

        public int hashCode() {
            return (((((Boolean.hashCode(this.f49011a) * 31) + this.f49012b.hashCode()) * 31) + this.f49013c.hashCode()) * 31) + this.f49014d.hashCode();
        }

        @NotNull
        public String toString() {
            return "LaunchState(backgroundedSinceLaunch=" + this.f49011a + ", onOutcome=" + this.f49012b + ", timeoutJob=" + this.f49013c + ", fgJob=" + this.f49014d + ')';
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.StoreLauncherImpl$launch$fgJob$1", f = "StoreLauncher.kt", l = {88}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements sn.p<l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49015a;

        public static final class a<T> implements go.e {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f49017b;

            public a(m mVar) {
                this.f49017b = mVar;
            }

            public final Object a(boolean z10, hn.c<? super bn.r> cVar) {
                a aVar;
                if (!z10 && (aVar = this.f49017b.f49010h) != null) {
                    aVar.a(true);
                }
                return bn.r.f5635a;
            }

            @Override // go.e
            public /* bridge */ /* synthetic */ Object emit(Object obj, hn.c cVar) {
                return a(((Boolean) obj).booleanValue(), cVar);
            }
        }

        public b(hn.c<? super b> cVar) {
            super(2, cVar);
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((b) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return m.this.new b(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f49015a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                go.d dVar = m.this.f49006d;
                a aVar = new a(m.this);
                this.f49015a = 1;
                if (dVar.collect(aVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return bn.r.f5635a;
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.StoreLauncherImpl$launch$timeoutJob$1", f = "StoreLauncher.kt", l = {93}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements sn.p<l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49018a;

        public c(hn.c<? super c> cVar) {
            super(2, cVar);
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((c) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return m.this.new c(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f49018a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                long j10 = m.this.f49007e;
                this.f49018a = 1;
                if (s0.b(j10, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            m.this.cancel();
            return bn.r.f5635a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(Context context, ActivityResultLauncher<Intent> activityResultLauncher, l0 l0Var, go.d<Boolean> dVar, long j10, sn.q<? super String, ? super String, ? super String, ? extends Intent> qVar, sn.p<? super PackageManager, ? super Intent, Boolean> pVar) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(activityResultLauncher, "installLauncher");
        tn.p.k(l0Var, "scope");
        tn.p.k(dVar, "foregroundFlow");
        tn.p.k(qVar, "intentFactory");
        tn.p.k(pVar, "canResolve");
        this.f49003a = context;
        this.f49004b = activityResultLauncher;
        this.f49005c = l0Var;
        this.f49006d = dVar;
        this.f49007e = j10;
        this.f49008f = qVar;
        this.f49009g = pVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ m(Context context, ActivityResultLauncher activityResultLauncher, l0 l0Var, go.d dVar, long j10, sn.q qVar, sn.p pVar, int i10, tn.i iVar) {
        long jS;
        if ((i10 & 16) != 0) {
            b.a aVar = co.b.f6773c;
            jS = co.d.s(60, DurationUnit.SECONDS);
        } else {
            jS = j10;
        }
        this(context, activityResultLauncher, l0Var, dVar, jS, (i10 & 32) != 0 ? new sn.q() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.q
            @Override // sn.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return m.b((String) obj, (String) obj2, (String) obj3);
            }
        } : qVar, (i10 & 64) != 0 ? new sn.p() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.r
            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public final Object mo2invoke(Object obj, Object obj2) {
                return Boolean.valueOf(m.d((PackageManager) obj, (Intent) obj2));
            }
        } : pVar, null);
    }

    public /* synthetic */ m(Context context, ActivityResultLauncher activityResultLauncher, l0 l0Var, go.d dVar, long j10, sn.q qVar, sn.p pVar, tn.i iVar) {
        this(context, activityResultLauncher, l0Var, dVar, j10, qVar, pVar);
    }

    public static final Intent b(String str, String str2, String str3) {
        tn.p.k(str, "bundleId");
        tn.p.k(str3, "caller");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage("com.android.vending");
        String str4 = "https://play.google.com/d?id=" + str;
        if (str2 != null) {
            str4 = str4 + "&referrer=" + str2;
        }
        Uri uri = Uri.parse(str4);
        tn.p.j(uri, "parse(this)");
        intent.setData(uri);
        intent.putExtra("overlay", true);
        intent.putExtra("callerId", str3);
        return intent;
    }

    public static final boolean d(PackageManager packageManager, Intent intent) {
        tn.p.k(packageManager, "pm");
        tn.p.k(intent, "i");
        return intent.resolveActivity(packageManager) != null;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.p
    public void a(int i10) {
        a aVar = this.f49010h;
        if (aVar == null) {
            return;
        }
        g.a.a(aVar.e(), null, 1, null);
        g.a.a(aVar.c(), null, 1, null);
        aVar.d().invoke(aVar.b() ? n.a.f49020a : n.c.f49022a);
        this.f49010h = null;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.p
    public boolean a(@NotNull String str, @Nullable String str2, @NotNull sn.l<? super n, bn.r> lVar) {
        tn.p.k(str, "bundleId");
        tn.p.k(lVar, "onOutcome");
        cancel();
        sn.q<String, String, String, Intent> qVar = this.f49008f;
        String packageName = this.f49003a.getPackageName();
        tn.p.j(packageName, "getPackageName(...)");
        Intent intentInvoke = qVar.invoke(str, str2, packageName);
        sn.p<PackageManager, Intent, Boolean> pVar = this.f49009g;
        PackageManager packageManager = this.f49003a.getPackageManager();
        tn.p.j(packageManager, "getPackageManager(...)");
        if (!pVar.mo2invoke(packageManager, intentInvoke).booleanValue()) {
            return false;
        }
        this.f49010h = new a(false, lVar, p000do.i.d(this.f49005c, null, null, new c(null), 3, null), p000do.i.d(this.f49005c, null, null, new b(null), 3, null));
        this.f49004b.launch(intentInvoke);
        return true;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.p
    public void cancel() {
        kotlinx.coroutines.g gVarC;
        kotlinx.coroutines.g gVarE;
        a aVar = this.f49010h;
        if (aVar != null && (gVarE = aVar.e()) != null) {
            g.a.a(gVarE, null, 1, null);
        }
        a aVar2 = this.f49010h;
        if (aVar2 != null && (gVarC = aVar2.c()) != null) {
            g.a.a(gVarC, null, 1, null);
        }
        this.f49010h = null;
    }
}
