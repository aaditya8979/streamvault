package com.moloco.sdk.publisher;

import androidx.compose.runtime.internal.StabilityInferred;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import io.bidmachine.unified.UnifiedMediationParams;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 1)
public final class MolocoInitStatus {
    public static final int $stable = 0;

    @NotNull
    private final String description;

    @NotNull
    private final Initialization initialization;

    public MolocoInitStatus(@NotNull Initialization initialization, @NotNull String str) {
        p.k(initialization, GatewayException.GATEWAY_RESPONSE_DEPTH_INITIALIZATION);
        p.k(str, UnifiedMediationParams.KEY_DESCRIPTION);
        this.initialization = initialization;
        this.description = str;
    }

    public static /* synthetic */ MolocoInitStatus copy$default(MolocoInitStatus molocoInitStatus, Initialization initialization, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            initialization = molocoInitStatus.initialization;
        }
        if ((i10 & 2) != 0) {
            str = molocoInitStatus.description;
        }
        return molocoInitStatus.copy(initialization, str);
    }

    @NotNull
    public final Initialization component1() {
        return this.initialization;
    }

    @NotNull
    public final String component2() {
        return this.description;
    }

    @NotNull
    public final MolocoInitStatus copy(@NotNull Initialization initialization, @NotNull String str) {
        p.k(initialization, GatewayException.GATEWAY_RESPONSE_DEPTH_INITIALIZATION);
        p.k(str, UnifiedMediationParams.KEY_DESCRIPTION);
        return new MolocoInitStatus(initialization, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MolocoInitStatus)) {
            return false;
        }
        MolocoInitStatus molocoInitStatus = (MolocoInitStatus) obj;
        return this.initialization == molocoInitStatus.initialization && p.f(this.description, molocoInitStatus.description);
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final Initialization getInitialization() {
        return this.initialization;
    }

    public int hashCode() {
        return (this.initialization.hashCode() * 31) + this.description.hashCode();
    }

    @NotNull
    public String toString() {
        return "MolocoInitStatus(initialization=" + this.initialization + ", description=" + this.description + ')';
    }
}
