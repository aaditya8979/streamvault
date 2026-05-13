package sg.bigo.ads.core.h;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C3978d4;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.api.a.i;

/* JADX INFO: loaded from: classes7.dex */
public class b extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f84021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private sg.bigo.ads.core.h.c f84022b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f84023g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C1048b f84024h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c f84025i;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final b f84026a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        private final C1048b f84027b;

        public a(@NonNull b bVar, @NonNull C1048b c1048b) {
            this.f84026a = bVar;
            this.f84027b = c1048b;
        }

        @JavascriptInterface
        public final void onCustomJSEventCallback(String str, String str2) {
            sg.bigo.ads.common.t.a.a(0, 3, "UniversalWebView", "onCustomJSEventCallback, eventType: " + str + ", eventJson: " + str2);
            sg.bigo.ads.core.h.c customWebChromeClient = this.f84026a.getCustomWebChromeClient();
            if (customWebChromeClient != null) {
                customWebChromeClient.a(this.f84026a, str, str2);
            }
        }

        @JavascriptInterface
        public final void webCollect(String str) {
            String string;
            C1048b c1048b = this.f84027b;
            if (c1048b.f84028a == null) {
                c1048b.f84028a = new ArrayList();
            }
            if (!str.contains("notify") || str.startsWith(C3978d4.j.f31383d)) {
                string = str;
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    jSONObject.put(BidResponsed.KEY_CUR, SystemClock.elapsedRealtime());
                    string = jSONObject.toString();
                } catch (Exception unused) {
                    string = str;
                }
            }
            c1048b.f84028a.add(string);
            sg.bigo.ads.common.t.a.a(0, 3, "UniversalWebView", "webCollect: ".concat(str));
        }

        @JavascriptInterface
        public final void webStat(String str, String str2) {
            sg.bigo.ads.common.t.a.a(0, 3, "UniversalWebView", "statUniversalInfo, eventId: " + str + ", msgJson: " + str2);
        }
    }

    /* JADX INFO: renamed from: sg.bigo.ads.core.h.b$b, reason: collision with other inner class name */
    public static class C1048b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<String> f84028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<String> f84029b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public Boolean f84030c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public Boolean f84031d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f84032e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f84033f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f84034g = -1;

        public final boolean a(String str) {
            List<String> list = this.f84029b;
            if (str != null && list != null) {
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next())) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Boolean f84036b;

        private c() {
        }

        public /* synthetic */ c(b bVar, byte b10) {
            this();
        }

        private static boolean a(int[] iArr) {
            if (iArr.length <= 0) {
                return false;
            }
            int length = iArr.length;
            int i10 = length - 1;
            int i11 = 0;
            while (true) {
                int i12 = length / 2;
                if (i11 >= i12 || i10 < i12) {
                    return true;
                }
                if (iArr[i11] != iArr[i10]) {
                    return false;
                }
                i11++;
                i10--;
            }
        }

        public final Boolean a() {
            sg.bigo.ads.common.t.a.a(0, 3, "UniversalWebView", "Try to check not blank by bit");
            if (this.f84036b != null) {
                sg.bigo.ads.common.t.a.a(0, 3, "UniversalWebView", "Has result for checking not blank by bit");
                return this.f84036b;
            }
            b bVar = b.this;
            if (bVar.f84038j) {
                sg.bigo.ads.common.t.a.a(0, 3, "UniversalWebView", "WebView is destroyed stop checking not blank by bit");
                return null;
            }
            int width = bVar.getWidth();
            int height = b.this.getHeight();
            if (width > 0 && height > 0) {
                try {
                    int[] iArr = new int[width * height];
                    Bitmap bitmapA = sg.bigo.ads.common.utils.d.a(width, height, Bitmap.Config.RGB_565);
                    if (bitmapA == null) {
                        return null;
                    }
                    b.this.draw(new Canvas(bitmapA));
                    bitmapA.getPixels(iArr, 0, width, 0, 0, width, height);
                    bitmapA.recycle();
                    this.f84036b = Boolean.valueOf(!a(iArr));
                    sg.bigo.ads.common.t.a.a(0, 3, "UniversalWebView", "The result of current banner checking not blank by bit: " + this.f84036b);
                    return this.f84036b;
                } catch (Exception unused) {
                }
            }
            return null;
        }
    }

    public b(Context context) {
        super(context);
        this.f84023g = false;
        C1048b c1048b = new C1048b();
        this.f84024h = c1048b;
        a aVar = new a(this, c1048b);
        this.f84021a = aVar;
        addJavascriptInterface(aVar, "bigossp");
    }

    public static void a(@NonNull C1048b c1048b) {
        List<String> list;
        JSONObject jSONObjectOptJSONObject;
        if (!i.f81802a.n().a(0) || (list = c1048b.f84028a) == null || list.isEmpty()) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str : list) {
            if (str.startsWith(C3978d4.j.f31383d)) {
                sb2.append(str.substring(1, str.length() - 1));
                sb2.append(StringUtils.COMMA);
            }
            sb2.append(str);
            sb2.append(StringUtils.COMMA);
        }
        try {
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray(C3978d4.j.f31383d + sb2.substring(0, sb2.length() - 1) + C3978d4.j.f31385e);
            int length = jSONArray2.length();
            JSONObject jSONObject = null;
            JSONObject jSONObject2 = null;
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArray2.optJSONObject(i10);
                if (jSONObjectOptJSONObject2 != null) {
                    String strOptString = jSONObjectOptJSONObject2.optString("type");
                    if ("render_start".equals(strOptString)) {
                        jSONObject = jSONObjectOptJSONObject2;
                    }
                    if ("render".equals(strOptString) && jSONObject2 == null) {
                        jSONObject2 = jSONObjectOptJSONObject2;
                    }
                    if (!"mayError".equals(strOptString) || ((jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("params")) != null && c1048b.a(jSONObjectOptJSONObject.optString("url")))) {
                        jSONArray.put(jSONObjectOptJSONObject2);
                    }
                }
            }
            if (jSONArray.length() > 0) {
                sg.bigo.ads.core.d.b.a(3002, 10113, jSONArray.toString());
            }
            if (jSONObject != null) {
                if (jSONObject2 != null) {
                    c1048b.f84030c = Boolean.TRUE;
                    c1048b.f84032e = jSONObject2.optLong(BidResponsed.KEY_CUR);
                } else {
                    c1048b.f84030c = Boolean.FALSE;
                    c1048b.f84032e = SystemClock.elapsedRealtime();
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void a(int i10, WebResourceRequest webResourceRequest, int i11, CharSequence charSequence) {
        if (webResourceRequest != null) {
            sg.bigo.ads.common.t.a.a(0, 3, "UniversalWebView", "dispatchResourceError, type: " + i10 + ", url: " + webResourceRequest.getUrl() + ", errorCode: " + i11 + ", desc: " + ((Object) charSequence));
            C1048b c1048b = this.f84024h;
            String strValueOf = String.valueOf(webResourceRequest.getUrl());
            if (c1048b.f84029b == null) {
                c1048b.f84029b = new ArrayList();
            }
            c1048b.f84029b.add(strValueOf);
        }
    }

    @Nullable
    public sg.bigo.ads.core.h.c getCustomWebChromeClient() {
        return this.f84022b;
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(@Nullable WebChromeClient webChromeClient) {
        this.f84022b = webChromeClient instanceof sg.bigo.ads.core.h.c ? (sg.bigo.ads.core.h.c) webChromeClient : null;
        super.setWebChromeClient(webChromeClient);
    }
}
