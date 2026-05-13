package com.safedk.android.a;

import android.os.Build;
import com.safedk.android.utils.Logger;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f51519a = "MultipartUtility";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f51520c = "\r\n";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f51521b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private e f51522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f51523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private OutputStream f51524f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private PrintWriter f51525g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f51526h = 0;

    public c(String str, String str2, String str3, int i10, Map<String, String> map) throws IOException {
        Logger.d(f51519a, "ctor started, requestURL = " + str2);
        this.f51523e = str3;
        this.f51521b = "BOUNDARY-BOUNDARY" + System.currentTimeMillis() + "BOUNDARY";
        this.f51522d = new e(new URL(str2).openConnection());
        this.f51522d.a(str);
        this.f51522d.a(false);
        this.f51522d.b(true);
        this.f51522d.d(true);
        this.f51522d.a("Content-Type", "multipart/form-data; boundary=" + this.f51521b);
        this.f51522d.a("User-Agent", "AppLovinQualityService/5.4.0 (Android " + Build.VERSION.RELEASE + ")");
        this.f51522d.a("Accept-Encoding", "gzip,deflate");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.f51522d.a(entry.getKey(), entry.getValue());
        }
        this.f51522d.a(i10);
        this.f51522d.b(i10);
        this.f51524f = this.f51522d.a();
        this.f51525g = new PrintWriter((Writer) new OutputStreamWriter(this.f51524f, str3), true);
    }

    public List<String> a() throws IOException {
        Logger.d(f51519a, "finish started");
        ArrayList arrayList = new ArrayList();
        this.f51525g.append((CharSequence) f51520c).flush();
        this.f51525g.append((CharSequence) ("--" + this.f51521b + "--")).append((CharSequence) f51520c);
        this.f51525g.close();
        this.f51526h = this.f51522d.b();
        Logger.d(f51519a, "Response code = " + this.f51526h);
        if (this.f51526h < 200 || this.f51526h >= 300) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f51522d.g()));
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    Logger.e(f51519a, "Error message: " + ((Object) sb2));
                    throw new IOException("Server returned non-OK status: " + this.f51526h);
                }
                sb2.append(line);
            }
        } else {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(this.f51522d.e()));
            while (true) {
                String line2 = bufferedReader2.readLine();
                if (line2 == null) {
                    bufferedReader2.close();
                    this.f51522d.d();
                    return arrayList;
                }
                arrayList.add(line2);
            }
        }
    }

    public void a(String str, File file) throws IOException {
        String name = file.getName();
        this.f51525g.append((CharSequence) ("--" + this.f51521b)).append((CharSequence) f51520c);
        this.f51525g.append((CharSequence) ("Content-Disposition: form-data; name=\"" + str + "\"; filename=\"" + name + "\"")).append((CharSequence) f51520c);
        this.f51525g.append((CharSequence) "Content-Type: application/octet-stream").append((CharSequence) f51520c);
        this.f51525g.append((CharSequence) f51520c);
        this.f51525g.flush();
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[4096];
        while (true) {
            int i10 = fileInputStream.read(bArr);
            if (i10 == -1) {
                this.f51524f.flush();
                fileInputStream.close();
                this.f51525g.append((CharSequence) f51520c);
                this.f51525g.flush();
                return;
            }
            this.f51524f.write(bArr, 0, i10);
        }
    }

    public void a(String str, String str2) {
        this.f51525g.append((CharSequence) ("--" + this.f51521b)).append((CharSequence) f51520c);
        this.f51525g.append((CharSequence) ("Content-Disposition: form-data; name=\"" + str + "\"")).append((CharSequence) f51520c);
        this.f51525g.append((CharSequence) ("Content-Type: text/plain; charset=" + this.f51523e)).append((CharSequence) f51520c);
        this.f51525g.append((CharSequence) f51520c);
        this.f51525g.append((CharSequence) str2).append((CharSequence) f51520c);
        this.f51525g.flush();
    }

    public int b() {
        return this.f51526h;
    }

    public void b(String str, String str2) {
        this.f51525g.append((CharSequence) (str + ": " + str2)).append((CharSequence) f51520c);
        this.f51525g.flush();
    }
}
