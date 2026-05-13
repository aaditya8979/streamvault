package kq;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.eclipse.jetty.security.UserDataConstraint;

/* JADX INFO: compiled from: RoleInfo.java */
/* JADX INFO: loaded from: classes11.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f73537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f73538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f73539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public UserDataConstraint f73540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set<String> f73541e = new CopyOnWriteArraySet();

    public void a(String str) {
        this.f73541e.add(str);
    }

    public void b(h hVar) {
        if (hVar.f73539c) {
            j(true);
        } else if (!hVar.f73538b) {
            i(true);
        } else if (hVar.f73537a) {
            h(true);
        } else if (!this.f73537a) {
            Iterator<String> it = hVar.f73541e.iterator();
            while (it.hasNext()) {
                this.f73541e.add(it.next());
            }
        }
        k(hVar.f73540d);
    }

    public Set<String> c() {
        return this.f73541e;
    }

    public UserDataConstraint d() {
        return this.f73540d;
    }

    public boolean e() {
        return this.f73537a;
    }

    public boolean f() {
        return this.f73538b;
    }

    public boolean g() {
        return this.f73539c;
    }

    public void h(boolean z10) {
        this.f73537a = z10;
        if (z10) {
            this.f73538b = true;
            this.f73541e.clear();
        }
    }

    public void i(boolean z10) {
        this.f73538b = z10;
        if (z10) {
            return;
        }
        this.f73539c = false;
        this.f73541e.clear();
        this.f73537a = false;
    }

    public void j(boolean z10) {
        this.f73539c = z10;
        if (z10) {
            this.f73538b = true;
            this.f73540d = null;
            this.f73537a = false;
            this.f73541e.clear();
        }
    }

    public void k(UserDataConstraint userDataConstraint) {
        if (userDataConstraint == null) {
            throw new NullPointerException("Null UserDataConstraint");
        }
        UserDataConstraint userDataConstraint2 = this.f73540d;
        if (userDataConstraint2 == null) {
            this.f73540d = userDataConstraint;
        } else {
            this.f73540d = userDataConstraint2.combine(userDataConstraint);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{RoleInfo");
        sb2.append(this.f73539c ? ",F" : "");
        sb2.append(this.f73538b ? ",C" : "");
        sb2.append(this.f73537a ? ",*" : this.f73541e);
        sb2.append(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f52302e);
        return sb2.toString();
    }
}
