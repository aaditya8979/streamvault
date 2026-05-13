package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.i.cp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes8.dex */
public final class dc extends cz {
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static cp.e m5934(List<Object> list) {
        return new cp.e((List) cz.m5927(list, 0, List.class), ((Integer) cz.m5927(list, 1, Integer.class)).intValue());
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static Object m5935(List<Object> list) {
        Object objM5927;
        Class<?> cls;
        ho hoVar;
        Object objM59272;
        Class<?> cls2;
        int size = list.size();
        Object objM59273 = null;
        Class<?> cls3 = null;
        if (size == 2) {
            if (list.get(0) instanceof Class) {
                cls = (Class) cz.m5927(list, 0, Class.class);
                objM5927 = null;
            } else {
                Object objM59274 = cz.m5927(list, 0, Object.class);
                if (objM59274 != null) {
                    objM5927 = objM59274;
                    cls = objM59274.getClass();
                } else {
                    objM5927 = objM59274;
                    cls = null;
                }
            }
            hoVar = (ho) cz.m5927(list, 1, ho.class);
            objM59272 = null;
            cls3 = cls;
        } else if (size == 3) {
            if (list.get(0) instanceof Class) {
                cls2 = (Class) cz.m5927(list, 0, Class.class);
                if (list.get(1) instanceof ho) {
                    hoVar = (ho) cz.m5927(list, 1, ho.class);
                    objM59272 = cz.m5927(list, 2, Object.class);
                } else {
                    Object objM59275 = cz.m5927(list, 1, Object.class);
                    hoVar = (ho) cz.m5927(list, 2, ho.class);
                    objM59272 = null;
                    cls3 = cls2;
                    objM5927 = objM59275;
                }
            } else {
                objM59273 = cz.m5927(list, 0, Object.class);
                cls2 = objM59273.getClass();
                hoVar = (ho) cz.m5927(list, 1, ho.class);
                objM59272 = cz.m5927(list, 2, Object.class);
            }
            Object obj = objM59273;
            cls3 = cls2;
            objM5927 = obj;
        } else if (size != 4) {
            objM59272 = null;
            hoVar = null;
            objM5927 = null;
        } else {
            cls3 = (Class) cz.m5927(list, 0, Class.class);
            objM5927 = cz.m5927(list, 1, Object.class);
            hoVar = (ho) cz.m5927(list, 2, ho.class);
            objM59272 = cz.m5927(list, 3, Object.class);
        }
        hu.m6425().m6427();
        return hz.m6520(cls3, objM5927, hoVar, objM59272);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static List<Object> m5936(List<Object> list) {
        Object objM5927;
        ho hoVar;
        int size = list.size();
        Class<?> cls = null;
        cls = null;
        Object objM59272 = null;
        if (size == 2) {
            if (list.get(0) instanceof Class) {
                cls = (Class) cz.m5927(list, 0, Class.class);
                objM5927 = null;
            } else {
                objM5927 = cz.m5927(list, 0, Object.class);
                if (objM5927 != null) {
                    cls = objM5927.getClass();
                }
            }
            hoVar = (ho) cz.m5927(list, 1, ho.class);
        } else if (size != 3) {
            hoVar = null;
            objM5927 = null;
        } else if (list.get(0) instanceof Class) {
            Class<?> cls2 = (Class) cz.m5927(list, 0, Class.class);
            if (list.get(1) instanceof ho) {
                hoVar = (ho) cz.m5927(list, 1, ho.class);
            } else {
                objM59272 = cz.m5927(list, 1, Object.class);
                hoVar = (ho) cz.m5927(list, 2, ho.class);
            }
            objM5927 = objM59272;
            cls = cls2;
        } else {
            Object objM59273 = cz.m5927(list, 0, Object.class);
            Class<?> cls3 = objM59273.getClass();
            hoVar = (ho) cz.m5927(list, 1, ho.class);
            cls = cls3;
            objM5927 = objM59273;
        }
        hu.m6425().m6427();
        return hz.m6523(cls, objM5927, hoVar);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static String m5937(List<Object> list) {
        if (list.get(0) instanceof Class) {
            return hu.m6425().m6427().m6527((Class) cz.m5927(list, 0, Class.class), (String) cz.m5927(list, 1, String.class));
        }
        Object objM5927 = cz.m5927(list, 0, Object.class);
        if (list.get(1) instanceof List) {
            return hu.m6425().m6427().m6532(objM5927, new JSONArray((Collection) cz.m5927(list, 1, List.class)));
        }
        if (list.get(1) instanceof JSONArray) {
            return hu.m6425().m6427().m6532(objM5927, (JSONArray) cz.m5927(list, 1, JSONArray.class));
        }
        return hu.m6425().m6427().m6531(objM5927, (String) cz.m5927(list, 1, String.class));
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final Object m5938(du duVar, cq cqVar, List<Object> list) {
        hv hvVarM5940 = m5940(duVar, cqVar, list);
        if (hvVarM5940 != null) {
            return hvVarM5940.mo6430();
        }
        return null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final List<Object> m5939(du duVar, cq cqVar, List<Object> list) {
        ArrayList arrayList = new ArrayList();
        for (hv hvVar : m5941(duVar, cqVar, list)) {
            if (hvVar != null) {
                arrayList.add(hvVar.mo6430());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final <T> hv<T> m5940(final du duVar, final cq cqVar, List<Object> list) {
        Object objM5927 = cz.m5927(list, 0, Object.class);
        final cp cpVar = (cp) cz.m5927(list, 1, cp.class);
        final List<Object> listM5929 = cz.m5929(list, 2);
        if (cpVar == null) {
            return null;
        }
        return hu.m6425().m6427().m6526(objM5927, cpVar.m5709(new ia() { // from class: com.ironsource.adqualitysdk.sdk.i.dc.1
            @Override // com.ironsource.adqualitysdk.sdk.i.ia
            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            public final boolean mo5942(hv hvVar) {
                return cpVar.m5708().m5691(hvVar, duVar, cqVar, listM5929);
            }
        }));
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final List<hv> m5941(final du duVar, final cq cqVar, List<Object> list) {
        Object objM5927 = cz.m5927(list, 0, Object.class);
        final cp cpVar = (cp) cz.m5927(list, 1, cp.class);
        final List<Object> listM5929 = cz.m5929(list, 2);
        if (cpVar == null) {
            return null;
        }
        return hu.m6425().m6427().m6529(objM5927, cpVar.m5709(new ia() { // from class: com.ironsource.adqualitysdk.sdk.i.dc.2
            @Override // com.ironsource.adqualitysdk.sdk.i.ia
            /* JADX INFO: renamed from: ﻛ */
            public final boolean mo5942(hv hvVar) {
                return cpVar.m5708().m5691(hvVar, duVar, cqVar, listM5929);
            }
        }));
    }
}
