package com.safedk.android.analytics.brandsafety;

import android.os.Bundle;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.Logger;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public class k {
    private static final String A = "policy";
    private static final String B = "s3_key_prefix";
    private static final String C = "image_id";
    private static final String D = "Content-Type";
    private static final String E = ".jpg";
    private static k F = null;
    private static final Object G = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f52626a = "original_url";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f52627b = "resolved_url";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f52628c = "fingerprint";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f52629d = "sdk_uuid";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f52630e = "impression_id";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f52631f = "package";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f52632g = "ImageUploadManager";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f52633h = "type";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f52634i = "hash";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f52635j = "sdk";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f52636k = "keys";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f52637l = "images_to_upload";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f52638m = "images_to_discard";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f52639n = "s3_access_tokens";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f52640o = "resolve_urls";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f52641p = "url";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f52642q = "base_url";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f52643r = "attributes";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f52644s = "bucket";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f52645t = "x-amz-date";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f52646u = "signature";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f52647v = "AWSAccessKeyId";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f52648w = "acl";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f52649x = "x-amz-server-side-encryption";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f52650y = "x-amz-algorithm";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f52651z = "x-amz-credential";

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f52653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f52654b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f52655c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f52656d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        String f52657e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        String f52658f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        String f52659g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        String f52660h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        String f52661i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        String f52662j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        String f52663k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        String f52664l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        String f52665m;

        public a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
            this.f52653a = str;
            this.f52654b = str2;
            this.f52655c = str3;
            this.f52656d = str4;
            this.f52657e = str5;
            this.f52658f = str6;
            this.f52659g = str7;
            this.f52660h = str8;
            this.f52661i = str9;
            this.f52662j = str10;
            this.f52663k = str11;
            this.f52664l = str12;
            this.f52665m = str13;
            Logger.d(k.f52632g, "AwsUploadParams ctor, awsAccessKey=" + str + ", keyPrefix=" + str4 + ", bucket=" + str5);
        }

        public String a() {
            return this.f52653a;
        }

        public String b() {
            return this.f52654b;
        }

        public String c() {
            return this.f52655c;
        }

        public String d() {
            return this.f52656d;
        }

        public String e() {
            return this.f52657e;
        }

        public String f() {
            return this.f52658f;
        }

        public String g() {
            return this.f52660h;
        }

        public String h() {
            return this.f52661i;
        }

        public String i() {
            return this.f52662j;
        }

        public String j() {
            return this.f52663k;
        }

        public String k() {
            return this.f52664l;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("BaseUrl=" + this.f52658f + ", keyPrefix = " + this.f52656d);
            return sb2.toString();
        }
    }

    class b implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        BrandSafetyUtils.AdType f52667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f52668b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        a f52669c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f52670d;

        b(BrandSafetyUtils.AdType adType, String str, a aVar, String str2) {
            this.f52667a = adType;
            this.f52668b = str;
            this.f52669c = aVar;
            this.f52670d = str2;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f52667a.ordinal() - ((b) obj).f52667a.ordinal();
        }
    }

    private k() {
        b();
    }

    public static synchronized k a() {
        if (F == null) {
            F = new k();
        }
        return F;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Bundle bundle) {
        try {
            Logger.d(f52632g, "Response from server: " + bundle.toString());
            String string = null;
            String string2 = null;
            String string3 = null;
            String string4 = null;
            String string5 = null;
            String string6 = null;
            String string7 = null;
            String string8 = null;
            String string9 = null;
            String string10 = null;
            String string11 = null;
            if (bundle.containsKey(f52639n)) {
                Bundle bundle2 = bundle.getBundle(f52639n);
                Logger.d(f52632g, "s3AccessTokens=" + bundle2.toString());
                string = bundle2.getString(f52642q);
                Bundle bundle3 = bundle2.getBundle(f52643r);
                string2 = bundle3.getString(f52644s);
                string3 = bundle3.getString(f52645t);
                string4 = bundle3.getString("signature");
                string5 = bundle3.getString(f52647v);
                string6 = bundle3.getString(f52648w);
                string7 = bundle3.getString(f52649x);
                string8 = bundle3.getString(f52650y);
                string9 = bundle3.getString(f52651z);
                string10 = bundle3.getString(A);
                string11 = bundle3.getString("Content-Type");
                Logger.d(f52632g, "s3 credentials collected");
            }
            ArrayList arrayList = new ArrayList();
            if (bundle.containsKey(f52637l)) {
                ArrayList<String> stringArrayList = bundle.getStringArrayList(f52637l);
                Logger.d(f52632g, "imagesToUploadArrayList=" + stringArrayList.toString());
                for (int i10 = 0; i10 < stringArrayList.size(); i10++) {
                    Bundle bundle4 = (Bundle) stringArrayList.get(i10);
                    String string12 = bundle4.getString(f52628c);
                    String string13 = bundle4.getString("image_id");
                    String string14 = bundle4.getString(B);
                    Logger.d(f52632g, "imagesToUploadBundle item : fingerprint=" + string12 + ", imageId=" + string13 + ", s3KeyPrefix=" + string14);
                    a aVar = new a(string5, string10, string4, string14, string2, string, string5, string6, string8, string3, string7, string9, string11);
                    c cVarH = com.safedk.android.analytics.brandsafety.b.h(string13);
                    if (cVarH != null) {
                        Logger.d(f52632g, "Image for upload added : " + string14);
                        arrayList.add(new b(cVarH.f51883p, string13, aVar, string12));
                    }
                }
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    b bVar = (b) arrayList.get(i11);
                    if (bVar.f52667a != null) {
                        com.safedk.android.analytics.brandsafety.a aVarA = SafeDK.getInstance().a(bVar.f52667a);
                        if (aVarA != null) {
                            Logger.d(f52632g, "Executing image upload request for ad type " + bVar.f52667a.name());
                            aVarA.a(bVar.f52669c, bVar.f52668b, bVar.f52670d);
                        } else {
                            Logger.d(f52632g, "Upload: finder not found for ad type " + bVar.f52667a.name());
                        }
                    } else {
                        Logger.d(f52632g, "Upload: finder not found for ad type null");
                    }
                }
            }
            if (bundle.containsKey(f52640o)) {
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList(f52640o);
                Logger.d(f52632g, "clickUrlsToResolveArrayList=" + stringArrayList2.toString());
                for (int i12 = 0; i12 < stringArrayList2.size(); i12++) {
                    Bundle bundle5 = (Bundle) stringArrayList2.get(i12);
                    String string15 = bundle5.getString(f52628c);
                    String string16 = bundle5.getString("sdk_uuid");
                    String string17 = bundle5.getString("impression_id");
                    String string18 = bundle5.getString("url");
                    Logger.d(f52632g, "clickUrlsToResolveBundle item : fingerprint=" + string15 + ", url=" + string18);
                    if (string15 == null || string18 == null) {
                        Logger.d(f52632g, "fingerprint and url are null, skipping");
                    } else {
                        i.a().a(string18, string15, string16, string17);
                    }
                }
            }
            if (bundle.containsKey(f52638m)) {
                ArrayList<String> stringArrayList3 = bundle.getStringArrayList(f52638m);
                Logger.d(f52632g, "Images to discard : " + stringArrayList3.toString());
                for (String str : stringArrayList3) {
                    c cVarH2 = com.safedk.android.analytics.brandsafety.b.h(str);
                    if (cVarH2 != null) {
                        com.safedk.android.analytics.brandsafety.a aVarA2 = SafeDK.getInstance().a(cVarH2.f51883p);
                        if (aVarA2 != null) {
                            Logger.d(f52632g, "Executing image discard request for hash " + str);
                            aVarA2.d(str);
                        } else {
                            Logger.d(f52632g, "Discard : finder not found for image id " + str);
                        }
                    }
                }
            }
            if (bundle.isEmpty() || !bundle.containsKey(f52637l)) {
                c();
            }
        } catch (Throwable th2) {
            Logger.e(f52632g, "Failed to handle response from server", th2);
            new CrashReporter().caughtException(th2);
        }
    }

    private void b() {
        AppLovinBridge.registerListener(AppLovinBridge.f51530b, new com.safedk.android.analytics.b() { // from class: com.safedk.android.analytics.brandsafety.k.1
            @Override // com.safedk.android.analytics.b
            public void a(String str, Bundle bundle) {
                Logger.d(k.f52632g, "Response received");
                k.this.a(bundle);
            }
        });
    }

    private void c() {
        Iterator<com.safedk.android.analytics.brandsafety.b> it = SafeDK.getInstance().x().values().iterator();
        while (it.hasNext()) {
            it.next().b((l) null);
        }
    }
}
