package androidx.privacysandbox.ads.adservices.common;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: AdSelectionSignals.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class AdSelectionSignals {

    @NotNull
    private final String signals;

    public AdSelectionSignals(@NotNull String str) {
        p.k(str, "signals");
        this.signals = str;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AdSelectionSignals) {
            return p.f(this.signals, ((AdSelectionSignals) obj).signals);
        }
        return false;
    }

    @NotNull
    public final String getSignals() {
        return this.signals;
    }

    public int hashCode() {
        return this.signals.hashCode();
    }

    @NotNull
    public String toString() {
        return "AdSelectionSignals: " + this.signals;
    }
}
