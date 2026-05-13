package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;
import android.os.Process;
import android.widget.ExpandableListView;

/* JADX INFO: loaded from: classes11.dex */
public final class hj extends hb<MediaPlayer.OnSeekCompleteListener> implements MediaPlayer.OnSeekCompleteListener {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2345 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2346 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f2347 = 22296;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2348 = 29824;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f2349 = 45187;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f2350 = 488;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private c f2351;

    public interface c {
        /* JADX INFO: renamed from: ｋ */
        void mo5913(hj hjVar, MediaPlayer mediaPlayer);
    }

    public hj(MediaPlayer.OnSeekCompleteListener onSeekCompleteListener, c cVar) {
        super(onSeekCompleteListener);
        this.f2351 = cVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m6329(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (n.f3014) {
            char[] cArr2 = new char[cArr.length];
            n.f3013 = 0;
            char[] cArr3 = new char[2];
            while (true) {
                int i11 = n.f3013;
                if (i11 < cArr.length) {
                    cArr3[0] = cArr[i11];
                    cArr3[1] = cArr[i11 + 1];
                    int i12 = 58224;
                    for (int i13 = 0; i13 < 16; i13++) {
                        char c10 = cArr3[1];
                        char c11 = cArr3[0];
                        char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f2350)) ^ ((c11 >>> 5) + f2348)));
                        cArr3[1] = c12;
                        cArr3[0] = (char) (c11 - (((c12 >>> 5) + f2347) ^ ((c12 + i12) ^ ((c12 << 4) + f2349))));
                        i12 -= 40503;
                    }
                    int i14 = n.f3013;
                    cArr2[i14] = cArr3[0];
                    cArr2[i14 + 1] = cArr3[1];
                    n.f3013 = i14 + 2;
                } else {
                    str2 = new String(cArr2, 0, i10);
                }
            }
        }
        return str2;
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        int i10 = f2346 + 97;
        f2345 = i10 % 128;
        int i11 = i10 % 2;
        try {
            this.f2351.mo5913(this, mediaPlayer);
            int i12 = f2346 + 5;
            f2345 = i12 % 128;
            int i13 = i12 % 2;
        } catch (Throwable th2) {
            kd.m6948(m6329("韴\ud85a⓽ꂌ蜝鵛끠뾉⸆醘비嶟\uefdf\uf3bc\u18ad\uead3䖰둂ɓﲢ健诔尝霵䵥売쩕鲳ମꐯ\uee9e甒", 31 - (Process.myPid() >> 22)).intern(), m6329("༫询삜界ꪱ\u09de⃪葠團\ue80dᡘ✍\u18ad\uead3䖰둂ɓﲢ健诔莹ൠ\uf59d읢ꦌͩ迓⟇ᱶ烵£ᆏ㖠⫡ꕗ\ueddb", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 35).intern(), th2, false);
        }
        if ((mo4818() != null ? '/' : 'E') != '/') {
            return;
        }
        int i14 = f2345 + 109;
        f2346 = i14 % 128;
        if (i14 % 2 != 0) {
            mo4818().onSeekComplete(mediaPlayer);
        } else {
            mo4818().onSeekComplete(mediaPlayer);
            throw null;
        }
    }
}
