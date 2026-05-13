package com.unity3d.services.core.network.core;

import bn.r;
import com.vungle.ads.internal.ui.AdActivity;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import kotlin.Result;
import kotlin.c;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: UnityAdsUrlRequestCallback.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class UnityAdsUrlRequestCallback extends UrlRequest.Callback {
    private static final int BYTE_BUFFER_CAPACITY_BYTES = 16384;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final ByteArrayOutputStream bytesReceived;
    private final WritableByteChannel receiveChannel;

    /* JADX INFO: compiled from: UnityAdsUrlRequestCallback.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public UnityAdsUrlRequestCallback() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.bytesReceived = byteArrayOutputStream;
        this.receiveChannel = Channels.newChannel(byteArrayOutputStream);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onReadCompleted(@NotNull UrlRequest urlRequest, @NotNull UrlResponseInfo urlResponseInfo, @NotNull ByteBuffer byteBuffer) {
        Object objM7534constructorimpl;
        p.k(urlRequest, AdActivity.REQUEST_KEY_EXTRA);
        p.k(urlResponseInfo, "info");
        p.k(byteBuffer, "byteBuffer");
        byteBuffer.flip();
        try {
            Result.a aVar = Result.Companion;
            this.receiveChannel.write(byteBuffer);
            byteBuffer.clear();
            urlRequest.read(byteBuffer);
            objM7534constructorimpl = Result.m7534constructorimpl(r.f5635a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(c.a(th2));
        }
        if (Result.m7537exceptionOrNullimpl(objM7534constructorimpl) != null) {
            urlRequest.cancel();
            onFailed(urlRequest, urlResponseInfo, null);
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onRedirectReceived(@NotNull UrlRequest urlRequest, @Nullable UrlResponseInfo urlResponseInfo, @Nullable String str) {
        p.k(urlRequest, AdActivity.REQUEST_KEY_EXTRA);
        urlRequest.followRedirect();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(@NotNull UrlRequest urlRequest, @NotNull UrlResponseInfo urlResponseInfo) {
        p.k(urlRequest, AdActivity.REQUEST_KEY_EXTRA);
        p.k(urlResponseInfo, "info");
        urlRequest.read(ByteBuffer.allocateDirect(16384));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(@NotNull UrlRequest urlRequest, @NotNull UrlResponseInfo urlResponseInfo) {
        Object objM7534constructorimpl;
        p.k(urlRequest, AdActivity.REQUEST_KEY_EXTRA);
        p.k(urlResponseInfo, "info");
        try {
            Result.a aVar = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(this.bytesReceived.toByteArray());
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(c.a(th2));
        }
        if (Result.m7540isSuccessimpl(objM7534constructorimpl)) {
            byte[] bArr = (byte[]) objM7534constructorimpl;
            p.j(bArr, "bodyBytes");
            onSucceeded(urlRequest, urlResponseInfo, bArr);
        }
        if (Result.m7537exceptionOrNullimpl(objM7534constructorimpl) != null) {
            onFailed(urlRequest, urlResponseInfo, null);
        }
    }

    public abstract void onSucceeded(@NotNull UrlRequest urlRequest, @NotNull UrlResponseInfo urlResponseInfo, @NotNull byte[] bArr);
}
