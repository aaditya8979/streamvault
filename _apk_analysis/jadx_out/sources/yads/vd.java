package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class vd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final td f96060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final td f96061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f96062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f96063d;

    public vd(td tdVar, td tdVar2, boolean z10, String str) {
        this.f96060a = tdVar;
        this.f96061b = tdVar2;
        this.f96062c = z10;
        this.f96063d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd)) {
            return false;
        }
        vd vdVar = (vd) obj;
        return tn.p.f(this.f96060a, vdVar.f96060a) && tn.p.f(this.f96061b, vdVar.f96061b) && this.f96062c == vdVar.f96062c && tn.p.f(this.f96063d, vdVar.f96063d);
    }

    public final int hashCode() {
        td tdVar = this.f96060a;
        int iHashCode = (tdVar == null ? 0 : tdVar.hashCode()) * 31;
        td tdVar2 = this.f96061b;
        int iHashCode2 = (Boolean.hashCode(this.f96062c) + ((iHashCode + (tdVar2 == null ? 0 : tdVar2.hashCode())) * 31)) * 31;
        String str = this.f96063d;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "AdvertisingInfoHolder(gmsAdvertisingInfo=" + this.f96060a + ", hmsAdvertisingInfo=" + this.f96061b + ", gmsAdvertisingReset=" + this.f96062c + ", appSetId=" + this.f96063d + ")";
    }
}
