package q7;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.d0;
import d6.v1;
import s7.m0;

/* JADX INFO: compiled from: TrackSelectorResult.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f78026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v1[] f78027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r[] f78028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d0 f78029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Object f78030e;

    public b0(v1[] v1VarArr, r[] rVarArr, d0 d0Var, @Nullable Object obj) {
        this.f78027b = v1VarArr;
        this.f78028c = (r[]) rVarArr.clone();
        this.f78029d = d0Var;
        this.f78030e = obj;
        this.f78026a = v1VarArr.length;
    }

    public boolean a(@Nullable b0 b0Var) {
        if (b0Var == null || b0Var.f78028c.length != this.f78028c.length) {
            return false;
        }
        for (int i10 = 0; i10 < this.f78028c.length; i10++) {
            if (!b(b0Var, i10)) {
                return false;
            }
        }
        return true;
    }

    public boolean b(@Nullable b0 b0Var, int i10) {
        return b0Var != null && m0.c(this.f78027b[i10], b0Var.f78027b[i10]) && m0.c(this.f78028c[i10], b0Var.f78028c[i10]);
    }

    public boolean c(int i10) {
        return this.f78027b[i10] != null;
    }
}
