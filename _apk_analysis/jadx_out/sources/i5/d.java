package i5;

import a6.k0;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: Descriptor.java */
/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f63760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f63761c;

    public d(String str, @Nullable String str2, @Nullable String str3) {
        this.f63759a = str;
        this.f63760b = str2;
        this.f63761c = str3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return k0.c(this.f63759a, dVar.f63759a) && k0.c(this.f63760b, dVar.f63760b) && k0.c(this.f63761c, dVar.f63761c);
    }

    public int hashCode() {
        int iHashCode = this.f63759a.hashCode() * 31;
        String str = this.f63760b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f63761c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
