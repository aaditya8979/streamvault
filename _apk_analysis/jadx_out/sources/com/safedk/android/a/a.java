package com.safedk.android.a;

import com.ironsource.C3978d4;
import com.safedk.android.analytics.brandsafety.k;
import com.safedk.android.utils.Logger;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f51504b = "AwsS3UploadImage";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    k.a f51505a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f51506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f51507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f51508e;

    /* JADX INFO: renamed from: com.safedk.android.a.a$a, reason: collision with other inner class name */
    public class C0701a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f51510b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f51511c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f51512d;

        C0701a(String str, int i10, String str2) {
            this.f51510b = str;
            this.f51511c = i10;
            this.f51512d = str2;
        }

        public String a() {
            return this.f51510b;
        }

        public int b() {
            return this.f51511c;
        }

        public String c() {
            return this.f51512d;
        }
    }

    public a(String str, String str2, int i10, k.a aVar) {
        this.f51506c = i10;
        this.f51507d = str;
        this.f51508e = str2;
        this.f51505a = aVar;
        Logger.d(f51504b, "AwsS3UploadImage object created, Image path=" + str + ", hash=" + str2 + ", params =" + aVar.toString());
    }

    public C0701a a() {
        C0701a c0701a;
        if (this.f51507d == null) {
            Logger.d(f51504b, "Image file to upload is null");
            return null;
        }
        try {
            String str = this.f51505a.f() + "/";
            Logger.d(f51504b, "About to upload image to " + str + ", prefix=" + this.f51505a.d() + ",Image path: " + this.f51507d);
            c cVar = new c("POST", str, "UTF-8", this.f51506c, new HashMap());
            File file = new File(this.f51507d);
            if (file.exists()) {
                cVar.a("key", this.f51505a.d() + "/" + this.f51508e + ".jpg");
                cVar.a("AWSAccessKeyId", this.f51505a.a());
                cVar.a("acl", this.f51505a.g());
                cVar.a("Content-Type", "image/jpeg");
                cVar.a("policy", this.f51505a.b());
                cVar.a(InAppPurchaseMetaData.KEY_SIGNATURE, this.f51505a.c());
                cVar.a("x-amz-server-side-encryption", this.f51505a.j());
                cVar.a("X-Amz-Credential", this.f51505a.k());
                cVar.a("X-Amz-Algorithm", this.f51505a.h());
                cVar.a("X-Amz-Date", this.f51505a.i());
                cVar.a(C3978d4.i.f31327b, file);
                cVar.a();
                String str2 = this.f51505a.f() + "/" + this.f51505a.d() + "/" + this.f51508e + ".jpg";
                Logger.d(f51504b, "Image uploaded successfully");
                c0701a = new C0701a(str2, cVar.b(), this.f51508e);
            } else {
                Logger.d(f51504b, "Image file to upload not found " + this.f51507d);
                c0701a = null;
            }
            return c0701a;
        } catch (IOException e10) {
            Logger.d(f51504b, "IOException when uploading image file " + this.f51507d + " : " + e10.getMessage(), e10);
            return null;
        } catch (Throwable th2) {
            Logger.e(f51504b, "Failed to upload image file " + this.f51507d + " : " + th2.getMessage(), th2);
            return null;
        }
    }
}
