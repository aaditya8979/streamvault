package yads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import yads.tc1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class tc1 extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d4 f95136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final lu2 f95137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final mh1 f95138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final rh1 f95139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final dw2 f95140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final km f95141f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final uc1 f95142g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ArrayList f95143h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f95144i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f95145j;

    public /* synthetic */ tc1(Context context, AttributeSet attributeSet, int i10, d4 d4Var, iu3 iu3Var) {
        mh1 mh1Var = new mh1();
        rh1 rh1Var = new rh1(context);
        w5 w5Var = new w5();
        jm jmVar = new jm(context, d4Var, iu3Var, w5Var);
        Object obj = dw2.f89000j;
        this(context, attributeSet, i10, d4Var, iu3Var, mh1Var, rh1Var, w5Var, jmVar, cw2.a());
    }

    public tc1(Context context, AttributeSet attributeSet, int i10, d4 d4Var, iu3 iu3Var, mh1 mh1Var, rh1 rh1Var, w5 w5Var, jm jmVar, dw2 dw2Var) {
        super(context, attributeSet, i10);
        this.f95136a = d4Var;
        this.f95137b = iu3Var;
        this.f95138c = mh1Var;
        this.f95139d = rh1Var;
        this.f95140e = dw2Var;
        this.f95143h = new ArrayList();
        rh1Var.a();
        km kmVarA = a(context, d4Var, jmVar, w5Var);
        this.f95141f = kmVarA;
        jmVar.a(kmVarA.e());
        uc1 uc1VarA = a();
        this.f95142g = uc1VarA;
        uc1VarA.a(context, this);
    }

    private final uc1 a() {
        return xc1.a(this, this.f95141f);
    }

    private final void a(int i10) {
        boolean z10 = ad1.f87661a;
        int i11 = tb.f95131b;
        if (tb.a((mu) this.f95141f)) {
            return;
        }
        Iterator it = this.f95143h.iterator();
        while (it.hasNext()) {
            ((rm2) ((ll3) it.next())).p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(tc1 tc1Var, g9 g9Var) {
        tc1Var.f95141f.b(g9Var);
    }

    public final c00 a(String str) {
        List listM;
        this.f95139d.a();
        i00 i00VarC = c();
        la laVar = i00VarC != null ? new la(i00VarC.f87760a.getWidth(), i00VarC.f87760a.getHeight()) : null;
        String strD = d();
        this.f95139d.a();
        um umVar = this.f95141f.K;
        if (umVar == null || (listM = umVar.b()) == null) {
            listM = cn.w.m();
        }
        return new c00(str, laVar, strD, listM);
    }

    public abstract km a(Context context, d4 d4Var, jm jmVar, w5 w5Var);

    public final void a(final g9 g9Var) {
        this.f95139d.a();
        this.f95138c.a(new Runnable() { // from class: bt.da
            @Override // java.lang.Runnable
            public final void run() {
                tc1.a(this.f5997b, g9Var);
            }
        });
    }

    public final void a(h00 h00Var) {
        this.f95139d.a();
        km kmVar = this.f95141f;
        jm jmVar = kmVar.D;
        kmVar.f97696u = jmVar;
        jmVar.f91275c = h00Var;
        jmVar.f91274b.a(h00Var);
    }

    public final void a(i00 i00Var) {
        this.f95139d.a();
        this.f95141f.a(i00Var.f87760a);
    }

    public final void addVisibilityChangeListener(@NotNull ll3 ll3Var) {
        this.f95143h.add(ll3Var);
    }

    public final List b() {
        List listA;
        this.f95139d.a();
        um umVar = this.f95141f.K;
        return (umVar == null || (listA = umVar.a()) == null) ? cn.w.m() : listA;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final yads.i00 c() {
        /*
            r4 = this;
            yads.rh1 r0 = r4.f95139d
            r0.a()
            yads.km r0 = r4.f95141f
            yads.v9 r1 = r0.f97697v
            r2 = 0
            if (r1 == 0) goto L1c
            yads.nv0 r1 = r1.c()
            int r3 = r1.f92998c
            if (r3 != 0) goto L1a
            int r3 = r1.f92999d
            if (r3 == 0) goto L19
            goto L1a
        L19:
            r1 = r2
        L1a:
            if (r1 != 0) goto L22
        L1c:
            yads.d4 r0 = r0.f97678c
            yads.b03 r0 = r0.f88743d
            yads.a03 r1 = r0.f87866a
        L22:
            if (r1 == 0) goto L29
            yads.i00 r2 = new yads.i00
            r2.<init>(r1)
        L29:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.tc1.c():yads.i00");
    }

    public final String d() {
        this.f95139d.a();
        um umVar = this.f95141f.K;
        if (umVar != null) {
            return umVar.getAdInfo();
        }
        return null;
    }

    public void destroy() {
        this.f95139d.a();
        this.f95138c.a();
        this.f95143h.clear();
        int i10 = tb.f95131b;
        if (tb.a((mu) this.f95141f)) {
            return;
        }
        this.f95141f.d();
    }

    public final lh3 e() {
        this.f95139d.a();
        return this.f95141f.E;
    }

    @NotNull
    public final d4 getAdConfiguration$mobileads_externalRelease() {
        return this.f95136a;
    }

    public final int getHeightMeasureSpec$mobileads_externalRelease() {
        return this.f95145j;
    }

    @NotNull
    public final lu2 getSdkEnvironmentModule$mobileads_externalRelease() {
        return this.f95137b;
    }

    public final int getWidthMeasureSpec$mobileads_externalRelease() {
        return this.f95144i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getClass().toString();
        boolean z10 = ad1.f87661a;
        uc1 uc1Var = this.f95142g;
        getContext();
        uc1Var.onAttachedToWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onConfigurationChanged(android.content.res.Configuration r6) {
        /*
            r5 = this;
            super.onConfigurationChanged(r6)
            int r0 = yads.tb.f95131b
            yads.km r0 = r5.f95141f
            boolean r0 = yads.tb.a(r0)
            if (r0 != 0) goto L40
            yads.km r0 = r5.f95141f
            yads.v9 r1 = r0.f97697v
            r2 = 0
            if (r1 == 0) goto L18
            yads.nv0 r2 = r1.c()
        L18:
            if (r2 == 0) goto L32
            yads.d4 r1 = r0.f97678c
            yads.b03 r1 = r1.f88743d
            yads.a03 r1 = r1.f87866a
            yads.v9 r3 = r0.f97697v
            if (r3 == 0) goto L32
            if (r1 == 0) goto L32
            android.content.Context r4 = r0.f97676a
            yads.mm r0 = r0.F
            boolean r0 = yads.c03.a(r4, r3, r2, r0, r1)
            if (r0 == 0) goto L32
            r0 = 0
            goto L3d
        L32:
            yads.d4 r0 = r5.f95136a
            yads.g9 r0 = r0.f88744e
            if (r0 == 0) goto L3b
            r5.a(r0)
        L3b:
            r0 = 8
        L3d:
            r5.setVisibility(r0)
        L40:
            java.util.Objects.toString(r6)
            boolean r6 = yads.ad1.f87661a
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.tc1.onConfigurationChanged(android.content.res.Configuration):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getClass().toString();
        boolean z10 = ad1.f87661a;
        uc1 uc1Var = this.f95142g;
        getContext();
        uc1Var.onDetachedFromWindow();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f95144i = i10;
        this.f95145j = i11;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (this.f95140e == null) {
            return;
        }
        Objects.toString(view);
        boolean z10 = ad1.f87661a;
        nt2 nt2VarA = this.f95140e.a(getContext());
        if (nt2VarA == null || !nt2VarA.h()) {
            a(i10);
        } else if (this == view) {
            a(i10);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        getVisibility();
        boolean z10 = ad1.f87661a;
        a((i10 == 0 && getVisibility() == 0) ? 0 : 8);
    }

    public final void removeVisibilityChangeListener(@NotNull ll3 ll3Var) {
        this.f95143h.remove(ll3Var);
    }

    public void setAdUnitId(String str) {
        this.f95139d.a();
        this.f95141f.f97678c.a(str);
    }
}
