package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class c8 implements q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Uri f7933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Uri f7934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f7935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f7936d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f7937e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f7938f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f7939g;

    public enum a {
        Progressive,
        Streaming
    }

    private c8() {
    }

    private static long a(p8 p8Var) {
        Map mapA = p8Var.a();
        long j10 = StringUtils.parseLong((String) mapA.get(VastAttributes.BITRATE), 0L);
        return j10 != 0 ? j10 : (StringUtils.parseLong((String) mapA.get(VastAttributes.MIN_BITRATE), 0L) + StringUtils.parseLong((String) mapA.get(VastAttributes.MAX_BITRATE), 0L)) / 2;
    }

    private static a a(String str) {
        if (StringUtils.isValidString(str)) {
            if ("progressive".equalsIgnoreCase(str)) {
                return a.Progressive;
            }
            if ("streaming".equalsIgnoreCase(str)) {
                return a.Streaming;
            }
        }
        return a.Progressive;
    }

    public static c8 a(p8 p8Var, com.applovin.impl.sdk.k kVar) {
        if (p8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        try {
            String strD = p8Var.d();
            if (!URLUtil.isValidUrl(strD)) {
                kVar.O();
                if (!com.applovin.impl.sdk.o.a()) {
                    return null;
                }
                kVar.O().b("VastVideoFile", "Unable to create video file. Could not find URL.");
                return null;
            }
            Uri uri = Uri.parse(strD);
            c8 c8Var = new c8();
            c8Var.f7933a = uri;
            c8Var.f7934b = uri;
            c8Var.f7939g = a(p8Var);
            c8Var.f7935c = a((String) p8Var.a().get("delivery"));
            c8Var.f7938f = StringUtils.parseInt((String) p8Var.a().get("height"));
            c8Var.f7937e = StringUtils.parseInt((String) p8Var.a().get("width"));
            c8Var.f7936d = ((String) p8Var.a().get("type")).toLowerCase(Locale.ENGLISH);
            return c8Var;
        } catch (Throwable th2) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("VastVideoFile", "Error occurred while initializing", th2);
            }
            kVar.D().a("VastVideoFile", th2);
            return null;
        }
    }

    public static c8 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject, "source_video_uri", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        Uri uri = Uri.parse(string);
        if (TextUtils.isEmpty(JsonUtils.getString(jSONObject, "video_uri", null))) {
            return null;
        }
        Uri uri2 = Uri.parse(string);
        String string2 = JsonUtils.getString(jSONObject, "file_type", null);
        if (TextUtils.isEmpty(string2)) {
            return null;
        }
        a aVarValueOf = a.valueOf(JsonUtils.getString(jSONObject, "delivery_type", a.Progressive.toString()));
        int i10 = JsonUtils.getInt(jSONObject, "width", 0);
        int i11 = JsonUtils.getInt(jSONObject, "height", 0);
        int i12 = JsonUtils.getInt(jSONObject, VastAttributes.BITRATE, 0);
        c8 c8Var = new c8();
        c8Var.f7933a = uri;
        c8Var.f7934b = uri2;
        c8Var.f7935c = aVarValueOf;
        c8Var.f7936d = string2;
        c8Var.f7937e = i10;
        c8Var.f7938f = i11;
        c8Var.f7939g = i12;
        return c8Var;
    }

    @Override // com.applovin.impl.q4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        Uri uri = this.f7933a;
        if (uri != null) {
            JsonUtils.putString(jSONObject, "source_video_uri", uri.toString());
        }
        Uri uri2 = this.f7934b;
        if (uri2 != null) {
            JsonUtils.putString(jSONObject, "video_uri", uri2.toString());
        }
        a aVar = this.f7935c;
        JsonUtils.putString(jSONObject, "delivery_type", aVar == null ? null : aVar.toString());
        JsonUtils.putString(jSONObject, "file_type", this.f7936d);
        JsonUtils.putInt(jSONObject, "width", this.f7937e);
        JsonUtils.putInt(jSONObject, "height", this.f7938f);
        JsonUtils.putLong(jSONObject, VastAttributes.BITRATE, this.f7939g);
        return jSONObject;
    }

    public void a(Uri uri) {
        this.f7934b = uri;
    }

    public long b() {
        return this.f7939g;
    }

    public String c() {
        return this.f7936d;
    }

    public Uri d() {
        return this.f7933a;
    }

    public Uri e() {
        return this.f7934b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8)) {
            return false;
        }
        c8 c8Var = (c8) obj;
        if (this.f7937e != c8Var.f7937e || this.f7938f != c8Var.f7938f || this.f7939g != c8Var.f7939g) {
            return false;
        }
        Uri uri = this.f7933a;
        if (uri == null ? c8Var.f7933a != null : !uri.equals(c8Var.f7933a)) {
            return false;
        }
        Uri uri2 = this.f7934b;
        if (uri2 == null ? c8Var.f7934b != null : !uri2.equals(c8Var.f7934b)) {
            return false;
        }
        if (this.f7935c != c8Var.f7935c) {
            return false;
        }
        String str = this.f7936d;
        String str2 = c8Var.f7936d;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        Uri uri = this.f7933a;
        int iHashCode = (uri != null ? uri.hashCode() : 0) * 31;
        Uri uri2 = this.f7934b;
        int iHashCode2 = (iHashCode + (uri2 != null ? uri2.hashCode() : 0)) * 31;
        a aVar = this.f7935c;
        int iHashCode3 = (iHashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str = this.f7936d;
        return ((((((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + this.f7937e) * 31) + this.f7938f) * 31) + Long.valueOf(this.f7939g).hashCode();
    }

    public String toString() {
        return "VastVideoFile{sourceVideoUri=" + this.f7933a + ", videoUri=" + this.f7934b + ", deliveryType=" + this.f7935c + ", fileType='" + this.f7936d + "', width=" + this.f7937e + ", height=" + this.f7938f + ", bitrate=" + this.f7939g + '}';
    }
}
