package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public interface I9 extends Kb<Integer, Integer> {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f29606a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f29607b = 2201;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f29608c = 2203;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f29609d = 2005;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f29610e = 2210;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f29611f = 2006;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f29612g = 2204;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f29613h = 2507;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f29614i = 2211;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f29615j = 2212;

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f29616a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f29617b = 2002;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f29618c = 2003;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f29619d = 2200;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f29620e = 2503;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f29621f = 2504;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f29622g = 2300;

        private b() {
        }
    }

    public static final class c implements I9 {
        @NotNull
        public Integer a(int i10) throws IllegalArgumentException {
            int i11;
            if (i10 == 206) {
                i11 = b.f29620e;
            } else if (i10 == 207) {
                i11 = b.f29621f;
            } else if (i10 == 401) {
                i11 = 2201;
            } else if (i10 == 410) {
                i11 = a.f29614i;
            } else if (i10 != 411) {
                switch (i10) {
                    case 101:
                        i11 = d.f29624b;
                        break;
                    case 102:
                        i11 = d.f29625c;
                        break;
                    case 103:
                        i11 = d.f29630h;
                        break;
                    case 104:
                        i11 = d.f29626d;
                        break;
                    case 105:
                        i11 = d.f29627e;
                        break;
                    default:
                        switch (i10) {
                            case 109:
                                i11 = 88002;
                                break;
                            case 110:
                                i11 = 83004;
                                break;
                            case 111:
                                i11 = d.f29631i;
                                break;
                            case 112:
                                i11 = d.f29632j;
                                break;
                            default:
                                switch (i10) {
                                    case 201:
                                        i11 = 2002;
                                        break;
                                    case 202:
                                        i11 = 2003;
                                        break;
                                    case 203:
                                        i11 = 2200;
                                        break;
                                    case 204:
                                        i11 = b.f29622g;
                                        break;
                                    default:
                                        switch (i10) {
                                            case 403:
                                                i11 = 2203;
                                                break;
                                            case 404:
                                                i11 = 2005;
                                                break;
                                            case 405:
                                                i11 = a.f29610e;
                                                break;
                                            case 406:
                                                i11 = 2006;
                                                break;
                                            case 407:
                                                i11 = a.f29612g;
                                                break;
                                            case 408:
                                                i11 = a.f29613h;
                                                break;
                                            default:
                                                throw new IllegalArgumentException("Unknown event code: " + i10);
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                i11 = a.f29615j;
            }
            return Integer.valueOf(i11);
        }

        @Override // com.ironsource.Kb
        public /* bridge */ /* synthetic */ Integer a(Integer num) {
            return a(num.intValue());
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f29623a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f29624b = 82500;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f29625c = 82510;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f29626d = 82300;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f29627e = 82002;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f29628f = 83004;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f29629g = 88002;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f29630h = 82301;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f29631i = 82302;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f29632j = 82076;

        private d() {
        }
    }
}
