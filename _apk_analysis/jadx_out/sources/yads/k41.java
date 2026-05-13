package yads;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import java.util.HashMap;

/* JADX INFO: loaded from: classes8.dex */
public abstract class k41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cp2 f91478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h41 f91479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f91480c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f91481d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f91482e = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f41 f91483f;

    public k41(cp2 cp2Var, t82 t82Var) {
        this.f91478a = cp2Var;
        this.f91479b = t82Var;
    }

    public final i41 a(String str, j41 j41Var, int i10, int i11) {
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Must be invoked from the main thread.");
        }
        ((d03) this).f88682g.getClass();
        String strA = k31.a(str, scaleType);
        Bitmap bitmapA = ((t82) this.f91479b).a(strA);
        if (bitmapA != null) {
            i41 i41Var = new i41(this, bitmapA, null, null);
            j41Var.a(i41Var, true);
            return i41Var;
        }
        i41 i41Var2 = new i41(this, null, strA, j41Var);
        j41Var.a(i41Var2, true);
        g41 g41Var = (g41) this.f91480c.get(strA);
        if (g41Var == null) {
            g41Var = (g41) this.f91481d.get(strA);
        }
        if (g41Var != null) {
            g41Var.f89808d.add(i41Var2);
        } else {
            o41 o41Var = new o41(str, new d41(this, strA), i10, i11, scaleType, Bitmap.Config.RGB_565, new e41(this, strA));
            this.f91478a.a(o41Var);
            this.f91480c.put(strA, new g41(o41Var, i41Var2));
        }
        return i41Var2;
    }
}
