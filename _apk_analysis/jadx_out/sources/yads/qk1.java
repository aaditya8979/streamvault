package yads;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class qk1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f94058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f94059c;

    public qk1(String str, boolean z10, boolean z11) {
        this.f94057a = str;
        this.f94058b = z10;
        this.f94059c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != qk1.class) {
            return false;
        }
        qk1 qk1Var = (qk1) obj;
        return TextUtils.equals(this.f94057a, qk1Var.f94057a) && this.f94058b == qk1Var.f94058b && this.f94059c == qk1Var.f94059c;
    }

    public final int hashCode() {
        return ((k4.a(this.f94057a, 31, 31) + (this.f94058b ? 1231 : 1237)) * 31) + (this.f94059c ? 1231 : 1237);
    }
}
