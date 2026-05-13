package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.ViewConfiguration;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class je {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Handler f2782 = null;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2783 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f2784 = 6080386998049583536L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2785;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private ib f2786;

    public interface b {
        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        void mo6718(String str);
    }

    public interface d {
        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        void mo6719();
    }

    public je(Context context, String str, String str2) {
        this.f2786 = new ib(context, str, str2);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m6703(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(m6704("Ό⟥啚\ue3c0\u03a2ᘹ㙛皣씸\udfe0缊롴蹭颡ꗟ", ViewConfiguration.getMinimumFlingVelocity() >> 16).intern());
        String string = sb2.toString();
        int i10 = f2783 + 85;
        f2785 = i10 % 128;
        int i11 = i10 % 2;
        return string;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m6704(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2306) {
            char[] cArrM6319 = h.m6319(f2784, cArr, i10);
            h.f2307 = 4;
            while (true) {
                int i11 = h.f2307;
                if (i11 < cArrM6319.length) {
                    h.f2305 = i11 - 4;
                    cArrM6319[h.f2307] = (char) (((long) (cArrM6319[r1] ^ cArrM6319[r1 % 4])) ^ (((long) h.f2305) * f2784));
                    h.f2307++;
                } else {
                    str2 = new String(cArrM6319, 4, cArrM6319.length - 4);
                }
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m6705(d dVar) {
        int i10 = f2785 + 7;
        f2783 = i10 % 128;
        int i11 = i10 % 2;
        if (dVar != null) {
            t.m7076(new ir(dVar) { // from class: com.ironsource.adqualitysdk.sdk.i.je.1
                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                /* JADX INFO: renamed from: ﾒ */
                public final void mo4352() {
                }
            });
            int i12 = f2783 + 7;
            f2785 = i12 % 128;
            int i13 = i12 % 2;
        }
        int i14 = f2785 + 17;
        f2783 = i14 % 128;
        if ((i14 % 2 == 0 ? '\r' : ':') != '\r') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static Handler m6706() {
        Handler handler;
        synchronized (je.class) {
            if (f2782 == null) {
                HandlerThread handlerThread = new HandlerThread(m6704("\u0efb퇕롮\udb97ະ\ue000\udb77仑졚⧉鈻耢茨溑䣡掠嫚呂ྫ", ViewConfiguration.getMinimumFlingVelocity() >> 16).intern());
                handlerThread.start();
                f2782 = new Handler(handlerThread.getLooper());
            }
            handler = f2782;
        }
        return handler;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m6707(je jeVar, d dVar) {
        int i10 = f2785 + 113;
        f2783 = i10 % 128;
        int i11 = i10 % 2;
        jeVar.m6705(dVar);
        int i12 = f2785 + 85;
        f2783 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m6708(final String str, final b bVar) {
        m6706().post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.je.2
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                final String strM6713 = je.this.m6713(str);
                t.m7076(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.je.2.5
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo4352() {
                        bVar.mo6718(strM6713);
                    }
                });
            }
        });
        int i10 = f2783 + 55;
        f2785 = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m6709(String str, String str2) {
        int i10 = f2783 + 61;
        f2785 = i10 % 128;
        if (i10 % 2 != 0) {
            m6714(str, str2);
            m6714(m6703(str), Long.toString(jx.m6856()));
            throw null;
        }
        m6714(str, str2);
        m6714(m6703(str), Long.toString(jx.m6856()));
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m6710(String str) {
        int i10 = f2785 + 107;
        f2783 = i10 % 128;
        int i11 = i10 % 2;
        this.f2786.m6533(str);
        int i12 = f2783 + 21;
        f2785 = i12 % 128;
        if ((i12 % 2 != 0 ? 'A' : (char) 22) == 22) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m6711(final String str, final String str2, final d dVar) {
        m6706().post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.je.5
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                je.this.m6709(str, str2);
                je.m6707(je.this, dVar);
            }
        });
        int i10 = f2785 + 53;
        f2783 = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m6712(final String str, final String str2, final d dVar) {
        m6706().post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.je.4
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                je.this.m6714(str, str2);
                je.m6707(je.this, dVar);
            }
        });
        int i10 = f2783 + 5;
        f2785 = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m6713(String str) {
        int i10 = f2785 + 73;
        f2783 = i10 % 128;
        int i11 = i10 % 2;
        String strM6534 = this.f2786.m6534(str);
        int i12 = f2785 + 115;
        f2783 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
        return strM6534;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m6714(String str, String str2) {
        int i10 = f2783 + 93;
        f2785 = i10 % 128;
        if (i10 % 2 == 0) {
            this.f2786.m6537(str, str2);
        } else {
            this.f2786.m6537(str, str2);
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final int m6715(String str) {
        int i10 = f2785 + 65;
        f2783 = i10 % 128;
        if (i10 % 2 == 0) {
            this.f2786.m6536(str);
            throw null;
        }
        int iM6536 = this.f2786.m6536(str);
        int i11 = f2785 + 73;
        f2783 = i11 % 128;
        int i12 = i11 % 2;
        return iM6536;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final HashMap<String, String> m6716(String str, int i10) {
        int i11 = f2783 + 67;
        f2785 = i11 % 128;
        int i12 = i11 % 2;
        HashMap<String, String> mapM6535 = this.f2786.m6535(str, i10);
        int i13 = f2783 + 11;
        f2785 = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
        return mapM6535;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m6717(String str, String str2) {
        int i10 = f2785 + 103;
        f2783 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        m6712(str, str2, null);
        if (z10) {
            throw null;
        }
        int i11 = f2785 + 71;
        f2783 = i11 % 128;
        if ((i11 % 2 == 0 ? '3' : 'a') == 'a') {
        } else {
            throw null;
        }
    }
}
