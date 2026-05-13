package com.inmobi.media;

import android.content.Context;
import android.location.Location;
import com.inmobi.media.Tg;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Tg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f26360a = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f26361b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f26362c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f26363d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f26364e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f26365f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static String f26366g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static String f26367h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f26368i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static String f26369j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static String f26370k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static String f26371l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static String f26372m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static Location f26373n;

    public static String a(Location location) {
        return location.getLatitude() + StringUtils.COMMA + location.getLongitude() + StringUtils.COMMA + ((int) location.getAccuracy()) + StringUtils.COMMA + location.getTime();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.lang.String r8, java.lang.String r9, java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Tg.a(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    public static HashMap a() {
        HashMap map = new HashMap();
        int i10 = f26360a;
        int i11 = Integer.MIN_VALUE;
        if (i10 == Integer.MIN_VALUE) {
            Context context = Ji.f25747a;
            if (context == null) {
                i10 = Integer.MIN_VALUE;
            } else {
                ConcurrentHashMap concurrentHashMap = Ea.f25372b;
                Ea eaA = Da.a(context, "user_info_store");
                tn.p.k("user_age", "key");
                i10 = eaA.f25373a.getInt("user_age", Integer.MIN_VALUE);
            }
            f26360a = i10;
        }
        if (i10 > 0) {
            map.put("u-age", String.valueOf(i10));
        }
        int i12 = f26368i;
        if (i12 == Integer.MIN_VALUE) {
            Context context2 = Ji.f25747a;
            if (context2 != null) {
                ConcurrentHashMap concurrentHashMap2 = Ea.f25372b;
                Ea eaA2 = Da.a(context2, "user_info_store");
                tn.p.k("user_yob", "key");
                i11 = eaA2.f25373a.getInt("user_yob", Integer.MIN_VALUE);
            }
            f26368i = i11;
            i12 = i11;
        }
        if (i12 > 0) {
            map.put("u-yearofbirth", String.valueOf(i12));
        }
        String string = f26365f;
        String string2 = null;
        if (string == null) {
            Context context3 = Ji.f25747a;
            if (context3 == null) {
                string = null;
            } else {
                ConcurrentHashMap concurrentHashMap3 = Ea.f25372b;
                Ea eaA3 = Da.a(context3, "user_info_store");
                tn.p.k("user_city_code", "key");
                string = eaA3.f25373a.getString("user_city_code", null);
            }
            f26365f = string;
        }
        String string3 = f26366g;
        if (string3 == null) {
            Context context4 = Ji.f25747a;
            if (context4 == null) {
                string3 = null;
            } else {
                ConcurrentHashMap concurrentHashMap4 = Ea.f25372b;
                Ea eaA4 = Da.a(context4, "user_info_store");
                tn.p.k("user_state_code", "key");
                string3 = eaA4.f25373a.getString("user_state_code", null);
            }
            f26366g = string3;
        }
        String string4 = f26367h;
        if (string4 == null) {
            Context context5 = Ji.f25747a;
            if (context5 == null) {
                string4 = null;
            } else {
                ConcurrentHashMap concurrentHashMap5 = Ea.f25372b;
                Ea eaA5 = Da.a(context5, "user_info_store");
                tn.p.k("user_country_code", "key");
                string4 = eaA5.f25373a.getString("user_country_code", null);
            }
            f26367h = string4;
        }
        String strA = a(string, string3, string4);
        int length = strA.length() - 1;
        boolean zBooleanValue = false;
        int i13 = 0;
        boolean z10 = false;
        while (i13 <= length) {
            boolean z11 = tn.p.m(strA.charAt(!z10 ? i13 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                }
                length--;
            } else if (z11) {
                i13++;
            } else {
                z10 = true;
            }
        }
        if (strA.subSequence(i13, length + 1).toString().length() > 0) {
            map.put("u-location", strA);
        }
        String string5 = f26362c;
        if (string5 == null) {
            Context context6 = Ji.f25747a;
            if (context6 == null) {
                string5 = null;
            } else {
                ConcurrentHashMap concurrentHashMap6 = Ea.f25372b;
                Ea eaA6 = Da.a(context6, "user_info_store");
                tn.p.k("user_age_group", "key");
                string5 = eaA6.f25373a.getString("user_age_group", null);
            }
            f26362c = string5;
        }
        if (string5 != null) {
            Locale locale = Locale.ENGLISH;
            tn.p.j(locale, "ENGLISH");
            String lowerCase = string5.toLowerCase(locale);
            tn.p.j(lowerCase, "toLowerCase(...)");
            map.put("u-agegroup", lowerCase);
        }
        String string6 = f26363d;
        if (string6 == null) {
            Context context7 = Ji.f25747a;
            if (context7 == null) {
                string6 = null;
            } else {
                ConcurrentHashMap concurrentHashMap7 = Ea.f25372b;
                Ea eaA7 = Da.a(context7, "user_info_store");
                tn.p.k("user_area_code", "key");
                string6 = eaA7.f25373a.getString("user_area_code", null);
            }
            f26363d = string6;
        }
        if (string6 != null) {
            map.put("u-areacode", string6);
        }
        String string7 = f26364e;
        if (string7 == null) {
            Context context8 = Ji.f25747a;
            if (context8 == null) {
                string7 = null;
            } else {
                ConcurrentHashMap concurrentHashMap8 = Ea.f25372b;
                Ea eaA8 = Da.a(context8, "user_info_store");
                tn.p.k("user_post_code", "key");
                string7 = eaA8.f25373a.getString("user_post_code", null);
            }
            f26364e = string7;
        }
        if (string7 != null) {
            map.put("u-postalcode", string7);
        }
        String string8 = f26369j;
        if (string8 == null) {
            Context context9 = Ji.f25747a;
            if (context9 == null) {
                string8 = null;
            } else {
                ConcurrentHashMap concurrentHashMap9 = Ea.f25372b;
                Ea eaA9 = Da.a(context9, "user_info_store");
                tn.p.k("user_gender", "key");
                string8 = eaA9.f25373a.getString("user_gender", null);
            }
            f26369j = string8;
        }
        if (string8 != null) {
            map.put("u-gender", string8);
        }
        String string9 = f26370k;
        if (string9 == null) {
            Context context10 = Ji.f25747a;
            if (context10 == null) {
                string9 = null;
            } else {
                ConcurrentHashMap concurrentHashMap10 = Ea.f25372b;
                Ea eaA10 = Da.a(context10, "user_info_store");
                tn.p.k("user_education", "key");
                string9 = eaA10.f25373a.getString("user_education", null);
            }
            f26370k = string9;
        }
        if (string9 != null) {
            map.put("u-education", string9);
        }
        String string10 = f26371l;
        if (string10 == null) {
            Context context11 = Ji.f25747a;
            if (context11 == null) {
                string10 = null;
            } else {
                ConcurrentHashMap concurrentHashMap11 = Ea.f25372b;
                Ea eaA11 = Da.a(context11, "user_info_store");
                tn.p.k("user_language", "key");
                string10 = eaA11.f25373a.getString("user_language", null);
            }
            f26371l = string10;
        }
        if (string10 != null) {
            map.put("u-language", string10);
        }
        String str = f26372m;
        if (str == null) {
            Context context12 = Ji.f25747a;
            if (context12 != null) {
                ConcurrentHashMap concurrentHashMap12 = Ea.f25372b;
                Ea eaA12 = Da.a(context12, "user_info_store");
                tn.p.k("user_interest", "key");
                string2 = eaA12.f25373a.getString("user_interest", null);
            }
            f26372m = string2;
            str = string2;
        }
        if (str != null) {
            map.put("u-interests", str);
        }
        Boolean bool = f26361b;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            Context context13 = Ji.f25747a;
            if (context13 != null) {
                ConcurrentHashMap concurrentHashMap13 = Ea.f25372b;
                Ea eaA13 = Da.a(context13, "user_info_store");
                tn.p.k("user_age_restricted", "key");
                f26361b = Boolean.valueOf(eaA13.f25373a.getBoolean("user_age_restricted", false));
            }
            Boolean bool2 = f26361b;
            if (bool2 != null) {
                zBooleanValue = bool2.booleanValue();
            }
        }
        map.put("u-age-restricted", zBooleanValue ? "1" : "0");
        return map;
    }

    public static final void a(Context context, boolean z10) {
        ConcurrentHashMap concurrentHashMap = Ea.f25372b;
        Ea.a(Da.a(context, "user_info_store"), "user_age_restricted", z10);
    }

    public static void a(final boolean z10) {
        f26361b = Boolean.valueOf(z10);
        final Context context = Ji.f25747a;
        if (context != null) {
            Runnable runnable = new Runnable() { // from class: n9.i4
                @Override // java.lang.Runnable
                public final void run() {
                    Tg.a(context, z10);
                }
            };
            tn.p.k(runnable, "runnable");
            Ji.f25753g.submit(runnable);
        }
    }

    public static Location b() {
        Location location = f26373n;
        if (location != null) {
            return location;
        }
        Context context = Ji.f25747a;
        Location location2 = null;
        if (context == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = Ea.f25372b;
        Ea eaA = Da.a(context, "user_info_store");
        tn.p.k("user_location", "key");
        String string = eaA.f25373a.getString("user_location", null);
        if (string == null) {
            return null;
        }
        Location location3 = new Location("");
        try {
            String[] strArr = (String[]) new Regex(StringUtils.COMMA).split(string, 0).toArray(new String[0]);
            location3.setLatitude(Double.parseDouble(strArr[0]));
            location3.setLongitude(Double.parseDouble(strArr[1]));
            location3.setAccuracy(Float.parseFloat(strArr[2]));
            location3.setTime(Long.parseLong(strArr[3]));
            location2 = location3;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
        }
        f26373n = location2;
        return location2;
    }
}
