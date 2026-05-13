package com.inmobi.media.core.config.models;

import androidx.annotation.Keep;
import androidx.core.graphics.drawable.IconCompat;
import com.inmobi.media.A8;
import com.inmobi.media.AbstractC3581ma;
import com.inmobi.media.T9;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import tn.p;

/* JADX INFO: loaded from: classes7.dex */
@Keep
public abstract class Config {

    @NotNull
    private T9 includeIds = new T9(false, 1, null);

    @A8
    private long lastUpdateTimeStamp;

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof Config) && p.f(getType(), ((Config) obj).getType());
    }

    @NotNull
    public final T9 getIncludeIdParams() {
        return this.includeIds;
    }

    @NotNull
    public final T9 getIncludeIds() {
        return this.includeIds;
    }

    public final long getLastUpdateTimeStamp() {
        return this.lastUpdateTimeStamp;
    }

    @NotNull
    public abstract String getType();

    public int hashCode() {
        return getType().hashCode();
    }

    public abstract boolean isValid();

    public final void setIncludeIds(@NotNull T9 t92) {
        p.k(t92, "<set-?>");
        this.includeIds = t92;
    }

    public final void setLastUpdateTimeStamp(long j10) {
        this.lastUpdateTimeStamp = j10;
    }

    @NotNull
    public final JSONObject toJson() {
        p.k(this, IconCompat.EXTRA_OBJ);
        JSONObject jSONObjectA = AbstractC3581ma.a(this, getClass());
        return jSONObjectA == null ? new JSONObject() : jSONObjectA;
    }
}
