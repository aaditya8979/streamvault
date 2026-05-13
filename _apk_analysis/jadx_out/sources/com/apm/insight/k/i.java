package com.apm.insight.k;

import com.apm.insight.CustomRequestHeader;
import com.apm.insight.MonitorCrash;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: MultipartUtility.java */
/* JADX INFO: loaded from: classes11.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HttpURLConnection f7359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f7360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f7361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f f7362e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private k f7363f;

    public i(String str, String str2, boolean z10) throws IOException {
        this.f7360c = str2;
        this.f7361d = z10;
        String str3 = "AAA" + System.currentTimeMillis() + "AAA";
        this.f7358a = str3;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        this.f7359b = httpURLConnection;
        httpURLConnection.setUseCaches(false);
        this.f7359b.setDoOutput(true);
        this.f7359b.setDoInput(true);
        this.f7359b.setRequestMethod("POST");
        CustomRequestHeader customRequestHeader = MonitorCrash.mCustomRequestHeader;
        if (customRequestHeader != null) {
            customRequestHeader.addRequestHeader(this.f7359b);
        }
        this.f7359b.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + str3);
        if (!z10) {
            this.f7362e = new f(this.f7359b.getOutputStream());
        } else {
            this.f7359b.setRequestProperty("Content-Encoding", "gzip");
            this.f7363f = new k(this.f7359b.getOutputStream());
        }
    }

    public final String a() throws IOException {
        ArrayList arrayList = new ArrayList();
        byte[] bytes = ("\r\n--" + this.f7358a + "--\r\n").getBytes();
        if (this.f7361d) {
            this.f7363f.write(bytes);
            this.f7363f.b();
            this.f7363f.a();
        } else {
            this.f7362e.write(bytes);
            this.f7362e.flush();
            this.f7362e.a();
        }
        int responseCode = this.f7359b.getResponseCode();
        if (responseCode != 200) {
            throw new IOException("Server returned non-OK status: ".concat(String.valueOf(responseCode)));
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f7359b.getInputStream()));
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            arrayList.add(line);
        }
        bufferedReader.close();
        this.f7359b.disconnect();
        StringBuilder sb2 = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
        }
        return sb2.toString();
    }

    public final void a(String str, File file, Map<String, String> map) throws IOException {
        String name = file.getName();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("--");
        sb2.append(this.f7358a);
        sb2.append("\r\nContent-Disposition: form-data; name=\"");
        sb2.append(str);
        sb2.append("\"; filename=\"");
        sb2.append(name);
        sb2.append("\"");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb2.append("; ");
            sb2.append(entry.getKey());
            sb2.append("=\"");
            sb2.append(entry.getValue());
            sb2.append("\"");
        }
        sb2.append("\r\nContent-Transfer-Encoding: binary\r\n\r\n");
        if (this.f7361d) {
            this.f7363f.write(sb2.toString().getBytes());
        } else {
            this.f7362e.write(sb2.toString().getBytes());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[8192];
        while (true) {
            int i10 = fileInputStream.read(bArr);
            if (i10 == -1) {
                break;
            } else if (this.f7361d) {
                this.f7363f.write(bArr, 0, i10);
            } else {
                this.f7362e.write(bArr, 0, i10);
            }
        }
        fileInputStream.close();
        if (this.f7361d) {
            this.f7363f.write("\r\n".getBytes());
        } else {
            this.f7362e.write("\r\n".getBytes());
            this.f7362e.flush();
        }
    }

    public final void a(String str, String str2) {
        b(str, str2);
    }

    public final void a(String str, File... fileArr) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("--");
        sb2.append(this.f7358a);
        sb2.append("\r\nContent-Disposition: form-data; name=\"");
        sb2.append(str);
        sb2.append("\"; filename=\"");
        sb2.append(str);
        sb2.append("\"\r\nContent-Transfer-Encoding: binary\r\n\r\n");
        if (this.f7361d) {
            this.f7363f.write(sb2.toString().getBytes());
        } else {
            this.f7362e.write(sb2.toString().getBytes());
        }
        if (this.f7361d) {
            com.apm.insight.l.f.a(this.f7363f, fileArr);
        } else {
            com.apm.insight.l.f.a(this.f7362e, fileArr);
        }
        if (this.f7361d) {
            this.f7363f.write("\r\n".getBytes());
        } else {
            this.f7362e.write("\r\n".getBytes());
            this.f7362e.flush();
        }
    }

    public final void b(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("--");
        sb2.append(this.f7358a);
        sb2.append("\r\nContent-Disposition: form-data; name=\"");
        sb2.append(str);
        sb2.append("\"\r\nContent-Type: text/plain; charset=");
        sb2.append(this.f7360c);
        sb2.append("\r\n\r\n");
        try {
            if (this.f7361d) {
                this.f7363f.write(sb2.toString().getBytes());
            } else {
                this.f7362e.write(sb2.toString().getBytes());
            }
        } catch (IOException unused) {
        }
        byte[] bytes = str2.getBytes();
        try {
            if (this.f7361d) {
                this.f7363f.write(bytes);
                this.f7363f.write("\r\n".getBytes());
            } else {
                this.f7362e.write(bytes);
                this.f7362e.write("\r\n".getBytes());
            }
        } catch (IOException unused2) {
        }
    }
}
