package com.inmobi.media;

import android.media.MediaPlayer;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.MediaSource;
import com.inmobi.media.Mm;
import com.safedk.android.internal.partials.InMobiVideoBridge;
import java.io.IOException;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* JADX INFO: loaded from: classes8.dex */
public abstract class Mm {
    public static final Object a(MediaPlayer mediaPlayer, String str, InterfaceC3580m9 interfaceC3580m9, Fm fm2) {
        kotlinx.coroutines.c cVar = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.d(fm2), 1);
        cVar.K();
        cVar.P(new Hm(mediaPlayer));
        try {
            mediaPlayer.setOnPreparedListener(new Im(interfaceC3580m9, str, cVar));
            mediaPlayer.setOnErrorListener(new Jm(interfaceC3580m9, str, cVar));
            InMobiVideoBridge.MediaPlayerSetDataSource(mediaPlayer, str);
            mediaPlayer.prepareAsync();
        } catch (IOException e10) {
            if (interfaceC3580m9 != null) {
                ((C3605n9) interfaceC3580m9).b("VideoLoaderHelper", "Video Load Exception: " + e10.getMessage());
            }
            P4.a(cVar, jn.a.a(false));
        } catch (IllegalStateException e11) {
            if (interfaceC3580m9 != null) {
                ((C3605n9) interfaceC3580m9).b("VideoLoaderHelper", "Video Load Exception: " + e11.getMessage());
            }
            P4.a(cVar, jn.a.a(false));
        }
        Object objB = cVar.B();
        if (objB == in.a.g()) {
            jn.f.c(fm2);
        }
        return objB;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0084 -> B:25:0x0088). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(android.media.MediaPlayer r7, java.util.ArrayList r8, com.inmobi.media.C3605n9 r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            boolean r0 = r10 instanceof com.inmobi.media.Fm
            if (r0 == 0) goto L13
            r0 = r10
            com.inmobi.media.Fm r0 = (com.inmobi.media.Fm) r0
            int r1 = r0.f25482f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25482f = r1
            goto L18
        L13:
            com.inmobi.media.Fm r0 = new com.inmobi.media.Fm
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f25481e
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f25482f
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.String r7 = r0.f25480d
            java.util.Iterator r8 = r0.f25479c
            com.inmobi.media.m9 r9 = r0.f25478b
            android.media.MediaPlayer r2 = r0.f25477a
            kotlin.c.b(r10)
            goto L88
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            kotlin.c.b(r10)
            a(r7, r9)
            java.util.Iterator r8 = r8.iterator()
        L43:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L98
            java.lang.Object r10 = r8.next()
            java.lang.String r10 = (java.lang.String) r10
            boolean r2 = android.webkit.URLUtil.isNetworkUrl(r10)
            if (r2 == 0) goto L43
            if (r9 == 0) goto L70
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Video Loading for URL: "
            r2.append(r4)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            r4 = r9
            com.inmobi.media.n9 r4 = (com.inmobi.media.C3605n9) r4
            java.lang.String r5 = "VideoLoaderHelper"
            r4.a(r5, r2)
        L70:
            r7.reset()
            r0.f25477a = r7
            r0.f25478b = r9
            r0.f25479c = r8
            r0.f25480d = r10
            r0.f25482f = r3
            java.lang.Object r2 = a(r7, r10, r9, r0)
            if (r2 != r1) goto L84
            return r1
        L84:
            r6 = r2
            r2 = r7
            r7 = r10
            r10 = r6
        L88:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L96
            com.inmobi.media.Dm r8 = new com.inmobi.media.Dm
            r8.<init>(r7)
            return r8
        L96:
            r7 = r2
            goto L43
        L98:
            com.inmobi.media.zm r7 = com.inmobi.media.C3917zm.f28668a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Mm.a(android.media.MediaPlayer, java.util.ArrayList, com.inmobi.media.n9, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final Object a(ExoPlayer exoPlayer, String str, InterfaceC3580m9 interfaceC3580m9, K2 k22, boolean z10, Gm gm2) {
        kotlinx.coroutines.c cVar = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.d(gm2), 1);
        cVar.K();
        Lm lm2 = new Lm(cVar, k22, str, interfaceC3580m9, exoPlayer);
        cVar.P(new Km(exoPlayer, lm2));
        if (interfaceC3580m9 != null) {
            try {
                ((C3605n9) interfaceC3580m9).a("VideoLoaderHelper", "Trying URL with cache " + z10 + ": " + str);
            } catch (Exception e10) {
                if (interfaceC3580m9 != null) {
                    ((C3605n9) interfaceC3580m9).b("VideoLoaderHelper", "Exception during media source preparation for URL (" + str + "): " + e10.getMessage());
                }
                exoPlayer.removeListener(lm2);
                if (cVar.isActive()) {
                    P4.a(cVar, new C3327c8(Am.f25178b));
                }
                exoPlayer.stop();
                exoPlayer.clearMediaItems();
            }
        }
        MediaSource mediaSourceA = k22.a(str, z10);
        exoPlayer.addListener(lm2);
        exoPlayer.setMediaSource(mediaSourceA);
        exoPlayer.prepare();
        Object objB = cVar.B();
        if (objB == in.a.g()) {
            jn.f.c(gm2);
        }
        return objB;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0154 -> B:58:0x015b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(androidx.media3.exoplayer.ExoPlayer r16, java.util.ArrayList r17, com.inmobi.media.InterfaceC3580m9 r18, com.inmobi.media.K2 r19, boolean r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Mm.a(androidx.media3.exoplayer.ExoPlayer, java.util.ArrayList, com.inmobi.media.m9, com.inmobi.media.K2, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final void a(MediaPlayer mediaPlayer, final C3605n9 c3605n9) {
        mediaPlayer.setOnBufferingUpdateListener(new MediaPlayer.OnBufferingUpdateListener() { // from class: n9.o3
            @Override // android.media.MediaPlayer.OnBufferingUpdateListener
            public final void onBufferingUpdate(MediaPlayer mediaPlayer2, int i10) {
                Mm.a(c3605n9, mediaPlayer2, i10);
            }
        });
    }

    public static final void a(InterfaceC3580m9 interfaceC3580m9, MediaPlayer mediaPlayer, int i10) {
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("VideoLoaderHelper", "Buffering Percentage: " + i10);
        }
    }
}
