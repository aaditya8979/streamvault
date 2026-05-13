package androidx.privacysandbox.ads.adservices.adid;

import com.ironsource.sdk.controller.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: AdId.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class AdId {

    @NotNull
    private final String adId;
    private final boolean isLimitAdTrackingEnabled;

    public AdId(@NotNull String str, boolean z10) {
        p.k(str, f.b.f33716c);
        this.adId = str;
        this.isLimitAdTrackingEnabled = z10;
    }

    public /* synthetic */ AdId(String str, boolean z10, int i10, i iVar) {
        this(str, (i10 & 2) != 0 ? false : z10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdId)) {
            return false;
        }
        AdId adId = (AdId) obj;
        return p.f(this.adId, adId.adId) && this.isLimitAdTrackingEnabled == adId.isLimitAdTrackingEnabled;
    }

    @NotNull
    public final String getAdId() {
        return this.adId;
    }

    public int hashCode() {
        return (this.adId.hashCode() * 31) + Boolean.hashCode(this.isLimitAdTrackingEnabled);
    }

    public final boolean isLimitAdTrackingEnabled() {
        return this.isLimitAdTrackingEnabled;
    }

    @NotNull
    public String toString() {
        return "AdId: adId=" + this.adId + ", isLimitAdTrackingEnabled=" + this.isLimitAdTrackingEnabled;
    }
}
