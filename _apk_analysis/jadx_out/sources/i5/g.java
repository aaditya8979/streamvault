package i5;

import a6.k0;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: ProgramInformation.java */
/* JADX INFO: loaded from: classes7.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f63772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f63773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f63774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f63775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final String f63776e;

    public g(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.f63772a = str;
        this.f63773b = str2;
        this.f63774c = str3;
        this.f63775d = str4;
        this.f63776e = str5;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return k0.c(this.f63772a, gVar.f63772a) && k0.c(this.f63773b, gVar.f63773b) && k0.c(this.f63774c, gVar.f63774c) && k0.c(this.f63775d, gVar.f63775d) && k0.c(this.f63776e, gVar.f63776e);
    }

    public int hashCode() {
        String str = this.f63772a;
        int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f63773b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f63774c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f63775d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f63776e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
