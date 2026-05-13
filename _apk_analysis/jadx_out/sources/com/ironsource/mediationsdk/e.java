package com.ironsource.mediationsdk;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ironsource.C4002ea;
import com.ironsource.C4157n2;
import com.ironsource.C4193p2;
import com.ironsource.C4196p5;
import com.ironsource.C4228r4;
import com.ironsource.N9;
import com.ironsource.S1;
import com.ironsource.T1;
import com.ironsource.Y1;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.d;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32567a = "1";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32568b = "102";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f32569c = "102";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f32570d = "GenericNotifications";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f f32571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private IronSource.a f32572f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C4193p2 f32573g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private S1 f32574h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ISBannerSize f32575i;

    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public S1 f32576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public d.a f32577b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f32578c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f32579d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f32580e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f32581f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f32583h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final URL f32586k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final JSONObject f32587l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final boolean f32588m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f32589n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final long f32590o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final boolean f32591p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final boolean f32592q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final boolean f32593r;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f32584i = "";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f32585j = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f32582g = a((Integer) null);

        public a(S1 s12, URL url, JSONObject jSONObject, boolean z10, C4193p2 c4193p2) {
            this.f32576a = s12;
            this.f32586k = url;
            this.f32587l = jSONObject;
            this.f32588m = z10;
            this.f32589n = c4193p2.g();
            this.f32590o = c4193p2.m();
            this.f32591p = c4193p2.o();
            this.f32592q = c4193p2.p();
            this.f32583h = c4193p2.d();
            this.f32593r = c4193p2.n();
        }

        private String a() {
            return this.f32583h == 2 ? C4196p5.b().d() : C4196p5.b().c();
        }

        private String a(Integer num) {
            return Y1.f30685a.a(this.f32593r, num);
        }

        private String a(HttpURLConnection httpURLConnection) throws IOException {
            InputStreamReader inputStreamReader = new InputStreamReader(IronSourceNetworkBridge.urlConnectionGetInputStream(httpURLConnection));
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    inputStreamReader.close();
                    return sb2.toString();
                }
                sb2.append(line);
            }
        }

        private HttpURLConnection a(URL url, long j10) throws IOException {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            httpURLConnection.setReadTimeout((int) j10);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            return httpURLConnection;
        }

        private JSONObject a(String str, String str2) throws JSONException {
            String strB = N9.b(str, str2);
            if (TextUtils.isEmpty(strB)) {
                throw new JSONException("decryption error");
            }
            return IronSourceVideoBridge.jsonObjectInit(strB);
        }

        private void a(long j10, long j11) {
            long time = j10 - (new Date().getTime() - j11);
            if (time > 0) {
                SystemClock.sleep(time);
            }
        }

        private void a(HttpURLConnection httpURLConnection, JSONObject jSONObject, boolean z10) throws Exception {
            String strA;
            String strE;
            OutputStream outputStreamUrlConnectionGetOutputStream = IronSourceNetworkBridge.urlConnectionGetOutputStream(httpURLConnection);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStreamUrlConnectionGetOutputStream, "UTF-8");
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            if (this.f32583h == 2) {
                try {
                    strA = C4196p5.b().a();
                } catch (JSONException e10) {
                    C4228r4.d().a(e10);
                    this.f32584i = e10.getLocalizedMessage();
                    this.f32585j = 1015;
                    this.f32583h = 1;
                    IronLog.INTERNAL.error("get encrypted session key exception " + e10.getMessage());
                    strA = "";
                }
            } else {
                strA = "";
            }
            String string = jSONObject.toString();
            String strA2 = a();
            if (z10) {
                IronLog.INTERNAL.verbose("compressing and encrypting auction request");
                strE = N9.a(strA2, string);
            } else {
                strE = N9.e(strA2, string);
            }
            bufferedWriter.write(this.f32583h == 2 ? String.format(T1.f30438d, strA, strE) : String.format(T1.f30437c, strE));
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStreamWriter.close();
            outputStreamUrlConnectionGetOutputStream.close();
        }

        private JSONObject b(String str, String str2) throws JSONException {
            IronLog.INTERNAL.verbose("decrypting and decompressing auction response");
            String strD = N9.d(str, str2);
            if (strD != null) {
                return IronSourceVideoBridge.jsonObjectInit(strD);
            }
            throw new JSONException("decompression error");
        }

        public JSONObject a(JSONObject jSONObject, boolean z10) throws JSONException {
            String strA = a();
            String string = jSONObject.getString(this.f32583h == 2 ? T1.f30436b : "response");
            return z10 ? b(strA, string) : a(strA, string);
        }

        public void a(String str, boolean z10, boolean z11) throws JSONException {
            if (TextUtils.isEmpty(str)) {
                throw new JSONException("empty response");
            }
            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(str);
            if (z10) {
                jSONObjectJsonObjectInit = a(jSONObjectJsonObjectInit, z11);
            }
            d.a aVarA = d.b().a(jSONObjectJsonObjectInit);
            this.f32577b = aVarA;
            this.f32578c = aVarA.c();
            this.f32579d = this.f32577b.d();
        }

        public void a(boolean z10, S1 s12, long j10) {
            if (z10) {
                s12.a(this.f32577b.h(), this.f32577b.a(), this.f32577b.e(), this.f32577b.f(), this.f32577b.b(), this.f32581f + 1, j10, this.f32585j, this.f32584i);
            } else {
                s12.a(this.f32578c, this.f32579d, this.f32581f + 1, this.f32582g, j10);
            }
        }

        public boolean b() {
            long time;
            IronLog ironLog;
            int iHttpUrlConnectionGetResponseCode;
            this.f32580e = new Date().getTime();
            try {
                this.f32583h = this.f32585j == 1015 ? 1 : this.f32583h;
                this.f32581f = 0;
                HttpURLConnection httpURLConnectionA = null;
                while (true) {
                    int i10 = this.f32581f;
                    int i11 = this.f32589n;
                    if (i10 >= i11) {
                        this.f32581f = i11 - 1;
                        this.f32582g = a(Integer.valueOf(this.f32578c));
                        return false;
                    }
                    try {
                        time = new Date().getTime();
                        String str = "Auction Handler: auction trial " + (this.f32581f + 1) + " out of " + this.f32589n + " max trials";
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, str, 0);
                        IronSourceUtils.i(str);
                        httpURLConnectionA = a(this.f32586k, this.f32590o);
                        ironLog = IronLog.INTERNAL;
                        ironLog.verbose("parameters for auction url: " + this.f32586k.getQuery());
                        ironLog.verbose("parameters for auction POST data: " + this.f32587l);
                        a(httpURLConnectionA, this.f32587l, this.f32591p);
                        iHttpUrlConnectionGetResponseCode = IronSourceNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnectionA);
                    } catch (SocketTimeoutException e10) {
                        C4228r4.d().a(e10);
                        if (httpURLConnectionA != null) {
                            IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnectionA);
                        }
                        this.f32578c = 1006;
                        this.f32579d = T1.f30442h;
                        IronLog.INTERNAL.error("Auction socket timeout exception " + e10.getMessage());
                    } catch (Throwable th2) {
                        C4228r4.d().a(th2);
                        IronLog.INTERNAL.error("getting exception " + th2);
                        if (httpURLConnectionA != null) {
                            IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnectionA);
                        }
                        this.f32578c = 1000;
                        this.f32579d = th2.getMessage();
                        this.f32582g = a(Integer.valueOf(this.f32578c));
                        return false;
                    }
                    if (iHttpUrlConnectionGetResponseCode == 200 || iHttpUrlConnectionGetResponseCode == 204) {
                        try {
                            a(a(httpURLConnectionA), this.f32588m, this.f32592q);
                            IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnectionA);
                            return true;
                        } catch (JSONException e11) {
                            C4228r4.d().a(e11);
                            if (e11.getMessage() != null && e11.getMessage().equalsIgnoreCase("decryption error")) {
                                this.f32578c = 1003;
                                this.f32579d = T1.f30440f;
                            } else if (e11.getMessage() == null || !e11.getMessage().equalsIgnoreCase("decompression error")) {
                                this.f32578c = 1002;
                                this.f32579d = T1.f30439e;
                            } else {
                                this.f32578c = 1008;
                                this.f32579d = T1.f30441g;
                            }
                            this.f32582g = a(Integer.valueOf(this.f32578c));
                            IronLog.INTERNAL.error("Auction handle response exception " + e11.getMessage());
                            IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnectionA);
                            return false;
                        }
                    }
                    this.f32578c = 1001;
                    String str2 = "Auction response code not valid, error code response from server - " + iHttpUrlConnectionGetResponseCode;
                    this.f32579d = str2;
                    ironLog.error(str2);
                    IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnectionA);
                    if (this.f32581f < this.f32589n - 1) {
                        a(this.f32590o, time);
                    }
                    this.f32581f++;
                }
            } catch (Exception e12) {
                C4228r4.d().a(e12);
                this.f32578c = 1007;
                this.f32579d = e12.getMessage();
                this.f32581f = 0;
                this.f32582g = a(Integer.valueOf(this.f32578c));
                IronLog.INTERNAL.error("Auction request exception " + e12.getMessage());
                return false;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zB = b();
            S1 s12 = this.f32576a;
            if (s12 == null) {
                return;
            }
            a(zB, s12, new Date().getTime() - this.f32580e);
        }
    }

    @Deprecated
    public e(IronSource.a aVar, C4193p2 c4193p2, S1 s12) {
        this.f32572f = aVar;
        this.f32573g = c4193p2;
        this.f32574h = s12;
    }

    public e(f fVar) {
        this.f32571e = fVar;
    }

    private JSONObject a(Map<String, Object> map, List<String> list, h hVar, int i10, boolean z10, C4002ea c4002ea) throws JSONException {
        i iVar = new i(this.f32572f);
        iVar.a(map);
        iVar.a(list);
        iVar.a(hVar);
        iVar.a(i10);
        iVar.a(this.f32575i);
        iVar.a(c4002ea);
        iVar.b(z10);
        return d.b().a(iVar);
    }

    public void a(Context context, i iVar, S1 s12) {
        try {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f32571e.a(context, iVar, s12));
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error("execute auction exception " + e10.getMessage());
            if (s12 != null) {
                s12.a(1000, e10.getMessage(), 0, Y1.f30685a.a(this.f32571e.a(), 1000), 0L);
            }
        }
    }

    @Deprecated
    public void a(Context context, Map<String, Object> map, List<String> list, h hVar, int i10, C4002ea c4002ea) {
        try {
            boolean zG = IronSourceUtils.g();
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a(this.f32574h, new URL(this.f32573g.a(false)), a(map, list, hVar, i10, zG, c4002ea), zG, this.f32573g));
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error("execute auction exception " + e10.getMessage());
            this.f32574h.a(1000, e10.getMessage(), 0, Y1.f30685a.a(this.f32573g.n(), 1000), 0L);
        }
    }

    @Deprecated
    public void a(Context context, Map<String, Object> map, List<String> list, h hVar, int i10, C4002ea c4002ea, ISBannerSize iSBannerSize) {
        this.f32575i = iSBannerSize;
        a(context, map, list, hVar, i10, c4002ea);
    }

    public void a(C4157n2 c4157n2, int i10, C4157n2 c4157n22) {
        Iterator<String> it = c4157n2.h().iterator();
        while (it.hasNext()) {
            d.b().a("reportLoadSuccess", c4157n2.c(), d.b().a(it.next(), i10, c4157n2, "", "", ""));
        }
        if (c4157n22 != null) {
            Iterator<String> it2 = c4157n22.h().iterator();
            while (it2.hasNext()) {
                d.b().a("reportLoadSuccess", "GenericNotifications", d.b().a(it2.next(), i10, c4157n2, "", "102", ""));
            }
        }
    }

    public void a(C4157n2 c4157n2, int i10, C4157n2 c4157n22, String str) {
        Iterator<String> it = c4157n2.b().iterator();
        while (it.hasNext()) {
            d.b().a("reportImpression", c4157n2.c(), d.b().a(it.next(), i10, c4157n2, "", "", str));
        }
        if (c4157n22 != null) {
            Iterator<String> it2 = c4157n22.b().iterator();
            while (it2.hasNext()) {
                d.b().a("reportImpression", "GenericNotifications", d.b().a(it2.next(), i10, c4157n2, "", "102", str));
            }
        }
    }

    public void a(ArrayList<String> arrayList, ConcurrentHashMap<String, C4157n2> concurrentHashMap, int i10, C4157n2 c4157n2, C4157n2 c4157n22) {
        int iJ = c4157n22.j();
        for (String str : arrayList) {
            if (!str.equals(c4157n22.c())) {
                C4157n2 c4157n23 = concurrentHashMap.get(str);
                int iJ2 = c4157n23.j();
                String strI = c4157n23.i();
                String str2 = iJ2 < iJ ? "1" : "102";
                IronLog.INTERNAL.verbose("instance=" + c4157n23.c() + ", instancePriceOrder= " + iJ2 + ", loseReasonCode=" + str2 + ", winnerInstance=" + c4157n22.c() + ", winnerInstancePriceOrder=" + iJ);
                Iterator<String> it = c4157n23.g().iterator();
                while (it.hasNext()) {
                    d.b().a("reportAuctionLose", c4157n23.c(), d.b().a(it.next(), i10, c4157n22, strI, str2, ""));
                }
            }
        }
        if (c4157n2 != null) {
            Iterator<String> it2 = c4157n2.g().iterator();
            while (it2.hasNext()) {
                d.b().a("reportAuctionLose", "GenericNotifications", d.b().a(it2.next(), i10, c4157n22, "", "102", ""));
            }
        }
    }

    public void a(CopyOnWriteArrayList<A> copyOnWriteArrayList, ConcurrentHashMap<String, C4157n2> concurrentHashMap, int i10, C4157n2 c4157n2, C4157n2 c4157n22) {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<A> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().c());
        }
        a(arrayList, concurrentHashMap, i10, c4157n2, c4157n22);
    }

    public boolean a() {
        return this.f32571e.b();
    }
}
