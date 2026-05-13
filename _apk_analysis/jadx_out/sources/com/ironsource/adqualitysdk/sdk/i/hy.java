package com.ironsource.adqualitysdk.sdk.i;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class hy {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private a f2443;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private ia f2444;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private hm f2445;

    public static class a {

        /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
        private Object f2448;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private Class f2455;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private Class f2456;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private List<String> f2457;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private Class f2458;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private int f2459;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private int f2451 = -1;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private int f2454 = -1;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private int f2450 = -1;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private int f2452 = -1;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private int f2453 = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
        private int f2447 = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
        private int f2449 = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
        private boolean f2446 = true;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f2459 != aVar.f2459 || this.f2451 != aVar.f2451 || this.f2454 != aVar.f2454 || this.f2450 != aVar.f2450 || this.f2452 != aVar.f2452 || this.f2453 != aVar.f2453 || this.f2447 != aVar.f2447 || this.f2449 != aVar.f2449 || this.f2446 != aVar.f2446) {
                    return false;
                }
                Class cls = this.f2456;
                if (cls == null ? aVar.f2456 != null : !cls.equals(aVar.f2456)) {
                    return false;
                }
                Class cls2 = this.f2458;
                if (cls2 == null ? aVar.f2458 != null : !cls2.equals(aVar.f2458)) {
                    return false;
                }
                Class cls3 = this.f2455;
                if (cls3 == null ? aVar.f2455 != null : !cls3.equals(aVar.f2455)) {
                    return false;
                }
                List<String> list = this.f2457;
                if (list == null ? aVar.f2457 != null : !list.equals(aVar.f2457)) {
                    return false;
                }
                Object obj2 = this.f2448;
                Object obj3 = aVar.f2448;
                if (obj2 != null) {
                    return obj2.equals(obj3);
                }
                if (obj3 == null) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            Class cls = this.f2456;
            int iHashCode = (cls != null ? cls.hashCode() : 0) * 31;
            Class cls2 = this.f2458;
            int iHashCode2 = (iHashCode + (cls2 != null ? cls2.hashCode() : 0)) * 31;
            Class cls3 = this.f2455;
            int iHashCode3 = (iHashCode2 + (cls3 != null ? cls3.hashCode() : 0)) * 31;
            List<String> list = this.f2457;
            int iHashCode4 = (((((((((((((((((((iHashCode3 + (list != null ? list.hashCode() : 0)) * 31) + this.f2459) * 31) + this.f2451) * 31) + this.f2454) * 31) + this.f2450) * 31) + this.f2452) * 31) + this.f2453) * 31) + this.f2447) * 31) + this.f2449) * 31) + (this.f2446 ? 1 : 0)) * 31;
            Object obj = this.f2448;
            return iHashCode4 + (obj != null ? obj.hashCode() : 0);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private hy f2460 = new hy(0);

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        public final c m6490(int i10) {
            this.f2460.f2443.f2453 = i10;
            return this;
        }

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        public final c m6491(int i10) {
            this.f2460.f2443.f2449 = i10;
            return this;
        }

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        public final c m6492(boolean z10) {
            this.f2460.f2443.f2446 = z10;
            return this;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final c m6493(int i10) {
            this.f2460.f2443.f2450 = i10;
            return this;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final c m6494(Object obj) {
            this.f2460.f2443.f2448 = obj;
            return this;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final c m6495(boolean z10) {
            this.f2460.f2443.f2454 = z10 ? -1 : Integer.MAX_VALUE;
            return this;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final hy m6496(ia iaVar, hm hmVar, List<String> list, int i10) {
            this.f2460.f2444 = iaVar;
            this.f2460.f2445 = hmVar;
            this.f2460.f2443.f2457 = list;
            this.f2460.f2443.f2459 = i10;
            this.f2460.f2443.f2458 = iaVar.getClass();
            this.f2460.f2443.f2455 = hmVar != null ? hmVar.getClass() : null;
            return this.f2460;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final c m6497(int i10) {
            this.f2460.f2443.f2452 = i10;
            return this;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final c m6498(boolean z10) {
            this.f2460.f2443.f2449 = z10 ? -1 : Integer.MAX_VALUE;
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final c m6499(int i10) {
            this.f2460.f2443.f2451 = i10;
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final c m6500(boolean z10) {
            this.f2460.f2443.f2453 = z10 ? -1 : Integer.MAX_VALUE;
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final hy m6501(ia iaVar, List<String> list, int i10) {
            return m6496(iaVar, null, list, i10);
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final c m6502(int i10) {
            this.f2460.f2443.f2447 = i10;
            return this;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final c m6503(boolean z10) {
            this.f2460.f2443.f2452 = z10 ? -1 : Integer.MAX_VALUE;
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final c m6504(int i10) {
            this.f2460.f2443.f2454 = i10;
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final c m6505(boolean z10) {
            this.f2460.f2443.f2447 = z10 ? -1 : Integer.MAX_VALUE;
            return this;
        }
    }

    private hy() {
        this.f2443 = new a();
    }

    public /* synthetic */ hy(byte b10) {
        this();
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean m6452(int i10, int i11) {
        return i10 >= i11;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final boolean m6454(int i10) {
        return m6452(i10, this.f2443.f2453);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final ia m6455() {
        return this.f2444;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m6456(int i10) {
        return m6452(i10, this.f2443.f2447);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final int m6457(int i10) {
        if (m6452(i10, this.f2443.f2454)) {
            return this.f2443.f2450;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final boolean m6458() {
        return this.f2443.f2446;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final List<String> m6459() {
        return this.f2443.f2457;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final boolean m6460(int i10) {
        return m6452(i10, this.f2443.f2449);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final int m6461() {
        return this.f2443.f2459;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final a m6462(Class cls) {
        this.f2443.f2456 = cls;
        return this.f2443;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m6463(int i10) {
        return m6452(i10, this.f2443.f2451);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final hm m6464() {
        return this.f2445;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m6465(int i10) {
        return m6452(i10, this.f2443.f2452);
    }
}
