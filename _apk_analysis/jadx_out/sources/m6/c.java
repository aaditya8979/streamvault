package m6;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.flv.TagPayloadReader;
import i6.j;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import s7.a0;

/* JADX INFO: compiled from: ScriptTagPayloadReader.java */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends TagPayloadReader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f74000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f74001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long[] f74002d;

    public c() {
        super(new j());
        this.f74000b = -9223372036854775807L;
        this.f74001c = new long[0];
        this.f74002d = new long[0];
    }

    public static Boolean g(a0 a0Var) {
        return Boolean.valueOf(a0Var.D() == 1);
    }

    @Nullable
    public static Object h(a0 a0Var, int i10) {
        if (i10 == 0) {
            return j(a0Var);
        }
        if (i10 == 1) {
            return g(a0Var);
        }
        if (i10 == 2) {
            return n(a0Var);
        }
        if (i10 == 3) {
            return l(a0Var);
        }
        if (i10 == 8) {
            return k(a0Var);
        }
        if (i10 == 10) {
            return m(a0Var);
        }
        if (i10 != 11) {
            return null;
        }
        return i(a0Var);
    }

    public static Date i(a0 a0Var) {
        Date date = new Date((long) j(a0Var).doubleValue());
        a0Var.Q(2);
        return date;
    }

    public static Double j(a0 a0Var) {
        return Double.valueOf(Double.longBitsToDouble(a0Var.w()));
    }

    public static HashMap<String, Object> k(a0 a0Var) {
        int iH = a0Var.H();
        HashMap<String, Object> map = new HashMap<>(iH);
        for (int i10 = 0; i10 < iH; i10++) {
            String strN = n(a0Var);
            Object objH = h(a0Var, o(a0Var));
            if (objH != null) {
                map.put(strN, objH);
            }
        }
        return map;
    }

    public static HashMap<String, Object> l(a0 a0Var) {
        HashMap<String, Object> map = new HashMap<>();
        while (true) {
            String strN = n(a0Var);
            int iO = o(a0Var);
            if (iO == 9) {
                return map;
            }
            Object objH = h(a0Var, iO);
            if (objH != null) {
                map.put(strN, objH);
            }
        }
    }

    public static ArrayList<Object> m(a0 a0Var) {
        int iH = a0Var.H();
        ArrayList<Object> arrayList = new ArrayList<>(iH);
        for (int i10 = 0; i10 < iH; i10++) {
            Object objH = h(a0Var, o(a0Var));
            if (objH != null) {
                arrayList.add(objH);
            }
        }
        return arrayList;
    }

    public static String n(a0 a0Var) {
        int iJ = a0Var.J();
        int iE = a0Var.e();
        a0Var.Q(iJ);
        return new String(a0Var.d(), iE, iJ);
    }

    public static int o(a0 a0Var) {
        return a0Var.D();
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public boolean b(a0 a0Var) {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public boolean c(a0 a0Var, long j10) {
        if (o(a0Var) != 2 || !"onMetaData".equals(n(a0Var)) || a0Var.a() == 0 || o(a0Var) != 8) {
            return false;
        }
        HashMap<String, Object> mapK = k(a0Var);
        Object obj = mapK.get("duration");
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.f74000b = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = mapK.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f74001c = new long[size];
                this.f74002d = new long[size];
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj5 = list.get(i10);
                    Object obj6 = list2.get(i10);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f74001c = new long[0];
                        this.f74002d = new long[0];
                        break;
                    }
                    this.f74001c[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f74002d[i10] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    public long d() {
        return this.f74000b;
    }

    public long[] e() {
        return this.f74002d;
    }

    public long[] f() {
        return this.f74001c;
    }
}
