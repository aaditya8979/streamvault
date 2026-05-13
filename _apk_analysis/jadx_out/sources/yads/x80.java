package yads;

import com.yandex.mobile.ads.R$attr;
import com.yandex.mobile.ads.R$style;

/* JADX INFO: loaded from: classes8.dex */
public final class x80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f96656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f96657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f96658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f96659d;

    public x80(String str, int i10, Integer num, int i11) {
        this.f96656a = str;
        this.f96657b = i10;
        this.f96658c = num;
        this.f96659d = i11;
    }

    public /* synthetic */ x80(String str, int i10, Integer num, int i11, int i12) {
        this(str, (i12 & 2) != 0 ? R$attr.debug_panel_label_primary : i10, (i12 & 4) != 0 ? null : num, (i12 & 8) != 0 ? R$style.DebugPanelText_Body1 : i11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x80)) {
            return false;
        }
        x80 x80Var = (x80) obj;
        return tn.p.f(this.f96656a, x80Var.f96656a) && this.f96657b == x80Var.f96657b && tn.p.f(this.f96658c, x80Var.f96658c) && this.f96659d == x80Var.f96659d;
    }

    public final int hashCode() {
        int iA = nd3.a(this.f96657b, this.f96656a.hashCode() * 31, 31);
        Integer num = this.f96658c;
        return Integer.hashCode(this.f96659d) + ((iA + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        return "DebugPanelTextWithIcon(text=" + this.f96656a + ", color=" + this.f96657b + ", icon=" + this.f96658c + ", style=" + this.f96659d + ")";
    }
}
