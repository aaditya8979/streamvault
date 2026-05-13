package yads;

/* JADX INFO: loaded from: classes8.dex */
public final class my2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f92645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f92646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f92647d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yz2 f92648e;

    public my2(String str, Long l10, boolean z10, boolean z11, yz2 yz2Var) {
        this.f92644a = str;
        this.f92645b = l10;
        this.f92646c = z10;
        this.f92647d = z11;
        this.f92648e = yz2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof my2)) {
            return false;
        }
        my2 my2Var = (my2) obj;
        return tn.p.f(this.f92644a, my2Var.f92644a) && tn.p.f(this.f92645b, my2Var.f92645b) && this.f92646c == my2Var.f92646c && this.f92647d == my2Var.f92647d && tn.p.f(this.f92648e, my2Var.f92648e);
    }

    public final int hashCode() {
        String str = this.f92644a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l10 = this.f92645b;
        int iHashCode2 = (Boolean.hashCode(this.f92647d) + ((Boolean.hashCode(this.f92646c) + ((iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31)) * 31)) * 31;
        yz2 yz2Var = this.f92648e;
        return iHashCode2 + (yz2Var != null ? yz2Var.hashCode() : 0);
    }

    public final String toString() {
        return "Settings(templateType=" + this.f92644a + ", multiBannerAutoScrollInterval=" + this.f92645b + ", isHighlightingEnabled=" + this.f92646c + ", isLoopingVideo=" + this.f92647d + ", mediaAssetImageFallbackSize=" + this.f92648e + ")";
    }
}
