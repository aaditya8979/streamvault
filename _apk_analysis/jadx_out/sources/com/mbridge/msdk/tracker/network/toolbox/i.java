package com.mbridge.msdk.tracker.network.toolbox;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import java.io.File;
import java.io.FileInputStream;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: compiled from: LocalDNSManager.java */
/* JADX INFO: loaded from: classes8.dex */
public class i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f41068f = "i";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile i f41069g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, InetAddress> f41070a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f41071b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f41073d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f41074e = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.mbridge.msdk.foundation.buffer.sharedperference.a f41072c = com.mbridge.msdk.foundation.buffer.sharedperference.a.b();

    /* JADX INFO: compiled from: LocalDNSManager.java */
    public static class a implements OnDownloadStateListener<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f41075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f41076b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f41077c;

        public a(String str, String str2, String str3) {
            this.f41075a = str;
            this.f41076b = str2;
            this.f41077c = str3;
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onCancelDownload(DownloadMessage<Object> downloadMessage) {
            i.b().c();
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadComplete(DownloadMessage<Object> downloadMessage) {
            i.b().b(this.f41075a, this.f41076b, this.f41077c);
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadError(DownloadMessage<Object> downloadMessage, DownloadError downloadError) {
            i.b().c();
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadStart(DownloadMessage<Object> downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onResponseStart(DownloadMessage<Object> downloadMessage) {
        }
    }

    private i() {
    }

    private void a() {
        String strA = this.f41072c.a("cache");
        String strA2 = this.f41072c.a("url");
        String strB = s0.a().b("local_dns_config_url", "", false);
        if (TextUtils.isEmpty(strB)) {
            this.f41072c.a("cache", "");
        } else if (TextUtils.isEmpty(strA) || TextUtils.isEmpty(strA2) || !TextUtils.equals(strB, strA2)) {
            a(strB);
        } else {
            d(strA);
        }
    }

    private void a(String str) {
        a(str, com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_OTHER) + File.separator, b(str));
    }

    private void a(String str, String str2, String str3) {
        MBDownloadManager.getInstance().download(new DownloadMessage<>(new Object(), str, str3, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_OTHER)).withConnectTimeout(30000L).withReadTimeout(30000L).withWriteTimeout(30000L).withTimeout(30000L).withHttpRetryCounter(5).withDirectoryPathInternal(str2).withDownloadPriority(DownloadPriority.HIGH).withDownloadStateListener(new a(str, str2, str3)).build().start();
    }

    public static i b() {
        if (f41069g == null) {
            synchronized (i.class) {
                if (f41069g == null) {
                    f41069g = new i();
                }
            }
        }
        return f41069g;
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String path = new URL(str).getPath();
            return path.substring(path.lastIndexOf(47) + 1);
        } catch (Exception unused) {
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, String str2, String str3) {
        try {
            String strA = com.mbridge.msdk.foundation.same.c.a(new FileInputStream(new File(str2, str3)));
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            this.f41072c.a("cache", strA);
            this.f41072c.a("url", str);
            d(strA);
        } catch (Exception e10) {
            q0.b(f41068f, "downloadLocalDNSConfig: onDownloadComplete: file not found", e10);
            this.f41073d = "find local dns config file error";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f41071b.set(false);
        this.f41073d = "download local dns config error";
    }

    private void d(String str) {
        try {
            this.f41074e = e(com.mbridge.msdk.foundation.same.net.utils.d.h().f37855y);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(k0.a(str));
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!TextUtils.isEmpty(next) && next.contains(this.f41074e)) {
                    String string = jSONObject.getString(next);
                    if (!TextUtils.isEmpty(string)) {
                        try {
                            this.f41070a.put(next, InetAddress.getByAddress(next, com.mbridge.msdk.foundation.same.c.b(string)));
                        } catch (UnknownHostException e10) {
                            this.f41073d = String.format("create InetAddress failed for %s with ip %s", next, string);
                            q0.b(f41068f, "init: local dns cache error", e10);
                        }
                    }
                }
            }
            this.f41071b.set(true);
        } catch (Exception e11) {
            q0.b(f41068f, "init: local dns cache json parse error", e11);
            this.f41073d = "parse local dns config error";
            this.f41070a.clear();
            this.f41071b.set(false);
        }
    }

    private static String e(String str) {
        return str.replace("https://{}", "").replace("http://{}", "");
    }

    public List<InetAddress> a(@NonNull String str, UnknownHostException unknownHostException) throws UnknownHostException {
        InetAddress inetAddress;
        try {
            inetAddress = this.f41070a.get(str);
        } catch (Exception e10) {
            q0.b(f41068f, "lookup: local dns cache error", e10);
            inetAddress = null;
        }
        if (inetAddress == null) {
            throw unknownHostException;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(inetAddress);
        return arrayList;
    }

    public boolean c(String str) {
        return TextUtils.equals(str, com.mbridge.msdk.foundation.same.net.utils.d.h().f37833e.replace("https://", ""));
    }

    public boolean c(String str, String str2, String str3) {
        return e() && d() && TextUtils.equals(str, MBInterstitialActivity.INTENT_CAMAPIGN) && !c(str3) && (TextUtils.equals(str2, String.valueOf(94)) || TextUtils.equals(str2, String.valueOf(MBSupportMuteAdType.INTERSTITIAL_VIDEO)));
    }

    public boolean d() {
        return this.f41071b.get() && !this.f41070a.isEmpty();
    }

    public boolean e() {
        return s0.a().b("local_dns", false, false);
    }

    public void f(String str) {
        if (TextUtils.isEmpty(str) || !e()) {
            return;
        }
        this.f41071b.set(false);
        this.f41070a.clear();
        a();
    }
}
