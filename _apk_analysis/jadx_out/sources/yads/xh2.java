package yads;

import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class xh2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nv f96778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mv f96779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ro1 f96780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mh2 f96781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final nh2 f96782e;

    public xh2(nv nvVar, mv mvVar, ro1 ro1Var, mh2 mh2Var, nh2 nh2Var) {
        this.f96778a = nvVar;
        this.f96779b = mvVar;
        this.f96780c = ro1Var;
        this.f96781d = mh2Var;
        this.f96782e = nh2Var;
    }

    public /* synthetic */ xh2(xo1 xo1Var, nv nvVar) {
        this(nvVar, new mv(), new ro1(xo1Var), new mh2(), new nh2());
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(long r14, android.content.Context r16, yads.e00 r17, yads.a03 r18, yads.xh2 r19, java.util.List r20, hn.c r21) {
        /*
            r0 = r21
            r19.getClass()
            boolean r1 = r0 instanceof yads.uh2
            if (r1 == 0) goto L1a
            r1 = r0
            yads.uh2 r1 = (yads.uh2) r1
            int r2 = r1.f95649d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L1a
            int r2 = r2 - r3
            r1.f95649d = r2
            r8 = r19
            goto L21
        L1a:
            yads.uh2 r1 = new yads.uh2
            r8 = r19
            r1.<init>(r8, r0)
        L21:
            java.lang.Object r0 = r1.f95647b
            java.lang.Object r11 = in.a.g()
            int r2 = r1.f95649d
            r12 = 2
            r13 = 1
            if (r2 == 0) goto L41
            if (r2 == r13) goto L3d
            if (r2 != r12) goto L35
            kotlin.c.b(r0)
            goto L8a
        L35:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3d:
            kotlin.c.b(r0)
            goto L75
        L41:
            kotlin.c.b(r0)
            boolean r0 = r20.isEmpty()
            if (r0 == 0) goto L5a
            yads.zg2 r0 = yads.zg2.f97568d
            yads.ih2 r0 = yads.jq1.a()
            yads.dh2 r11 = new yads.dh2
            java.util.List r0 = cn.v.e(r0)
            r11.<init>(r0)
            goto La7
        L5a:
            yads.vh2 r0 = new yads.vh2
            r10 = 0
            r2 = r0
            r3 = r14
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r2.<init>(r3, r5, r6, r7, r8, r9, r10)
            r1.f95649d = r13
            java.lang.Object r0 = kotlinx.coroutines.d.f(r0, r1)
            if (r0 != r11) goto L75
            goto La7
        L75:
            java.util.List r0 = (java.util.List) r0
            do.h0 r2 = p000do.w0.b()
            yads.wh2 r3 = new yads.wh2
            r4 = 0
            r3.<init>(r0, r4)
            r1.f95649d = r12
            java.lang.Object r0 = p000do.g.g(r2, r3, r1)
            if (r0 != r11) goto L8a
            goto La7
        L8a:
            java.util.List r0 = (java.util.List) r0
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto La2
            yads.zg2 r0 = yads.zg2.f97568d
            yads.ih2 r0 = yads.jq1.a()
            yads.dh2 r11 = new yads.dh2
            java.util.List r0 = cn.v.e(r0)
            r11.<init>(r0)
            goto La7
        La2:
            yads.dh2 r11 = new yads.dh2
            r11.<init>(r0)
        La7:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.xh2.a(long, android.content.Context, yads.e00, yads.a03, yads.xh2, java.util.List, hn.c):java.lang.Object");
    }

    public static final void a(xh2 xh2Var, qq1 qq1Var) {
        xh2Var.getClass();
        if (bo.d0.a0(qq1Var.f94111b, "LevelPlay", true)) {
            List listP = cn.w.p(MBridgeConstans.APP_KEY, "placement_name");
            ArrayList arrayList = new ArrayList();
            for (Object obj : listP) {
                if (!qq1Var.f94112c.containsKey((String) obj)) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                throw new IllegalArgumentException("Required configuration parameters are missing");
            }
        }
    }
}
