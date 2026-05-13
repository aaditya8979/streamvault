package ir;

import com.ironsource.Z7;

/* JADX INFO: compiled from: ServerClientTokens.java */
/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f71781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f71782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f71783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f71784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f71785e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f71786f;

    public i() {
        this.f71781a = 1;
        this.f71782b = 0;
        this.f71783c = System.getProperty("os.name").replaceAll("[^a-zA-Z0-9\\.\\-_]", "");
        this.f71784d = System.getProperty("os.version").replaceAll("[^a-zA-Z0-9\\.\\-_]", "");
        this.f71785e = "Cling";
        this.f71786f = "2.0";
    }

    public i(int i10, int i11) {
        this.f71781a = 1;
        this.f71782b = 0;
        this.f71783c = System.getProperty("os.name").replaceAll("[^a-zA-Z0-9\\.\\-_]", "");
        this.f71784d = System.getProperty("os.version").replaceAll("[^a-zA-Z0-9\\.\\-_]", "");
        this.f71785e = "Cling";
        this.f71786f = "2.0";
        this.f71781a = i10;
        this.f71782b = i11;
    }

    public String a() {
        StringBuilder sb2 = new StringBuilder(256);
        sb2.append(this.f71783c.indexOf(32) != -1 ? this.f71783c.replace(' ', '_') : this.f71783c);
        sb2.append('/');
        sb2.append(this.f71784d.indexOf(32) != -1 ? this.f71784d.replace(' ', '_') : this.f71784d);
        sb2.append(" UPnP/");
        sb2.append(this.f71781a);
        sb2.append('.');
        sb2.append(this.f71782b);
        sb2.append(' ');
        sb2.append(this.f71785e.indexOf(32) != -1 ? this.f71785e.replace(' ', '_') : this.f71785e);
        sb2.append('/');
        sb2.append(this.f71786f.indexOf(32) != -1 ? this.f71786f.replace(' ', '_') : this.f71786f);
        return sb2.toString();
    }

    public int b() {
        return this.f71781a;
    }

    public int c() {
        return this.f71782b;
    }

    public String d() {
        return this.f71783c;
    }

    public String e() {
        return this.f71784d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f71781a == iVar.f71781a && this.f71782b == iVar.f71782b && this.f71783c.equals(iVar.f71783c) && this.f71784d.equals(iVar.f71784d) && this.f71785e.equals(iVar.f71785e) && this.f71786f.equals(iVar.f71786f);
    }

    public String f() {
        return this.f71785e;
    }

    public String g() {
        return this.f71786f;
    }

    public void h(int i10) {
        this.f71782b = i10;
    }

    public int hashCode() {
        return (((((((((this.f71781a * 31) + this.f71782b) * 31) + this.f71783c.hashCode()) * 31) + this.f71784d.hashCode()) * 31) + this.f71785e.hashCode()) * 31) + this.f71786f.hashCode();
    }

    public void i(String str) {
        this.f71783c = str;
    }

    public void j(String str) {
        this.f71784d = str;
    }

    public void k(String str) {
        this.f71785e = str;
    }

    public void l(String str) {
        this.f71786f = str;
    }

    public String toString() {
        return d() + "/" + e() + " UPnP/" + b() + "." + c() + Z7.f30794r + f() + "/" + g();
    }
}
