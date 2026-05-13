package yads;

import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes12.dex */
public final class lg3 implements yj3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ud3 f91962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wj3 f91963b;

    public lg3(ud3 ud3Var, wj3 wj3Var) {
        this.f91962a = ud3Var;
        this.f91963b = wj3Var;
    }

    @Override // yads.yj3
    public final void a() {
    }

    @Override // yads.yj3
    public final void a(float f10) {
    }

    @Override // yads.yj3
    public final void a(float f10, long j10) {
    }

    @Override // yads.yj3
    public final void a(View view, List list) {
    }

    @Override // yads.yj3
    public final void a(jf3 jf3Var) {
        int i10;
        switch (jf3Var.f91207a.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
            case 11:
            case 25:
            case 26:
                i10 = 405;
                break;
            case 7:
                i10 = 402;
                break;
            case 8:
            case 12:
            case 28:
                i10 = TypedValues.Custom.TYPE_INT;
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 20:
            case 21:
            case 22:
            case 24:
            case 27:
                i10 = 400;
                break;
            case 19:
                i10 = 401;
                break;
            case 23:
                i10 = 403;
                break;
            case 29:
            case 31:
                i10 = 901;
                break;
            case 30:
                i10 = 902;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        Map mapG = cn.p0.g(bn.h.a("[ERRORCODE]", String.valueOf(i10)));
        wj3 wj3Var = this.f91963b;
        ud3 ud3Var = this.f91962a;
        wj3Var.getClass();
        List list = (List) ud3Var.a().get("error");
        if (list != null) {
            wj3Var.f96405a.a(list, mapG);
        }
    }

    @Override // yads.yj3
    public final void a(xj3 xj3Var) {
    }

    @Override // yads.yj3
    public final void b() {
    }

    @Override // yads.yj3
    public final void c() {
    }

    @Override // yads.yj3
    public final void d() {
    }

    @Override // yads.yj3
    public final void f() {
    }

    @Override // yads.yj3
    public final void g() {
    }

    @Override // yads.yj3
    public final void h() {
        this.f91963b.a(this.f91962a, "render_impression");
    }

    @Override // yads.yj3
    public final void i() {
        this.f91963b.a(new fe3(this.f91962a), "renderingStart");
    }

    @Override // yads.yj3
    public final void j() {
    }

    @Override // yads.yj3
    public final void k() {
    }

    @Override // yads.yj3
    public final void l() {
    }

    @Override // yads.yj3
    public final void m() {
    }

    @Override // yads.yj3
    public final void n() {
        this.f91963b.a(this.f91962a, "impression");
    }
}
