package com.unity3d.mediation;

import com.ironsource.Z7;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.controller.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: loaded from: classes3.dex */
public final class LevelPlayAdError {

    @NotNull
    public static final a Companion = new a(null);
    public static final int ERROR_CODE_INVALID_AD_UNIT_ID = 626;
    public static final int ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK = 625;
    public static final int ERROR_CODE_LOAD_FAILED_ALREADY_CALLED = 627;
    public static final int ERROR_CODE_LOAD_WHILE_SHOW = 629;
    public static final int ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED = 624;
    public static final int ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK = 628;
    public static final int ERROR_CODE_SHOW_WHILE_LOAD = 631;
    public static final int ERROR_CODE_SHOW_WHILE_SHOW = 630;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final IronSourceError f53472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f53473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f53474c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public LevelPlayAdError(@Nullable IronSourceError ironSourceError, @NotNull String str, @Nullable String str2) {
        p.k(str, f.b.f33716c);
        this.f53472a = ironSourceError;
        this.f53473b = str;
        this.f53474c = str2;
    }

    public /* synthetic */ LevelPlayAdError(IronSourceError ironSourceError, String str, String str2, int i10, i iVar) {
        this(ironSourceError, str, (i10 & 4) != 0 ? null : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayAdError(@NotNull String str, @NotNull String str2, int i10, @NotNull String str3) {
        this(new IronSourceError(i10, str3), str, str2);
        p.k(str, f.b.f33716c);
        p.k(str2, "adUnitId");
        p.k(str3, "errorMessage");
    }

    @NotNull
    public final String getAdId() {
        return this.f53473b;
    }

    @Nullable
    public final String getAdUnitId() {
        return this.f53474c;
    }

    public final int getErrorCode() {
        IronSourceError ironSourceError = this.f53472a;
        if (ironSourceError != null) {
            return ironSourceError.getErrorCode();
        }
        return 0;
    }

    @NotNull
    public final String getErrorMessage() {
        IronSourceError ironSourceError = this.f53472a;
        String errorMessage = ironSourceError != null ? ironSourceError.getErrorMessage() : null;
        return errorMessage == null ? "" : errorMessage;
    }

    @NotNull
    public String toString() {
        String str = this.f53474c;
        IronSourceError ironSourceError = this.f53472a;
        return "adUnitId: " + str + Z7.f30794r + (ironSourceError != null ? ironSourceError.toString() : null);
    }
}
