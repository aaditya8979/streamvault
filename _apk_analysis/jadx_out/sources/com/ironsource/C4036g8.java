package com.ironsource;

import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLException;

/* JADX INFO: renamed from: com.ironsource.g8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C4036g8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f31784a = "POST";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f31785b = "GET";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f31786c = "ISHttpService";

    /* JADX INFO: renamed from: com.ironsource.g8$a */
    public static class a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f31787h = 15000;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f31788i = 15000;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f31789j = "UTF-8";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f31790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f31791b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f31792c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f31793d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f31794e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f31795f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ArrayList<Pair<String, String>> f31796g;

        /* JADX INFO: renamed from: com.ironsource.g8$a$a, reason: collision with other inner class name */
        public static class C0385a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public String f31798b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public String f31800d;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public List<Pair<String, String>> f31797a = new ArrayList();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public String f31799c = "POST";

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f31801e = 15000;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public int f31802f = 15000;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public String f31803g = "UTF-8";

            public C0385a a(int i10) {
                this.f31801e = i10;
                return this;
            }

            public C0385a a(Pair<String, String> pair) {
                this.f31797a.add(pair);
                return this;
            }

            public C0385a a(String str) {
                this.f31800d = str;
                return this;
            }

            public C0385a a(List<Pair<String, String>> list) {
                this.f31797a.addAll(list);
                return this;
            }

            public a a() {
                return new a(this);
            }

            public C0385a b(int i10) {
                this.f31802f = i10;
                return this;
            }

            public C0385a b(String str) {
                this.f31803g = str;
                return this;
            }

            public C0385a c(String str) {
                this.f31798b = str;
                return this;
            }

            public C0385a d(String str) {
                this.f31799c = str;
                return this;
            }
        }

        public a(C0385a c0385a) {
            this.f31790a = c0385a.f31798b;
            this.f31791b = c0385a.f31799c;
            this.f31792c = c0385a.f31800d;
            this.f31796g = new ArrayList<>(c0385a.f31797a);
            this.f31793d = c0385a.f31801e;
            this.f31794e = c0385a.f31802f;
            this.f31795f = c0385a.f31803g;
        }

        public boolean a() {
            return "POST".equals(this.f31791b);
        }
    }

    public static Gd a(String str, String str2, List<Pair<String, String>> list) throws Exception {
        Uri uriBuild = Uri.parse(str).buildUpon().encodedQuery(str2).build();
        a.C0385a c0385a = new a.C0385a();
        c0385a.c(uriBuild.toString()).a(str2).d("GET").a(list);
        return b(c0385a.a());
    }

    private static HttpURLConnection a(a aVar) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(aVar.f31790a).openConnection();
        httpURLConnection.setConnectTimeout(aVar.f31793d);
        httpURLConnection.setReadTimeout(aVar.f31794e);
        httpURLConnection.setRequestMethod(aVar.f31791b);
        return httpURLConnection;
    }

    private static void a(HttpURLConnection httpURLConnection, a aVar) throws Exception {
        if (aVar.a()) {
            byte[] bytes = aVar.f31792c.getBytes(aVar.f31795f);
            httpURLConnection.setRequestProperty("Content-Length", Integer.toString(bytes.length));
            a(httpURLConnection, bytes);
        }
    }

    private static void a(HttpURLConnection httpURLConnection, List<Pair<String, String>> list) throws ProtocolException {
        for (Pair<String, String> pair : list) {
            httpURLConnection.setRequestProperty((String) pair.first, (String) pair.second);
        }
    }

    private static void a(HttpURLConnection httpURLConnection, byte[] bArr) throws Exception {
        httpURLConnection.setDoOutput(true);
        DataOutputStream dataOutputStream = new DataOutputStream(IronSourceNetworkBridge.urlConnectionGetOutputStream(httpURLConnection));
        try {
            dataOutputStream.write(bArr);
            dataOutputStream.flush();
        } finally {
            dataOutputStream.close();
        }
    }

    private static boolean a(String str, String str2) {
        return (str == null || str.isEmpty() || str2 == null || str2.isEmpty()) ? false : true;
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x00a0: MOVE (r8 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:42:0x00a0 */
    public static Gd b(a aVar) throws Exception {
        HttpURLConnection httpURLConnectionA;
        InputStream inputStream;
        InputStream inputStream2;
        if (!a(aVar.f31790a, aVar.f31792c)) {
            throw new InvalidParameterException("not valid params");
        }
        Gd gd2 = new Gd();
        InputStream inputStreamUrlConnectionGetInputStream = null;
        inputStreamUrlConnectionGetInputStream = null;
        inputStreamUrlConnectionGetInputStream = null;
        inputStreamUrlConnectionGetInputStream = null;
        inputStreamUrlConnectionGetInputStream = null;
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                httpURLConnectionA = a(aVar);
            } catch (Throwable th2) {
                th = th2;
                httpURLConnectionA = null;
                inputStreamUrlConnectionGetInputStream = inputStream2;
            }
            try {
                a(httpURLConnectionA, aVar.f31796g);
                a(httpURLConnectionA, aVar);
                inputStreamUrlConnectionGetInputStream = IronSourceNetworkBridge.urlConnectionGetInputStream(httpURLConnectionA);
                gd2.f29471a = IronSourceNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnectionA);
                if (inputStreamUrlConnectionGetInputStream != null) {
                    gd2.f29472b = C4062hg.a(inputStreamUrlConnectionGetInputStream);
                }
            } catch (InterruptedIOException e10) {
                e = e10;
                Log.d(f31786c, "Failed post to " + aVar.f31790a + " exception: " + e.getMessage());
                throw e;
            } catch (SSLException e11) {
                e = e11;
                Log.d(f31786c, "Failed post to " + aVar.f31790a + " exception: " + e.getMessage());
                throw e;
            } catch (IOException e12) {
                e = e12;
                inputStream = inputStreamUrlConnectionGetInputStream;
                httpURLConnection = httpURLConnectionA;
                C4228r4.d().a(e);
                if (httpURLConnection != null && httpURLConnection.getHeaderFields().isEmpty()) {
                    throw new Fc(e);
                }
                if (httpURLConnection != null) {
                    int iHttpUrlConnectionGetResponseCode = IronSourceNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                    gd2.f29471a = iHttpUrlConnectionGetResponseCode;
                    if (iHttpUrlConnectionGetResponseCode >= 400) {
                        Log.d(f31786c, "Failed post to " + aVar.f31790a + " StatusCode: " + gd2.f29471a);
                        if (inputStream != null) {
                            InputStream inputStream3 = inputStream;
                            httpURLConnectionA = httpURLConnection;
                            inputStreamUrlConnectionGetInputStream = inputStream3;
                            inputStreamUrlConnectionGetInputStream.close();
                        } else {
                            httpURLConnectionA = httpURLConnection;
                        }
                    }
                }
                throw e;
            } catch (Throwable th3) {
                th = th3;
                if (inputStreamUrlConnectionGetInputStream != null) {
                    inputStreamUrlConnectionGetInputStream.close();
                }
                if (httpURLConnectionA != null) {
                    IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnectionA);
                }
                throw th;
            }
        } catch (InterruptedIOException e13) {
            e = e13;
            Log.d(f31786c, "Failed post to " + aVar.f31790a + " exception: " + e.getMessage());
            throw e;
        } catch (SSLException e14) {
            e = e14;
            Log.d(f31786c, "Failed post to " + aVar.f31790a + " exception: " + e.getMessage());
            throw e;
        } catch (IOException e15) {
            e = e15;
            inputStream = null;
        } catch (Throwable th4) {
            th = th4;
            httpURLConnectionA = null;
        }
        if (inputStreamUrlConnectionGetInputStream != null) {
            inputStreamUrlConnectionGetInputStream.close();
        }
        IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnectionA);
        return gd2;
    }

    public static Gd b(String str, String str2, List<Pair<String, String>> list) throws Exception {
        a.C0385a c0385a = new a.C0385a();
        c0385a.c(str).a(str2).d("POST").a(list);
        return b(c0385a.a());
    }
}
