package i5;

import com.google.android.exoplayer.metadata.emsg.EventMessage;

/* JADX INFO: compiled from: EventStream.java */
/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EventMessage[] f63762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f63763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f63764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f63765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f63766e;

    public e(String str, String str2, long j10, long[] jArr, EventMessage[] eventMessageArr) {
        this.f63764c = str;
        this.f63765d = str2;
        this.f63766e = j10;
        this.f63763b = jArr;
        this.f63762a = eventMessageArr;
    }

    public String a() {
        return this.f63764c + "/" + this.f63765d;
    }
}
