package yads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.ironsource.Z7;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public abstract class po2 implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final km3 f93669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f93670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f93671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f93672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f93673f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public tp2 f93674g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f93675h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public cp2 f93676i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f93677j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f93678k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f93679l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f93680m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f93681n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public qe0 f93682o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public lr f93683p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f93684q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public no2 f93685r;

    public po2(int i10, String str, tp2 tp2Var) {
        this.f93669b = km3.f91658c ? new km3() : null;
        this.f93673f = new Object();
        this.f93677j = true;
        this.f93678k = false;
        this.f93679l = false;
        this.f93680m = false;
        this.f93681n = false;
        this.f93683p = null;
        this.f93670c = i10;
        this.f93671d = str;
        this.f93674g = tp2Var;
        a(new qe0());
        this.f93672e = b(str);
    }

    public static int b(String str) {
        Uri uri;
        String host;
        if (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null || (host = uri.getHost()) == null) {
            return 0;
        }
        return host.hashCode();
    }

    public im3 a(im3 im3Var) {
        return im3Var;
    }

    public abstract vp2 a(e82 e82Var);

    public void a() {
        synchronized (this.f93673f) {
            this.f93678k = true;
            this.f93674g = null;
        }
    }

    public final void a(int i10) {
        cp2 cp2Var = this.f93676i;
        if (cp2Var != null) {
            cp2Var.a(this, i10);
        }
    }

    public abstract void a(Object obj);

    public final void a(String str) {
        if (km3.f91658c) {
            this.f93669b.a(str, Thread.currentThread().getId());
        }
    }

    public final void a(no2 no2Var) {
        synchronized (this.f93673f) {
            this.f93685r = no2Var;
        }
    }

    public final void a(qe0 qe0Var) {
        this.f93682o = qe0Var;
    }

    public final void a(vp2 vp2Var) {
        no2 no2Var;
        synchronized (this.f93673f) {
            no2Var = this.f93685r;
        }
        if (no2Var != null) {
            ((en3) no2Var).a(this, vp2Var);
        }
    }

    public byte[] b() {
        return null;
    }

    public final String c() {
        String strG = g();
        int i10 = this.f93670c;
        if (i10 == 0 || i10 == -1) {
            return strG;
        }
        return Integer.toString(i10) + '-' + strG;
    }

    public final void c(String str) {
        cp2 cp2Var = this.f93676i;
        if (cp2Var != null) {
            synchronized (cp2Var.f88564b) {
                cp2Var.f88564b.remove(this);
            }
            synchronized (cp2Var.f88572j) {
                Iterator it = cp2Var.f88572j.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            cp2Var.a(this, 5);
        }
        if (km3.f91658c) {
            long id2 = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new mo2(this, str, id2));
                return;
            }
            this.f93669b.a(str, id2);
            km3 km3Var = this.f93669b;
            toString();
            km3Var.a();
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        po2 po2Var = (po2) obj;
        int iF = f();
        int iF2 = po2Var.f();
        return iF == iF2 ? this.f93675h.intValue() - po2Var.f93675h.intValue() : hg0.a(iF2) - hg0.a(iF);
    }

    public Map d() {
        return Collections.emptyMap();
    }

    public final int e() {
        return this.f93670c;
    }

    public int f() {
        return 2;
    }

    public String g() {
        return this.f93671d;
    }

    public final boolean h() {
        boolean z10;
        synchronized (this.f93673f) {
            z10 = this.f93679l;
        }
        return z10;
    }

    public final boolean i() {
        boolean z10;
        synchronized (this.f93673f) {
            z10 = this.f93678k;
        }
        return z10;
    }

    public final void j() {
        no2 no2Var;
        synchronized (this.f93673f) {
            no2Var = this.f93685r;
        }
        if (no2Var != null) {
            ((en3) no2Var).b(this);
        }
    }

    public final void k() {
        this.f93677j = false;
    }

    public final void l() {
        this.f93681n = true;
    }

    public final void m() {
        this.f93680m = true;
    }

    public final String toString() {
        String str = "0x" + Integer.toHexString(this.f93672e);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i() ? "[X] " : "[ ] ");
        sb2.append(g());
        sb2.append(Z7.f30794r);
        sb2.append(str);
        sb2.append(Z7.f30794r);
        sb2.append(oo2.a(f()));
        sb2.append(Z7.f30794r);
        sb2.append(this.f93675h);
        return sb2.toString();
    }
}
