package com.applovin.shadow.okhttp3.internal.http2;

import com.applovin.shadow.okio.BufferedSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: PushObserver.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface PushObserver {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    @NotNull
    public static final PushObserver CANCEL = new Companion.PushObserverCancel();

    /* JADX INFO: compiled from: PushObserver.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* JADX INFO: compiled from: PushObserver.kt */
        public static final class PushObserverCancel implements PushObserver {
            @Override // com.applovin.shadow.okhttp3.internal.http2.PushObserver
            public boolean onData(int i10, @NotNull BufferedSource bufferedSource, int i11, boolean z10) throws IOException {
                p.k(bufferedSource, "source");
                bufferedSource.skip(i11);
                return true;
            }

            @Override // com.applovin.shadow.okhttp3.internal.http2.PushObserver
            public boolean onHeaders(int i10, @NotNull List<Header> list, boolean z10) {
                p.k(list, "responseHeaders");
                return true;
            }

            @Override // com.applovin.shadow.okhttp3.internal.http2.PushObserver
            public boolean onRequest(int i10, @NotNull List<Header> list) {
                p.k(list, "requestHeaders");
                return true;
            }

            @Override // com.applovin.shadow.okhttp3.internal.http2.PushObserver
            public void onReset(int i10, @NotNull ErrorCode errorCode) {
                p.k(errorCode, IronSourceConstants.EVENTS_ERROR_CODE);
            }
        }

        private Companion() {
        }
    }

    boolean onData(int i10, @NotNull BufferedSource bufferedSource, int i11, boolean z10) throws IOException;

    boolean onHeaders(int i10, @NotNull List<Header> list, boolean z10);

    boolean onRequest(int i10, @NotNull List<Header> list);

    void onReset(int i10, @NotNull ErrorCode errorCode);
}
