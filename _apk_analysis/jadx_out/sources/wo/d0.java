package wo;

import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ElementMarker.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class d0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f86487e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final long[] f86488f = new long[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SerialDescriptor f86489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final sn.p<SerialDescriptor, Integer, Boolean> f86490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f86491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final long[] f86492d;

    /* JADX INFO: compiled from: ElementMarker.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d0(@NotNull SerialDescriptor serialDescriptor, @NotNull sn.p<? super SerialDescriptor, ? super Integer, Boolean> pVar) {
        tn.p.k(serialDescriptor, "descriptor");
        tn.p.k(pVar, "readIfAbsent");
        this.f86489a = serialDescriptor;
        this.f86490b = pVar;
        int iE = serialDescriptor.e();
        if (iE <= 64) {
            this.f86491c = iE != 64 ? (-1) << iE : 0L;
            this.f86492d = f86488f;
        } else {
            this.f86491c = 0L;
            this.f86492d = e(iE);
        }
    }

    public final void a(int i10) {
        if (i10 < 64) {
            this.f86491c |= 1 << i10;
        } else {
            b(i10);
        }
    }

    public final void b(int i10) {
        int i11 = (i10 >>> 6) - 1;
        long[] jArr = this.f86492d;
        jArr[i11] = jArr[i11] | (1 << (i10 & 63));
    }

    public final int c() {
        int length = this.f86492d.length;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            int i12 = i11 * 64;
            long j10 = this.f86492d[i10];
            while (j10 != -1) {
                int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j10);
                j10 |= 1 << iNumberOfTrailingZeros;
                int i13 = iNumberOfTrailingZeros + i12;
                if (this.f86490b.mo2invoke(this.f86489a, Integer.valueOf(i13)).booleanValue()) {
                    this.f86492d[i10] = j10;
                    return i13;
                }
            }
            this.f86492d[i10] = j10;
            i10 = i11;
        }
        return -1;
    }

    public final int d() {
        int iNumberOfTrailingZeros;
        int iE = this.f86489a.e();
        do {
            long j10 = this.f86491c;
            if (j10 == -1) {
                if (iE > 64) {
                    return c();
                }
                return -1;
            }
            iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j10);
            this.f86491c |= 1 << iNumberOfTrailingZeros;
        } while (!this.f86490b.mo2invoke(this.f86489a, Integer.valueOf(iNumberOfTrailingZeros)).booleanValue());
        return iNumberOfTrailingZeros;
    }

    public final long[] e(int i10) {
        long[] jArr = new long[(i10 - 1) >>> 6];
        if ((i10 & 63) != 0) {
            jArr[cn.r.b0(jArr)] = (-1) << i10;
        }
        return jArr;
    }
}
