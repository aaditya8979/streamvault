package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.io.Compressor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import io.appmetrica.analytics.networktasks.internal.DefaultResponseParser;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public class SendingDataTaskHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RequestBodyEncrypter f68315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Compressor f68316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TimeProvider f68317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final RequestDataHolder f68318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ResponseDataHolder f68319e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final NetworkResponseHandler f68320f;

    public SendingDataTaskHelper(@NonNull RequestBodyEncrypter requestBodyEncrypter, @NonNull Compressor compressor, @NonNull TimeProvider timeProvider, @NonNull RequestDataHolder requestDataHolder, @NonNull ResponseDataHolder responseDataHolder, @NonNull NetworkResponseHandler<DefaultResponseParser.Response> networkResponseHandler) {
        this.f68315a = requestBodyEncrypter;
        this.f68316b = compressor;
        this.f68317c = timeProvider;
        this.f68318d = requestDataHolder;
        this.f68319e = responseDataHolder;
        this.f68320f = networkResponseHandler;
    }

    public SendingDataTaskHelper(@NonNull RequestBodyEncrypter requestBodyEncrypter, @NonNull Compressor compressor, @NonNull RequestDataHolder requestDataHolder, @NonNull ResponseDataHolder responseDataHolder, @NonNull NetworkResponseHandler<DefaultResponseParser.Response> networkResponseHandler) {
        this(requestBodyEncrypter, compressor, new SystemTimeProvider(), requestDataHolder, responseDataHolder, networkResponseHandler);
    }

    public boolean isResponseValid() {
        DefaultResponseParser.Response response = (DefaultResponseParser.Response) this.f68320f.handle(this.f68319e);
        return response != null && "accepted".equals(response.mStatus);
    }

    public void onPerformRequest() {
        this.f68318d.applySendTime(this.f68317c.currentTimeMillis());
    }

    public boolean prepareAndSetPostData(@NonNull byte[] bArr) {
        byte[] bArrEncrypt;
        try {
            byte[] bArrCompress = this.f68316b.compress(bArr);
            if (bArrCompress == null || (bArrEncrypt = this.f68315a.encrypt(bArrCompress)) == null) {
                return false;
            }
            this.f68318d.setPostData(bArrEncrypt);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
