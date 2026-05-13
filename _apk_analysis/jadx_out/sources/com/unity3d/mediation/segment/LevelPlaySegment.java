package com.unity3d.mediation.segment;

import android.text.TextUtils;
import cn.x;
import com.ironsource.C4228r4;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import tn.i;
import tn.p;

/* JADX INFO: loaded from: classes3.dex */
public final class LevelPlaySegment {

    @NotNull
    public static final a Companion = new a(null);

    @NotNull
    public static final String IAPT = "iapt";

    @NotNull
    public static final String LEVEL = "lvl";

    @NotNull
    public static final String PAYING = "pay";

    @NotNull
    public static final String SEGMENT_NAME = "segName";

    @NotNull
    public static final String USER_CREATION_DATE = "ucd";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f53525h = 999999;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final double f53526i = 999999.99d;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f53527j = 5;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final String f53528k = "custom";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f53531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private String f53532d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f53535g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ArrayList<Pair<String, String>> f53529a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f53530b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f53533e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f53534f = -1.0d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    private final boolean a(String str) {
        if (str == null) {
            return false;
        }
        return new Regex("^[a-zA-Z0-9]*$").matches(str);
    }

    private final boolean a(String str, int i10, int i11) {
        return str != null && str.length() >= i10 && str.length() <= i11;
    }

    @NotNull
    public final ArrayList<Pair<String, String>> getCustoms$mediationsdk_release() {
        return this.f53529a;
    }

    public final double getIapTotal() {
        return this.f53534f;
    }

    public final int getLevel() {
        return this.f53533e;
    }

    @NotNull
    public final ArrayList<Pair<String, String>> getSegmentData() {
        IronLog.API.info("");
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        int i10 = this.f53533e;
        if (i10 != -1) {
            arrayList.add(new Pair<>("lvl", String.valueOf(i10)));
        }
        if (this.f53531c) {
            arrayList.add(new Pair<>("pay", String.valueOf(isPaying())));
        }
        double d10 = this.f53534f;
        if (d10 != -1.0d) {
            arrayList.add(new Pair<>("iapt", String.valueOf(d10)));
        }
        long j10 = this.f53535g;
        if (j10 != 0) {
            arrayList.add(new Pair<>("ucd", String.valueOf(j10)));
        }
        String str = this.f53532d;
        if (str != null && !TextUtils.isEmpty(str)) {
            arrayList.add(new Pair<>(SEGMENT_NAME, str));
        }
        ArrayList<Pair<String, String>> arrayList2 = this.f53529a;
        ArrayList arrayList3 = new ArrayList(x.x(arrayList2, 10));
        Iterator<T> it = arrayList2.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList3.add(new Pair("custom_" + pair.getFirst(), pair.getSecond()));
        }
        arrayList.addAll(arrayList3);
        return arrayList;
    }

    @Nullable
    public final String getSegmentName() {
        return this.f53532d;
    }

    public final long getUserCreationDate() {
        return this.f53535g;
    }

    public final boolean isPaying() {
        return this.f53530b.get();
    }

    public final void setCustom(@NotNull String str, @NotNull String str2) {
        p.k(str, "key");
        p.k(str2, "value");
        IronLog.API.info("");
        try {
            if (a(str) && a(str, 1, 32) && a(str2) && a(str2, 1, 32)) {
                if (this.f53529a.size() >= 5) {
                    this.f53529a.remove(0);
                }
                this.f53529a.add(new Pair<>(str, str2));
                return;
            }
            IronLog.INTERNAL.warning(str + ", " + str2 + " must be alphanumeric and 1-32 in length");
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public final void setIapTotal(double d10) {
        IronLog.API.info("");
        if (0.0d <= d10 && d10 <= f53526i) {
            double d11 = 100;
            this.f53534f = Math.floor(d10 * d11) / d11;
            return;
        }
        IronLog.INTERNAL.warning(d10 + " must be between 0-999999.99");
    }

    public final void setLevel(int i10) {
        IronLog.API.info("");
        if (1 <= i10 && i10 < 1000000) {
            this.f53533e = i10;
            return;
        }
        IronLog.INTERNAL.warning(i10 + " must be between 1-999999");
    }

    public final void setPaying(boolean z10) {
        IronLog.API.info("");
        this.f53531c = true;
        this.f53530b.set(z10);
    }

    public final void setSegmentName(@Nullable String str) {
        IronLog.API.info("");
        if (a(str) && a(str, 1, 32)) {
            this.f53532d = str;
            return;
        }
        IronLog.INTERNAL.warning(str + " must be alphanumeric and 1-32 in length");
    }

    public final void setUserCreationDate(long j10) {
        IronLog.API.info("");
        if (j10 > 0) {
            this.f53535g = j10;
            return;
        }
        IronLog.INTERNAL.warning(j10 + " is an invalid timestamp");
    }

    @NotNull
    public final JSONObject toJson() {
        IronLog.API.info("");
        JSONObject jSONObject = new JSONObject();
        for (Pair<String, String> pair : getSegmentData()) {
            try {
                jSONObject.put(pair.component1(), pair.component2());
            } catch (JSONException e10) {
                C4228r4.d().a(e10);
                IronLog.INTERNAL.error("exception " + e10.getMessage());
            }
        }
        return jSONObject;
    }
}
