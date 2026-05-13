package com.inmobi.media;

/* JADX INFO: loaded from: classes9.dex */
public final class T9 {
    private final boolean GPID;

    public T9() {
        this(false, 1, null);
    }

    public T9(boolean z10) {
        this.GPID = z10;
    }

    public /* synthetic */ T9(boolean z10, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? true : z10);
    }

    public final boolean a() {
        return this.GPID;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof T9) && this.GPID == ((T9) obj).GPID;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.GPID);
    }

    public final String toString() {
        return "IncludeIdParams(GPID=" + this.GPID + ")";
    }
}
