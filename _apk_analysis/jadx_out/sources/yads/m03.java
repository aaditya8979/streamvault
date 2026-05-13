package yads;

import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class m03 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashSet f92204b = new HashSet(cn.w.p(g63.f89825c, g63.f89824b));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i63 f92205a;

    public /* synthetic */ m03() {
        this(new i63(f92204b));
    }

    public m03(i63 i63Var) {
        this.f92205a = i63Var;
    }

    public final gg3 a(b20 b20Var) {
        int i10 = b20Var.f87888i;
        n03 n03Var = b20Var.f87886g;
        if (n03Var != null) {
            xc3 xc3VarA = this.f92205a.a(n03Var.f92686a);
            if (xc3VarA != null) {
                float f10 = xc3VarA.f96712c;
                if (wc3.f96350c == xc3VarA.f96711b) {
                    f10 = (long) ((f10 / 100) * i10);
                }
                return new gg3((long) Math.min(f10, i10));
            }
        }
        return null;
    }
}
