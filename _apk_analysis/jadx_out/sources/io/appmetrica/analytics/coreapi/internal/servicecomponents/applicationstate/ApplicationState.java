package io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.impl.A2;
import io.bidmachine.iab.vast.tags.VastAttributes;

/* JADX INFO: loaded from: classes2.dex */
public enum ApplicationState {
    UNKNOWN("unknown"),
    BACKGROUND(A2.f64965g),
    VISIBLE(VastAttributes.VISIBLE);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f64692a;

    ApplicationState(String str) {
        this.f64692a = str;
    }

    @NonNull
    public static ApplicationState fromString(@Nullable String str) {
        ApplicationState applicationState = UNKNOWN;
        for (ApplicationState applicationState2 : values()) {
            if (applicationState2.f64692a.equals(str)) {
                return applicationState2;
            }
        }
        return applicationState;
    }

    @NonNull
    public String getStringValue() {
        return this.f64692a;
    }
}
