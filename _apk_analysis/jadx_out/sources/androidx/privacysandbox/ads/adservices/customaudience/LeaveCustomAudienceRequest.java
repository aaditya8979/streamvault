package androidx.privacysandbox.ads.adservices.customaudience;

import androidx.privacysandbox.ads.adservices.common.AdTechIdentifier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: LeaveCustomAudienceRequest.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class LeaveCustomAudienceRequest {

    @NotNull
    private final AdTechIdentifier buyer;

    @NotNull
    private final String name;

    public LeaveCustomAudienceRequest(@NotNull AdTechIdentifier adTechIdentifier, @NotNull String str) {
        p.k(adTechIdentifier, "buyer");
        p.k(str, "name");
        this.buyer = adTechIdentifier;
        this.name = str;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaveCustomAudienceRequest)) {
            return false;
        }
        LeaveCustomAudienceRequest leaveCustomAudienceRequest = (LeaveCustomAudienceRequest) obj;
        return p.f(this.buyer, leaveCustomAudienceRequest.buyer) && p.f(this.name, leaveCustomAudienceRequest.name);
    }

    @NotNull
    public final AdTechIdentifier getBuyer() {
        return this.buyer;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (this.buyer.hashCode() * 31) + this.name.hashCode();
    }

    @NotNull
    public String toString() {
        return "LeaveCustomAudience: buyer=" + this.buyer + ", name=" + this.name;
    }
}
