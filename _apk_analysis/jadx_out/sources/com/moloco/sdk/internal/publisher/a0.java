package com.moloco.sdk.internal.publisher;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.AdFormatType;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 0)
public final class a0 implements p0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f46499e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f46500f = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final AdFormatType f46501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f46502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f46503d;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public a0(AdFormatType adFormatType, long j10) {
        tn.p.k(adFormatType, "adFormatType");
        this.f46501b = adFormatType;
        this.f46502c = j10;
    }

    public /* synthetic */ a0(AdFormatType adFormatType, long j10, tn.i iVar) {
        this(adFormatType, j10);
    }

    public final long a(long j10) {
        long jB = j10 - b();
        long jT = co.d.t(co.b.q(this.f46502c) - jB, DurationUnit.MILLISECONDS);
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "AdCreateLoadTimeoutManager", this.f46501b + " timeout: " + ((Object) co.b.M(this.f46502c)) + " , create ad duration: " + jB + " ms (createTime: " + b() + " ms, loadStartTime: " + j10 + " ms). Return value: " + ((Object) co.b.M(jT)), false, 4, null);
        return jT;
    }

    public long b() {
        return this.f46503d;
    }

    @Override // com.moloco.sdk.internal.publisher.p0
    public void setCreateAdObjectStartTime(long j10) {
        this.f46503d = j10;
    }
}
