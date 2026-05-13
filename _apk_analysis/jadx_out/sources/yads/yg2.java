package yads;

import android.content.Context;
import android.content.Intent;
import com.safedk.android.utils.Logger;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class yg2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j83 f97132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lv f97133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a1 f97134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final tg2 f97135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final uf0 f97136e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final av f97137f;

    public /* synthetic */ yg2(d4 d4Var, lu2 lu2Var, v9 v9Var, j83 j83Var, lv lvVar) {
        this(j83Var, lvVar, new a1(), new tg2(), new uf0(d4Var, lu2Var, v9Var), new av());
    }

    public yg2(j83 j83Var, lv lvVar, a1 a1Var, tg2 tg2Var, uf0 uf0Var, av avVar) {
        this.f97132a = j83Var;
        this.f97133b = lvVar;
        this.f97134c = a1Var;
        this.f97135d = tg2Var;
        this.f97136e = uf0Var;
        this.f97137f = avVar;
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (intent == null) {
            return;
        }
        context.startActivity(intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0089 -> B:35:0x008c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.content.Context r8, java.util.List r9, hn.c r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof yads.xg2
            if (r0 == 0) goto L13
            r0 = r10
            yads.xg2 r0 = (yads.xg2) r0
            int r1 = r0.f96772h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f96772h = r1
            goto L18
        L13:
            yads.xg2 r0 = new yads.xg2
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f96770f
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f96772h
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            yads.sg2 r8 = r0.f96769e
            java.util.Iterator r9 = r0.f96768d
            android.content.Context r2 = r0.f96767c
            yads.yg2 r5 = r0.f96766b
            kotlin.c.b(r10)
            goto L8c
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            kotlin.c.b(r10)
            android.app.Activity r10 = yads.j1.a()
            if (r10 == 0) goto L45
            r8 = r10
            goto L69
        L45:
            yads.a1 r10 = r7.f97134c
            r10.getClass()
            r10 = 0
            r2 = r8
        L4c:
            boolean r5 = r2 instanceof android.content.ContextWrapper
            if (r5 == 0) goto L65
            int r5 = r10 + 1
            r6 = 10
            if (r10 >= r6) goto L65
            boolean r10 = r2 instanceof android.app.Activity
            if (r10 == 0) goto L5d
            android.app.Activity r2 = (android.app.Activity) r2
            goto L66
        L5d:
            android.content.ContextWrapper r2 = (android.content.ContextWrapper) r2
            android.content.Context r2 = r2.getBaseContext()
            r10 = r5
            goto L4c
        L65:
            r2 = r3
        L66:
            if (r2 == 0) goto L69
            r8 = r2
        L69:
            java.util.Iterator r9 = r9.iterator()
            r5 = r7
            r2 = r8
        L6f:
            boolean r8 = r9.hasNext()
            if (r8 == 0) goto L95
            java.lang.Object r8 = r9.next()
            yads.sg2 r8 = (yads.sg2) r8
            r0.f96766b = r5
            r0.f96767c = r2
            r0.f96768d = r9
            r0.f96769e = r8
            r0.f96772h = r4
            java.lang.Object r10 = r5.a(r2, r8, r0)
            if (r10 != r1) goto L8c
            return r1
        L8c:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L6f
            return r8
        L95:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.yg2.a(android.content.Context, java.util.List, hn.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.content.Context r7, yads.sg2 r8, hn.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof yads.wg2
            if (r0 == 0) goto L13
            r0 = r9
            yads.wg2 r0 = (yads.wg2) r0
            int r1 = r0.f96384g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f96384g = r1
            goto L18
        L13:
            yads.wg2 r0 = new yads.wg2
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f96382e
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f96384g
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            yads.uu r7 = r0.f96381d
            yads.sg2 r8 = r0.f96380c
            yads.yg2 r0 = r0.f96379b
            kotlin.c.b(r9)     // Catch: java.lang.Exception -> L75
            goto L64
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            kotlin.c.b(r9)
            yads.uu r9 = new yads.uu
            r9.<init>(r8)
            yads.tg2 r2 = r6.f97135d     // Catch: java.lang.Exception -> L73
            r2.getClass()     // Catch: java.lang.Exception -> L73
            android.content.Intent r2 = yads.tg2.a(r7, r8)     // Catch: java.lang.Exception -> L73
            yads.bb0 r4 = r8.f94818e     // Catch: java.lang.Exception -> L73
            yads.bb0 r5 = yads.bb0.f87954d     // Catch: java.lang.Exception -> L73
            if (r4 != r5) goto L5f
            yads.uf0 r4 = r6.f97136e     // Catch: java.lang.Exception -> L73
            r0.f96379b = r6     // Catch: java.lang.Exception -> L73
            r0.f96380c = r8     // Catch: java.lang.Exception -> L73
            r0.f96381d = r9     // Catch: java.lang.Exception -> L73
            r0.f96384g = r3     // Catch: java.lang.Exception -> L73
            java.lang.Object r7 = r4.a(r7, r2, r0)     // Catch: java.lang.Exception -> L73
            if (r7 != r1) goto L62
            return r1
        L5f:
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(r7, r2)     // Catch: java.lang.Exception -> L73
        L62:
            r0 = r6
            r7 = r9
        L64:
            yads.j83 r9 = r0.f97132a     // Catch: java.lang.Exception -> L75
            java.util.List r1 = r8.f94819f     // Catch: java.lang.Exception -> L75
            r9.a(r1, r7)     // Catch: java.lang.Exception -> L75
            r0.a(r8, r7, r3)     // Catch: java.lang.Exception -> L75
            java.lang.Boolean r7 = jn.a.a(r3)
            return r7
        L73:
            r0 = r6
            r7 = r9
        L75:
            yads.j83 r9 = r0.f97132a
            java.util.List r1 = r8.f94820g
            r9.a(r1, r7)
            r9 = 0
            r0.a(r8, r7, r9)
            boolean r7 = yads.ad1.f87661a
            java.lang.Boolean r7 = jn.a.a(r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.yg2.a(android.content.Context, yads.sg2, hn.c):java.lang.Object");
    }

    public final void a(sg2 sg2Var, uu uuVar, boolean z10) {
        this.f97137f.getClass();
        String strA = av.a(uuVar);
        Map mapD = cn.p0.d();
        mapD.put("click_url", xa3.a(sg2Var.f94815b));
        mapD.put("deeplink_package_name", sg2Var.f94814a);
        mapD.put("deeplink_success", Boolean.valueOf(z10));
        if (z10) {
            mapD.put("click_destination", strA);
        }
        Map mapC = kotlin.collections.a.C(cn.p0.c(mapD));
        lv lvVar = this.f97133b;
        co2 co2Var = co2.f88553w;
        eo2 eo2VarA = lvVar.a(co2Var, mapC);
        lvVar.f92118d.a(eo2VarA);
        lvVar.f92120f.a(co2Var, eo2VarA.f89340b, bo2.f88105a, null);
    }
}
