package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.material.datepicker.UtcDates;
import com.ironsource.P7;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: renamed from: com.ironsource.kd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C4112kd implements P7, P7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f32156a = "CappingManager.IS_DELIVERY_ENABLED";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f32157b = "CappingManager.IS_CAPPING_ENABLED";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f32158c = "CappingManager.IS_PACING_ENABLED";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f32159d = "CappingManager.MAX_NUMBER_OF_SHOWS";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f32160e = "CappingManager.CAPPING_TYPE";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f32161f = "CappingManager.SECONDS_BETWEEN_SHOWS";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f32162g = "CappingManager.CURRENT_NUMBER_OF_SHOWS";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f32163h = "CappingManager.CAPPING_TIME_THRESHOLD";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f32164i = "CappingManager.TIME_OF_THE_PREVIOUS_SHOW";

    /* JADX INFO: renamed from: com.ironsource.kd$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32165a;

        static {
            int[] iArr = new int[EnumC4130ld.values().length];
            f32165a = iArr;
            try {
                iArr[EnumC4130ld.PER_DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32165a[EnumC4130ld.PER_HOUR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.kd$b */
    public enum b {
        CAPPED_PER_DELIVERY,
        CAPPED_PER_COUNT,
        CAPPED_PER_PACE,
        NOT_CAPPED
    }

    private long a(EnumC4130ld enumC4130ld) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone(UtcDates.UTC));
        int i10 = a.f32165a[enumC4130ld.ordinal()];
        if (i10 == 1) {
            calendar.set(14, 0);
            calendar.set(13, 0);
            calendar.set(12, 0);
            calendar.set(11, 0);
            calendar.add(6, 1);
        } else if (i10 == 2) {
            calendar.set(14, 0);
            calendar.set(13, 0);
            calendar.set(12, 0);
            calendar.add(11, 1);
        }
        return calendar.getTimeInMillis();
    }

    private String a(IronSource.a aVar) {
        return aVar == IronSource.a.REWARDED_VIDEO ? IronSourceConstants.REWARDED_VIDEO_AD_UNIT : aVar == IronSource.a.INTERSTITIAL ? "Interstitial" : aVar == IronSource.a.BANNER ? "Banner" : aVar == IronSource.a.NATIVE_AD ? IronSourceConstants.NATIVE_AD_UNIT : aVar.toString();
    }

    private String a(String str, String str2, String str3) {
        return str + "_" + str2 + "_" + str3;
    }

    private void a(Context context, String str, String str2) {
        int i10 = 0;
        if (IronSourceUtils.a(context, a(str, f32158c, str2), false)) {
            IronSourceUtils.b(context, a(str, f32164i, str2), System.currentTimeMillis());
        }
        if (IronSourceUtils.a(context, a(str, f32157b, str2), false)) {
            String strA = a(str, f32162g, str2);
            int iA = IronSourceUtils.a(context, strA, 0);
            if (iA == 0) {
                String strC = IronSourceUtils.c(context, a(str, f32160e, str2), EnumC4130ld.PER_DAY.toString());
                EnumC4130ld enumC4130ld = null;
                EnumC4130ld[] enumC4130ldArrValues = EnumC4130ld.values();
                int length = enumC4130ldArrValues.length;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    EnumC4130ld enumC4130ld2 = enumC4130ldArrValues[i10];
                    if (enumC4130ld2.f32203a.equals(strC)) {
                        enumC4130ld = enumC4130ld2;
                        break;
                    }
                    i10++;
                }
                IronSourceUtils.b(context, a(str, f32163h, str2), a(enumC4130ld));
            }
            IronSourceUtils.b(context, strA, iA + 1);
        }
    }

    private void a(Context context, String str, String str2, C4059hd c4059hd) {
        boolean zE = c4059hd.e();
        IronSourceUtils.b(context, a(str, f32156a, str2), zE);
        if (zE) {
            boolean zD = c4059hd.d();
            IronSourceUtils.b(context, a(str, f32157b, str2), zD);
            if (zD) {
                IronSourceUtils.b(context, a(str, f32159d, str2), c4059hd.b());
                IronSourceUtils.f(context, a(str, f32160e, str2), c4059hd.a().toString());
            }
            boolean zF = c4059hd.f();
            IronSourceUtils.b(context, a(str, f32158c, str2), zF);
            if (zF) {
                IronSourceUtils.b(context, a(str, f32161f, str2), c4059hd.c());
            }
        }
    }

    private b b(Context context, String str, String str2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!IronSourceUtils.a(context, a(str, f32156a, str2), true)) {
            return b.CAPPED_PER_DELIVERY;
        }
        if (IronSourceUtils.a(context, a(str, f32158c, str2), false)) {
            if (jCurrentTimeMillis - IronSourceUtils.a(context, a(str, f32164i, str2), 0L) < IronSourceUtils.a(context, a(str, f32161f, str2), 0) * 1000) {
                return b.CAPPED_PER_PACE;
            }
        }
        if (IronSourceUtils.a(context, a(str, f32157b, str2), false)) {
            int iA = IronSourceUtils.a(context, a(str, f32159d, str2), 0);
            String strA = a(str, f32162g, str2);
            int iA2 = IronSourceUtils.a(context, strA, 0);
            String strA2 = a(str, f32163h, str2);
            if (jCurrentTimeMillis >= IronSourceUtils.a(context, strA2, 0L)) {
                IronSourceUtils.b(context, strA, 0);
                IronSourceUtils.b(context, strA2, 0L);
            } else if (iA2 >= iA) {
                return b.CAPPED_PER_COUNT;
            }
        }
        return b.NOT_CAPPED;
    }

    @Override // com.ironsource.P7
    public synchronized b a(Context context, AbstractC4278u3 abstractC4278u3, IronSource.a aVar) {
        if (context == null) {
            return b.NOT_CAPPED;
        }
        if (abstractC4278u3 == null) {
            return b.NOT_CAPPED;
        }
        String strA = a(aVar);
        if (abstractC4278u3.c() == null) {
            return b.NOT_CAPPED;
        }
        if (abstractC4278u3.a() == null) {
            return b.NOT_CAPPED;
        }
        return b(context, strA, abstractC4278u3.c());
    }

    @Override // com.ironsource.P7.a
    public synchronized void a(Context context, String str, IronSource.a aVar) {
        if (context == null) {
            return;
        }
        if (str == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a(context, a(aVar), str);
    }

    @Override // com.ironsource.P7.a
    public synchronized void b(Context context, AbstractC4278u3 abstractC4278u3, IronSource.a aVar) {
        if (context == null || abstractC4278u3 == null) {
            return;
        }
        C4059hd c4059hdA = abstractC4278u3.a();
        if (c4059hdA == null) {
            return;
        }
        a(context, a(aVar), abstractC4278u3.c(), c4059hdA);
    }

    @Override // com.ironsource.P7
    public synchronized boolean c(Context context, AbstractC4278u3 abstractC4278u3, IronSource.a aVar) {
        return a(context, abstractC4278u3, aVar) != b.NOT_CAPPED;
    }
}
