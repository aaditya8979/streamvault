package yads;

import android.content.Context;
import android.view.ViewGroup;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class g7 implements py0, e03 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f89830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t2 f89831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kz f89832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c7 f89833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ExtendedNativeAdView f89834e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s2 f89835f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final sj2 f89836g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final lw f89837h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final uq2 f89838i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f89839j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f89840k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f89841l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f89842m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f89843n;

    public g7(Context context, w02 w02Var, z00 z00Var, ir2 ir2Var, ArrayList arrayList, gi0 gi0Var, ViewGroup viewGroup, t2 t2Var, kz kzVar, ye1 ye1Var, c7 c7Var, ExtendedNativeAdView extendedNativeAdView, s2 s2Var, sj2 sj2Var, lw lwVar, uq2 uq2Var) {
        this.f89830a = viewGroup;
        this.f89831b = t2Var;
        this.f89832c = kzVar;
        this.f89833d = c7Var;
        this.f89834e = extendedNativeAdView;
        this.f89835f = s2Var;
        this.f89836g = sj2Var;
        this.f89837h = lwVar;
        this.f89838i = uq2Var;
        List listA = c7Var.a();
        this.f89840k = listA;
        Iterator it = listA.iterator();
        long jA = 0;
        while (it.hasNext()) {
            jA += ((j7) it.next()).a();
        }
        this.f89841l = jA;
        this.f89839j = ye1Var.a(context, this.f89834e, w02Var, z00Var, new f7(this), ir2Var, this.f89836g, new i7(this), arrayList, gi0Var, this.f89833d, this.f89837h);
    }

    public final void a() {
        this.f89830a.setContentDescription("pageIndex: " + this.f89842m);
    }

    public final void b() {
        j7 j7Var = (j7) cn.f0.w0(this.f89840k, this.f89842m - 1);
        long j10 = j7Var != null ? j7Var.f91107a : 0L;
        this.f89836g.f94850a += j10;
        lw lwVar = this.f89837h;
        lwVar.f92129a += lwVar.f92130b;
        lwVar.f92130b = 0L;
        if (this.f89842m < this.f89839j.size()) {
            int i10 = this.f89842m;
            this.f89842m = i10 + 1;
            if (!((xe1) this.f89839j.get(i10)).a()) {
                d();
            } else {
                a();
                this.f89838i.a(this.f89834e, this.f89841l, this.f89836g.f94850a);
            }
        }
    }

    @Override // yads.py0
    public final void c() {
        ViewGroup viewGroup = this.f89830a;
        ExtendedNativeAdView extendedNativeAdView = this.f89834e;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        viewGroup.removeAllViews();
        viewGroup.addView(extendedNativeAdView, layoutParams);
        s2 s2Var = this.f89835f;
        ExtendedNativeAdView extendedNativeAdView2 = this.f89834e;
        s2Var.getClass();
        try {
            if (s2Var.f94677a instanceof v22) {
                r12 r12VarA = s2Var.f94681e.a(extendedNativeAdView2, s2Var.f94680d);
                v22 v22Var = (v22) s2Var.f94677a;
                v22Var.getClass();
                v22Var.a(r12VarA.f94253c, v22Var.Q, new z12(r12VarA));
                ((v22) s2Var.f94677a).b(s2Var.f94679c);
            }
            this.f89842m = 1;
            this.f89843n = false;
            xe1 xe1Var = (xe1) cn.f0.v0(this.f89839j);
            if (xe1Var != null && xe1Var.a()) {
                a();
                this.f89838i.a(this.f89834e, this.f89841l, this.f89836g.f94850a);
            } else if (this.f89842m >= this.f89839j.size()) {
                this.f89832c.e();
            } else {
                b();
            }
        } catch (j02 unused) {
            s2Var.f94678b.e();
        }
    }

    public final void d() {
        if (this.f89842m >= this.f89839j.size()) {
            this.f89832c.e();
        } else {
            b();
        }
    }

    @Override // yads.py0
    public final void invalidate() {
        Iterator it = this.f89839j.iterator();
        while (it.hasNext()) {
            ((xe1) it.next()).b();
        }
        w02 w02Var = this.f89835f.f94677a;
        if (w02Var instanceof v22) {
            ((v22) w02Var).b((z00) null);
        }
    }
}
