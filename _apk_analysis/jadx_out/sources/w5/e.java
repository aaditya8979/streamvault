package w5;

import a6.k0;
import androidx.annotation.Nullable;
import e4.r0;

/* JADX INFO: compiled from: TrackSelectorResult.java */
/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f86338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0[] f86339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f86340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f86341d;

    public e(r0[] r0VarArr, com.google.android.exoplayer.trackselection.c[] cVarArr, Object obj) {
        this.f86339b = r0VarArr;
        this.f86340c = new c(cVarArr);
        this.f86341d = obj;
        this.f86338a = r0VarArr.length;
    }

    public boolean a(@Nullable e eVar) {
        if (eVar == null || eVar.f86340c.f86333a != this.f86340c.f86333a) {
            return false;
        }
        for (int i10 = 0; i10 < this.f86340c.f86333a; i10++) {
            if (!b(eVar, i10)) {
                return false;
            }
        }
        return true;
    }

    public boolean b(@Nullable e eVar, int i10) {
        return eVar != null && k0.c(this.f86339b[i10], eVar.f86339b[i10]) && k0.c(this.f86340c.a(i10), eVar.f86340c.a(i10));
    }

    public boolean c(int i10) {
        return this.f86339b[i10] != null;
    }
}
