package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.iab.omid.library.ironsrc.Omid;
import com.iab.omid.library.ironsrc.adsession.AdEvents;
import com.iab.omid.library.ironsrc.adsession.AdSession;
import com.iab.omid.library.ironsrc.adsession.AdSessionConfiguration;
import com.iab.omid.library.ironsrc.adsession.AdSessionContext;
import com.iab.omid.library.ironsrc.adsession.CreativeType;
import com.iab.omid.library.ironsrc.adsession.ImpressionType;
import com.iab.omid.library.ironsrc.adsession.Owner;
import com.iab.omid.library.ironsrc.adsession.Partner;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class Gc {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f29436d = "Ironsrc";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f29437e = "7";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f29438f = Omid.getVersion();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f29439g = "omidVersion";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f29440h = "omidPartnerName";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f29441i = "omidPartnerVersion";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f29442j = "omidActiveAdSessions";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f29443k = "Invalid OMID impressionOwner";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f29444l = "Invalid OMID videoEventsOwner";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f29445m = "Missing OMID impressionOwner";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f29446n = "Missing OMID videoEventsOwner";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f29447o = "OMID has not been activated";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f29448p = "Missing OMID creativeType";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f29449q = "Missing adview id in OMID params";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f29450r = "No adview found with the provided adViewId";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f29451s = "OMID Session has already started";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f29452t = "OMID Session has not started";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Partner f29453a = Partner.createPartner(f29436d, f29437e);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f29455c = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<String, AdSession> f29454b = new HashMap<>();

    public static class a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f29456i = "isolateVerificationScripts";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f29457j = "impressionOwner";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f29458k = "videoEventsOwner";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f29459l = "customReferenceData";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f29460m = "creativeType";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f29461n = "impressionType";

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final String f29462o = "adViewId";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f29463a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Owner f29464b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Owner f29465c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f29466d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ImpressionType f29467e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public CreativeType f29468f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f29469g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Owner f29470h;

        public static a a(JSONObject jSONObject) throws IllegalArgumentException {
            a aVar = new a();
            aVar.f29463a = jSONObject.optBoolean("isolateVerificationScripts", false);
            String strOptString = jSONObject.optString("impressionOwner", "");
            if (TextUtils.isEmpty(strOptString)) {
                throw new IllegalArgumentException(Gc.f29445m);
            }
            try {
                aVar.f29464b = Owner.valueOf(strOptString.toUpperCase(Locale.getDefault()));
                String strOptString2 = jSONObject.optString("videoEventsOwner", "");
                if (TextUtils.isEmpty(strOptString)) {
                    throw new IllegalArgumentException(Gc.f29446n);
                }
                try {
                    aVar.f29465c = Owner.valueOf(strOptString2.toUpperCase(Locale.getDefault()));
                    aVar.f29466d = jSONObject.optString("customReferenceData", "");
                    aVar.f29468f = b(jSONObject);
                    aVar.f29467e = c(jSONObject);
                    aVar.f29469g = e(jSONObject);
                    aVar.f29470h = d(jSONObject);
                    return aVar;
                } catch (IllegalArgumentException e10) {
                    C4228r4.d().a(e10);
                    throw new IllegalArgumentException("Invalid OMID videoEventsOwner " + strOptString2);
                }
            } catch (IllegalArgumentException e11) {
                C4228r4.d().a(e11);
                throw new IllegalArgumentException("Invalid OMID impressionOwner " + strOptString);
            }
        }

        private static CreativeType b(JSONObject jSONObject) throws IllegalArgumentException {
            String strOptString = jSONObject.optString("creativeType", "");
            if (TextUtils.isEmpty(strOptString)) {
                throw new IllegalArgumentException(Gc.f29448p + strOptString);
            }
            for (CreativeType creativeType : CreativeType.values()) {
                if (strOptString.equalsIgnoreCase(creativeType.toString())) {
                    return creativeType;
                }
            }
            throw new IllegalArgumentException(Gc.f29448p + strOptString);
        }

        private static ImpressionType c(JSONObject jSONObject) throws IllegalArgumentException {
            String strOptString = jSONObject.optString("impressionType", "");
            if (TextUtils.isEmpty(strOptString)) {
                throw new IllegalArgumentException(Gc.f29448p + strOptString);
            }
            for (ImpressionType impressionType : ImpressionType.values()) {
                if (strOptString.equalsIgnoreCase(impressionType.toString())) {
                    return impressionType;
                }
            }
            throw new IllegalArgumentException(Gc.f29448p + strOptString);
        }

        private static Owner d(JSONObject jSONObject) throws IllegalArgumentException {
            String strOptString = jSONObject.optString("videoEventsOwner", "");
            Owner owner = Owner.NONE;
            try {
                return Owner.valueOf(strOptString.toUpperCase(Locale.getDefault()));
            } catch (IllegalArgumentException e10) {
                C4228r4.d().a(e10);
                return owner;
            }
        }

        private static String e(JSONObject jSONObject) throws IllegalArgumentException {
            String strOptString = jSONObject.optString("adViewId", "");
            if (!TextUtils.isEmpty(strOptString)) {
                return strOptString;
            }
            throw new IllegalArgumentException(Gc.f29449q + strOptString);
        }
    }

    private AdSession a(a aVar, K8 k82) throws IllegalArgumentException {
        AdSession adSessionCreateAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(aVar.f29468f, aVar.f29467e, aVar.f29464b, aVar.f29465c, aVar.f29463a), AdSessionContext.createHtmlAdSessionContext(this.f29453a, k82.getPresentingView(), null, aVar.f29466d));
        adSessionCreateAdSession.registerAdView(k82.getPresentingView());
        return adSessionCreateAdSession;
    }

    private void a(JSONObject jSONObject) throws IllegalStateException {
        if (!this.f29455c) {
            throw new IllegalStateException(f29447o);
        }
        if (jSONObject == null) {
            throw new IllegalStateException(f29452t);
        }
    }

    public C4042ge a() {
        C4042ge c4042ge = new C4042ge();
        c4042ge.b(f29439g, SDKUtils.encodeString(f29438f));
        c4042ge.b(f29440h, SDKUtils.encodeString(f29436d));
        c4042ge.b(f29441i, SDKUtils.encodeString(f29437e));
        c4042ge.b(f29442j, SDKUtils.encodeString(Arrays.toString(this.f29454b.keySet().toArray())));
        return c4042ge;
    }

    public void a(Context context) throws IllegalArgumentException {
        if (this.f29455c) {
            return;
        }
        Omid.activate(context);
        this.f29455c = true;
    }

    public void a(a aVar) throws IllegalStateException, IllegalArgumentException {
        if (!this.f29455c) {
            throw new IllegalStateException(f29447o);
        }
        if (TextUtils.isEmpty(aVar.f29469g)) {
            throw new IllegalStateException(f29449q);
        }
        String str = aVar.f29469g;
        if (this.f29454b.containsKey(str)) {
            throw new IllegalStateException(f29451s);
        }
        K8 k8A = C4216q8.a().a(str);
        if (k8A == null) {
            throw new IllegalStateException(f29450r);
        }
        AdSession adSessionA = a(aVar, k8A);
        adSessionA.start();
        this.f29454b.put(str, adSessionA);
    }

    public void b(JSONObject jSONObject) throws IllegalStateException {
        a(jSONObject);
        String strOptString = jSONObject.optString("adViewId");
        AdSession adSession = this.f29454b.get(strOptString);
        if (adSession == null) {
            throw new IllegalStateException(f29452t);
        }
        adSession.finish();
        this.f29454b.remove(strOptString);
    }

    public void c(JSONObject jSONObject) throws IllegalStateException, IllegalArgumentException {
        a(jSONObject);
        AdSession adSession = this.f29454b.get(jSONObject.optString("adViewId"));
        if (adSession == null) {
            throw new IllegalStateException(f29452t);
        }
        AdEvents adEventsCreateAdEvents = AdEvents.createAdEvents(adSession);
        if (jSONObject.optBoolean("signalLoaded")) {
            adEventsCreateAdEvents.loaded();
        }
        adEventsCreateAdEvents.impressionOccurred();
    }

    public void d(JSONObject jSONObject) throws IllegalStateException, IllegalArgumentException {
        a(a.a(jSONObject));
    }
}
