package yads;

import android.util.Log;
import com.ironsource.Z7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class nb3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f92802a = cn.w.p("The integrated version of the Yandex Mobile Ads SDK is outdated.", "Please update com.yandex.android:mobileads to the latest version.");

    public static String a(int i10, String str) {
        return "* " + str + bo.a0.O(Z7.f30794r, i10 - str.length()) + " *";
    }

    public static List a() {
        if (tq.a() == null) {
            return cn.w.m();
        }
        return cn.v.e("Changelog: " + tq.a());
    }

    public static void b() {
        Integer numValueOf;
        List listO0 = cn.f0.O0(cn.f0.O0(f92802a, cn.w.p("Learn more about the latest version of the SDK here:", "https://yandex.ru/dev/mobile-ads/doc/android/quick-start/android-ads-component.html")), a());
        Iterator it = listO0.iterator();
        String strD0 = null;
        if (it.hasNext()) {
            numValueOf = Integer.valueOf(((String) it.next()).length());
            while (it.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(((String) it.next()).length());
                if (numValueOf.compareTo(numValueOf2) < 0) {
                    numValueOf = numValueOf2;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            String strO = bo.a0.O("*", iIntValue + 4);
            ArrayList arrayList = new ArrayList(cn.x.x(listO0, 10));
            Iterator it2 = listO0.iterator();
            while (it2.hasNext()) {
                arrayList.add(a(iIntValue, (String) it2.next()));
            }
            strD0 = cn.f0.D0(cn.f0.P0(cn.f0.O0(cn.v.e(strO), arrayList), strO), "\n", null, null, 0, null, null, 62, null);
        }
        Log.e("Yandex Mobile Ads", "Yandex Mobile Ads version validation\n" + strD0 + "\n");
    }
}
