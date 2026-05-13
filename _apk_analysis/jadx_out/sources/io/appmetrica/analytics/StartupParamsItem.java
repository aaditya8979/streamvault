package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class StartupParamsItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f64415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final StartupParamsItemStatus f64416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f64417c;

    public StartupParamsItem(@Nullable String str, @NonNull StartupParamsItemStatus startupParamsItemStatus, @Nullable String str2) {
        this.f64415a = str;
        this.f64416b = startupParamsItemStatus;
        this.f64417c = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StartupParamsItem.class != obj.getClass()) {
            return false;
        }
        StartupParamsItem startupParamsItem = (StartupParamsItem) obj;
        return Objects.equals(this.f64415a, startupParamsItem.f64415a) && this.f64416b == startupParamsItem.f64416b && Objects.equals(this.f64417c, startupParamsItem.f64417c);
    }

    @Nullable
    public String getErrorDetails() {
        return this.f64417c;
    }

    @Nullable
    public String getId() {
        return this.f64415a;
    }

    @NonNull
    public StartupParamsItemStatus getStatus() {
        return this.f64416b;
    }

    public int hashCode() {
        return Objects.hash(this.f64415a, this.f64416b, this.f64417c);
    }

    @NonNull
    public String toString() {
        return "StartupParamsItem{id='" + this.f64415a + "', status=" + this.f64416b + ", errorDetails='" + this.f64417c + "'}";
    }
}
