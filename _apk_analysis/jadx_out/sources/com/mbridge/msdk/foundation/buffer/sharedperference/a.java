package com.mbridge.msdk.foundation.buffer.sharedperference;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.directory.c;
import com.mbridge.msdk.foundation.same.directory.e;
import com.mbridge.msdk.foundation.tools.FastKV;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: SharedPerferenceManager.java */
/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f37320b = "a";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static a f37321c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FastKV f37322a;

    private a() {
    }

    private void a() {
        if (this.f37322a == null) {
            try {
                this.f37322a = new FastKV.Builder(e.b(c.MBRIDGE_700_CONFIG), "mbridge").build();
            } catch (Exception unused) {
                this.f37322a = null;
            }
        }
    }

    public static synchronized a b() {
        if (f37321c == null) {
            f37321c = new a();
        }
        return f37321c;
    }

    public int a(String str, int i10) {
        try {
            if (com.mbridge.msdk.foundation.controller.c.n().d() == null) {
                return i10;
            }
            a();
            FastKV fastKV = this.f37322a;
            if (fastKV != null) {
                try {
                    return fastKV.getInt(str, i10);
                } catch (Exception unused) {
                    return i10;
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.a(f37320b, "getInt error: " + e10.getMessage());
            }
        }
        return i10;
    }

    public String a(String str) {
        try {
            if (com.mbridge.msdk.foundation.controller.c.n().d() == null) {
                return null;
            }
            a();
            FastKV fastKV = this.f37322a;
            if (fastKV != null) {
                try {
                    return fastKV.getString(str, "");
                } catch (Exception unused) {
                    return "";
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.a(f37320b, "get error: " + e10.getMessage());
            }
        }
        return null;
    }

    public void a(String str, long j10) {
        try {
            if (com.mbridge.msdk.foundation.controller.c.n().d() == null) {
                q0.b(f37320b, "context is null in put");
                return;
            }
            a();
            FastKV fastKV = this.f37322a;
            if (fastKV != null) {
                try {
                    fastKV.putLong(str, j10);
                } catch (Exception unused) {
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.a(f37320b, "putLong error: " + e10.getMessage());
            }
        }
    }

    public void a(String str, String str2) {
        try {
            if (com.mbridge.msdk.foundation.controller.c.n().d() == null) {
                return;
            }
            a();
            FastKV fastKV = this.f37322a;
            if (fastKV != null) {
                try {
                    fastKV.putString(str, str2);
                } catch (Exception unused) {
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.a(f37320b, "put error: " + e10.getMessage());
            }
        }
    }

    public Long b(String str) {
        try {
            if (com.mbridge.msdk.foundation.controller.c.n().d() == null) {
                q0.b(f37320b, "context is null in get");
                return 0L;
            }
            a();
            FastKV fastKV = this.f37322a;
            if (fastKV != null) {
                try {
                    return Long.valueOf(fastKV.getLong(str, 0L));
                } catch (Exception unused) {
                    return 0L;
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.a(f37320b, "getLong error: " + e10.getMessage());
            }
        }
        return 0L;
    }

    public void b(String str, int i10) {
        try {
            if (com.mbridge.msdk.foundation.controller.c.n().d() == null) {
                return;
            }
            a();
            FastKV fastKV = this.f37322a;
            if (fastKV != null) {
                try {
                    fastKV.putInt(str, i10);
                } catch (Exception unused) {
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void c(String str) {
        if (com.mbridge.msdk.foundation.controller.c.n().d() == null) {
            return;
        }
        a();
        FastKV fastKV = this.f37322a;
        if (fastKV != null) {
            try {
                fastKV.remove(str);
            } catch (Exception unused) {
            }
        }
    }
}
