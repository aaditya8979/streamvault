package com.safedk.android.analytics.events.base;

import android.os.Bundle;
import android.text.TextUtils;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.StatsCollector;
import com.safedk.android.internal.b;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SdksMapping;
import com.safedk.android.utils.k;
import java.io.Serializable;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class StatsEvent implements Serializable, Comparable<StatsEvent> {
    public static final String A = "timestamp";
    public static final String B = "application";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f52826a = "StatsEvent";
    protected static final String ax = "sdk";
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected static final String f52827w = "sdk_version";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f52828x = "sdk_uuid";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected static final String f52829y = "isBackground";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f52830z = "event_type";
    protected String C;
    protected String D;
    protected StatsCollector.EventType E;
    String K;
    protected boolean I = true;
    protected boolean J = false;
    protected transient boolean az = false;
    protected boolean F = b.getInstance().isInBackground();
    protected long G = k.b(System.currentTimeMillis());
    protected int H = SafeDK.k();

    public StatsEvent(String str, StatsCollector.EventType eventType) {
        this.K = null;
        this.E = eventType;
        this.C = str;
        this.K = SdksMapping.getSdkUUIDByPackage(str);
        if (this.K == null) {
            Logger.d(f52826a, "sdk_null_check StatsEvent sdk = " + str);
        }
        Logger.d(f52826a, "StatsEvent ctor sdk=" + str);
    }

    public void a(long j10) {
        this.G = j10;
    }

    public abstract void a(StatsEvent statsEvent);

    public void a(boolean z10) {
        this.az = z10;
    }

    public boolean a_() {
        return this.I;
    }

    public abstract StatsCollector.EventType b();

    public void b(StatsEvent statsEvent) {
        if (b() != statsEvent.b()) {
            Logger.e(f52826a, "Cannot aggregate events of different types");
        } else {
            this.I |= statsEvent.I;
            a(statsEvent);
        }
    }

    public void b(boolean z10) {
        this.I = z10;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(StatsEvent statsEvent) {
        if (statsEvent == null) {
            throw new NullPointerException();
        }
        if (this.G == statsEvent.G) {
            return 0;
        }
        return this.G < statsEvent.G ? -1 : 1;
    }

    public abstract String c();

    public void c(boolean z10) {
        this.J = z10;
    }

    public Bundle e() {
        String str;
        Bundle bundle = new Bundle();
        if (this.C != null && this.K == null) {
            this.K = SdksMapping.getSdkUUIDByPackage(this.C);
            if (this.K == null) {
                this.K = this.C;
            }
        }
        if (this.K != null) {
            bundle.putString("sdk_uuid", this.K);
        }
        if (this.K != null && this.D == null && (str = SdksMapping.getAllSdkVersionsMap().get(this.K)) != null) {
            bundle.putString("sdk_version", str);
        }
        bundle.putString(f52830z, b().toString());
        bundle.putLong("timestamp", this.G);
        if (!TextUtils.isEmpty(this.D)) {
            bundle.putString("sdk_version", this.D);
        }
        return bundle;
    }

    public Set<String> f() {
        return null;
    }

    public boolean h() {
        return this.az;
    }

    public String i() {
        return this.C;
    }

    public long j() {
        return this.G;
    }

    protected long k() {
        return k.c(this.G);
    }

    public boolean l() {
        return this.J;
    }

    public String toString() {
        return e().toString();
    }
}
