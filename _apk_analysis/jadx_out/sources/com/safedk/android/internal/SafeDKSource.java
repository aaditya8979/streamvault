package com.safedk.android.internal;

import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.NetworkBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.annotations.SDKDependancy;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.Buffer;
import okio.BufferedSource;
import okio.Okio;
import okio.Source;
import okio.Timeout;

/* JADX INFO: loaded from: classes12.dex */
@SDKDependancy(packageName = "okio")
public class SafeDKSource implements Source {
    private static final String TAG = "SafeDKSource";
    private int bodyId;
    private final Source delegate;

    private SafeDKSource(BufferedSource bufferedSource, int i10) {
        this.delegate = bufferedSource;
        this.bodyId = i10;
    }

    public static BufferedSource create(BufferedSource bufferedSource, int i10) {
        return Okio.buffer(new SafeDKSource(bufferedSource, i10));
    }

    public void ForwardingSource_close() throws IOException {
        this.delegate.close();
    }

    public long ForwardingSource_read(Buffer buffer, long j10) throws IOException {
        return this.delegate.read(buffer, j10);
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ForwardingSource_close();
        NetworkBridge.RequestInfo requestInfoRemove = NetworkBridge.f53039b.remove(Integer.valueOf(this.bodyId));
        requestInfoRemove.c();
        Logger.v(TAG, "retrofit closing. package: " + requestInfoRemove.a() + ", url: " + requestInfoRemove.b() + ", value: ");
        CreativeInfoManager.a(requestInfoRemove.a(), requestInfoRemove.b(), requestInfoRemove.c(), (Map<String, List<String>>) null);
    }

    public final Source delegate() {
        return this.delegate;
    }

    @Override // okio.Source
    public long read(Buffer buffer, long j10) throws IOException {
        try {
            long jForwardingSource_read = ForwardingSource_read(buffer, j10);
            Logger.v(TAG, "retrofit read " + j10 + " actual " + jForwardingSource_read);
            if (jForwardingSource_read > 0) {
                NetworkBridge.RequestInfo requestInfo = NetworkBridge.f53039b.get(Integer.valueOf(this.bodyId));
                if (requestInfo != null) {
                    byte[] byteArray = buffer.snapshot().toByteArray();
                    Logger.v(TAG, "retrofit read updating buffer" + byteArray);
                    requestInfo.a(byteArray, jForwardingSource_read);
                } else {
                    Logger.v(TAG, "retrofit read cant find bodyId " + this.bodyId);
                }
            }
            return jForwardingSource_read;
        } catch (IOException e10) {
            Logger.e(TAG, "retrofit SafeDKSource :" + e10.getMessage());
            throw e10;
        }
    }

    @Override // okio.Source
    public Timeout timeout() {
        return this.delegate.timeout();
    }
}
