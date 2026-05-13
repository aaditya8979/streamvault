package com.moloco.sdk.internal.publisher;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@StabilityInferred(parameters = 0)
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Map<s, co.b> f46580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f46581b;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46582a;

        static {
            int[] iArr = new int[s.values().length];
            try {
                iArr[s.f46960a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s.f46961b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s.f46962c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[s.f46965f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[s.f46966g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[s.f46964e.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[s.f46963d.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f46582a = iArr;
        }
    }

    public b0(Map<s, co.b> map, long j10) {
        tn.p.k(map, "adTimeouts");
        this.f46580a = map;
        this.f46581b = j10;
    }

    public /* synthetic */ b0(Map map, long j10, int i10, tn.i iVar) {
        long jS;
        if ((i10 & 1) != 0) {
            s[] sVarArrValues = s.values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(zn.n.e(cn.p0.f(sVarArrValues.length), 16));
            for (s sVar : sVarArrValues) {
                switch (a.f46582a[sVar.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        jS = co.d.s(5, DurationUnit.SECONDS);
                        break;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        jS = co.d.s(15, DurationUnit.SECONDS);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                linkedHashMap.put(sVar, co.b.f(jS));
            }
            map = linkedHashMap;
        }
        this(map, (i10 & 2) != 0 ? co.d.s(5, DurationUnit.SECONDS) : j10, null);
    }

    public /* synthetic */ b0(Map map, long j10, tn.i iVar) {
        this(map, j10);
    }

    @NotNull
    public final Map<s, co.b> a() {
        return this.f46580a;
    }

    public final long b() {
        return this.f46581b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return tn.p.f(this.f46580a, b0Var.f46580a) && co.b.l(this.f46581b, b0Var.f46581b);
    }

    public int hashCode() {
        return (this.f46580a.hashCode() * 31) + co.b.z(this.f46581b);
    }

    @NotNull
    public String toString() {
        return "AdCreatorConfiguration(adTimeouts=" + this.f46580a + ", defaultTimeoutDuration=" + ((Object) co.b.M(this.f46581b)) + ')';
    }
}
