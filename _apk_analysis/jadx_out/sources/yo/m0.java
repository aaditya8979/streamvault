package yo;

import com.ironsource.C3978d4;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.internal.JsonException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import uo.k;
import uo.l;
import yo.e0;

/* JADX INFO: compiled from: JsonNamesMap.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e0.a<Map<String, Integer>> f97961a = new e0.a<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final e0.a<String[]> f97962b = new e0.a<>();

    public static final Map<String, Integer> c(SerialDescriptor serialDescriptor, xo.a aVar) {
        String strA;
        String[] strArrNames;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean zE = e(aVar, serialDescriptor);
        xo.y yVarO = o(serialDescriptor, aVar);
        int iE = serialDescriptor.e();
        for (int i10 = 0; i10 < iE; i10++) {
            List<Annotation> listG = serialDescriptor.g(i10);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listG) {
                if (obj instanceof xo.x) {
                    arrayList.add(obj);
                }
            }
            xo.x xVar = (xo.x) cn.f0.U0(arrayList);
            if (xVar != null && (strArrNames = xVar.names()) != null) {
                for (String lowerCase : strArrNames) {
                    if (zE) {
                        lowerCase = lowerCase.toLowerCase(Locale.ROOT);
                        tn.p.j(lowerCase, "toLowerCase(...)");
                    }
                    d(linkedHashMap, serialDescriptor, lowerCase, i10);
                }
            }
            if (zE) {
                strA = serialDescriptor.f(i10).toLowerCase(Locale.ROOT);
                tn.p.j(strA, "toLowerCase(...)");
            } else {
                strA = yVarO != null ? yVarO.a(serialDescriptor, i10, serialDescriptor.f(i10)) : null;
            }
            if (strA != null) {
                d(linkedHashMap, serialDescriptor, strA, i10);
            }
        }
        return linkedHashMap.isEmpty() ? kotlin.collections.a.j() : linkedHashMap;
    }

    public static final void d(Map<String, Integer> map, SerialDescriptor serialDescriptor, String str, int i10) {
        String str2 = tn.p.f(serialDescriptor.getKind(), k.b.f85772a) ? "enum value" : "property";
        if (!map.containsKey(str)) {
            map.put(str, Integer.valueOf(i10));
            return;
        }
        throw new JsonException("The suggested name '" + str + "' for " + str2 + ' ' + serialDescriptor.f(i10) + " is already one of the names for " + str2 + ' ' + serialDescriptor.f(((Number) kotlin.collections.a.k(map, str)).intValue()) + " in " + serialDescriptor);
    }

    public static final boolean e(xo.a aVar, SerialDescriptor serialDescriptor) {
        return aVar.e().h() && tn.p.f(serialDescriptor.getKind(), k.b.f85772a);
    }

    @NotNull
    public static final Map<String, Integer> f(@NotNull final xo.a aVar, @NotNull final SerialDescriptor serialDescriptor) {
        tn.p.k(aVar, "<this>");
        tn.p.k(serialDescriptor, "descriptor");
        return (Map) xo.e0.a(aVar).b(serialDescriptor, f97961a, new sn.a() { // from class: yo.k0
            @Override // sn.a
            public final Object invoke() {
                return m0.g(serialDescriptor, aVar);
            }
        });
    }

    public static final Map g(SerialDescriptor serialDescriptor, xo.a aVar) {
        return c(serialDescriptor, aVar);
    }

    @NotNull
    public static final e0.a<Map<String, Integer>> h() {
        return f97961a;
    }

    @NotNull
    public static final String i(@NotNull SerialDescriptor serialDescriptor, @NotNull xo.a aVar, int i10) {
        tn.p.k(serialDescriptor, "<this>");
        tn.p.k(aVar, "json");
        xo.y yVarO = o(serialDescriptor, aVar);
        return yVarO == null ? serialDescriptor.f(i10) : p(serialDescriptor, aVar, yVarO)[i10];
    }

    public static final int j(@NotNull SerialDescriptor serialDescriptor, @NotNull xo.a aVar, @NotNull String str) {
        tn.p.k(serialDescriptor, "<this>");
        tn.p.k(aVar, "json");
        tn.p.k(str, "name");
        if (e(aVar, serialDescriptor)) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            tn.p.j(lowerCase, "toLowerCase(...)");
            return m(serialDescriptor, aVar, lowerCase);
        }
        if (o(serialDescriptor, aVar) != null) {
            return m(serialDescriptor, aVar, str);
        }
        int iC = serialDescriptor.c(str);
        return (iC == -3 && aVar.e().o()) ? m(serialDescriptor, aVar, str) : iC;
    }

    public static final int k(@NotNull SerialDescriptor serialDescriptor, @NotNull xo.a aVar, @NotNull String str, @NotNull String str2) {
        tn.p.k(serialDescriptor, "<this>");
        tn.p.k(aVar, "json");
        tn.p.k(str, "name");
        tn.p.k(str2, "suffix");
        int iJ = j(serialDescriptor, aVar, str);
        if (iJ != -3) {
            return iJ;
        }
        throw new SerializationException(serialDescriptor.h() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static /* synthetic */ int l(SerialDescriptor serialDescriptor, xo.a aVar, String str, String str2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = "";
        }
        return k(serialDescriptor, aVar, str, str2);
    }

    public static final int m(SerialDescriptor serialDescriptor, xo.a aVar, String str) {
        Integer num = f(aVar, serialDescriptor).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final boolean n(@NotNull SerialDescriptor serialDescriptor, @NotNull xo.a aVar) {
        boolean z10;
        tn.p.k(serialDescriptor, "<this>");
        tn.p.k(aVar, "json");
        if (aVar.e().k()) {
            return true;
        }
        List<Annotation> annotations = serialDescriptor.getAnnotations();
        if ((annotations instanceof Collection) && annotations.isEmpty()) {
            z10 = false;
        } else {
            Iterator<T> it = annotations.iterator();
            while (it.hasNext()) {
                if (((Annotation) it.next()) instanceof xo.s) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
        }
        return z10;
    }

    @Nullable
    public static final xo.y o(@NotNull SerialDescriptor serialDescriptor, @NotNull xo.a aVar) {
        tn.p.k(serialDescriptor, "<this>");
        tn.p.k(aVar, "json");
        if (tn.p.f(serialDescriptor.getKind(), l.a.f85773a)) {
            return aVar.e().l();
        }
        return null;
    }

    @NotNull
    public static final String[] p(@NotNull final SerialDescriptor serialDescriptor, @NotNull xo.a aVar, @NotNull final xo.y yVar) {
        tn.p.k(serialDescriptor, "<this>");
        tn.p.k(aVar, "json");
        tn.p.k(yVar, C3978d4.f.f31283e);
        return (String[]) xo.e0.a(aVar).b(serialDescriptor, f97962b, new sn.a() { // from class: yo.l0
            @Override // sn.a
            public final Object invoke() {
                return m0.q(serialDescriptor, yVar);
            }
        });
    }

    public static final String[] q(SerialDescriptor serialDescriptor, xo.y yVar) {
        int iE = serialDescriptor.e();
        String[] strArr = new String[iE];
        for (int i10 = 0; i10 < iE; i10++) {
            strArr[i10] = yVar.a(serialDescriptor, i10, serialDescriptor.f(i10));
        }
        return strArr;
    }
}
