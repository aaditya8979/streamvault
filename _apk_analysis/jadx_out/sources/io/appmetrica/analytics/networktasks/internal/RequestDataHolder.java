package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class RequestDataHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private NetworkTask.Method f68306a = NetworkTask.Method.GET;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f68307b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f68308c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Long f68309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer f68310e;

    public void applySendTime(long j10) {
        this.f68309d = Long.valueOf(j10);
        this.f68310e = Integer.valueOf(((GregorianCalendar) Calendar.getInstance()).getTimeZone().getOffset(TimeUnit.MILLISECONDS.toSeconds(j10) * 1000) / 1000);
    }

    @NonNull
    public Map<String, List<String>> getHeaders() {
        return this.f68307b;
    }

    @NonNull
    public NetworkTask.Method getMethod() {
        return this.f68306a;
    }

    @Nullable
    public byte[] getPostData() {
        return this.f68308c;
    }

    @Nullable
    public Long getSendTimestamp() {
        return this.f68309d;
    }

    @Nullable
    public Integer getSendTimezoneSec() {
        return this.f68310e;
    }

    public void setHeader(@NonNull String str, @NonNull String... strArr) {
        this.f68307b.put(str, Arrays.asList(strArr));
    }

    public void setPostData(@Nullable byte[] bArr) {
        this.f68306a = NetworkTask.Method.POST;
        this.f68308c = bArr;
    }
}
