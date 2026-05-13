package n4;

import a6.t;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.extractor.flv.TagPayloadReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import k4.f;

/* JADX INFO: compiled from: ScriptTagPayloadReader.java */
/* JADX INFO: loaded from: classes8.dex */
public final class c extends TagPayloadReader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f75117b;

    public c() {
        super(new f());
        this.f75117b = -9223372036854775807L;
    }

    public static Boolean e(t tVar) {
        return Boolean.valueOf(tVar.y() == 1);
    }

    @Nullable
    public static Object f(t tVar, int i10) {
        if (i10 == 0) {
            return h(tVar);
        }
        if (i10 == 1) {
            return e(tVar);
        }
        if (i10 == 2) {
            return l(tVar);
        }
        if (i10 == 3) {
            return j(tVar);
        }
        if (i10 == 8) {
            return i(tVar);
        }
        if (i10 == 10) {
            return k(tVar);
        }
        if (i10 != 11) {
            return null;
        }
        return g(tVar);
    }

    public static Date g(t tVar) {
        Date date = new Date((long) h(tVar).doubleValue());
        tVar.M(2);
        return date;
    }

    public static Double h(t tVar) {
        return Double.valueOf(Double.longBitsToDouble(tVar.r()));
    }

    public static HashMap<String, Object> i(t tVar) {
        int iC = tVar.C();
        HashMap<String, Object> map = new HashMap<>(iC);
        for (int i10 = 0; i10 < iC; i10++) {
            String strL = l(tVar);
            Object objF = f(tVar, m(tVar));
            if (objF != null) {
                map.put(strL, objF);
            }
        }
        return map;
    }

    public static HashMap<String, Object> j(t tVar) {
        HashMap<String, Object> map = new HashMap<>();
        while (true) {
            String strL = l(tVar);
            int iM = m(tVar);
            if (iM == 9) {
                return map;
            }
            Object objF = f(tVar, iM);
            if (objF != null) {
                map.put(strL, objF);
            }
        }
    }

    public static ArrayList<Object> k(t tVar) {
        int iC = tVar.C();
        ArrayList<Object> arrayList = new ArrayList<>(iC);
        for (int i10 = 0; i10 < iC; i10++) {
            Object objF = f(tVar, m(tVar));
            if (objF != null) {
                arrayList.add(objF);
            }
        }
        return arrayList;
    }

    public static String l(t tVar) {
        int iE = tVar.E();
        int iC = tVar.c();
        tVar.M(iE);
        return new String(tVar.f3620a, iC, iE);
    }

    public static int m(t tVar) {
        return tVar.y();
    }

    @Override // com.google.android.exoplayer.extractor.flv.TagPayloadReader
    public boolean b(t tVar) {
        return true;
    }

    @Override // com.google.android.exoplayer.extractor.flv.TagPayloadReader
    public boolean c(t tVar, long j10) throws ParserException {
        if (m(tVar) != 2) {
            throw new ParserException();
        }
        if (!"onMetaData".equals(l(tVar)) || m(tVar) != 8) {
            return false;
        }
        HashMap<String, Object> mapI = i(tVar);
        if (mapI.containsKey("duration")) {
            double dDoubleValue = ((Double) mapI.get("duration")).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.f75117b = (long) (dDoubleValue * 1000000.0d);
            }
        }
        return false;
    }

    public long d() {
        return this.f75117b;
    }
}
