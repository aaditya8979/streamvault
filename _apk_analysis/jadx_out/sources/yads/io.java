package yads;

import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import yads.io;

/* JADX INFO: loaded from: classes3.dex */
public final class io implements hd1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f90939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rh1 f90940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mh1 f90941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gd1 f90942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArrayList f90943e = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public w00 f90944f;

    public io(Context context, rh1 rh1Var, mh1 mh1Var, gd1 gd1Var) {
        this.f90939a = context;
        this.f90940b = rh1Var;
        this.f90941c = mh1Var;
        this.f90942d = gd1Var;
    }

    public static final void a(io ioVar, g9 g9Var) {
        fd1 fd1VarA = ioVar.f90942d.a(ioVar.f90939a, ioVar, g9Var, null);
        ioVar.f90943e.add(fd1VarA);
        String str = g9Var.f89877a;
        fd1VarA.f97678c.a(str);
        fd1VarA.F.f94860f = str;
        fd1VarA.a(ioVar.f90944f);
        fd1VarA.b(g9Var);
    }

    @Override // yads.hd1
    public final void a(ct3 ct3Var) {
        this.f90940b.a();
        this.f90944f = ct3Var;
        Iterator it = this.f90943e.iterator();
        while (it.hasNext()) {
            ((fd1) it.next()).a((w00) ct3Var);
        }
    }

    @Override // yads.r5
    public final void a(fy0 fy0Var) {
        fd1 fd1Var = (fd1) fy0Var;
        if (this.f90944f == null) {
            lc1.c("InterstitialAdLoader. InterstitialAdLoadListener is null on finished ad loading. Please, keep active listener until ad loading finished or use cancelLoading().", new Object[0]);
        }
        fd1Var.a((w00) null);
        this.f90943e.remove(fd1Var);
    }

    @Override // yads.hd1
    public final void a(final g9 g9Var) {
        this.f90940b.a();
        if (this.f90944f == null) {
            lc1.c("InterstitialAdLoader. InterstitialAdLoadListener is null on loading start. Please, use setAdLoadListener before loading Ad.", new Object[0]);
        }
        this.f90941c.a(new Runnable() { // from class: bt.f3
            @Override // java.lang.Runnable
            public final void run() {
                io.a(this.f6030b, g9Var);
            }
        });
    }
}
