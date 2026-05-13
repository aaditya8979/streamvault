package com.safedk.android.a;

import com.safedk.android.SafeDK;
import com.safedk.android.utils.Logger;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes9.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f51527a = e.class.getSimpleName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HttpURLConnection f51528b;

    public e(URLConnection uRLConnection) {
        this.f51528b = (HttpURLConnection) uRLConnection;
    }

    public OutputStream a() throws IOException {
        return this.f51528b.getOutputStream();
    }

    public void a(int i10) {
        this.f51528b.setConnectTimeout(i10);
    }

    public void a(String str) throws ProtocolException {
        this.f51528b.setRequestMethod(str);
    }

    public void a(String str, String str2) {
        this.f51528b.setRequestProperty(str, str2);
    }

    public void a(boolean z10) {
        this.f51528b.setUseCaches(z10);
    }

    public int b() throws IOException {
        return this.f51528b.getResponseCode();
    }

    public String b(String str) {
        return this.f51528b.getHeaderField(str);
    }

    public void b(int i10) {
        this.f51528b.setReadTimeout(i10);
    }

    public void b(boolean z10) {
        this.f51528b.setDoOutput(z10);
    }

    public URL c() {
        return this.f51528b.getURL();
    }

    public void c(boolean z10) {
        this.f51528b.setInstanceFollowRedirects(z10);
    }

    public void d() {
        this.f51528b.disconnect();
    }

    public void d(boolean z10) {
        this.f51528b.setDoInput(z10);
    }

    public InputStream e() throws IOException {
        return this.f51528b.getInputStream();
    }

    public void f() throws IOException {
        if (SafeDK.getInstance().s()) {
            Logger.e(f51527a, "SafeDK network activity in offline mode ");
            Logger.printStackTrace();
        }
        this.f51528b.connect();
    }

    public InputStream g() {
        return this.f51528b.getErrorStream();
    }
}
