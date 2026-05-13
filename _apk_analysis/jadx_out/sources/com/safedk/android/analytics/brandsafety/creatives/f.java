package com.safedk.android.analytics.brandsafety.creatives;

import android.text.TextUtils;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.k;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes10.dex */
public class f extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f52441d = "VastAdParser";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final CharSequence f52442e = "acao/yes";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<VastAdTagUri> f52440c = new ArrayList();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f52443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f52444b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f52445c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f52446d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f52447e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f52448f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f52449g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f52450h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private List<String> f52451i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private List<String> f52452j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private List<String> f52453k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private List<String> f52454l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private List<String> f52455m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private List<String> f52456n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private List<String> f52457o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private List<String> f52458p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private List<String> f52459q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private List<String> f52460r;

        a(String str, String str2, String str3, String str4, ArrayList<String> arrayList, List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5, List<String> list6, List<String> list7, boolean z10, String str5, List<String> list8, String str6, List<String> list9) {
            this.f52443a = false;
            this.f52453k = new ArrayList();
            this.f52454l = new ArrayList();
            this.f52455m = new ArrayList();
            this.f52456n = new ArrayList();
            this.f52446d = str;
            this.f52447e = str2;
            this.f52444b = str3;
            this.f52445c = str4;
            this.f52453k = arrayList;
            this.f52454l = list;
            this.f52455m = list2;
            this.f52456n = list3;
            this.f52457o = list4;
            this.f52458p = list5;
            this.f52459q = list6;
            this.f52460r = list7;
            this.f52443a = z10;
            this.f52449g = z10 ? str5 : null;
            this.f52452j = list8;
            this.f52450h = str6;
            this.f52451i = list9;
            k.b(f.f52441d, "Vast ad created:\nvastAdId=" + str + "\nadSystem=" + str2 + "\nclickUrl=" + str3 + "\nvideoUrl=" + str4 + "\nprefetchResourceUrls=" + (arrayList != null ? arrayList.toString() : "null") + "\nstaticResourceUrls=" + (list != null ? list.toString() : "null") + "\niframeResourceUrls=" + (list2 != null ? list2.toString() : "null") + "\nhtmlResourceUrls=" + (list3 != null ? list3.toString() : "null") + "\nvideoCompletedUrls=" + (list4 != null ? list4.toString() : "null") + "\nvideoTrackingEventUrls=" + (list5 != null ? list5.toString() : "null") + "\nclickTrackingUrls=" + (list6 != null ? list6.toString() : "null") + "\ncompanionClickTrackingUrls=" + (list7 != null ? list7.toString() : "null") + "\ncontainsMediaFileWithJsAppAttribute=" + z10 + "\nadParameters=" + (str5 != null ? str5.toString() : "null") + "\nimpressionUrls=" + (list8 != null ? list8.toString() : "null") + "\nmediaUrlList=" + (list9 != null ? list9.toString() : "null"));
        }

        a(String str, String str2, String str3, List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5) {
            this.f52443a = false;
            this.f52453k = new ArrayList();
            this.f52454l = new ArrayList();
            this.f52455m = new ArrayList();
            this.f52456n = new ArrayList();
            this.f52446d = str;
            this.f52447e = str2;
            this.f52448f = str3;
            this.f52452j = list;
            this.f52457o = list2;
            this.f52458p = list3;
            this.f52459q = list4;
            this.f52460r = list5;
            k.b(f.f52441d, "Vast ad created:\nvastAdId=" + str + "\nadSystem=" + str2 + "\nvastAdUri=" + str3 + "\nvideoCompletedUrls=" + (list2 != null ? list2.toString() : "null") + "\nvideoTrackingEventUrls=" + (list3 != null ? list3.toString() : "null") + "\nclickTrackingUrls=" + (list4 != null ? list4.toString() : "null") + "\ncompanionClickTrackingUrls=" + (list5 != null ? list5.toString() : "null") + "\nimpressionUrls=" + (list != null ? list.toString() : "null"));
        }

        private boolean s() {
            for (String str : this.f52451i) {
                if (k.z(str)) {
                    Logger.d(f.f52441d, "video file exists: " + str);
                    return true;
                }
            }
            k.b(f.f52441d, "video file doesn't exist: " + h().toString());
            return false;
        }

        public String a() {
            return this.f52444b;
        }

        public void a(String str) {
            this.f52446d = str;
        }

        public void a(List<String> list) {
            this.f52452j = list;
        }

        public String b() {
            return this.f52445c;
        }

        public void b(String str) {
            this.f52447e = str;
        }

        public void b(List<String> list) {
            this.f52457o = list;
        }

        public String c() {
            return this.f52446d;
        }

        public void c(String str) {
            this.f52448f = str;
        }

        public void c(List<String> list) {
            this.f52458p = list;
        }

        public String d() {
            return this.f52447e;
        }

        public void d(List<String> list) {
            this.f52459q = list;
        }

        public String e() {
            return this.f52448f;
        }

        public void e(List<String> list) {
            this.f52460r = list;
        }

        public String f() {
            return this.f52449g;
        }

        public String g() {
            return this.f52450h;
        }

        public List<String> h() {
            return this.f52451i;
        }

        public List<String> i() {
            return this.f52452j;
        }

        public List<String> j() {
            return this.f52453k;
        }

        public List<String> k() {
            return this.f52454l;
        }

        public List<String> l() {
            return this.f52455m;
        }

        public List<String> m() {
            return this.f52456n;
        }

        public List<String> n() {
            return this.f52457o;
        }

        public List<String> o() {
            return this.f52458p;
        }

        public List<String> p() {
            return this.f52459q;
        }

        public List<String> q() {
            return this.f52460r;
        }

        public boolean r() {
            return this.f52443a && !s();
        }

        public String toString() {
            return "vastAdId=" + (this.f52446d == null ? "null" : this.f52446d) + ", adSystem=" + (this.f52447e == null ? "null" : this.f52447e) + ", clickUrl=" + (this.f52444b == null ? "null" : this.f52444b) + ", videoUrl=" + (this.f52445c == null ? "null" : this.f52445c) + ", vastAdUri=" + (this.f52448f == null ? "null" : this.f52448f) + ", mediaUrlList=" + (this.f52451i == null ? "null" : this.f52451i.toString());
        }
    }

    private static a a(String str, String str2, String str3, List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5) {
        if (str == null) {
            return null;
        }
        Logger.d(f52441d, "vast ad uri detected: " + str);
        return new a(str2, str3, str, list, list2, list3, list4, list5);
    }

    private static a a(String str, boolean z10, String str2, String str3, String str4, List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5) {
        String strA;
        String str5;
        Logger.d(f52441d, "no vast ad tag uri");
        boolean z11 = false;
        String str6 = null;
        String str7 = null;
        String strA2 = null;
        String strA3 = null;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        List<String> listA = a(com.safedk.android.utils.f.s(), str2, 0, false);
        Logger.d(f52441d, "Number of creatives XML elements: " + listA.size());
        if (listA.size() == 0) {
            k.b(f52441d, "Number of creatives XML elements is 0, the xml is:\n" + str2);
        }
        String str8 = null;
        for (String str9 : listA) {
            List<String> listA2 = a(com.safedk.android.utils.f.n(), str9, 1, false);
            if (listA2.size() > 0) {
                Logger.d(f52441d, "companion click url list: " + listA2.toString());
                strA = a(listA2.get(0), false);
            } else {
                Logger.d(f52441d, "companion click url list is empty");
                strA = str8;
            }
            List<String> listA3 = a(com.safedk.android.utils.f.q(), str9, 1, false);
            if (listA3.size() > 0) {
                Logger.d(f52441d, "click url list: " + listA3);
                strA3 = a(listA3.get(0), z10);
                if (strA == null) {
                    strA = a(listA3.get(0), false);
                }
                Iterator<String> it = listA3.iterator();
                while (it.hasNext()) {
                    arrayList.add(a(it.next(), z10));
                }
            } else {
                Logger.d(f52441d, "click url list is empty");
            }
            if (!TextUtils.isEmpty(strA)) {
                str6 = strA;
            }
            for (String str10 : a(com.safedk.android.utils.f.p(), str9, -1, z10)) {
                List<String> listA4 = a(com.safedk.android.utils.f.o(), str10, -1, z10);
                List<String> listA5 = a(com.safedk.android.utils.f.p(), str10, 1, z10);
                String strA4 = a(listA5.get(0), z10);
                if (listA4.size() > 0) {
                    z11 = true;
                    arrayList.add(strA4);
                    Logger.d(f52441d, "contains media file with JS app attribute");
                } else if (listA5.size() > 0) {
                    arrayList5.add(strA4);
                    Logger.d(f52441d, "adding media file : " + strA4);
                } else {
                    Logger.d(f52441d, "cannot detect media resource in. skipping");
                }
            }
            List<String> listA6 = a(com.safedk.android.utils.f.h(), str9, 1, z10);
            if (listA6.size() > 0) {
                strA2 = a(listA6.get(0), z10);
                if (k.v(strA2)) {
                    k.b(f52441d, "ad parameters is JSON : " + strA2);
                    ArrayList<String> arrayListH = k.h(strA2);
                    if (arrayListH.size() > 0) {
                        for (String str11 : arrayListH) {
                            Logger.d(f52441d, "ad parameters media url : " + str11);
                            if (k.z(str11)) {
                                Logger.d(f52441d, "ad parameters media url is video url : " + str11);
                                arrayList5.add(a(str11, z10));
                            }
                        }
                    }
                } else {
                    k.b(f52441d, "found ad parameters = " + strA2);
                }
            }
            List<String> listA7 = a(com.safedk.android.utils.f.l(), str2, 1, z10);
            if (listA7.size() > 0) {
                arrayList.add("element:ytId:" + listA7.get(0));
                Logger.d(f52441d, "handle no vast ad Uri - added element to prefetch collection: " + listA7.get(0));
            }
            String str12 = null;
            Iterator it2 = arrayList5.iterator();
            while (true) {
                str5 = str12;
                if (!it2.hasNext()) {
                    str12 = null;
                    break;
                }
                str12 = (String) it2.next();
                if (k.z(str12) && str12.contains(f52442e)) {
                    Logger.d(f52441d, "found google videoUrl : " + str12);
                    break;
                }
                if (!k.z(str12) || str5 != null) {
                    str12 = str5;
                }
            }
            if (str12 == null && str5 != null) {
                Logger.d(f52441d, "found first MP4 videoUrl : " + str5);
                str12 = str5;
            }
            if (str12 == null && arrayList5.size() > 0) {
                str12 = (String) arrayList5.get(0);
                Logger.d(f52441d, "found first videoUrl : " + str12);
            }
            if (!TextUtils.isEmpty(str12)) {
                if (!arrayList.contains(str12)) {
                    arrayList.add(str12);
                }
                str7 = str12;
            }
            if (!TextUtils.isEmpty(strA)) {
                Logger.d(f52441d, "VAST ad found click Url = " + strA);
            }
            if (!TextUtils.isEmpty(str12)) {
                Logger.d(f52441d, "VAST ad found video url = " + str12);
            }
            str8 = strA;
        }
        a(str, z10, arrayList2, com.safedk.android.utils.f.k());
        a(str, z10, arrayList3, com.safedk.android.utils.f.j());
        a(str, z10, arrayList4, com.safedk.android.utils.f.i());
        if (str6 != null) {
            arrayList.remove(str6);
        }
        return new a(str3, str4, str6, str7, arrayList, arrayList2, arrayList3, arrayList4, list2, list3, list4, list5, z11, strA2, list, strA3, arrayList5);
    }

    private static String a(String str, String str2) throws UnsupportedEncodingException {
        if (!CreativeInfoManager.a(str2, AdNetworkConfiguration.SHOULD_DECODE_AD_TAG_TWICE, false) || !str.contains("%25")) {
            return str;
        }
        String strDecode = URLDecoder.decode(str, "UTF-8");
        Logger.d(f52441d, "Decoding URL - url was decoded once");
        if (strDecode.contains("%25")) {
            strDecode = URLDecoder.decode(strDecode, "UTF-8");
            Logger.d(f52441d, "Decoding URL - url was decoded twice");
        }
        return strDecode;
    }

    public static ArrayList<a> a(String str, boolean z10, String str2) {
        ArrayList<a> arrayList = new ArrayList<>();
        List<String> listA = k.a(com.safedk.android.utils.f.v(), str);
        if (listA.size() == 0) {
            Logger.d(f52441d, "No ad blocks detected, exiting");
            return arrayList;
        }
        Iterator<String> it = listA.iterator();
        while (it.hasNext()) {
            a aVarB = b(it.next(), z10, str2);
            if (aVarB != null) {
                arrayList.add(aVarB);
            }
        }
        return arrayList;
    }

    private static void a(String str, boolean z10, List<String> list, Pattern pattern) {
        Iterator<String> it = a(pattern, str, 1, z10).iterator();
        while (it.hasNext()) {
            String strE = k.E(it.next());
            List<String> listA = a(com.safedk.android.utils.f.w(), strE, 1, z10);
            if (listA.size() > 0) {
                strE = listA.get(0);
            }
            try {
                new URL(strE);
                list.add(strE);
            } catch (MalformedURLException e10) {
                Logger.d(f52441d, "resources inner text is malformed. cannot add this url to the resources list");
            }
        }
    }

    public static boolean a(String str) {
        return com.safedk.android.utils.f.b().matcher(str).find();
    }

    public static a b(String str, boolean z10, String str2) {
        try {
            k.b(f52441d, "vast ad info parse started, response = " + str);
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (a(com.safedk.android.utils.f.t(), str, -1, z10).size() == 0) {
                Logger.d(f52441d, "No ad blocks detected, exiting");
                return null;
            }
            String strA = null;
            String strA2 = null;
            List<String> listA = a(com.safedk.android.utils.f.u(), str, 1, z10);
            if (listA.size() > 0) {
                strA = a(listA.get(0), false);
                Logger.d(f52441d, "Ad ID detected: " + strA);
            }
            String strA3 = null;
            List<String> listA2 = a(com.safedk.android.utils.f.m(), str, 1, z10);
            if (listA2.size() > 0) {
                strA3 = a(k.k(a(listA2.get(0), z10)), str2);
                k.b(f52441d, "Vast ad uri added to followed urls : " + strA3);
                f52440c.add(new PrefetchVastAdTagUri(strA3));
            }
            List<String> listA3 = a(com.safedk.android.utils.f.r(), str, 1, z10);
            if (listA3.size() > 0) {
                strA2 = a(listA3.get(0), false);
                Logger.d(f52441d, "Ad system detected : " + strA2);
            }
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = a(com.safedk.android.utils.f.d(), str, 1, z10).iterator();
            while (it.hasNext()) {
                String strReplace = k.k(a(it.next(), z10)).replace("\\/", "/");
                arrayList.add(strReplace);
                Logger.d(f52441d, "impression url identified : " + strReplace);
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            List<String> listA4 = a(com.safedk.android.utils.f.g(), str, 1, 2, z10);
            for (int i10 = 0; i10 < listA4.size(); i10 += 2) {
                String str3 = listA4.get(i10);
                String strK = k.k(a(listA4.get(i10 + 1), z10));
                if (str3.equals("skip") || str3.equals("complete")) {
                    arrayList3.add(strK);
                    Logger.d(f52441d, "Video complete url identified : " + strK);
                } else {
                    arrayList2.add(strK);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator<String> it2 = a(com.safedk.android.utils.f.f(), str, 1, z10).iterator();
            while (it2.hasNext()) {
                arrayList4.add(k.k(a(it2.next(), z10)));
            }
            ArrayList arrayList5 = new ArrayList();
            Iterator<String> it3 = a(com.safedk.android.utils.f.e(), str, 1, z10).iterator();
            while (it3.hasNext()) {
                arrayList5.add(k.k(a(it3.next(), z10)));
            }
            return strA3 != null ? a(strA3, strA, strA2, arrayList, arrayList3, arrayList2, arrayList4, arrayList5) : a(str, z10, str, strA, strA2, arrayList, arrayList3, arrayList2, arrayList4, arrayList5);
        } catch (Throwable th2) {
            new CrashReporter().caughtException(th2);
            Logger.e(f52441d, "failed to parse vast data", th2);
            return null;
        }
    }

    public static void b(String str) {
        List<String> listA = a(com.safedk.android.utils.f.m(), str, 1, true);
        if (listA.size() > 0) {
            String strK = k.k(a(listA.get(0), true));
            k.b(f52441d, "Vast ad uri added to followed urls : " + strK);
            f52440c.add(new PrefetchVastAdTagUri(strK));
        }
    }
}
