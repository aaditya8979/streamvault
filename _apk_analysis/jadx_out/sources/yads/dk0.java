package yads;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import yads.dk0;
import yads.im3;

/* JADX INFO: loaded from: classes3.dex */
public final class dk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cp2 f88882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f88883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vj0 f88884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f88885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f88886e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f88887f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Runnable f88888g;

    public /* synthetic */ dk0(cp2 cp2Var, Context context) {
        this(cp2Var, context, new vj0());
    }

    public dk0(cp2 cp2Var, Context context, vj0 vj0Var) {
        this.f88882a = cp2Var;
        this.f88883b = context;
        this.f88884c = vj0Var;
        this.f88885d = new HashMap();
        this.f88886e = new HashMap();
        this.f88887f = new Handler(Looper.getMainLooper());
    }

    public static final void a(dk0 dk0Var) {
        Iterator it = dk0Var.f88886e.entrySet().iterator();
        while (it.hasNext()) {
            bk0 bk0Var = (bk0) ((Map.Entry) it.next()).getValue();
            for (v31 v31Var : bk0Var.f88034a.f87722b) {
                if (bk0Var.f88036c == null) {
                    Drawable drawable = bk0Var.f88035b;
                    if (drawable != null) {
                        v31Var.f95912a.a(drawable);
                    } else {
                        v31Var.getClass();
                    }
                } else {
                    v31Var.getClass();
                    boolean z10 = ad1.f87661a;
                }
            }
        }
        dk0Var.f88886e.clear();
        dk0Var.f88888g = null;
    }

    public static final void a(dk0 dk0Var, String str, im3 im3Var) {
        ak0 ak0Var = (ak0) dk0Var.f88885d.remove(str);
        if (ak0Var == null) {
            return;
        }
        dk0Var.a(str, ak0Var, null, im3Var);
    }

    public final void a(String str, ak0 ak0Var, Drawable drawable, im3 im3Var) {
        this.f88886e.put(str, new bk0(ak0Var, drawable, im3Var));
        if (this.f88888g == null) {
            Runnable runnable = new Runnable() { // from class: bt.y0
                @Override // java.lang.Runnable
                public final void run() {
                    dk0.a(this.f6411b);
                }
            };
            this.f88887f.postDelayed(runnable, 100L);
            this.f88888g = runnable;
        }
    }

    public final void a(final String str, v31 v31Var) {
        uj0 uj0VarA = this.f88884c.a(str);
        if (uj0VarA != null) {
            Drawable drawable = uj0VarA.f95685a;
            if (drawable != null) {
                v31Var.f95912a.a(drawable);
                return;
            }
            return;
        }
        ak0 ak0Var = (ak0) this.f88885d.get(str);
        if (ak0Var != null) {
            ak0Var.f87721a.add(v31Var);
            return;
        }
        Context context = this.f88883b;
        fk0 fk0Var = new fk0(str, new ek0(context.getApplicationContext()), new ck0(this, str), new tp2() { // from class: bt.x0
            @Override // yads.tp2
            public final void a(im3 im3Var) {
                dk0.a(this.f6389b, str, im3Var);
            }
        });
        this.f88885d.put(str, new ak0(v31Var));
        this.f88882a.a(fk0Var);
    }
}
