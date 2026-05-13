package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import r7.k;
import s7.m0;

/* JADX INFO: loaded from: classes4.dex */
public final class HttpDataSource$InvalidResponseCodeException extends HttpDataSource$HttpDataSourceException {
    public final Map<String, List<String>> headerFields;
    public final byte[] responseBody;
    public final int responseCode;

    @Nullable
    public final String responseMessage;

    public HttpDataSource$InvalidResponseCodeException(int i10, @Nullable String str, @Nullable IOException iOException, Map<String, List<String>> map, k kVar, byte[] bArr) {
        super("Response code: " + i10, iOException, kVar, 2004, 1);
        this.responseCode = i10;
        this.responseMessage = str;
        this.headerFields = map;
        this.responseBody = bArr;
    }

    @Deprecated
    public HttpDataSource$InvalidResponseCodeException(int i10, @Nullable String str, Map<String, List<String>> map, k kVar) {
        this(i10, str, null, map, kVar, m0.f79492f);
    }

    @Deprecated
    public HttpDataSource$InvalidResponseCodeException(int i10, Map<String, List<String>> map, k kVar) {
        this(i10, null, null, map, kVar, m0.f79492f);
    }
}
