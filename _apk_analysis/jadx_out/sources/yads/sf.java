package yads;

import bo.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes2.dex */
public abstract class sf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bn.g f94807a = kotlin.b.b(qf.f94024b);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bn.g f94808b = kotlin.b.b(rf.f94429b);

    public static LinkedHashMap a(String str) {
        StackTraceElement stackTraceElement;
        List list;
        List<String> listB;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> it = bo.d0.B0(str).iterator();
        Thread thread = null;
        while (it.hasNext()) {
            String string = bo.d0.s1(it.next()).toString();
            bo.l lVarFind$default = Regex.find$default((Regex) f94808b.getValue(), string, 0, 2, null);
            String str2 = (lVarFind$default == null || (listB = lVarFind$default.b()) == null) ? null : (String) cn.f0.w0(listB, 1);
            if (str2 != null) {
                thread = new Thread("[ExitInfo] " + str2);
                linkedHashMap.put(thread, new ArrayList());
            } else if (bo.a0.W(string, "at ", false, 2, null) && thread != null) {
                bo.l lVarFind$default2 = Regex.find$default((Regex) f94807a.getValue(), string, 0, 2, null);
                if (lVarFind$default2 == null) {
                    stackTraceElement = null;
                    if (stackTraceElement == null && (list = (List) linkedHashMap.get(thread)) != null) {
                        list.add(stackTraceElement);
                    }
                } else {
                    l.b bVarA = lVarFind$default2.a();
                    String str3 = bVarA.a().b().get(1);
                    String str4 = bVarA.a().b().get(2);
                    String str5 = bVarA.a().b().get(3);
                    String strN1 = bo.d0.n1(str3, '.', "");
                    String strH1 = bo.d0.h1(str3, '.', null, 2, null);
                    try {
                        Integer numR = bo.z.r(str5);
                        stackTraceElement = new StackTraceElement(strN1, strH1, str4, numR != null ? numR.intValue() : -1);
                    } catch (Throwable unused) {
                        stackTraceElement = null;
                    }
                    if (stackTraceElement == null) {
                    }
                }
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(cn.p0.f(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), (StackTraceElement[]) ((Collection) entry.getValue()).toArray(new StackTraceElement[0]));
        }
        return linkedHashMap2;
    }
}
