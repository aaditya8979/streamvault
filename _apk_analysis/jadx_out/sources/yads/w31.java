package yads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import yads.w31;

/* JADX INFO: loaded from: classes4.dex */
public final class w31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r31 f96268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mi2 f96269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k41 f96270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dk0 f96271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Resources f96272e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f96273f;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ w31(Context context, r31 r31Var, mi2 mi2Var) {
        s82 s82Var = w82.f96306d;
        d03 d03VarB = s82Var.a(context).b();
        dk0 dk0VarA = s82Var.a(context).a();
        Object obj = dw2.f89000j;
        this(context, r31Var, mi2Var, d03VarB, dk0VarA, cw2.a());
    }

    public w31(Context context, r31 r31Var, mi2 mi2Var, k41 k41Var, dk0 dk0Var, dw2 dw2Var) {
        nt2 nt2VarA;
        this.f96268a = r31Var;
        this.f96269b = mi2Var;
        this.f96270c = k41Var;
        this.f96271d = dk0Var;
        this.f96272e = context.getResources();
        this.f96273f = r31Var.a() && (nt2VarA = dw2Var.a(context)) != null && nt2VarA.d();
    }

    public static final void a(t31 t31Var, w31 w31Var, Bitmap bitmap) {
        t31Var.a(bitmap != null ? new BitmapDrawable(w31Var.f96272e, bitmap) : null);
    }

    public final void a(u41 u41Var, t31 t31Var) {
        mi2 mi2Var = this.f96269b;
        mi2Var.getClass();
        String str = u41Var.f95553g;
        li2 li2Var = str != null ? new li2(str, new yz2(u41Var.f95547a, u41Var.f95548b)) : null;
        Bitmap bitmap = li2Var != null ? (Bitmap) mi2Var.f92365c.get(li2Var) : null;
        t31Var.a(bitmap != null ? new BitmapDrawable(this.f96272e, bitmap) : null);
        if (this.f96273f) {
            this.f96271d.a(u41Var.f95549c, new v31(t31Var));
        } else {
            b(u41Var, t31Var);
        }
    }

    public final void b(u41 u41Var, final t31 t31Var) {
        s31 s31Var = new s31() { // from class: bt.qb
            @Override // yads.s31
            public final void a(Bitmap bitmap) {
                w31.a(t31Var, this, bitmap);
            }
        };
        Bitmap bitmapA = this.f96269b.a(u41Var);
        if (bitmapA != null) {
            s31Var.a(bitmapA);
            return;
        }
        mi2 mi2Var = this.f96269b;
        mi2Var.getClass();
        String str = u41Var.f95553g;
        li2 li2Var = str != null ? new li2(str, new yz2(u41Var.f95547a, u41Var.f95548b)) : null;
        s31Var.a(li2Var != null ? (Bitmap) mi2Var.f92365c.get(li2Var) : null);
        if (this.f96268a.a()) {
            String str2 = u41Var.f95549c;
            this.f96270c.a(str2, new u31(this, str2, s31Var), u41Var.f95547a, u41Var.f95548b);
        }
    }
}
