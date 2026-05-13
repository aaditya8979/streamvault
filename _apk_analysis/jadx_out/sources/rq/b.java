package rq;

import java.util.Arrays;

/* JADX INFO: compiled from: ServletMapping.java */
/* JADX INFO: loaded from: classes9.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String[] f78931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f78932b;

    public String[] a() {
        return this.f78931a;
    }

    public String b() {
        return this.f78932b;
    }

    public void c(String str) {
        this.f78931a = new String[]{str};
    }

    public void d(String str) {
        this.f78932b = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String[] strArr = this.f78931a;
        sb2.append(strArr == null ? "[]" : Arrays.asList(strArr).toString());
        sb2.append("=>");
        sb2.append(this.f78932b);
        return sb2.toString();
    }
}
