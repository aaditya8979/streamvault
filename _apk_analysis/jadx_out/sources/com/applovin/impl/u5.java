package com.applovin.impl;

import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.b0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public class u5 extends i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f10482g;

    public class a extends l6 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, String str3) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8507c.b(this.f8506b, "Unable to fetch app details due to: " + str2 + ", and received error code: " + i10);
            }
            u5.this.f10482g.a(b0.b.APP_DETAILS_NOT_FOUND);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, String str2, int i10) {
            if (TextUtils.isEmpty(str2)) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8507c.b(this.f8506b, "No developer URI found - response from the Play Store is empty");
                }
                u5.this.f10482g.a(b0.b.APP_DETAILS_NOT_FOUND);
                return;
            }
            Matcher matcher = Pattern.compile("(?<=\"appstore:developer_url\" content=\").*?(?=\">)").matcher(str2);
            if (!matcher.find()) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8507c.b(this.f8506b, "No developer URI found - unable to find the developer_url meta tag from the Play Store listing");
                }
                u5.this.f10482g.a(b0.b.INVALID_DEVELOPER_URI);
                return;
            }
            String strGroup = matcher.group();
            if (URLUtil.isValidUrl(strGroup)) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8507c.a(this.f8506b, "Found developer URI: " + strGroup);
                }
                u5.this.f10482g.a(strGroup);
                return;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f8507c.b(this.f8506b, "Developer URI (" + strGroup + ") is not valid");
            }
            u5.this.f10482g.a(b0.b.INVALID_DEVELOPER_URI);
        }
    }

    public interface b {
        void a(b0.b bVar);

        void a(String str);
    }

    public u5(com.applovin.impl.sdk.k kVar, b bVar) {
        super("TaskFetchDeveloperUri", kVar);
        this.f10482g = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        String strValueOf = String.valueOf(this.f8505a.A().G().get("package_name"));
        if (com.applovin.impl.sdk.o.a()) {
            this.f8507c.a(this.f8506b, "Looking up developer URI for package name: " + strValueOf);
        }
        this.f8505a.q0().a(new a(com.applovin.impl.sdk.network.a.a(this.f8505a).c("GET").b("https://play.google.com/store/apps/details?id=" + strValueOf).a((Object) "").a(false).a(), this.f8505a));
    }
}
