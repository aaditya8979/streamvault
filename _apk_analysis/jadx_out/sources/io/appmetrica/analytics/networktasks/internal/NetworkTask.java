package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes10.dex */
public class NetworkTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f68296a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f68297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IExecutionPolicy f68298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ExponentialBackoffPolicy f68299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final UnderlyingNetworkTask f68300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f68301f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f68302g;

    public enum Method {
        GET,
        POST
    }

    public interface ShouldTryNextHostCondition {
        boolean shouldTryNextHost(int i10);
    }

    public NetworkTask(@NonNull Executor executor, @NonNull IExecutionPolicy iExecutionPolicy, @NonNull ExponentialBackoffPolicy exponentialBackoffPolicy, @NonNull UnderlyingNetworkTask underlyingNetworkTask, @NonNull List<ShouldTryNextHostCondition> list, @NonNull String str) {
        this.f68297b = executor;
        this.f68298c = iExecutionPolicy;
        this.f68299d = exponentialBackoffPolicy;
        this.f68300e = underlyingNetworkTask;
        this.f68301f = list;
        this.f68302g = str;
    }

    private synchronized boolean a(int i10) {
        if (!a(i10)) {
            return false;
        }
        this.f68296a = i10;
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized boolean a(int... r14) {
        /*
            r13 = this;
            monitor-enter(r13)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L8c
            int r1 = r13.f68296a     // Catch: java.lang.Throwable -> L8c
            int r2 = r14.length     // Catch: java.lang.Throwable -> L8c
            r3 = 0
            r4 = r3
        L8:
            if (r4 >= r2) goto L81
            r5 = r14[r4]     // Catch: java.lang.Throwable -> L8c
            int r5 = io.appmetrica.analytics.networktasks.impl.e.a(r5)     // Catch: java.lang.Throwable -> L8c
            r6 = 6
            r7 = 5
            r8 = 4
            r9 = 2
            r10 = 3
            r11 = 9
            r12 = 1
            switch(r5) {
                case 0: goto L73;
                case 1: goto L6a;
                case 2: goto L60;
                case 3: goto L51;
                case 4: goto L47;
                case 5: goto L47;
                case 6: goto L42;
                case 7: goto L2c;
                case 8: goto L1f;
                default: goto L1b;
            }     // Catch: java.lang.Throwable -> L8c
        L1b:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L8c
            goto L74
        L1f:
            if (r1 != r12) goto L23
            goto L73
        L23:
            if (r1 == r11) goto L26
            goto L27
        L26:
            r12 = r3
        L27:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r12)     // Catch: java.lang.Throwable -> L8c
            goto L74
        L2c:
            if (r1 == r7) goto L3f
            if (r1 == r6) goto L3f
            r5 = 7
            if (r1 == r5) goto L3f
            if (r1 == r9) goto L3f
            if (r1 == r10) goto L3f
            if (r1 != r8) goto L3a
            goto L3f
        L3a:
            if (r1 != r11) goto L73
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L8c
            goto L74
        L3f:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L8c
            goto L74
        L42:
            if (r1 != r10) goto L60
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L8c
            goto L74
        L47:
            if (r1 != r8) goto L4c
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L8c
            goto L74
        L4c:
            if (r1 != r11) goto L73
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L8c
            goto L74
        L51:
            if (r1 == r10) goto L5d
            if (r1 == r7) goto L5d
            if (r1 != r6) goto L58
            goto L5d
        L58:
            if (r1 != r11) goto L73
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L8c
            goto L74
        L5d:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L8c
            goto L74
        L60:
            if (r1 != r9) goto L65
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L8c
            goto L74
        L65:
            if (r1 != r11) goto L73
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L8c
            goto L74
        L6a:
            if (r1 != r12) goto L6d
            goto L6e
        L6d:
            r12 = r3
        L6e:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r12)     // Catch: java.lang.Throwable -> L8c
            goto L74
        L73:
            r5 = 0
        L74:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L8c
            boolean r6 = r6.equals(r5)     // Catch: java.lang.Throwable -> L8c
            if (r6 != 0) goto L7e
            r0 = r5
            goto L81
        L7e:
            int r4 = r4 + 1
            goto L8
        L81:
            java.lang.Boolean r14 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L8c
            r14.equals(r0)     // Catch: java.lang.Throwable -> L8c
            boolean r14 = r14.equals(r0)     // Catch: java.lang.Throwable -> L8c
            monitor-exit(r13)
            return r14
        L8c:
            r14 = move-exception
            monitor-exit(r13)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.networktasks.internal.NetworkTask.a(int[]):boolean");
    }

    @NonNull
    public String description() {
        return this.f68300e.description();
    }

    @NonNull
    public IExecutionPolicy getConnectionExecutionPolicy() {
        return this.f68298c;
    }

    @NonNull
    public Executor getExecutor() {
        return this.f68297b;
    }

    @NonNull
    public ExponentialBackoffPolicy getExponentialBackoffPolicy() {
        return this.f68299d;
    }

    @NonNull
    public RequestDataHolder getRequestDataHolder() {
        return this.f68300e.getRequestDataHolder();
    }

    @NonNull
    public ResponseDataHolder getResponseDataHolder() {
        return this.f68300e.getResponseDataHolder();
    }

    @Nullable
    public RetryPolicyConfig getRetryPolicyConfig() {
        return this.f68300e.getRetryPolicyConfig();
    }

    @Nullable
    public SSLSocketFactory getSslSocketFactory() {
        return this.f68300e.getSslSocketFactory();
    }

    @NonNull
    public UnderlyingNetworkTask getUnderlyingTask() {
        return this.f68300e;
    }

    @Nullable
    public String getUrl() {
        return this.f68300e.getFullUrlFormer().getUrl();
    }

    @NonNull
    public String getUserAgent() {
        return this.f68302g;
    }

    public boolean isRemoved() {
        return this.f68296a == 9;
    }

    public boolean onCreateNetworkTask() {
        if (a(3)) {
            return this.f68300e.onCreateTask();
        }
        return false;
    }

    public boolean onPerformRequest() {
        boolean zA = a(4);
        if (zA) {
            this.f68300e.getFullUrlFormer().incrementAttemptNumber();
            this.f68300e.getFullUrlFormer().buildAndSetFullHostUrl();
            this.f68300e.onPerformRequest();
        }
        return zA;
    }

    public boolean onRequestComplete() {
        boolean z10;
        boolean z11;
        synchronized (this) {
            z10 = false;
            if (a(5, 6)) {
                boolean zOnRequestComplete = this.f68300e.onRequestComplete();
                if (zOnRequestComplete) {
                    this.f68296a = 5;
                } else {
                    this.f68296a = 6;
                }
                z11 = zOnRequestComplete;
                z10 = true;
            } else {
                z11 = false;
            }
        }
        if (z10) {
            this.f68300e.onPostRequestComplete(z11);
        }
        return z11;
    }

    public void onRequestError(@Nullable Throwable th2) {
        if (a(6)) {
            this.f68300e.onRequestError(th2);
        }
    }

    public void onShouldNotExecute() {
        if (a(7)) {
            this.f68300e.onShouldNotExecute();
        }
    }

    public boolean onTaskAdded() {
        boolean zA = a(2);
        if (zA) {
            this.f68300e.onTaskAdded();
        }
        return zA;
    }

    public void onTaskFinished() {
        int i10;
        boolean zA;
        synchronized (this) {
            i10 = this.f68296a;
            zA = a(8);
        }
        if (zA) {
            this.f68300e.onTaskFinished();
            if (i10 == 5) {
                this.f68300e.onSuccessfulTaskFinished();
            } else if (i10 == 6 || i10 == 7) {
                this.f68300e.onUnsuccessfulTaskFinished();
            }
        }
    }

    public void onTaskRemoved() {
        if (a(9)) {
            this.f68300e.onTaskRemoved();
        }
    }

    public synchronized boolean shouldTryNextHost() {
        boolean z10;
        boolean z11;
        boolean zHasMoreHosts = this.f68300e.getFullUrlFormer().hasMoreHosts();
        int responseCode = this.f68300e.getResponseDataHolder().getResponseCode();
        Iterator it = this.f68301f.iterator();
        while (true) {
            z10 = false;
            if (!it.hasNext()) {
                z11 = true;
                break;
            }
            if (!((ShouldTryNextHostCondition) it.next()).shouldTryNextHost(responseCode)) {
                z11 = false;
                break;
            }
        }
        int i10 = this.f68296a;
        if (i10 != 9 && i10 != 8 && zHasMoreHosts && z11) {
            z10 = true;
        }
        return z10;
    }
}
