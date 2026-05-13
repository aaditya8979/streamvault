package yads;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes12.dex */
public class p73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f93455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f93456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f93457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f93458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f93459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f93460f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f93461g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f93462h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f93463i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f93464j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f93465k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p51 f93466l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f93467m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p51 f93468n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f93469o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f93470p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f93471q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p51 f93472r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public p51 f93473s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f93474t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f93475u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f93476v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f93477w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f93478x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final HashMap f93479y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final HashSet f93480z;

    public p73() {
        this.f93455a = Integer.MAX_VALUE;
        this.f93456b = Integer.MAX_VALUE;
        this.f93457c = Integer.MAX_VALUE;
        this.f93458d = Integer.MAX_VALUE;
        this.f93463i = Integer.MAX_VALUE;
        this.f93464j = Integer.MAX_VALUE;
        this.f93465k = true;
        this.f93466l = p51.g();
        this.f93467m = 0;
        this.f93468n = p51.g();
        this.f93469o = 0;
        this.f93470p = Integer.MAX_VALUE;
        this.f93471q = Integer.MAX_VALUE;
        this.f93472r = p51.g();
        this.f93473s = p51.g();
        this.f93474t = 0;
        this.f93475u = 0;
        this.f93476v = false;
        this.f93477w = false;
        this.f93478x = false;
        this.f93479y = new HashMap();
        this.f93480z = new HashSet();
    }

    public p73(Context context) {
        this();
        a(context);
        b(context);
    }

    /* JADX WARN: Type inference failed for: r0v35, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v91, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r7v1, types: [int[], java.io.Serializable] */
    public p73(Bundle bundle) {
        String strA = q73.a(6);
        q73 q73Var = q73.B;
        this.f93455a = bundle.getInt(strA, q73Var.f93923b);
        this.f93456b = bundle.getInt(q73.a(7), q73Var.f93924c);
        this.f93457c = bundle.getInt(q73.a(8), q73Var.f93925d);
        this.f93458d = bundle.getInt(q73.a(9), q73Var.f93926e);
        this.f93459e = bundle.getInt(q73.a(10), q73Var.f93927f);
        this.f93460f = bundle.getInt(q73.a(11), q73Var.f93928g);
        this.f93461g = bundle.getInt(q73.a(12), q73Var.f93929h);
        this.f93462h = bundle.getInt(q73.a(13), q73Var.f93930i);
        this.f93463i = bundle.getInt(q73.a(14), q73Var.f93931j);
        this.f93464j = bundle.getInt(q73.a(15), q73Var.f93932k);
        this.f93465k = bundle.getBoolean(q73.a(16), q73Var.f93933l);
        this.f93466l = p51.b((String[]) dv1.a(bundle.getStringArray(q73.a(17)), new String[0]));
        this.f93467m = bundle.getInt(q73.a(25), q73Var.f93935n);
        this.f93468n = a((String[]) dv1.a(bundle.getStringArray(q73.a(1)), new String[0]));
        this.f93469o = bundle.getInt(q73.a(2), q73Var.f93937p);
        this.f93470p = bundle.getInt(q73.a(18), q73Var.f93938q);
        this.f93471q = bundle.getInt(q73.a(19), q73Var.f93939r);
        this.f93472r = p51.b((String[]) dv1.a(bundle.getStringArray(q73.a(20)), new String[0]));
        this.f93473s = a((String[]) dv1.a(bundle.getStringArray(q73.a(3)), new String[0]));
        this.f93474t = bundle.getInt(q73.a(4), q73Var.f93942u);
        this.f93475u = bundle.getInt(q73.a(26), q73Var.f93943v);
        this.f93476v = bundle.getBoolean(q73.a(5), q73Var.f93944w);
        this.f93477w = bundle.getBoolean(q73.a(21), q73Var.f93945x);
        this.f93478x = bundle.getBoolean(q73.a(22), q73Var.f93946y);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(q73.a(23));
        sm2 sm2VarG = parcelableArrayList == null ? p51.g() : yq.a(o73.f93138d, parcelableArrayList);
        this.f93479y = new HashMap();
        for (int i10 = 0; i10 < sm2VarG.size(); i10++) {
            o73 o73Var = (o73) sm2VarG.get(i10);
            this.f93479y.put(o73Var.f93139b, o73Var);
        }
        int[] iArr = (int[]) dv1.a(bundle.getIntArray(q73.a(24)), new int[0]);
        this.f93480z = new HashSet();
        for (int i11 : iArr) {
            this.f93480z.add(Integer.valueOf(i11));
        }
    }

    public static sm2 a(String[] strArr) {
        m51 m51Var = p51.f93439c;
        kx.a(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int length = strArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            String str = strArr[i10];
            str.getClass();
            String strE = ib3.e(str);
            strE.getClass();
            int i12 = i11 + 1;
            if (objArrCopyOf.length < i12) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i51.a(objArrCopyOf.length, i12));
            }
            objArrCopyOf[i11] = strE;
            i10++;
            i11 = i12;
        }
        return p51.b(i11, objArrCopyOf);
    }

    public p73 a(int i10, int i11) {
        this.f93463i = i10;
        this.f93464j = i11;
        this.f93465k = true;
        return this;
    }

    public void a(Context context) {
        CaptioningManager captioningManager;
        int i10 = ib3.f90737a;
        if (i10 >= 19) {
            if ((i10 >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.f93474t = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.f93473s = p51.a(ib3.a(locale));
                }
            }
        }
    }

    public void b(Context context) {
        Point pointC = ib3.c(context);
        a(pointC.x, pointC.y);
    }
}
