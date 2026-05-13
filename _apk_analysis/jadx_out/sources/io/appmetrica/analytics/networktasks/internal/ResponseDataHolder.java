package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class ResponseDataHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f68311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f68312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f68313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ResponseValidityChecker f68314d;

    public ResponseDataHolder(@NonNull ResponseValidityChecker responseValidityChecker) {
        this.f68314d = responseValidityChecker;
    }

    public int getResponseCode() {
        return this.f68311a;
    }

    @Nullable
    public byte[] getResponseData() {
        return this.f68312b;
    }

    @Nullable
    public Map<String, List<String>> getResponseHeaders() {
        return this.f68313c;
    }

    public boolean isValidResponse() {
        return this.f68314d.isResponseValid(this.f68311a);
    }

    public void setResponseCode(int i10) {
        this.f68311a = i10;
    }

    public void setResponseData(@Nullable byte[] bArr) {
        this.f68312b = bArr;
    }

    public void setResponseHeaders(@Nullable Map<String, List<String>> map) {
        this.f68313c = map;
    }
}
