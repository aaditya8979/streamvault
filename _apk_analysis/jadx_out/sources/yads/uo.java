package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class uo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f95730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f95731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f95732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f95733d;

    public uo(int i10, int i11, String str, String str2) {
        this.f95730a = str;
        this.f95731b = str2;
        this.f95732c = i10;
        this.f95733d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uo)) {
            return false;
        }
        uo uoVar = (uo) obj;
        return this.f95732c == uoVar.f95732c && this.f95733d == uoVar.f95733d && l92.a(this.f95730a, uoVar.f95730a) && l92.a(this.f95731b, uoVar.f95731b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f95730a, this.f95731b, Integer.valueOf(this.f95732c), Integer.valueOf(this.f95733d)});
    }
}
