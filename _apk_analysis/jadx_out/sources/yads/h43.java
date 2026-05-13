package yads;

import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes10.dex */
public final class h43 extends po2 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f90246s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public up2 f90247t;

    public h43(String str, up2 up2Var, tp2 tp2Var) {
        super(0, str, tp2Var);
        this.f90246s = new Object();
        this.f90247t = up2Var;
    }

    @Override // yads.po2
    public final vp2 a(e82 e82Var) {
        String str;
        try {
            str = new String(e82Var.f89158b, v11.a(e82Var.f89159c));
        } catch (UnsupportedEncodingException unused) {
            str = new String(e82Var.f89158b);
        }
        return new vp2(str, v11.a(e82Var));
    }

    @Override // yads.po2
    public final void a() {
        super.a();
        synchronized (this.f90246s) {
            this.f90247t = null;
        }
    }

    @Override // yads.po2
    public final void a(Object obj) {
        up2 up2Var;
        String str = (String) obj;
        synchronized (this.f90246s) {
            up2Var = this.f90247t;
        }
        if (up2Var != null) {
            up2Var.a(str);
        }
    }
}
