package com.ironsource.mediationsdk.adquality;

import com.ironsource.C4019f9;
import com.ironsource.EnumC4255se;
import com.ironsource.Q6;
import java.util.LinkedHashSet;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import tn.i;
import tn.p;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f32334a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static EnumC0394a f32335b = EnumC0394a.DONT_INITIALIZE;

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.adquality.a$a, reason: collision with other inner class name */
    public enum EnumC0394a {
        DONT_INITIALIZE(0),
        LEVELPLAY_ONLY(1),
        ALL_MEDIATIONS(2),
        OTHER_ONLY(3);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final C0395a f32336b = new C0395a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f32342a;

        /* JADX INFO: renamed from: com.ironsource.mediationsdk.adquality.a$a$a, reason: collision with other inner class name */
        public static final class C0395a {
            private C0395a() {
            }

            public /* synthetic */ C0395a(i iVar) {
                this();
            }

            @NotNull
            public final EnumC0394a a(int i10) {
                EnumC0394a enumC0394a;
                EnumC0394a[] enumC0394aArrValues = EnumC0394a.values();
                int length = enumC0394aArrValues.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        enumC0394a = null;
                        break;
                    }
                    enumC0394a = enumC0394aArrValues[i11];
                    if (enumC0394a.b() == i10) {
                        break;
                    }
                    i11++;
                }
                return enumC0394a == null ? EnumC0394a.DONT_INITIALIZE : enumC0394a;
            }
        }

        EnumC0394a(int i10) {
            this.f32342a = i10;
        }

        public final int b() {
            return this.f32342a;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(i iVar) {
            this();
        }

        @NotNull
        public final EnumC0394a a() {
            return a.f32335b;
        }

        public final void a(@NotNull EnumC0394a enumC0394a) {
            p.k(enumC0394a, "<set-?>");
            a.f32335b = enumC0394a;
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32343a;

        static {
            int[] iArr = new int[EnumC0394a.values().length];
            try {
                iArr[EnumC0394a.LEVELPLAY_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0394a.ALL_MEDIATIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC0394a.OTHER_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f32343a = iArr;
        }
    }

    public final void a(int i10) {
        f32335b = EnumC0394a.f32336b.a(i10);
    }

    public final boolean b() throws JSONException {
        EnumC4255se enumC4255se;
        JSONArray jSONArrayOptJSONArray = new C4019f9().a().optJSONArray(Q6.f30227g0);
        if (jSONArrayOptJSONArray == null) {
            return false;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jSONArrayOptJSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = jSONArrayOptJSONArray.getInt(i10);
            EnumC4255se[] enumC4255seArrValues = EnumC4255se.values();
            int length2 = enumC4255seArrValues.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length2) {
                    enumC4255se = null;
                    break;
                }
                enumC4255se = enumC4255seArrValues[i12];
                if (enumC4255se.b() == i11) {
                    break;
                }
                i12++;
            }
            if (enumC4255se != null) {
                linkedHashSet.add(enumC4255se);
            }
        }
        int i13 = c.f32343a[f32335b.ordinal()];
        if (i13 == 1) {
            return linkedHashSet.contains(EnumC4255se.LEVEL_PLAY_INIT);
        }
        if (i13 == 2) {
            return linkedHashSet.contains(EnumC4255se.LEVEL_PLAY_INIT) || linkedHashSet.contains(EnumC4255se.EXTERNAL_MEDIATION_INIT);
        }
        if (i13 != 3) {
            return false;
        }
        return linkedHashSet.contains(EnumC4255se.EXTERNAL_MEDIATION_INIT);
    }
}
