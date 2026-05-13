package yads;

import android.net.Uri;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class i7 implements ph0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e03 f90690a;

    public i7(e03 e03Var) {
        this.f90690a = e03Var;
    }

    @Override // yads.ph0
    public final boolean a(Uri uri) {
        k7 k7Var;
        if (!tn.p.f(uri.getHost(), "showNextAd")) {
            return false;
        }
        g7 g7Var = (g7) this.f90690a;
        int i10 = g7Var.f89842m - 1;
        if (i10 == g7Var.f89833d.f88376c && !g7Var.f89843n) {
            g7Var.f89843n = true;
            g7Var.f89831b.b();
        }
        if (g7Var.f89842m >= g7Var.f89839j.size()) {
            return true;
        }
        xe1 xe1Var = (xe1) cn.f0.w0(g7Var.f89839j, i10);
        if (xe1Var != null) {
            xe1Var.b();
        }
        j7 j7Var = (j7) cn.f0.w0(g7Var.f89840k, i10);
        if (((j7Var == null || (k7Var = j7Var.f91108b) == null) ? null : k7Var.f91502a) != p03.f93378c) {
            g7Var.b();
            return true;
        }
        int size = g7Var.f89839j.size() - 1;
        g7Var.f89842m = size;
        Iterator it = g7Var.f89840k.subList(i10, size).iterator();
        long j10 = 0;
        while (it.hasNext()) {
            j10 += ((j7) it.next()).f91107a;
        }
        g7Var.f89836g.f94850a += j10;
        lw lwVar = g7Var.f89837h;
        lwVar.f92129a += lwVar.f92130b;
        lwVar.f92130b = 0L;
        int i11 = g7Var.f89842m;
        g7Var.f89842m = i11 + 1;
        if (((xe1) g7Var.f89839j.get(i11)).a()) {
            g7Var.a();
            g7Var.f89838i.a(g7Var.f89834e, g7Var.f89841l, g7Var.f89836g.f94850a);
            return true;
        }
        if (g7Var.f89842m >= g7Var.f89839j.size()) {
            g7Var.f89832c.e();
            return true;
        }
        g7Var.b();
        return true;
    }
}
