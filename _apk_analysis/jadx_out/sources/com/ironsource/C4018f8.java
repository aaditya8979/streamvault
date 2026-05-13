package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.f8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4018f8 extends Throwable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final IronSourceError f31689a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4018f8(@NotNull IronSourceError ironSourceError) {
        super(ironSourceError.getErrorMessage());
        tn.p.k(ironSourceError, "error");
        this.f31689a = ironSourceError;
    }

    @NotNull
    public final IronSourceError a() {
        return this.f31689a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !tn.p.f(C4018f8.class, obj.getClass())) {
            return false;
        }
        C4018f8 c4018f8 = (C4018f8) obj;
        if (this.f31689a.getErrorCode() != c4018f8.f31689a.getErrorCode()) {
            return false;
        }
        return tn.p.f(this.f31689a.getErrorMessage(), c4018f8.f31689a.getErrorMessage());
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f31689a.getErrorCode()), this.f31689a.getErrorMessage());
    }
}
