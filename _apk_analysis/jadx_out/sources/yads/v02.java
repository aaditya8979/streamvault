package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;
import yads.v02;

/* JADX INFO: loaded from: classes2.dex */
public final class v02 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p02 f95898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f95899b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y5 f95900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c10 f95901d;

    public v02(Context context, d4 d4Var, lu2 lu2Var, w5 w5Var, p02 p02Var) {
        this.f95898a = p02Var;
        this.f95900c = new y5(context, d4Var, lu2Var, w5Var);
    }

    public static final void a(v02 v02Var, List list) {
        v02Var.getClass();
        p02 p02Var = v02Var.f95898a;
        o02 o02Var = (o02) p02Var.f93376a;
        o02Var.f93066e.a();
        o02Var.f93065d.remove(p02Var);
    }

    public static final void a(v02 v02Var, l4 l4Var) {
        c10 c10Var = v02Var.f95901d;
        if (c10Var != null) {
            ((pt3) c10Var).a(l4Var);
        }
        p02 p02Var = v02Var.f95898a;
        o02 o02Var = (o02) p02Var.f93376a;
        o02Var.f93066e.a();
        o02Var.f93065d.remove(p02Var);
    }

    public static final void a(v02 v02Var, v22 v22Var) {
        v02Var.getClass();
        p02 p02Var = v02Var.f95898a;
        o02 o02Var = (o02) p02Var.f93376a;
        o02Var.f93066e.a();
        o02Var.f93065d.remove(p02Var);
    }

    public static final void a(v02 v02Var, w02 w02Var) {
        c10 c10Var = v02Var.f95901d;
        if (c10Var != null) {
            ((pt3) c10Var).a(w02Var);
        }
        p02 p02Var = v02Var.f95898a;
        o02 o02Var = (o02) p02Var.f93376a;
        o02Var.f93066e.a();
        o02Var.f93065d.remove(p02Var);
    }

    public final void a(final ArrayList arrayList) {
        d00 d00Var = e00.f89039c;
        p4.a("native");
        this.f95900c.a();
        this.f95899b.post(new Runnable() { // from class: bt.fb
            @Override // java.lang.Runnable
            public final void run() {
                v02.a(this.f6038b, arrayList);
            }
        });
    }

    public final void a(d4 d4Var) {
        this.f95900c.f97004e = new j9(d4Var);
    }

    public final void a(i12 i12Var) {
        this.f95900c.f97005f = i12Var;
    }

    public final void a(final l4 l4Var) {
        this.f95900c.a(l4Var.f91879b, l4Var.f91880c);
        this.f95899b.post(new Runnable() { // from class: bt.db
            @Override // java.lang.Runnable
            public final void run() {
                v02.a(this.f5999b, l4Var);
            }
        });
    }

    public final void a(final v22 v22Var) {
        d00 d00Var = e00.f89039c;
        p4.a("native");
        this.f95900c.a();
        this.f95899b.post(new Runnable() { // from class: bt.gb
            @Override // java.lang.Runnable
            public final void run() {
                v02.a(this.f6057b, v22Var);
            }
        });
    }

    public final void a(final w02 w02Var) {
        d00 d00Var = e00.f89039c;
        p4.a("native");
        this.f95900c.a();
        this.f95899b.post(new Runnable() { // from class: bt.eb
            @Override // java.lang.Runnable
            public final void run() {
                v02.a(this.f6021b, w02Var);
            }
        });
    }
}
