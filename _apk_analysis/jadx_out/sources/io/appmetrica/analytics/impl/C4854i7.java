package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import android.net.ConnectivityManager;
import io.appmetrica.analytics.coreapi.internal.system.NetworkType;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.i7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4854i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f66960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f66961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yo f66962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final A8 f66963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C4847i0 f66964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final K8 f66965f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C4931l7 f66966g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Q5 f66967h;

    public C4854i7(Context context, Uk uk2, int i10, yo yoVar, A8 a82, C4847i0 c4847i0, K8 k82, C4931l7 c4931l7) {
        this.f66960a = context;
        this.f66961b = i10;
        this.f66962c = yoVar;
        this.f66963d = a82;
        this.f66964e = c4847i0;
        this.f66965f = k82;
        this.f66966g = c4931l7;
        this.f66967h = a82.f64967a;
    }

    public /* synthetic */ C4854i7(Context context, Uk uk2, int i10, yo yoVar, A8 a82, C4941lh c4941lh, C4847i0 c4847i0) {
        this(context, uk2, i10, yoVar, a82, c4847i0, new K8(), new C4931l7(c4941lh));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String b() {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        C5047pn c5047pnC = C5009oa.I.C();
        C4828h7 c4828h7 = new C4828h7(ref$ObjectRef);
        synchronized (c5047pnC) {
            c5047pnC.f67543b.a(c4828h7);
        }
        return (String) ref$ObjectRef.element;
    }

    public final C4750e7 a() {
        long jOptLong;
        Jo jo2;
        Integer numValueOf = Integer.valueOf(this.f66967h.f65792e);
        String name = this.f66967h.getName();
        String value = this.f66967h.getValue();
        yo yoVar = this.f66962c;
        int i10 = this.f66961b;
        synchronized (yoVar) {
            JSONObject jSONObjectA = yoVar.f68052a.a();
            JSONObject jSONObjectOptJSONObject = jSONObjectA.optJSONObject("numbers_of_type");
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            jOptLong = jSONObjectOptJSONObject.optLong(String.valueOf(i10));
            jSONObjectOptJSONObject.put(String.valueOf(i10), 1 + jOptLong);
            yoVar.f68052a.a(jSONObjectA.put("numbers_of_type", jSONObjectOptJSONObject));
        }
        Long lValueOf = Long.valueOf(jOptLong);
        C4931l7 c4931l7 = this.f66966g;
        c4931l7.getClass();
        Lb lbM = C5009oa.I.m();
        Location userLocation = lbM.getUserLocation();
        if (userLocation != null) {
            int i11 = Jo.f65454b;
            Location location = new Location(userLocation);
            String provider = location.getProvider();
            location.setProvider("");
            jo2 = new Jo(location, provider);
        } else {
            Location systemLocation = lbM.getSystemLocation();
            jo2 = systemLocation != null ? new Jo(new Location(systemLocation), "") : null;
        }
        boolean z10 = c4931l7.f67191a.f67215d;
        Double dValueOf = jo2 != null ? Double.valueOf(jo2.getLatitude()) : null;
        Double dValueOf2 = jo2 != null ? Double.valueOf(jo2.getLongitude()) : null;
        Long lValueOf2 = jo2 != null ? Long.valueOf(jo2.getTime()) : null;
        Integer numValueOf2 = jo2 != null ? Integer.valueOf((int) jo2.getAccuracy()) : null;
        Integer numValueOf3 = jo2 != null ? Integer.valueOf((int) jo2.getBearing()) : null;
        Integer numValueOf4 = jo2 != null ? Integer.valueOf((int) jo2.getSpeed()) : null;
        C4879j7 c4879j7 = new C4879j7(Boolean.valueOf(z10), dValueOf2, dValueOf, jo2 != null ? Integer.valueOf((int) jo2.getAltitude()) : null, numValueOf3, numValueOf2, numValueOf4, lValueOf2, jo2 != null ? jo2.getProvider() : null, jo2 != null ? jo2.f65455a : null);
        String str = this.f66967h.f65790c;
        C4847i0 c4847i0 = this.f66964e;
        String str2 = c4847i0.f66948a;
        Long lValueOf3 = Long.valueOf(c4847i0.f66949b);
        Integer numValueOf5 = Integer.valueOf(this.f66967h.f65794g);
        Context context = this.f66960a;
        De de2 = He.f65316a;
        Integer numValueOf6 = Integer.valueOf(((Integer) He.f65318c.a((NetworkType) SystemServiceUtils.accessSystemServiceSafelyOrDefault((ConnectivityManager) context.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", NetworkType.UNDEFINED, new Ge()))).intValue());
        String strB = b();
        J8 j82 = this.f66963d.f64968b;
        Q5 q52 = this.f66967h;
        return new C4750e7(numValueOf, name, value, lValueOf, c4879j7, str, str2, lValueOf3, numValueOf5, numValueOf6, strB, j82, q52.f65795h, q52.f65798k, q52.f65799l, q52.f65801n, q52.f65802o, this.f66965f.fromModel(q52.f65803p));
    }
}
