package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.ae, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC3934ae extends Kb<Integer, Integer> {

    /* JADX INFO: renamed from: com.ironsource.ae$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f30964a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f30965b = 1201;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f30966c = 1202;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f30967d = 1005;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f30968e = 1206;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f30969f = 1006;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f30970g = 1203;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f30971h = 1507;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f30972i = 1010;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f30973j = 1210;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f30974k = 1211;

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.ae$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f30975a = new b();

        private b() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.ae$c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f30976a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f30977b = 1001;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f30978c = 1002;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f30979d = 1200;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f30980e = 1301;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f30981f = 1503;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f30982g = 1504;

        private c() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.ae$d */
    public static final class d implements InterfaceC3934ae {
        @NotNull
        public Integer a(int i10) throws IllegalArgumentException {
            int i11;
            if (i10 == 206) {
                i11 = c.f30981f;
            } else if (i10 == 207) {
                i11 = c.f30982g;
            } else if (i10 != 401) {
                switch (i10) {
                    case 101:
                        i11 = e.f30984b;
                        break;
                    case 102:
                        i11 = e.f30985c;
                        break;
                    case 103:
                        i11 = e.f30986d;
                        break;
                    case 104:
                        i11 = e.f30987e;
                        break;
                    case 105:
                        i11 = e.f30988f;
                        break;
                    default:
                        switch (i10) {
                            case 109:
                                i11 = 88002;
                                break;
                            case 110:
                                i11 = e.f30990h;
                                break;
                            case 111:
                                i11 = e.f30991i;
                                break;
                            case 112:
                                i11 = e.f30992j;
                                break;
                            default:
                                switch (i10) {
                                    case 201:
                                        i11 = 1001;
                                        break;
                                    case 202:
                                        i11 = 1002;
                                        break;
                                    case 203:
                                        i11 = c.f30979d;
                                        break;
                                    case 204:
                                        i11 = c.f30980e;
                                        break;
                                    default:
                                        switch (i10) {
                                            case 403:
                                                i11 = a.f30966c;
                                                break;
                                            case 404:
                                                i11 = 1005;
                                                break;
                                            case 405:
                                                i11 = a.f30968e;
                                                break;
                                            case 406:
                                                i11 = 1006;
                                                break;
                                            case 407:
                                                i11 = a.f30970g;
                                                break;
                                            case 408:
                                                i11 = a.f30971h;
                                                break;
                                            case 409:
                                                i11 = 1010;
                                                break;
                                            case 410:
                                                i11 = a.f30973j;
                                                break;
                                            case 411:
                                                i11 = a.f30974k;
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
                i11 = a.f30965b;
            }
            return Integer.valueOf(i11);
        }

        @Override // com.ironsource.Kb
        public /* bridge */ /* synthetic */ Integer a(Integer num) {
            return a(num.intValue());
        }
    }

    /* JADX INFO: renamed from: com.ironsource.ae$e */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final e f30983a = new e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f30984b = 81500;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f30985c = 81510;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f30986d = 81301;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f30987e = 81300;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f30988f = 81002;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f30989g = 88002;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f30990h = 83003;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f30991i = 81302;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f30992j = 81077;

        private e() {
        }
    }
}
