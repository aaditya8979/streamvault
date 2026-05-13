package yads;

import android.content.pm.ActivityInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f95904a = com.safedk.android.utils.g.f53151y + ".common.AdActivity has missed configuration attribute %s.";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f95905b = kotlin.collections.a.m(bn.h.a(16, "ActivityInfo.CONFIG_KEYBOARD"), bn.h.a(32, "ActivityInfo.CONFIG_KEYBOARD_HIDDEN"), bn.h.a(128, "ActivityInfo.CONFIG_ORIENTATION"), bn.h.a(256, "ActivityInfo.CONFIG_SCREEN_LAYOUT"), bn.h.a(512, "ActivityInfo.CONFIG_UI_MODE"), bn.h.a(1024, "ActivityInfo.CONFIG_SCREEN_SIZE"), bn.h.a(2048, "CONFIG_SMALLEST_SCREEN_SIZE"));

    public static void a(ActivityInfo activityInfo) {
        Object obj;
        Map map = f95905b;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it = map.entrySet().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            int iIntValue = ((Number) entry.getKey()).intValue();
            String str = (String) entry.getValue();
            if ((iIntValue & activityInfo.configChanges) == 0) {
                obj = str;
            }
            arrayList.add(obj);
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((String) next) != null) {
                obj = next;
                break;
            }
        }
        String str2 = (String) obj;
        if (str2 == null) {
            return;
        }
        String str3 = String.format(f95904a, Arrays.copyOf(new Object[]{str2}, 1));
        tn.p.j(str3, "format(...)");
        throw new ub1(str3, str3);
    }
}
