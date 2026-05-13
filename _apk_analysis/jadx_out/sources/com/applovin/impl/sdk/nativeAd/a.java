package com.applovin.impl.sdk.nativeAd;

import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.f2;
import com.applovin.impl.i5;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.UUID;

/* JADX INFO: loaded from: classes8.dex */
public class a extends i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AppLovinNativeAdImpl f10206g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC0155a f10207h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f10208i;

    /* JADX INFO: renamed from: com.applovin.impl.sdk.nativeAd.a$a, reason: collision with other inner class name */
    public interface InterfaceC0155a {
        void a(AppLovinNativeAdImpl appLovinNativeAdImpl);
    }

    public a(AppLovinNativeAdImpl appLovinNativeAdImpl, com.applovin.impl.sdk.k kVar, InterfaceC0155a interfaceC0155a) {
        super("TaskCacheNativeAd", kVar);
        this.f10208i = UUID.randomUUID().toString();
        this.f10206g = appLovinNativeAdImpl;
        this.f10207h = interfaceC0155a;
    }

    private float a(Uri uri) {
        FileInputStream fileInputStream;
        int i10;
        int i11;
        File file = new File(uri.getPath());
        if (!file.exists()) {
            return -1.0f;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(fileInputStream, null, options);
                i10 = options.outWidth;
                i11 = options.outHeight;
            } finally {
            }
        } catch (IOException e10) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8507c.a(this.f8506b, "Failed to calculate aspect ratio", e10);
            }
        }
        if (i10 <= 0 || i11 <= 0) {
            fileInputStream.close();
            return -1.0f;
        }
        float f10 = i10 / i11;
        fileInputStream.close();
        return f10;
    }

    private Uri b(Uri uri) {
        if (uri == null) {
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f8507c.a(this.f8506b, "Attempting to cache resource: " + uri);
        }
        String strA = this.f8505a.G().a(a(), uri.toString(), this.f10206g.getCachePrefix(), Collections.emptyList(), false, false, 1, this.f10208i, f2.a(this.f10206g));
        if (TextUtils.isEmpty(strA)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8507c.b(this.f8506b, "Unable to cache resource for uri: " + uri);
            }
            return null;
        }
        File fileA = this.f8505a.G().a(strA, a());
        if (fileA != null) {
            Uri uriFromFile = Uri.fromFile(fileA);
            if (uriFromFile != null) {
                return uriFromFile;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f8507c.b(this.f8506b, "Unable to extract Uri from image file");
            }
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f8507c.b(this.f8506b, "Unable to retrieve File from cached image filename = " + strA);
        }
        return null;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f8507c.a(this.f8506b, "Begin caching ad #" + this.f10206g.getAdIdNumber() + "...");
        }
        Uri uriB = b(this.f10206g.getIconUri());
        if (uriB != null) {
            this.f10206g.setIconUri(uriB);
        }
        Uri uriB2 = b(this.f10206g.getMainImageUri());
        if (uriB2 != null) {
            this.f10206g.setMainImageUri(uriB2);
            float fA = a(uriB2);
            if (fA > 0.0f) {
                this.f10206g.setMainImageAspectRatio(fA);
            }
        }
        Uri uriB3 = b(this.f10206g.getPrivacyIconUri());
        if (uriB3 != null) {
            this.f10206g.setPrivacyIconUri(uriB3);
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f8507c.a(this.f8506b, "Finished caching ad #" + this.f10206g.getAdIdNumber());
        }
        this.f10207h.a(this.f10206g);
    }
}
