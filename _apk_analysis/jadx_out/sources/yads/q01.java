package yads;

import android.text.TextUtils;
import com.ironsource.C3978d4;

/* JADX INFO: loaded from: classes10.dex */
public final class q01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f93850b;

    public q01(String str, String str2) {
        this.f93849a = str;
        this.f93850b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q01.class != obj.getClass()) {
            return false;
        }
        q01 q01Var = (q01) obj;
        return TextUtils.equals(this.f93849a, q01Var.f93849a) && TextUtils.equals(this.f93850b, q01Var.f93850b);
    }

    public final int hashCode() {
        return this.f93850b.hashCode() + (this.f93849a.hashCode() * 31);
    }

    public final String toString() {
        return "Header[name=" + this.f93849a + ",value=" + this.f93850b + C3978d4.j.f31385e;
    }
}
