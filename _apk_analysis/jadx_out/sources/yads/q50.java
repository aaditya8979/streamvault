package yads;

import com.yandex.mobile.ads.R$style;

/* JADX INFO: loaded from: classes10.dex */
public final class q50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f93891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f93892c;

    public q50(int i10, int i11, String str) {
        this.f93890a = str;
        this.f93891b = i10;
        this.f93892c = i11;
    }

    public /* synthetic */ q50(String str, int i10) {
        this(i10, R$style.DebugPanelText_Body2, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q50)) {
            return false;
        }
        q50 q50Var = (q50) obj;
        return tn.p.f(this.f93890a, q50Var.f93890a) && this.f93891b == q50Var.f93891b && this.f93892c == q50Var.f93892c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f93892c) + nd3.a(this.f93891b, this.f93890a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "DebugPanelColoredText(text=" + this.f93890a + ", color=" + this.f93891b + ", style=" + this.f93892c + ")";
    }
}
