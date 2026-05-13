package yads;

import android.graphics.Bitmap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class x31 implements j41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y31 f96622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f96623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u41 f96624c;

    public x31(y31 y31Var, Map map, u41 u41Var) {
        this.f96622a = y31Var;
        this.f96623b = map;
        this.f96624c = u41Var;
    }

    @Override // yads.j41
    public final void a(i41 i41Var, boolean z10) {
        String str = this.f96624c.f95549c;
        Bitmap bitmap = i41Var.f90663a;
        if (bitmap != null) {
            if (str != null) {
                this.f96623b.put(str, bitmap);
                this.f96622a.f96988c.a(str, bitmap);
            }
            this.f96622a.a(this.f96623b);
        }
    }

    @Override // yads.tp2
    public final void a(im3 im3Var) {
        boolean z10 = ad1.f87661a;
        this.f96622a.a(this.f96623b);
    }
}
