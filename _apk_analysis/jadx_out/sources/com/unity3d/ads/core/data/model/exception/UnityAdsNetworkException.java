package com.unity3d.ads.core.data.model.exception;

import com.unity3d.ads.core.data.model.OperationType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: UnityAdsNetworkException.kt */
/* JADX INFO: loaded from: classes2.dex */
public class UnityAdsNetworkException extends Exception {

    @Nullable
    private final String client;

    @Nullable
    private final Integer code;

    @Nullable
    private final Integer cronetCode;

    @NotNull
    private final String message;

    @Nullable
    private final String protocol;

    @NotNull
    private final OperationType type;

    @Nullable
    private final String url;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityAdsNetworkException(@NotNull String str, @NotNull OperationType operationType, @Nullable Integer num, @Nullable String str2, @Nullable String str3, @Nullable Integer num2, @Nullable String str4) {
        super(str);
        p.k(str, "message");
        p.k(operationType, "type");
        this.message = str;
        this.type = operationType;
        this.code = num;
        this.url = str2;
        this.protocol = str3;
        this.cronetCode = num2;
        this.client = str4;
    }

    public /* synthetic */ UnityAdsNetworkException(String str, OperationType operationType, Integer num, String str2, String str3, Integer num2, String str4, int i10, i iVar) {
        this(str, (i10 & 2) != 0 ? OperationType.UNKNOWN : operationType, (i10 & 4) != 0 ? null : num, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : num2, (i10 & 64) == 0 ? str4 : null);
    }

    @Nullable
    public final String getClient() {
        return this.client;
    }

    @Nullable
    public final Integer getCode() {
        return this.code;
    }

    @Nullable
    public final Integer getCronetCode() {
        return this.cronetCode;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return this.message;
    }

    @Nullable
    public final String getProtocol() {
        return this.protocol;
    }

    @NotNull
    public final OperationType getType() {
        return this.type;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }
}
