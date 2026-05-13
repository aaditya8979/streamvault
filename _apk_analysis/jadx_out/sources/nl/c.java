package nl;

import bn.g;
import io.ktor.util.date.Month;
import io.ktor.util.date.WeekDay;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import so.k;
import tn.i;
import tn.p;
import vo.d;
import wo.c2;
import wo.g1;
import wo.g2;
import wo.i0;
import wo.m0;
import wo.r2;
import wo.v0;

/* JADX INFO: compiled from: Date.kt */
/* JADX INFO: loaded from: classes8.dex */
@k
public final class c implements Comparable<c> {

    @NotNull
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final g<KSerializer<Object>>[] f75895k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final c f75896l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f75897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f75898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f75899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final WeekDay f75900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f75901f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f75902g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final Month f75903h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f75904i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f75905j;

    /* JADX INFO: compiled from: Date.kt */
    public /* synthetic */ class a implements m0<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f75906a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f75906a = aVar;
            g2 g2Var = new g2("io.ktor.util.date.GMTDate", aVar, 9);
            g2Var.n("seconds", false);
            g2Var.n("minutes", false);
            g2Var.n("hours", false);
            g2Var.n("dayOfWeek", false);
            g2Var.n("dayOfMonth", false);
            g2Var.n("dayOfYear", false);
            g2Var.n("month", false);
            g2Var.n("year", false);
            g2Var.n("timestamp", false);
            descriptor = g2Var;
        }

        @Override // so.c
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c deserialize(@NotNull Decoder decoder) {
            WeekDay weekDay;
            int i10;
            int i11;
            int iG;
            Month month;
            int i12;
            long jF;
            int i13;
            int i14;
            int i15;
            p.k(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            vo.c cVarB = decoder.b(serialDescriptor);
            g[] gVarArr = c.f75895k;
            int i16 = 7;
            if (cVarB.l()) {
                int iG2 = cVarB.g(serialDescriptor, 0);
                int iG3 = cVarB.g(serialDescriptor, 1);
                int iG4 = cVarB.g(serialDescriptor, 2);
                WeekDay weekDay2 = (WeekDay) cVarB.i(serialDescriptor, 3, (so.c) gVarArr[3].getValue(), null);
                int iG5 = cVarB.g(serialDescriptor, 4);
                int iG6 = cVarB.g(serialDescriptor, 5);
                month = (Month) cVarB.i(serialDescriptor, 6, (so.c) gVarArr[6].getValue(), null);
                iG = cVarB.g(serialDescriptor, 7);
                i14 = iG6;
                jF = cVarB.f(serialDescriptor, 8);
                i13 = iG5;
                i15 = iG4;
                weekDay = weekDay2;
                i12 = iG3;
                i11 = iG2;
                i10 = 511;
            } else {
                boolean z10 = true;
                int iG7 = 0;
                int i17 = 0;
                int iG8 = 0;
                int iG9 = 0;
                int iG10 = 0;
                long jF2 = 0;
                weekDay = null;
                int iG11 = 0;
                Month month2 = null;
                int iG12 = 0;
                while (z10) {
                    int iW = cVarB.w(serialDescriptor);
                    switch (iW) {
                        case -1:
                            z10 = false;
                            i16 = 7;
                            break;
                        case 0:
                            i17 |= 1;
                            iG7 = cVarB.g(serialDescriptor, 0);
                            i16 = 7;
                            break;
                        case 1:
                            iG10 = cVarB.g(serialDescriptor, 1);
                            i17 |= 2;
                            i16 = 7;
                            break;
                        case 2:
                            iG9 = cVarB.g(serialDescriptor, 2);
                            i17 |= 4;
                            break;
                        case 3:
                            weekDay = (WeekDay) cVarB.i(serialDescriptor, 3, (so.c) gVarArr[3].getValue(), weekDay);
                            i17 |= 8;
                            break;
                        case 4:
                            iG8 = cVarB.g(serialDescriptor, 4);
                            i17 |= 16;
                            break;
                        case 5:
                            iG11 = cVarB.g(serialDescriptor, 5);
                            i17 |= 32;
                            break;
                        case 6:
                            month2 = (Month) cVarB.i(serialDescriptor, 6, (so.c) gVarArr[6].getValue(), month2);
                            i17 |= 64;
                            break;
                        case 7:
                            iG12 = cVarB.g(serialDescriptor, i16);
                            i17 |= 128;
                            break;
                        case 8:
                            jF2 = cVarB.f(serialDescriptor, 8);
                            i17 |= 256;
                            break;
                        default:
                            throw new UnknownFieldException(iW);
                    }
                }
                i10 = i17;
                i11 = iG7;
                int i18 = iG9;
                iG = iG12;
                int i19 = iG8;
                month = month2;
                i12 = iG10;
                jF = jF2;
                i13 = i19;
                i14 = iG11;
                i15 = i18;
            }
            cVarB.c(serialDescriptor);
            return new c(i10, i11, i12, i15, weekDay, i13, i14, month, iG, jF, null);
        }

        @Override // so.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void serialize(@NotNull Encoder encoder, @NotNull c cVar) {
            p.k(encoder, "encoder");
            p.k(cVar, "value");
            SerialDescriptor serialDescriptor = descriptor;
            d dVarB = encoder.b(serialDescriptor);
            c.g(cVar, dVarB, serialDescriptor);
            dVarB.c(serialDescriptor);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // wo.m0
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            g[] gVarArr = c.f75895k;
            v0 v0Var = v0.f86626a;
            return new KSerializer[]{v0Var, v0Var, v0Var, gVarArr[3].getValue(), v0Var, v0Var, gVarArr[6].getValue(), v0Var, g1.f86515a};
        }

        @Override // kotlinx.serialization.KSerializer, so.l, so.c
        @NotNull
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }
    }

    /* JADX INFO: compiled from: Date.kt */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(i iVar) {
            this();
        }

        @NotNull
        public final KSerializer<c> serializer() {
            return a.f75906a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f75895k = new g[]{null, null, null, kotlin.b.a(lazyThreadSafetyMode, new sn.a() { // from class: nl.a
            @Override // sn.a
            public final Object invoke() {
                return c.c();
            }
        }), null, null, kotlin.b.a(lazyThreadSafetyMode, new sn.a() { // from class: nl.b
            @Override // sn.a
            public final Object invoke() {
                return c.d();
            }
        }), null, null};
        f75896l = io.ktor.util.date.a.a(0L);
    }

    public /* synthetic */ c(int i10, int i11, int i12, int i13, WeekDay weekDay, int i14, int i15, Month month, int i16, long j10, r2 r2Var) {
        if (511 != (i10 & 511)) {
            c2.a(i10, 511, a.f75906a.getDescriptor());
        }
        this.f75897b = i11;
        this.f75898c = i12;
        this.f75899d = i13;
        this.f75900e = weekDay;
        this.f75901f = i14;
        this.f75902g = i15;
        this.f75903h = month;
        this.f75904i = i16;
        this.f75905j = j10;
    }

    public c(int i10, int i11, int i12, @NotNull WeekDay weekDay, int i13, int i14, @NotNull Month month, int i15, long j10) {
        p.k(weekDay, "dayOfWeek");
        p.k(month, "month");
        this.f75897b = i10;
        this.f75898c = i11;
        this.f75899d = i12;
        this.f75900e = weekDay;
        this.f75901f = i13;
        this.f75902g = i14;
        this.f75903h = month;
        this.f75904i = i15;
        this.f75905j = j10;
    }

    public static final /* synthetic */ KSerializer c() {
        return i0.b("io.ktor.util.date.WeekDay", WeekDay.values());
    }

    public static final /* synthetic */ KSerializer d() {
        return i0.b("io.ktor.util.date.Month", Month.values());
    }

    public static final /* synthetic */ void g(c cVar, d dVar, SerialDescriptor serialDescriptor) {
        g<KSerializer<Object>>[] gVarArr = f75895k;
        dVar.o(serialDescriptor, 0, cVar.f75897b);
        dVar.o(serialDescriptor, 1, cVar.f75898c);
        dVar.o(serialDescriptor, 2, cVar.f75899d);
        dVar.g(serialDescriptor, 3, gVarArr[3].getValue(), cVar.f75900e);
        dVar.o(serialDescriptor, 4, cVar.f75901f);
        dVar.o(serialDescriptor, 5, cVar.f75902g);
        dVar.g(serialDescriptor, 6, gVarArr[6].getValue(), cVar.f75903h);
        dVar.o(serialDescriptor, 7, cVar.f75904i);
        dVar.v(serialDescriptor, 8, cVar.f75905j);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f75897b == cVar.f75897b && this.f75898c == cVar.f75898c && this.f75899d == cVar.f75899d && this.f75900e == cVar.f75900e && this.f75901f == cVar.f75901f && this.f75902g == cVar.f75902g && this.f75903h == cVar.f75903h && this.f75904i == cVar.f75904i && this.f75905j == cVar.f75905j;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull c cVar) {
        p.k(cVar, "other");
        return p.n(this.f75905j, cVar.f75905j);
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.f75897b) * 31) + Integer.hashCode(this.f75898c)) * 31) + Integer.hashCode(this.f75899d)) * 31) + this.f75900e.hashCode()) * 31) + Integer.hashCode(this.f75901f)) * 31) + Integer.hashCode(this.f75902g)) * 31) + this.f75903h.hashCode()) * 31) + Integer.hashCode(this.f75904i)) * 31) + Long.hashCode(this.f75905j);
    }

    @NotNull
    public String toString() {
        return "GMTDate(seconds=" + this.f75897b + ", minutes=" + this.f75898c + ", hours=" + this.f75899d + ", dayOfWeek=" + this.f75900e + ", dayOfMonth=" + this.f75901f + ", dayOfYear=" + this.f75902g + ", month=" + this.f75903h + ", year=" + this.f75904i + ", timestamp=" + this.f75905j + ')';
    }
}
