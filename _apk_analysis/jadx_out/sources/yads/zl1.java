package yads;

import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zl1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f97653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f97654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wl1 f97655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f97656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f97657e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p51 f97658f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f97659g;

    public zl1(Uri uri, String str, wl1 wl1Var, List list, String str2, p51 p51Var, Object obj) {
        this.f97653a = uri;
        this.f97654b = str;
        this.f97655c = wl1Var;
        this.f97656d = list;
        this.f97657e = str2;
        this.f97658f = p51Var;
        l51 l51VarF = p51.f();
        if (p51Var.size() > 0) {
            ((dm1) p51Var.get(0)).a();
            throw null;
        }
        l51VarF.a();
        this.f97659g = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl1)) {
            return false;
        }
        zl1 zl1Var = (zl1) obj;
        return this.f97653a.equals(zl1Var.f97653a) && ib3.a(this.f97654b, zl1Var.f97654b) && ib3.a(this.f97655c, zl1Var.f97655c) && ib3.a((Object) null, (Object) null) && this.f97656d.equals(zl1Var.f97656d) && ib3.a(this.f97657e, zl1Var.f97657e) && this.f97658f.equals(zl1Var.f97658f) && ib3.a(this.f97659g, zl1Var.f97659g);
    }

    public final int hashCode() {
        int iHashCode = this.f97653a.hashCode() * 31;
        String str = this.f97654b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        wl1 wl1Var = this.f97655c;
        int iHashCode3 = (this.f97656d.hashCode() + ((iHashCode2 + (wl1Var == null ? 0 : wl1Var.hashCode())) * 961)) * 31;
        String str2 = this.f97657e;
        int iHashCode4 = (this.f97658f.hashCode() + ((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        Object obj = this.f97659g;
        return iHashCode4 + (obj != null ? obj.hashCode() : 0);
    }
}
